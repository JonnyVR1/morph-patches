package p149l;

import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes3.dex */
public class o9e implements n9e {

    /* JADX INFO: renamed from: a */
    public Act f142710a;

    /* JADX INFO: renamed from: b */
    public boolean f142711b;

    /* JADX INFO: renamed from: c */
    public boolean f142712c = false;

    /* JADX INFO: renamed from: d */
    public int f142713d = xdl0.m208408w0();

    public o9e(Act act) {
        this.f142710a = act;
    }

    @Override // p149l.n9e
    /* JADX INFO: renamed from: b */
    public void mo158539b(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            if (this.f142712c) {
                this.f142712c = false;
                sek0.m183671a(this.f142710a);
                return;
            }
            return;
        }
        if (this.f142712c) {
            return;
        }
        this.f142712c = true;
        sek0.m183672b(this.f142710a);
    }

    @Override // p149l.td50
    /* JADX INFO: renamed from: c */
    public void mo44483c(float f, float f2) {
        float fMax = Math.max(f * 2.5f, f2);
        if (fMax >= 0.0f) {
            int i = this.f142713d;
            m163199e(i / (i + fMax));
        }
    }

    @Override // p149l.td50
    /* JADX INFO: renamed from: d */
    public void mo44484d() {
        this.f142711b = true;
        this.f142710a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    public void m163199e(float f) {
        Act act = this.f142710a;
        if (act == null || act.decorOrSwipingDecorView() == null || this.f142710a.decorOrSwipingDecorView().getBackground() == null) {
            return;
        }
        this.f142710a.decorOrSwipingDecorView().getBackground().setAlpha((int) (f * 255.0f));
    }

    @Override // p149l.n9e
    /* JADX INFO: renamed from: a */
    public void mo158538a() {
    }
}
