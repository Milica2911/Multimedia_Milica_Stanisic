package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean isTurnedOn;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public int getCurrentProgram() {
        return this.currentProgram;
    }

    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public boolean getIsTurnedOn() {
        return this.isTurnedOn;
    }

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.isTurnedOn = false;
    }

    public Television(int program, boolean isTurnedOn, int volume) {
        this.volume = volume;
        this.currentProgram = program;
        this.isTurnedOn = isTurnedOn;
    }

    public void info() {
        System.out.println("Ukljucen: " + this.isTurnedOn);
        System.out.println("Zvuk je na: " + this.volume);
        System.out.println("Trenutni program je: " + this.currentProgram);
        System.out.println("");
    }

}
