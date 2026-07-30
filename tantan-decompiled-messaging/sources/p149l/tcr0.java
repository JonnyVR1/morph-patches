package p149l;

/* JADX INFO: loaded from: classes6.dex */
public class tcr0 {

    /* JADX INFO: renamed from: a */
    public final int f169472a;

    public tcr0(int i) {
        this.f169472a = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m188057a(int i) {
        return (i >> 24) & 255;
    }

    /* JADX INFO: renamed from: b */
    public static String m188058b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m188058b(this.f169472a);
    }
}
