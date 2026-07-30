package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.ComStatusAward;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Envelope;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import l.e30;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0013\u0010\u0011R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Ll/pz6;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "p3", "()V", "", "delayTime", "u3", "(J)V", "Lrx/c;", "", "Lcom/p1/mobile/putong/core/data/ComStatusAward;", "n3", "()Lrx/c;", "Ll/roj0;", "o3", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "newUserComGuideNewUIBehaviorSubject", "S", "updateNewUserComGuideNewUIBehaviorSubject", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pz6 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public a<List<ComStatusAward>> newUserComGuideNewUIBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public a<roj0> updateNewUserComGuideNewUIBehaviorSubject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz6(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        a<List<ComStatusAward>> aVarB = a.b();
        aVarB.getClass();
        this.newUserComGuideNewUIBehaviorSubject = aVarB;
        a<roj0> aVarB2 = a.b();
        aVarB2.getClass();
        this.updateNewUserComGuideNewUIBehaviorSubject = aVarB2;
    }

    /* JADX INFO: renamed from: A3 */
    public static final c m21847A3(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public static final void m21848B3(pz6 pz6Var, Throwable th) {
        pz6Var.updateNewUserComGuideNewUIBehaviorSubject.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m21849C3(pz6 pz6Var, Envelope envelope) {
        pz6Var.newUserComGuideNewUIBehaviorSubject.onNext(envelope.getModuleData(CoreData.class).comStatusAwards);
        pz6Var.updateNewUserComGuideNewUIBehaviorSubject.onNext(roj0.a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m21850D3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a3 */
    public static c m21851a3(long j, final pz6 pz6Var) {
        c cVarCompose = ia20.m16570d(new v9j() { // from class: l.kz6
            public final Object call() {
                return pz6.m21868w3();
            }
        }, false).delay(j, TimeUnit.SECONDS).compose(mkd0.C());
        final Function1 function1 = new Function1() { // from class: l.lz6
            public final Object invoke(Object obj) {
                return pz6.m21869x3(this.f16721a, (Envelope) obj);
            }
        };
        c cVarDoOnError = cVarCompose.switchMap(new w9j() { // from class: l.mz6
            public final Object call(Object obj) {
                return pz6.m21847A3(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.nz6
            public final void call(Object obj) {
                pz6.m21848B3(this.f17943a, (Throwable) obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.oz6
            public final Object invoke(Object obj) {
                return pz6.m21849C3(this.f18503a, (Envelope) obj);
            }
        };
        return cVarDoOnError.doOnNext(new e30() { // from class: l.dz6
            public final void call(Object obj) {
                pz6.m21850D3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public static c m21858h3(final pz6 pz6Var) {
        c<Envelope> cVarM16570d = ia20.m16570d(new v9j() { // from class: l.hz6
            public final Object call() {
                return pz6.m21864q3();
            }
        }, false);
        final Function1 function1 = new Function1() { // from class: l.iz6
            public final Object invoke(Object obj) {
                return pz6.m21865r3(this.f14884a, (Envelope) obj);
            }
        };
        return cVarM16570d.doOnNext(new e30() { // from class: l.jz6
            public final void call(Object obj) {
                pz6.m21866s3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public static final stc0 m21864q3() {
        return C0154a.f3483P.auth().q(C0154a.m3236h2("/newUserComGuideNewUI")).f().b();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m21865r3(pz6 pz6Var, Envelope envelope) {
        pz6Var.newUserComGuideNewUIBehaviorSubject.onNext(envelope.getModuleData(CoreData.class).comStatusAwards);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m21866s3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m21867v3(pz6 pz6Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        pz6Var.m21876u3(j);
    }

    /* JADX INFO: renamed from: w3 */
    public static final stc0 m21868w3() {
        return C0154a.f3483P.auth().q(C0154a.m3236h2("/newUserComGuideNewUI?updateStatus=true")).l(utc0.create(Network.JSON, "")).b();
    }

    /* JADX INFO: renamed from: x3 */
    public static final c m21869x3(pz6 pz6Var, final Envelope envelope) {
        c<roj0> cVarM21360H9 = pz6Var.f8580Q.f3628e0.m21360H9();
        final Function1 function1 = new Function1() { // from class: l.ez6
            public final Object invoke(Object obj) {
                return pz6.m21870y3(envelope, (roj0) obj);
            }
        };
        return cVarM21360H9.map(new w9j() { // from class: l.fz6
            public final Object call(Object obj) {
                return pz6.m21871z3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static final Envelope m21871z3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final c<List<ComStatusAward>> m21872n3() {
        c<List<ComStatusAward>> cVarAsObservable = this.newUserComGuideNewUIBehaviorSubject.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final c<roj0> m21873o3() {
        c<roj0> cVarAsObservable = this.updateNewUserComGuideNewUIBehaviorSubject.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m21874p3() {
        scheduled("com-status-award-newUserComGuideNewUI", 0, new v9j() { // from class: l.cz6
            public final Object call() {
                return pz6.m21858h3(this.f9937a);
            }
        });
    }

    @JvmOverloads
    /* JADX INFO: renamed from: t3 */
    public final void m21875t3() {
        m21867v3(this, 0L, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: u3 */
    public final void m21876u3(final long delayTime) {
        scheduled("com-status-award-updateNewUserComGuideNewUI", -1, new v9j() { // from class: l.gz6
            public final Object call() {
                return pz6.m21851a3(delayTime, this);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public static final Envelope m21870y3(Envelope envelope, roj0 roj0Var) {
        return envelope;
    }
}
