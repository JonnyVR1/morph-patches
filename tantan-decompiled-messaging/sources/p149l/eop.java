package p149l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.intl.visitor.IntlVisitorsViewModel;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\tJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)\"\u0004\b*\u0010!R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010)\"\u0004\b.\u0010!¨\u00060"}, m87232d2 = {"Ll/eop;", "Ll/jq2;", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "N0", "()V", "", "liked", MatchFrom.superLiked, "fromButton", "Lcom/p1/mobile/putong/data/User;", "user", "L0", "(ZZZLcom/p1/mobile/putong/data/User;)V", "Lcom/p1/mobile/putong/core/newui/home/d;", "swipeScData", "I0", "(ZZZLcom/p1/mobile/putong/core/newui/home/d;Lcom/p1/mobile/putong/data/User;)V", "a0", "Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "U0", "(IILandroid/content/Intent;)Z", "isFirst", "R0", "(Z)V", "destroy", "", "from", "V0", "(Ljava/lang/String;)V", "a", "getHasPrivilege", "()Z", "setHasPrivilege", "hasPrivilege", "b", "J0", "setCouldLoadMore", "couldLoadMore", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class eop extends jq2<IntlVisitorsViewModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean couldLoadMore;

    public eop(@Nullable mcr mcrVar) {
        super(mcrVar);
        boolean z = false;
        if (!CoreModule.f17545c.f19672p0.m173359g3() ? !xma.m210071e4() : !xma.m210077h4()) {
            z = true;
        }
        this.hasPrivilege = z;
    }

    /* JADX INFO: renamed from: A0 */
    public static void m117459A0() {
        CoreModule.f17545c.f19562E1.m187835q3();
        CoreModule.f17545c.f19562E1.m187832G3();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m117460C0(eop eopVar, PaymentResultWrapper paymentResultWrapper) {
        boolean z = false;
        if (!CoreModule.f17545c.f19672p0.m173359g3() ? !xma.m210071e4() : !xma.m210077h4()) {
            z = true;
        }
        eopVar.hasPrivilege = z;
        IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eopVar.viewModel;
        if (intlVisitorsViewModel != null) {
            intlVisitorsViewModel.m46212E(z);
        }
        e51.m114743H(eopVar.act(), new Runnable() { // from class: l.qnp
            @Override // java.lang.Runnable
            public final void run() {
                eop.m117469Q0();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m117461D0(eop eopVar, UserPrivilege userPrivilege) {
        if (xma.m210047L3()) {
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eopVar.viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m46213G();
                return;
            }
            return;
        }
        IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) eopVar.viewModel;
        if (intlVisitorsViewModel2 != null) {
            intlVisitorsViewModel2.m46217m();
        }
        IntlVisitorsViewModel intlVisitorsViewModel3 = (IntlVisitorsViewModel) eopVar.viewModel;
        if (intlVisitorsViewModel3 != null) {
            intlVisitorsViewModel3.m46212E(false);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static void m117462E0(C7994d c7994d, eop eopVar, boolean z, User user) {
        c7994d.m38481p();
        eopVar.m117491I0(true, true, z, c7994d, user);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m117463F0(eop eopVar, UserPrivilege userPrivilege) {
        if (!xma.m210077h4()) {
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eopVar.viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m46213G();
                return;
            }
            return;
        }
        IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) eopVar.viewModel;
        if (intlVisitorsViewModel2 != null) {
            intlVisitorsViewModel2.m46217m();
        }
        IntlVisitorsViewModel intlVisitorsViewModel3 = (IntlVisitorsViewModel) eopVar.viewModel;
        if (intlVisitorsViewModel3 != null) {
            intlVisitorsViewModel3.m46212E(false);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static void m117465H0(Throwable th) {
    }

    /* JADX INFO: renamed from: N0 */
    private final void m117466N0() {
        m117494R0(true);
    }

    /* JADX INFO: renamed from: P0 */
    public static final PaymentResultWrapper m117468P0(Function1 function1, Object obj) {
        return (PaymentResultWrapper) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final void m117469Q0() {
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m117470S0(eop eopVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eopVar.m117494R0(z);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m117471e0(C7994d c7994d, boolean z, eop eopVar, boolean z2, User user, Relationship relationship) {
        relationship.getClass();
        HomeStatisticsHelper.m36688B(c7994d, "success");
        if (!TEnum.equals(relationship.state, "matched")) {
            if (z2 && z) {
                rxg0.m181562L(eopVar.act());
                return;
            }
            return;
        }
        int i = 0;
        if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLikedEach))) {
            i = 13;
        } else if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get(MatchFrom.superLiked))) {
            i = z ? 12 : 11;
        } else if (relationship.status.size() != 0 && Intrinsics.m87488d(relationship.status.get(0), MatchFrom.get("secretcrush"))) {
            i = 1;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null || !userM169527p9.isFemale()) {
            Act act = eopVar.act();
            if (act != null) {
                act.startActivityWithCustomTransition(MatchAct.m47563e2(eopVar.act(), vwb.m200324f0(relationship.f38806id), i, new ArrayList()), new MatchAct.C8454b());
                return;
            }
            return;
        }
        Act act2 = eopVar.act();
        if (act2 != null) {
            abi.m95622J(act2, user);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m117472f0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m117473g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m117475i0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m117476j0(eop eopVar, Bundle bundle) {
        IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eopVar.viewModel;
        if (intlVisitorsViewModel != null) {
            intlVisitorsViewModel.m46221r();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static C22306c m117477k0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m117478l0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m117479m0(C7994d c7994d, Throwable th) {
        HomeStatisticsHelper.m36687A(c7994d, th);
    }

    /* JADX INFO: renamed from: n0 */
    public static Boolean m117480n0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: o0 */
    public static void m117481o0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static void m117482p0(Intent intent, int i, eop eopVar, C4319c c4319c) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("currentUserId")) == null) {
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(stringExtra);
        boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
        boolean z2 = i == SwipeDirection.UP.getValue();
        if (eopVar.act() != null) {
            userM169430Pa.getClass();
            eopVar.m117493L0(z, z2, true, userM169430Pa);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m117483q0(eop eopVar, NetworkInfo networkInfo) {
        if (CoreModule.f17545c.f19562E1.m187836r3()) {
            return;
        }
        eopVar.m117466N0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public static void m117484r0(eop eopVar, j760 j760Var) {
        Boolean bool;
        if (!NullChecker.m81303a(j760Var)) {
            IntlVisitorsViewModel intlVisitorsViewModel = (IntlVisitorsViewModel) eopVar.viewModel;
            if (intlVisitorsViewModel != null) {
                intlVisitorsViewModel.m46214H(null, eopVar.hasPrivilege);
                return;
            }
            return;
        }
        eopVar.couldLoadMore = (j760Var == null || (bool = (Boolean) j760Var.f116565b) == null) ? true : bool.booleanValue();
        IntlVisitorsViewModel intlVisitorsViewModel2 = (IntlVisitorsViewModel) eopVar.viewModel;
        if (intlVisitorsViewModel2 != null) {
            intlVisitorsViewModel2.m46214H(j760Var != null ? (List) j760Var.f116564a : null, eopVar.hasPrivilege);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m117485s0(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static void m117486t0(boolean z, eop eopVar, Throwable th) {
        IntlVisitorsViewModel intlVisitorsViewModel;
        if (!z || (intlVisitorsViewModel = (IntlVisitorsViewModel) eopVar.viewModel) == null) {
            return;
        }
        intlVisitorsViewModel.m46214H(CollectionsKt.emptyList(), eopVar.hasPrivilege);
    }

    /* JADX INFO: renamed from: x0 */
    public static Boolean m117488x0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y0 */
    public static C22306c m117489y0(final PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        if (paymentResultWrapper.fromSign) {
            return C22306c.just(paymentResultWrapper);
        }
        C22306c<List<UserPrivilege>> c22306cTake = CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1);
        final Function1 function1 = new Function1() { // from class: l.snp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eop.m117467O0(paymentResultWrapper, (List) obj);
            }
        };
        return c22306cTake.map(new w9j() { // from class: l.tnp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eop.m117468P0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static Boolean m117490z0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m117491I0(final boolean liked, final boolean superLiked, boolean fromButton, final C7994d swipeScData, final User user) {
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(swipeScData.f22979h.getFrom()).isLike(liked).isFromButton(fromButton).isSuperLiked(superLiked).user(user.f56011id).pageId(swipeScData.m38473h()).build();
        duringCreated(CoreModule.f17545c.f19663m0.m31073Y7(liked, superLiked, null, user, null, LikeFrom.get(LikeFrom.intl_visitor), true, likeExtraDataNew_, 0, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.unp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117471e0(swipeScData, superLiked, this, liked, user, (Relationship) obj);
            }
        }, new e30() { // from class: l.vnp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117479m0(swipeScData, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final boolean getCouldLoadMore() {
        return this.couldLoadMore;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m117493L0(boolean liked, boolean superLiked, final boolean fromButton, final User user) {
        Act act = act();
        final C7994d c7994dM36699e = HomeStatisticsHelper.m36699e(act != null ? act.pageId() : null, fromButton, liked, superLiked, user);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            c7994dM36699e.f22979h = HomeStatisticsHelper.ScActionFrom.INTL_VISITOR;
            Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
            CounterLikeLimit counterLikeLimit = counterM31484o3 != null ? counterM31484o3.likeLimit : null;
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                HomeStatisticsHelper.m36688B(c7994dM36699e, "failJailedUser");
                return;
            }
            if (userM169527p9.isNameFake()) {
                HomeStatisticsHelper.m36688B(c7994dM36699e, "failFakeUser");
                ark.m98449T0(act());
                return;
            }
            if (!xma.m210047L3()) {
                rmp.m180032p(rmp.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
                return;
            }
            if (liked && counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG)) {
                rmp.m180032p(rmp.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
                return;
            }
            if (!superLiked || swh0.m186276x0() > 0) {
                if (superLiked && swh0.m186193G1(act(), new d30() { // from class: l.rnp
                    @Override // p149l.d30
                    public final void call() {
                        eop.m117462E0(c7994dM36699e, this, fromButton, user);
                    }
                })) {
                    return;
                }
                m117491I0(liked, superLiked, fromButton, c7994dM36699e, user);
                return;
            }
            if (!xma.m210047L3() && !u59.m191818a0()) {
                rmp.m180032p(rmp.INSTANCE, act(), "p_intl_visitors_list,e_intl_visitors_list_check_btn,check", null, 4, null);
            } else {
                C8764c.m53397H1(act(), fromButton ? "p_who_i_liked,e_iliked_superlike,click" : "p_who_i_liked,e_card,swipe_like", 0, null, 12, null);
                HomeStatisticsHelper.m36688B(c7994dM36699e, "failExhaustSuperlike");
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m117494R0(final boolean isFirst) {
        duringCreated(CoreModule.f17545c.f19562E1.m187828C3()).subscribe(mkd0.m154956H(new e30() { // from class: l.xnp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117472f0((roj0) obj);
            }
        }, new e30() { // from class: l.ynp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117486t0(isFirst, this, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m117495U0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != 18) {
            return false;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.dnp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eop.m117478l0((C4319c) obj);
            }
        };
        c22306cLifecycle.takeFirst(new w9j() { // from class: l.onp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eop.m117490z0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wnp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117482p0(data, resultCode, this, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m117496V0(@NotNull String from) {
        from.getClass();
        Act act = act();
        if (act == null) {
            return;
        }
        CoreModule.m29935P().m94656g().mo35089zr(act, from);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        boolean z = false;
        if (!CoreModule.f17545c.f19672p0.m173359g3() ? !xma.m210071e4() : !xma.m210077h4()) {
            z = true;
        }
        this.hasPrivilege = z;
        m117466N0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.znp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117476j0(this.f203987a, (Bundle) obj);
            }
        }, new d30() { // from class: l.gnp
            @Override // p149l.d30
            public final void call() {
                eop.m117459A0();
            }
        });
        C22306c c22306cSkip = duringCreated(ConnectivityReceiver.m81290m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.hnp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eop.m117480n0((NetworkInfo) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.inp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eop.m117488x0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.jnp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117483q0(this.f118874a, (NetworkInfo) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.m29935P().m94656g().mo35022On());
        final Function1 function2 = new Function1() { // from class: l.knp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eop.m117475i0((PaymentResultWrapper) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated.filter(new w9j() { // from class: l.lnp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eop.m117473g0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.mnp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eop.m117489y0((PaymentResultWrapper) obj);
            }
        };
        c22306cFilter.switchMap(new w9j() { // from class: l.nnp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eop.m117477k0(function3, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pnp
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117460C0(this.f150408a, (PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19562E1.m187834I3()).subscribe(mkd0.m154956H(new e30() { // from class: l.aop
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117484r0(this.f70881a, (j760) obj);
            }
        }, new e30() { // from class: l.bop
            @Override // p149l.e30
            public final void call(Object obj) {
                eop.m117465H0((Throwable) obj);
            }
        }));
        if (CoreModule.f17545c.f19672p0.m173359g3()) {
            duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("seeWhoLikedMe"))).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.cop
                @Override // p149l.e30
                public final void call(Object obj) {
                    eop.m117463F0(this.f81855a, (UserPrivilege) obj);
                }
            }, new e30() { // from class: l.dop
                @Override // p149l.e30
                public final void call(Object obj) {
                    eop.m117481o0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.enp
                @Override // p149l.e30
                public final void call(Object obj) {
                    eop.m117461D0(this.f92332a, (UserPrivilege) obj);
                }
            }, new e30() { // from class: l.fnp
                @Override // p149l.e30
                public final void call(Object obj) {
                    eop.m117485s0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: O0 */
    public static final PaymentResultWrapper m117467O0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }
}
