public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public  TV(int channel, int volumeLevel, boolean on) {
        if (channel < 0 ) {
            this.channel = 1;
        } else {
            this.channel = channel;
        }

        if (volumeLevel < 0 ) {
            this.volumeLevel = 0;
        } else {
            this.volumeLevel = volumeLevel;
        }

        this.on = on;
    }

    public boolean turnOn() {
        if(this.on == false) {
            this.on = true;
            System.out.printf("Televisión prendida%n");
        }
        return on;
    }

    public boolean turnOff() {
        if(this.on == true) {
            this.on = false;
            System.out.printf("Television apagada%n");
        }

        return on;
    }

    public void setChannel(int newChannel) {
        this.channel  = newChannel;
        System.out.printf("Canal cambiado al %d%n", newChannel);
    }

    public void channelUp() {
        this.channel++;
        System.out.printf("Canal cambiado a %d%n", this.channel);

    }

    public void channelDown() {
        this.channel--;
        System.out.printf("Canal cambiado a %d%n", this.channel);
    }

    public void volumeUp() {
        this.volumeLevel++;
        System.out.printf("Volumen subido a %d%n", this.volumeLevel);
    }

    public void volumeDown() {
        this.volumeLevel--;
        System.out.printf("Volumen bajado a %d%n", this.volumeLevel);
    }

}
