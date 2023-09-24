import controller.PetController;
import model.Pets;
import service.PetRepository;
import service.Repository;
import userInterface.ConsoleMenu;

public class Main {

    public static void main(String[] args) throws Exception {

        Repository<Pets> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu(controller).start();

    }
}
