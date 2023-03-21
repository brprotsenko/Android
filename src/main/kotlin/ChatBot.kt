fun main(){
    ChatBot().main();
}
class ChatBot {
    fun main(){
        greeting();
        ages();
        cycle();
        test();
        println("Congratulations, have a nice day!");
    }
    fun greeting(){
        println("Hello! My name is DICT_Bot.\n" +
                "Please, remind me your name.")
        val userName = readLine()
        println("What a great name you have,$userName!")
    }

    fun ages(){
        println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.")
        val remainder3 = readLine()
        val remainder5 = readLine()
        val remainder7 = readLine()
        val age: Int;
        if(remainder3 != null && remainder5 != null && remainder7 != null){
            age = (remainder3.toInt()*70 + remainder5.toInt()*21 + remainder7.toInt()*15)%105
            println("Your age is $age!")
        }
    }
    fun cycle(){
        println("Now I will prove to you that I can count to any number you want.")
        val number = readLine()
        if (number != null && number.toInt() > 0){
            for (i in 0..number.toInt()){
                println("$i!")
            }
        }
    }

    fun test(){
        println("Let's test your programming knowledge.\n"+
                "Why do we use methods?\n"+
                "1. To repeat a statement multiple times.\n"+
                "2. To decompose a program into several small subroutines.\n"+
                "3. To determine the execution time of a program.\n"+
                "4. To interrupt the execution of a program.")
        while (true){
            val answer = readLine()
            if(answer != null && answer.toInt() != 2){
                println("Please, try again.")
            }else{
                println("Completed, have a nice day!")
                break
            }
        }
    }
}
