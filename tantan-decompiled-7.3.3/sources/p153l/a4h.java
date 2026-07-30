package p153l;

import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes13.dex */
public class a4h implements z3h {

    /* JADX INFO: renamed from: a */
    public Act f68390a;

    /* JADX INFO: renamed from: b */
    public boolean f68391b;

    /* JADX INFO: renamed from: c */
    public boolean f68392c = false;

    /* JADX INFO: renamed from: d */
    public int f68393d = bnl0.m105588w0();

    public a4h(Act act) {
        this.f68390a = act;
    }

    @Override // p153l.z3h
    /* JADX INFO: renamed from: b */
    public void mo95928b(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            if (this.f68392c) {
                this.f68392c = false;
                ynk0.m216871a(this.f68390a);
                return;
            }
            return;
        }
        if (this.f68392c) {
            return;
        }
        this.f68392c = true;
        ynk0.m216872b(this.f68390a);
    }

    @Override // p153l.am50
    /* JADX INFO: renamed from: c */
    public void mo45666c(float f, float f2) {
        float fMax = Math.max(f * 2.5f, f2);
        if (fMax >= 0.0f) {
            int i = this.f68393d;
            m95929e(i / (i + fMax));
        }
    }

    @Override // p153l.am50
    /* JADX INFO: renamed from: d */
    public void mo45667d() {
        this.f68391b = true;
        this.f68390a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    public void m95929e(float f) {
        Act act = this.f68390a;
        if (act == null || act.decorOrSwipingDecorView() == null || this.f68390a.decorOrSwipingDecorView().getBackground() == null) {
            return;
        }
        this.f68390a.decorOrSwipingDecorView().getBackground().setAlpha((int) (f * 255.0f));
    }

    @Override // p153l.z3h
    /* JADX INFO: renamed from: a */
    public void mo95927a() {
    }
}
