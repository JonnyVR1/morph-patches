package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.ConstellationDataEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/bq7;", "Ll/dy6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/ConstellationDataEnvelope;", "f3", "()Lrx/c;", "Ll/byd0;", "R", "Ll/byd0;", "e3", "()Ll/byd0;", "zodiacDay", "Ll/jxd0;", p7f.LATITUDE_SOUTH, "Ll/jxd0;", "c3", "()Ll/jxd0;", "reject", "Lrx/subjects/a;", "", p7f.GPS_DIRECTION_TRUE, "Lrx/subjects/a;", "d3", "()Lrx/subjects/a;", "zodiacConfigIsInitBs", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bq7 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final byd0 zodiacDay = new byd0("zodiac_day" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final jxd0 reject = new jxd0("reject_zodiac" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final C22507a<Boolean> zodiacConfigIsInitBs;

    public bq7() {
        C22507a<Boolean> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.zodiacConfigIsInitBs = c22507aM222758b;
    }

    /* JADX INFO: renamed from: b3 */
    public static C22421c m105878b3() {
        return qi20.m176656c(new pcj() { // from class: l.aq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return bq7.m105879g3();
            }
        }, ConstellationDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: g3 */
    public static final x1d0 m105879g3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32258U1(CoreModule.m30929H().userId(), String.valueOf(uqb0.f180400f0))).m209032f().m209028b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final jxd0 getReject() {
        return this.reject;
    }

    @NotNull
    /* JADX INFO: renamed from: d3 */
    public final C22507a<Boolean> m105881d3() {
        return this.zodiacConfigIsInitBs;
    }

    @NotNull
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final byd0 getZodiacDay() {
        return this.zodiacDay;
    }

    @NotNull
    /* JADX INFO: renamed from: f3 */
    public final C22421c<ConstellationDataEnvelope> m105883f3() {
        C22421c<ConstellationDataEnvelope> c22421cScheduled = CoreModule.f18264c.scheduled("user-zodiac-recommend", 0, new pcj() { // from class: l.zp7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return bq7.m105878b3();
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }
}
