package io.fusionstate.server

import io.fusionstate.shared.utils.Printer

fun main() {
    val message = "Hello JetBrains!"
    val printer = Printer(message)
    printer.printMessage()
}
