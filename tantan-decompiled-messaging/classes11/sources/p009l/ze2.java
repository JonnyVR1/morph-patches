package p009l;

import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.f0m;
import l.j0m;
import l.l0m;
import l.szd;
import l.uc80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ze2 extends szd implements l0m, j0m {

    /* JADX INFO: renamed from: j */
    public Act f23621j;

    /* JADX INFO: renamed from: k */
    public f0m f23622k;

    public ze2(Act act) {
        super(act, false, 0);
        this.f23621j = act;
    }

    /* JADX INFO: renamed from: E */
    public boolean m25751E() {
        if (!NullChecker.a(this.f23621j) || this.f23621j.isFinishing() || this.f23621j.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m25752a() {
        return m25751E();
    }

    public void dismiss() {
        super.dismiss();
        if (NullChecker.a(this.f23622k)) {
            this.f23622k.a(this);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m25754h(uc80 uc80Var) {
        return m25751E();
    }

    /* JADX INFO: renamed from: i */
    public void m25755i(f0m f0mVar) {
        this.f23622k = f0mVar;
    }

    /* JADX INFO: renamed from: n */
    public void m25756n(boolean z) {
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public void m25753f(boolean z) {
    }
}
