package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class ue3 extends ogk {

    /* JADX INFO: renamed from: a */
    private h6j f178621a = new h6j();

    /* JADX INFO: renamed from: b */
    private h6j f178622b = new h6j();

    /* JADX INFO: renamed from: c */
    private te3 f178623c;

    public ue3() {
        te3 te3Var = new te3();
        this.f178623c = te3Var;
        this.f178621a.addTarget(te3Var);
        this.f178622b.addTarget(this.f178623c);
        this.f178623c.registerFilterLocation(this.f178621a, 0);
        this.f178623c.registerFilterLocation(this.f178622b, 1);
        this.f178623c.addTarget(this);
        registerInitialFilter(this.f178621a);
        registerInitialFilter(this.f178622b);
        registerTerminalFilter(this.f178623c);
        this.f178623c.m190680Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m195598Q1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f178621a;
        if (h6jVar == null || this.f178622b == null || this.f178623c == null) {
            return;
        }
        h6jVar.mo129266R1(bitmap);
        this.f178622b.mo129266R1(bitmap2);
        this.f178623c.m190680Q1(true);
    }

    public void setFrameRate(int i) {
        te3 te3Var = this.f178623c;
        if (te3Var != null) {
            te3Var.setFrameRate(i);
        }
    }
}
