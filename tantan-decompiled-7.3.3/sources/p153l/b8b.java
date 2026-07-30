package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.TarotDataEnvelope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\u0007R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Ll/b8b;", "Ll/dy6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;", "m3", "()Lrx/c;", "g3", "o3", "Ll/byd0;", "R", "Ll/byd0;", "l3", "()Ll/byd0;", "tarotDay", "Ll/jxd0;", p7f.LATITUDE_SOUTH, "Ll/jxd0;", "j3", "()Ll/jxd0;", "reject", p7f.GPS_DIRECTION_TRUE, "Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;", "k3", "()Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;", "r3", "(Lcom/p1/mobile/putong/core/data/TarotDataEnvelope;)V", "tarotDataEnvelope", "", "U", "I", "i3", "()I", "q3", "(I)V", "cardType", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class b8b extends dy6 {

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public TarotDataEnvelope tarotDataEnvelope;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final byd0 tarotDay = new byd0("tarot_day" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final jxd0 reject = new jxd0("reject_tarot" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int cardType = -1;

    /* JADX INFO: renamed from: a3 */
    public static C22421c m102938a3() {
        return qi20.m176656c(new pcj() { // from class: l.w7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b8b.m102945n3();
            }
        }, TarotDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: b3 */
    public static C22421c m102939b3() {
        return qi20.m176656c(new pcj() { // from class: l.a8b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b8b.m102944h3();
            }
        }, TarotDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: c3 */
    public static C22421c m102940c3() {
        return qi20.m176656c(new pcj() { // from class: l.z7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b8b.m102946p3();
            }
        }, TarotDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h3 */
    public static final x1d0 m102944h3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32211I(CoreModule.m30929H().userId(), String.valueOf(uqb0.f180400f0))).m209032f().m209028b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final x1d0 m102945n3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32197E1(CoreModule.m30929H().userId())).m209032f().m209028b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final x1d0 m102946p3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32254T1(CoreModule.m30929H().userId(), String.valueOf(uqb0.f180400f0))).m209032f().m209028b();
    }

    @NotNull
    /* JADX INFO: renamed from: g3 */
    public final C22421c<TarotDataEnvelope> m102947g3() {
        C22421c<TarotDataEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("user-tarot-create", 0, new pcj() { // from class: l.y7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b8b.m102939b3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: i3, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    /* JADX INFO: renamed from: j3, reason: from getter */
    public final jxd0 getReject() {
        return this.reject;
    }

    @NotNull
    /* JADX INFO: renamed from: k3 */
    public final TarotDataEnvelope m102950k3() {
        TarotDataEnvelope tarotDataEnvelope = this.tarotDataEnvelope;
        if (tarotDataEnvelope != null) {
            return tarotDataEnvelope;
        }
        Intrinsics.m88391r("tarotDataEnvelope");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final byd0 getTarotDay() {
        return this.tarotDay;
    }

    @NotNull
    /* JADX INFO: renamed from: m3 */
    public final C22421c<TarotDataEnvelope> m102952m3() {
        C22421c<TarotDataEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("user-tarot-query", 0, new pcj() { // from class: l.v7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b8b.m102938a3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22421c<TarotDataEnvelope> m102953o3() {
        C22421c<TarotDataEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("user-tarot-recommend", 0, new pcj() { // from class: l.x7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return b8b.m102940c3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m102954q3(int i) {
        this.cardType = i;
    }

    /* JADX INFO: renamed from: r3 */
    public final void m102955r3(@NotNull TarotDataEnvelope tarotDataEnvelope) {
        tarotDataEnvelope.getClass();
        this.tarotDataEnvelope = tarotDataEnvelope;
    }
}
