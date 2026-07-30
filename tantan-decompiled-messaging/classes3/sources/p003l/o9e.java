package p003l;

import com.p1.mobile.android.app.Act;
import l.sek0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class o9e implements n9e {

    /* JADX INFO: renamed from: a */
    public Act f6065a;

    /* JADX INFO: renamed from: b */
    public boolean f6066b;

    /* JADX INFO: renamed from: c */
    public boolean f6067c = false;

    /* JADX INFO: renamed from: d */
    public int f6068d = xdl0.w0();

    public o9e(Act act) {
        this.f6065a = act;
    }

    @Override // p003l.n9e
    /* JADX INFO: renamed from: b */
    public void mo6530b(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            if (this.f6067c) {
                this.f6067c = false;
                sek0.a(this.f6065a);
                return;
            }
            return;
        }
        if (this.f6067c) {
            return;
        }
        this.f6067c = true;
        sek0.b(this.f6065a);
    }

    @Override // p003l.td50
    /* JADX INFO: renamed from: c */
    public void mo929c(float f, float f2) {
        float fMax = Math.max(f * 2.5f, f2);
        if (fMax >= 0.0f) {
            int i = this.f6068d;
            m6598e(i / (i + fMax));
        }
    }

    @Override // p003l.td50
    /* JADX INFO: renamed from: d */
    public void mo930d() {
        this.f6066b = true;
        this.f6065a.finish();
    }

    /* JADX INFO: renamed from: e */
    public void m6598e(float f) {
        Act act = this.f6065a;
        if (act == null || act.decorOrSwipingDecorView() == null || this.f6065a.decorOrSwipingDecorView().getBackground() == null) {
            return;
        }
        this.f6065a.decorOrSwipingDecorView().getBackground().setAlpha((int) (f * 255.0f));
    }

    @Override // p003l.n9e
    /* JADX INFO: renamed from: a */
    public void mo6529a() {
    }
}
