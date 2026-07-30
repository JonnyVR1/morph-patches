package p149l;

import android.content.Context;
import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ifi0<T> extends xwl<T> {

    /* JADX INFO: renamed from: c */
    public o3m f113024c;

    /* JADX INFO: renamed from: d */
    public boolean f113025d;

    /* JADX INFO: renamed from: f */
    public Context f113027f;

    /* JADX INFO: renamed from: g */
    public uei0 f113028g;

    /* JADX INFO: renamed from: b */
    public int f113023b = -1;

    /* JADX INFO: renamed from: e */
    public volatile boolean f113026e = false;

    @Override // p149l.xwl
    /* JADX INFO: renamed from: g */
    public boolean mo135923g() {
        return this.f113025d;
    }

    /* JADX INFO: renamed from: i */
    public final int m135924i(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length != 2) {
            return 0;
        }
        try {
            if (j7c.m140088g(str2)) {
                return Integer.valueOf(strArrSplit[1]).intValue();
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo81141j();

    /* JADX INFO: renamed from: k */
    public abstract o3m mo81142k();

    /* JADX INFO: renamed from: l */
    public abstract uei0 mo81143l();

    /* JADX INFO: renamed from: m */
    public void mo81144m() {
        this.f113025d = true;
    }

    /* JADX INFO: renamed from: n */
    public void m135925n(Context context) {
        this.f113027f = context;
        this.f113024c = mo81142k();
        nt2.m160825p().m202319j();
        uei0 uei0VarMo81143l = mo81143l();
        this.f113028g = uei0VarMo81143l;
        if (uei0VarMo81143l == null || !uei0VarMo81143l.mo157366b()) {
            mo81144m();
            return;
        }
        mo81144m();
        if (this.f113028g.mo157365a()) {
            mo81146r();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m135926o() {
        if (this.f113023b == -1) {
            this.f113023b = m135924i(ai80.m96792a(nt2.m160814e(), mo81141j(), ""));
        }
        this.f113026e = this.f113023b < mo81145p();
        return this.f113026e;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo81145p();

    @CallSuper
    /* JADX INFO: renamed from: q */
    public void m135927q(efi0 efi0Var) {
        m135928s();
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo81146r();

    /* JADX INFO: renamed from: s */
    public final void m135928s() {
        StringBuilder sb = new StringBuilder();
        sb.append(j7c.m140084c());
        sb.append("_");
        int i = this.f113023b + 1;
        this.f113023b = i;
        sb.append(i);
        ai80.m96793b(nt2.m160814e(), mo81141j(), sb.toString());
    }
}
