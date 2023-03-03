import java.util.Date;
import java.util.List;

public class User {

    private Date birthdate;
    private int number;
    private List<Photo> photos;
    private Address address;

    public Date getBirthdate(){
        return this.birthdate;
    }

    public void setBirthdate(Date date){
        this.birthdate = date;
    }

    public int getNumber(){
        return this.number = number;
    }

    public void setNumber(int number){
        this.number = number;
    }


    public List<Photo> getPhoto(){
        return this.photos;
    }

    public void setPhoto(List<Photo> photos){
        this.photos = photos;
    }

    public Address getAddress(){
        return this.address;
    }

    public void setAddress(Address address){
        this.address = address;
    }
}