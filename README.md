# Java-02-Conditionals
Java course part 2
<ol>
  <li>
    Hacer programas sencillos que hagan lo siguiente.
    <div id="user-content-toc">
      <ul>
        <li>a) Leer un número entero y determinar si es mayor de 10.</li>
        <li>b) Leer dos números enteros y muestre si el primero es mayor que el segundo.</li>
        <li>c) Leer un número entero y de determinar si se trata de un número par o impar.</li>
        <li>d) Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.</li>
        <li>e) Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.</li>
        <li>f) Leer un número entero y decir si está comprendido entre 10 y 20 (ambos
        incluidos).</li>
        <li>g) Leer dos números enteros y diga si uno y solo uno es mayor de 10.</li>
        <li>h) Leer dos números y decir si el primero es mayor que el segundo, si es menor o si
        los dos números son iguales.</li>
        <li>i) Leer dos números enteros y diga si el segundo es divisor del primero (prevenir
        divisiones por cero, que causan error) Repasar operadores en cortocircuito para
        hacer un solo if.</li>
        <li>j) Leer dos números enteros y diga si el menor de ellos es divisor del mayor
        (prevenir divisiones por cero, que causan error) Repasar operadores en
        cortocircuito para hacer un solo if.</li>
        <li>k) Leer un número y decir si es múltiplo de 2, de 3 y/o de 10. Si no es múltiplo de
        2 ya no hay que mirar si lo es de 10.</li>
        <li>l) Leer tres números enteros y diga hay alguno mayor que cero.</li>
        m) Leer tres números enteros y diga hay alguno mayor que cero, pero no todos.</li>
      </ul>
    </div>
  </li>
  <br>
  <li>Haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado 2
  números double sobre sendas variables llamadas ‘a’ y ‘b’ y que incluyan las instrucciones
  que se muestran abajo. Para cada una de las versiones, ejecútalo varias veces,
  introduciendo cero para alguno de los valores y finalmente explica la diferencia de
  comportamiento entre cada una de las versiones:
    <div id="user-content-toc">
      <ul> a) if (b !=0 && a/b==0) {r = a/b; System.out.println(r);}</ul>
      <ul>b) if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}</ul>
      <ul> c) if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}</ul>
    </div>
  </li>
  <br>
  <li>Diseñar un programa que lea tres números enteros. Si todos son negativos, mostrar
  el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de los tres.
  En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el
  tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo?
  (Suponer que el cero es un número positivo). Hacer el programa lo más sencillo posible.
  </li>
  <br>
  <li>
    Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en
    clase y la nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las
    siguientes situaciones:
    <ul>
        <li> 
          Nota examen mayor o igual a 5
        </li>
        <li>
        Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor
          que 5.
        </li>
        <li>
          Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la
          valoración del trabajo en clase.
        </li>
     </ul> 
    Diseñar un algoritmo que lea la nota del examen, la valoración del trabajo en clase y la
    nota del trabajo práctico y saque por pantalla si está aprobado o no, todo en con una
    sola sentencia condicional.
  </li>
  <br>
  <li>Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo
  mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total
  de segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de
  Java.</li>

  <br>
  <li>
    En Un sistema de ecuaciones lineales de la forma:

    
    ax + by = c
    dx + ey = f
  
  Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c,
  y d, e y f) y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita ¿Existen
  algunos casos para los cuales este algoritmo no funcione? Nota: cuando en
  matemáticas se escriben dos variables juntas, por ejemplo ‘ce’ quiere decir ‘c por e’.
    
  </li>
  <br>
  <li>
  Realizar un programa que informe si un año introducido previamente es bisiesto o
  no. Son bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los
  múltiplos de 400 también son bisiestos. Se puede hacer una primera versión con varias
  sentencias condicionales y otra más sofisticada con una sola. No usar las clases de fechas
  de Java.
  </li>
  <br>
  <li>
  La tabla siguiente representa las horas de salida de un bus. Diseña un algoritmo al
  que se le introduzca el día (1-7) y la hora (9-14), verifique la entrada y nos informe si hay
  bus o no. Hacer una primera condición que haga la verificación de la entrada de datos y
  otra única condición para ver si hay bus.
    <table>
      <tr>
        <th></th>
        <th>Lunes</th>
        <th>Martes</th>
        <th>Miercoles</th>
        <th>Jueves</th>
        <th>Viernes</th>
        <th>Sabado</th>
        <th>Domingo</th>
      </tr>
      <tr>
        <td>9:00
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>Sí
        </td>
      </tr>
       <tr>
        <td>10:00
        </td>
        <td>Sí
       </td>
         <td>Sí
       </td>
         <td>Sí
       </td>
         <td>Sí
       </td>
         <td>Sí
       </td>
         <td>Sí
       </td>
         <td>Sí
       </td>
      </tr>
       <tr>
        <td>11:00
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
          Sí
        </td>
      </tr>
       <tr>
        <td>12:00
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>Sí
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>Sí
        </td>
      </tr>
       <tr>
        <td>13:00
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>
        </td>
        <td>Sí
        </td>
      </tr>
       <tr>
        <td>14:00
        </td>
        <td>Sí
        </td>
        <td>Sí
        </td>
        <td>Sí
        </td>
        <td>Sí
        </td>
        <td>Sí
        </td>
        <td>
        </td>
        <td>Sí
        </td>
      </tr>
    </table>
  </li>
  


</ol>
