import java.util.ArrayList;

 class Werknemer {
    private String naam;
    private static Integer code = 3978;
    private Integer geboortedatumcode;
    public static ArrayList<Werknemer> werknemers = new ArrayList<>();

    public Werknemer(String naam, Integer geboortedatumcode,Integer code){
        this.naam = naam;
        this.geboortedatumcode = geboortedatumcode;
        this.code = code;

    }
     public String toString() {
         return this.naam + "-" + this.code + "-" +this.geboortedatumcode;
     }
    public String getNaam(){
        return this.naam;
    }
    public Integer getGeboortedatumcode(){
        return this.geboortedatumcode;
    }
    public static Integer getCode(){
        code +=78;
        return code;
    }
    public void werknemertesttoevoegen(){
        Werknemer object = new Werknemer("Lisa",1907,3752);
        werknemers.add(object);
    }
}
