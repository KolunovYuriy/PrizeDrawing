package club.vrzone.msk.domain;


public class Client {
    private int id;
    private String name;
    private String comment;
    
    public Client(int id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }
    
    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getComment() {
        return comment;
    }
    
}
