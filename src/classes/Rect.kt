package figure.classes

import figure.interfaces.Movable
import figure.enums.RotateDirection
import figure.interfaces.Transforming

class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Movable, Transforming, Figure(2) {
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        width *= zoom; height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val prevX = x
        val prevHeight = height
        height = width
        width = prevHeight
        if (direction == RotateDirection.Clockwise) {
            x = centerX + y - centerY
            y = centerY + centerX - prevX
        } else {
            x = centerX + centerY - y
            y = centerY + prevX - centerX
        }
    }

    override fun area(): Float = (width * height).toFloat()
}