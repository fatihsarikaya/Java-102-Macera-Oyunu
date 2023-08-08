import java.util.Random;

class Player {
    private int health;
    private int food;
    private int firewood;
    private int water;
    private int money;
    // Diğer özellikler ve envanter buraya eklenebilir

    public Player() {
        health = 100;
        food = 0;
        firewood = 0;
        water = 0;
        money = 0;
        // Diğer özelliklerin başlangıç değerleri buraya eklenebilir
    }

    public int attack() {
        Random rand = new Random();
        // Oyuncunun saldırı gücünü hesaplayan kod buraya eklenebilir
    }

    // Getter ve Setter metodları buraya eklenebilir
}

class Enemy {
    private int id;
    private int damageMin;
    private int damageMax;
    private int health;

    public Enemy(int id, int damageMin, int damageMax, int health) {
        this.id = id;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.health = health;
    }

    // Getter metodları buraya eklenebilir

    public int attack() {
        Random rand = new Random();
        return rand.nextInt(damageMax - damageMin + 1) + damageMin;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
}

class Battle {
    public static boolean determineFirstMove() {
        Random rand = new Random();
        return rand.nextDouble() < 0.5;
    }

    public static void main(String[] args) {
        Player player = new Player();
        // Oyuncunun başlangıç durumu burada ayarlanabilir

        Enemy snake = new Enemy(4, 3, 6, 12);
        // Diğer düşmanlar burada oluşturulabilir

        boolean playerFirst = determineFirstMove();
        
        if (playerFirst) {
            int playerDamage = player.attack();
            snake.takeDamage(playerDamage);
        }
        
        // Oyuncunun ve düşmanın sırasıyla saldırma ve zarar alma işlemleri burada gerçekleştirilir
        
        // Oyunun sonucu ve envanter güncellemeleri burada yapılır

        //Oyuncunun saldırı gücünü hesaplamak için gerekli kod eklenecektir.
    }
}
