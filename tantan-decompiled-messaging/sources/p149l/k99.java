package p149l;

import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.IntlContractInfosEnvelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class k99 extends ax6 {
    public k99(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<IntlContractInfosEnvelope> m145030c3() {
        return this.f72126Q.scheduled("get_intl_contract_infos", 0, new v9j() { // from class: l.i99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.j99
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/users/me/renewable/intl-contractInfos")).m185887f().m185883b();
                    }
                }, IntlContractInfosEnvelope.JSON_ADAPTER);
            }
        });
    }
}
