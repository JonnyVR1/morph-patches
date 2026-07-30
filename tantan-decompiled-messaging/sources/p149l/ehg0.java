package p149l;

import org.seamless.statemachine.StateMachineInvocationHandler;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class ehg0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f91325a;

    public ehg0(h8g0 h8g0Var) {
        this.f91325a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        this.f91325a.m129889a();
        if (this.f91325a.f106417h != null) {
            LogUtils.file("SUDRealSudFSTAPPImpl", StateMachineInvocationHandler.METHOD_ON_EXIT);
            SudLogger.m221565d(erg0.f92914k, StateMachineInvocationHandler.METHOD_ON_EXIT);
        }
    }
}
