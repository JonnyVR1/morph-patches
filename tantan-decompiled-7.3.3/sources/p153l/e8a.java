package p153l;

import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class e8a extends dy6 {
    public e8a(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ PendingPaymentGuidance m119808a3(Envelope envelope) {
        if (NullChecker.m82486a(envelope)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).pendingPaymentGuidance;
        }
        return null;
    }

    /* JADX INFO: renamed from: d3 */
    public C22421c<PendingPaymentGuidance> m119811d3() {
        return this.f91137Q.scheduled("get_pending_payment_guidance", 0, new pcj() { // from class: l.b8a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.c8a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32352s1()).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.d8a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return e8a.m119808a3((Envelope) obj);
                    }
                });
            }
        });
    }
}
