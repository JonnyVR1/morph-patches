package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p046p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/jj9;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "u3", "()V", "y3", "q3", "", "m3", "()J", "Lrx/c;", "", "o3", "()Lrx/c;", "n3", "()Ljava/lang/String;", "", "R", "Z", "p3", "()Z", "setGoodSeeTrialUser", "(Z)V", "isGoodSeeTrialUser", "Ll/zpd0;", j6f.LATITUDE_SOUTH, "Ll/zpd0;", "seeTrialRecoverEndTime", "Ll/uqd0;", j6f.GPS_DIRECTION_TRUE, "Ll/uqd0;", "seeTrialStatusLocal", "Lrx/subjects/a;", "U", "Lrx/subjects/a;", "seeTrialStatusSub", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final C22392a<String> seeTrialStatusSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj9(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        this.seeTrialRecoverEndTime = new zpd0("core_limited_trial_see_recover_end_time_" + CoreModule.m29931H().userId(), 0L);
        this.seeTrialStatusLocal = new uqd0("core_limited_trial_see_status_" + CoreModule.m29931H().userId(), SeeTrialStatusType.waitToBuy);
        C22392a<String> c22392aM221513c = C22392a.m221513c(SeeTrialStatusType.waitToBuy);
        c22392aM221513c.getClass();
        this.seeTrialStatusSub = c22392aM221513c;
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m141755A3(jj9 jj9Var, Envelope envelope) {
        envelope.getClass();
        String str = ((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialStatus.status;
        str.getClass();
        jj9Var.seeTrialRecoverEndTime.put(Long.valueOf(((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialStatus.expireAt));
        uqd0 uqd0Var = jj9Var.seeTrialStatusLocal;
        if (TextUtils.isEmpty(str)) {
            str = SeeTrialStatusType.waitToBuy;
        }
        uqd0Var.put(str);
        jj9Var.seeTrialStatusSub.m132487l(jj9Var.seeTrialStatusLocal.get());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m141756B3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b3 */
    public static C22306c m141758b3(final jj9 jj9Var) {
        C22306c<Envelope> c22306cM135117a = ia20.m135117a(new v9j() { // from class: l.ij9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jj9.m141775z3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.yi9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jj9.m141755A3(this.f198451a, (Envelope) obj);
            }
        };
        return c22306cM135117a.map(new w9j() { // from class: l.zi9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jj9.m141756B3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: c3 */
    public static C22306c m141759c3(final jj9 jj9Var) {
        C22306c<Envelope> c22306cM135117a = ia20.m135117a(new v9j() { // from class: l.cj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jj9.m141769r3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.dj9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jj9.m141770s3(this.f86510a, (Envelope) obj);
            }
        };
        return c22306cM135117a.map(new w9j() { // from class: l.ej9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jj9.m141771t3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static C22306c m141766j3(final jj9 jj9Var) {
        C22306c<Envelope> c22306cM135117a = ia20.m135117a(new v9j() { // from class: l.fj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jj9.m141772v3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.gj9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jj9.m141773w3(this.f103017a, (Envelope) obj);
            }
        };
        return c22306cM135117a.map(new w9j() { // from class: l.hj9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jj9.m141774x3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static final stc0 m141769r3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31282b2()).m185893l(utc0.create(Network.JSON, "")).m185883b();
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m141770s3(jj9 jj9Var, Envelope envelope) {
        envelope.getClass();
        jj9Var.seeTrialRecoverEndTime.put(Long.valueOf(((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialEligible.expireAt));
        jj9Var.m141782y3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m141771t3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static final stc0 m141772v3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31274Z1()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m141773w3(jj9 jj9Var, Envelope envelope) {
        envelope.getClass();
        jj9Var.isGoodSeeTrialUser = ((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialEligible.eligible;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m141774x3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final stc0 m141775z3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31278a2()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: m3 */
    public final long m141776m3() {
        return this.seeTrialRecoverEndTime.get().longValue() * 1000;
    }

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final String m141777n3() {
        String str = this.seeTrialStatusLocal.get();
        str.getClass();
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22306c<String> m141778o3() {
        C22306c<String> c22306cAsObservable = this.seeTrialStatusSub.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final boolean getIsGoodSeeTrialUser() {
        return this.isGoodSeeTrialUser;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m141780q3() {
        this.f72126Q.scheduled("limited_trial_see_wait_start_query", -1, new v9j() { // from class: l.xi9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jj9.m141759c3(this.f192970a);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m141781u3() {
        if (!CoreModule.m29935P().m94651a().mo33394Qb() || CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            return;
        }
        this.f72126Q.scheduled("limited_trial_see_eligible_query", 0, new v9j() { // from class: l.aj9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return jj9.m141766j3(this.f70095a);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final void m141782y3() {
        if (CoreModule.m29935P().m94651a().mo33394Qb()) {
            this.f72126Q.scheduled("limited_trial_see_status_query", 0, new v9j() { // from class: l.bj9
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return jj9.m141758b3(this.f75890a);
                }
            });
        } else {
            this.seeTrialStatusLocal.put("expired");
            this.seeTrialStatusSub.m132487l(m141777n3());
        }
    }
}
