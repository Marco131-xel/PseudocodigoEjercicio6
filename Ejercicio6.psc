Algoritmo Ejercicio6
 // M es mayor y N es menor
 CM <- >=25
 CN <- <25
 SM <- >=25
 SN <- <25
 Para i <- 1 Hasta 100 Con Paso 1
  Hacer
  Definir E
  // E es edad
  Escribir"Escribi tu edad"
   Leer E
   Si M Entonces
   CM <- CM+1
   SM <- SM+E
   Sino
   CN <- CN+1
   SN <- SN+E
 Fin Para
 // Donde p es el promedio
 PM <- SM/CM
 PN <- SN/CN
 Escribir"El promedio de la personas mayores de 25 es PM"
 Escribir"El promedio de la personas menores de 25 es PN"
FinAlgoritmo
