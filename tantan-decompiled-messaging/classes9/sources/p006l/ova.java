package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.stc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ll/ova;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "d3", "()Lrx/c;", "R", "Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "c3", "()Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "f3", "(Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;)V", "seeBlindBoxEnvelope", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ova extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public SeeBlindBoxEnvelope seeBlindBoxEnvelope;

    /* JADX INFO: renamed from: a3 */
    public static c m20826a3() {
        return ia20.m16569c(new v9j() { // from class: l.nva
            public final Object call() {
                return ova.m20828e3();
            }
        }, SeeBlindBoxEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: e3 */
    public static final stc0 m20828e3() {
        return C0154a.f3483P.auth().q(C0154a.m3120D1(CoreModule.m1850H().userId())).f().b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3 */
    public final SeeBlindBoxEnvelope m20829c3() {
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = this.seeBlindBoxEnvelope;
        if (seeBlindBoxEnvelope != null) {
            return seeBlindBoxEnvelope;
        }
        Intrinsics.r("seeBlindBoxEnvelope");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d3 */
    public final c<SeeBlindBoxEnvelope> m20830d3() {
        c<SeeBlindBoxEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("user-see-blind-box-query", 0, new v9j() { // from class: l.mva
            public final Object call() {
                return ova.m20826a3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m20831f3(@NotNull SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
        seeBlindBoxEnvelope.getClass();
        this.seeBlindBoxEnvelope = seeBlindBoxEnvelope;
    }
}
