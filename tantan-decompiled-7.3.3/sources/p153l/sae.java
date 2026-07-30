package p153l;

import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes3.dex */
public class sae implements rae {

    /* JADX INFO: renamed from: a */
    public Act f167033a;

    /* JADX INFO: renamed from: b */
    public boolean f167034b;

    /* JADX INFO: renamed from: c */
    public boolean f167035c = false;

    /* JADX INFO: renamed from: d */
    public int f167036d = bnl0.m105588w0();

    public sae(Act act) {
        this.f167033a = act;
    }

    @Override // p153l.rae
    /* JADX INFO: renamed from: b */
    public void mo173453b(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            if (this.f167035c) {
                this.f167035c = false;
                ynk0.m216871a(this.f167033a);
                return;
            }
            return;
        }
        if (this.f167035c) {
            return;
        }
        this.f167035c = true;
        ynk0.m216872b(this.f167033a);
    }

    @Override // p153l.am50
    /* JADX INFO: renamed from: c */
    public void mo45666c(float f, float f2) {
        float fMax = Math.max(f * 2.5f, f2);
        if (fMax >= 0.0f) {
            int i = this.f167036d;
            m185268e(i / (i + fMax));
        }
    }

    @Override // p153l.am50
    /* JADX INFO: renamed from: d */
    public void mo45667d() {
        this.f167034b = true;
        this.f167033a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    public void m185268e(float f) {
        Act act = this.f167033a;
        if (act == null || act.decorOrSwipingDecorView() == null || this.f167033a.decorOrSwipingDecorView().getBackground() == null) {
            return;
        }
        this.f167033a.decorOrSwipingDecorView().getBackground().setAlpha((int) (f * 255.0f));
    }

    @Override // p153l.rae
    /* JADX INFO: renamed from: a */
    public void mo173452a() {
    }
}
