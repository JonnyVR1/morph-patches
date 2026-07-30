package p003l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class khq0 extends ydk {

    /* JADX INFO: renamed from: c */
    private jhq0 f4935c;

    /* JADX INFO: renamed from: b */
    private m3j f4934b = new m3j();

    /* JADX INFO: renamed from: a */
    private m3j f4933a = new m3j();

    public khq0() {
        jhq0 jhq0Var = new jhq0();
        this.f4935c = jhq0Var;
        this.f4934b.addTarget(jhq0Var);
        this.f4933a.addTarget(this.f4935c);
        this.f4935c.registerFilterLocation(this.f4934b, 0);
        this.f4935c.registerFilterLocation(this.f4933a, 1);
        this.f4935c.addTarget(this);
        registerInitialFilter(this.f4934b);
        registerInitialFilter(this.f4933a);
        registerTerminalFilter(this.f4935c);
        this.f4935c.m5344d2(true);
        this.f4935c.setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m5655Q1(float f) {
        this.f4935c.m5332R1(f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m5656R1(float f) {
        this.f4935c.m5334T1(f);
    }

    /* JADX INFO: renamed from: S1 */
    public void m5657S1(float f) {
        this.f4935c.m5335U1(f);
    }

    /* JADX INFO: renamed from: T1 */
    public void m5658T1(float f) {
        this.f4935c.m5336V1(f);
    }

    /* JADX INFO: renamed from: U1 */
    public void m5659U1(float f) {
        this.f4935c.m5337W1(f);
    }

    /* JADX INFO: renamed from: V1 */
    public void m5660V1(float f) {
        this.f4935c.m5338X1(f);
    }

    /* JADX INFO: renamed from: W1 */
    public void m5661W1(float f) {
        this.f4935c.m5339Y1(f);
    }

    /* JADX INFO: renamed from: X1 */
    public void m5662X1(float f) {
        this.f4935c.m5340Z1(f);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m5663Y1(float f) {
        this.f4935c.m5341a2(f);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m5664Z1(Bitmap bitmap, Bitmap bitmap2) {
        m3j m3jVar = this.f4934b;
        if (m3jVar == null || this.f4933a == null || this.f4935c == null) {
            return;
        }
        m3jVar.mo5971R1(bitmap);
        this.f4933a.mo5971R1(bitmap2);
        this.f4935c.m5344d2(true);
    }

    /* JADX INFO: renamed from: a2 */
    public void m5665a2(boolean z, int i) {
        this.f4935c.m5342b2(z, i);
    }

    /* JADX INFO: renamed from: b2 */
    public void m5666b2(float f) {
        this.f4935c.m5343c2(f);
    }
}
