public class Body {
    public static String name;
    
    public static void main(String[] args) {
        String name;
        // name = getName();
        System.out.println("this.name:" + Body.name);
        // System.out.println("main-name:" + name);
    }

    public static String getName() {
        String name;
        // System.out.println("name:" + name);
        name = "taro";
        return name;
    }
}

// 修正時刻: Fri 2022/05/20 06:49:51
