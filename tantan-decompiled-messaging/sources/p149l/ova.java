package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/ova;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "d3", "()Lrx/c;", "R", "Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "c3", "()Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "f3", "(Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;)V", "seeBlindBoxEnvelope", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ova extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public SeeBlindBoxEnvelope seeBlindBoxEnvelope;

    /* JADX INFO: renamed from: a3 */
    public static C22306c m166162a3() {
        return ia20.m135119c(new v9j() { // from class: l.nva
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ova.m166164e3();
            }
        }, SeeBlindBoxEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: e3 */
    public static final stc0 m166164e3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31190D1(CoreModule.m29931H().userId())).m185887f().m185883b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3 */
    public final SeeBlindBoxEnvelope m166165c3() {
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = this.seeBlindBoxEnvelope;
        if (seeBlindBoxEnvelope != null) {
            return seeBlindBoxEnvelope;
        }
        Intrinsics.m87502r("seeBlindBoxEnvelope");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d3 */
    public final C22306c<SeeBlindBoxEnvelope> m166166d3() {
        C22306c<SeeBlindBoxEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("user-see-blind-box-query", 0, new v9j() { // from class: l.mva
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ova.m166162a3();
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m166167f3(@NotNull SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
        seeBlindBoxEnvelope.getClass();
        this.seeBlindBoxEnvelope = seeBlindBoxEnvelope;
    }
}
