package figure.interfaces

import figure.enums.RotateDirection

interface Transforming {
    fun resize(zoom: Int)
    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
}