package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class pqq0 extends ogk {

    /* JADX INFO: renamed from: c */
    private oqq0 f153690c;

    /* JADX INFO: renamed from: b */
    private h6j f153689b = new h6j();

    /* JADX INFO: renamed from: a */
    private h6j f153688a = new h6j();

    public pqq0() {
        oqq0 oqq0Var = new oqq0();
        this.f153690c = oqq0Var;
        this.f153689b.addTarget(oqq0Var);
        this.f153688a.addTarget(this.f153690c);
        this.f153690c.registerFilterLocation(this.f153689b, 0);
        this.f153690c.registerFilterLocation(this.f153688a, 1);
        this.f153690c.addTarget(this);
        registerInitialFilter(this.f153689b);
        registerInitialFilter(this.f153688a);
        registerTerminalFilter(this.f153690c);
        this.f153690c.m168843d2(true);
        this.f153690c.setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m173381Q1(float f) {
        this.f153690c.m168831R1(f);
    }

    /* JADX INFO: renamed from: R1 */
    public void m173382R1(float f) {
        this.f153690c.m168833T1(f);
    }

    /* JADX INFO: renamed from: S1 */
    public void m173383S1(float f) {
        this.f153690c.m168834U1(f);
    }

    /* JADX INFO: renamed from: T1 */
    public void m173384T1(float f) {
        this.f153690c.m168835V1(f);
    }

    /* JADX INFO: renamed from: U1 */
    public void m173385U1(float f) {
        this.f153690c.m168836W1(f);
    }

    /* JADX INFO: renamed from: V1 */
    public void m173386V1(float f) {
        this.f153690c.m168837X1(f);
    }

    /* JADX INFO: renamed from: W1 */
    public void m173387W1(float f) {
        this.f153690c.m168838Y1(f);
    }

    /* JADX INFO: renamed from: X1 */
    public void m173388X1(float f) {
        this.f153690c.m168839Z1(f);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m173389Y1(float f) {
        this.f153690c.m168840a2(f);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m173390Z1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f153689b;
        if (h6jVar == null || this.f153688a == null || this.f153690c == null) {
            return;
        }
        h6jVar.mo129266R1(bitmap);
        this.f153688a.mo129266R1(bitmap2);
        this.f153690c.m168843d2(true);
    }

    /* JADX INFO: renamed from: a2 */
    public void m173391a2(boolean z, int i) {
        this.f153690c.m168841b2(z, i);
    }

    /* JADX INFO: renamed from: b2 */
    public void m173392b2(float f) {
        this.f153690c.m168842c2(f);
    }
}
