package figure.classes

import figure.interfaces.Movable
import figure.enums.RotateDirection
import figure.interfaces.Transforming

class Square(var x: Int, var y: Int, var edge: Int) : Movable, Transforming, Figure(1) {
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        edge *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val prevX = x
        if (direction == RotateDirection.Clockwise) {
            x = centerX + y - centerY
            y = centerY + centerX - prevX
        } else {
            x = centerX + centerY - y
            y = centerY + prevX - centerX
        }
    }

    override fun area(): Float = (edge * edge).toFloat()
}