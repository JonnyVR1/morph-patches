package p153l;

import android.content.Context;
import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ioi0<T> extends qzl<T> {

    /* JADX INFO: renamed from: c */
    public f6m f116164c;

    /* JADX INFO: renamed from: d */
    public boolean f116165d;

    /* JADX INFO: renamed from: f */
    public Context f116167f;

    /* JADX INFO: renamed from: g */
    public uni0 f116168g;

    /* JADX INFO: renamed from: b */
    public int f116163b = -1;

    /* JADX INFO: renamed from: e */
    public volatile boolean f116166e = false;

    @Override // p153l.qzl
    /* JADX INFO: renamed from: g */
    public boolean mo141313g() {
        return this.f116165d;
    }

    /* JADX INFO: renamed from: i */
    public final int m141314i(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length != 2) {
            return 0;
        }
        try {
            if (p8c.m171236g(str2)) {
                return Integer.valueOf(strArrSplit[1]).intValue();
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo82324j();

    /* JADX INFO: renamed from: k */
    public abstract f6m mo82325k();

    /* JADX INFO: renamed from: l */
    public abstract uni0 mo82326l();

    /* JADX INFO: renamed from: m */
    public void mo82327m() {
        this.f116165d = true;
    }

    /* JADX INFO: renamed from: n */
    public void m141315n(Context context) {
        this.f116167f = context;
        this.f116164c = mo82325k();
        du2.m118056p().m110254j();
        uni0 uni0VarMo82326l = mo82326l();
        this.f116168g = uni0VarMo82326l;
        if (uni0VarMo82326l == null || !uni0VarMo82326l.mo112452b()) {
            mo82327m();
            return;
        }
        mo82327m();
        if (this.f116168g.mo112451a()) {
            mo82329r();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m141316o() {
        if (this.f116163b == -1) {
            this.f116163b = m141314i(fq80.m126738a(du2.m118045e(), mo82324j(), ""));
        }
        this.f116166e = this.f116163b < mo82328p();
        return this.f116166e;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo82328p();

    @CallSuper
    /* JADX INFO: renamed from: q */
    public void m141317q(eoi0 eoi0Var) {
        m141318s();
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo82329r();

    /* JADX INFO: renamed from: s */
    public final void m141318s() {
        StringBuilder sb = new StringBuilder();
        sb.append(p8c.m171232c());
        sb.append("_");
        int i = this.f116163b + 1;
        this.f116163b = i;
        sb.append(i);
        fq80.m126739b(du2.m118045e(), mo82324j(), sb.toString());
    }
}
