class Coffee{
    fun espresso(machine: CoffeeMachine){
        if(machine.water < 250 || machine.coffeeBeanSin < 16 || machine.disposableCups < 1){
            if(machine.water < 250){
                println("Sorry, not enough water!");
                machine.coffeemachine(machine)
            }
            if(machine.coffeeBeanSin < 16){
                println("Sorry, not enough coffee beans!");
                machine.coffeemachine(machine);
            }
            if(machine.disposableCups < 1){
                println("Sorry, not enough disposable cups!");
                machine.coffeemachine(machine)
            }
        }else{
            machine.money += 4;
            machine.water -= 250;
            machine.coffeeBeanSin -= 16;
            machine.disposableCups -= 1;
            println("I have enough resources, making you a coffee!");
            machine.coffeemachine(machine)
        }
    }

    fun latte(machine: CoffeeMachine){
        if(machine.water < 350 || machine.milk < 75 || machine.coffeeBeanSin < 20 || machine.disposableCups < 1){
            if(machine.water < 350){
                println("Sorry, not enough water!");
                machine.coffeemachine(machine)
            }
            if(machine.coffeeBeanSin < 20){
                println("Sorry, not enough coffee beans!");
                machine.coffeemachine(machine)
            }
            if(machine.milk < 75){
                println("Sorry, not enough milks");
                machine.coffeemachine(machine)
            }
            if(machine.disposableCups < 1){
                println("Sorry, not enough disposable cups!");
                machine.coffeemachine(machine)
            }
        }else{
            machine.money += 7;
            machine.water -= 350;
            machine.milk -= 75;
            machine.coffeeBeanSin -= 20;
            machine.disposableCups -= 1;
            println("I have enough resources, making you a coffee!");
            machine.coffeemachine(machine)
        }
    }

    fun cappuccino(machine: CoffeeMachine){
        if(machine.water < 200 || machine.milk < 100 || machine.coffeeBeanSin < 12 || machine.disposableCups < 1){
            if(machine.water < 200){
                println("Sorry, not enough water!");
                machine.coffeemachine(machine)
            }
            if(machine.coffeeBeanSin < 12){
                println("Sorry, not enough coffee beans!");
                machine.coffeemachine(machine)
            }
            if(machine.milk < 100){
                println("Sorry, not enough milks");
                machine.coffeemachine(machine)
            }
            if(machine.disposableCups < 1){
                println("Sorry, not enough disposable cups!");
                machine.coffeemachine(machine)
            }
        }else{
            machine.money += 6;
            machine.water -= 200;
            machine.milk -= 100;
            machine.coffeeBeanSin -= 12;
            machine.disposableCups -= 1;
            println("I have enough resources, making you a coffee!");
            machine.coffeemachine(machine)
        }
    }
}