public class Animal {
    
    String name;
    int hp = 40;
    int attackPoint = 10;
    
    void sayNameAndHp() {
        System.out.println("私は" + this.name + "です");
        System.out.println("現在の体力は" + this.hp + "です");
    }
    
    void sleep() {
        this.hp += 10;
    }
    
}