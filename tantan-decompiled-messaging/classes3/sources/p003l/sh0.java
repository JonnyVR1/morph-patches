package p003l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sh0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f7254a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f7255b = new m3j();

    /* JADX INFO: renamed from: c */
    private rh0 f7256c;

    public sh0() {
        rh0 rh0Var = new rh0();
        this.f7256c = rh0Var;
        this.f7254a.addTarget(rh0Var);
        this.f7255b.addTarget(this.f7256c);
        this.f7256c.registerFilterLocation(this.f7254a, 0);
        this.f7256c.registerFilterLocation(this.f7255b, 1);
        this.f7256c.addTarget(this);
        registerInitialFilter(this.f7254a);
        registerInitialFilter(this.f7255b);
        registerTerminalFilter(this.f7256c);
        this.f7256c.m7257Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m7597Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f7254a;
        if (m3jVar == null || this.f7255b == null || this.f7256c == null) {
            return;
        }
        m3jVar.mo5971R1(bitmap2);
        this.f7255b.mo5971R1(bitmap);
        this.f7256c.m7257Q1(true);
    }
}
