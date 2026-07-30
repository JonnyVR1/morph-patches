package p153l;

/* JADX INFO: loaded from: classes.dex */
public class r3d0 extends s3d0 {

    /* JADX INFO: renamed from: c */
    public float f161032c = 0.0f;

    @Override // p153l.s3d0
    /* JADX INFO: renamed from: e */
    public void mo1115e() {
        super.mo1115e();
        this.f161032c = 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m179601g() {
        this.f165995b = 2;
    }

    /* JADX INFO: renamed from: h */
    public void m179602h(int i) {
        int i2 = this.f165995b;
        if (i2 == 0 || this.f161032c != i) {
            this.f161032c = i;
            if (i2 == 1) {
                m184234c();
            }
            m184233b();
        }
    }
}
