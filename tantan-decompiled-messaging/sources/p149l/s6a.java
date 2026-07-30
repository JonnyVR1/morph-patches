package p149l;

import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class s6a extends ax6 {
    public s6a(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ PendingPaymentGuidance m182442a3(Envelope envelope) {
        if (NullChecker.m81303a(envelope)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).pendingPaymentGuidance;
        }
        return null;
    }

    /* JADX INFO: renamed from: d3 */
    public C22306c<PendingPaymentGuidance> m182445d3() {
        return this.f72126Q.scheduled("get_pending_payment_guidance", 0, new v9j() { // from class: l.p6a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.q6a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31349s1()).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.r6a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return s6a.m182442a3((Envelope) obj);
                    }
                });
            }
        });
    }
}
