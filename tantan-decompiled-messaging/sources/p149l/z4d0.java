package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class z4d0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f201578a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f201579b = new m3j();

    /* JADX INFO: renamed from: c */
    private y4d0 f201580c;

    public z4d0() {
        y4d0 y4d0Var = new y4d0();
        this.f201580c = y4d0Var;
        this.f201578a.addTarget(y4d0Var);
        this.f201579b.addTarget(this.f201580c);
        this.f201580c.registerFilterLocation(this.f201578a, 0);
        this.f201580c.registerFilterLocation(this.f201579b, 1);
        this.f201580c.addTarget(this);
        registerInitialFilter(this.f201578a);
        registerInitialFilter(this.f201579b);
        registerTerminalFilter(this.f201580c);
        this.f201580c.m212892Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m217064Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f201578a;
        if (m3jVar == null || this.f201579b == null || this.f201580c == null) {
            return;
        }
        m3jVar.mo148397R1(bitmap);
        this.f201579b.mo148397R1(bitmap2);
        this.f201580c.m212892Q1(true);
    }

    public void setFrameRate(int i) {
        y4d0 y4d0Var = this.f201580c;
        if (y4d0Var != null) {
            y4d0Var.setFrameRate(i);
        }
    }
}
