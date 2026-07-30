package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.AwardCounterDataEnvelope;
import l.j760;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class omb extends ax6 {
    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ j760 m20708f3(AwardCounterDataEnvelope awardCounterDataEnvelope) {
        return new j760(Integer.valueOf(awardCounterDataEnvelope.data.awardCount), Integer.valueOf(awardCounterDataEnvelope.data.showCount));
    }

    /* JADX INFO: renamed from: g3 */
    public c<Integer> m20709g3() {
        return CoreModule.f1534c.scheduled("user-vungle-award", 0, new v9j() { // from class: l.lmb
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.nmb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3221e(CoreModule.m1850H().userId())).f().b();
                    }
                }, AwardCounterDataEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.mmb
            public final Object call(Object obj) {
                return Integer.valueOf(((AwardCounterDataEnvelope) obj).data.awardCount);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public c<j760<Integer, Integer>> m20710h3() {
        return CoreModule.f1534c.scheduled("user-vungle-count", 0, new v9j() { // from class: l.imb
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.kmb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3225f(CoreModule.m1850H().userId())).f().b();
                    }
                }, AwardCounterDataEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.jmb
            public final Object call(Object obj) {
                return omb.m20708f3((AwardCounterDataEnvelope) obj);
            }
        });
    }
}
