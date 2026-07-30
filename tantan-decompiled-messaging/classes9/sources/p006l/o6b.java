package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.TarotDataEnvelope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.hpd0;
import l.stc0;
import l.v9j;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\u0007R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ll/o6b;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;", "m3", "()Lrx/c;", "g3", "o3", "Ll/zpd0;", "R", "Ll/zpd0;", "l3", "()Ll/zpd0;", "tarotDay", "Ll/hpd0;", "S", "Ll/hpd0;", "j3", "()Ll/hpd0;", "reject", "T", "Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;", "k3", "()Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;", "r3", "(Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;)V", "tarotDataEnvelope", "", "U", "I", "i3", "()I", "q3", "(I)V", "cardType", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o6b extends ax6 {

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public TarotDataEnvelope tarotDataEnvelope;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final zpd0 tarotDay = new zpd0("tarot_day" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final hpd0 reject = new hpd0("reject_tarot" + CoreModule.m1850H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int cardType = -1;

    /* JADX INFO: renamed from: a3 */
    public static c m20349a3() {
        return ia20.m16569c(new v9j() { // from class: l.j6b
            public final Object call() {
                return o6b.m20356n3();
            }
        }, TarotDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: b3 */
    public static c m20350b3() {
        return ia20.m16569c(new v9j() { // from class: l.n6b
            public final Object call() {
                return o6b.m20355h3();
            }
        }, TarotDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static c m20351c3() {
        return ia20.m16569c(new v9j() { // from class: l.m6b
            public final Object call() {
                return o6b.m20357p3();
            }
        }, TarotDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static final stc0 m20355h3() {
        return C0154a.f3483P.auth().q(C0154a.m3138I(CoreModule.m1850H().userId(), String.valueOf(qib0.f19808f0))).f().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final stc0 m20356n3() {
        return C0154a.f3483P.auth().q(C0154a.m3124E1(CoreModule.m1850H().userId())).f().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final stc0 m20357p3() {
        return C0154a.f3483P.auth().q(C0154a.m3181T1(CoreModule.m1850H().userId(), String.valueOf(qib0.f19808f0))).f().b();
    }

    @NotNull
    /* JADX INFO: renamed from: g3 */
    public final c<TarotDataEnvelope> m20358g3() {
        c<TarotDataEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("user-tarot-create", 0, new v9j() { // from class: l.l6b
            public final Object call() {
                return o6b.m20350b3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: i3, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    /* JADX INFO: renamed from: j3, reason: from getter */
    public final hpd0 getReject() {
        return this.reject;
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final TarotDataEnvelope m20361k3() {
        TarotDataEnvelope tarotDataEnvelope = this.tarotDataEnvelope;
        if (tarotDataEnvelope != null) {
            return tarotDataEnvelope;
        }
        Intrinsics.r("tarotDataEnvelope");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final zpd0 getTarotDay() {
        return this.tarotDay;
    }

    @NotNull
    /* JADX INFO: renamed from: m3 */
    public final c<TarotDataEnvelope> m20363m3() {
        c<TarotDataEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("user-tarot-query", 0, new v9j() { // from class: l.i6b
            public final Object call() {
                return o6b.m20349a3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final c<TarotDataEnvelope> m20364o3() {
        c<TarotDataEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("user-tarot-recommend", 0, new v9j() { // from class: l.k6b
            public final Object call() {
                return o6b.m20351c3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m20365q3(int i) {
        this.cardType = i;
    }

    /* JADX INFO: renamed from: r3 */
    public final void m20366r3(@NotNull TarotDataEnvelope tarotDataEnvelope) {
        tarotDataEnvelope.getClass();
        this.tarotDataEnvelope = tarotDataEnvelope;
    }
}
