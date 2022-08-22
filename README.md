<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
<span>(formato estudiante)</span>
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructuras de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Django</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>08</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td colspan="2">21-Ago-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="2">23:55</td>
</tr>
<tr><td colspan="4">INTEGRANTE (s):
<ul>
<li>Moroccoire/Pacompia, Anthony Marcos - amoroccoire@unsa.edu.pe</li>
</ul>
</td>
<td>NOTA:</td><td>Pendiente</td>
</tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe (rescobedoq@unsa.edu.pe)</li>
</ul>
</td>
</tr>
</tbody>
</table>

<!-- Reportes -->

## SOLUCIÓN Y RESULTADOS

---

I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS <br>


* La clase [Link](ImplementacionGrafo/NodoGrafo.java "NodoGrafo.java") tiene los atributos: padre (Nodo de tipo grafo), estado (booleano), lista(Lista enlazada)

    ```
    private NodoGrafo<T, N> padre;
	private boolean estado;
	private Lista<T, N> lista;
	
	public NodoGrafo() {
		estado = false;
		lista = new Lista<T, N>();
		padre = null;
	}
    ```
    Asimismo contiene metodos, entre los cuales se encuentra el método "marcar()" y "desmarcar()", que funcionan para cambiar el estado del nodo cuando es visitado o necesita ser reiniciado.

    Se ha creado manualmente la lista enlazada, cada uno de sus nodos almacena dos valores, el primero representa el número del nodo y el segundo valor el peso de su arista a uno de los nodos adyacentes

    ```
    private T dato;
    private U peso;
    private Node<T, U> nextNode;
  
    public Node(T e, U y) {
    	dato = e;
    	peso = y;
    }
    ```
    Los otros métodos del nodo se mantienen igual con ligeras variaciones, al igual que los métodos de la clase Lista.
    Para conseguir la representación del grafo, se ha usado un arreglo simple de Nodos de tipo grafo, cuyo tamaño es determinado en el constructor de la clase [Link](ImplementacionGrafo/Grafo.java "Grafo.java"), el metodo es el siguiente:
    ```
    public void add(T valor, N peso, int indice) {
		if (nodos[indice] == null)
			nodos[indice] = new NodoGrafo<T, N>();
		nodos[indice].agregarAdyacente(valor, peso);
	}
    ```
    Recibe los paramteros valor; que representa el contenido del nodo, peso; representa el peso de la arista del nodo adyacente e indice que ayuda a ubicar al nodo en el array, en los test, el parametro valor sera igual al indice.

* Algoritmo BFS
    Para elaborar el algoritmo se ha traducido el pesudocodigo del documento presentado por el docente. Este método recibe como parametro un indice para saber con que nodo empezar primero.
    ```
		for (int i = 0; i < nodos.length; i++)
			distancia[i] = -1;
	```
    En esta seccion del codigo se inicializa al arreglo de distancias con valor -1

    ```
		nodos[valor].marcar();
		orden += (valor + 1) + " ";
		distancia[valor] = 0;
    ```
    En la primera linea se marca al indice del nodo pasado como parametro como true, luego se concatena a un String para hacer un registro de los nodos visitados y luego retornarlo, luego en un arreglo de int[] "distancia" con tamaño igual al del grafo se cambia la distancia a 0.

    Mas adelante se inica una cola y se añade el indice pasado como parametro, luego mientras la cola no este vacia se obtendra la lista enlazada asociado al indice para luego hacer un recorrido que marcaracomo visitado o no al nodo adyacente.
    
* Solución del ejercicio del Grafo de Palabras
    * Dibuje el grafo definido por las siguientes palabras: words, cords, corps, coops, crops, drops, drips, grips, gripe, grape, graph

    ![Grafo](Images/imagen1.png)

    *Mostrar la lista de adyacencia del grafo

    ![Lista de Adyacencia](Images/imagen2.png)

* Metodo para saber si un grafo esta incluido en otro

    ```
    algo
    ```
II. SOLUCIÓN DEL CUESTIONARIO

* ¿Cuantas variantes del algoritmo de Dijkstra hay y cuál es la diferencia entre ellas?
    
    Se definió una guía de estilo única descrita íntegramente en el Python Enhancement Proposal numero 8, abreviado como PEP 8. En esta se define al pie de la letra, cómo debería estar escrito nuestro código python: https://peps.python.org/pep-0008/#introduction
  
* ¿Qué diferencias existen entre EasyInstall, pip y PyPM?

   EasyInstall es una interfaz obsoleta, que salió como parte de las herramientas de configuración, pip salió después, como una alternativa a easyInstall. Es el actual instalador de paquetes para Python, y viene instalado en Python 2 >=2.7.9 o Python 3 >=3.4. EasyInstall no es un administrador de paquetes completo, no puede listar paquetes locales ni actualizarlos todos. Pip y Python Package Manager (PyPM) son aplicaciones de Python diseñadas para cumplir una función similar a EasyInstall. PyPM no es gratuito y solo se puede usar con la distribución ActivePython de ActiveState, se suspendió y ya no es compatible. Pip es ahora el método preferido para administrar e instalar paquetes en ActivePython, además que nos permite la instalación de los entornos virtuales.

* En un proyecto Django que se debe ignorar para usar git. Vea: https://github.com/django/django/blob/main/.gitignore. ¿Qué otros tipos de archivos se deberían agregar a este archivo?

  En un proyecto Django debemos ignorar los siguientes archivos:
  ```sh
        *.egg-info
        *.pot
        *.py[co]
        .tox/
        __pycache__
        MANIFEST
        dist/
        docs/_build/
        docs/locale/
        node_module/
        test/coverage_html/
        test/.coverage
        build/
        test/report/
    ```
    Adicionalmente, si tenemos archivos automáticamente generados por algún IDE debemos ignorarlos de la siguiente manera <code>$GIT_DIR/info/exclude</code>.
  
* Utilice <code>python manage.py shell</code> para agregar objetos. ¿Qué archivos se modificaron al agregar más objetos?

    <code>db.sqlite3</code>: la base de datos.
  
  
---

III. CONCLUSIONES

* Los entornos virtuales son de gran ayuda para la realización de proyectos, nos ayudan a crear aplicaciones distintamente de los archivos del sistema.

* Django nos hace más fácil la creación de aplicaciones web, nos permite ir desde un desarrollo sencillo hasta uno más complejo con la misma funcionalidad, gracias a su organizada interfaz.

* Los modelos de nuestras aplicaciones son nuestra única fuente de datos, las migraciones se encargan de hacer las bases de datos de estos modelos.
    
---
    
## RETROALIMENTACIÓN GENERAL
 <pre>
 
 </pre>
---
    
### REFERENCIAS Y BIBLIOGRAFÍA
<ul>
    <li>https://tutorial.djangogirls.org/es/django_start_project/</li>
    <li>https://github.com/django/django/blob/main/.gitignore</li>
</ul>
