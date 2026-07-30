package p153l;

import org.seamless.statemachine.StateMachineInvocationHandler;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class mpg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f137920a;

    public mpg0(pgg0 pgg0Var) {
        this.f137920a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        this.f137920a.m172230a();
        if (this.f137920a.f152271h != null) {
            LogUtils.file("SUDRealSudFSTAPPImpl", StateMachineInvocationHandler.METHOD_ON_EXIT);
            SudLogger.m222811d(mzg0.f139506k, StateMachineInvocationHandler.METHOD_ON_EXIT);
        }
    }
}
