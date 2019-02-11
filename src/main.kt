import javafx.scene.text.FontWeight

/**
 * Вариант 8 -- ориентированный граф
 * Хранит вершины и дуги графа. Каждая дуга имеет определённое направление и вес
 * (целое положительное число). Каждая вершина имеет определённое имя.
 * Методы: добавление новой вершины, добавление новой дуги, удаление вершины /
 * дуги, изменение имени вершины, изменение веса дуги, получение списка исходящих
 * из вершины дуг, получение списка входящих в вершину дуг.
 */


class Graph(val graphList: MutableList<Height>) {

    class Height(var name: String, val links: MutableList<Height>) {

        fun link():Any = TODO()

        fun unlink():Any = TODO()

    }

    class Verticle(val pointA: Height, val pointB: Height, var weight: Int) {

        fun editWeight():Any = TODO()

    }

    fun addHeight():Any = TODO()

    fun deleteHeight():Any = TODO()

    fun getOutVerticles():Any = TODO()

    fun getInVerticles():Any = TODO()

}