package p149l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class xgg0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f192770a;

    public xgg0(h8g0 h8g0Var) {
        this.f192770a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        kdg0 kdg0Var;
        t6g0 t6g0Var;
        qkg0.m175377c("WXGame", "触发了：GameViewOnAttachedToWindowReload");
        icg0 icg0Var = this.f192770a.f106417h;
        if (icg0Var == null || (kdg0Var = icg0Var.f112462a.f92924h) == null || (t6g0Var = ((oqg0) kdg0Var).f145150m) == null) {
            return;
        }
        ThreadUtils.getUIHandler().post(new vlg0(t6g0Var));
    }
}
