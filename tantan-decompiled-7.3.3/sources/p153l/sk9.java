package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p051p1.mobile.putong.data.Envelope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/sk9;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "u3", "()V", "y3", "q3", "", "m3", "()J", "Lrx/c;", "", "o3", "()Lrx/c;", "n3", "()Ljava/lang/String;", "", "R", "Z", "p3", "()Z", "setGoodSeeTrialUser", "(Z)V", "isGoodSeeTrialUser", "Ll/byd0;", p7f.LATITUDE_SOUTH, "Ll/byd0;", "seeTrialRecoverEndTime", "Ll/wyd0;", p7f.GPS_DIRECTION_TRUE, "Ll/wyd0;", "seeTrialStatusLocal", "Lrx/subjects/a;", "U", "Lrx/subjects/a;", "seeTrialStatusSub", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sk9 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean isGoodSeeTrialUser;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public byd0 seeTrialRecoverEndTime;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public wyd0 seeTrialStatusLocal;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final C22507a<String> seeTrialStatusSub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk9(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        this.seeTrialRecoverEndTime = new byd0("core_limited_trial_see_recover_end_time_" + CoreModule.m30929H().userId(), 0L);
        this.seeTrialStatusLocal = new wyd0("core_limited_trial_see_status_" + CoreModule.m30929H().userId(), SeeTrialStatusType.waitToBuy);
        C22507a<String> c22507aM222759c = C22507a.m222759c(SeeTrialStatusType.waitToBuy);
        c22507aM222759c.getClass();
        this.seeTrialStatusSub = c22507aM222759c;
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m186403A3(sk9 sk9Var, Envelope envelope) {
        envelope.getClass();
        String str = ((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialStatus.status;
        str.getClass();
        sk9Var.seeTrialRecoverEndTime.put(Long.valueOf(((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialStatus.expireAt));
        wyd0 wyd0Var = sk9Var.seeTrialStatusLocal;
        if (TextUtils.isEmpty(str)) {
            str = SeeTrialStatusType.waitToBuy;
        }
        wyd0Var.put(str);
        sk9Var.seeTrialStatusSub.m137019l(sk9Var.seeTrialStatusLocal.get());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m186404B3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b3 */
    public static C22421c m186406b3(final sk9 sk9Var) {
        C22421c<Envelope> c22421cM176654a = qi20.m176654a(new pcj() { // from class: l.rk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sk9.m186423z3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.hk9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sk9.m186403A3(this.f110387a, (Envelope) obj);
            }
        };
        return c22421cM176654a.map(new qcj() { // from class: l.ik9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sk9.m186404B3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: c3 */
    public static C22421c m186407c3(final sk9 sk9Var) {
        C22421c<Envelope> c22421cM176654a = qi20.m176654a(new pcj() { // from class: l.lk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sk9.m186417r3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.mk9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sk9.m186418s3(this.f137272a, (Envelope) obj);
            }
        };
        return c22421cM176654a.map(new qcj() { // from class: l.nk9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sk9.m186419t3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static C22421c m186414j3(final sk9 sk9Var) {
        C22421c<Envelope> c22421cM176654a = qi20.m176654a(new pcj() { // from class: l.ok9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sk9.m186420v3();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.pk9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sk9.m186421w3(this.f152816a, (Envelope) obj);
            }
        };
        return c22421cM176654a.map(new qcj() { // from class: l.qk9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sk9.m186422x3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static final x1d0 m186417r3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32285b2()).m209038l(z1d0.create(Network.JSON, "")).m209028b();
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m186418s3(sk9 sk9Var, Envelope envelope) {
        envelope.getClass();
        sk9Var.seeTrialRecoverEndTime.put(Long.valueOf(((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialEligible.expireAt));
        sk9Var.m186430y3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m186419t3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static final x1d0 m186420v3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32277Z1()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m186421w3(sk9 sk9Var, Envelope envelope) {
        envelope.getClass();
        sk9Var.isGoodSeeTrialUser = ((CoreData) envelope.data.getModuleData(CoreData.class)).seeTrialEligible.eligible;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m186422x3(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final x1d0 m186423z3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32281a2()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: m3 */
    public final long m186424m3() {
        return this.seeTrialRecoverEndTime.get().longValue() * 1000;
    }

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final String m186425n3() {
        String str = this.seeTrialStatusLocal.get();
        str.getClass();
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22421c<String> m186426o3() {
        C22421c<String> c22421cAsObservable = this.seeTrialStatusSub.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final boolean getIsGoodSeeTrialUser() {
        return this.isGoodSeeTrialUser;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m186428q3() {
        this.f91137Q.scheduled("limited_trial_see_wait_start_query", -1, new pcj() { // from class: l.gk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sk9.m186407c3(this.f104710a);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m186429u3() {
        if (!CoreModule.m30933P().m143405a().mo34397Qb() || CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            return;
        }
        this.f91137Q.scheduled("limited_trial_see_eligible_query", 0, new pcj() { // from class: l.jk9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return sk9.m186414j3(this.f121281a);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final void m186430y3() {
        if (CoreModule.m30933P().m143405a().mo34397Qb()) {
            this.f91137Q.scheduled("limited_trial_see_status_query", 0, new pcj() { // from class: l.kk9
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return sk9.m186406b3(this.f127176a);
                }
            });
        } else {
            this.seeTrialStatusLocal.put("expired");
            this.seeTrialStatusSub.m137019l(m186425n3());
        }
    }
}
