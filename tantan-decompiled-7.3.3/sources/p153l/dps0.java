package p153l;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dps0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        try {
            klw0.m150399k(wit0Var.getContext()).m150402l();
            llw0.m154791j(wit0Var.getContext()).m154793k();
        } catch (IOException e) {
            bxy0.m106933q().m120275w(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
