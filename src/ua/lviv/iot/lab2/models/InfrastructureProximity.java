package ua.lviv.iot.lab2.models;

public class InfrastructureProximity {
    private float school;
    private float kindergarten;
    private float groceries;
    private float pharmacy;
    private float gym;
    private float leisureCentre;

    public InfrastructureProximity(float school, float kindergarten, float groceries,
                                   float pharmacy, float gym, float leisureCentre) {
        this.school = school;
        this.kindergarten = kindergarten;
        this.groceries = groceries;
        this.pharmacy = pharmacy;
        this.gym = gym;
        this.leisureCentre = leisureCentre;
    }

    @Override
    public String toString() {
        return "InfrastructureProximity: " +
                "school=" + school +
                "m, kindergarten=" + kindergarten +
                "m, groceries=" + groceries +
                "m, pharmacy=" + pharmacy +
                "m, gym=" + gym +
                "m, leisureCentre=" + leisureCentre +
                "m, ";
    }
}
