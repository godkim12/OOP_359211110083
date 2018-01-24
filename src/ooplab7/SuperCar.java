package ooplab7;
//1.car brand ยี่ห้อ
//2.car color สีรถ
//3.car engine size ขนาดเครื่องยนต์
//4.max speed ความเร็ว
//5.country of origin สถานที่ผลิต
//Ep 11 Lap 7
public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;
    public SuperCar(){}
    public SuperCar(String a, String b, String c, String d, String e) {
        this.carbrand = a;
        this.carcolor = b;
        this.carenginesize = c;
        this.maxspeed = d;
        this.countryoforigin = e;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carenginesize='" + carenginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforigin='" + countryoforigin + '\'' +
                '}';

    }
}//class