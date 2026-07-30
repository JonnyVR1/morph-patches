package p007l;

import com.p1.mobile.android.app.Act;
import l.sek0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l2h implements k2h {

    /* JADX INFO: renamed from: a */
    public Act f9852a;

    /* JADX INFO: renamed from: b */
    public boolean f9853b;

    /* JADX INFO: renamed from: c */
    public boolean f9854c = false;

    /* JADX INFO: renamed from: d */
    public int f9855d = xdl0.w0();

    public l2h(Act act) {
        this.f9852a = act;
    }

    @Override // p007l.k2h
    /* JADX INFO: renamed from: b */
    public void mo11386b(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            if (this.f9854c) {
                this.f9854c = false;
                sek0.a(this.f9852a);
                return;
            }
            return;
        }
        if (this.f9854c) {
            return;
        }
        this.f9854c = true;
        sek0.b(this.f9852a);
    }

    /* JADX INFO: renamed from: c */
    public void m11542c(float f, float f2) {
        float fMax = Math.max(f * 2.5f, f2);
        if (fMax >= 0.0f) {
            int i = this.f9855d;
            m11544e(i / (i + fMax));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11543d() {
        this.f9853b = true;
        this.f9852a.finish();
    }

    /* JADX INFO: renamed from: e */
    public void m11544e(float f) {
        Act act = this.f9852a;
        if (act == null || act.decorOrSwipingDecorView() == null || this.f9852a.decorOrSwipingDecorView().getBackground() == null) {
            return;
        }
        this.f9852a.decorOrSwipingDecorView().getBackground().setAlpha((int) (f * 255.0f));
    }

    @Override // p007l.k2h
    /* JADX INFO: renamed from: a */
    public void mo11385a() {
    }
}
