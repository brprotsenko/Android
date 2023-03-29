import kotlin.system.exitProcess

class CofeeMachine {
    fun main(){coffeemachine()}

    val money: Int = 550;
    val water: Int = 400;
    val milk: Int = 550;
    val cofeebeanSin: Int = 120;
    val disposablecups: Int = 9;

    fun coffeemachine(){
        println("Write action(buy, fill, take , remaining, exit):");
        when(readLine()){
            "exit" -> exitProcess(0);
//            "buy" -> buy();
//            "fill" -> fill();
//            "remaining" -> remaining();
//            "take" -> take();
            else -> {
                println("Please try again!");
                coffeemachine();}
        }
    }

    fun buy(){
        println("What do you want to buy? 1 - Espresso, 2 - Latte, 3 - Cappuccino,4 - Back to main menu.");
        when(readLine()){
            "1" -> espresso();
            "2" -> latte();
            "3" -> cappuccino();
            "4" -> coffeemachine();
        }
    }
}