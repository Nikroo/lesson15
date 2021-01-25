package by.itacademy.singleton;

/*
Singleton самый правильный вариант
*/

public class Singleton {
    private  static  Singleton instance;
    private String name;

    private Singleton (){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
