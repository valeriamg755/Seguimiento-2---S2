package ENUM;

public enum Ejercicio3 {
    Épico (3),
    Raro (2),
    Común (1),

    private final int levelCode;
    private Ejercicio3(int levelCode){this.levelCode=levelCode};
    public int getLevelCode() {
        return levelCode;
    }
    }
class Main {
    public static void main(String[] args) {
        Ejercicio3 size = Ejercicio3.Common;
        System.out.println(size.getLevelCode());
    }
}
