package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.HideAndSeekBannerEnv;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RiskSelfData;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersAct;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CurrencyTypeData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\t2\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0010J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0010J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b&\u0010\u0010J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u0010R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00106R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020<0(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010+R\u0016\u0010@\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010/R\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00102¨\u0006C"}, m88121d2 = {"Ll/so30;", "Ll/u1b0;", "Ll/xp30;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "available", "", "v2", "(J)V", "Lrx/c;", "o2", "()Lrx/c;", "y2", "()V", "", "n2", "()Z", "Ljava/lang/Class;", "Lcom/p1/mobile/putong/app/PutongFrag;", "fragment", "u2", "(Ljava/lang/Class;)V", "w2", "p2", "hidden", "g0", "(Z)V", "", "pageId", "()Ljava/lang/String;", "destroy", "a0", "q2", "t2", "s2", "r2", "x2", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "a", "Ljava/util/List;", "purchaseTypes", "Lcom/p1/mobile/putong/data/User;", "b", "Lcom/p1/mobile/putong/data/User;", "user", "c", "Z", "hasLocation", "Ll/kcg0;", Constants.INAPP_DATA_TAG, "Ll/kcg0;", "freeTrialSubscription", "e", "boostSubscription", "f", "picksSubscription", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "g", "list", "h", "mUser", RXScreenCaptureService.KEY_INDEX, "visitorIsInit", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class so30 extends u1b0<xp30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public User user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean hasLocation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public kcg0 freeTrialSubscription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public kcg0 boostSubscription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public kcg0 picksSubscription;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public List<Picture.ImageUri> list;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public User mUser;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean visitorIsInit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so30(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.purchaseTypes = new ArrayList();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m187043A0(Throwable th) {
    }

    /* JADX INFO: renamed from: B1 */
    public static Boolean m187044B1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: C0 */
    public static Long m187045C0(Coin coin) {
        return Long.valueOf(coin.available);
    }

    /* JADX INFO: renamed from: C1 */
    public static pf60 m187046C1(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: D0 */
    public static Picture.ImageUri m187047D0(Function1 function1, Object obj) {
        return (Picture.ImageUri) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D1 */
    public static Boolean m187048D1(pf60 pf60Var) {
        boolean z;
        if ((pf60Var != null ? (C4470c) pf60Var.f152157b : null) != C4470c.f16267i) {
            z = false;
        } else {
            if (joa.m146382d4(pf60Var != null ? (UserPrivilege) pf60Var.f152156a : null)) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: E0 */
    public static Boolean m187049E0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        Boolean bool = Boolean.TRUE;
        return Boolean.valueOf(Intrinsics.m88377d(f, bool) && Intrinsics.m88377d(pf60Var.f152157b, bool));
    }

    /* JADX INFO: renamed from: E1 */
    public static Boolean m187050E1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m187051F0(so30 so30Var, RiskSelfData riskSelfData) {
        riskSelfData.getClass();
        ((xp30) so30Var.viewModel).m212573U0(riskSelfData);
    }

    /* JADX INFO: renamed from: F1 */
    public static Long m187052F1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G0 */
    public static void m187053G0(so30 so30Var, Boolean bool) {
        ((xp30) so30Var.viewModel).getIntlMeTabDiscountEntryHost().m219359d();
        ((xp30) so30Var.viewModel).m212621v0();
        ((xp30) so30Var.viewModel).m212620u1();
        if (so30Var.purchaseTypes.isEmpty() || CoreModule.f18264c.f20438x0.m31177I3() == null) {
            return;
        }
        ((xp30) so30Var.viewModel).m212575V0(so30Var.purchaseTypes, true);
    }

    /* JADX INFO: renamed from: H0 */
    public static void m187054H0(so30 so30Var, Object obj) {
        if (CoreModule.f18264c.f20396j0.m31607Q4()) {
            return;
        }
        so30Var.m187124p2();
        yyh0 yyh0Var = yyh0.INSTANCE;
        User userMe_ = CoreModule.m30930K().me_();
        userMe_.getClass();
        yyh0Var.m217990f(userMe_);
        ((xp30) so30Var.viewModel).m212620u1();
        User userMe_2 = CoreModule.m30930K().me_();
        userMe_2.getClass();
        List<PurchaseType> listM217990f = yyh0Var.m217990f(userMe_2);
        so30Var.purchaseTypes = listM217990f;
        ((xp30) so30Var.viewModel).m212575V0(listM217990f, true);
    }

    /* JADX INFO: renamed from: H1 */
    public static void m187055H1(so30 so30Var, long j) {
        if (so30Var.act() != null) {
            so30Var.m187149v2(j);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m187056I0(so30 so30Var, pf60 pf60Var) {
        ((xp30) so30Var.viewModel).m212569S0();
    }

    /* JADX INFO: renamed from: I1 */
    public static Boolean m187057I1(pf60 pf60Var) {
        return Boolean.valueOf(pf60Var.f152157b == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m187058J0(Throwable th) {
    }

    /* JADX INFO: renamed from: J1 */
    public static C22421c m187059J1(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L0 */
    public static pf60 m187060L0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L1 */
    public static void m187061L1(so30 so30Var, pf60 pf60Var) {
        User userMe_ = CoreModule.m30930K().me_();
        userMe_.getClass();
        so30Var.user = userMe_;
        if (NullChecker.m82486a(userMe_)) {
            xp30 xp30Var = (xp30) so30Var.viewModel;
            User user = so30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.m88391r("user");
                user = null;
            }
            xp30Var.m212616s1(user);
            yyh0 yyh0Var = yyh0.INSTANCE;
            User user3 = so30Var.user;
            if (user3 == null) {
                Intrinsics.m88391r("user");
            } else {
                user2 = user3;
            }
            List<PurchaseType> listM217990f = yyh0Var.m217990f(user2);
            so30Var.purchaseTypes = listM217990f;
            ((xp30) so30Var.viewModel).m212575V0(listM217990f, false);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static C22421c m187062N0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        return t7a.m189547c() ? CoreModule.f18264c.f20311G2.m153661s3() : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: N1 */
    public static Boolean m187063N1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O0 */
    public static Picture.ImageUri m187064O0(User user) {
        user.getClass();
        return user.m61308fp().calculatedWidth(qa00.f156302O);
    }

    /* JADX INFO: renamed from: O1 */
    public static pf60 m187065O1(AppealInfo appealInfo, User user) {
        appealInfo.getClass();
        user.getClass();
        return new pf60(appealInfo, user);
    }

    /* JADX INFO: renamed from: P0 */
    public static void m187066P0(so30 so30Var, User user) {
        xp30 xp30Var = (xp30) so30Var.viewModel;
        user.getClass();
        xp30Var.m212582Z0(user);
        ((xp30) so30Var.viewModel).m212588d1(user);
        xp30 xp30Var2 = (xp30) so30Var.viewModel;
        String str = user.publicId;
        str.getClass();
        xp30Var2.m212579X0(str);
        ((xp30) so30Var.viewModel).m212584a1(user);
        List<PurchaseType> listM217990f = yyh0.INSTANCE.m217990f(user);
        so30Var.purchaseTypes = listM217990f;
        ((xp30) so30Var.viewModel).m212575V0(listM217990f, false);
        ((xp30) so30Var.viewModel).m212614r1();
        ((xp30) so30Var.viewModel).m212616s1(user);
        ((xp30) so30Var.viewModel).m212620u1();
        ((xp30) so30Var.viewModel).m212612q1(user);
        ((xp30) so30Var.viewModel).m212618t1(user);
        ((xp30) so30Var.viewModel).m212547D0(user);
        so30Var.user = user;
    }

    /* JADX INFO: renamed from: P1 */
    public static Boolean m187067P1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m187068Q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q1 */
    public static Boolean m187069Q1(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Boolean.valueOf(CoreModule.m30930K().mo31838xf());
    }

    /* JADX INFO: renamed from: R0 */
    public static void m187070R0(Throwable th) {
    }

    /* JADX INFO: renamed from: R1 */
    public static C22421c m187071R1(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S0 */
    public static void m187072S0(Throwable th) {
    }

    /* JADX INFO: renamed from: S1 */
    public static void m187073S1(so30 so30Var, Boolean bool) {
        ((xp30) so30Var.viewModel).m212620u1();
    }

    /* JADX INFO: renamed from: T1 */
    public static void m187074T1(so30 so30Var, Boolean bool) {
        ((xp30) so30Var.viewModel).m212598j1(0, so30Var.m187142n2());
    }

    /* JADX INFO: renamed from: U0 */
    public static void m187075U0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U1 */
    public static void m187076U1(so30 so30Var, Pair pair) {
        pair.getClass();
        Integer num = (Integer) pair.first;
        if (num == null || num.intValue() != 1 || !NullChecker.m82486a(pair.second)) {
            ((xp30) so30Var.viewModel).m212595h1(false);
            return;
        }
        Long l2 = (Long) ((bkj0) pair.second).f77083c;
        String strM171409c = l2 != null ? pa3.m171409c(l2.longValue()) : null;
        if (strM171409c == null) {
            ((xp30) so30Var.viewModel).m212595h1(false);
        } else {
            ((xp30) so30Var.viewModel).m212610p1(strM171409c);
            ((xp30) so30Var.viewModel).m212595h1(true);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static pf60 m187077V0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: V1 */
    public static void m187078V1(Throwable th) {
    }

    /* JADX INFO: renamed from: W0 */
    public static void m187079W0(so30 so30Var, pf60 pf60Var) {
        User userMe_ = CoreModule.m30930K().me_();
        userMe_.getClass();
        so30Var.user = userMe_;
        if (NullChecker.m82486a(userMe_)) {
            xp30 xp30Var = (xp30) so30Var.viewModel;
            User user = so30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.m88391r("user");
                user = null;
            }
            xp30Var.m212616s1(user);
            yyh0 yyh0Var = yyh0.INSTANCE;
            User user3 = so30Var.user;
            if (user3 == null) {
                Intrinsics.m88391r("user");
            } else {
                user2 = user3;
            }
            List<PurchaseType> listM217990f = yyh0Var.m217990f(user2);
            so30Var.purchaseTypes = listM217990f;
            ((xp30) so30Var.viewModel).m212575V0(listM217990f, false);
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static void m187080W1(Throwable th) {
    }

    /* JADX INFO: renamed from: X0 */
    public static void m187081X0(so30 so30Var, long j) {
        if (so30Var.act() != null) {
            so30Var.m187149v2(j);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static void m187082X1(Throwable th) {
    }

    /* JADX INFO: renamed from: Y0 */
    public static Boolean m187083Y0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public static Boolean m187084Y1(pf60 pf60Var) {
        boolean z;
        if ((pf60Var != null ? (C4470c) pf60Var.f152157b : null) != C4470c.f16267i) {
            z = false;
        } else {
            if (joa.m146382d4(pf60Var != null ? (UserPrivilege) pf60Var.f152156a : null)) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Boolean m187085Z1(TabName tabName) {
        tabName.getClass();
        return Boolean.valueOf(tabName == TabName.Me);
    }

    /* JADX INFO: renamed from: a1 */
    public static void m187086a1(so30 so30Var, Long l2) {
        ((xp30) so30Var.viewModel).m212620u1();
        ((xp30) so30Var.viewModel).m212575V0(so30Var.purchaseTypes, true);
        ((xp30) so30Var.viewModel).m212604m1();
    }

    /* JADX INFO: renamed from: a2 */
    public static C22421c m187087a2() {
        return CoreModule.f18264c.f20396j0.m31581D4().distinctUntilChanged();
    }

    /* JADX INFO: renamed from: b1 */
    public static void m187088b1(so30 so30Var, Bundle bundle) {
        ((xp30) so30Var.viewModel).m212590e1();
    }

    /* JADX INFO: renamed from: b2 */
    public static pf60 m187089b2(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: c1 */
    public static Boolean m187090c1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c2 */
    public static Boolean m187091c2(Coin coin) {
        return Boolean.valueOf(!CoreModule.m30930K().mo31838xf());
    }

    /* JADX INFO: renamed from: d1 */
    public static Long m187092d1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d2 */
    public static void m187093d2(Throwable th) {
    }

    /* JADX INFO: renamed from: e1 */
    public static C22421c m187094e1(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e2 */
    public static void m187095e2(so30 so30Var, HideAndSeekBannerEnv hideAndSeekBannerEnv) {
        ((xp30) so30Var.viewModel).m212571T0(hideAndSeekBannerEnv != null ? hideAndSeekBannerEnv.data : null);
    }

    /* JADX INFO: renamed from: f1 */
    public static void m187096f1(so30 so30Var, pf60 pf60Var) {
        S s = pf60Var.f152157b;
        s.getClass();
        List<Picture.ImageUri> listM88425c = TypeIntrinsics.m88425c(s);
        so30Var.list = listM88425c;
        xp30 xp30Var = (xp30) so30Var.viewModel;
        if (listM88425c == null) {
            Intrinsics.m88391r("list");
            listM88425c = null;
        }
        xp30Var.m212577W0(listM88425c);
    }

    /* JADX INFO: renamed from: f2 */
    public static pf60 m187097f2(UserPrivilege userPrivilege, C4470c c4470c) {
        return new pf60(userPrivilege, c4470c);
    }

    /* JADX INFO: renamed from: g1 */
    public static Long m187098g1(Coin coin) {
        return Long.valueOf(coin.available);
    }

    /* JADX INFO: renamed from: g2 */
    public static C22421c m187099g2(so30 so30Var, CurrencyTypeData currencyTypeData) {
        return so30Var.m187143o2();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m187100h0(so30 so30Var, pf60 pf60Var) {
        pf60Var.getClass();
        ((xp30) so30Var.viewModel).m212563P0(pf60Var);
    }

    /* JADX INFO: renamed from: h1 */
    public static void m187101h1(Throwable th) {
    }

    /* JADX INFO: renamed from: h2 */
    public static void m187102h2(so30 so30Var) {
        if (so30Var.hasLocation) {
            return;
        }
        box.INSTANCE.m105720i();
    }

    /* JADX INFO: renamed from: i0 */
    public static Boolean m187103i0(PaymentResultWrapper paymentResultWrapper) {
        paymentResultWrapper.getClass();
        return Boolean.valueOf(wib0.m206579w(paymentResultWrapper.purchaseType) || wib0.m206575s(paymentResultWrapper.purchaseType) || wib0.m206573q(paymentResultWrapper.purchaseType) || wib0.m206578v(paymentResultWrapper.purchaseType));
    }

    /* JADX INFO: renamed from: i1 */
    public static Unit m187104i1(so30 so30Var, Picture.ImageUri imageUri) {
        imageUri.getClass();
        ((xp30) so30Var.viewModel).m212561O0(imageUri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i2 */
    public static void m187105i2(so30 so30Var, Object obj) {
        if (CoreModule.f18264c.f20396j0.m31607Q4()) {
            return;
        }
        so30Var.m187124p2();
        yyh0 yyh0Var = yyh0.INSTANCE;
        User userMe_ = CoreModule.m30930K().me_();
        userMe_.getClass();
        yyh0Var.m217990f(userMe_);
        ((xp30) so30Var.viewModel).m212620u1();
        User userMe_2 = CoreModule.m30930K().me_();
        userMe_2.getClass();
        List<PurchaseType> listM217990f = yyh0Var.m217990f(userMe_2);
        so30Var.purchaseTypes = listM217990f;
        ((xp30) so30Var.viewModel).m212575V0(listM217990f, true);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m187106j0(so30 so30Var, long j) {
        if (so30Var.act() != null) {
            so30Var.m187149v2(j);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public static Boolean m187107j1(CoreAssetsSettings coreAssetsSettings) {
        return Boolean.valueOf(NullChecker.m82487b(coreAssetsSettings));
    }

    /* JADX INFO: renamed from: j2 */
    public static Boolean m187108j2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m187109k0(Throwable th) {
    }

    /* JADX INFO: renamed from: k1 */
    public static pf60 m187110k1(UserPrivilege userPrivilege, C4470c c4470c) {
        return new pf60(userPrivilege, c4470c);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m187111k2(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static Boolean m187112l0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l1 */
    public static void m187113l1(so30 so30Var, Throwable th) {
        ((xp30) so30Var.viewModel).getIntlMeTabDiscountEntryHost().m219359d();
    }

    /* JADX INFO: renamed from: l2 */
    public static void m187114l2(so30 so30Var, long j, Long l2) {
        if (!CoreModule.f18264c.f20396j0.m31607Q4()) {
            so30Var.m187124p2();
            yyh0 yyh0Var = yyh0.INSTANCE;
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            List<PurchaseType> listM217990f = yyh0Var.m217990f(userM116600p9);
            so30Var.purchaseTypes = listM217990f;
            ((xp30) so30Var.viewModel).m212575V0(listM217990f, true);
            return;
        }
        if (NullChecker.m82486a(so30Var.act())) {
            ((xp30) so30Var.viewModel).m212624w1(CoreModule.f18264c.f20396j0.m31579C4().titleText + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + fmk0.m126240a(j, true, true, true, true));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static pf60 m187115m0(CoreAssetsSettings coreAssetsSettings, C4470c c4470c) {
        return new pf60(coreAssetsSettings, c4470c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public static CoreAssetsSettings m187116m1(pf60 pf60Var) {
        pf60Var.getClass();
        return (CoreAssetsSettings) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: m2 */
    public static Long m187117m2(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m187118n0(so30 so30Var, Integer num) {
        if (num.intValue() >= 0) {
            ((xp30) so30Var.viewModel).m212593g1(num.intValue());
        }
    }

    /* JADX INFO: renamed from: n1 */
    public static pf60 m187119n1(boolean z, boolean z2) {
        return new pf60(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: o0 */
    public static pf60 m187120o0(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: o1 */
    public static void m187121o1(so30 so30Var, uxj0 uxj0Var) {
        RiskSelfData riskSelfDataNew_ = RiskSelfData.new_();
        riskSelfDataNew_.ceilText = "多次發佈廣告，被標記為風險用戶";
        ((xp30) so30Var.viewModel).m212573U0(riskSelfDataNew_);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m187122p0(so30 so30Var, Unit unit) {
        xp30 xp30Var = (xp30) so30Var.viewModel;
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        userM116593na.getClass();
        xp30Var.m212582Z0(userM116593na);
    }

    /* JADX INFO: renamed from: p1 */
    public static Long m187123p1(uxj0 uxj0Var) {
        return Long.valueOf(CoreModule.f18264c.f20315I0.m144054K3());
    }

    /* JADX INFO: renamed from: p2 */
    private final void m187124p2() {
        ((xp30) this.viewModel).m212619u0();
        Act act = act();
        if ((act instanceof NewMainAct) && !CoreModule.f18264c.f20438x0.m31188T3()) {
            ((NewMainAct) act).m40812e6();
        }
        kcg0 kcg0Var = this.freeTrialSubscription;
        if (kcg0Var != null) {
            if (kcg0Var == null) {
                Intrinsics.m88391r("freeTrialSubscription");
                kcg0Var = null;
            }
            psd0.m173633z(kcg0Var);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m187125q0(Ref.LongRef longRef, so30 so30Var, Long l2) {
        String strM126240a = fmk0.m126240a(longRef.element, true, true, true, true);
        if (Intrinsics.m88377d("00:00:00", strM126240a)) {
            longRef.element = yyh0.INSTANCE.m217989e();
        }
        xp30 xp30Var = (xp30) so30Var.viewModel;
        strM126240a.getClass();
        xp30Var.m212602l1(strM126240a);
    }

    /* JADX INFO: renamed from: q1 */
    public static Boolean m187126q1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r0 */
    public static Long m187127r0(IntlCurrencyDiamond intlCurrencyDiamond) {
        return Long.valueOf(intlCurrencyDiamond.available);
    }

    /* JADX INFO: renamed from: r1 */
    public static void m187128r1(so30 so30Var, TabName tabName) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            so30Var.user = userM116600p9;
            IapAffiliatePromotion iapAffiliatePromotionM31177I3 = CoreModule.f18264c.f20438x0.m31177I3();
            yyh0 yyh0Var = yyh0.INSTANCE;
            User user = so30Var.user;
            User user2 = null;
            if (user == null) {
                Intrinsics.m88391r("user");
                user = null;
            }
            int iIndexOf = yyh0Var.m217990f(user).indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            if (iapAffiliatePromotionM31177I3 != null && iIndexOf >= 0) {
                ((xp30) so30Var.viewModel).m212560O(iIndexOf);
                return;
            }
            xp30 xp30Var = (xp30) so30Var.viewModel;
            User user3 = so30Var.user;
            if (user3 == null) {
                Intrinsics.m88391r("user");
            } else {
                user2 = user3;
            }
            xp30Var.m212560O(yyh0Var.m217988d(user2));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m187129s0(Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static void m187130s1(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static C22421c m187131t0(List list) {
        return t7a.m189547c() ? CoreModule.f18264c.f20311G2.m153661s3() : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: t1 */
    public static Boolean m187132t1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u0 */
    public static Boolean m187133u0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u1 */
    public static Long m187134u1(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v1 */
    public static void m187135v1(so30 so30Var, Counter counter) {
        User user = null;
        if (((!rbb0.m180746s(null, 1, null) && so30Var.purchaseTypes.contains(PurchaseType.TYPE_GET_LIKERS)) || (rbb0.m180746s(null, 1, null) && !so30Var.purchaseTypes.contains(PurchaseType.TYPE_GET_LIKERS))) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            so30Var.user = userM116600p9;
            List<PurchaseType> listM217990f = yyh0.INSTANCE.m217990f(userM116600p9);
            so30Var.purchaseTypes = listM217990f;
            ((xp30) so30Var.viewModel).m212575V0(listM217990f, false);
            xp30 xp30Var = (xp30) so30Var.viewModel;
            User user2 = so30Var.user;
            if (user2 == null) {
                Intrinsics.m88391r("user");
            } else {
                user = user2;
            }
            xp30Var.m212618t1(user);
        }
        List<Picture.ImageUri> list = so30Var.list;
        if (list != null) {
            ((xp30) so30Var.viewModel).m212577W0(list);
        }
    }

    /* JADX INFO: renamed from: w2 */
    private final boolean m187136w2() {
        return (xxv.m213594u() || xxv.m213593t()) && !aw90.m100562F().m100604N();
    }

    /* JADX INFO: renamed from: x0 */
    public static CoreAssetsSettings m187137x0(Function1 function1, Object obj) {
        return (CoreAssetsSettings) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m187138x1(so30 so30Var, IntlTabMePayGuide intlTabMePayGuide) {
        ((xp30) so30Var.viewModel).m212565Q0(intlTabMePayGuide);
    }

    /* JADX INFO: renamed from: y0 */
    public static void m187139y0(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static void m187140z0(Throwable th) {
    }

    /* JADX INFO: renamed from: z1 */
    public static void m187141z1(so30 so30Var, CoreAssetsSettings coreAssetsSettings) {
        if ((TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "grey") && g4a.m128860d())) && !((xp30) so30Var.viewModel).m212554K0()) {
            CoreModule.f18264c.f20381e0.m116539Z9();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.vl30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187088b1(this.f184539a, (Bundle) obj);
            }
        }, new x20() { // from class: l.dl30
            @Override // p153l.x20
            public final void call() {
                so30.m187102h2(this.f89492a);
            }
        });
        C22421c<TabName> c22421cDistinctUntilChanged = ji30.m144967k().distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: l.pl30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187085Z1((TabName) obj);
            }
        };
        duringCreated(c22421cDistinctUntilChanged.filter(new qcj() { // from class: l.bm30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187108j2(function1, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.nm30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187128r1(this.f142617a, (TabName) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.zm30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187066P0(this.f205033a, (User) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.m32486n3()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ln30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187135v1(this.f132738a, (Counter) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20381e0.m116596o9());
        final Function1 function2 = new Function1() { // from class: l.xn30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187064O0((User) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged2 = c22421cDuringCreated.map(new qcj() { // from class: l.io30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187047D0(function2, obj);
            }
        }).distinctUntilChanged();
        final Function1 function3 = new Function1() { // from class: l.ko30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187104i1(this.f127679a, (Picture.ImageUri) obj);
            }
        };
        c22421cDistinctUntilChanged2.doOnNext(new y20() { // from class: l.gm30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187068Q0(function3, obj);
            }
        }).subscribe(psd0.m173591B());
        C22421c<CurrencyTypeData> c22421cTake = CoreModule.f18264c.f20381e0.m116508R7().take(1);
        final Function1 function4 = new Function1() { // from class: l.rm30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187099g2(this.f163825a, (CurrencyTypeData) obj);
            }
        };
        duringCreated((C22421c) c22421cTake.flatMap(new qcj() { // from class: l.cn30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187059J1(function4, obj);
            }
        })).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.nn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187055H1(this.f142757a, ((Long) obj).longValue());
            }
        }, new y20() { // from class: l.yn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187058J0((Throwable) obj);
            }
        }));
        C22421c c22421cSkip = duringCreated(CoreModule.f18264c.f20315I0.m144056M3()).skip(1);
        final Function1 function5 = new Function1() { // from class: l.jo30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187069Q1((IntlCurrencyDiamond) obj);
            }
        };
        C22421c c22421cFilter = c22421cSkip.filter(new qcj() { // from class: l.ro30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187090c1(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: l.al30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187127r0((IntlCurrencyDiamond) obj);
            }
        };
        c22421cFilter.map(new qcj() { // from class: l.bl30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187117m2(function6, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.cl30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187081X0(this.f82345a, ((Long) obj).longValue());
            }
        }, new y20() { // from class: l.el30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187080W1((Throwable) obj);
            }
        }));
        C22421c c22421cSkip2 = duringCreated(CoreModule.f18264c.f20312H0.m155437a5()).skip(1);
        final Function1 function7 = new Function1() { // from class: l.fl30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187091c2((Coin) obj);
            }
        };
        C22421c c22421cFilter2 = c22421cSkip2.filter(new qcj() { // from class: l.gl30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187132t1(function7, obj);
            }
        });
        final Function1 function8 = new Function1() { // from class: l.hl30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187045C0((Coin) obj);
            }
        };
        c22421cFilter2.map(new qcj() { // from class: l.il30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187134u1(function8, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.jl30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187106j0(this.f121465a, ((Long) obj).longValue());
            }
        }, new y20() { // from class: l.ll30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187043A0((Throwable) obj);
            }
        }));
        if (d79.m114661T()) {
            C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"));
            C22421c<C4470c> c22421cLifecycle = lifecycle();
            final Function2 function9 = new Function2() { // from class: l.ml30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return so30.m187110k1((UserPrivilege) obj, (C4470c) obj2);
                }
            };
            C22421c<T> c22421cDuringCreated2 = duringCreated(psd0.m173625r(c22421cM146424v3, c22421cLifecycle, new rcj() { // from class: l.nl30
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return so30.m187046C1(function9, obj, obj2);
                }
            }));
            final Function1 function10 = new Function1() { // from class: l.ol30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return so30.m187084Y1((pf60) obj);
                }
            };
            c22421cDuringCreated2.filter(new qcj() { // from class: l.ql30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return so30.m187126q1(function10, obj);
                }
            }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.rl30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187079W0(this.f163686a, (pf60) obj);
                }
            }, new y20() { // from class: l.sl30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187093d2((Throwable) obj);
                }
            }));
        }
        if (d79.m114663V()) {
            C22421c<UserPrivilege> c22421cM146424v4 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium));
            C22421c<C4470c> c22421cLifecycle2 = lifecycle();
            final Function2 function11 = new Function2() { // from class: l.tl30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return so30.m187097f2((UserPrivilege) obj, (C4470c) obj2);
                }
            };
            C22421c<T> c22421cDuringCreated3 = duringCreated(psd0.m173625r(c22421cM146424v4, c22421cLifecycle2, new rcj() { // from class: l.ul30
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return so30.m187089b2(function11, obj, obj2);
                }
            }));
            final Function1 function12 = new Function1() { // from class: l.wl30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return so30.m187048D1((pf60) obj);
                }
            };
            c22421cDuringCreated3.filter(new qcj() { // from class: l.xl30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return so30.m187063N1(function12, obj);
                }
            }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.yl30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187061L1(this.f200526a, (pf60) obj);
                }
            }, new y20() { // from class: l.zl30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187082X1((Throwable) obj);
                }
            }));
        }
        C22421c<AppealInfo> c22421cDistinctUntilChanged3 = CoreModule.f18264c.f20381e0.f89005C0.distinctUntilChanged();
        C22421c<User> c22421cDistinctUntilChanged4 = CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged();
        final Function2 function13 = new Function2() { // from class: l.am30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return so30.m187065O1((AppealInfo) obj, (User) obj2);
            }
        };
        duringCreated(psd0.m173625r(c22421cDistinctUntilChanged3, c22421cDistinctUntilChanged4, new rcj() { // from class: l.cm30
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return so30.m187120o0(function13, obj, obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.dm30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187100h0(this.f89599a, (pf60) obj);
            }
        }));
        C22421c<CoreAssetsSettings> c22421cM144642d = CoreModule.f18265d.m144642d();
        C22421c<C4470c> c22421cLifecycle3 = lifecycle();
        final Function2 function14 = new Function2() { // from class: l.em30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return so30.m187115m0((CoreAssetsSettings) obj, (C4470c) obj2);
            }
        };
        C22421c<T> c22421cDuringCreated4 = duringCreated(psd0.m173625r(c22421cM144642d, c22421cLifecycle3, new rcj() { // from class: l.fm30
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return so30.m187077V0(function14, obj, obj2);
            }
        }));
        final Function1 function15 = new Function1() { // from class: l.hm30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187057I1((pf60) obj);
            }
        };
        C22421c c22421cFilter3 = c22421cDuringCreated4.filter(new qcj() { // from class: l.im30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187112l0(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: l.jm30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187116m1((pf60) obj);
            }
        };
        C22421c map = c22421cFilter3.map(new qcj() { // from class: l.km30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187137x0(function16, obj);
            }
        });
        final Function1 function17 = new Function1() { // from class: l.lm30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187107j1((CoreAssetsSettings) obj);
            }
        };
        map.filter(new qcj() { // from class: l.mm30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187083Y0(function17, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.om30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187141z1(this.f147894a, (CoreAssetsSettings) obj);
            }
        }, new y20() { // from class: l.pm30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187075U0((Throwable) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated5 = duringCreated(fp60.m126543E());
        final Function1 function18 = new Function1() { // from class: l.qm30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187103i0((PaymentResultWrapper) obj);
            }
        };
        C22421c c22421cFilter4 = c22421cDuringCreated5.filter(new qcj() { // from class: l.sm30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187050E1(function18, obj);
            }
        });
        final Function1 function19 = new Function1() { // from class: l.tm30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187062N0((PaymentResultWrapper) obj);
            }
        };
        c22421cFilter4.flatMap(new qcj() { // from class: l.um30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187071R1(function19, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vm30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187105i2(this.f184663a, obj);
            }
        }));
        C22421c<List<UserPrivilege>> c22421cDistinctUntilChanged5 = CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged();
        final Function1 function20 = new Function1() { // from class: l.wm30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187131t0((List) obj);
            }
        };
        duringCreated((C22421c) c22421cDistinctUntilChanged5.flatMap(new qcj() { // from class: l.xm30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187094e1(function20, obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ym30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187054H0(this.f200639a, obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20429u0.m31407O6(25, true)).subscribe(psd0.m173597H(new y20() { // from class: l.an30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187096f1(this.f72313a, (pf60) obj);
            }
        }, new y20() { // from class: l.bn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187078V1((Throwable) obj);
            }
        }));
        kcg0 kcg0VarM214372p = y63.m214366j().m214372p(psd0.m173596G(new y20() { // from class: l.dn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187076U1(this.f89754a, (Pair) obj);
            }
        }));
        kcg0VarM214372p.getClass();
        this.boostSubscription = kcg0VarM214372p;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = yyh0.INSTANCE.m217989e();
        kcg0 kcg0VarSubscribe = duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.en30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187125q0(longRef, this, (Long) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        this.picksSubscription = kcg0VarSubscribe;
        if (d79.m114661T()) {
            duringCreated(wtd0.m207833e().m207837f().obs().distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.fn30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187074T1(this.f99864a, (Boolean) obj);
                }
            }, new y20() { // from class: l.gn30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187111k2((Throwable) obj);
                }
            }));
        }
        nd9 nd9Var = CoreModule.f18264c.f20362X1;
        C22507a<Boolean> c22507a = nd9Var.f141464U;
        C22507a<Boolean> c22507a2 = nd9Var.f141463T;
        final Function2 function21 = new Function2() { // from class: l.hn30
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return so30.m187119n1(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        };
        C22421c<T> c22421cDuringCreated6 = duringCreated(psd0.m173625r(c22507a, c22507a2, new rcj() { // from class: l.in30
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return so30.m187060L0(function21, obj, obj2);
            }
        }));
        final Function1 function22 = new Function1() { // from class: l.jn30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187049E0((pf60) obj);
            }
        };
        c22421cDuringCreated6.filter(new qcj() { // from class: l.kn30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187133u0(function22, obj);
            }
        }).take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.mn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187056I0(this.f137648a, (pf60) obj);
            }
        }, new y20() { // from class: l.on30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187130s1((Throwable) obj);
            }
        }));
        if (d79.m114646E()) {
            duringCreated(CoreModule.f18264c.f20380d2.m95786k3()).subscribe(psd0.m173597H(new y20() { // from class: l.pn30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187095e2(this.f153258a, (HideAndSeekBannerEnv) obj);
                }
            }, new y20() { // from class: l.qn30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187129s0((Throwable) obj);
                }
            }));
        }
        Act act = act();
        act.getClass();
        C22421c<T> c22421cDuringCreated7 = duringCreated(((NewMainAct) act).m40798W5());
        final Function1 function23 = new Function1() { // from class: l.rn30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187044B1((Boolean) obj);
            }
        };
        c22421cDuringCreated7.filter(new qcj() { // from class: l.sn30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187067P1(function23, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.tn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187073S1(this.f175224a, (Boolean) obj);
            }
        }, new y20() { // from class: l.un30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187139y0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20438x0.m31212r4()).subscribe(psd0.m173597H(new y20() { // from class: l.vn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187086a1(this.f184804a, (Long) obj);
            }
        }, new y20() { // from class: l.wn30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187070R0((Throwable) obj);
            }
        }));
        if (d79.m114704u()) {
            if (NullChecker.m82486a(CoreModule.f18264c.f20428t2.f198578R) && CoreModule.f18264c.f20428t2.f198578R.get().booleanValue()) {
                duringCreated(C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.zn30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        so30.m187121o1(this.f205174a, (uxj0) obj);
                    }
                }));
            } else {
                duringCreated(CoreModule.f18264c.f20428t2.m215198l3("me")).filter(new if00()).subscribe(psd0.m173597H(new y20() { // from class: l.ao30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        so30.m187051F0(this.f72414a, (RiskSelfData) obj);
                    }
                }, new y20() { // from class: l.bo30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        so30.m187072S0((Throwable) obj);
                    }
                }));
            }
        }
        duringCreated(lhn.INSTANCE.m154231b()).subscribe(psd0.m173597H(new y20() { // from class: l.co30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187122p0(this.f82806a, (Unit) obj);
            }
        }, new y20() { // from class: l.do30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187140z0((Throwable) obj);
            }
        }));
        if (!IntlCountryCodeController.m29114k()) {
            duringCreated(new pcj() { // from class: l.eo30
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return so30.m187087a2();
                }
            }, false).subscribe(psd0.m173596G(new y20() { // from class: l.fo30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187138x1(this.f100006a, (IntlTabMePayGuide) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20438x0.m31210q4()).subscribe(psd0.m173597H(new y20() { // from class: l.go30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187053G0(this.f105204a, (Boolean) obj);
            }
        }, new y20() { // from class: l.ho30
            @Override // p153l.y20
            public final void call(Object obj) {
                so30.m187113l1(this.f110867a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
        kcg0 kcg0Var = this.boostSubscription;
        kcg0 kcg0Var2 = null;
        if (kcg0Var != null) {
            if (kcg0Var == null) {
                Intrinsics.m88391r("boostSubscription");
                kcg0Var = null;
            }
            psd0.m173633z(kcg0Var);
        }
        kcg0 kcg0Var3 = this.picksSubscription;
        if (kcg0Var3 != null) {
            if (kcg0Var3 == null) {
                Intrinsics.m88391r("picksSubscription");
            } else {
                kcg0Var2 = kcg0Var3;
            }
            psd0.m173633z(kcg0Var2);
        }
    }

    @Override // p153l.u1b0
    /* JADX INFO: renamed from: g0 */
    public void mo121680g0(boolean hidden) {
        if (hidden) {
            return;
        }
        if (this.mUser == null) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            this.mUser = userM116600p9;
        }
        xp30 xp30Var = (xp30) this.viewModel;
        User user = this.mUser;
        if (user == null) {
            Intrinsics.m88391r("mUser");
            user = null;
        }
        xp30Var.m212612q1(user);
        m187151y2();
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m187142n2() {
        return d79.m114661T() && !wtd0.m207833e().m207837f().get().booleanValue();
    }

    /* JADX INFO: renamed from: o2 */
    public final C22421c<Long> m187143o2() {
        if (CoreModule.m30930K().mo31838xf()) {
            C22421c<uxj0> c22421cM144057N3 = CoreModule.f18264c.f20315I0.m144057N3();
            final Function1 function1 = new Function1() { // from class: l.lo30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return so30.m187123p1((uxj0) obj);
                }
            };
            C22421c map = c22421cM144057N3.map(new qcj() { // from class: l.mo30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return so30.m187092d1(function1, obj);
                }
            });
            map.getClass();
            return map;
        }
        C22421c<Coin> c22421cM155437a5 = CoreModule.f18264c.f20312H0.m155437a5();
        final Function1 function2 = new Function1() { // from class: l.no30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return so30.m187098g1((Coin) obj);
            }
        };
        C22421c map2 = c22421cM155437a5.map(new qcj() { // from class: l.oo30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return so30.m187052F1(function2, obj);
            }
        });
        map2.getClass();
        return map2;
    }

    @Override // p153l.u1b0
    @NotNull
    public String pageId() {
        return OMSDialogPositon.p_navigation_view;
    }

    /* JADX INFO: renamed from: q2 */
    public final void m187144q2() {
        box.INSTANCE.m105725n();
        m187148u2(ProfileListFrag.class);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m187145r2() {
        if (!NullChecker.m82486a(CoreModule.f18264c.m32487o3()) || CoreModule.f18264c.m32487o3().likersLimit.remaining <= 0) {
            FakeLikersAct.m56139Z1(act(), "p_navigation_view,e_see_banner,intl_click");
            return;
        }
        xp30 xp30Var = (xp30) this.viewModel;
        Intent intentM57727Y1 = LikersAct.m57727Y1(act(), "");
        intentM57727Y1.getClass();
        xp30Var.m212608o1(intentM57727Y1);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m187146s2() {
        new dtf0(act()).m117853a();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m187147t2() {
        box.INSTANCE.m105726o();
        if (m187136w2()) {
            aw90.m100562F().m100626p0(true);
        }
        m187148u2(SettingsFragOld.class);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m187148u2(Class<? extends PutongFrag> fragment) {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", fragment.getSimpleName());
        ((xp30) this.viewModel).m212608o1(intent);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m187149v2(long available) {
        if (act() != null) {
            ((xp30) this.viewModel).m212567R0(aox.m99235b(CoreModule.m30930K().mo31838xf(), available));
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m187150x2() {
        final long j = CoreModule.f18264c.f20396j0.m31579C4().endTime * 1000;
        if (this.freeTrialSubscription == null) {
            ((xp30) this.viewModel).m212622v1();
            yyh0 yyh0Var = yyh0.INSTANCE;
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            userM116600p9.getClass();
            List<PurchaseType> listM217990f = yyh0Var.m217990f(userM116600p9);
            this.purchaseTypes = listM217990f;
            ((xp30) this.viewModel).m212575V0(listM217990f, true);
            kcg0 kcg0VarSubscribe = duringCreated(C22421c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.po30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187114l2(this.f153362a, j, (Long) obj);
                }
            }, new y20() { // from class: l.qo30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187101h1((Throwable) obj);
                }
            }));
            kcg0VarSubscribe.getClass();
            this.freeTrialSubscription = kcg0VarSubscribe;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final void m187151y2() {
        if (gta.m132210e().m132214d().mo34857ir()) {
            CoreModule.f18264c.f20304E1.m109151G3();
            ((xp30) this.viewModel).m212627y1();
            if (this.visitorIsInit) {
                return;
            }
            this.visitorIsInit = true;
            duringCreated(CoreModule.f18264c.f20304E1.m109152H3()).subscribe(psd0.m173597H(new y20() { // from class: l.zk30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187118n0(this.f204728a, (Integer) obj);
                }
            }, new y20() { // from class: l.kl30
                @Override // p153l.y20
                public final void call(Object obj) {
                    so30.m187109k0((Throwable) obj);
                }
            }));
        }
    }
}
