package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.AwardCounterDataEnvelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class omb extends ax6 {
    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ j760 m165031f3(AwardCounterDataEnvelope awardCounterDataEnvelope) {
        return new j760(Integer.valueOf(awardCounterDataEnvelope.data.awardCount), Integer.valueOf(awardCounterDataEnvelope.data.showCount));
    }

    /* JADX INFO: renamed from: g3 */
    public C22306c<Integer> m165032g3() {
        return CoreModule.f17545c.scheduled("user-vungle-award", 0, new v9j() { // from class: l.lmb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.nmb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31291e(CoreModule.m29931H().userId())).m185887f().m185883b();
                    }
                }, AwardCounterDataEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.mmb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((AwardCounterDataEnvelope) obj).data.awardCount);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<j760<Integer, Integer>> m165033h3() {
        return CoreModule.f17545c.scheduled("user-vungle-count", 0, new v9j() { // from class: l.imb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.kmb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31295f(CoreModule.m29931H().userId())).m185887f().m185883b();
                    }
                }, AwardCounterDataEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.jmb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return omb.m165031f3((AwardCounterDataEnvelope) obj);
            }
        });
    }
}
