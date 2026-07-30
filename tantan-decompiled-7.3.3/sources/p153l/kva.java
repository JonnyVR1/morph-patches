package p153l;

import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class kva extends dy6 {
    public kva(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<RecentContractInfosEnvelope> m151659c3() {
        return this.f91137Q.scheduled("get_recent_contract_infos", 0, new pcj() { // from class: l.iva
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.jva
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/recent-contract/infos")).m209032f().m209028b();
                    }
                }, RecentContractInfosEnvelope.JSON_ADAPTER);
            }
        });
    }
}
