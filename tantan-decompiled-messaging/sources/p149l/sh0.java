package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class sh0 extends ydk {

    /* JADX INFO: renamed from: a */
    private m3j f164503a = new m3j();

    /* JADX INFO: renamed from: b */
    private m3j f164504b = new m3j();

    /* JADX INFO: renamed from: c */
    private rh0 f164505c;

    public sh0() {
        rh0 rh0Var = new rh0();
        this.f164505c = rh0Var;
        this.f164503a.addTarget(rh0Var);
        this.f164504b.addTarget(this.f164505c);
        this.f164505c.registerFilterLocation(this.f164503a, 0);
        this.f164505c.registerFilterLocation(this.f164504b, 1);
        this.f164505c.addTarget(this);
        registerInitialFilter(this.f164503a);
        registerInitialFilter(this.f164504b);
        registerTerminalFilter(this.f164505c);
        this.f164505c.m179268Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m184140Q1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f164503a;
        if (m3jVar == null || this.f164504b == null || this.f164505c == null) {
            return;
        }
        m3jVar.mo148397R1(bitmap2);
        this.f164504b.mo148397R1(bitmap);
        this.f164505c.m179268Q1(true);
    }
}
