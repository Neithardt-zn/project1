public class RodCut {

    private int[] r;
    private int[] s;
    public RodCut(int n) {
        r = new int[n];
        s = new int[n];

    }
    public static void main(String[] args) {
        RodCut rd = new RodCut(Integer.parseInt(args[0]));
        int[] p = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        rd.BottomUpCutRod(p, Integer.parseInt(args[0]));
        System.out.print(rd);
    }

    public void BottomUpCutRod(int[] p, int n) {
        r[0] = 0;
        int q;
        for (int j = 1; j < n; j++) {
            q = -1;
            for (int i = 1; i <= j; i++) {
                if (q < p[i] + r[j - i]) {
                    q = p[i] + r[j - i];
                    s[j] = i;
                }
            }
            r[j] = q;
        }
    }

    public String toString() {
        String kb = "";
        for (int i : r
             ) {
            kb = kb + i + "\t";
        }
        kb = kb + "\n";

        for (int i :
                s) {
            kb = kb + i + "\t";
        }
        return kb;
    }
}