package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
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
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m87232d2 = {"Ll/u010;", "Ll/ho2;", "D", "Ll/zi2;", "Ll/k010;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "e4", "()Ll/k010;", "", "showSeconds", "c4", "(I)V", "", "category", "Y3", "(Ljava/lang/String;)V", "f4", "Ll/b6t;", "message", "", "d4", "(Ll/b6t;)Z", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "b4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "k", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "invitedData", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class u010<D extends ho2> extends zi2<D, k010> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public BLiveMultiCallInvite invitedData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u010(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m191253P3(int i, u010 u010Var, Long l2) {
        if (((int) l2.longValue()) < i) {
            ((k010) u010Var.viewModel).m143980A(i, l2.longValue());
        } else {
            zi10.INSTANCE.m218902c("invited", "auto_ refuse", u010Var.m206032L2());
            u010Var.m191268f4();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static void m191254R3(u010 u010Var, b6t b6tVar) {
        BLiveMultiCallInvite bLiveMultiCallInviteM100474b = b6tVar.m100474b();
        bLiveMultiCallInviteM100474b.getClass();
        u010Var.invitedData = bLiveMultiCallInviteM100474b;
        u010Var.m218910L3();
        k010 k010Var = (k010) u010Var.viewModel;
        BLiveMultiCallInvite bLiveMultiCallInvite = u010Var.invitedData;
        if (bLiveMultiCallInvite == null) {
            Intrinsics.m87502r("invitedData");
            bLiveMultiCallInvite = null;
        }
        k010Var.m143982z(bLiveMultiCallInvite);
        u010Var.mo168244N3();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m191255S3(u010 u010Var, Boolean bool) {
        k010 k010Var = (k010) u010Var.viewModel;
        if (k010Var != null) {
            k010Var.mo71727j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public static Unit m191257U3(final u010 u010Var, String str) {
        if (u010Var.m206027E2().mo97490p()) {
            lsi0.m151595y(w8u.m202217t(R$string.f46740I7));
        } else {
            lsi0.m151595y(w8u.m202217t(R$string.f46696G7));
        }
        ?? M206027E2 = u010Var.m206027E2();
        M206027E2.getClass();
        BLiveMultiCallInvite bLiveMultiCallInvite = u010Var.invitedData;
        BLiveMultiCallInvite bLiveMultiCallInvite2 = null;
        if (bLiveMultiCallInvite == null) {
            Intrinsics.m87502r("invitedData");
            bLiveMultiCallInvite = null;
        }
        String str2 = bLiveMultiCallInvite.ownerMultiCallOrder;
        str2.getClass();
        BLiveMultiCallInvite bLiveMultiCallInvite3 = u010Var.invitedData;
        if (bLiveMultiCallInvite3 == null) {
            Intrinsics.m87502r("invitedData");
            bLiveMultiCallInvite3 = null;
        }
        String str3 = bLiveMultiCallInvite3.ownerLiveId;
        str3.getClass();
        BLiveMultiCallInvite bLiveMultiCallInvite4 = u010Var.invitedData;
        if (bLiveMultiCallInvite4 == null) {
            Intrinsics.m87502r("invitedData");
        } else {
            bLiveMultiCallInvite2 = bLiveMultiCallInvite4;
        }
        String str4 = bLiveMultiCallInvite2.f44404id;
        str4.getClass();
        String str5 = s410.f162245k;
        str5.getClass();
        String strM132060D0 = u010Var.m206027E2().m132060D0();
        strM132060D0.getClass();
        u010Var.m218909J3(LivingNormalApiProvider.m71210E3(r610.m178009n(M206027E2, str2, str3, str4, str, str5, 1, strM132060D0, ""))).subscribe(ffw.m121194e(new e30() { // from class: l.r010
            @Override // p149l.e30
            public final void call(Object obj) {
                u010.m191261Z3(this.f157133a, (BLiveMultiCall) obj);
            }
        }, new e30() { // from class: l.s010
            @Override // p149l.e30
            public final void call(Object obj) {
                u010.m191262a4(this.f161714a, (Throwable) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m191258V3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m191259W3(u010 u010Var, b6t b6tVar) {
        b6tVar.getClass();
        return Boolean.valueOf(u010Var.m191266d4(b6tVar));
    }

    /* JADX INFO: renamed from: X3 */
    public static void m191260X3(u010 u010Var, BLiveMultiCall bLiveMultiCall, List list) {
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
        q2f.C19397d<ug10, C22306c<ug10>> c19397dStartLiveMultiCall = u010Var.m206028F2().MultiCallEvent.startLiveMultiCall();
        String str = s410.f162239e;
        str.getClass();
        String str2 = bLiveMultiCall.ownerMultiCallOrder;
        str2.getClass();
        c19397dStartLiveMultiCall.mo172463j(new ug10(str, str2, r610.m178015u(bLiveMultiCall.maxCallNum, bLiveMultiCall2 != null), 2));
        r610.m178004i0(u010Var, bLiveMultiCall, "anchorRole accept");
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m191261Z3(u010 u010Var, BLiveMultiCall bLiveMultiCall) {
        bLiveMultiCall.getClass();
        u010Var.m191264b4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m191262a4(u010 u010Var, Throwable th) {
        th.getClass();
        r610.m178005j(th);
        ((k010) u010Var.viewModel).mo71727j();
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m191263Y3(@NotNull final String category) {
        category.getClass();
        l310.INSTANCE.m148350o(this, category, new Function0() { // from class: l.q010
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u010.m191257U3(this.f151993a, category);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final void m191264b4(final BLiveMultiCall call) {
        ((k010) this.viewModel).mo71727j();
        if (ve10.m198128b(call)) {
            duringCreated(LivingNormalApiProvider.m71185B5(call.ownerLiveId)).subscribe(ffw.m121197h(new e30() { // from class: l.t010
                @Override // p149l.e30
                public final void call(Object obj) {
                    u010.m191260X3(this.f167092a, call, (List) obj);
                }
            }));
        } else {
            r610.m178004i0(this, call, "audience accept");
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m191265c4(final int showSeconds) {
        ((k010) this.viewModel).m143980A(showSeconds, 0L);
        m218909J3(m129300I3(m206027E2().m132135h2(1, TimeUnit.SECONDS), true)).take(showSeconds).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.p010
            @Override // p149l.e30
            public final void call(Object obj) {
                u010.m191253P3(showSeconds, this, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final boolean m191266d4(b6t message) {
        return Intrinsics.m87488d(message.m100475c(), s410.f162260z) && xi5.m208914a(r610.m177967B(this));
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: e4, reason: merged with bridge method [inline-methods] */
    public k010 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new k010(act);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m191268f4() {
        lsi0.m151595y(w8u.m202217t(R$string.f47561u8));
        BLiveMultiCallInvite bLiveMultiCallInvite = this.invitedData;
        if (bLiveMultiCallInvite == null) {
            Intrinsics.m87502r("invitedData");
            bLiveMultiCallInvite = null;
        }
        LivingNormalApiProvider.m71321Q6(bLiveMultiCallInvite.f44404id);
        ((k010) this.viewModel).mo71727j();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m132160q1().m189066Q());
        final Function1 function1 = new Function1() { // from class: l.l010
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u010.m191259W3(this.f125460a, (b6t) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.m010
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u010.m191258V3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.n010
            @Override // p149l.e30
            public final void call(Object obj) {
                u010.m191254R3(this.f136460a, (b6t) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MultiCallEvent.closeAcceptDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.o010
            @Override // p149l.e30
            public final void call(Object obj) {
                u010.m191255S3(this.f141278a, (Boolean) obj);
            }
        }));
    }
}
