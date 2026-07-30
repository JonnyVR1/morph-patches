package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class cnj0 extends llj0<dnj0> {
    public cnj0(bsm<? extends nnn0> bsmVar, VFrame vFrame, gmj0 gmj0Var) {
        super(bsmVar);
        this.f128714i = gmj0Var;
        mo51532C(new dnj0(vFrame));
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m107802N3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m107804P3(String str) {
        duringCreated(klj0.m146416n(((nnn0) m206027E2()).m149814k(), str, "stopSpeak")).subscribe(ffw.m121194e(new e30() { // from class: l.anj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70743a.m107805R3((BLiveUndercoverGame) obj);
            }
        }, new e30() { // from class: l.bnj0
            @Override // p149l.e30
            public final void call(Object obj) {
                cnj0.m107802N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m107805R3(BLiveUndercoverGame bLiveUndercoverGame) {
        m150494J3().m127023x4(bLiveUndercoverGame);
    }
}
