package p149l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wfw {

    /* JADX INFO: renamed from: a */
    private final int f186124a;

    /* JADX INFO: renamed from: b */
    private final int f186125b;

    public wfw(int i, int i2) {
        this.f186124a = i;
        this.f186125b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m202991a() {
        return this.f186125b;
    }

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo167373b();

    /* JADX INFO: renamed from: c */
    public abstract byte[] mo167374c(int i, byte[] bArr);

    /* JADX INFO: renamed from: d */
    public final int m202992d() {
        return this.f186124a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m202993e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public wfw m202994f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f186124a;
        byte[] bArrMo167374c = new byte[i];
        StringBuilder sb = new StringBuilder(this.f186125b * (i + 1));
        for (int i2 = 0; i2 < this.f186125b; i2++) {
            bArrMo167374c = mo167374c(i2, bArrMo167374c);
            for (int i3 = 0; i3 < this.f186124a; i3++) {
                int i4 = bArrMo167374c[i3] & 255;
                if (i4 < 64) {
                    c = '#';
                } else if (i4 < 128) {
                    c = '+';
                } else {
                    c = i4 < 192 ? '.' : ' ';
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
