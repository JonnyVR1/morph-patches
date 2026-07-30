package p007l;

import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class lmg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f10066a;

    /* JADX INFO: renamed from: b */
    public lmg f10067b;

    /* JADX INFO: renamed from: c */
    public lmg f10068c;

    /* JADX INFO: renamed from: d */
    public int f10069d;

    /* JADX INFO: renamed from: e */
    public int f10070e;

    public lmg(int i, int i2) {
        this.f10069d = i;
        this.f10070e = i2;
    }

    /* JADX INFO: renamed from: a */
    public void mo7221a(boolean z) {
        this.f10066a = z;
    }

    /* JADX INFO: renamed from: b */
    public void m11646b() {
        if (this.f10066a) {
            lmg lmgVar = this.f10068c;
            if (lmgVar != null) {
                lmgVar.mo7221a(true);
                return;
            }
            return;
        }
        lmg lmgVar2 = this.f10067b;
        if (lmgVar2 != null) {
            lmgVar2.mo7221a(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m11647c(boolean z) {
        if (this.f10066a) {
            return z ? this.f10070e : this.f10069d;
        }
        return z ? this.f10069d : this.f10070e;
    }

    /* JADX INFO: renamed from: d */
    public lmg m11648d(mmg mmgVar) {
        this.f10067b = mmgVar;
        mmgVar.m11650f(this);
        return mmgVar;
    }

    /* JADX INFO: renamed from: e */
    public void m11649e(boolean z) {
        if (!z) {
            mo7221a(false);
            return;
        }
        lmg lmgVar = this.f10067b;
        if (lmgVar == null) {
            mo7221a(true);
            return;
        }
        while (true) {
            lmg lmgVar2 = lmgVar.f10067b;
            if (lmgVar2 == null) {
                lmgVar.mo7221a(true);
                return;
            }
            lmgVar = lmgVar2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11650f(lmg lmgVar) {
        this.f10068c = lmgVar;
    }

    /* JADX INFO: renamed from: g */
    public lmg m11651g(nmg nmgVar) {
        this.f10067b = nmgVar;
        nmgVar.m11650f(this);
        return nmgVar;
    }
}
