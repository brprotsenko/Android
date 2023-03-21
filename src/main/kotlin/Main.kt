import kotlin.collections.ArrayList
fun main(){
    Main().main();
}
class Main {
    fun main(){
//    println(parityCheck(11))
//    println(multiplication(11))
//    println(negativeNumber(5))
//    println(calculateAge(2001))
//    println(minInList(arrayOf(34,15,88,2)))
//    println(maxInList(arrayOf(1, 5, 87, 45, 8, 8)))
//    println(npNumberInList(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
//    println(numberOfVowels("Hello, how are you?"))
//    println(mediumLetterInWord("test"))
//    multiplicationTable(3)
    }
    //1. На вході ціле число, повернути рядок “Even” для парного числа та “Odd” в іншому випадку.
    fun parityCheck(number: Int): String{
        return if (number % 2 == 0){
            "Even"
        }else{
            "Odd"
        }
    }
    //2. Помножити задане число на 4, якщо воно парне і на 5 інакше.
    fun multiplication(number: Int): Int{
        return if (number % 2 == 0){
            number * 4
        }else{
            number * 5
        }
    }
    //3. Повернути негативне число. Наприклад, вхід: 1, на виході: -1; для -5 повернути -5.
    fun negativeNumber(number : Int): Int{
        return if (number < 0){
            number
        }else{
            number * (-1)
        }
    }
    //4.За роком визначити вік. (1 століття охоплює період з 1 по 100 рік включно і т.д.).
    fun calculateAge(yearOfBirth: Int): Int{
        return java.time.Year.now().value - yearOfBirth
    }
    //5. Задано масив цілих чисел, котрому необхідно визначити найменше ціле число.
// Наприклад, для [34, 15, 88, 2], відповідь 2.
    fun minInList(list : Array<Int>): Int{
        return list.min()
    }
    //6. Задано масив цілих чисел, для якого потрібно знайти два найбільші числа.
//Приклад:
//listOf(1, 5, 87, 45, 8, 8), повернути listOf(45, 87).
    fun maxInList(list : Array<Int>):ArrayList<Int>{
        val a = list.toMutableList() as ArrayList<Int>
        val b = ArrayList<Int>()
        b.add(a.max())
        a.remove(a.max())
        b.add(a.max())
        return b
    }
    //7. Даний масив цілих чисел, котрому повернути масив, де перший елемент є
//кількістю позитивних чисел, а другий – сумою негативних чисел. Якщо на
//вході порожній масив або null, необхідно повернути порожній масив.
//Приклад:
//Для масива [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15] необхідно отримати
//[10, -65].
    fun npNumberInList(list: Array<Int>): ArrayList<Int> {
        var countOfPositiveNumber = 0
        var sumOfNegativeNumber = 0
        for (i in list) {
            if (i > 0) {
                countOfPositiveNumber++
            } else {
                sumOfNegativeNumber += i
            }
        }
        return arrayListOf(countOfPositiveNumber,sumOfNegativeNumber)
    }
    //8. Порахувати кількість голосних букв у рядку (a, e, i, o, u, y голосні).
    fun numberOfVowels(string: String):Int{
        var countOfVowelsInString = 0
        for (i in string){
            if(i.toString().contains(Regex("[aeiouy]"))){
                countOfVowelsInString++
            }
        }
        return countOfVowelsInString
    }
    //9. Дано рядок, для якого необхідно знайти середній символ. Якщо довжина
//непарна, то повернути середній символ, інакше – поверніть середні 2 символи.
//Приклад:
//Для "test" повернути "es", для “student” повернути “d”, для “A” повернути “A”.
    fun mediumLetterInWord(string: String):String{
        val str : String = if (string.length % 2 == 0){
            string[string.length/2 - 1]+""+ string[string.length/2]
        }else{
            ""+string[string.length/2]
        }
        return str
    }
    //10. Створити таблицю множення розміром NxN. Для N = 3:
//1 2 3
//2 4 6
//3 6 9
//Як відповідь має бути [[1,2,3],[2,4,6],[3,6,9]].
    fun multiplicationTable(N : Int){
        val a = Array(N){IntArray(N){0}}
        var count: Int = 1
        for(i in a.indices){
            for(j in a[0].indices){
                a[i][j] = count * (j + 1)
            }
            count++
        }
        println(a.contentDeepToString())
    }
}