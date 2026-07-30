package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class khq0 extends ydk {

    /* JADX INFO: renamed from: c */
    private jhq0 f123201c;

    /* JADX INFO: renamed from: b */
    private m3j f123200b = new m3j();

    /* JADX INFO: renamed from: a */
    private m3j f123199a = new m3j();

    public khq0() {
        jhq0 jhq0Var = new jhq0();
        this.f123201c = jhq0Var;
        this.f123200b.addTarget(jhq0Var);
        this.f123199a.addTarget(this.f123201c);
        this.f123201c.registerFilterLocation(this.f123200b, 0);
        this.f123201c.registerFilterLocation(this.f123199a, 1);
        this.f123201c.addTarget(this);
        registerInitialFilter(this.f123200b);
        registerInitialFilter(this.f123199a);
        registerTerminalFilter(this.f123201c);
        this.f123201c.m141568d2(true);
        this.f123201c.setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m145981Q1(float f) {
        this.f123201c.m141556R1(f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m145982R1(float f) {
        this.f123201c.m141558T1(f);
    }

    /* JADX INFO: renamed from: S1 */
    public void m145983S1(float f) {
        this.f123201c.m141559U1(f);
    }

    /* JADX INFO: renamed from: T1 */
    public void m145984T1(float f) {
        this.f123201c.m141560V1(f);
    }

    /* JADX INFO: renamed from: U1 */
    public void m145985U1(float f) {
        this.f123201c.m141561W1(f);
    }

    /* JADX INFO: renamed from: V1 */
    public void m145986V1(float f) {
        this.f123201c.m141562X1(f);
    }

    /* JADX INFO: renamed from: W1 */
    public void m145987W1(float f) {
        this.f123201c.m141563Y1(f);
    }

    /* JADX INFO: renamed from: X1 */
    public void m145988X1(float f) {
        this.f123201c.m141564Z1(f);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m145989Y1(float f) {
        this.f123201c.m141565a2(f);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m145990Z1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f123200b;
        if (m3jVar == null || this.f123199a == null || this.f123201c == null) {
            return;
        }
        m3jVar.mo148397R1(bitmap);
        this.f123199a.mo148397R1(bitmap2);
        this.f123201c.m141568d2(true);
    }

    /* JADX INFO: renamed from: a2 */
    public void m145991a2(boolean z, int i) {
        this.f123201c.m141566b2(z, i);
    }

    /* JADX INFO: renamed from: b2 */
    public void m145992b2(float f) {
        this.f123201c.m141567c2(f);
    }
}
