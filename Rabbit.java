public class Rabbit extends Animal {
    
    int hp = 30;
    
    @Override
    void sayNameAndHp() {
        System.out.println("私は" + this.name + "です");
        System.out.println("現在の体力は" + this.hp + "です");
    }
    
   
    void jump() {
        this.hp -= 5;
    }
    
    void sleep() {
        this.hp += 10;
    }
}