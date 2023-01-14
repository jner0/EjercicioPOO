from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car( "AMS236", Account("Andres Herrera","AND987"))
    
    print(vars(car))

    car2 = Car()
    car2.license = "QLS234"
    car2.driver = "Nemecio"
    print(vars(car2))
