package basic.dataclass;

/**
 * Created by sbt-spb-dl051 on 6/8/17.
 */
public class ClientJ {
    
    private final String name;
    private final String lastName;
    private final String number;
    
    public ClientJ(String name, String lastName, String number) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getNumber() {
        return number;
    }
    
    @Override
    public String toString() {
        return "ClientK{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", number='" + number + '\'' + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        ClientJ clientJ = (ClientJ) o;
        
        if (getName() != null ? !getName().equals(clientJ.getName()) : clientJ.getName() != null) return false;
        if (getLastName() != null ? !getLastName().equals(clientJ.getLastName()) : clientJ.getLastName() != null)
            return false;
        return getNumber() != null ? getNumber().equals(clientJ.getNumber()) : clientJ.getNumber() == null;
    }
    
    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        return result;
    }
}
