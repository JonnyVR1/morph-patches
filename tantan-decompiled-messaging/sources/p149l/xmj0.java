package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class xmj0 extends llj0<ymj0> {
    public xmj0(bsm<? extends nnn0> bsmVar, VFrame vFrame, gmj0 gmj0Var) {
        super(bsmVar);
        this.f128714i = gmj0Var;
        mo51532C(new ymj0(vFrame));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m210139R3(BLiveUndercoverGame bLiveUndercoverGame) {
        m150494J3().m127023x4(bLiveUndercoverGame);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m210140S3(Throwable th) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((ymj0) v2).m98403p();
        }
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151565C(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m210141T3() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((ymj0) v2).m98403p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public void m210142U3(String str) {
        duringCreated(klj0.m146416n(((nnn0) m206027E2()).m149814k(), str, "restart")).subscribe(ffw.m121195f(new e30() { // from class: l.umj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177261a.m210139R3((BLiveUndercoverGame) obj);
            }
        }, new e30() { // from class: l.vmj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182119a.m210140S3((Throwable) obj);
            }
        }, new d30() { // from class: l.wmj0
            @Override // p149l.d30
            public final void call() {
                this.f187077a.m210141T3();
            }
        }));
    }
}
