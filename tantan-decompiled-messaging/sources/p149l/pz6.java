package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.ComStatusAward;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0013\u0010\u0011R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, m87232d2 = {"Ll/pz6;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "p3", "()V", "", "delayTime", "u3", "(J)V", "Lrx/c;", "", "Lcom/p1/mobile/putong/core/data/ComStatusAward;", "n3", "()Lrx/c;", "Ll/roj0;", "o3", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "newUserComGuideNewUIBehaviorSubject", j6f.LATITUDE_SOUTH, "updateNewUserComGuideNewUIBehaviorSubject", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pz6 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public C22392a<List<ComStatusAward>> newUserComGuideNewUIBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public C22392a<roj0> updateNewUserComGuideNewUIBehaviorSubject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz6(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        C22392a<List<ComStatusAward>> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.newUserComGuideNewUIBehaviorSubject = c22392aM221512b;
        C22392a<roj0> c22392aM221512b2 = C22392a.m221512b();
        c22392aM221512b2.getClass();
        this.updateNewUserComGuideNewUIBehaviorSubject = c22392aM221512b2;
    }

    /* JADX INFO: renamed from: A3 */
    public static final C22306c m172185A3(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public static final void m172186B3(pz6 pz6Var, Throwable th) {
        pz6Var.updateNewUserComGuideNewUIBehaviorSubject.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m172187C3(pz6 pz6Var, Envelope envelope) {
        pz6Var.newUserComGuideNewUIBehaviorSubject.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).comStatusAwards);
        pz6Var.updateNewUserComGuideNewUIBehaviorSubject.m132487l(roj0.f160388a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m172188D3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a3 */
    public static C22306c m172189a3(long j, final pz6 pz6Var) {
        C22306c<R> c22306cCompose = ia20.m135120d(new v9j() { // from class: l.kz6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pz6.m172206w3();
            }
        }, false).delay(j, TimeUnit.SECONDS).compose(mkd0.m154951C());
        final Function1 function1 = new Function1() { // from class: l.lz6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pz6.m172207x3(this.f130634a, (Envelope) obj);
            }
        };
        C22306c c22306cDoOnError = c22306cCompose.switchMap(new w9j() { // from class: l.mz6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pz6.m172185A3(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.nz6
            @Override // p149l.e30
            public final void call(Object obj) {
                pz6.m172186B3(this.f141187a, (Throwable) obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.oz6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pz6.m172187C3(this.f146382a, (Envelope) obj);
            }
        };
        return c22306cDoOnError.doOnNext(new e30() { // from class: l.dz6
            @Override // p149l.e30
            public final void call(Object obj) {
                pz6.m172188D3(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public static C22306c m172196h3(final pz6 pz6Var) {
        C22306c<Envelope> c22306cM135120d = ia20.m135120d(new v9j() { // from class: l.hz6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pz6.m172202q3();
            }
        }, false);
        final Function1 function1 = new Function1() { // from class: l.iz6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pz6.m172203r3(this.f115531a, (Envelope) obj);
            }
        };
        return c22306cM135120d.doOnNext(new e30() { // from class: l.jz6
            @Override // p149l.e30
            public final void call(Object obj) {
                pz6.m172204s3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public static final stc0 m172202q3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31306h2("/newUserComGuideNewUI")).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m172203r3(pz6 pz6Var, Envelope envelope) {
        pz6Var.newUserComGuideNewUIBehaviorSubject.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).comStatusAwards);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m172204s3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m172205v3(pz6 pz6Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        pz6Var.m172214u3(j);
    }

    /* JADX INFO: renamed from: w3 */
    public static final stc0 m172206w3() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31306h2("/newUserComGuideNewUI?updateStatus=true")).m185893l(utc0.create(Network.JSON, "")).m185883b();
    }

    /* JADX INFO: renamed from: x3 */
    public static final C22306c m172207x3(pz6 pz6Var, final Envelope envelope) {
        C22306c<roj0> c22306cM169397H9 = pz6Var.f72126Q.f19639e0.m169397H9();
        final Function1 function1 = new Function1() { // from class: l.ez6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pz6.m172208y3(envelope, (roj0) obj);
            }
        };
        return c22306cM169397H9.map(new w9j() { // from class: l.fz6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pz6.m172209z3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static final Envelope m172209z3(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: n3 */
    public final C22306c<List<ComStatusAward>> m172210n3() {
        C22306c<List<ComStatusAward>> c22306cAsObservable = this.newUserComGuideNewUIBehaviorSubject.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22306c<roj0> m172211o3() {
        C22306c<roj0> c22306cAsObservable = this.updateNewUserComGuideNewUIBehaviorSubject.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m172212p3() {
        scheduled("com-status-award-newUserComGuideNewUI", 0, new v9j() { // from class: l.cz6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pz6.m172196h3(this.f83060a);
            }
        });
    }

    @JvmOverloads
    /* JADX INFO: renamed from: t3 */
    public final void m172213t3() {
        m172205v3(this, 0L, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: u3 */
    public final void m172214u3(final long delayTime) {
        scheduled("com-status-award-updateNewUserComGuideNewUI", -1, new v9j() { // from class: l.gz6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return pz6.m172189a3(delayTime, this);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public static final Envelope m172208y3(Envelope envelope, roj0 roj0Var) {
        return envelope;
    }
}
