package gg.rsmod.plugins.api.ext

const val BLUE = "<col=000080>"
const val RED = "<col=800000>"
const val COMPLETED = "<col=FF0000>"

fun String.appendBlue() = replace("{", BLUE).replace("}", "</col>")

fun String.appendRed() = replace("[", RED).replace("]", "</col>")

fun String.appendComplete() = replace("<comp>", COMPLETED).replace("</comp>", "</col>")

fun String.appendColors() = appendBlue().appendRed().appendComplete()