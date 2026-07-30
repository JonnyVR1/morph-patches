package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.AwardCounterDataEnvelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class cob extends dy6 {
    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ pf60 m111579f3(AwardCounterDataEnvelope awardCounterDataEnvelope) {
        return new pf60(Integer.valueOf(awardCounterDataEnvelope.data.awardCount), Integer.valueOf(awardCounterDataEnvelope.data.showCount));
    }

    /* JADX INFO: renamed from: g3 */
    public C22421c<Integer> m111580g3() {
        return CoreModule.f18264c.scheduled("user-vungle-award", 0, new pcj() { // from class: l.znb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.bob
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32294e(CoreModule.m30929H().userId())).m209032f().m209028b();
                    }
                }, AwardCounterDataEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.aob
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((AwardCounterDataEnvelope) obj).data.awardCount);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<pf60<Integer, Integer>> m111581h3() {
        return CoreModule.f18264c.scheduled("user-vungle-count", 0, new pcj() { // from class: l.wnb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.ynb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32298f(CoreModule.m30929H().userId())).m209032f().m209028b();
                    }
                }, AwardCounterDataEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.xnb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cob.m111579f3((AwardCounterDataEnvelope) obj);
            }
        });
    }
}
