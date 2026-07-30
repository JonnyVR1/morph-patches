package p009l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VisitorInfo;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.pib;
import l.w9j;
import l.xma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tJ'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Ll/ijo;", "Ll/jq2;", "Ll/tjo;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "E0", "()V", "", "liked", "superLiked", "fromButton", "Lcom/p1/mobile/putong/data/User;", "user", "D0", "(ZZZLcom/p1/mobile/putong/data/User;)Z", "a0", "Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "I0", "(IILandroid/content/Intent;)Z", "H0", "destroy", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "likedUser", "L0", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Lcom/p1/mobile/putong/data/User;Z)V", "hidden", "J0", "(Z)V", "a", "I", "getREQUEST_PROFILE", "()I", "REQUEST_PROFILE", "b", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "getClickedUser", "()Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "N0", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;)V", "clickedUser", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ijo extends jq2<tjo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int REQUEST_PROFILE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public IntlBaseVisitorInfo clickedUser;

    public ijo(@Nullable mcr mcrVar) {
        super(mcrVar);
        this.REQUEST_PROFILE = 18;
    }

    /* JADX INFO: renamed from: A0 */
    public static Boolean m16584A0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: E0 */
    private final void m16586E0() {
        m16610H0();
    }

    /* JADX INFO: renamed from: G0 */
    public static final PaymentResultWrapper m16588G0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static c m16590f0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return c.just(paymentResultWrapper);
        }
        c cVarTake = CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.yio
            public final Object invoke(Object obj) {
                return ijo.m16587F0(paymentResultWrapper, (List) obj);
            }
        };
        return cVarTake.map(new w9j() { // from class: l.zio
            public final Object call(Object obj) {
                return ijo.m16588G0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m16591g0(com.p1.mobile.android.app.c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == com.p1.mobile.android.app.c.i);
    }

    /* JADX INFO: renamed from: h0 */
    public static c m16592h0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m16593i0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m16594j0(ijo ijoVar, Boolean bool) {
        ijoVar.m16610H0();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m16595k0(ijo ijoVar, Throwable th) {
        tjo tjoVar = (tjo) ((jq2) ijoVar).viewModel;
        if (tjoVar != null) {
            tjoVar.m22568H(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m16596l0(ijo ijoVar, UserPrivilege userPrivilege) {
        if (xma.C3()) {
            tjo tjoVar = (tjo) ((jq2) ijoVar).viewModel;
            if (tjoVar != null) {
                tjoVar.m22567G();
                return;
            }
            return;
        }
        tjo tjoVar2 = (tjo) ((jq2) ijoVar).viewModel;
        if (tjoVar2 != null) {
            tjoVar2.m22576n();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m16597m0(ijo ijoVar, PaymentResultWrapper paymentResultWrapper) {
        tjo tjoVar = (tjo) ((jq2) ijoVar).viewModel;
        if (tjoVar != null) {
            tjoVar.m22564C(!xma.h4(), xma.L3(), xma.C3());
        }
        CoreModule.c.n1.S3();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m16598n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static void m16599o0(Intent intent, int i, ijo ijoVar, com.p1.mobile.android.app.c cVar) {
        String stringExtra;
        tjo tjoVar;
        fio fioVarM22581u;
        if (intent == null || (stringExtra = intent.getStringExtra("currentUserId")) == null) {
            return;
        }
        User userPa = CoreModule.c.e0.Pa(stringExtra);
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        if (ijoVar.act() != null) {
            userPa.getClass();
            if (!ijoVar.m16609D0(z, z2, true, userPa) || !z2 || (tjoVar = (tjo) ((jq2) ijoVar).viewModel) == null || (fioVarM22581u = tjoVar.getAdapter()) == null) {
                return;
            }
            fioVarM22581u.m14473d0(((DbObject) userPa).id);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m16600p0(ijo ijoVar, Envelope envelope) {
        CoreData moduleData;
        CoreData moduleData2;
        List<? extends InstantMatchUserInfo> list = null;
        List<? extends VisitorInfo> list2 = (envelope == null || (moduleData2 = envelope.getModuleData(CoreData.class)) == null) ? null : moduleData2.visitorInfo;
        if (envelope != null && (moduleData = envelope.getModuleData(CoreData.class)) != null) {
            list = moduleData.picksInfo;
        }
        tjo tjoVar = (tjo) ((jq2) ijoVar).viewModel;
        if (tjoVar != null) {
            tjoVar.m22568H(list2, list);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m16601q0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m16602r0() {
        CoreModule.c.n1.S3();
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m16603s0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
    }

    /* JADX INFO: renamed from: t0 */
    public static Boolean m16604t0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u0 */
    public static void m16605u0(ijo ijoVar, Bundle bundle) {
        tjo tjoVar = (tjo) ((jq2) ijoVar).viewModel;
        if (tjoVar != null) {
            tjoVar.m22579r();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m16606x0(ijo ijoVar, NetworkInfo networkInfo) {
        ijoVar.m16586E0();
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m16607y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m16608z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m16609D0(boolean liked, boolean superLiked, boolean fromButton, User user) {
        return CoreMemberModule.F().b().cb(act(), Boolean.valueOf(liked), Boolean.valueOf(superLiked), Boolean.valueOf(fromButton), user);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m16610H0() {
        duringCreated(CoreModule.c.n1.Y3()).subscribe(mkd0.H(new e30() { // from class: l.vio
            public final void call(Object obj) {
                ijo.m16600p0(this.f21599a, (Envelope) obj);
            }
        }, new e30() { // from class: l.wio
            public final void call(Object obj) {
                ijo.m16595k0(this.f22139a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m16611I0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != this.REQUEST_PROFILE) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.mio
            public final Object invoke(Object obj) {
                return ijo.m16591g0((com.p1.mobile.android.app.c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.xio
            public final Object call(Object obj) {
                return ijo.m16608z0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ajo
            public final void call(Object obj) {
                ijo.m16599o0(data, resultCode, this, (com.p1.mobile.android.app.c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m16613L0(@NotNull IntlBaseVisitorInfo likedUser, @NotNull User user, boolean fromButton) {
        tjo tjoVar;
        fio fioVarM22581u;
        likedUser.getClass();
        user.getClass();
        this.clickedUser = likedUser;
        if (NullChecker.a(likedUser)) {
            pib pibVar = CoreModule.c.e0;
            IntlBaseVisitorInfo intlBaseVisitorInfo = this.clickedUser;
            User userPa = pibVar.Pa(intlBaseVisitorInfo != null ? intlBaseVisitorInfo.userID : null);
            if (NullChecker.a(userPa)) {
                userPa.getClass();
                if (!m16609D0(true, true, fromButton, userPa) || (tjoVar = (tjo) ((jq2) this).viewModel) == null || (fioVarM22581u = tjoVar.getAdapter()) == null) {
                    return;
                }
                fioVarM22581u.m14472c0(this.clickedUser);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m16614N0(@Nullable IntlBaseVisitorInfo intlBaseVisitorInfo) {
        this.clickedUser = intlBaseVisitorInfo;
    }

    /* JADX INFO: renamed from: Z */
    public void m16615Z() {
        super.Z();
        m16586E0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m16616a0() {
        c cVarL4;
        creates(new e30() { // from class: l.bjo
            public final void call(Object obj) {
                ijo.m16605u0(this.f10142a, (Bundle) obj);
            }
        }, new d30() { // from class: l.hjo
            public final void call() {
                ijo.m16602r0();
            }
        });
        IntlMeetVisitorFrag intlMeetVisitorFrag = ((jq2) this).lifecycleProviderImpl;
        c cVarSkip = null;
        IntlMeetVisitorFrag intlMeetVisitorFrag2 = intlMeetVisitorFrag instanceof IntlMeetVisitorFrag ? intlMeetVisitorFrag : null;
        if (intlMeetVisitorFrag2 != null && (cVarL4 = intlMeetVisitorFrag2.L4()) != null) {
            final Function1 function1 = new Function1() { // from class: l.nio
                public final Object invoke(Object obj) {
                    return ijo.m16601q0((Boolean) obj);
                }
            };
            c cVarFilter = cVarL4.filter(new w9j() { // from class: l.oio
                public final Object call(Object obj) {
                    return ijo.m16607y0(function1, obj);
                }
            });
            if (cVarFilter != null) {
                cVarSkip = cVarFilter.skip(1);
            }
        }
        duringCreated(cVarSkip).subscribe(mkd0.G(new e30() { // from class: l.pio
            public final void call(Object obj) {
                ijo.m16594j0(this.f18648a, (Boolean) obj);
            }
        }));
        c cVarSkip2 = ConnectivityReceiver.m().skip(1);
        final Function1 function2 = new Function1() { // from class: l.qio
            public final Object invoke(Object obj) {
                return ijo.m16584A0((NetworkInfo) obj);
            }
        };
        duringCreated(cVarSkip2.filter(new w9j() { // from class: l.rio
            public final Object call(Object obj) {
                return ijo.m16593i0(function2, obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.sio
            public final void call(Object obj) {
                ijo.m16606x0(this.f20283a, (NetworkInfo) obj);
            }
        }));
        c cVarOn = CoreModule.P().g().On();
        final Function1 function3 = new Function1() { // from class: l.tio
            public final Object invoke(Object obj) {
                return ijo.m16603s0((PaymentResultWrapper) obj);
            }
        };
        c cVarFilter2 = cVarOn.filter(new w9j() { // from class: l.uio
            public final Object call(Object obj) {
                return ijo.m16604t0(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.cjo
            public final Object invoke(Object obj) {
                return ijo.m16590f0((PaymentResultWrapper) obj);
            }
        };
        duringCreated(cVarFilter2.switchMap(new w9j() { // from class: l.djo
            public final Object call(Object obj) {
                return ijo.m16592h0(function4, obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ejo
            public final void call(Object obj) {
                ijo.m16597m0(this.f12588a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("ultraPremium"))).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.fjo
            public final void call(Object obj) {
                ijo.m16596l0(this.f13067a, (UserPrivilege) obj);
            }
        }, new e30() { // from class: l.gjo
            public final void call(Object obj) {
                ijo.m16598n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m16612J0(boolean hidden) {
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: F0 */
    public static final PaymentResultWrapper m16587F0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }
}
