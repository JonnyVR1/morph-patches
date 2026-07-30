package p149l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class u30 {

    /* JADX INFO: renamed from: a */
    public Object f173563a;

    /* JADX INFO: renamed from: b */
    public boolean f173564b;

    /* JADX INFO: renamed from: l.u30$a */
    public interface InterfaceC20342a {
        /* JADX INFO: renamed from: a */
        boolean mo346a(u30 u30Var, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        boolean mo347b(u30 u30Var, Menu menu);

        /* JADX INFO: renamed from: c */
        boolean mo348c(u30 u30Var, Menu menu);

        /* JADX INFO: renamed from: d */
        void mo349d(u30 u30Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo108669a();

    /* JADX INFO: renamed from: b */
    public abstract View mo108670b();

    /* JADX INFO: renamed from: c */
    public abstract Menu mo108671c();

    /* JADX INFO: renamed from: d */
    public abstract MenuInflater mo108672d();

    /* JADX INFO: renamed from: e */
    public abstract CharSequence mo108673e();

    /* JADX INFO: renamed from: f */
    public Object m191557f() {
        return this.f173563a;
    }

    /* JADX INFO: renamed from: g */
    public abstract CharSequence mo108674g();

    /* JADX INFO: renamed from: h */
    public boolean m191558h() {
        return this.f173564b;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo108675i();

    /* JADX INFO: renamed from: j */
    public boolean mo108676j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo108677k(View view);

    /* JADX INFO: renamed from: l */
    public abstract void mo108678l(int i);

    /* JADX INFO: renamed from: m */
    public abstract void mo108679m(CharSequence charSequence);

    /* JADX INFO: renamed from: n */
    public void m191559n(Object obj) {
        this.f173563a = obj;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo108680o(int i);

    /* JADX INFO: renamed from: p */
    public abstract void mo108681p(CharSequence charSequence);

    /* JADX INFO: renamed from: q */
    public void mo108682q(boolean z) {
        this.f173564b = z;
    }
}
