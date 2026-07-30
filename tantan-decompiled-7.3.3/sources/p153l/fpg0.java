package p153l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class fpg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f100128a;

    public fpg0(pgg0 pgg0Var) {
        this.f100128a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        slg0 slg0Var;
        bfg0 bfg0Var;
        ysg0.m217257c("WXGame", "触发了：GameViewOnAttachedToWindowReload");
        qkg0 qkg0Var = this.f100128a.f152271h;
        if (qkg0Var == null || (slg0Var = qkg0Var.f158136a.f139516h) == null || (bfg0Var = ((wyg0) slg0Var).f191652m) == null) {
            return;
        }
        ThreadUtils.getUIHandler().post(new dug0(bfg0Var));
    }
}
