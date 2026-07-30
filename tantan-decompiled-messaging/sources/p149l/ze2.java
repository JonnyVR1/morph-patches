package p149l;

import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ze2 extends szd implements l0m, j0m {

    /* JADX INFO: renamed from: j */
    public Act f202766j;

    /* JADX INFO: renamed from: k */
    public f0m f202767k;

    public ze2(Act act) {
        super(act, false, 0);
        this.f202766j = act;
    }

    /* JADX INFO: renamed from: E */
    public boolean m218268E() {
        if (!NullChecker.m81303a(this.f202766j) || this.f202766j.isFinishing() || this.f202766j.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: a */
    public boolean mo20860a() {
        return m218268E();
    }

    @Override // p149l.szd, android.app.Dialog, android.content.DialogInterface, p149l.vzd.InterfaceC20772b
    public void dismiss() {
        super.dismiss();
        if (NullChecker.m81303a(this.f202767k)) {
            this.f202767k.mo21109a(this);
        }
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo20867h(uc80 uc80Var) {
        return m218268E();
    }

    @Override // p149l.g0m
    /* JADX INFO: renamed from: i */
    public void mo20868i(f0m f0mVar) {
        this.f202767k = f0mVar;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        dismiss();
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
    }
}
