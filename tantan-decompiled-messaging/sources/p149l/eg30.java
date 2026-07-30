package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.HideAndSeekBannerEnv;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RiskSelfData;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersAct;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CurrencyTypeData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\t2\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0010J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0010J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b&\u0010\u0010J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u0010R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00106R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020<0(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010+R\u0016\u0010@\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010/R\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00102¨\u0006C"}, m87232d2 = {"Ll/eg30;", "Ll/qta0;", "Ll/jh30;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "available", "", "v2", "(J)V", "Lrx/c;", "o2", "()Lrx/c;", "y2", "()V", "", "n2", "()Z", "Ljava/lang/Class;", "Lcom/p1/mobile/putong/app/PutongFrag;", "fragment", "u2", "(Ljava/lang/Class;)V", "w2", "p2", "hidden", "g0", "(Z)V", "", "pageId", "()Ljava/lang/String;", "destroy", "a0", "q2", "t2", "s2", "r2", "x2", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "a", "Ljava/util/List;", "purchaseTypes", "Lcom/p1/mobile/putong/data/User;", "b", "Lcom/p1/mobile/putong/data/User;", "user", "c", "Z", "hasLocation", "Ll/c4g0;", Constants.INAPP_DATA_TAG, "Ll/c4g0;", "freeTrialSubscription", "e", "boostSubscription", "f", "picksSubscription", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "g", "list", "h", "mUser", RXScreenCaptureService.KEY_INDEX, "visitorIsInit", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class eg30 extends qta0<jh30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public User user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean hasLocation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public c4g0 freeTrialSubscription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public c4g0 boostSubscription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public c4g0 picksSubscription;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public List<Picture.ImageUri> list;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public User mUser;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean visitorIsInit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg30(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.purchaseTypes = new ArrayList();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m116123A0(Throwable th) {
    }

    /* JADX INFO: renamed from: B1 */
    public static Boolean m116124B1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public static Long m116125C0(Coin coin) {
        return Long.valueOf(coin.available);
    }

    /* JADX INFO: renamed from: C1 */
    public static j760 m116126C1(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: D0 */
    public static Picture.ImageUri m116127D0(Function1 function1, Object obj) {
        return (Picture.ImageUri) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public static Boolean m116128D1(j760 j760Var) {
        boolean z;
        if ((j760Var != null ? (C4319c) j760Var.f116565b : null) != C4319c.f15548i) {
            z = false;
        } else {
            if (xma.m210067c4(j760Var != null ? (UserPrivilege) j760Var.f116564a : null)) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: E0 */
    public static Boolean m116129E0(j760 j760Var) {
        F f = j760Var.f116564a;
        Boolean bool = Boolean.TRUE;
        return Boolean.valueOf(Intrinsics.m87488d(f, bool) && Intrinsics.m87488d(j760Var.f116565b, bool));
    }

    /* JADX INFO: renamed from: E1 */
    public static Boolean m116130E1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m116131F0(eg30 eg30Var, RiskSelfData riskSelfData) {
        riskSelfData.getClass();
        ((jh30) eg30Var.viewModel).m141428T0(riskSelfData);
    }

    /* JADX INFO: renamed from: F1 */
    public static Long m116132F1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G0 */
    public static void m116133G0(eg30 eg30Var, Boolean bool) {
        ((jh30) eg30Var.viewModel).getIntlMeTabDiscountEntryHost().m217984d();
        ((jh30) eg30Var.viewModel).m141473s1();
        if (eg30Var.purchaseTypes.isEmpty() || CoreModule.f17545c.f19696x0.m30179I3() == null) {
            return;
        }
        ((jh30) eg30Var.viewModel).m141430U0(eg30Var.purchaseTypes, true);
    }

    /* JADX INFO: renamed from: H0 */
    public static void m116134H0(eg30 eg30Var, Object obj) {
        if (CoreModule.f17545c.f19654j0.m30604Q4()) {
            return;
        }
        eg30Var.m116204p2();
        qqh0 qqh0Var = qqh0.INSTANCE;
        User userMe_ = CoreModule.m29932K().me_();
        userMe_.getClass();
        qqh0Var.m175927f(userMe_);
        ((jh30) eg30Var.viewModel).m141473s1();
        User userMe_2 = CoreModule.m29932K().me_();
        userMe_2.getClass();
        List<PurchaseType> listM175927f = qqh0Var.m175927f(userMe_2);
        eg30Var.purchaseTypes = listM175927f;
        ((jh30) eg30Var.viewModel).m141430U0(listM175927f, true);
    }

    /* JADX INFO: renamed from: H1 */
    public static void m116135H1(eg30 eg30Var, long j) {
        if (eg30Var.act() != null) {
            eg30Var.m116230v2(j);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m116136I0(eg30 eg30Var, j760 j760Var) {
        ((jh30) eg30Var.viewModel).m141424R0();
    }

    /* JADX INFO: renamed from: I1 */
    public static Boolean m116137I1(j760 j760Var) {
        return Boolean.valueOf(j760Var.f116565b == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m116138J0(Throwable th) {
    }

    /* JADX INFO: renamed from: J1 */
    public static C22306c m116139J1(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L0 */
    public static j760 m116140L0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L1 */
    public static void m116141L1(eg30 eg30Var, j760 j760Var) {
        User userMe_ = CoreModule.m29932K().me_();
        userMe_.getClass();
        eg30Var.user = userMe_;
        if (NullChecker.m81303a(userMe_)) {
            jh30 jh30Var = (jh30) eg30Var.viewModel;
            User user = eg30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.m87502r("user");
                user = null;
            }
            jh30Var.m141469q1(user);
            qqh0 qqh0Var = qqh0.INSTANCE;
            User user3 = eg30Var.user;
            if (user3 == null) {
                Intrinsics.m87502r("user");
            } else {
                user2 = user3;
            }
            List<PurchaseType> listM175927f = qqh0Var.m175927f(user2);
            eg30Var.purchaseTypes = listM175927f;
            ((jh30) eg30Var.viewModel).m141430U0(listM175927f, false);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static C22306c m116142N0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        return h6a.m129470c() ? CoreModule.f17545c.f19569G2.m105991s3() : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: N1 */
    public static Boolean m116143N1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O0 */
    public static Picture.ImageUri m116144O0(User user) {
        user.getClass();
        return user.m60124fp().calculatedWidth(t100.f167240O);
    }

    /* JADX INFO: renamed from: O1 */
    public static j760 m116145O1(AppealInfo appealInfo, User user) {
        appealInfo.getClass();
        user.getClass();
        return new j760(appealInfo, user);
    }

    /* JADX INFO: renamed from: P0 */
    public static void m116146P0(eg30 eg30Var, User user) {
        jh30 jh30Var = (jh30) eg30Var.viewModel;
        user.getClass();
        jh30Var.m141437Y0(user);
        ((jh30) eg30Var.viewModel).m141441a1(user);
        jh30 jh30Var2 = (jh30) eg30Var.viewModel;
        String str = user.publicId;
        str.getClass();
        jh30Var2.m141434W0(str);
        ((jh30) eg30Var.viewModel).m141439Z0(user);
        List<PurchaseType> listM175927f = qqh0.INSTANCE.m175927f(user);
        eg30Var.purchaseTypes = listM175927f;
        ((jh30) eg30Var.viewModel).m141430U0(listM175927f, false);
        ((jh30) eg30Var.viewModel).m141467p1();
        ((jh30) eg30Var.viewModel).m141469q1(user);
        ((jh30) eg30Var.viewModel).m141473s1();
        ((jh30) eg30Var.viewModel).m141465o1(user);
        ((jh30) eg30Var.viewModel).m141471r1(user);
        ((jh30) eg30Var.viewModel).m141403B0(user);
        eg30Var.user = user;
    }

    /* JADX INFO: renamed from: P1 */
    public static Boolean m116147P1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m116148Q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q1 */
    public static Boolean m116149Q1(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Boolean.valueOf(CoreModule.m29932K().mo30835xf());
    }

    /* JADX INFO: renamed from: R0 */
    public static void m116150R0(Throwable th) {
    }

    /* JADX INFO: renamed from: R1 */
    public static C22306c m116151R1(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m116152S0(Throwable th) {
    }

    /* JADX INFO: renamed from: S1 */
    public static void m116153S1(eg30 eg30Var, Boolean bool) {
        ((jh30) eg30Var.viewModel).m141473s1();
    }

    /* JADX INFO: renamed from: T1 */
    public static void m116154T1(eg30 eg30Var, Boolean bool) {
        ((jh30) eg30Var.viewModel).m141452h1(0, eg30Var.m116223n2());
    }

    /* JADX INFO: renamed from: U0 */
    public static void m116155U0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U1 */
    public static void m116156U1(eg30 eg30Var, Pair pair) {
        pair.getClass();
        Integer num = (Integer) pair.first;
        if (num == null || num.intValue() != 1 || !NullChecker.m81303a(pair.second)) {
            ((jh30) eg30Var.viewModel).m141450g1(false);
            return;
        }
        Long l2 = (Long) ((xaj0) pair.second).f191753c;
        String strM95519c = l2 != null ? aa3.m95519c(l2.longValue()) : null;
        if (strM95519c == null) {
            ((jh30) eg30Var.viewModel).m141450g1(false);
        } else {
            ((jh30) eg30Var.viewModel).m141463n1(strM95519c);
            ((jh30) eg30Var.viewModel).m141450g1(true);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static j760 m116157V0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: V1 */
    public static void m116158V1(Throwable th) {
    }

    /* JADX INFO: renamed from: W0 */
    public static void m116159W0(eg30 eg30Var, j760 j760Var) {
        User userMe_ = CoreModule.m29932K().me_();
        userMe_.getClass();
        eg30Var.user = userMe_;
        if (NullChecker.m81303a(userMe_)) {
            jh30 jh30Var = (jh30) eg30Var.viewModel;
            User user = eg30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.m87502r("user");
                user = null;
            }
            jh30Var.m141469q1(user);
            qqh0 qqh0Var = qqh0.INSTANCE;
            User user3 = eg30Var.user;
            if (user3 == null) {
                Intrinsics.m87502r("user");
            } else {
                user2 = user3;
            }
            List<PurchaseType> listM175927f = qqh0Var.m175927f(user2);
            eg30Var.purchaseTypes = listM175927f;
            ((jh30) eg30Var.viewModel).m141430U0(listM175927f, false);
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static void m116160W1(Throwable th) {
    }

    /* JADX INFO: renamed from: X0 */
    public static void m116161X0(eg30 eg30Var, long j) {
        if (eg30Var.act() != null) {
            eg30Var.m116230v2(j);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static void m116162X1(Throwable th) {
    }

    /* JADX INFO: renamed from: Y0 */
    public static Boolean m116163Y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public static Boolean m116164Y1(j760 j760Var) {
        boolean z;
        if ((j760Var != null ? (C4319c) j760Var.f116565b : null) != C4319c.f15548i) {
            z = false;
        } else {
            if (xma.m210067c4(j760Var != null ? (UserPrivilege) j760Var.f116564a : null)) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Boolean m116165Z1(TabName tabName) {
        tabName.getClass();
        return Boolean.valueOf(tabName == TabName.Me);
    }

    /* JADX INFO: renamed from: a1 */
    public static void m116166a1(eg30 eg30Var, Long l2) {
        ((jh30) eg30Var.viewModel).m141473s1();
        ((jh30) eg30Var.viewModel).m141430U0(eg30Var.purchaseTypes, true);
    }

    /* JADX INFO: renamed from: a2 */
    public static C22306c m116167a2() {
        return CoreModule.f17545c.f19654j0.m30578D4().distinctUntilChanged();
    }

    /* JADX INFO: renamed from: b1 */
    public static void m116168b1(eg30 eg30Var, Bundle bundle) {
        ((jh30) eg30Var.viewModel).m141445d1();
    }

    /* JADX INFO: renamed from: b2 */
    public static j760 m116169b2(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: c1 */
    public static Boolean m116170c1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c2 */
    public static Boolean m116171c2(Coin coin) {
        return Boolean.valueOf(!CoreModule.m29932K().mo30835xf());
    }

    /* JADX INFO: renamed from: d1 */
    public static Long m116172d1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d2 */
    public static void m116173d2(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    public static C22306c m116174e1(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e2 */
    public static void m116175e2(eg30 eg30Var, HideAndSeekBannerEnv hideAndSeekBannerEnv) {
        ((jh30) eg30Var.viewModel).m141426S0(hideAndSeekBannerEnv != null ? hideAndSeekBannerEnv.data : null);
    }

    /* JADX INFO: renamed from: f1 */
    public static void m116176f1(eg30 eg30Var, j760 j760Var) {
        S s = j760Var.f116565b;
        s.getClass();
        List<Picture.ImageUri> listM87536c = TypeIntrinsics.m87536c(s);
        eg30Var.list = listM87536c;
        jh30 jh30Var = (jh30) eg30Var.viewModel;
        if (listM87536c == null) {
            Intrinsics.m87502r("list");
            listM87536c = null;
        }
        jh30Var.m141432V0(listM87536c);
    }

    /* JADX INFO: renamed from: f2 */
    public static j760 m116177f2(UserPrivilege userPrivilege, C4319c c4319c) {
        return new j760(userPrivilege, c4319c);
    }

    /* JADX INFO: renamed from: g1 */
    public static Long m116178g1(Coin coin) {
        return Long.valueOf(coin.available);
    }

    /* JADX INFO: renamed from: g2 */
    public static C22306c m116179g2(eg30 eg30Var, CurrencyTypeData currencyTypeData) {
        return eg30Var.m116224o2();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m116180h0(eg30 eg30Var, j760 j760Var) {
        j760Var.getClass();
        ((jh30) eg30Var.viewModel).m141418O0(j760Var);
    }

    /* JADX INFO: renamed from: h1 */
    public static void m116181h1(Throwable th) {
    }

    /* JADX INFO: renamed from: h2 */
    public static void m116182h2(eg30 eg30Var) {
        if (eg30Var.hasLocation) {
            return;
        }
        dfx.INSTANCE.m111517h();
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m116183i0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        return Boolean.valueOf(sab0.m182905w(paymentResultWrapper.purchaseType) || sab0.m182901s(paymentResultWrapper.purchaseType) || sab0.m182899q(paymentResultWrapper.purchaseType) || sab0.m182904v(paymentResultWrapper.purchaseType));
    }

    /* JADX INFO: renamed from: i1 */
    public static Unit m116184i1(eg30 eg30Var, Picture.ImageUri imageUri) {
        imageUri.getClass();
        ((jh30) eg30Var.viewModel).m141416N0(imageUri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static void m116185i2(eg30 eg30Var, Object obj) {
        if (CoreModule.f17545c.f19654j0.m30604Q4()) {
            return;
        }
        eg30Var.m116204p2();
        qqh0 qqh0Var = qqh0.INSTANCE;
        User userMe_ = CoreModule.m29932K().me_();
        userMe_.getClass();
        qqh0Var.m175927f(userMe_);
        ((jh30) eg30Var.viewModel).m141473s1();
        User userMe_2 = CoreModule.m29932K().me_();
        userMe_2.getClass();
        List<PurchaseType> listM175927f = qqh0Var.m175927f(userMe_2);
        eg30Var.purchaseTypes = listM175927f;
        ((jh30) eg30Var.viewModel).m141430U0(listM175927f, true);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m116186j0(eg30 eg30Var, long j) {
        if (eg30Var.act() != null) {
            eg30Var.m116230v2(j);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public static Boolean m116187j1(CoreAssetsSettings coreAssetsSettings) {
        return Boolean.valueOf(NullChecker.m81304b(coreAssetsSettings));
    }

    /* JADX INFO: renamed from: j2 */
    public static Boolean m116188j2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m116189k0(Throwable th) {
    }

    /* JADX INFO: renamed from: k1 */
    public static j760 m116190k1(UserPrivilege userPrivilege, C4319c c4319c) {
        return new j760(userPrivilege, c4319c);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m116191k2(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m116192l0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l1 */
    public static void m116193l1(eg30 eg30Var, Throwable th) {
        ((jh30) eg30Var.viewModel).getIntlMeTabDiscountEntryHost().m217984d();
    }

    /* JADX INFO: renamed from: l2 */
    public static void m116194l2(eg30 eg30Var, long j, Long l2) {
        if (!CoreModule.f17545c.f19654j0.m30604Q4()) {
            eg30Var.m116204p2();
            qqh0 qqh0Var = qqh0.INSTANCE;
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            userM169527p9.getClass();
            List<PurchaseType> listM175927f = qqh0Var.m175927f(userM169527p9);
            eg30Var.purchaseTypes = listM175927f;
            ((jh30) eg30Var.viewModel).m141430U0(listM175927f, true);
            return;
        }
        if (NullChecker.m81303a(eg30Var.act())) {
            ((jh30) eg30Var.viewModel).m141477u1(CoreModule.f17545c.f19654j0.m30576C4().titleText + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + zck0.m218065a(j, true, true, true, true));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static j760 m116195m0(CoreAssetsSettings coreAssetsSettings, C4319c c4319c) {
        return new j760(coreAssetsSettings, c4319c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public static CoreAssetsSettings m116196m1(j760 j760Var) {
        j760Var.getClass();
        return (CoreAssetsSettings) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: m2 */
    public static Long m116197m2(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m116198n0(eg30 eg30Var, Integer num) {
        if (num.intValue() >= 0) {
            ((jh30) eg30Var.viewModel).m141448f1(num.intValue());
        }
    }

    /* JADX INFO: renamed from: n1 */
    public static j760 m116199n1(boolean z, boolean z2) {
        return new j760(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: o0 */
    public static j760 m116200o0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: o1 */
    public static void m116201o1(eg30 eg30Var, roj0 roj0Var) {
        RiskSelfData riskSelfDataNew_ = RiskSelfData.new_();
        riskSelfDataNew_.ceilText = "多次發佈廣告，被標記為風險用戶";
        ((jh30) eg30Var.viewModel).m141428T0(riskSelfDataNew_);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m116202p0(eg30 eg30Var, Unit unit) {
        jh30 jh30Var = (jh30) eg30Var.viewModel;
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        userM169520na.getClass();
        jh30Var.m141437Y0(userM169520na);
    }

    /* JADX INFO: renamed from: p1 */
    public static Long m116203p1(roj0 roj0Var) {
        return Long.valueOf(CoreModule.f17545c.f19573I0.m140257K3());
    }

    /* JADX INFO: renamed from: p2 */
    private final void m116204p2() {
        ((jh30) this.viewModel).m141476u0();
        Act act = act();
        if ((act instanceof NewMainAct) && !CoreModule.f17545c.f19696x0.m30190T3()) {
            ((NewMainAct) act).m39803a6();
        }
        c4g0 c4g0Var = this.freeTrialSubscription;
        if (c4g0Var != null) {
            if (c4g0Var == null) {
                Intrinsics.m87502r("freeTrialSubscription");
                c4g0Var = null;
            }
            mkd0.m154992z(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m116205q0(Ref.LongRef longRef, eg30 eg30Var, Long l2) {
        String strM218065a = zck0.m218065a(longRef.element, true, true, true, true);
        if (Intrinsics.m87488d("00:00:00", strM218065a)) {
            longRef.element = qqh0.INSTANCE.m175926e();
        }
        jh30 jh30Var = (jh30) eg30Var.viewModel;
        strM218065a.getClass();
        jh30Var.m141457k1(strM218065a);
    }

    /* JADX INFO: renamed from: q1 */
    public static Boolean m116206q1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static Long m116207r0(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Long.valueOf(intlCurrencyDiamond.available);
    }

    /* JADX INFO: renamed from: r1 */
    public static void m116208r1(eg30 eg30Var, TabName tabName) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9())) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            userM169527p9.getClass();
            eg30Var.user = userM169527p9;
            IapAffiliatePromotion iapAffiliatePromotionM30179I3 = CoreModule.f17545c.f19696x0.m30179I3();
            qqh0 qqh0Var = qqh0.INSTANCE;
            User user = eg30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.m87502r("user");
                user = null;
            }
            int iIndexOf = qqh0Var.m175927f(user).indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (iapAffiliatePromotionM30179I3 != null && iIndexOf >= 0) {
                ((jh30) eg30Var.viewModel).m141417O(iIndexOf);
                return;
            }
            jh30 jh30Var = (jh30) eg30Var.viewModel;
            User user3 = eg30Var.user;
            if (user3 == null) {
                Intrinsics.m87502r("user");
            } else {
                user2 = user3;
            }
            jh30Var.m141417O(qqh0Var.m175925d(user2));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m116209s0(Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static void m116210s1(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static C22306c m116211t0(List list) {
        return h6a.m129470c() ? CoreModule.f17545c.f19569G2.m105991s3() : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: t1 */
    public static Boolean m116212t1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u0 */
    public static Boolean m116213u0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u1 */
    public static Long m116214u1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v1 */
    public static void m116215v1(eg30 eg30Var, Counter counter) {
        User user = null;
        if (((!n3b0.m157744s(null, 1, null) && eg30Var.purchaseTypes.contains(PurchaseType.TYPE_GET_LIKERS)) || (n3b0.m157744s(null, 1, null) && !eg30Var.purchaseTypes.contains(PurchaseType.TYPE_GET_LIKERS))) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9())) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            userM169527p9.getClass();
            eg30Var.user = userM169527p9;
            List<PurchaseType> listM175927f = qqh0.INSTANCE.m175927f(userM169527p9);
            eg30Var.purchaseTypes = listM175927f;
            ((jh30) eg30Var.viewModel).m141430U0(listM175927f, false);
            jh30 jh30Var = (jh30) eg30Var.viewModel;
            User user2 = eg30Var.user;
            if (user2 == null) {
                Intrinsics.m87502r("user");
            } else {
                user = user2;
            }
            jh30Var.m141471r1(user);
        }
        List<Picture.ImageUri> list = eg30Var.list;
        if (list != null) {
            ((jh30) eg30Var.viewModel).m141432V0(list);
        }
    }

    /* JADX INFO: renamed from: w2 */
    private final boolean m116216w2() {
        return (wvv.m205781u() || wvv.m205780t()) && !wn90.m204602F().m204644N();
    }

    /* JADX INFO: renamed from: x0 */
    public static CoreAssetsSettings m116217x0(Function1 function1, Object obj) {
        return (CoreAssetsSettings) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m116218x1(eg30 eg30Var, IntlTabMePayGuide intlTabMePayGuide) {
        ((jh30) eg30Var.viewModel).m141420P0(intlTabMePayGuide);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m116219y0(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static void m116220z0(Throwable th) {
    }

    /* JADX INFO: renamed from: z1 */
    public static void m116221z1(eg30 eg30Var, CoreAssetsSettings coreAssetsSettings) {
        if ((TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "grey") && v2a.m196755d())) && !((jh30) eg30Var.viewModel).m141409J0()) {
            CoreModule.f17545c.f19639e0.m169466Z9();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.hd30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116168b1(this.f107211a, (Bundle) obj);
            }
        }, new d30() { // from class: l.pc30
            @Override // p149l.d30
            public final void call() {
                eg30.m116182h2(this.f148137a);
            }
        });
        C22306c<TabName> c22306cDistinctUntilChanged = v930.m197537k().distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: l.bd30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116165Z1((TabName) obj);
            }
        };
        duringCreated(c22306cDistinctUntilChanged.filter(new w9j() { // from class: l.nd30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116188j2(function1, obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.zd30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116208r1(this.f202618a, (TabName) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.le30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116146P0(this.f127645a, (User) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.m31483n3()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.xe30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116215v1(this.f192526a, (Counter) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19639e0.m169523o9());
        final Function1 function2 = new Function1() { // from class: l.jf30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116144O0((User) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged2 = c22306cDuringCreated.map(new w9j() { // from class: l.uf30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116127D0(function2, obj);
            }
        }).distinctUntilChanged();
        final Function1 function3 = new Function1() { // from class: l.wf30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116184i1(this.f186010a, (Picture.ImageUri) obj);
            }
        };
        c22306cDistinctUntilChanged2.doOnNext(new e30() { // from class: l.sd30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116148Q0(function3, obj);
            }
        }).subscribe(mkd0.m154950B());
        C22306c<CurrencyTypeData> c22306cTake = CoreModule.f17545c.f19639e0.m169435R7().take(1);
        final Function1 function4 = new Function1() { // from class: l.de30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116179g2(this.f85698a, (CurrencyTypeData) obj);
            }
        };
        duringCreated((C22306c) c22306cTake.flatMap(new w9j() { // from class: l.oe30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116139J1(function4, obj);
            }
        })).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.ze30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116135H1(this.f202774a, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.kf30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116138J0((Throwable) obj);
            }
        }));
        C22306c c22306cSkip = duringCreated(CoreModule.f17545c.f19573I0.m140259M3()).skip(1);
        final Function1 function5 = new Function1() { // from class: l.vf30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116149Q1((IntlCurrencyDiamond) obj);
            }
        };
        C22306c c22306cFilter = c22306cSkip.filter(new w9j() { // from class: l.dg30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116170c1(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.mc30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116207r0((IntlCurrencyDiamond) obj);
            }
        };
        c22306cFilter.map(new w9j() { // from class: l.nc30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116197m2(function6, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.oc30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116161X0(this.f143009a, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.qc30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116160W1((Throwable) obj);
            }
        }));
        C22306c c22306cSkip2 = duringCreated(CoreModule.f17545c.f19570H0.m210349a5()).skip(1);
        final Function1 function7 = new Function1() { // from class: l.rc30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116171c2((Coin) obj);
            }
        };
        C22306c c22306cFilter2 = c22306cSkip2.filter(new w9j() { // from class: l.sc30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116212t1(function7, obj);
            }
        });
        final Function1 function8 = new Function1() { // from class: l.tc30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116125C0((Coin) obj);
            }
        };
        c22306cFilter2.map(new w9j() { // from class: l.uc30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116214u1(function8, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.vc30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116186j0(this.f180907a, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.xc30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116123A0((Throwable) obj);
            }
        }));
        if (u59.m191810S()) {
            C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"));
            C22306c<C4319c> c22306cLifecycle = lifecycle();
            final Function2 function9 = new Function2() { // from class: l.yc30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eg30.m116190k1((UserPrivilege) obj, (C4319c) obj2);
                }
            };
            C22306c<T> c22306cDuringCreated2 = duringCreated(mkd0.m154984r(c22306cM210111u3, c22306cLifecycle, new x9j() { // from class: l.zc30
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return eg30.m116126C1(function9, obj, obj2);
                }
            }));
            final Function1 function10 = new Function1() { // from class: l.ad30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return eg30.m116164Y1((j760) obj);
                }
            };
            c22306cDuringCreated2.filter(new w9j() { // from class: l.cd30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return eg30.m116206q1(function10, obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.dd30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116159W0(this.f85530a, (j760) obj);
                }
            }, new e30() { // from class: l.ed30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116173d2((Throwable) obj);
                }
            }));
        }
        if (u59.m191812U()) {
            C22306c<UserPrivilege> c22306cM210111u4 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
            C22306c<C4319c> c22306cLifecycle2 = lifecycle();
            final Function2 function11 = new Function2() { // from class: l.fd30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return eg30.m116177f2((UserPrivilege) obj, (C4319c) obj2);
                }
            };
            C22306c<T> c22306cDuringCreated3 = duringCreated(mkd0.m154984r(c22306cM210111u4, c22306cLifecycle2, new x9j() { // from class: l.gd30
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return eg30.m116169b2(function11, obj, obj2);
                }
            }));
            final Function1 function12 = new Function1() { // from class: l.id30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return eg30.m116128D1((j760) obj);
                }
            };
            c22306cDuringCreated3.filter(new w9j() { // from class: l.jd30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return eg30.m116143N1(function12, obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.kd30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116141L1(this.f122538a, (j760) obj);
                }
            }, new e30() { // from class: l.ld30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116162X1((Throwable) obj);
                }
            }));
        }
        C22306c<AppealInfo> c22306cDistinctUntilChanged3 = CoreModule.f17545c.f19639e0.f149148C0.distinctUntilChanged();
        C22306c<User> c22306cDistinctUntilChanged4 = CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged();
        final Function2 function13 = new Function2() { // from class: l.md30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return eg30.m116145O1((AppealInfo) obj, (User) obj2);
            }
        };
        duringCreated(mkd0.m154984r(c22306cDistinctUntilChanged3, c22306cDistinctUntilChanged4, new x9j() { // from class: l.od30
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return eg30.m116200o0(function13, obj, obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.pd30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116180h0(this.f148258a, (j760) obj);
            }
        }));
        C22306c<CoreAssetsSettings> c22306cM95174d = CoreModule.f17546d.m95174d();
        C22306c<C4319c> c22306cLifecycle3 = lifecycle();
        final Function2 function14 = new Function2() { // from class: l.qd30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return eg30.m116195m0((CoreAssetsSettings) obj, (C4319c) obj2);
            }
        };
        C22306c<T> c22306cDuringCreated4 = duringCreated(mkd0.m154984r(c22306cM95174d, c22306cLifecycle3, new x9j() { // from class: l.rd30
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return eg30.m116157V0(function14, obj, obj2);
            }
        }));
        final Function1 function15 = new Function1() { // from class: l.td30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116137I1((j760) obj);
            }
        };
        C22306c c22306cFilter3 = c22306cDuringCreated4.filter(new w9j() { // from class: l.ud30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116192l0(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: l.vd30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116196m1((j760) obj);
            }
        };
        C22306c map = c22306cFilter3.map(new w9j() { // from class: l.wd30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116217x0(function16, obj);
            }
        });
        final Function1 function17 = new Function1() { // from class: l.xd30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116187j1((CoreAssetsSettings) obj);
            }
        };
        map.filter(new w9j() { // from class: l.yd30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116163Y0(function17, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ae30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116221z1(this.f68988a, (CoreAssetsSettings) obj);
            }
        }, new e30() { // from class: l.be30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116155U0((Throwable) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated5 = duringCreated(ah60.m96370E());
        final Function1 function18 = new Function1() { // from class: l.ce30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116183i0((PaymentResultWrapper) obj);
            }
        };
        C22306c c22306cFilter4 = c22306cDuringCreated5.filter(new w9j() { // from class: l.ee30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116130E1(function18, obj);
            }
        });
        final Function1 function19 = new Function1() { // from class: l.fe30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116142N0((PaymentResultWrapper) obj);
            }
        };
        c22306cFilter4.flatMap(new w9j() { // from class: l.ge30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116151R1(function19, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.he30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116185i2(this.f107328a, obj);
            }
        }));
        C22306c<List<UserPrivilege>> c22306cDistinctUntilChanged5 = CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged();
        final Function1 function20 = new Function1() { // from class: l.ie30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116211t0((List) obj);
            }
        };
        duringCreated((C22306c) c22306cDistinctUntilChanged5.flatMap(new w9j() { // from class: l.je30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116174e1(function20, obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ke30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116134H0(this.f122667a, obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19687u0.m30397K6(25, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.me30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116176f1(this.f133356a, (j760) obj);
            }
        }, new e30() { // from class: l.ne30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116158V1((Throwable) obj);
            }
        }));
        c4g0 c4g0VarM139895o = j63.m139890j().m139895o(mkd0.m154955G(new e30() { // from class: l.pe30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116156U1(this.f148399a, (Pair) obj);
            }
        }));
        c4g0VarM139895o.getClass();
        this.boostSubscription = c4g0VarM139895o;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = qqh0.INSTANCE.m175926e();
        c4g0 c4g0VarSubscribe = duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.qe30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116205q0(longRef, this, (Long) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.picksSubscription = c4g0VarSubscribe;
        if (u59.m191810S()) {
            duringCreated(uld0.m194220e().m194224f().obs().distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.re30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116154T1(this.f159028a, (Boolean) obj);
                }
            }, new e30() { // from class: l.se30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116191k2((Throwable) obj);
                }
            }));
        }
        ec9 ec9Var = CoreModule.f17545c.f19620X1;
        C22392a<Boolean> c22392a = ec9Var.f90484U;
        C22392a<Boolean> c22392a2 = ec9Var.f90483T;
        final Function2 function21 = new Function2() { // from class: l.te30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return eg30.m116199n1(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        C22306c<T> c22306cDuringCreated6 = duringCreated(mkd0.m154984r(c22392a, c22392a2, new x9j() { // from class: l.ue30
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return eg30.m116140L0(function21, obj, obj2);
            }
        }));
        final Function1 function22 = new Function1() { // from class: l.ve30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116129E0((j760) obj);
            }
        };
        c22306cDuringCreated6.filter(new w9j() { // from class: l.we30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116213u0(function22, obj);
            }
        }).take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ye30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116136I0(this.f197659a, (j760) obj);
            }
        }, new e30() { // from class: l.af30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116210s1((Throwable) obj);
            }
        }));
        if (u59.m191795D()) {
            duringCreated(CoreModule.f17545c.f19638d2.m181930k3()).subscribe(mkd0.m154956H(new e30() { // from class: l.bf30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116175e2(this.f75272a, (HideAndSeekBannerEnv) obj);
                }
            }, new e30() { // from class: l.cf30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116209s0((Throwable) obj);
                }
            }));
        }
        Act act = act();
        act.getClass();
        C22306c<T> c22306cDuringCreated7 = duringCreated(((NewMainAct) act).m39789S5());
        final Function1 function23 = new Function1() { // from class: l.df30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116124B1((Boolean) obj);
            }
        };
        c22306cDuringCreated7.filter(new w9j() { // from class: l.ef30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116147P1(function23, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ff30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116153S1(this.f97182a, (Boolean) obj);
            }
        }, new e30() { // from class: l.gf30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116219y0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19696x0.m30214r4()).subscribe(mkd0.m154956H(new e30() { // from class: l.hf30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116166a1(this.f107430a, (Long) obj);
            }
        }, new e30() { // from class: l.if30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116150R0((Throwable) obj);
            }
        }));
        if (u59.m191850u()) {
            if (NullChecker.m81303a(CoreModule.f17545c.f19686t2.f148152R) && CoreModule.f17545c.f19686t2.f148152R.get().booleanValue()) {
                duringCreated(C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.lf30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eg30.m116201o1(this.f127829a, (roj0) obj);
                    }
                }));
            } else {
                duringCreated(CoreModule.f17545c.f19686t2.m168332l3("me")).filter(new z600()).subscribe(mkd0.m154956H(new e30() { // from class: l.mf30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eg30.m116131F0(this.f133557a, (RiskSelfData) obj);
                    }
                }, new e30() { // from class: l.nf30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        eg30.m116152S0((Throwable) obj);
                    }
                }));
            }
        }
        duringCreated(lfn.INSTANCE.m149727b()).subscribe(mkd0.m154956H(new e30() { // from class: l.of30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116202p0(this.f143622a, (Unit) obj);
            }
        }, new e30() { // from class: l.pf30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116220z0((Throwable) obj);
            }
        }));
        if (!IntlCountryCodeController.m28115k()) {
            duringCreated(new v9j() { // from class: l.qf30
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return eg30.m116167a2();
                }
            }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.rf30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116218x1(this.f159100a, (IntlTabMePayGuide) obj);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.f19696x0.m30212q4()).subscribe(mkd0.m154956H(new e30() { // from class: l.sf30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116133G0(this.f164197a, (Boolean) obj);
            }
        }, new e30() { // from class: l.tf30
            @Override // p149l.e30
            public final void call(Object obj) {
                eg30.m116193l1(this.f169937a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
        c4g0 c4g0Var = this.boostSubscription;
        c4g0 c4g0Var2 = null;
        if (c4g0Var != null) {
            if (c4g0Var == null) {
                Intrinsics.m87502r("boostSubscription");
                c4g0Var = null;
            }
            mkd0.m154992z(c4g0Var);
        }
        c4g0 c4g0Var3 = this.picksSubscription;
        if (c4g0Var3 != null) {
            if (c4g0Var3 == null) {
                Intrinsics.m87502r("picksSubscription");
            } else {
                c4g0Var2 = c4g0Var3;
            }
            mkd0.m154992z(c4g0Var2);
        }
    }

    @Override // p149l.qta0
    /* JADX INFO: renamed from: g0 */
    public void mo116222g0(boolean hidden) {
        if (hidden) {
            return;
        }
        if (this.mUser == null) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            userM169527p9.getClass();
            this.mUser = userM169527p9;
        }
        jh30 jh30Var = (jh30) this.viewModel;
        User user = this.mUser;
        if (user == null) {
            Intrinsics.m87502r("mUser");
            user = null;
        }
        jh30Var.m141465o1(user);
        m116232y2();
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m116223n2() {
        return u59.m191810S() && !uld0.m194220e().m194224f().get().booleanValue();
    }

    /* JADX INFO: renamed from: o2 */
    public final C22306c<Long> m116224o2() {
        if (CoreModule.m29932K().mo30835xf()) {
            C22306c<roj0> c22306cM140260N3 = CoreModule.f17545c.f19573I0.m140260N3();
            final Function1 function1 = new Function1() { // from class: l.xf30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return eg30.m116203p1((roj0) obj);
                }
            };
            C22306c map = c22306cM140260N3.map(new w9j() { // from class: l.yf30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return eg30.m116172d1(function1, obj);
                }
            });
            map.getClass();
            return map;
        }
        C22306c<Coin> c22306cM210349a5 = CoreModule.f17545c.f19570H0.m210349a5();
        final Function1 function2 = new Function1() { // from class: l.zf30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eg30.m116178g1((Coin) obj);
            }
        };
        C22306c map2 = c22306cM210349a5.map(new w9j() { // from class: l.ag30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return eg30.m116132F1(function2, obj);
            }
        });
        map2.getClass();
        return map2;
    }

    @Override // p149l.qta0
    @NotNull
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    /* JADX INFO: renamed from: q2 */
    public final void m116225q2() {
        dfx.INSTANCE.m111522m();
        m116229u2(ProfileListFrag.class);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m116226r2() {
        if (!NullChecker.m81303a(CoreModule.f17545c.m31484o3()) || CoreModule.f17545c.m31484o3().likersLimit.remaining <= 0) {
            FakeLikersAct.m54956Y1(act(), "p_navigation_view,e_see_banner,intl_click");
            return;
        }
        jh30 jh30Var = (jh30) this.viewModel;
        Intent intentM56544X1 = LikersAct.m56544X1(act(), "");
        intentM56544X1.getClass();
        jh30Var.m141461m1(intentM56544X1);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m116227s2() {
        new ukf0(act()).m194154a();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m116228t2() {
        dfx.INSTANCE.m111523n();
        if (m116216w2()) {
            wn90.m204602F().m204666p0(true);
        }
        m116229u2(SettingsFragOld.class);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m116229u2(Class<? extends PutongFrag> fragment) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", fragment.getSimpleName());
        ((jh30) this.viewModel).m141461m1(intent);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m116230v2(long available) {
        Act act = act();
        if (act != null) {
            String string = act.getString(CoreModule.m29932K().mo30835xf() ? R$string.f27457g8 : com.p046p1.mobile.putong.core.R$string.f17592Ap, swh0.m186215U(available));
            string.getClass();
            ((jh30) this.viewModel).m141422Q0(string);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m116231x2() {
        final long j = CoreModule.f17545c.f19654j0.m30576C4().endTime * 1000;
        if (this.freeTrialSubscription == null) {
            ((jh30) this.viewModel).m141475t1();
            qqh0 qqh0Var = qqh0.INSTANCE;
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            userM169527p9.getClass();
            List<PurchaseType> listM175927f = qqh0Var.m175927f(userM169527p9);
            this.purchaseTypes = listM175927f;
            ((jh30) this.viewModel).m141430U0(listM175927f, true);
            c4g0 c4g0VarSubscribe = duringCreated(C22306c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.bg30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116194l2(this.f75401a, j, (Long) obj);
                }
            }, new e30() { // from class: l.cg30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116181h1((Throwable) obj);
                }
            }));
            c4g0VarSubscribe.getClass();
            this.freeTrialSubscription = c4g0VarSubscribe;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final void m116232y2() {
        if (ura.m195053e().m195057d().mo33854ir()) {
            CoreModule.f17545c.f19562E1.m187832G3();
            ((jh30) this.viewModel).m141479v1();
            if (this.visitorIsInit) {
                return;
            }
            this.visitorIsInit = true;
            duringCreated(CoreModule.f17545c.f19562E1.m187833H3()).subscribe(mkd0.m154956H(new e30() { // from class: l.lc30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116198n0(this.f127371a, (Integer) obj);
                }
            }, new e30() { // from class: l.wc30
                @Override // p149l.e30
                public final void call(Object obj) {
                    eg30.m116189k0((Throwable) obj);
                }
            }));
        }
    }
}
