package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tv5 implements axm {

    /* JADX INFO: renamed from: a */
    public final k850 f172252a;

    public tv5(k850 k850Var) {
        this.f172252a = k850Var;
    }

    @Override // p149l.axm
    public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
        mec0 mec0Var = (mec0) interfaceC15754a;
        stc0 stc0VarRequest = mec0Var.request();
        k9j0 k9j0VarM154179d = mec0Var.m154179d();
        return mec0Var.m154178c(stc0VarRequest, k9j0VarM154179d, k9j0VarM154179d.m145094k(interfaceC15754a, !stc0VarRequest.m185877g().equals("GET")));
    }
}
