package p153l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class uhw {

    /* JADX INFO: renamed from: a */
    private final int f179062a;

    /* JADX INFO: renamed from: b */
    private final int f179063b;

    public uhw(int i, int i2) {
        this.f179062a = i;
        this.f179063b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m196126a() {
        return this.f179063b;
    }

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo196127b();

    /* JADX INFO: renamed from: c */
    public abstract byte[] mo196128c(int i, byte[] bArr);

    /* JADX INFO: renamed from: d */
    public final int m196129d() {
        return this.f179062a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m196130e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public uhw m196131f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f179062a;
        byte[] bArrMo196128c = new byte[i];
        StringBuilder sb = new StringBuilder(this.f179063b * (i + 1));
        for (int i2 = 0; i2 < this.f179063b; i2++) {
            bArrMo196128c = mo196128c(i2, bArrMo196128c);
            for (int i3 = 0; i3 < this.f179062a; i3++) {
                int i4 = bArrMo196128c[i3] & 255;
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
