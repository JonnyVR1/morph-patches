package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class vi0 extends pxc0 {

    /* JADX INFO: renamed from: c */
    public final float f181545c;

    public vi0(float f, float f2, float f3) {
        super(f, f2);
        this.f181545c = f3;
    }

    /* JADX INFO: renamed from: f */
    public boolean m198487f(float f, float f2, float f3) {
        if (Math.abs(f2 - m171832d()) > f || Math.abs(f3 - m171831c()) > f) {
            return false;
        }
        float fAbs = Math.abs(f - this.f181545c);
        return fAbs <= 1.0f || fAbs <= this.f181545c;
    }

    /* JADX INFO: renamed from: g */
    public vi0 m198488g(float f, float f2, float f3) {
        return new vi0((m171831c() + f2) / 2.0f, (m171832d() + f) / 2.0f, (this.f181545c + f3) / 2.0f);
    }
}
