package p006l;

import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class s6a extends ax6 {
    public s6a(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ PendingPaymentGuidance m23515a3(Envelope envelope) {
        if (NullChecker.a(envelope)) {
            return envelope.getModuleData(CoreData.class).pendingPaymentGuidance;
        }
        return null;
    }

    /* JADX INFO: renamed from: d3 */
    public c<PendingPaymentGuidance> m23518d3() {
        return this.f8580Q.scheduled("get_pending_payment_guidance", 0, new v9j() { // from class: l.p6a
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.q6a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3279s1()).f().b();
                    }
                }).map(new w9j() { // from class: l.r6a
                    public final Object call(Object obj) {
                        return s6a.m23515a3((Envelope) obj);
                    }
                });
            }
        });
    }
}
