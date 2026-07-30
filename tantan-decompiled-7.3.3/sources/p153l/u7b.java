package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.Envelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class u7b extends dy6 {

    /* JADX INFO: renamed from: R */
    public jxd0 f177890R;

    public u7b(C4883c c4883c) {
        super(c4883c);
        this.f177890R = new jxd0("showTantanVerificationRedDot", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ uxj0 m194840b3(Envelope envelope) {
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ C22421c m194841c3(final String str) {
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, "");
        return new ti20(new pcj() { // from class: l.s7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32353s2(CoreModule.m30929H().userId(), str)).m209038l(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.t7b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u7b.m194840b3((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: d3 */
    public C22421c<uxj0> m194842d3(final String str) {
        return this.f91137Q.scheduled("cancel_tantan_id_card_info", -1, new pcj() { // from class: l.r7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return u7b.m194841c3(str);
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public C22421c<Boolean> m194843e3() {
        return this.f177890R.obs();
    }

    /* JADX INFO: renamed from: f3 */
    public void m194844f3(boolean z) {
        this.f177890R.put(Boolean.valueOf(z));
    }
}
