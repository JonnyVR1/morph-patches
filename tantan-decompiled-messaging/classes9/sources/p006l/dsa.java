package p006l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeConfirmDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.PurchaseAutoRenewConfirmView;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.remote_config.RemoteConfig;
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
import l.c95;
import l.cwf0;
import l.d30;
import l.dd80;
import l.i0e;
import l.j760;
import l.m6c0;
import l.o7r;
import l.rxa0;
import l.sab0;
import l.vwb;
import l.we60;
import l.zc0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u0010\u0003R(\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b8\u0010\u0003\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\bR0\u0010B\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u0010\u0003\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010G\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010<\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010>\"\u0004\bE\u0010@R\"\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040H8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010\u0003R\u001b\u0010P\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\u000eR\u001b\u0010S\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010\u000eR0\u0010Y\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bU\u00105\u0012\u0004\bX\u0010\u0003\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\bR\u001c\u0010\\\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bZ\u00105\u0012\u0004\b[\u0010\u0003¨\u0006]"}, d2 = {"Ll/dsa;", "", "<init>", "()V", "", "isChecked", "", "i", "(Z)V", "", "fromType", "s", "(Ljava/lang/String;)Z", "u", "()Z", "Lcom/p1/mobile/android/app/Act;", "act", "Lorg/json/JSONObject;", "trackParams", "Ll/d30;", "positiveAction", "B", "(Lcom/p1/mobile/android/app/Act;Lorg/json/JSONObject;Ll/d30;)V", "negativeAction", "C", "(Lcom/p1/mobile/android/app/Act;Lorg/json/JSONObject;Ll/d30;Ll/d30;)V", "Landroid/text/SpannableStringBuilder;", "content", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "confirm", "cancel", "D", "(Lcom/p1/mobile/android/app/Act;Landroid/text/SpannableStringBuilder;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Ll/d30;Ll/d30;)V", "", "percentage", "type", "l", "(ILcom/p1/mobile/putong/core/data/PurchaseType;)Landroid/text/SpannableStringBuilder;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "Ll/cmd0;", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ll/cmd0;", "v", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Z", "n", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "q", "k", "p", "w", "a", "Z", "isUserClickAgreementCheckBoxForMyPrivilegePage", "A", "isUserClickAgreementCheckBoxForMyPrivilegePage$annotations", "Ljava/lang/ref/WeakReference;", "Ll/zc0;", "b", "Ljava/lang/ref/WeakReference;", "getMyPrivilegeAgreementCheckEventManger", "()Ljava/lang/ref/WeakReference;", "y", "(Ljava/lang/ref/WeakReference;)V", "getMyPrivilegeAgreementCheckEventManger$annotations", "myPrivilegeAgreementCheckEventManger", "c", "o", "z", "getTempAgreementCheckEventMangerForPExp$annotations", "tempAgreementCheckEventMangerForPExp", "Lrx/subjects/b;", "d", "Lrx/subjects/b;", "getChangeCheckStateUpdateData$annotations", "changeCheckStateUpdateData", "e", "Lkotlin/Lazy;", "getConfigSwitch", "configSwitch", "f", "getConfigSwitchForPromotionPage", "configSwitchForPromotionPage", "value", "g", "j", "x", "getInterceptAliAutoPay$annotations", "interceptAliAutoPay", "h", "getInterceptNormalPayRetainDlg$annotations", "interceptNormalPayRetainDlg", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class dsa {

    @NotNull
    public static final dsa INSTANCE = new dsa();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean isUserClickAgreementCheckBoxForMyPrivilegePage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<zc0> myPrivilegeAgreementCheckEventManger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<zc0> tempAgreementCheckEventMangerForPExp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static b<Boolean> changeCheckStateUpdateData;

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
        b<Boolean> bVarB = b.b();
        bVarB.getClass();
        changeCheckStateUpdateData = bVarB;
        configSwitch = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.vra
            public final Object invoke() {
                return Boolean.valueOf(dsa.m14197e());
            }
        });
        configSwitchForPromotionPage = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.wra
            public final Object invoke() {
                return Boolean.valueOf(dsa.m14195c());
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final void m14189A(boolean z) {
        isUserClickAgreementCheckBoxForMyPrivilegePage = z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: B */
    public static final void m14190B(@NotNull Act act, @Nullable JSONObject trackParams, @NotNull d30 positiveAction) {
        act.getClass();
        positiveAction.getClass();
        m14191C(act, trackParams, positiveAction, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: C */
    public static final void m14191C(@NotNull Act act, @Nullable JSONObject trackParams, @NotNull final d30 positiveAction, @Nullable final d30 negativeAction) {
        act.getClass();
        positiveAction.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (trackParams != null) {
            cwf0 cwf0VarC = i0e.c("p_purchase_confirm_pop", Dialog.class.getName());
            objectRef.element = cwf0VarC;
            if (cwf0VarC != null) {
                cwf0VarC.o(trackParams);
            }
        }
        PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmViewInflate = o7r.a(act).inflate(m6c0.Z0, (ViewGroup) null);
        purchaseAutoRenewConfirmViewInflate.getClass();
        PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView = purchaseAutoRenewConfirmViewInflate;
        final dd80 dd80VarO = new dd80.a(act).R(purchaseAutoRenewConfirmView).n0(new DialogInterface.OnDismissListener() { // from class: l.xra
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                dsa.m14200h(objectRef, dialogInterface);
            }
        }).P(false).O();
        PurchaseAutoRenewConfirmView.h(purchaseAutoRenewConfirmView, new d30() { // from class: l.yra
            public final void call() {
                dsa.m14194b(dd80VarO, positiveAction);
            }
        }, new d30() { // from class: l.zra
            public final void call() {
                dsa.m14193a(dd80VarO, negativeAction);
            }
        }, (PurchaseType) null, 4, (Object) null);
        dd80VarO.show();
        Object obj = objectRef.element;
        if (((cwf0) obj) != null) {
            i0e.f((cwf0) obj);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final void m14192D(@NotNull Act act, @NotNull SpannableStringBuilder content, @NotNull PurchaseType purchaseType, @Nullable JSONObject trackParams, @Nullable final d30 confirm, @Nullable final d30 cancel) {
        act.getClass();
        content.getClass();
        purchaseType.getClass();
        final cwf0 cwf0VarC = i0e.c("p_auto_newconfirm", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("productType", purchaseType.productCategory().name())});
        i0e.f(cwf0VarC);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (trackParams != null) {
            cwf0 cwf0VarC2 = i0e.c("p_purchase_confirm_pop", Dialog.class.getName());
            objectRef.element = cwf0VarC2;
            if (cwf0VarC2 != null) {
                cwf0VarC2.o(trackParams);
            }
        }
        View viewInflate = o7r.a(act).inflate(m6c0.w0, (ViewGroup) null);
        viewInflate.getClass();
        PrivilegeConfirmDialog privilegeConfirmDialog = (PrivilegeConfirmDialog) viewInflate;
        final dd80 dd80VarO = new dd80.a(act).R(privilegeConfirmDialog).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.asa
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                dsa.m14199g(cwf0VarC, objectRef, dialogInterface);
            }
        }).O();
        privilegeConfirmDialog.m7567d(content, new d30() { // from class: l.bsa
            public final void call() {
                dsa.m14198f(confirm, dd80VarO);
            }
        }, new d30() { // from class: l.csa
            public final void call() {
                dsa.m14196d(cancel, dd80VarO);
            }
        });
        dd80VarO.show();
        Object obj = objectRef.element;
        if (((cwf0) obj) != null) {
            i0e.f((cwf0) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14193a(dd80 dd80Var, d30 d30Var) {
        dd80Var.dismiss();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m14194b(dd80 dd80Var, d30 d30Var) {
        dd80Var.dismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14195c() {
        return RemoteConfig.x().s("agreement_check_show_switch_for_promotion_page");
    }

    /* JADX INFO: renamed from: d */
    public static void m14196d(d30 d30Var, dd80 dd80Var) {
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.r("e_unauto_newconfirm", "p_auto_newconfirm");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14197e() {
        return RemoteConfig.x().s("agreement_check_show_switch");
    }

    /* JADX INFO: renamed from: f */
    public static void m14198f(d30 d30Var, dd80 dd80Var) {
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.r("e_auto_newconfirm", "p_auto_newconfirm");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public static void m14199g(cwf0 cwf0Var, Ref.ObjectRef objectRef, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
        cwf0 cwf0Var2 = (cwf0) objectRef.element;
        if (cwf0Var2 != null) {
            i0e.e(cwf0Var2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m14200h(Ref.ObjectRef objectRef, DialogInterface dialogInterface) {
        cwf0 cwf0Var = (cwf0) objectRef.element;
        if (cwf0Var != null) {
            i0e.e(cwf0Var);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m14201i(boolean isChecked) {
        zc0 zc0Var;
        isUserClickAgreementCheckBoxForMyPrivilegePage = isChecked;
        WeakReference<zc0> weakReference = myPrivilegeAgreementCheckEventManger;
        if (weakReference == null || (zc0Var = weakReference.get()) == null) {
            return;
        }
        zc0Var.b(isChecked);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m14202j() {
        return interceptAliAutoPay;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m14203k() {
        boolean z = interceptNormalPayRetainDlg;
        interceptNormalPayRetainDlg = false;
        return z;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final SpannableStringBuilder m14204l(int percentage, @NotNull PurchaseType type) {
        String str;
        type.getClass();
        if (percentage <= 0 || percentage >= 100) {
            str = "受优惠";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), "%s优惠", Arrays.copyOf(new Object[]{percentage + "%"}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), " 同意%1$s，享%2$s和最高%3$s", Arrays.copyOf(new Object[]{"会员协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Arrays.copyOf(new Object[]{Integer.valueOf(sab0.w(type) ? 3 : 9)}, 1))}, 3));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int iC0 = StringsKt.c0(str2, "会员协议", 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new c95(we60.b).b(Color.parseColor("#65000000")).c(CoreModule.f1533b.getString(R.string.D6)).d(false), iC0, iC0 + 4, 18);
        return spannableStringBuilder;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final cmd0 m14205m(@NotNull d.a detail) {
        detail.getClass();
        cmd0 cmd0Var = new cmd0(0);
        Merchandise merchandiseS = detail.s();
        if (merchandiseS == null || !merchandiseS.autoRenewable() || !rxa0.w(merchandiseS) || (!merchandiseS.quarterly() && !merchandiseS.semiAnnual())) {
            return cmd0Var;
        }
        cmd0 cmd0VarM13529a = cmd0Var.m13529a(merchandiseS.quantity);
        cmd0VarM13529a.getClass();
        return cmd0VarM13529a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m14206n(@NotNull d.a detail) {
        detail.getClass();
        if (!rxa0.n(detail.s())) {
            return "限时优惠";
        }
        double firstCouponPrice = detail.s().getFirstCouponPrice();
        double d = detail.s().defaultStockKeepUnit.prices.price;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("已优惠%.0f元", Arrays.copyOf(new Object[]{Double.valueOf(d - firstCouponPrice)}, 1));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final WeakReference<zc0> m14207o() {
        return tempAgreementCheckEventMangerForPExp;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m14208p() {
        interceptNormalPayRetainDlg = true;
        m14216x(true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m14209q() {
        return RemoteConfig.x().s("auto_pay_for_reject");
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r */
    public static final boolean m14210r() {
        return m14212t(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public static final boolean m14211s(@Nullable String fromType) {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m14212t(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "DEFAULT_UNKONW";
        }
        return m14211s(str);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u */
    public static final boolean m14213u() {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final boolean m14214v(@NotNull d.a detail) {
        detail.getClass();
        Merchandise merchandiseS = detail.s();
        return merchandiseS != null && merchandiseS.autoRenewable() && (merchandiseS.quarterly() || merchandiseS.semiAnnual()) && rxa0.w(merchandiseS);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m14215w() {
        interceptNormalPayRetainDlg = false;
        m14216x(false);
    }

    /* JADX INFO: renamed from: x */
    public static final void m14216x(boolean z) {
        if (m14209q()) {
            z = false;
        }
        interceptAliAutoPay = z;
    }

    /* JADX INFO: renamed from: y */
    public static final void m14217y(@Nullable WeakReference<zc0> weakReference) {
        myPrivilegeAgreementCheckEventManger = weakReference;
    }

    /* JADX INFO: renamed from: z */
    public static final void m14218z(@Nullable WeakReference<zc0> weakReference) {
        tempAgreementCheckEventMangerForPExp = weakReference;
    }
}
