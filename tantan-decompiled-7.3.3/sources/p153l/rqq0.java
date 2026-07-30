package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class rqq0 extends ogk {

    /* JADX INFO: renamed from: a */
    private h6j f164510a = new h6j();

    /* JADX INFO: renamed from: b */
    private h6j f164511b = new h6j();

    /* JADX INFO: renamed from: c */
    private qqq0 f164512c;

    public rqq0() {
        qqq0 qqq0Var = new qqq0();
        this.f164512c = qqq0Var;
        this.f164510a.addTarget(qqq0Var);
        this.f164511b.addTarget(this.f164512c);
        this.f164512c.registerFilterLocation(this.f164510a, 0);
        this.f164512c.registerFilterLocation(this.f164511b, 1);
        this.f164512c.addTarget(this);
        registerInitialFilter(this.f164510a);
        registerInitialFilter(this.f164511b);
        registerTerminalFilter(this.f164512c);
        this.f164512c.m177510Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m182672Q1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f164510a;
        if (h6jVar == null || this.f164511b == null || this.f164512c == null) {
            return;
        }
        h6jVar.mo129266R1(bitmap);
        this.f164511b.mo129266R1(bitmap2);
        this.f164512c.m177510Q1(true);
    }

    public void setFrameRate(int i) {
        qqq0 qqq0Var = this.f164512c;
        if (qqq0Var != null) {
            qqq0Var.setFrameRate(i);
        }
    }
}
