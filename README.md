# CasoFecha

# Herencia
Supongamos que no tenemos adceso al codigo de la clase Fecha. Es decir, podemos utilizarla pero no la podemos modificar porque fue hecha por terceras partes. Hagamos de cuenta que no la desarrollamos nosotros. De este modo, supngamos que aunque la clase Fecha nos resulta util, funciona bien y es muy practica, queremos modificae la forma en que una feha se representa a si misma cuando invocamos su medoto toString.

La solucion es crear una nueva clase (FechaDetallada) que hereda de Fecha y que modifique la manera en que esta se representa como cadena.

Ejemplo: 19 de noviembre de 2022