package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class cdd0 extends ogk {

    /* JADX INFO: renamed from: a */
    private h6j f81177a = new h6j();

    /* JADX INFO: renamed from: b */
    private h6j f81178b = new h6j();

    /* JADX INFO: renamed from: c */
    private bdd0 f81179c;

    public cdd0() {
        bdd0 bdd0Var = new bdd0();
        this.f81179c = bdd0Var;
        this.f81177a.addTarget(bdd0Var);
        this.f81178b.addTarget(this.f81179c);
        this.f81179c.registerFilterLocation(this.f81177a, 0);
        this.f81179c.registerFilterLocation(this.f81178b, 1);
        this.f81179c.addTarget(this);
        registerInitialFilter(this.f81177a);
        registerInitialFilter(this.f81178b);
        registerTerminalFilter(this.f81179c);
        this.f81179c.m103606Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m109164Q1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f81177a;
        if (h6jVar == null || this.f81178b == null || this.f81179c == null) {
            return;
        }
        h6jVar.mo129266R1(bitmap);
        this.f81178b.mo129266R1(bitmap2);
        this.f81179c.m103606Q1(true);
    }

    public void setFrameRate(int i) {
        bdd0 bdd0Var = this.f81179c;
        if (bdd0Var != null) {
            bdd0Var.setFrameRate(i);
        }
    }
}
