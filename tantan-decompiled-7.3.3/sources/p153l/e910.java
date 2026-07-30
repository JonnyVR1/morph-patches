package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Ll/e910;", "Ll/oo2;", "D", "Ll/hj2;", "Ll/u810;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "e4", "()Ll/u810;", "", "showSeconds", "c4", "(I)V", "", "category", "Y3", "(Ljava/lang/String;)V", "f4", "Ll/c8t;", "message", "", "d4", "(Ll/c8t;)Z", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "b4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "k", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "invitedData", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class e910<D extends oo2> extends hj2<D, u810> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public BLiveMultiCallInvite invitedData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e910(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m119850P3(int i, e910 e910Var, Long l2) {
        if (((int) l2.longValue()) < i) {
            ((u810) e910Var.viewModel).m194907A(i, l2.longValue());
        } else {
            jr10.INSTANCE.m146666c("invited", "auto_ refuse", e910Var.m213815L2());
            e910Var.m119865f4();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static void m119851R3(e910 e910Var, c8t c8tVar) {
        BLiveMultiCallInvite bLiveMultiCallInviteM108381b = c8tVar.m108381b();
        bLiveMultiCallInviteM108381b.getClass();
        e910Var.invitedData = bLiveMultiCallInviteM108381b;
        e910Var.m135319L3();
        u810 u810Var = (u810) e910Var.viewModel;
        BLiveMultiCallInvite bLiveMultiCallInvite = e910Var.invitedData;
        if (bLiveMultiCallInvite == null) {
            Intrinsics.m88391r("invitedData");
            bLiveMultiCallInvite = null;
        }
        u810Var.m194909z(bLiveMultiCallInvite);
        e910Var.mo135321N3();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m119852S3(e910 e910Var, Boolean bool) {
        u810 u810Var = (u810) e910Var.viewModel;
        if (u810Var != null) {
            u810Var.mo72910j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX INFO: renamed from: U3 */
    public static Unit m119854U3(final e910 e910Var, String str) {
        if (e910Var.m213810E2().mo118373p()) {
            o1j0.m165651y(xau.m209910t(R$string.f47588I7));
        } else {
            o1j0.m165651y(xau.m209910t(R$string.f47544G7));
        }
        ?? M213810E2 = e910Var.m213810E2();
        M213810E2.getClass();
        BLiveMultiCallInvite bLiveMultiCallInvite = e910Var.invitedData;
        BLiveMultiCallInvite bLiveMultiCallInvite2 = null;
        if (bLiveMultiCallInvite == null) {
            Intrinsics.m88391r("invitedData");
            bLiveMultiCallInvite = null;
        }
        String str2 = bLiveMultiCallInvite.ownerMultiCallOrder;
        str2.getClass();
        BLiveMultiCallInvite bLiveMultiCallInvite3 = e910Var.invitedData;
        if (bLiveMultiCallInvite3 == null) {
            Intrinsics.m88391r("invitedData");
            bLiveMultiCallInvite3 = null;
        }
        String str3 = bLiveMultiCallInvite3.ownerLiveId;
        str3.getClass();
        BLiveMultiCallInvite bLiveMultiCallInvite4 = e910Var.invitedData;
        if (bLiveMultiCallInvite4 == null) {
            Intrinsics.m88391r("invitedData");
        } else {
            bLiveMultiCallInvite2 = bLiveMultiCallInvite4;
        }
        String str4 = bLiveMultiCallInvite2.f45252id;
        str4.getClass();
        String str5 = cd10.f81083k;
        str5.getClass();
        String strM168449D0 = e910Var.m213810E2().m168449D0();
        strM168449D0.getClass();
        e910Var.m135318J3(LivingNormalApiProvider.m72393E3(bf10.m103838n(M213810E2, str2, str3, str4, str, str5, 1, strM168449D0, ""))).subscribe(dhw.m115826e(new y20() { // from class: l.b910
            @Override // p153l.y20
            public final void call(Object obj) {
                e910.m119858Z3(this.f75501a, (BLiveMultiCall) obj);
            }
        }, new y20() { // from class: l.c910
            @Override // p153l.y20
            public final void call(Object obj) {
                e910.m119859a4(this.f80281a, (Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m119855V3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m119856W3(e910 e910Var, c8t c8tVar) {
        c8tVar.getClass();
        return Boolean.valueOf(e910Var.m119863d4(c8tVar));
    }

    /* JADX INFO: renamed from: X3 */
    public static void m119857X3(e910 e910Var, BLiveMultiCall bLiveMultiCall, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((BLiveMultiCall) next).isLeadRole);
        BLiveMultiCall bLiveMultiCall2 = (BLiveMultiCall) next;
        v3f.C20736d<ep10, C22421c<ep10>> c20736dStartLiveMultiCall = e910Var.m213811F2().MultiCallEvent.startLiveMultiCall();
        String str = cd10.f81077e;
        str.getClass();
        String str2 = bLiveMultiCall.ownerMultiCallOrder;
        str2.getClass();
        c20736dStartLiveMultiCall.mo199273j(new ep10(str, str2, bf10.m103844u(bLiveMultiCall.maxCallNum, bLiveMultiCall2 != null), 2));
        bf10.m103833i0(e910Var, bLiveMultiCall, "anchorRole accept");
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m119858Z3(e910 e910Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        e910Var.m119861b4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m119859a4(e910 e910Var, Throwable th) {
        th.getClass();
        bf10.m103834j(th);
        ((u810) e910Var.viewModel).mo72910j();
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m119860Y3(@NotNull final String category) {
        category.getClass();
        vb10.INSTANCE.m200665o(this, category, new Function0() { // from class: l.a910
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e910.m119854U3(this.f68980a, category);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final void m119861b4(final BLiveMultiCall call) {
        ((u810) this.viewModel).mo72910j();
        if (fn10.m126334b(call)) {
            duringCreated(LivingNormalApiProvider.m72368B5(call.ownerLiveId)).subscribe(dhw.m115829h(new y20() { // from class: l.d910
                @Override // p153l.y20
                public final void call(Object obj) {
                    e910.m119857X3(this.f85704a, call, (List) obj);
                }
            }));
        } else {
            bf10.m103833i0(this, call, "audience accept");
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m119862c4(final int showSeconds) {
        ((u810) this.viewModel).m194907A(showSeconds, 0L);
        m135318J3(m138859I3(m213810E2().m168521h2(1, TimeUnit.SECONDS), true)).take(showSeconds).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.z810
            @Override // p153l.y20
            public final void call(Object obj) {
                e910.m119850P3(showSeconds, this, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final boolean m119863d4(c8t message) {
        return Intrinsics.m88377d(message.m108382c(), cd10.f81098z) && yj5.m216388a(bf10.m103796B(this));
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: e4, reason: merged with bridge method [inline-methods] */
    public u810 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new u810(act);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m119865f4() {
        o1j0.m165651y(xau.m209910t(R$string.f48409u8));
        BLiveMultiCallInvite bLiveMultiCallInvite = this.invitedData;
        if (bLiveMultiCallInvite == null) {
            Intrinsics.m88391r("invitedData");
            bLiveMultiCallInvite = null;
        }
        LivingNormalApiProvider.m72504Q6(bLiveMultiCallInvite.f45252id);
        ((u810) this.viewModel).mo72910j();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m168545q1().m98248Q());
        final Function1 function1 = new Function1() { // from class: l.v810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e910.m119856W3(this.f182844a, (c8t) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.w810
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return e910.m119855V3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.x810
            @Override // p153l.y20
            public final void call(Object obj) {
                e910.m119851R3(this.f192777a, (c8t) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MultiCallEvent.closeAcceptDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.y810
            @Override // p153l.y20
            public final void call(Object obj) {
                e910.m119852S3(this.f197935a, (Boolean) obj);
            }
        }));
    }
}
