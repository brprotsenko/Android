class FunctionsCoffeeMachine{
    private val coffee = Coffee();
    fun buy(machine: CoffeeMachine){
        println("What do you want to buy? 1 - Espresso, 2 - Latte, 3 - Cappuccino,4 - Back to main menu.");
        when(readLine()){
            "1" -> coffee.espresso(machine);
            "2" -> coffee.latte(machine);
            "3" -> coffee.cappuccino(machine);
            "4" -> machine.coffeemachine(machine);
        }
    }

    fun fill(machine: CoffeeMachine){
        println("Write how many ml of water the coffee machine has:");
        val waterFill = readLine();
        println("Write how many ml of milk the coffee machine has:");
        val milkFill = readLine();
        println("Write how many grams of coffee beans the coffee machine has:");
        val coffeeBeansFill = readLine();
        println("Write how many disposable cups the coffee machine has:");
        val disposableCupsFill = readLine();
        machine.water += Integer.valueOf(waterFill);
        machine.milk += Integer.valueOf(milkFill);
        machine.coffeeBeanSin += Integer.valueOf(coffeeBeansFill);
        machine.disposableCups += Integer.valueOf(disposableCupsFill);
        machine.coffeemachine(machine);
    }

    fun remaining(machine: CoffeeMachine){
        println("The coffee machine has:\n"+
                machine.water +" of water\n" +
                machine.milk +" of milk\n" +
                machine.coffeeBeanSin +" of coffee beans\n"+
                machine.disposableCups +" of disposable cups\n"+
                machine.money +" of money");
        machine.coffeemachine(machine);
    }

    fun take(machine: CoffeeMachine){
        println("I gave you ${machine.money}");
        machine.money = 0;
        machine.coffeemachine(machine);
    }
}