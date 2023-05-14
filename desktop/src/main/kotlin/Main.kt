import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import malunki.MandelbrotChatGpt
import mu.KotlinLogging
import screens.SelectFromList

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Malevich for Desktop") {
        val (width, height) = with(window.size) { width to height }
        val logger = KotlinLogging.logger("Malevich App")
        logger.debug { "Windows size is: width=$width, height=$height " }
//        First(width, height)
//        RotatingLine2(width, height)
//        Mandelbrot(width, height)
        MandelbrotChatGpt(width, height)
    }
}
