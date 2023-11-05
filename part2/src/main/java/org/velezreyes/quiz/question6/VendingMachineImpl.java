package org.velezreyes.quiz.question6;

import java.util.Objects;

public class VendingMachineImpl {
  public static VendingMachine getInstance() {
    // Fix me!
    final int[] counter = {0};
    return new VendingMachine(){

      @Override
      public void insertQuarter() {
        counter[0]++;
      }

      @Override
      public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        Drink drink = new Drink() {
          @Override
          public String getName() {
            if(name.equals("ScottCola") || name.equals("KarenTea")) {
              return name;
            }else {
              return null;
            }
          }

          @Override
          public boolean isFizzy() {
            return name.equals("ScottCola");
          }
        };
        if (drink.getName() == null){
          throw new UnknownDrinkException();
        }
        if (name.equals("ScottCola") && counter[0] < 3 || name.equals("KarenTea") && counter[0] < 4){
          throw new NotEnoughMoneyException();
        }
        return drink;
      }
    };
  }
}
