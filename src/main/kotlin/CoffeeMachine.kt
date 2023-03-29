import kotlin.system.exitProcess
class CoffeeMachine {
    var money: Int = 550
    var water: Int = 400;
    var milk: Int = 540;
    var coffeeBeanSin: Int = 120;
    var disposableCups: Int = 9;

    private val function = FunctionsCoffeeMachine();
    fun coffeemachine(machine : CoffeeMachine){
        println("Write action(buy, fill, take , remaining, exit):");
        when(readLine()){
            "exit" -> exitProcess(0);
            "buy" -> function.buy(machine);
            "fill" -> function.fill(machine);
            "remaining" -> function.remaining(machine);
            "take" -> function.take(machine);
            else -> {
                println("Please try again!");
                coffeemachine(machine);}
        }
    }
}