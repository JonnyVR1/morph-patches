package p003l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fe3 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f3572a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f3573b = new m3j();

    /* JADX INFO: renamed from: c */
    private ee3 f3574c;

    public fe3() {
        ee3 ee3Var = new ee3();
        this.f3574c = ee3Var;
        this.f3572a.addTarget(ee3Var);
        this.f3573b.addTarget(this.f3574c);
        this.f3574c.registerFilterLocation(this.f3572a, 0);
        this.f3574c.registerFilterLocation(this.f3573b, 1);
        this.f3574c.addTarget(this);
        registerInitialFilter(this.f3572a);
        registerInitialFilter(this.f3573b);
        registerTerminalFilter(this.f3574c);
        this.f3574c.m3819Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m4335Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f3572a;
        if (m3jVar == null || this.f3573b == null || this.f3574c == null) {
            return;
        }
        m3jVar.mo5971R1(bitmap);
        this.f3573b.mo5971R1(bitmap2);
        this.f3574c.m3819Q1(true);
    }

    public void setFrameRate(int i) {
        ee3 ee3Var = this.f3574c;
        if (ee3Var != null) {
            ee3Var.setFrameRate(i);
        }
    }
}
