package pl.kocan.template.method.pattern;

public class AutomaticTransmissionCarStartingSequence {

    public void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void setTheGear() {
        System.out.println("");
    }

    private void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }
}
