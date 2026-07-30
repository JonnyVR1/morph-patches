package p009l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.HideAndSeekBannerEnv;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RiskSelfData;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag;
import com.p1.mobile.putong.core.ui.seepage.likers.FakeLikersAct;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CurrencyTypeData;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
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
import l.aa3;
import l.c4g0;
import l.d30;
import l.e30;
import l.ec9;
import l.h6a;
import l.j63;
import l.j760;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.roj0;
import l.sab0;
import l.swh0;
import l.t100;
import l.u59;
import l.ukf0;
import l.uld0;
import l.ura;
import l.v2a;
import l.v930;
import l.v9j;
import l.w9j;
import l.wvv;
import l.x9j;
import l.xaj0;
import l.xma;
import l.z600;
import l.zck0;
import org.jetbrains.annotations.NotNull;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\t2\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0010J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0010J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b&\u0010\u0010J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u0010R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00106R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020<0(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010+R\u0016\u0010@\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010/R\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00102¨\u0006C"}, d2 = {"Ll/eg30;", "Ll/qta0;", "Ll/jh30;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "available", "", "v2", "(J)V", "Lrx/c;", "o2", "()Lrx/c;", "y2", "()V", "", "n2", "()Z", "Ljava/lang/Class;", "Lcom/p1/mobile/putong/app/PutongFrag;", "fragment", "u2", "(Ljava/lang/Class;)V", "w2", "p2", "hidden", "g0", "(Z)V", "", "pageId", "()Ljava/lang/String;", "destroy", "a0", "q2", "t2", "s2", "r2", "x2", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "a", "Ljava/util/List;", "purchaseTypes", "Lcom/p1/mobile/putong/data/User;", "b", "Lcom/p1/mobile/putong/data/User;", "user", "c", "Z", "hasLocation", "Ll/c4g0;", "d", "Ll/c4g0;", "freeTrialSubscription", "e", "boostSubscription", "f", "picksSubscription", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "g", "list", "h", "mUser", "i", "visitorIsInit", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m13833A0(Throwable th) {
    }

    /* JADX INFO: renamed from: B1 */
    public static Boolean m13834B1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public static Long m13835C0(Coin coin) {
        return Long.valueOf(coin.available);
    }

    /* JADX INFO: renamed from: C1 */
    public static j760 m13836C1(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: D0 */
    public static Picture.ImageUri m13837D0(Function1 function1, Object obj) {
        return (Picture.ImageUri) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX INFO: renamed from: D1 */
    public static Boolean m13838D1(j760 j760Var) {
        boolean z;
        if ((j760Var != null ? (c) j760Var.b : null) != c.i) {
            z = false;
        } else {
            if (xma.c4(j760Var != null ? (UserPrivilege) j760Var.a : null)) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: E0 */
    public static Boolean m13839E0(j760 j760Var) {
        Object obj = j760Var.a;
        Boolean bool = Boolean.TRUE;
        return Boolean.valueOf(Intrinsics.d(obj, bool) && Intrinsics.d(j760Var.b, bool));
    }

    /* JADX INFO: renamed from: E1 */
    public static Boolean m13840E1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m13841F0(eg30 eg30Var, RiskSelfData riskSelfData) {
        riskSelfData.getClass();
        ((jh30) ((jq2) eg30Var).viewModel).m17063T0(riskSelfData);
    }

    /* JADX INFO: renamed from: F1 */
    public static Long m13842F1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G0 */
    public static void m13843G0(eg30 eg30Var, Boolean bool) {
        ((jh30) ((jq2) eg30Var).viewModel).getIntlMeTabDiscountEntryHost().m25651d();
        ((jh30) ((jq2) eg30Var).viewModel).m17109s1();
        if (eg30Var.purchaseTypes.isEmpty() || CoreModule.c.x0.I3() == null) {
            return;
        }
        ((jh30) ((jq2) eg30Var).viewModel).m17065U0(eg30Var.purchaseTypes, true);
    }

    /* JADX INFO: renamed from: H0 */
    public static void m13844H0(eg30 eg30Var, Object obj) {
        if (CoreModule.c.j0.Q4()) {
            return;
        }
        eg30Var.m13914p2();
        qqh0 qqh0Var = qqh0.INSTANCE;
        User userMe_ = CoreModule.K().me_();
        userMe_.getClass();
        qqh0Var.m21179f(userMe_);
        ((jh30) ((jq2) eg30Var).viewModel).m17109s1();
        User userMe_2 = CoreModule.K().me_();
        userMe_2.getClass();
        List<PurchaseType> listM21179f = qqh0Var.m21179f(userMe_2);
        eg30Var.purchaseTypes = listM21179f;
        ((jh30) ((jq2) eg30Var).viewModel).m17065U0(listM21179f, true);
    }

    /* JADX INFO: renamed from: H1 */
    public static void m13845H1(eg30 eg30Var, long j) {
        if (eg30Var.act() != null) {
            eg30Var.m13941v2(j);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m13846I0(eg30 eg30Var, j760 j760Var) {
        ((jh30) ((jq2) eg30Var).viewModel).m17059R0();
    }

    /* JADX INFO: renamed from: I1 */
    public static Boolean m13847I1(j760 j760Var) {
        return Boolean.valueOf(j760Var.b == c.i);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m13848J0(Throwable th) {
    }

    /* JADX INFO: renamed from: J1 */
    public static rx.c m13849J1(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L0 */
    public static j760 m13850L0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L1 */
    public static void m13851L1(eg30 eg30Var, j760 j760Var) {
        User userMe_ = CoreModule.K().me_();
        userMe_.getClass();
        eg30Var.user = userMe_;
        if (NullChecker.a(userMe_)) {
            jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
            User user = eg30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.r("user");
                user = null;
            }
            jh30Var.m17105q1(user);
            qqh0 qqh0Var = qqh0.INSTANCE;
            User user3 = eg30Var.user;
            if (user3 == null) {
                Intrinsics.r("user");
            } else {
                user2 = user3;
            }
            List<PurchaseType> listM21179f = qqh0Var.m21179f(user2);
            eg30Var.purchaseTypes = listM21179f;
            ((jh30) ((jq2) eg30Var).viewModel).m17065U0(listM21179f, false);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static rx.c m13852N0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        return h6a.c() ? CoreModule.c.G2.s3() : rx.c.just(roj0.a);
    }

    /* JADX INFO: renamed from: N1 */
    public static Boolean m13853N1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O0 */
    public static Picture.ImageUri m13854O0(User user) {
        user.getClass();
        return user.fp().calculatedWidth(t100.O);
    }

    /* JADX INFO: renamed from: O1 */
    public static j760 m13855O1(AppealInfo appealInfo, User user) {
        appealInfo.getClass();
        user.getClass();
        return new j760(appealInfo, user);
    }

    /* JADX INFO: renamed from: P0 */
    public static void m13856P0(eg30 eg30Var, User user) {
        jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
        user.getClass();
        jh30Var.m17072Y0(user);
        ((jh30) ((jq2) eg30Var).viewModel).m17076a1(user);
        jh30 jh30Var2 = (jh30) ((jq2) eg30Var).viewModel;
        String str = user.publicId;
        str.getClass();
        jh30Var2.m17069W0(str);
        ((jh30) ((jq2) eg30Var).viewModel).m17074Z0(user);
        List<PurchaseType> listM21179f = qqh0.INSTANCE.m21179f(user);
        eg30Var.purchaseTypes = listM21179f;
        ((jh30) ((jq2) eg30Var).viewModel).m17065U0(listM21179f, false);
        ((jh30) ((jq2) eg30Var).viewModel).m17103p1();
        ((jh30) ((jq2) eg30Var).viewModel).m17105q1(user);
        ((jh30) ((jq2) eg30Var).viewModel).m17109s1();
        ((jh30) ((jq2) eg30Var).viewModel).m17101o1(user);
        ((jh30) ((jq2) eg30Var).viewModel).m17107r1(user);
        ((jh30) ((jq2) eg30Var).viewModel).m17037B0(user);
        eg30Var.user = user;
    }

    /* JADX INFO: renamed from: P1 */
    public static Boolean m13857P1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m13858Q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q1 */
    public static Boolean m13859Q1(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Boolean.valueOf(CoreModule.K().xf());
    }

    /* JADX INFO: renamed from: R0 */
    public static void m13860R0(Throwable th) {
    }

    /* JADX INFO: renamed from: R1 */
    public static rx.c m13861R1(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m13862S0(Throwable th) {
    }

    /* JADX INFO: renamed from: S1 */
    public static void m13863S1(eg30 eg30Var, Boolean bool) {
        ((jh30) ((jq2) eg30Var).viewModel).m17109s1();
    }

    /* JADX INFO: renamed from: T1 */
    public static void m13864T1(eg30 eg30Var, Boolean bool) {
        ((jh30) ((jq2) eg30Var).viewModel).m17087h1(0, eg30Var.m13934n2());
    }

    /* JADX INFO: renamed from: U0 */
    public static void m13865U0(Throwable th) {
    }

    /* JADX INFO: renamed from: U1 */
    public static void m13866U1(eg30 eg30Var, Pair pair) {
        pair.getClass();
        Integer num = (Integer) pair.first;
        if (num == null || num.intValue() != 1 || !NullChecker.a(pair.second)) {
            ((jh30) ((jq2) eg30Var).viewModel).m17085g1(false);
            return;
        }
        Long l2 = (Long) ((xaj0) pair.second).c;
        String strC = l2 != null ? aa3.c(l2.longValue()) : null;
        if (strC == null) {
            ((jh30) ((jq2) eg30Var).viewModel).m17085g1(false);
        } else {
            ((jh30) ((jq2) eg30Var).viewModel).m17099n1(strC);
            ((jh30) ((jq2) eg30Var).viewModel).m17085g1(true);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static j760 m13867V0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: V1 */
    public static void m13868V1(Throwable th) {
    }

    /* JADX INFO: renamed from: W0 */
    public static void m13869W0(eg30 eg30Var, j760 j760Var) {
        User userMe_ = CoreModule.K().me_();
        userMe_.getClass();
        eg30Var.user = userMe_;
        if (NullChecker.a(userMe_)) {
            jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
            User user = eg30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.r("user");
                user = null;
            }
            jh30Var.m17105q1(user);
            qqh0 qqh0Var = qqh0.INSTANCE;
            User user3 = eg30Var.user;
            if (user3 == null) {
                Intrinsics.r("user");
            } else {
                user2 = user3;
            }
            List<PurchaseType> listM21179f = qqh0Var.m21179f(user2);
            eg30Var.purchaseTypes = listM21179f;
            ((jh30) ((jq2) eg30Var).viewModel).m17065U0(listM21179f, false);
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static void m13870W1(Throwable th) {
    }

    /* JADX INFO: renamed from: X0 */
    public static void m13871X0(eg30 eg30Var, long j) {
        if (eg30Var.act() != null) {
            eg30Var.m13941v2(j);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static void m13872X1(Throwable th) {
    }

    /* JADX INFO: renamed from: Y0 */
    public static Boolean m13873Y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX INFO: renamed from: Y1 */
    public static Boolean m13874Y1(j760 j760Var) {
        boolean z;
        if ((j760Var != null ? (c) j760Var.b : null) != c.i) {
            z = false;
        } else {
            if (xma.c4(j760Var != null ? (UserPrivilege) j760Var.a : null)) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Boolean m13875Z1(TabName tabName) {
        tabName.getClass();
        return Boolean.valueOf(tabName == TabName.Me);
    }

    /* JADX INFO: renamed from: a1 */
    public static void m13876a1(eg30 eg30Var, Long l2) {
        ((jh30) ((jq2) eg30Var).viewModel).m17109s1();
        ((jh30) ((jq2) eg30Var).viewModel).m17065U0(eg30Var.purchaseTypes, true);
    }

    /* JADX INFO: renamed from: a2 */
    public static rx.c m13877a2() {
        return CoreModule.c.j0.D4().distinctUntilChanged();
    }

    /* JADX INFO: renamed from: b1 */
    public static void m13878b1(eg30 eg30Var, Bundle bundle) {
        ((jh30) ((jq2) eg30Var).viewModel).m17080d1();
    }

    /* JADX INFO: renamed from: b2 */
    public static j760 m13879b2(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: c1 */
    public static Boolean m13880c1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c2 */
    public static Boolean m13881c2(Coin coin) {
        return Boolean.valueOf(!CoreModule.K().xf());
    }

    /* JADX INFO: renamed from: d1 */
    public static Long m13882d1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d2 */
    public static void m13883d2(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    public static rx.c m13884e1(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e2 */
    public static void m13885e2(eg30 eg30Var, HideAndSeekBannerEnv hideAndSeekBannerEnv) {
        ((jh30) ((jq2) eg30Var).viewModel).m17061S0(hideAndSeekBannerEnv != null ? hideAndSeekBannerEnv.data : null);
    }

    /* JADX INFO: renamed from: f1 */
    public static void m13886f1(eg30 eg30Var, j760 j760Var) {
        Object obj = j760Var.b;
        obj.getClass();
        List<Picture.ImageUri> listC = TypeIntrinsics.c(obj);
        eg30Var.list = listC;
        jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
        if (listC == null) {
            Intrinsics.r("list");
            listC = null;
        }
        jh30Var.m17067V0(listC);
    }

    /* JADX INFO: renamed from: f2 */
    public static j760 m13887f2(UserPrivilege userPrivilege, c cVar) {
        return new j760(userPrivilege, cVar);
    }

    /* JADX INFO: renamed from: g1 */
    public static Long m13888g1(Coin coin) {
        return Long.valueOf(coin.available);
    }

    /* JADX INFO: renamed from: g2 */
    public static rx.c m13889g2(eg30 eg30Var, CurrencyTypeData currencyTypeData) {
        return eg30Var.m13935o2();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m13890h0(eg30 eg30Var, j760 j760Var) {
        j760Var.getClass();
        ((jh30) ((jq2) eg30Var).viewModel).m17053O0(j760Var);
    }

    /* JADX INFO: renamed from: h1 */
    public static void m13891h1(Throwable th) {
    }

    /* JADX INFO: renamed from: h2 */
    public static void m13892h2(eg30 eg30Var) {
        if (eg30Var.hasLocation) {
            return;
        }
        dfx.INSTANCE.m13323h();
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m13893i0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        return Boolean.valueOf(sab0.w(paymentResultWrapper.purchaseType) || sab0.s(paymentResultWrapper.purchaseType) || sab0.q(paymentResultWrapper.purchaseType) || sab0.v(paymentResultWrapper.purchaseType));
    }

    /* JADX INFO: renamed from: i1 */
    public static Unit m13894i1(eg30 eg30Var, Picture.ImageUri imageUri) {
        imageUri.getClass();
        ((jh30) ((jq2) eg30Var).viewModel).m17051N0(imageUri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static void m13895i2(eg30 eg30Var, Object obj) {
        if (CoreModule.c.j0.Q4()) {
            return;
        }
        eg30Var.m13914p2();
        qqh0 qqh0Var = qqh0.INSTANCE;
        User userMe_ = CoreModule.K().me_();
        userMe_.getClass();
        qqh0Var.m21179f(userMe_);
        ((jh30) ((jq2) eg30Var).viewModel).m17109s1();
        User userMe_2 = CoreModule.K().me_();
        userMe_2.getClass();
        List<PurchaseType> listM21179f = qqh0Var.m21179f(userMe_2);
        eg30Var.purchaseTypes = listM21179f;
        ((jh30) ((jq2) eg30Var).viewModel).m17065U0(listM21179f, true);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m13896j0(eg30 eg30Var, long j) {
        if (eg30Var.act() != null) {
            eg30Var.m13941v2(j);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public static Boolean m13897j1(CoreAssetsSettings coreAssetsSettings) {
        return Boolean.valueOf(NullChecker.b(coreAssetsSettings));
    }

    /* JADX INFO: renamed from: j2 */
    public static Boolean m13898j2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m13899k0(Throwable th) {
    }

    /* JADX INFO: renamed from: k1 */
    public static j760 m13900k1(UserPrivilege userPrivilege, c cVar) {
        return new j760(userPrivilege, cVar);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m13901k2(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m13902l0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l1 */
    public static void m13903l1(eg30 eg30Var, Throwable th) {
        ((jh30) ((jq2) eg30Var).viewModel).getIntlMeTabDiscountEntryHost().m25651d();
    }

    /* JADX INFO: renamed from: l2 */
    public static void m13904l2(eg30 eg30Var, long j, Long l2) {
        if (!CoreModule.c.j0.Q4()) {
            eg30Var.m13914p2();
            qqh0 qqh0Var = qqh0.INSTANCE;
            User userP9 = CoreModule.c.e0.p9();
            userP9.getClass();
            List<PurchaseType> listM21179f = qqh0Var.m21179f(userP9);
            eg30Var.purchaseTypes = listM21179f;
            ((jh30) ((jq2) eg30Var).viewModel).m17065U0(listM21179f, true);
            return;
        }
        if (NullChecker.a(eg30Var.act())) {
            ((jh30) ((jq2) eg30Var).viewModel).m17113u1(CoreModule.c.j0.C4().titleText + " " + zck0.a(j, true, true, true, true));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static j760 m13905m0(CoreAssetsSettings coreAssetsSettings, c cVar) {
        return new j760(coreAssetsSettings, cVar);
    }

    /* JADX INFO: renamed from: m1 */
    public static CoreAssetsSettings m13906m1(j760 j760Var) {
        j760Var.getClass();
        return (CoreAssetsSettings) j760Var.a;
    }

    /* JADX INFO: renamed from: m2 */
    public static Long m13907m2(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m13908n0(eg30 eg30Var, Integer num) {
        if (num.intValue() >= 0) {
            ((jh30) ((jq2) eg30Var).viewModel).m17083f1(num.intValue());
        }
    }

    /* JADX INFO: renamed from: n1 */
    public static j760 m13909n1(boolean z, boolean z2) {
        return new j760(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: o0 */
    public static j760 m13910o0(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: o1 */
    public static void m13911o1(eg30 eg30Var, roj0 roj0Var) {
        RiskSelfData riskSelfDataNew_ = RiskSelfData.new_();
        riskSelfDataNew_.ceilText = "多次發佈廣告，被標記為風險用戶";
        ((jh30) ((jq2) eg30Var).viewModel).m17063T0(riskSelfDataNew_);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m13912p0(eg30 eg30Var, Unit unit) {
        jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
        User userNa = CoreModule.c.e0.na();
        userNa.getClass();
        jh30Var.m17072Y0(userNa);
    }

    /* JADX INFO: renamed from: p1 */
    public static Long m13913p1(roj0 roj0Var) {
        return Long.valueOf(CoreModule.c.I0.K3());
    }

    /* JADX INFO: renamed from: p2 */
    private final void m13914p2() {
        ((jh30) ((jq2) this).viewModel).m17112u0();
        NewMainAct newMainActAct = act();
        if ((newMainActAct instanceof NewMainAct) && !CoreModule.c.x0.T3()) {
            newMainActAct.m3879a6();
        }
        c4g0 c4g0Var = this.freeTrialSubscription;
        if (c4g0Var != null) {
            if (c4g0Var == null) {
                Intrinsics.r("freeTrialSubscription");
                c4g0Var = null;
            }
            mkd0.z(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m13915q0(Ref.LongRef longRef, eg30 eg30Var, Long l2) {
        String strA = zck0.a(longRef.element, true, true, true, true);
        if (Intrinsics.d("00:00:00", strA)) {
            longRef.element = qqh0.INSTANCE.m21178e();
        }
        jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
        strA.getClass();
        jh30Var.m17093k1(strA);
    }

    /* JADX INFO: renamed from: q1 */
    public static Boolean m13916q1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static Long m13917r0(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Long.valueOf(intlCurrencyDiamond.available);
    }

    /* JADX INFO: renamed from: r1 */
    public static void m13918r1(eg30 eg30Var, TabName tabName) {
        if (NullChecker.a(CoreModule.c.e0.p9())) {
            User userP9 = CoreModule.c.e0.p9();
            userP9.getClass();
            eg30Var.user = userP9;
            IapAffiliatePromotion iapAffiliatePromotionI3 = CoreModule.c.x0.I3();
            qqh0 qqh0Var = qqh0.INSTANCE;
            User user = eg30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.r("user");
                user = null;
            }
            int iIndexOf = qqh0Var.m21179f(user).indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (iapAffiliatePromotionI3 != null && iIndexOf >= 0) {
                ((jh30) ((jq2) eg30Var).viewModel).m17052O(iIndexOf);
                return;
            }
            jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
            User user3 = eg30Var.user;
            if (user3 == null) {
                Intrinsics.r("user");
            } else {
                user2 = user3;
            }
            jh30Var.m17052O(qqh0Var.m21177d(user2));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m13919s0(Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static void m13920s1(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static rx.c m13921t0(List list) {
        return h6a.c() ? CoreModule.c.G2.s3() : rx.c.just(roj0.a);
    }

    /* JADX INFO: renamed from: t1 */
    public static Boolean m13922t1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u0 */
    public static Boolean m13923u0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u1 */
    public static Long m13924u1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v1 */
    public static void m13925v1(eg30 eg30Var, Counter counter) {
        User user = null;
        if (((!n3b0.s((Counter) null, 1, (Object) null) && eg30Var.purchaseTypes.contains(PurchaseType.TYPE_GET_LIKERS)) || (n3b0.s((Counter) null, 1, (Object) null) && !eg30Var.purchaseTypes.contains(PurchaseType.TYPE_GET_LIKERS))) && NullChecker.a(CoreModule.c.e0.p9())) {
            User userP9 = CoreModule.c.e0.p9();
            userP9.getClass();
            eg30Var.user = userP9;
            List<PurchaseType> listM21179f = qqh0.INSTANCE.m21179f(userP9);
            eg30Var.purchaseTypes = listM21179f;
            ((jh30) ((jq2) eg30Var).viewModel).m17065U0(listM21179f, false);
            jh30 jh30Var = (jh30) ((jq2) eg30Var).viewModel;
            User user2 = eg30Var.user;
            if (user2 == null) {
                Intrinsics.r("user");
            } else {
                user = user2;
            }
            jh30Var.m17107r1(user);
        }
        List<Picture.ImageUri> list = eg30Var.list;
        if (list != null) {
            ((jh30) ((jq2) eg30Var).viewModel).m17067V0(list);
        }
    }

    /* JADX INFO: renamed from: w2 */
    private final boolean m13926w2() {
        return (wvv.u() || wvv.t()) && !wn90.m24339F().m24381N();
    }

    /* JADX INFO: renamed from: x0 */
    public static CoreAssetsSettings m13927x0(Function1 function1, Object obj) {
        return (CoreAssetsSettings) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m13928x1(eg30 eg30Var, IntlTabMePayGuide intlTabMePayGuide) {
        ((jh30) ((jq2) eg30Var).viewModel).m17055P0(intlTabMePayGuide);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m13929y0(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static void m13930z0(Throwable th) {
    }

    /* JADX INFO: renamed from: z1 */
    public static void m13931z1(eg30 eg30Var, CoreAssetsSettings coreAssetsSettings) {
        if ((TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "grey") && v2a.d())) && !((jh30) ((jq2) eg30Var).viewModel).m17044J0()) {
            CoreModule.c.e0.Z9();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m13932a0() {
        super.a0();
        creates(new e30() { // from class: l.hd30
            public final void call(Object obj) {
                eg30.m13878b1(this.f13977a, (Bundle) obj);
            }
        }, new d30() { // from class: l.pc30
            public final void call() {
                eg30.m13892h2(this.f18464a);
            }
        });
        rx.c cVarDistinctUntilChanged = v930.k().distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: l.bd30
            public final Object invoke(Object obj) {
                return eg30.m13875Z1((TabName) obj);
            }
        };
        duringCreated(cVarDistinctUntilChanged.filter(new w9j() { // from class: l.nd30
            public final Object call(Object obj) {
                return eg30.m13898j2(function1, obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.zd30
            public final void call(Object obj) {
                eg30.m13918r1(this.f23583a, (TabName) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.le30
            public final void call(Object obj) {
                eg30.m13856P0(this.f16117a, (User) obj);
            }
        }));
        duringCreated(CoreModule.c.n3()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.xe30
            public final void call(Object obj) {
                eg30.m13925v1(this.f22567a, (Counter) obj);
            }
        }));
        rx.c cVarDuringCreated = duringCreated(CoreModule.c.e0.o9());
        final Function1 function2 = new Function1() { // from class: l.jf30
            public final Object invoke(Object obj) {
                return eg30.m13854O0((User) obj);
            }
        };
        rx.c cVarDistinctUntilChanged2 = cVarDuringCreated.map(new w9j() { // from class: l.uf30
            public final Object call(Object obj) {
                return eg30.m13837D0(function2, obj);
            }
        }).distinctUntilChanged();
        final Function1 function3 = new Function1() { // from class: l.wf30
            public final Object invoke(Object obj) {
                return eg30.m13894i1(this.f22076a, (Picture.ImageUri) obj);
            }
        };
        cVarDistinctUntilChanged2.doOnNext(new e30() { // from class: l.sd30
            public final void call(Object obj) {
                eg30.m13858Q0(function3, obj);
            }
        }).subscribe(mkd0.B());
        rx.c cVarTake = CoreModule.c.e0.R7().take(1);
        final Function1 function4 = new Function1() { // from class: l.de30
            public final Object invoke(Object obj) {
                return eg30.m13889g2(this.f11783a, (CurrencyTypeData) obj);
            }
        };
        duringCreated(cVarTake.flatMap(new w9j() { // from class: l.oe30
            public final Object call(Object obj) {
                return eg30.m13849J1(function4, obj);
            }
        })).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.ze30
            public final void call(Object obj) {
                eg30.m13845H1(this.f23623a, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.kf30
            public final void call(Object obj) {
                eg30.m13848J0((Throwable) obj);
            }
        }));
        rx.c cVarSkip = duringCreated(CoreModule.c.I0.M3()).skip(1);
        final Function1 function5 = new Function1() { // from class: l.vf30
            public final Object invoke(Object obj) {
                return eg30.m13859Q1((IntlCurrencyDiamond) obj);
            }
        };
        rx.c cVarFilter = cVarSkip.filter(new w9j() { // from class: l.dg30
            public final Object call(Object obj) {
                return eg30.m13880c1(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.mc30
            public final Object invoke(Object obj) {
                return eg30.m13917r0((IntlCurrencyDiamond) obj);
            }
        };
        cVarFilter.map(new w9j() { // from class: l.nc30
            public final Object call(Object obj) {
                return eg30.m13907m2(function6, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.oc30
            public final void call(Object obj) {
                eg30.m13871X0(this.f17893a, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.qc30
            public final void call(Object obj) {
                eg30.m13870W1((Throwable) obj);
            }
        }));
        rx.c cVarSkip2 = duringCreated(CoreModule.c.H0.a5()).skip(1);
        final Function1 function7 = new Function1() { // from class: l.rc30
            public final Object invoke(Object obj) {
                return eg30.m13881c2((Coin) obj);
            }
        };
        rx.c cVarFilter2 = cVarSkip2.filter(new w9j() { // from class: l.sc30
            public final Object call(Object obj) {
                return eg30.m13922t1(function7, obj);
            }
        });
        final Function1 function8 = new Function1() { // from class: l.tc30
            public final Object invoke(Object obj) {
                return eg30.m13835C0((Coin) obj);
            }
        };
        cVarFilter2.map(new w9j() { // from class: l.uc30
            public final Object call(Object obj) {
                return eg30.m13924u1(function8, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.vc30
            public final void call(Object obj) {
                eg30.m13896j0(this.f21528a, ((Long) obj).longValue());
            }
        }, new e30() { // from class: l.xc30
            public final void call(Object obj) {
                eg30.m13833A0((Throwable) obj);
            }
        }));
        if (u59.S()) {
            rx.c cVarU3 = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip"));
            rx.c cVarLifecycle = lifecycle();
            final Function2 function9 = new Function2() { // from class: l.yc30
                public final Object invoke(Object obj, Object obj2) {
                    return eg30.m13900k1((UserPrivilege) obj, (c) obj2);
                }
            };
            rx.c cVarDuringCreated2 = duringCreated(mkd0.r(cVarU3, cVarLifecycle, new x9j() { // from class: l.zc30
                public final Object call(Object obj, Object obj2) {
                    return eg30.m13836C1(function9, obj, obj2);
                }
            }));
            final Function1 function10 = new Function1() { // from class: l.ad30
                public final Object invoke(Object obj) {
                    return eg30.m13874Y1((j760) obj);
                }
            };
            cVarDuringCreated2.filter(new w9j() { // from class: l.cd30
                public final Object call(Object obj) {
                    return eg30.m13916q1(function10, obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.dd30
                public final void call(Object obj) {
                    eg30.m13869W0(this.f11772a, (j760) obj);
                }
            }, new e30() { // from class: l.ed30
                public final void call(Object obj) {
                    eg30.m13883d2((Throwable) obj);
                }
            }));
        }
        if (u59.U()) {
            rx.c cVarU4 = CoreModule.c.C0.u3(SummarizedPrivilegesId.get("ultraPremium"));
            rx.c cVarLifecycle2 = lifecycle();
            final Function2 function11 = new Function2() { // from class: l.fd30
                public final Object invoke(Object obj, Object obj2) {
                    return eg30.m13887f2((UserPrivilege) obj, (c) obj2);
                }
            };
            rx.c cVarDuringCreated3 = duringCreated(mkd0.r(cVarU4, cVarLifecycle2, new x9j() { // from class: l.gd30
                public final Object call(Object obj, Object obj2) {
                    return eg30.m13879b2(function11, obj, obj2);
                }
            }));
            final Function1 function12 = new Function1() { // from class: l.id30
                public final Object invoke(Object obj) {
                    return eg30.m13838D1((j760) obj);
                }
            };
            cVarDuringCreated3.filter(new w9j() { // from class: l.jd30
                public final Object call(Object obj) {
                    return eg30.m13853N1(function12, obj);
                }
            }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.kd30
                public final void call(Object obj) {
                    eg30.m13851L1(this.f15609a, (j760) obj);
                }
            }, new e30() { // from class: l.ld30
                public final void call(Object obj) {
                    eg30.m13872X1((Throwable) obj);
                }
            }));
        }
        rx.c cVarDistinctUntilChanged3 = CoreModule.c.e0.C0.distinctUntilChanged();
        rx.c cVarDistinctUntilChanged4 = CoreModule.c.e0.o9().distinctUntilChanged();
        final Function2 function13 = new Function2() { // from class: l.md30
            public final Object invoke(Object obj, Object obj2) {
                return eg30.m13855O1((AppealInfo) obj, (User) obj2);
            }
        };
        duringCreated(mkd0.r(cVarDistinctUntilChanged3, cVarDistinctUntilChanged4, new x9j() { // from class: l.od30
            public final Object call(Object obj, Object obj2) {
                return eg30.m13910o0(function13, obj, obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.pd30
            public final void call(Object obj) {
                eg30.m13890h0(this.f18485a, (j760) obj);
            }
        }));
        rx.c cVarD = CoreModule.d.d();
        rx.c cVarLifecycle3 = lifecycle();
        final Function2 function14 = new Function2() { // from class: l.qd30
            public final Object invoke(Object obj, Object obj2) {
                return eg30.m13905m0((CoreAssetsSettings) obj, (c) obj2);
            }
        };
        rx.c cVarDuringCreated4 = duringCreated(mkd0.r(cVarD, cVarLifecycle3, new x9j() { // from class: l.rd30
            public final Object call(Object obj, Object obj2) {
                return eg30.m13867V0(function14, obj, obj2);
            }
        }));
        final Function1 function15 = new Function1() { // from class: l.td30
            public final Object invoke(Object obj) {
                return eg30.m13847I1((j760) obj);
            }
        };
        rx.c cVarFilter3 = cVarDuringCreated4.filter(new w9j() { // from class: l.ud30
            public final Object call(Object obj) {
                return eg30.m13902l0(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: l.vd30
            public final Object invoke(Object obj) {
                return eg30.m13906m1((j760) obj);
            }
        };
        rx.c map = cVarFilter3.map(new w9j() { // from class: l.wd30
            public final Object call(Object obj) {
                return eg30.m13927x0(function16, obj);
            }
        });
        final Function1 function17 = new Function1() { // from class: l.xd30
            public final Object invoke(Object obj) {
                return eg30.m13897j1((CoreAssetsSettings) obj);
            }
        };
        map.filter(new w9j() { // from class: l.yd30
            public final Object call(Object obj) {
                return eg30.m13873Y0(function17, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ae30
            public final void call(Object obj) {
                eg30.m13931z1(this.f9429a, (CoreAssetsSettings) obj);
            }
        }, new e30() { // from class: l.be30
            public final void call(Object obj) {
                eg30.m13865U0((Throwable) obj);
            }
        }));
        rx.c cVarDuringCreated5 = duringCreated(ah60.m11408E());
        final Function1 function18 = new Function1() { // from class: l.ce30
            public final Object invoke(Object obj) {
                return eg30.m13893i0((PaymentResultWrapper) obj);
            }
        };
        rx.c cVarFilter4 = cVarDuringCreated5.filter(new w9j() { // from class: l.ee30
            public final Object call(Object obj) {
                return eg30.m13840E1(function18, obj);
            }
        });
        final Function1 function19 = new Function1() { // from class: l.fe30
            public final Object invoke(Object obj) {
                return eg30.m13852N0((PaymentResultWrapper) obj);
            }
        };
        cVarFilter4.flatMap(new w9j() { // from class: l.ge30
            public final Object call(Object obj) {
                return eg30.m13861R1(function19, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.he30
            public final void call(Object obj) {
                eg30.m13895i2(this.f14011a, obj);
            }
        }));
        rx.c cVarDistinctUntilChanged5 = CoreModule.c.C0.x3().distinctUntilChanged();
        final Function1 function20 = new Function1() { // from class: l.ie30
            public final Object invoke(Object obj) {
                return eg30.m13921t0((List) obj);
            }
        };
        duringCreated(cVarDistinctUntilChanged5.flatMap(new w9j() { // from class: l.je30
            public final Object call(Object obj) {
                return eg30.m13884e1(function20, obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ke30
            public final void call(Object obj) {
                eg30.m13844H0(this.f15618a, obj);
            }
        }));
        duringCreated(CoreModule.c.u0.K6(25, true)).subscribe(mkd0.H(new e30() { // from class: l.me30
            public final void call(Object obj) {
                eg30.m13886f1(this.f16850a, (j760) obj);
            }
        }, new e30() { // from class: l.ne30
            public final void call(Object obj) {
                eg30.m13868V1((Throwable) obj);
            }
        }));
        c4g0 c4g0VarO = j63.j().o(mkd0.G(new e30() { // from class: l.pe30
            public final void call(Object obj) {
                eg30.m13866U1(this.f18505a, (Pair) obj);
            }
        }));
        c4g0VarO.getClass();
        this.boostSubscription = c4g0VarO;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = qqh0.INSTANCE.m21178e();
        c4g0 c4g0VarSubscribe = duringCreated(rx.c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.qe30
            public final void call(Object obj) {
                eg30.m13915q0(longRef, this, (Long) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.picksSubscription = c4g0VarSubscribe;
        if (u59.S()) {
            duringCreated(uld0.e().f().obs().distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.re30
                public final void call(Object obj) {
                    eg30.m13864T1(this.f19782a, (Boolean) obj);
                }
            }, new e30() { // from class: l.se30
                public final void call(Object obj) {
                    eg30.m13901k2((Throwable) obj);
                }
            }));
        }
        ec9 ec9Var = CoreModule.c.X1;
        a aVar = ec9Var.U;
        a aVar2 = ec9Var.T;
        final Function2 function21 = new Function2() { // from class: l.te30
            public final Object invoke(Object obj, Object obj2) {
                return eg30.m13909n1(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        rx.c cVarDuringCreated6 = duringCreated(mkd0.r(aVar, aVar2, new x9j() { // from class: l.ue30
            public final Object call(Object obj, Object obj2) {
                return eg30.m13850L0(function21, obj, obj2);
            }
        }));
        final Function1 function22 = new Function1() { // from class: l.ve30
            public final Object invoke(Object obj) {
                return eg30.m13839E0((j760) obj);
            }
        };
        cVarDuringCreated6.filter(new w9j() { // from class: l.we30
            public final Object call(Object obj) {
                return eg30.m13923u0(function22, obj);
            }
        }).take(1).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.ye30
            public final void call(Object obj) {
                eg30.m13846I0(this.f23008a, (j760) obj);
            }
        }, new e30() { // from class: l.af30
            public final void call(Object obj) {
                eg30.m13920s1((Throwable) obj);
            }
        }));
        if (u59.D()) {
            duringCreated(CoreModule.c.d2.k3()).subscribe(mkd0.H(new e30() { // from class: l.bf30
                public final void call(Object obj) {
                    eg30.m13885e2(this.f10045a, (HideAndSeekBannerEnv) obj);
                }
            }, new e30() { // from class: l.cf30
                public final void call(Object obj) {
                    eg30.m13919s0((Throwable) obj);
                }
            }));
        }
        NewMainAct newMainActAct = act();
        newMainActAct.getClass();
        rx.c cVarDuringCreated7 = duringCreated(newMainActAct.m3865S5());
        final Function1 function23 = new Function1() { // from class: l.df30
            public final Object invoke(Object obj) {
                return eg30.m13834B1((Boolean) obj);
            }
        };
        cVarDuringCreated7.filter(new w9j() { // from class: l.ef30
            public final Object call(Object obj) {
                return eg30.m13857P1(function23, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ff30
            public final void call(Object obj) {
                eg30.m13863S1(this.f12984a, (Boolean) obj);
            }
        }, new e30() { // from class: l.gf30
            public final void call(Object obj) {
                eg30.m13929y0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.x0.r4()).subscribe(mkd0.H(new e30() { // from class: l.hf30
            public final void call(Object obj) {
                eg30.m13876a1(this.f14033a, (Long) obj);
            }
        }, new e30() { // from class: l.if30
            public final void call(Object obj) {
                eg30.m13860R0((Throwable) obj);
            }
        }));
        if (u59.u()) {
            if (NullChecker.a(CoreModule.c.t2.R) && ((Boolean) CoreModule.c.t2.R.get()).booleanValue()) {
                duringCreated(rx.c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.lf30
                    public final void call(Object obj) {
                        eg30.m13911o1(this.f16132a, (roj0) obj);
                    }
                }));
            } else {
                duringCreated(CoreModule.c.t2.l3("me")).filter(new z600()).subscribe(mkd0.H(new e30() { // from class: l.mf30
                    public final void call(Object obj) {
                        eg30.m13841F0(this.f16871a, (RiskSelfData) obj);
                    }
                }, new e30() { // from class: l.nf30
                    public final void call(Object obj) {
                        eg30.m13862S0((Throwable) obj);
                    }
                }));
            }
        }
        duringCreated(lfn.INSTANCE.m17878b()).subscribe(mkd0.H(new e30() { // from class: l.of30
            public final void call(Object obj) {
                eg30.m13912p0(this.f17944a, (Unit) obj);
            }
        }, new e30() { // from class: l.pf30
            public final void call(Object obj) {
                eg30.m13930z0((Throwable) obj);
            }
        }));
        if (!IntlCountryCodeController.k()) {
            duringCreated(new v9j() { // from class: l.qf30
                public final Object call() {
                    return eg30.m13877a2();
                }
            }, false).subscribe(mkd0.G(new e30() { // from class: l.rf30
                public final void call(Object obj) {
                    eg30.m13928x1(this.f19792a, (IntlTabMePayGuide) obj);
                }
            }));
        }
        duringCreated(CoreModule.c.x0.q4()).subscribe(mkd0.H(new e30() { // from class: l.sf30
            public final void call(Object obj) {
                eg30.m13843G0(this.f20219a, (Boolean) obj);
            }
        }, new e30() { // from class: l.tf30
            public final void call(Object obj) {
                eg30.m13903l1(this.f20654a, (Throwable) obj);
            }
        }));
    }

    public void destroy() {
        c4g0 c4g0Var = this.boostSubscription;
        c4g0 c4g0Var2 = null;
        if (c4g0Var != null) {
            if (c4g0Var == null) {
                Intrinsics.r("boostSubscription");
                c4g0Var = null;
            }
            mkd0.z(c4g0Var);
        }
        c4g0 c4g0Var3 = this.picksSubscription;
        if (c4g0Var3 != null) {
            if (c4g0Var3 == null) {
                Intrinsics.r("picksSubscription");
            } else {
                c4g0Var2 = c4g0Var3;
            }
            mkd0.z(c4g0Var2);
        }
    }

    @Override // p009l.qta0
    /* JADX INFO: renamed from: g0 */
    public void mo13933g0(boolean hidden) {
        if (hidden) {
            return;
        }
        if (this.mUser == null) {
            User userP9 = CoreModule.c.e0.p9();
            userP9.getClass();
            this.mUser = userP9;
        }
        jh30 jh30Var = (jh30) ((jq2) this).viewModel;
        User user = this.mUser;
        if (user == null) {
            Intrinsics.r("mUser");
            user = null;
        }
        jh30Var.m17101o1(user);
        m13943y2();
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m13934n2() {
        return u59.S() && !((Boolean) uld0.e().f().get()).booleanValue();
    }

    /* JADX INFO: renamed from: o2 */
    public final rx.c<Long> m13935o2() {
        if (CoreModule.K().xf()) {
            rx.c cVarN3 = CoreModule.c.I0.N3();
            final Function1 function1 = new Function1() { // from class: l.xf30
                public final Object invoke(Object obj) {
                    return eg30.m13913p1((roj0) obj);
                }
            };
            rx.c<Long> map = cVarN3.map(new w9j() { // from class: l.yf30
                public final Object call(Object obj) {
                    return eg30.m13882d1(function1, obj);
                }
            });
            map.getClass();
            return map;
        }
        rx.c cVarA5 = CoreModule.c.H0.a5();
        final Function1 function2 = new Function1() { // from class: l.zf30
            public final Object invoke(Object obj) {
                return eg30.m13888g1((Coin) obj);
            }
        };
        rx.c<Long> map2 = cVarA5.map(new w9j() { // from class: l.ag30
            public final Object call(Object obj) {
                return eg30.m13842F1(function2, obj);
            }
        });
        map2.getClass();
        return map2;
    }

    @Override // p009l.qta0
    @NotNull
    public String pageId() {
        return "p_navigation_view";
    }

    /* JADX INFO: renamed from: q2 */
    public final void m13936q2() {
        dfx.INSTANCE.m13328m();
        m13940u2(ProfileListFrag.class);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m13937r2() {
        if (!NullChecker.a(CoreModule.c.o3()) || CoreModule.c.o3().likersLimit.remaining <= 0) {
            FakeLikersAct.Y1(act(), "p_navigation_view,e_see_banner,intl_click");
            return;
        }
        jh30 jh30Var = (jh30) ((jq2) this).viewModel;
        Intent intentX1 = LikersAct.X1(act(), "");
        intentX1.getClass();
        jh30Var.m17097m1(intentX1);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m13938s2() {
        new ukf0(act()).a();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m13939t2() {
        dfx.INSTANCE.m13329n();
        if (m13926w2()) {
            wn90.m24339F().m24403p0(true);
        }
        m13940u2(SettingsFragOld.class);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m13940u2(Class<? extends PutongFrag> fragment) {
        Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", fragment.getSimpleName());
        ((jh30) ((jq2) this).viewModel).m17097m1(intent);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m13941v2(long available) {
        Act act = act();
        if (act != null) {
            String string = act.getString(CoreModule.K().xf() ? R$string.f6235g8 : R.string.Ap, swh0.U(available));
            string.getClass();
            ((jh30) ((jq2) this).viewModel).m17057Q0(string);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m13942x2() {
        final long j = CoreModule.c.j0.C4().endTime * 1000;
        if (this.freeTrialSubscription == null) {
            ((jh30) ((jq2) this).viewModel).m17111t1();
            qqh0 qqh0Var = qqh0.INSTANCE;
            User userP9 = CoreModule.c.e0.p9();
            userP9.getClass();
            List<PurchaseType> listM21179f = qqh0Var.m21179f(userP9);
            this.purchaseTypes = listM21179f;
            ((jh30) ((jq2) this).viewModel).m17065U0(listM21179f, true);
            c4g0 c4g0VarSubscribe = duringCreated(rx.c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.bg30
                public final void call(Object obj) {
                    eg30.m13904l2(this.f10060a, j, (Long) obj);
                }
            }, new e30() { // from class: l.cg30
                public final void call(Object obj) {
                    eg30.m13891h1((Throwable) obj);
                }
            }));
            c4g0VarSubscribe.getClass();
            this.freeTrialSubscription = c4g0VarSubscribe;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final void m13943y2() {
        if (ura.e().d().ir()) {
            CoreModule.c.E1.G3();
            ((jh30) ((jq2) this).viewModel).m17115v1();
            if (this.visitorIsInit) {
                return;
            }
            this.visitorIsInit = true;
            duringCreated(CoreModule.c.E1.H3()).subscribe(mkd0.H(new e30() { // from class: l.lc30
                public final void call(Object obj) {
                    eg30.m13908n0(this.f16065a, (Integer) obj);
                }
            }, new e30() { // from class: l.wc30
                public final void call(Object obj) {
                    eg30.m13899k0((Throwable) obj);
                }
            }));
        }
    }
}
