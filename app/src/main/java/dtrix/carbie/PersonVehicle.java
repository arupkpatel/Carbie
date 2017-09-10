package dtrix.carbie;

/**
 * Created by Soumya on 10-09-2017.
 */

public class PersonVehicle {

    private String Name,Regno,Cartype;
    private int Emissionlvl,Exception;

    public PersonVehicle(String name, String regno, String cartype, int emissionlvl, int exception, double lati, double longi) {
        Name = name;
        Regno = regno;
        Cartype = cartype;
        Emissionlvl = emissionlvl;
        Exception = exception;
        this.lati = lati;
        this.longi = longi;
    }

    private double lati,longi;

    public PersonVehicle(String name, String regno, String cartype, int emissionlvl, int exception) {
        Name = name;
        Regno = regno;
        Cartype = cartype;
        Emissionlvl = emissionlvl;
        Exception = exception;

    }

    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRegno() {
        return Regno;
    }

    public void setRegno(String regno) {
        Regno = regno;
    }

    public String getCartype() {
        return Cartype;
    }

    public void setCartype(String cartype) {
        Cartype = cartype;
    }

    public int getEmissionlvl() {
        return Emissionlvl;
    }

    public void setEmissionlvl(int emissionlvl) {
        Emissionlvl = emissionlvl;
    }

    public int getException() {
        return Exception;
    }

    public void setException(int exception) {
        Exception = exception;
    }
}
