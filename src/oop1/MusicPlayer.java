package oop1;

public class MusicPlayer {

    private int volume;
    private boolean isOn;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void up() {
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void down() {
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void status() {
        if (isOn) {
            System.out.println("음악 플레이어 상태 ON, 볼륨 : " + volume);
        }
        System.out.println("음악 플레이어 OFF");
    }
}
