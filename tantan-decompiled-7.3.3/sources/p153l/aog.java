package p153l;

import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class aog extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f72447a;

    /* JADX INFO: renamed from: b */
    public aog f72448b;

    /* JADX INFO: renamed from: c */
    public aog f72449c;

    /* JADX INFO: renamed from: d */
    public int f72450d;

    /* JADX INFO: renamed from: e */
    public int f72451e;

    public aog(int i, int i2) {
        this.f72450d = i;
        this.f72451e = i2;
    }

    /* JADX INFO: renamed from: a */
    public void mo67252a(boolean z) {
        this.f72447a = z;
    }

    /* JADX INFO: renamed from: b */
    public void m99073b() {
        if (this.f72447a) {
            aog aogVar = this.f72449c;
            if (aogVar != null) {
                aogVar.mo67252a(true);
                return;
            }
            return;
        }
        aog aogVar2 = this.f72448b;
        if (aogVar2 != null) {
            aogVar2.mo67252a(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m99074c(boolean z) {
        if (this.f72447a) {
            return z ? this.f72451e : this.f72450d;
        }
        return z ? this.f72450d : this.f72451e;
    }

    /* JADX INFO: renamed from: d */
    public aog m99075d(bog bogVar) {
        this.f72448b = bogVar;
        bogVar.m99077f(this);
        return bogVar;
    }

    /* JADX INFO: renamed from: e */
    public void m99076e(boolean z) {
        if (!z) {
            mo67252a(false);
            return;
        }
        aog aogVar = this.f72448b;
        if (aogVar == null) {
            mo67252a(true);
            return;
        }
        while (true) {
            aog aogVar2 = aogVar.f72448b;
            if (aogVar2 == null) {
                aogVar.mo67252a(true);
                return;
            }
            aogVar = aogVar2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m99077f(aog aogVar) {
        this.f72449c = aogVar;
    }

    /* JADX INFO: renamed from: g */
    public aog m99078g(cog cogVar) {
        this.f72448b = cogVar;
        cogVar.m99077f(this);
        return cogVar;
    }
}
