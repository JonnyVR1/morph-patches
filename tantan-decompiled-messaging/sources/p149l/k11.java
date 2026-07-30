package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class k11 {

    /* JADX INFO: renamed from: b */
    public static final k11 f120532b = new k11(255);

    /* JADX INFO: renamed from: a */
    private int f120533a;

    private k11(int i) {
        this.f120533a = i;
    }

    /* JADX INFO: renamed from: a */
    public static k11 m144137a(int i) {
        k11 k11Var = f120532b;
        return i == k11Var.f120533a ? k11Var : new k11(i);
    }

    public String toString() {
        return "AspectRatio{value=" + this.f120533a + '}';
    }
}
