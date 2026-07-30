package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class mh0 extends ogk {

    /* JADX INFO: renamed from: a */
    private h6j f136813a = new h6j();

    /* JADX INFO: renamed from: b */
    private h6j f136814b = new h6j();

    /* JADX INFO: renamed from: c */
    private lh0 f136815c;

    public mh0() {
        lh0 lh0Var = new lh0();
        this.f136815c = lh0Var;
        this.f136813a.addTarget(lh0Var);
        this.f136814b.addTarget(this.f136815c);
        this.f136815c.registerFilterLocation(this.f136813a, 0);
        this.f136815c.registerFilterLocation(this.f136814b, 1);
        this.f136815c.addTarget(this);
        registerInitialFilter(this.f136813a);
        registerInitialFilter(this.f136814b);
        registerTerminalFilter(this.f136815c);
        this.f136815c.m154200Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m158396Q1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f136813a;
        if (h6jVar == null || this.f136814b == null || this.f136815c == null) {
            return;
        }
        h6jVar.mo129266R1(bitmap2);
        this.f136814b.mo129266R1(bitmap);
        this.f136815c.m154200Q1(true);
    }
}
