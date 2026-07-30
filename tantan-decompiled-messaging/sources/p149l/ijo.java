package p149l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.InstantMatchUserInfo;
import com.p046p1.mobile.putong.core.data.IntlBaseVisitorInfo;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VisitorInfo;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\tJ'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\tJ%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010/\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Ll/ijo;", "Ll/jq2;", "Ll/tjo;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "E0", "()V", "", "liked", MatchFrom.superLiked, "fromButton", "Lcom/p1/mobile/putong/data/User;", "user", "D0", "(ZZZLcom/p1/mobile/putong/data/User;)Z", "a0", "Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "I0", "(IILandroid/content/Intent;)Z", "H0", "destroy", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "likedUser", "L0", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;Lcom/p1/mobile/putong/data/User;Z)V", "hidden", "J0", "(Z)V", "a", "I", "getREQUEST_PROFILE", "()I", "REQUEST_PROFILE", "b", "Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "getClickedUser", "()Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;", "N0", "(Lcom/p1/mobile/putong/core/data/IntlBaseVisitorInfo;)V", "clickedUser", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static Boolean m136705A0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: E0 */
    private final void m136707E0() {
        m136731H0();
    }

    /* JADX INFO: renamed from: G0 */
    public static final PaymentResultWrapper m136709G0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static C22306c m136711f0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return C22306c.just(paymentResultWrapper);
        }
        C22306c<List<UserPrivilege>> c22306cTake = CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.yio
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ijo.m136708F0(paymentResultWrapper, (List) obj);
            }
        };
        return c22306cTake.map(new w9j() { // from class: l.zio
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ijo.m136709G0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m136712g0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: h0 */
    public static C22306c m136713h0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m136714i0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m136715j0(ijo ijoVar, Boolean bool) {
        ijoVar.m136731H0();
    }

    /* JADX INFO: renamed from: k0 */
    public static void m136716k0(ijo ijoVar, Throwable th) {
        tjo tjoVar = (tjo) ijoVar.viewModel;
        if (tjoVar != null) {
            tjoVar.m189376H(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m136717l0(ijo ijoVar, UserPrivilege userPrivilege) {
        if (xma.m210040C3()) {
            tjo tjoVar = (tjo) ijoVar.viewModel;
            if (tjoVar != null) {
                tjoVar.m189375G();
                return;
            }
            return;
        }
        tjo tjoVar2 = (tjo) ijoVar.viewModel;
        if (tjoVar2 != null) {
            tjoVar2.m189383n();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static void m136718m0(ijo ijoVar, PaymentResultWrapper paymentResultWrapper) {
        tjo tjoVar = (tjo) ijoVar.viewModel;
        if (tjoVar != null) {
            tjoVar.m189373C(!xma.m210077h4(), xma.m210047L3(), xma.m210040C3());
        }
        CoreModule.f17545c.f19667n1.m34272S3();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m136719n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static void m136720o0(Intent intent, int i, ijo ijoVar, C4319c c4319c) {
        String stringExtra;
        tjo tjoVar;
        fio fioVarM189388u;
        if (intent == null || (stringExtra = intent.getStringExtra("currentUserId")) == null) {
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(stringExtra);
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        if (ijoVar.act() != null) {
            userM169430Pa.getClass();
            if (!ijoVar.m136730D0(z, z2, true, userM169430Pa) || !z2 || (tjoVar = (tjo) ijoVar.viewModel) == null || (fioVarM189388u = tjoVar.getAdapter()) == null) {
                return;
            }
            fioVarM189388u.m121553d0(userM169430Pa.f56011id);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m136721p0(ijo ijoVar, Envelope envelope) {
        CoreData coreData;
        CoreData coreData2;
        List<InstantMatchUserInfo> list = null;
        List<VisitorInfo> list2 = (envelope == null || (coreData2 = (CoreData) envelope.getModuleData(CoreData.class)) == null) ? null : coreData2.visitorInfo;
        if (envelope != null && (coreData = (CoreData) envelope.getModuleData(CoreData.class)) != null) {
            list = coreData.picksInfo;
        }
        tjo tjoVar = (tjo) ijoVar.viewModel;
        if (tjoVar != null) {
            tjoVar.m189376H(list2, list);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static Boolean m136722q0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m136723r0() {
        CoreModule.f17545c.f19667n1.m34272S3();
    }

    /* JADX INFO: renamed from: s0 */
    public static Boolean m136724s0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
    }

    /* JADX INFO: renamed from: t0 */
    public static Boolean m136725t0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u0 */
    public static void m136726u0(ijo ijoVar, Bundle bundle) {
        tjo tjoVar = (tjo) ijoVar.viewModel;
        if (tjoVar != null) {
            tjoVar.m189386r();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m136727x0(ijo ijoVar, NetworkInfo networkInfo) {
        ijoVar.m136707E0();
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m136728y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m136729z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m136730D0(boolean liked, boolean superLiked, boolean fromButton, User user) {
        return CoreMemberModule.m36001F().m132651b().mo35986cb(act(), Boolean.valueOf(liked), Boolean.valueOf(superLiked), Boolean.valueOf(fromButton), user);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m136731H0() {
        duringCreated(CoreModule.f17545c.f19667n1.m34273Y3()).subscribe(mkd0.m154956H(new e30() { // from class: l.vio
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136721p0(this.f181621a, (Envelope) obj);
            }
        }, new e30() { // from class: l.wio
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136716k0(this.f186555a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m136732I0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != this.REQUEST_PROFILE) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.mio
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ijo.m136712g0((C4319c) obj);
            }
        };
        c22306cLifecycle.takeFirst(new w9j() { // from class: l.xio
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ijo.m136729z0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ajo
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136720o0(data, resultCode, this, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m136734L0(@NotNull IntlBaseVisitorInfo likedUser, @NotNull User user, boolean fromButton) {
        tjo tjoVar;
        fio fioVarM189388u;
        likedUser.getClass();
        user.getClass();
        this.clickedUser = likedUser;
        if (NullChecker.m81303a(likedUser)) {
            pib pibVar = CoreModule.f17545c.f19639e0;
            IntlBaseVisitorInfo intlBaseVisitorInfo = this.clickedUser;
            User userM169430Pa = pibVar.m169430Pa(intlBaseVisitorInfo != null ? intlBaseVisitorInfo.userID : null);
            if (NullChecker.m81303a(userM169430Pa)) {
                userM169430Pa.getClass();
                if (!m136730D0(true, true, fromButton, userM169430Pa) || (tjoVar = (tjo) this.viewModel) == null || (fioVarM189388u = tjoVar.getAdapter()) == null) {
                    return;
                }
                fioVarM189388u.m121552c0(this.clickedUser);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m136735N0(@Nullable IntlBaseVisitorInfo intlBaseVisitorInfo) {
        this.clickedUser = intlBaseVisitorInfo;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m136707E0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        C22306c<Boolean> c22306cM29640L4;
        creates(new e30() { // from class: l.bjo
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136726u0(this.f75926a, (Bundle) obj);
            }
        }, new d30() { // from class: l.hjo
            @Override // p149l.d30
            public final void call() {
                ijo.m136723r0();
            }
        });
        mcr mcrVar = this.lifecycleProviderImpl;
        C22306c<Boolean> c22306cSkip = null;
        IntlMeetVisitorFrag intlMeetVisitorFrag = mcrVar instanceof IntlMeetVisitorFrag ? (IntlMeetVisitorFrag) mcrVar : null;
        if (intlMeetVisitorFrag != null && (c22306cM29640L4 = intlMeetVisitorFrag.m29640L4()) != null) {
            final Function1 function1 = new Function1() { // from class: l.nio
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ijo.m136722q0((Boolean) obj);
                }
            };
            C22306c<Boolean> c22306cFilter = c22306cM29640L4.filter(new w9j() { // from class: l.oio
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ijo.m136728y0(function1, obj);
                }
            });
            if (c22306cFilter != null) {
                c22306cSkip = c22306cFilter.skip(1);
            }
        }
        duringCreated(c22306cSkip).subscribe(mkd0.m154955G(new e30() { // from class: l.pio
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136715j0(this.f149584a, (Boolean) obj);
            }
        }));
        C22306c<NetworkInfo> c22306cSkip2 = ConnectivityReceiver.m81290m().skip(1);
        final Function1 function2 = new Function1() { // from class: l.qio
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ijo.m136705A0((NetworkInfo) obj);
            }
        };
        duringCreated(c22306cSkip2.filter(new w9j() { // from class: l.rio
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ijo.m136714i0(function2, obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.sio
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136727x0(this.f164727a, (NetworkInfo) obj);
            }
        }));
        C22306c<PaymentResultWrapper> c22306cMo35022On = CoreModule.m29935P().m94656g().mo35022On();
        final Function1 function3 = new Function1() { // from class: l.tio
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ijo.m136724s0((PaymentResultWrapper) obj);
            }
        };
        C22306c<PaymentResultWrapper> c22306cFilter2 = c22306cMo35022On.filter(new w9j() { // from class: l.uio
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ijo.m136725t0(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.cjo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ijo.m136711f0((PaymentResultWrapper) obj);
            }
        };
        duringCreated((C22306c) c22306cFilter2.switchMap(new w9j() { // from class: l.djo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ijo.m136713h0(function4, obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ejo
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136718m0(this.f91772a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.fjo
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136717l0(this.f97802a, (UserPrivilege) obj);
            }
        }, new e30() { // from class: l.gjo
            @Override // p149l.e30
            public final void call(Object obj) {
                ijo.m136719n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m136733J0(boolean hidden) {
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: F0 */
    public static final PaymentResultWrapper m136708F0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }
}
