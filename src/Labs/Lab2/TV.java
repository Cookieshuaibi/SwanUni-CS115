package Labs.Lab2;

/**
 * TV
 */
public class TV {

    public static int identity = 0;

    public TV() {
        this.setSerialNumber(++identity);
    }

    public TV(int channel, int volume) {
        this();

        this.setChannel(channel);
        this.setVolume(volume);
    }

    public TV(boolean powerState, int channel, int volume) {
        this(channel, volume);

        if (powerState) {
            this.powerOn();
        }
    }

    protected int serialNumber;

    public int getSerialNumber() {
        return this.serialNumber;
    }

    protected void setSerialNumber(int uuid) {
        this.serialNumber = uuid;
    }

    protected boolean isPowerOn;

    public void powerOn() {
        this.isPowerOn = true;
    }

    public void powerOff() {
        this.isPowerOn = false;
    }

    public boolean getIsPowerOn() {
        return this.isPowerOn;
    }

    protected int channel;

    public int getChannel() throws Exception {
        if (this.getIsPowerOn())
            return this.channel;
        throw new Exception();
    }

    public void setChannel(int channel) {
        if (this.getIsPowerOn())
            this.channel = channel;
    }

    public void switchToNextChannel() {
        if (this.getIsPowerOn())
            this.channel++;
    }

    public void swhichToPreviousChannel() {
        if (this.getIsPowerOn())
            this.channel--;
    }

    protected int volume;

    public int getVolume() throws Exception {
        if (this.getIsPowerOn())
            return this.volume;
        throw new Exception();
    }

    public void setVolume(int volume) {
        if (this.getIsPowerOn() && volume >= 0 && volume <= 100)
            this.volume = volume;
    }
}