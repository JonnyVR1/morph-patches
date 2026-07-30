package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class fe3 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f97094a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f97095b = new m3j();

    /* JADX INFO: renamed from: c */
    private ee3 f97096c;

    public fe3() {
        ee3 ee3Var = new ee3();
        this.f97096c = ee3Var;
        this.f97094a.addTarget(ee3Var);
        this.f97095b.addTarget(this.f97096c);
        this.f97096c.registerFilterLocation(this.f97094a, 0);
        this.f97096c.registerFilterLocation(this.f97095b, 1);
        this.f97096c.addTarget(this);
        registerInitialFilter(this.f97094a);
        registerInitialFilter(this.f97095b);
        registerTerminalFilter(this.f97096c);
        this.f97096c.m115844Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m121017Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f97094a;
        if (m3jVar == null || this.f97095b == null || this.f97096c == null) {
            return;
        }
        m3jVar.mo148397R1(bitmap);
        this.f97095b.mo148397R1(bitmap2);
        this.f97096c.m115844Q1(true);
    }

    public void setFrameRate(int i) {
        ee3 ee3Var = this.f97096c;
        if (ee3Var != null) {
            ee3Var.setFrameRate(i);
        }
    }
}
