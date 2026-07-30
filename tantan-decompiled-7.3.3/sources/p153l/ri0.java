package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class ri0 extends s5d0 {

    /* JADX INFO: renamed from: c */
    public final float f163328c;

    public ri0(float f, float f2, float f3) {
        super(f, f2);
        this.f163328c = f3;
    }

    /* JADX INFO: renamed from: f */
    public boolean m181569f(float f, float f2, float f3) {
        if (Math.abs(f2 - m184658d()) > f || Math.abs(f3 - m184657c()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.f163328c);
        return fAbs <= 1.0f || fAbs <= this.f163328c;
    }

    /* JADX INFO: renamed from: g */
    public ri0 m181570g(float f, float f2, float f3) {
        return new ri0((m184657c() + f2) / 2.0f, (m184658d() + f) / 2.0f, (this.f163328c + f3) / 2.0f);
    }
}
