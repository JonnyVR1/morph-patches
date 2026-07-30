package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class qh0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f154417a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f154418b = new m3j();

    /* JADX INFO: renamed from: c */
    private ph0 f154419c;

    public qh0() {
        ph0 ph0Var = new ph0();
        this.f154419c = ph0Var;
        this.f154417a.addTarget(ph0Var);
        this.f154418b.addTarget(this.f154419c);
        this.f154419c.registerFilterLocation(this.f154417a, 0);
        this.f154419c.registerFilterLocation(this.f154418b, 1);
        this.f154419c.addTarget(this);
        registerInitialFilter(this.f154417a);
        registerInitialFilter(this.f154418b);
        registerTerminalFilter(this.f154419c);
        this.f154419c.m168927Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m174507Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f154417a;
        if (m3jVar == null || this.f154418b == null || this.f154419c == null) {
            return;
        }
        m3jVar.mo148397R1(bitmap2);
        this.f154418b.mo148397R1(bitmap);
        this.f154419c.m168927Q1(true);
    }
}
