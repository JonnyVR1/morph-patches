package p003l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mhq0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f5651a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f5652b = new m3j();

    /* JADX INFO: renamed from: c */
    private lhq0 f5653c;

    public mhq0() {
        lhq0 lhq0Var = new lhq0();
        this.f5653c = lhq0Var;
        this.f5651a.addTarget(lhq0Var);
        this.f5652b.addTarget(this.f5653c);
        this.f5653c.registerFilterLocation(this.f5651a, 0);
        this.f5653c.registerFilterLocation(this.f5652b, 1);
        this.f5653c.addTarget(this);
        registerInitialFilter(this.f5651a);
        registerInitialFilter(this.f5652b);
        registerTerminalFilter(this.f5653c);
        this.f5653c.m6025Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m6399Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f5651a;
        if (m3jVar == null || this.f5652b == null || this.f5653c == null) {
            return;
        }
        m3jVar.mo5971R1(bitmap);
        this.f5652b.mo5971R1(bitmap2);
        this.f5653c.m6025Q1(true);
    }

    public void setFrameRate(int i) {
        lhq0 lhq0Var = this.f5653c;
        if (lhq0Var != null) {
            lhq0Var.setFrameRate(i);
        }
    }
}
