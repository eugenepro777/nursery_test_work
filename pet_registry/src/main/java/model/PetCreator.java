package model;

public class PetCreator extends Creator {

    @Override
    protected Pets createNewPet (PetType type) {

        return switch (type) {
            case Cat -> new Cats();
            case Dog -> new Dogs();
            case Hamster -> new Hamsters();
        };
    }
}