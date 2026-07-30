package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.ConstellationDataEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/xo7;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/ConstellationDataEnvelope;", "f3", "()Lrx/c;", "Ll/zpd0;", "R", "Ll/zpd0;", "e3", "()Ll/zpd0;", "zodiacDay", "Ll/hpd0;", j6f.LATITUDE_SOUTH, "Ll/hpd0;", "c3", "()Ll/hpd0;", "reject", "Lrx/subjects/a;", "", j6f.GPS_DIRECTION_TRUE, "Lrx/subjects/a;", "d3", "()Lrx/subjects/a;", "zodiacConfigIsInitBs", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xo7 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final zpd0 zodiacDay = new zpd0("zodiac_day" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final hpd0 reject = new hpd0("reject_zodiac" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final C22392a<Boolean> zodiacConfigIsInitBs;

    public xo7() {
        C22392a<Boolean> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.zodiacConfigIsInitBs = c22392aM221512b;
    }

    /* JADX INFO: renamed from: b3 */
    public static C22306c m210249b3() {
        return ia20.m135119c(new v9j() { // from class: l.wo7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xo7.m210250g3();
            }
        }, ConstellationDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: g3 */
    public static final stc0 m210250g3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31255U1(CoreModule.m29931H().userId(), String.valueOf(qib0.f154717f0))).m185887f().m185883b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final hpd0 getReject() {
        return this.reject;
    }

    @NotNull
    /* JADX INFO: renamed from: d3 */
    public final C22392a<Boolean> m210252d3() {
        return this.zodiacConfigIsInitBs;
    }

    @NotNull
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final zpd0 getZodiacDay() {
        return this.zodiacDay;
    }

    @NotNull
    /* JADX INFO: renamed from: f3 */
    public final C22306c<ConstellationDataEnvelope> m210254f3() {
        C22306c<ConstellationDataEnvelope> c22306cScheduled = CoreModule.f17545c.scheduled("user-zodiac-recommend", 0, new v9j() { // from class: l.vo7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xo7.m210249b3();
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }
}
