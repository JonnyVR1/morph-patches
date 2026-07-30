package p006l;

import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yta extends ax6 {
    public yta(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: c3 */
    public c<RecentContractInfosEnvelope> m28393c3() {
        return this.f8580Q.scheduled("get_recent_contract_infos", 0, new v9j() { // from class: l.wta
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.xta
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/recent-contract/infos")).f().b();
                    }
                }, RecentContractInfosEnvelope.JSON_ADAPTER);
            }
        });
    }
}
