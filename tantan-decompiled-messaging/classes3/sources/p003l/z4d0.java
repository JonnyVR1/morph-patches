package p003l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class z4d0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f9195a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f9196b = new m3j();

    /* JADX INFO: renamed from: c */
    private y4d0 f9197c;

    public z4d0() {
        y4d0 y4d0Var = new y4d0();
        this.f9197c = y4d0Var;
        this.f9195a.addTarget(y4d0Var);
        this.f9196b.addTarget(this.f9197c);
        this.f9197c.registerFilterLocation(this.f9195a, 0);
        this.f9197c.registerFilterLocation(this.f9196b, 1);
        this.f9197c.addTarget(this);
        registerInitialFilter(this.f9195a);
        registerInitialFilter(this.f9196b);
        registerTerminalFilter(this.f9197c);
        this.f9197c.m8888Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m9243Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f9195a;
        if (m3jVar == null || this.f9196b == null || this.f9197c == null) {
            return;
        }
        m3jVar.mo5971R1(bitmap);
        this.f9196b.mo5971R1(bitmap2);
        this.f9197c.m8888Q1(true);
    }

    public void setFrameRate(int i) {
        y4d0 y4d0Var = this.f9197c;
        if (y4d0Var != null) {
            y4d0Var.setFrameRate(i);
        }
    }
}
