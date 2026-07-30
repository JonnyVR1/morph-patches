package p153l;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p510 {

    /* JADX INFO: renamed from: a */
    public q510.C19522a f150589a;

    /* JADX INFO: renamed from: a */
    public abstract void mo162561a();

    /* JADX INFO: renamed from: b */
    public abstract void mo162562b();

    /* JADX INFO: renamed from: c */
    public void m170589c() {
        q510.C19522a c19522a = this.f150589a;
        if (c19522a != null) {
            c19522a.f155653b = null;
            c19522a.f155655d = null;
            ViewGroup viewGroup = c19522a.f155654c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                bnl0.m105524M(this.f150589a.f155654c, false);
            }
            this.f150589a.f155654c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m170590d(q510.C19522a c19522a) {
        this.f150589a = c19522a;
    }
}
