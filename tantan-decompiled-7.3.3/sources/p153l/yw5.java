package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class yw5 implements azm {

    /* JADX INFO: renamed from: a */
    public final rg50 f201787a;

    public yw5(rg50 rg50Var) {
        this.f201787a = rg50Var;
    }

    @Override // p153l.azm
    public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
        tmc0 tmc0Var = (tmc0) interfaceC15867a;
        x1d0 x1d0VarRequest = tmc0Var.request();
        oij0 oij0VarM191726d = tmc0Var.m191726d();
        return tmc0Var.m191725c(x1d0VarRequest, oij0VarM191726d, oij0VarM191726d.m167786k(interfaceC15867a, !x1d0VarRequest.m209022g().equals("GET")));
    }
}
