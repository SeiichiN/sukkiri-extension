// p.52

public class Test2 {
    public static void main(String[] args) {
        System.out.println("(byte)129  : " + toBinaryString((byte)129));
        System.out.println("(byte)-129 : " + toBinaryString((byte)-129));
        System.out.println("(short)129 : " + toBinaryString((short)129));
        System.out.println("(short)-129: " + toBinaryString((short)-129));
        System.out.println("128        : " + toBinaryString(128));
        System.out.println("-128       : " + toBinaryString(-128));
        System.out.println("128L       : " + toBinaryString(128L));
        System.out.println("-128L      : " + toBinaryString(-128L));
        System.out.println("'a'        : " + toBinaryString('a'));
        System.out.println("'あ'       : " + toBinaryString('あ'));
    }

    private static String toBinaryString(byte x) {
        return toBinaryFormat(Integer.toBinaryString((int)x), 1);
    }

    private static String toBinaryString(short x) {
        return toBinaryFormat(Integer.toBinaryString((int)x), 2);
    }

        private static String toBinaryString(int x) {
        return toBinaryFormat(Integer.toBinaryString(x), 4);
    }

        private static String toBinaryString(long x) {
        return toBinaryFormat(Long.toBinaryString(x), 8);
    }

        private static String toBinaryString(char x) {
        return toBinaryFormat(Integer.toBinaryString((int)x), 2);
    }
    
    private static String toBinaryFormat(String s, int m) {
        String t = "";
        String ret = "";
        int n = m * 8;     // n: ビット桁 -- m 1バイト -> n 8ビット
        
        // String s を nビットにそろえる。
        // それを t とする。
        if (s.length() < n) {
            for (int i = 0; i < (n - s.length()); i++) {
                t += "0";
            }
            t += s;
        } else {
            // 文字列s の 右n桁分を取得
            t += s.substring((s.length() - n), s.length());
        }

        for (int i = 0; i < n; i++) {
            ret += t.charAt(i);
            if (i < (n-1) && ((i+1) % 8) == 0) {
                ret += " ";
            }
        }
        return ret;
    }
}

// 修正時刻: Sun 2022/05/15 09:52:05
