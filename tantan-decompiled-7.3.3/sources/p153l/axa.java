package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.SeeBlindBoxEnvelope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/axa;", "Ll/dy6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "d3", "()Lrx/c;", "R", "Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "c3", "()Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;", "f3", "(Lcom/p1/mobile/putong/core/data/SeeBlindBoxEnvelope;)V", "seeBlindBoxEnvelope", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class axa extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public SeeBlindBoxEnvelope seeBlindBoxEnvelope;

    /* JADX INFO: renamed from: a3 */
    public static C22421c m100761a3() {
        return qi20.m176656c(new pcj() { // from class: l.zwa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return axa.m100763e3();
            }
        }, SeeBlindBoxEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: e3 */
    public static final x1d0 m100763e3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32193D1(CoreModule.m30929H().userId())).m209032f().m209028b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3 */
    public final SeeBlindBoxEnvelope m100764c3() {
        SeeBlindBoxEnvelope seeBlindBoxEnvelope = this.seeBlindBoxEnvelope;
        if (seeBlindBoxEnvelope != null) {
            return seeBlindBoxEnvelope;
        }
        Intrinsics.m88391r("seeBlindBoxEnvelope");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d3 */
    public final C22421c<SeeBlindBoxEnvelope> m100765d3() {
        C22421c<SeeBlindBoxEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("user-see-blind-box-query", 0, new pcj() { // from class: l.ywa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return axa.m100761a3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m100766f3(@NotNull SeeBlindBoxEnvelope seeBlindBoxEnvelope) {
        seeBlindBoxEnvelope.getClass();
        this.seeBlindBoxEnvelope = seeBlindBoxEnvelope;
    }
}
