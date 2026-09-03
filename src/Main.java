public class Main {
    public static void main(String[] args) {

    TV tv1 = new TV(50,30, false);

    tv1.turnOn();
    System.out.printf("%n");

    tv1.setChannel(4);
    tv1.channelDown();
    System.out.printf("%n");
    tv1.channelUp();
    tv1.channelUp();

    System.out.printf("%n");
    tv1.volumeUp();
    tv1.volumeDown();
    tv1.volumeDown();
    System.out.printf("%n");
    tv1.turnOff();
    }
}







