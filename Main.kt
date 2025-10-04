package figure

import figure.classes.Circle
import figure.classes.Rect
import figure.classes.Square
import figure.enums.RotateDirection

fun main() {
    val circle = Circle(2, -9, 3)
    println("creating a circle with R=${circle.r}...")
    println("current circle position: (${circle.x},${circle.y})")
    circle.rotate(RotateDirection.CounterClockwise, 3, -3)
    println("rotating the circle counterclockwise from the center (3,-3)...")
    println("new circle position: (${circle.x},${circle.y})")
    println("the area of the circle: ${circle.area()}")
    println()

    val square = Square(3, 3, 3)
    println("creating a square with edge=${square.edge}...")
    println("current square position: (${square.x},${square.y})")
    square.rotate(RotateDirection.Clockwise, 0, 0)
    println("rotating the square clockwise from the center (0,0)...")
    println("new square position: (${square.x},${square.y})")
    println("the area of the square: ${square.area()}")
    println()

    val rect = Rect(-3, -2, 4, 2)
    println("creating a rectangle with width=${rect.width} and height=${rect.height}...")
    println("current rectangle position: (${rect.x},${rect.y})")
    rect.rotate(RotateDirection.Clockwise, 3, -3)
    println("rotating the rectangle clockwise from the center (3,-3)...")
    println("new rectangle position: (${rect.x},${rect.y})")
    println("the area of the rectangle: ${rect.area()}")
}