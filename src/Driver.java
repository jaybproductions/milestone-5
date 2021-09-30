import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
        boolean running = true;
        Scanner scnr = new Scanner(System.in);

        initializeDogList();
        initializeMonkeyList();
        //displayMenu();

        // Add a loop that displays the menu, accepts the users input
        while(running) {
            displayMenu();
            String selectedOption;
            selectedOption = scnr.nextLine();

            switch(selectedOption) {
                case "1":
                    intakeNewDog(scnr);
                    break;
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                case "3":
                    reserveAnimal(scnr);
                    break;
                case "4":
                    printAnimals(4);
                    break;
                case "5":
                    printAnimals(5);
                    break;
                case "6":
                    printAnimals(6);
                    break;
                case "q":
                    running = false;
                    break;
                default:
                    System.out.println("Your selected option was not valid, please try again.");

            }

        }
        // and takes the appropriate action.
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Monk", "Monkey", "Male",
                "12", "12", "01/10/21", "USA",
                "Trained", false, "USA");

        monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();


        System.out.println("What is the dog's acquisition date?");
        String acqDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acqCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is this dog reserved?");
        boolean reserved = scanner.nextBoolean();
        // weird workaround to fix last input?
        String reservedToString = scanner.nextLine();

        System.out.println("What is the dog's service country?");
        String serviceCountry = scanner.nextLine();


        // Add the code to instantiate a new dog and add it to the appropriate list
        Dog newDog = new Dog(name, breed, gender, age, weight, acqDate, acqCountry, trainingStatus, reserved, serviceCountry);

        dogList.add(newDog);

        return;

    }


    // Complete intakeNewMonkey
    //Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also  validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("The method intakeNewMonkey needs to be implemented");
        System.out.println("What is the Monkey's name?");
        String name = scanner.nextLine();

    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("The method reserveAnimal needs to be implemented");

    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(int selectedOption) {
        System.out.println("The method printAnimals needs to be implemented");
        if(selectedOption == 4) {
            System.out.println("This is option 4.");
            for(Dog dog: dogList) {
                System.out.println(dog.getReserved());
            }
        }else if(selectedOption == 5) {
            System.out.println("This is option 5.");
        } else {
            System.out.println("This is option 6.");
        }

    }
}

