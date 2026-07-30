package p003l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qh0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f6639a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f6640b = new m3j();

    /* JADX INFO: renamed from: c */
    private ph0 f6641c;

    public qh0() {
        ph0 ph0Var = new ph0();
        this.f6641c = ph0Var;
        this.f6639a.addTarget(ph0Var);
        this.f6640b.addTarget(this.f6641c);
        this.f6641c.registerFilterLocation(this.f6639a, 0);
        this.f6641c.registerFilterLocation(this.f6640b, 1);
        this.f6641c.addTarget(this);
        registerInitialFilter(this.f6639a);
        registerInitialFilter(this.f6640b);
        registerTerminalFilter(this.f6641c);
        this.f6641c.m6860Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m7020Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f6639a;
        if (m3jVar == null || this.f6640b == null || this.f6641c == null) {
            return;
        }
        m3jVar.mo5971R1(bitmap2);
        this.f6640b.mo5971R1(bitmap);
        this.f6641c.m6860Q1(true);
    }
}
