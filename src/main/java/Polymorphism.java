public class Polymorphism {
    String name;
    Integer id;

    public Polymorphism(){

    }

    public Polymorphism(String externalName){
        name = externalName;
    }

    public Polymorphism(String externalName, Integer id){
        name = externalName;
        this.id = id;
    }

    public Polymorphism(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
