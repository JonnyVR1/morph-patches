package p153l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseAutoRenewConfirmView;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeConfirmDialog;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u0010\u0003R(\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b8\u0010\u0003\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\bR0\u0010B\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u0010\u0003\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010G\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010<\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010>\"\u0004\bE\u0010@R\"\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040H8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010\u0003R\u001b\u0010P\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\u000eR\u001b\u0010S\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010\u000eR0\u0010Y\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bU\u00105\u0012\u0004\bX\u0010\u0003\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\bR\u001c\u0010\\\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bZ\u00105\u0012\u0004\b[\u0010\u0003¨\u0006]"}, m88121d2 = {"Ll/pta;", "", "<init>", "()V", "", "isChecked", "", RXScreenCaptureService.KEY_INDEX, "(Z)V", "", "fromType", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)Z", "u", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lorg/json/JSONObject;", "trackParams", "Ll/x20;", "positiveAction", "B", "(Lcom/p1/mobile/android/app/Act;Lorg/json/JSONObject;Ll/x20;)V", "negativeAction", c4s.C_ZONE, "(Lcom/p1/mobile/android/app/Act;Lorg/json/JSONObject;Ll/x20;Ll/x20;)V", "Landroid/text/SpannableStringBuilder;", "content", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", BLiveVoiceSingTogehterState.confirm, "cancel", "D", "(Lcom/p1/mobile/android/app/Act;Landroid/text/SpannableStringBuilder;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Ll/x20;Ll/x20;)V", "", "percentage", "type", BLiveStormDanmakuGiftResourceType.f45292l, "(ILcom/p1/mobile/putong/core/data/PurchaseType;)Landroid/text/SpannableStringBuilder;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "Ll/eud0;", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ll/eud0;", ResourceDirection.f39656v, "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Z", "n", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "q", "k", "p", "w", "a", "Z", "isUserClickAgreementCheckBoxForMyPrivilegePage", "A", "isUserClickAgreementCheckBoxForMyPrivilegePage$annotations", "Ljava/lang/ref/WeakReference;", "Ll/vc0;", "b", "Ljava/lang/ref/WeakReference;", "getMyPrivilegeAgreementCheckEventManger", "()Ljava/lang/ref/WeakReference;", BaseSei.f14625Y, "(Ljava/lang/ref/WeakReference;)V", "getMyPrivilegeAgreementCheckEventManger$annotations", "myPrivilegeAgreementCheckEventManger", "c", "o", BaseSei.f14626Z, "getTempAgreementCheckEventMangerForPExp$annotations", "tempAgreementCheckEventMangerForPExp", "Lrx/subjects/b;", Constants.INAPP_DATA_TAG, "Lrx/subjects/b;", "getChangeCheckStateUpdateData$annotations", "changeCheckStateUpdateData", "e", "Lkotlin/Lazy;", "getConfigSwitch", "configSwitch", "f", "getConfigSwitchForPromotionPage", "configSwitchForPromotionPage", "value", "g", "j", BaseSei.f14624X, "getInterceptAliAutoPay$annotations", "interceptAliAutoPay", "h", "getInterceptNormalPayRetainDlg$annotations", "interceptNormalPayRetainDlg", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class pta {

    @NotNull
    public static final pta INSTANCE = new pta();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isUserClickAgreementCheckBoxForMyPrivilegePage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<vc0> myPrivilegeAgreementCheckEventManger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<vc0> tempAgreementCheckEventMangerForPExp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static C22508b<Boolean> changeCheckStateUpdateData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Lazy configSwitch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy configSwitchForPromotionPage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static volatile boolean interceptAliAutoPay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static boolean interceptNormalPayRetainDlg;

    static {
        C22508b<Boolean> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        changeCheckStateUpdateData = c22508bM222767b;
        configSwitch = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.hta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(pta.m173712e());
            }
        });
        configSwitchForPromotionPage = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ita
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(pta.m173710c());
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final void m173704A(boolean z) {
        isUserClickAgreementCheckBoxForMyPrivilegePage = z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: B */
    public static final void m173705B(@NotNull Act act, @Nullable JSONObject trackParams, @NotNull x20 positiveAction) {
        act.getClass();
        positiveAction.getClass();
        m173706C(act, trackParams, positiveAction, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, l.l4g0] */
    @JvmStatic
    /* JADX INFO: renamed from: C */
    public static final void m173706C(@NotNull Act act, @Nullable JSONObject trackParams, @NotNull final x20 positiveAction, @Nullable final x20 negativeAction) {
        act.getClass();
        positiveAction.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (trackParams != null) {
            ?? M204399c = w1e.m204399c("p_purchase_confirm_pop", Dialog.class.getName());
            objectRef.element = M204399c;
            if (M204399c != 0) {
                M204399c.m152780o(trackParams);
            }
        }
        View viewInflate = p9r.m171370a(act).inflate(rec0.f162518Z0, (ViewGroup) null);
        viewInflate.getClass();
        PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView = (PurchaseAutoRenewConfirmView) viewInflate;
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(purchaseAutoRenewConfirmView).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.jta
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                pta.m173715h(objectRef, dialogInterface);
            }
        }).m146021P(false).m146020O();
        PurchaseAutoRenewConfirmView.m54293h(purchaseAutoRenewConfirmView, new x20() { // from class: l.kta
            @Override // p153l.x20
            public final void call() {
                pta.m173709b(jl80VarM146020O, positiveAction);
            }
        }, new x20() { // from class: l.lta
            @Override // p153l.x20
            public final void call() {
                pta.m173708a(jl80VarM146020O, negativeAction);
            }
        }, null, 4, null);
        jl80VarM146020O.show();
        T t = objectRef.element;
        if (((l4g0) t) != null) {
            w1e.m204402f((l4g0) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, l.l4g0] */
    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final void m173707D(@NotNull Act act, @NotNull SpannableStringBuilder content, @NotNull PurchaseType purchaseType, @Nullable JSONObject trackParams, @Nullable final x20 confirm, @Nullable final x20 cancel) {
        act.getClass();
        content.getClass();
        purchaseType.getClass();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_auto_newconfirm", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("productType", purchaseType.productCategory().name()));
        w1e.m204402f(l4g0VarM204399c);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (trackParams != null) {
            ?? M204399c = w1e.m204399c("p_purchase_confirm_pop", Dialog.class.getName());
            objectRef.element = M204399c;
            if (M204399c != 0) {
                M204399c.m152780o(trackParams);
            }
        }
        View viewInflate = p9r.m171370a(act).inflate(rec0.f162618w0, (ViewGroup) null);
        viewInflate.getClass();
        PrivilegeConfirmDialog privilegeConfirmDialog = (PrivilegeConfirmDialog) viewInflate;
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(privilegeConfirmDialog).m146021P(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.mta
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                pta.m173714g(l4g0VarM204399c, objectRef, dialogInterface);
            }
        }).m146020O();
        privilegeConfirmDialog.m55415d(content, new x20() { // from class: l.nta
            @Override // p153l.x20
            public final void call() {
                pta.m173713f(confirm, jl80VarM146020O);
            }
        }, new x20() { // from class: l.ota
            @Override // p153l.x20
            public final void call() {
                pta.m173711d(cancel, jl80VarM146020O);
            }
        });
        jl80VarM146020O.show();
        T t = objectRef.element;
        if (((l4g0) t) != null) {
            w1e.m204402f((l4g0) t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m173708a(jl80 jl80Var, x20 x20Var) {
        jl80Var.dismiss();
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m173709b(jl80 jl80Var, x20 x20Var) {
        jl80Var.dismiss();
        x20Var.call();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m173710c() {
        return RemoteConfig.m80481x().m80513s("agreement_check_show_switch_for_promotion_page");
    }

    /* JADX INFO: renamed from: d */
    public static void m173711d(x20 x20Var, jl80 jl80Var) {
        if (x20Var != null) {
            x20Var.call();
        }
        i4g0.m138520r("e_unauto_newconfirm", "p_auto_newconfirm");
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m173712e() {
        return RemoteConfig.m80481x().m80513s("agreement_check_show_switch");
    }

    /* JADX INFO: renamed from: f */
    public static void m173713f(x20 x20Var, jl80 jl80Var) {
        if (x20Var != null) {
            x20Var.call();
        }
        i4g0.m138520r("e_auto_newconfirm", "p_auto_newconfirm");
        jl80Var.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m173714g(l4g0 l4g0Var, Ref.ObjectRef objectRef, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        l4g0 l4g0Var2 = (l4g0) objectRef.element;
        if (l4g0Var2 != null) {
            w1e.m204401e(l4g0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static void m173715h(Ref.ObjectRef objectRef, DialogInterface dialogInterface) {
        l4g0 l4g0Var = (l4g0) objectRef.element;
        if (l4g0Var != null) {
            w1e.m204401e(l4g0Var);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m173716i(boolean isChecked) {
        vc0 vc0Var;
        isUserClickAgreementCheckBoxForMyPrivilegePage = isChecked;
        WeakReference<vc0> weakReference = myPrivilegeAgreementCheckEventManger;
        if (weakReference == null || (vc0Var = weakReference.get()) == null) {
            return;
        }
        vc0Var.m200751b(isChecked);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m173717j() {
        return interceptAliAutoPay;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m173718k() {
        boolean z = interceptNormalPayRetainDlg;
        interceptNormalPayRetainDlg = false;
        return z;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final SpannableStringBuilder m173719l(int percentage, @NotNull PurchaseType type) {
        String str;
        type.getClass();
        if (percentage <= 0 || percentage >= 100) {
            str = "受优惠";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), "%s优惠", Arrays.copyOf(new Object[]{percentage + "%"}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), " 同意%1$s，享%2$s和最高%3$s", Arrays.copyOf(new Object[]{"会员协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Arrays.copyOf(new Object[]{Integer.valueOf(wib0.m206579w(type) ? 3 : 9)}, 1))}, 3));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int iC0 = StringsKt.m94327c0(str2, "会员协议", 0, false, 6, null);
        spannableStringBuilder.setSpan(new da5(bn60.f77437b).m115113b(Color.parseColor("#65000000")).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115115d(false), iC0, iC0 + 4, 18);
        return spannableStringBuilder;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final eud0 m173720m(@NotNull C8928d.a detail) {
        detail.getClass();
        eud0 eud0Var = new eud0(0);
        Merchandise merchandiseM54784s = detail.m54784s();
        if (merchandiseM54784s == null || !merchandiseM54784s.autoRenewable() || !v5b0.m199797w(merchandiseM54784s) || (!merchandiseM54784s.quarterly() && !merchandiseM54784s.semiAnnual())) {
            return eud0Var;
        }
        eud0 eud0VarM122559a = eud0Var.m122559a(merchandiseM54784s.quantity);
        eud0VarM122559a.getClass();
        return eud0VarM122559a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m173721n(@NotNull C8928d.a detail) {
        detail.getClass();
        if (!v5b0.m199788n(detail.m54784s())) {
            return "限时优惠";
        }
        double firstCouponPrice = detail.m54784s().getFirstCouponPrice();
        double d = detail.m54784s().defaultStockKeepUnit.prices.price;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("已优惠%.0f元", Arrays.copyOf(new Object[]{Double.valueOf(d - firstCouponPrice)}, 1));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final WeakReference<vc0> m173722o() {
        return tempAgreementCheckEventMangerForPExp;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m173723p() {
        interceptNormalPayRetainDlg = true;
        m173731x(true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m173724q() {
        return RemoteConfig.m80481x().m80513s("auto_pay_for_reject");
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r */
    public static final boolean m173725r() {
        return m173727t(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public static final boolean m173726s(@Nullable String fromType) {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m173727t(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "DEFAULT_UNKONW";
        }
        return m173726s(str);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u */
    public static final boolean m173728u() {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final boolean m173729v(@NotNull C8928d.a detail) {
        detail.getClass();
        Merchandise merchandiseM54784s = detail.m54784s();
        return merchandiseM54784s != null && merchandiseM54784s.autoRenewable() && (merchandiseM54784s.quarterly() || merchandiseM54784s.semiAnnual()) && v5b0.m199797w(merchandiseM54784s);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m173730w() {
        interceptNormalPayRetainDlg = false;
        m173731x(false);
    }

    /* JADX INFO: renamed from: x */
    public static final void m173731x(boolean z) {
        if (m173724q()) {
            z = false;
        }
        interceptAliAutoPay = z;
    }

    /* JADX INFO: renamed from: y */
    public static final void m173732y(@Nullable WeakReference<vc0> weakReference) {
        myPrivilegeAgreementCheckEventManger = weakReference;
    }

    /* JADX INFO: renamed from: z */
    public static final void m173733z(@Nullable WeakReference<vc0> weakReference) {
        tempAgreementCheckEventMangerForPExp = weakReference;
    }
}
