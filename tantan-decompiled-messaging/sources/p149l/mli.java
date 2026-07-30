package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class mli extends pxc0 {

    /* JADX INFO: renamed from: c */
    public final float f134437c;

    /* JADX INFO: renamed from: d */
    public final int f134438d;

    public mli(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f134437c = f3;
        this.f134438d = i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m155148f(float f, float f2, float f3) {
        if (Math.abs(f2 - m171832d()) > f || Math.abs(f3 - m171831c()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.f134437c);
        return fAbs <= 1.0f || fAbs <= this.f134437c;
    }

    /* JADX INFO: renamed from: g */
    public mli m155149g(float f, float f2, float f3) {
        int i = this.f134438d;
        int i2 = i + 1;
        float fM171831c = (i * m171831c()) + f2;
        float f4 = i2;
        return new mli(fM171831c / f4, ((this.f134438d * m171832d()) + f) / f4, ((this.f134438d * this.f134437c) + f3) / f4, i2);
    }

    /* JADX INFO: renamed from: h */
    public int m155150h() {
        return this.f134438d;
    }

    /* JADX INFO: renamed from: i */
    public float m155151i() {
        return this.f134437c;
    }

    public mli(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }
}
