package p006l;

import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.IntlContractInfosEnvelope;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class k99 extends ax6 {
    public k99(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: c3 */
    public c<IntlContractInfosEnvelope> m17994c3() {
        return this.f8580Q.scheduled("get_intl_contract_infos", 0, new v9j() { // from class: l.i99
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.j99
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/users/me/renewable/intl-contractInfos")).f().b();
                    }
                }, IntlContractInfosEnvelope.JSON_ADAPTER);
            }
        });
    }
}
