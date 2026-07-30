package p153l;

/* JADX INFO: loaded from: classes6.dex */
public class zlr0 {

    /* JADX INFO: renamed from: a */
    public final int f205002a;

    public zlr0(int i) {
        this.f205002a = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m220300a(int i) {
        return (i >> 24) & 255;
    }

    /* JADX INFO: renamed from: b */
    public static String m220301b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m220301b(this.f205002a);
    }
}
