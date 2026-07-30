package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.stc0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.w9j;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ll/jj9;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "u3", "()V", "y3", "q3", "", "m3", "()J", "Lrx/c;", "", "o3", "()Lrx/c;", "n3", "()Ljava/lang/String;", "", "R", "Z", "p3", "()Z", "setGoodSeeTrialUser", "(Z)V", "isGoodSeeTrialUser", "Ll/zpd0;", "S", "Ll/zpd0;", "seeTrialRecoverEndTime", "Ll/uqd0;", "T", "Ll/uqd0;", "seeTrialStatusLocal", "Lrx/subjects/a;", "U", "Lrx/subjects/a;", "seeTrialStatusSub", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jj9 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean isGoodSeeTrialUser;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public zpd0 seeTrialRecoverEndTime;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public uqd0 seeTrialStatusLocal;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final a<String> seeTrialStatusSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj9(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        this.seeTrialRecoverEndTime = new zpd0("core_limited_trial_see_recover_end_time_" + CoreModule.m1850H().userId(), 0L);
        this.seeTrialStatusLocal = new uqd0("core_limited_trial_see_status_" + CoreModule.m1850H().userId(), "waitToBuy");
        a<String> aVarC = a.c("waitToBuy");
        aVarC.getClass();
        this.seeTrialStatusSub = aVarC;
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m17458A3(jj9 jj9Var, Envelope envelope) {
        envelope.getClass();
        String str = envelope.data.getModuleData(CoreData.class).seeTrialStatus.status;
        str.getClass();
        jj9Var.seeTrialRecoverEndTime.put(Long.valueOf(envelope.data.getModuleData(CoreData.class).seeTrialStatus.expireAt));
        uqd0 uqd0Var = jj9Var.seeTrialStatusLocal;
        if (TextUtils.isEmpty(str)) {
            str = "waitToBuy";
        }
        uqd0Var.put(str);
        jj9Var.seeTrialStatusSub.onNext(jj9Var.seeTrialStatusLocal.get());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m17459B3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b3 */
    public static c m17461b3(final jj9 jj9Var) {
        c<Envelope> cVarM16567a = ia20.m16567a(new v9j() { // from class: l.ij9
            public final Object call() {
                return jj9.m17478z3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.yi9
            public final Object invoke(Object obj) {
                return jj9.m17458A3(this.f28218a, (Envelope) obj);
            }
        };
        return cVarM16567a.map(new w9j() { // from class: l.zi9
            public final Object call(Object obj) {
                return jj9.m17459B3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: c3 */
    public static c m17462c3(final jj9 jj9Var) {
        c<Envelope> cVarM16567a = ia20.m16567a(new v9j() { // from class: l.cj9
            public final Object call() {
                return jj9.m17472r3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.dj9
            public final Object invoke(Object obj) {
                return jj9.m17473s3(this.f10423a, (Envelope) obj);
            }
        };
        return cVarM16567a.map(new w9j() { // from class: l.ej9
            public final Object call(Object obj) {
                return jj9.m17474t3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static c m17469j3(final jj9 jj9Var) {
        c<Envelope> cVarM16567a = ia20.m16567a(new v9j() { // from class: l.fj9
            public final Object call() {
                return jj9.m17475v3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.gj9
            public final Object invoke(Object obj) {
                return jj9.m17476w3(this.f13337a, (Envelope) obj);
            }
        };
        return cVarM16567a.map(new w9j() { // from class: l.hj9
            public final Object call(Object obj) {
                return jj9.m17477x3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static final stc0 m17472r3() {
        return C0154a.f3483P.auth().q(C0154a.m3212b2()).l(utc0.create(Network.JSON, "")).b();
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m17473s3(jj9 jj9Var, Envelope envelope) {
        envelope.getClass();
        jj9Var.seeTrialRecoverEndTime.put(Long.valueOf(envelope.data.getModuleData(CoreData.class).seeTrialEligible.expireAt));
        jj9Var.m17485y3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m17474t3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static final stc0 m17475v3() {
        return C0154a.f3483P.auth().q(C0154a.m3204Z1()).f().b();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m17476w3(jj9 jj9Var, Envelope envelope) {
        envelope.getClass();
        jj9Var.isGoodSeeTrialUser = envelope.data.getModuleData(CoreData.class).seeTrialEligible.eligible;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m17477x3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final stc0 m17478z3() {
        return C0154a.f3483P.auth().q(C0154a.m3208a2()).f().b();
    }

    /* JADX INFO: renamed from: m3 */
    public final long m17479m3() {
        return ((Number) this.seeTrialRecoverEndTime.get()).longValue() * 1000;
    }

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final String m17480n3() {
        Object obj = this.seeTrialStatusLocal.get();
        obj.getClass();
        return (String) obj;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final c<String> m17481o3() {
        c<String> cVarAsObservable = this.seeTrialStatusSub.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final boolean getIsGoodSeeTrialUser() {
        return this.isGoodSeeTrialUser;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m17483q3() {
        this.f8580Q.scheduled("limited_trial_see_wait_start_query", -1, new v9j() { // from class: l.xi9
            public final Object call() {
                return jj9.m17462c3(this.f27526a);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m17484u3() {
        if (!CoreModule.m1854P().m11706a().m5331Qb() || CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            return;
        }
        this.f8580Q.scheduled("limited_trial_see_eligible_query", 0, new v9j() { // from class: l.aj9
            public final Object call() {
                return jj9.m17469j3(this.f8279a);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final void m17485y3() {
        if (CoreModule.m1854P().m11706a().m5331Qb()) {
            this.f8580Q.scheduled("limited_trial_see_status_query", 0, new v9j() { // from class: l.bj9
                public final Object call() {
                    return jj9.m17461b3(this.f8925a);
                }
            });
        } else {
            this.seeTrialStatusLocal.put("expired");
            this.seeTrialStatusSub.onNext(m17480n3());
        }
    }
}
