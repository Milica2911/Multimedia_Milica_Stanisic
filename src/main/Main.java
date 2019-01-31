package main;

import media.Television;
import media.Radio;

public class Main {

    public static void main(String[] args) {
        Television Panasonic = new Television();
        Panasonic.info();

        Panasonic.setIsTurnedOn(true);
        Panasonic.setVolume(34);
        Panasonic.setCurrentProgram(5);

        Panasonic.info();
        
        
        Radio radio = new Radio();
        // isto kao i za Television, pa commit, pa push na GitHub!!!
        
    }

}
