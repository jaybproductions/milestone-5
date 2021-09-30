public class Monkey extends RescueAnimal {

    private double tailLength;
    private double height;
    private double bodyLength;
    private String species;

    //constructor
    public Monkey(String name, String animalType, String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry) {

        setName(name);
        setAnimalType(animalType);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
}
