package p153l;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes7.dex */
public final class aid extends bid {

    /* JADX INFO: renamed from: b */
    public final int f71521b;

    /* JADX INFO: renamed from: c */
    public final int f71522c;

    public aid(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f71521b = i2;
        this.f71522c = i3;
    }

    /* JADX INFO: renamed from: b */
    public int m97992b() {
        return this.f71521b;
    }

    /* JADX INFO: renamed from: c */
    public int m97993c() {
        return this.f71522c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m97994d() {
        return this.f71521b == 10;
    }

    /* JADX INFO: renamed from: e */
    public boolean m97995e() {
        return this.f71522c == 10;
    }
}
