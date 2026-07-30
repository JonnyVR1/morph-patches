package p149l;

import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes12.dex */
public class l2h implements k2h {

    /* JADX INFO: renamed from: a */
    public Act f125781a;

    /* JADX INFO: renamed from: b */
    public boolean f125782b;

    /* JADX INFO: renamed from: c */
    public boolean f125783c = false;

    /* JADX INFO: renamed from: d */
    public int f125784d = xdl0.m208408w0();

    public l2h(Act act) {
        this.f125781a = act;
    }

    @Override // p149l.k2h
    /* JADX INFO: renamed from: b */
    public void mo144303b(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            if (this.f125783c) {
                this.f125783c = false;
                sek0.m183671a(this.f125781a);
                return;
            }
            return;
        }
        if (this.f125783c) {
            return;
        }
        this.f125783c = true;
        sek0.m183672b(this.f125781a);
    }

    @Override // p149l.td50
    /* JADX INFO: renamed from: c */
    public void mo44483c(float f, float f2) {
        float fMax = Math.max(f * 2.5f, f2);
        if (fMax >= 0.0f) {
            int i = this.f125784d;
            m148283e(i / (i + fMax));
        }
    }

    @Override // p149l.td50
    /* JADX INFO: renamed from: d */
    public void mo44484d() {
        this.f125782b = true;
        this.f125781a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    public void m148283e(float f) {
        Act act = this.f125781a;
        if (act == null || act.decorOrSwipingDecorView() == null || this.f125781a.decorOrSwipingDecorView().getBackground() == null) {
            return;
        }
        this.f125781a.decorOrSwipingDecorView().getBackground().setAlpha((int) (f * 255.0f));
    }

    @Override // p149l.k2h
    /* JADX INFO: renamed from: a */
    public void mo144302a() {
    }
}
