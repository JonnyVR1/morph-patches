package p153l;

import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.IntlContractInfosEnvelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class ta9 extends dy6 {
    public ta9(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<IntlContractInfosEnvelope> m189807c3() {
        return this.f91137Q.scheduled("get_intl_contract_infos", 0, new pcj() { // from class: l.ra9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.sa9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/users/me/renewable/intl-contractInfos")).m209032f().m209028b();
                    }
                }, IntlContractInfosEnvelope.JSON_ADAPTER);
            }
        });
    }
}
