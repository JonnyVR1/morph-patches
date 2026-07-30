package p149l;

import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lmg extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f128790a;

    /* JADX INFO: renamed from: b */
    public lmg f128791b;

    /* JADX INFO: renamed from: c */
    public lmg f128792c;

    /* JADX INFO: renamed from: d */
    public int f128793d;

    /* JADX INFO: renamed from: e */
    public int f128794e;

    public lmg(int i, int i2) {
        this.f128793d = i;
        this.f128794e = i2;
    }

    /* JADX INFO: renamed from: a */
    public void mo66069a(boolean z) {
        this.f128790a = z;
    }

    /* JADX INFO: renamed from: b */
    public void m150582b() {
        if (this.f128790a) {
            lmg lmgVar = this.f128792c;
            if (lmgVar != null) {
                lmgVar.mo66069a(true);
                return;
            }
            return;
        }
        lmg lmgVar2 = this.f128791b;
        if (lmgVar2 != null) {
            lmgVar2.mo66069a(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m150583c(boolean z) {
        if (this.f128790a) {
            return z ? this.f128794e : this.f128793d;
        }
        return z ? this.f128793d : this.f128794e;
    }

    /* JADX INFO: renamed from: d */
    public lmg m150584d(mmg mmgVar) {
        this.f128791b = mmgVar;
        mmgVar.m150586f(this);
        return mmgVar;
    }

    /* JADX INFO: renamed from: e */
    public void m150585e(boolean z) {
        if (!z) {
            mo66069a(false);
            return;
        }
        lmg lmgVar = this.f128791b;
        if (lmgVar == null) {
            mo66069a(true);
            return;
        }
        while (true) {
            lmg lmgVar2 = lmgVar.f128791b;
            if (lmgVar2 == null) {
                lmgVar.mo66069a(true);
                return;
            }
            lmgVar = lmgVar2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m150586f(lmg lmgVar) {
        this.f128792c = lmgVar;
    }

    /* JADX INFO: renamed from: g */
    public lmg m150587g(nmg nmgVar) {
        this.f128791b = nmgVar;
        nmgVar.m150586f(this);
        return nmgVar;
    }
}
