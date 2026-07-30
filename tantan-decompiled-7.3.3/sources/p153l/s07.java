package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.ComStatusAward;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0013\u0010\u0011R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, m88121d2 = {"Ll/s07;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "p3", "()V", "", "delayTime", "u3", "(J)V", "Lrx/c;", "", "Lcom/p1/mobile/putong/core/data/ComStatusAward;", "n3", "()Lrx/c;", "Ll/uxj0;", "o3", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "newUserComGuideNewUIBehaviorSubject", p7f.LATITUDE_SOUTH, "updateNewUserComGuideNewUIBehaviorSubject", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s07 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public C22507a<List<ComStatusAward>> newUserComGuideNewUIBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public C22507a<uxj0> updateNewUserComGuideNewUIBehaviorSubject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s07(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        C22507a<List<ComStatusAward>> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.newUserComGuideNewUIBehaviorSubject = c22507aM222758b;
        C22507a<uxj0> c22507aM222758b2 = C22507a.m222758b();
        c22507aM222758b2.getClass();
        this.updateNewUserComGuideNewUIBehaviorSubject = c22507aM222758b2;
    }

    /* JADX INFO: renamed from: A3 */
    public static final C22421c m183886A3(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public static final void m183887B3(s07 s07Var, Throwable th) {
        s07Var.updateNewUserComGuideNewUIBehaviorSubject.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m183888C3(s07 s07Var, Envelope envelope) {
        s07Var.newUserComGuideNewUIBehaviorSubject.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).comStatusAwards);
        s07Var.updateNewUserComGuideNewUIBehaviorSubject.m137019l(uxj0.f181467a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m183889D3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a3 */
    public static C22421c m183890a3(long j, final s07 s07Var) {
        C22421c<R> c22421cCompose = qi20.m176657d(new pcj() { // from class: l.n07
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s07.m183907w3();
            }
        }, false).delay(j, TimeUnit.SECONDS).compose(psd0.m173592C());
        final Function1 function1 = new Function1() { // from class: l.o07
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s07.m183908x3(this.f144500a, (Envelope) obj);
            }
        };
        C22421c c22421cDoOnError = c22421cCompose.switchMap(new qcj() { // from class: l.p07
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s07.m183886A3(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.q07
            @Override // p153l.y20
            public final void call(Object obj) {
                s07.m183887B3(this.f155030a, (Throwable) obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.r07
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s07.m183888C3(this.f160588a, (Envelope) obj);
            }
        };
        return c22421cDoOnError.doOnNext(new y20() { // from class: l.g07
            @Override // p153l.y20
            public final void call(Object obj) {
                s07.m183889D3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public static C22421c m183897h3(final s07 s07Var) {
        C22421c<Envelope> c22421cM176657d = qi20.m176657d(new pcj() { // from class: l.k07
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s07.m183903q3();
            }
        }, false);
        final Function1 function1 = new Function1() { // from class: l.l07
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s07.m183904r3(this.f129544a, (Envelope) obj);
            }
        };
        return c22421cM176657d.doOnNext(new y20() { // from class: l.m07
            @Override // p153l.y20
            public final void call(Object obj) {
                s07.m183905s3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public static final x1d0 m183903q3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32309h2("/newUserComGuideNewUI")).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m183904r3(s07 s07Var, Envelope envelope) {
        s07Var.newUserComGuideNewUIBehaviorSubject.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).comStatusAwards);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m183905s3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m183906v3(s07 s07Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        s07Var.m183915u3(j);
    }

    /* JADX INFO: renamed from: w3 */
    public static final x1d0 m183907w3() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32309h2("/newUserComGuideNewUI?updateStatus=true")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
    }

    /* JADX INFO: renamed from: x3 */
    public static final C22421c m183908x3(s07 s07Var, final Envelope envelope) {
        C22421c<uxj0> c22421cM116470H9 = s07Var.f91137Q.f20381e0.m116470H9();
        final Function1 function1 = new Function1() { // from class: l.h07
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s07.m183909y3(envelope, (uxj0) obj);
            }
        };
        return c22421cM116470H9.map(new qcj() { // from class: l.i07
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s07.m183910z3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static final Envelope m183910z3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final C22421c<List<ComStatusAward>> m183911n3() {
        C22421c<List<ComStatusAward>> c22421cAsObservable = this.newUserComGuideNewUIBehaviorSubject.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22421c<uxj0> m183912o3() {
        C22421c<uxj0> c22421cAsObservable = this.updateNewUserComGuideNewUIBehaviorSubject.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m183913p3() {
        scheduled("com-status-award-newUserComGuideNewUI", 0, new pcj() { // from class: l.f07
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s07.m183897h3(this.f96660a);
            }
        });
    }

    @JvmOverloads
    /* JADX INFO: renamed from: t3 */
    public final void m183914t3() {
        m183906v3(this, 0L, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: u3 */
    public final void m183915u3(final long delayTime) {
        scheduled("com-status-award-updateNewUserComGuideNewUI", -1, new pcj() { // from class: l.j07
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s07.m183890a3(delayTime, this);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public static final Envelope m183909y3(Envelope envelope, uxj0 uxj0Var) {
        return envelope;
    }
}
