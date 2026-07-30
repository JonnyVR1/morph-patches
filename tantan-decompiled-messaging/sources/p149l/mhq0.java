package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class mhq0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f133835a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f133836b = new m3j();

    /* JADX INFO: renamed from: c */
    private lhq0 f133837c;

    public mhq0() {
        lhq0 lhq0Var = new lhq0();
        this.f133837c = lhq0Var;
        this.f133835a.addTarget(lhq0Var);
        this.f133836b.addTarget(this.f133837c);
        this.f133837c.registerFilterLocation(this.f133835a, 0);
        this.f133837c.registerFilterLocation(this.f133836b, 1);
        this.f133837c.addTarget(this);
        registerInitialFilter(this.f133835a);
        registerInitialFilter(this.f133836b);
        registerTerminalFilter(this.f133837c);
        this.f133837c.m149853Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m154632Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f133835a;
        if (m3jVar == null || this.f133836b == null || this.f133837c == null) {
            return;
        }
        m3jVar.mo148397R1(bitmap);
        this.f133836b.mo148397R1(bitmap2);
        this.f133837c.m149853Q1(true);
    }

    public void setFrameRate(int i) {
        lhq0 lhq0Var = this.f133837c;
        if (lhq0Var != null) {
            lhq0Var.setFrameRate(i);
        }
    }
}
