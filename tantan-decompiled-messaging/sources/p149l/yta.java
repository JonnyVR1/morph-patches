package p149l;

import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class yta extends ax6 {
    public yta(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<RecentContractInfosEnvelope> m216000c3() {
        return this.f72126Q.scheduled("get_recent_contract_infos", 0, new v9j() { // from class: l.wta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.xta
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/recent-contract/infos")).m185887f().m185883b();
                    }
                }, RecentContractInfosEnvelope.JSON_ADAPTER);
            }
        });
    }
}
