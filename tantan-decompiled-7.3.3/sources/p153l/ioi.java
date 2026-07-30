package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class ioi extends s5d0 {

    /* JADX INFO: renamed from: c */
    public final float f116161c;

    /* JADX INFO: renamed from: d */
    public final int f116162d;

    public ioi(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f116161c = f3;
        this.f116162d = i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m141309f(float f, float f2, float f3) {
        if (Math.abs(f2 - m184658d()) > f || Math.abs(f3 - m184657c()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.f116161c);
        return fAbs <= 1.0f || fAbs <= this.f116161c;
    }

    /* JADX INFO: renamed from: g */
    public ioi m141310g(float f, float f2, float f3) {
        int i = this.f116162d;
        int i2 = i + 1;
        float fM184657c = (i * m184657c()) + f2;
        float f4 = i2;
        return new ioi(fM184657c / f4, ((this.f116162d * m184658d()) + f) / f4, ((this.f116162d * this.f116161c) + f3) / f4, i2);
    }

    /* JADX INFO: renamed from: h */
    public int m141311h() {
        return this.f116162d;
    }

    /* JADX INFO: renamed from: i */
    public float m141312i() {
        return this.f116161c;
    }

    public ioi(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }
}
