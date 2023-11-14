// Создать приложение, которое подсчитывает количество различных символов во введенной строке.
// Символы в ответе расположить в алфавитном порядке.
fun main()
{
    print("Введите строку: ")
    val input = readLine()!!
    val mass = IntArray(256)
    for (i in input) {
        mass[i.toInt()]++
    }
    for (c in 'A'.toInt()..'Z'.toInt()) {
        if (mass[c] > 0) {
            println("${c.toChar()}-${mass[c]}")
        }
    }
}