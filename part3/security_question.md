
#Respuesta de la prueba

Al realizar una auditoría de seguridad de la infraestructura de mi aplicación de instalación de paneles solares, me centraría primero en los siguientes aspectos: 

- Control de acceso: Me gustaría asegurarme de que solo los usuarios autorizados por la compañía tengan el acceso a los recursos, pero solo a aquellos que necesitan. Esto incluye el uso de roles y permisos para restringir el acceso que tengan a la información confidencial, como las contraseñas de los clientes y los números de tarjetas de crédito en el caso de que los almacenemos. 

 

- Cifrado: Me aseguraría también de que todos los datos confidenciales que tengamos en la empresa ya sea de los clientes como de los trabajadores y de la empresa estén cifrados, tanto aquellos que se encuentran en reposo como los que están en tránsito constante y son más maleables. Esto incluye la información privilegiada del cliente como las contraseñas, las direcciones y los números de teléfono, así como cualquier información de los métodos y medios de pago que usa o ha usado. 

 

- Inyección: Me aseguraría de que mi aplicación esté protegida contra ataques de inyección, como SQL Injection y Cross-Site Scripting (XSS) que con frecuencia son los más comunes en este tipo de empresas. Esto incluye el uso de consultas parametrizadas y la validación de entrada. 

 

- Diseño: Me aseguraría de que mi aplicación esté diseñada de forma segura. Esto incluye el uso de principios de codificación segura y la revisión de código por parte de expertos en seguridad siguiendo los parámetros de las convenciones de programación y las convenciones de seguridad vigentes y recomendadas para el momento de la auditoría. 

 

- Configuración: Me aseguraría de que mi aplicación (dependiendo de la plataforma en la que se esté usando) esté configurada de forma segura. Esto incluye la instalación de los últimos parches de seguridad y la deshabilitación de funciones y servicios innecesarios o vulnerables y en caso de ser necesario el descartar estos servicios y optar por unos propios o de terceros que garanticen su seguridad e integridad. 

 

- Protección de datos de clientes: Los datos de los clientes, como las direcciones de domicilio y los números de teléfono, son sensibles y deben protegerse de manera adecuada. Esto incluye el uso de cifrado de grado de seguridad y controles de acceso estrictos. Como se menciona anteriormente, estos datos se encontrarán cifrados, sin embargo, recomendaría cambiar las claves de cifrado con cierta frecuencia periódica. 

 

- Procesamiento de pagos: Si mi aplicación acepta pagos, me aseguraría de que esté utilizando un procesador de pagos seguro y de que esté siguiendo todos los estándares de seguridad de pagos aplicables. Así mismo, aunque no es muy relevante procuraría por mantener varias copias de seguridad en especial de los pagos debido a que son la parte más vulnerable ya que depende de terceros como las entidades financieras. 

 

- Seguridad física: Dado que mi aplicación se utiliza para instalar paneles solares físicos, me aseguraría de que mis empleados y contratistas hayan sido seleccionados adecuadamente y de que tenga procedimientos establecidos para prevenir el robo y el daño a los productos. Igualmente garantizaría la capacitación de los empleados en todo lo referente a los temas de seguridad. 



Por otra parte, basándome en las consideraciones anteriores, me gustaría recomendar las siguientes medidas para proteger mi sistema: 

- Usar una solución de gestión de identidades y accesos (IAM) basada en la nube para administrar los permisos de los usuarios. Esto ayudaría a garantizar que solo los usuarios autorizados tengan acceso a los recursos que necesitan. 

- Implementar la autenticación multifactor (MFA) para todos los usuarios. Esto agregaría una capa adicional de seguridad al requerir a los usuarios que proporcionen dos factores de autenticación, como una contraseña y un código de un solo uso. 

- Encriptar todos los datos de los clientes en reposo y en tránsito. Esto ayudaría a proteger los datos de los clientes de ataques de terceros. 

- Implementar un programa de gestión de vulnerabilidades para identificar y parchear las vulnerabilidades de mi software e infraestructura. Esto ayudaría a proteger mi sistema de las vulnerabilidades conocidas. 

- Realizar auditorías de seguridad periódicas de mi aplicación e infraestructura. Esto ayudaría a identificar y abordar cualquier problema de seguridad que pueda surgir. 

- Capacitar a mis empleados sobre las mejores prácticas de seguridad. Esto ayudaría a garantizar que mis empleados estén familiarizados con las amenazas de seguridad y cómo mitigarlas. 