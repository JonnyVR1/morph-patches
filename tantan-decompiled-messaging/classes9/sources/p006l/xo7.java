package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p1.mobile.putong.core.data.ConstellationDataEnvelope;
import kotlin.Metadata;
import l.hpd0;
import l.stc0;
import l.v9j;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll/xo7;", "Ll/ax6;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/ConstellationDataEnvelope;", "f3", "()Lrx/c;", "Ll/zpd0;", "R", "Ll/zpd0;", "e3", "()Ll/zpd0;", "zodiacDay", "Ll/hpd0;", "S", "Ll/hpd0;", "c3", "()Ll/hpd0;", "reject", "Lrx/subjects/a;", "", "T", "Lrx/subjects/a;", "d3", "()Lrx/subjects/a;", "zodiacConfigIsInitBs", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xo7 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final zpd0 zodiacDay = new zpd0("zodiac_day" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final hpd0 reject = new hpd0("reject_zodiac" + CoreModule.m1850H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final a<Boolean> zodiacConfigIsInitBs;

    public xo7() {
        a<Boolean> aVarB = a.b();
        aVarB.getClass();
        this.zodiacConfigIsInitBs = aVarB;
    }

    /* JADX INFO: renamed from: b3 */
    public static c m27426b3() {
        return ia20.m16569c(new v9j() { // from class: l.wo7
            public final Object call() {
                return xo7.m27427g3();
            }
        }, ConstellationDataEnvelope.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: g3 */
    public static final stc0 m27427g3() {
        return C0154a.f3483P.auth().q(C0154a.m3185U1(CoreModule.m1850H().userId(), String.valueOf(qib0.f19808f0))).f().b();
    }

    @NotNull
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final hpd0 getReject() {
        return this.reject;
    }

    @NotNull
    /* JADX INFO: renamed from: d3 */
    public final a<Boolean> m27429d3() {
        return this.zodiacConfigIsInitBs;
    }

    @NotNull
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final zpd0 getZodiacDay() {
        return this.zodiacDay;
    }

    @NotNull
    /* JADX INFO: renamed from: f3 */
    public final c<ConstellationDataEnvelope> m27431f3() {
        c<ConstellationDataEnvelope> cVarScheduled = CoreModule.f1534c.scheduled("user-zodiac-recommend", 0, new v9j() { // from class: l.vo7
            public final Object call() {
                return xo7.m27426b3();
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }
}
