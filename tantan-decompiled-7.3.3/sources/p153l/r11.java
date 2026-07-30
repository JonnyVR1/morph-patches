package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class r11 {

    /* JADX INFO: renamed from: b */
    public static final r11 f160748b = new r11(255);

    /* JADX INFO: renamed from: a */
    private int f160749a;

    private r11(int i) {
        this.f160749a = i;
    }

    /* JADX INFO: renamed from: a */
    public static r11 m179321a(int i) {
        r11 r11Var = f160748b;
        return i == r11Var.f160749a ? r11Var : new r11(i);
    }

    public String toString() {
        return "AspectRatio{value=" + this.f160749a + '}';
    }
}
