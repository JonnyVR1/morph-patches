package p149l;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes7.dex */
public final class ugd extends vgd {

    /* JADX INFO: renamed from: b */
    public final int f176375b;

    /* JADX INFO: renamed from: c */
    public final int f176376c;

    public ugd(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f176375b = i2;
        this.f176376c = i3;
    }

    /* JADX INFO: renamed from: b */
    public int m193547b() {
        return this.f176375b;
    }

    /* JADX INFO: renamed from: c */
    public int m193548c() {
        return this.f176376c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m193549d() {
        return this.f176375b == 10;
    }

    /* JADX INFO: renamed from: e */
    public boolean m193550e() {
        return this.f176376c == 10;
    }
}
