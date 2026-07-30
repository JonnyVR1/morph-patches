package p149l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseAutoRenewConfirmView;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeConfirmDialog;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0003¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\u0006H\u0007¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0007¢\u0006\u0004\b3\u0010\u0003R(\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b8\u0010\u0003\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\bR0\u0010B\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u0010\u0003\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010G\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010<\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010>\"\u0004\bE\u0010@R\"\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040H8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010\u0003R\u001b\u0010P\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\u000eR\u001b\u0010S\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010\u000eR0\u0010Y\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bU\u00105\u0012\u0004\bX\u0010\u0003\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\bR\u001c\u0010\\\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bZ\u00105\u0012\u0004\b[\u0010\u0003¨\u0006]"}, m87232d2 = {"Ll/dsa;", "", "<init>", "()V", "", "isChecked", "", RXScreenCaptureService.KEY_INDEX, "(Z)V", "", "fromType", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)Z", "u", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lorg/json/JSONObject;", "trackParams", "Ll/d30;", "positiveAction", "B", "(Lcom/p1/mobile/android/app/Act;Lorg/json/JSONObject;Ll/d30;)V", "negativeAction", b2s.C_ZONE, "(Lcom/p1/mobile/android/app/Act;Lorg/json/JSONObject;Ll/d30;Ll/d30;)V", "Landroid/text/SpannableStringBuilder;", "content", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", BLiveVoiceSingTogehterState.confirm, "cancel", "D", "(Lcom/p1/mobile/android/app/Act;Landroid/text/SpannableStringBuilder;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Ll/d30;Ll/d30;)V", "", "percentage", "type", BLiveStormDanmakuGiftResourceType.f44444l, "(ILcom/p1/mobile/putong/core/data/PurchaseType;)Landroid/text/SpannableStringBuilder;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "Ll/cmd0;", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ll/cmd0;", ResourceDirection.f38808v, "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Z", "n", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "q", "k", "p", "w", "a", "Z", "isUserClickAgreementCheckBoxForMyPrivilegePage", "A", "isUserClickAgreementCheckBoxForMyPrivilegePage$annotations", "Ljava/lang/ref/WeakReference;", "Ll/zc0;", "b", "Ljava/lang/ref/WeakReference;", "getMyPrivilegeAgreementCheckEventManger", "()Ljava/lang/ref/WeakReference;", BaseSei.f13931Y, "(Ljava/lang/ref/WeakReference;)V", "getMyPrivilegeAgreementCheckEventManger$annotations", "myPrivilegeAgreementCheckEventManger", "c", "o", BaseSei.f13932Z, "getTempAgreementCheckEventMangerForPExp$annotations", "tempAgreementCheckEventMangerForPExp", "Lrx/subjects/b;", Constants.INAPP_DATA_TAG, "Lrx/subjects/b;", "getChangeCheckStateUpdateData$annotations", "changeCheckStateUpdateData", "e", "Lkotlin/Lazy;", "getConfigSwitch", "configSwitch", "f", "getConfigSwitchForPromotionPage", "configSwitchForPromotionPage", "value", "g", "j", BaseSei.f13930X, "getInterceptAliAutoPay$annotations", "interceptAliAutoPay", "h", "getInterceptNormalPayRetainDlg$annotations", "interceptNormalPayRetainDlg", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static C22393b<Boolean> changeCheckStateUpdateData;

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
        C22393b<Boolean> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        changeCheckStateUpdateData = c22393bM221521b;
        configSwitch = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.vra
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(dsa.m113432e());
            }
        });
        configSwitchForPromotionPage = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.wra
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(dsa.m113430c());
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final void m113424A(boolean z) {
        isUserClickAgreementCheckBoxForMyPrivilegePage = z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: B */
    public static final void m113425B(@NotNull Act act, @Nullable JSONObject trackParams, @NotNull d30 positiveAction) {
        act.getClass();
        positiveAction.getClass();
        m113426C(act, trackParams, positiveAction, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, l.cwf0] */
    @JvmStatic
    /* JADX INFO: renamed from: C */
    public static final void m113426C(@NotNull Act act, @Nullable JSONObject trackParams, @NotNull final d30 positiveAction, @Nullable final d30 negativeAction) {
        act.getClass();
        positiveAction.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (trackParams != null) {
            ?? M133794c = i0e.m133794c("p_purchase_confirm_pop", Dialog.class.getName());
            objectRef.element = M133794c;
            if (M133794c != 0) {
                M133794c.m109039o(trackParams);
            }
        }
        View viewInflate = o7r.m163037a(act).inflate(m6c0.f131558Z0, (ViewGroup) null);
        viewInflate.getClass();
        PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView = (PurchaseAutoRenewConfirmView) viewInflate;
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(purchaseAutoRenewConfirmView).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.xra
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                dsa.m113435h(objectRef, dialogInterface);
            }
        }).m110961P(false).m110960O();
        PurchaseAutoRenewConfirmView.m53110h(purchaseAutoRenewConfirmView, new d30() { // from class: l.yra
            @Override // p149l.d30
            public final void call() {
                dsa.m113429b(dd80VarM110960O, positiveAction);
            }
        }, new d30() { // from class: l.zra
            @Override // p149l.d30
            public final void call() {
                dsa.m113428a(dd80VarM110960O, negativeAction);
            }
        }, null, 4, null);
        dd80VarM110960O.show();
        T t = objectRef.element;
        if (((cwf0) t) != null) {
            i0e.m133797f((cwf0) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, l.cwf0] */
    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final void m113427D(@NotNull Act act, @NotNull SpannableStringBuilder content, @NotNull PurchaseType purchaseType, @Nullable JSONObject trackParams, @Nullable final d30 confirm, @Nullable final d30 cancel) {
        act.getClass();
        content.getClass();
        purchaseType.getClass();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_auto_newconfirm", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("productType", purchaseType.productCategory().name()));
        i0e.m133797f(cwf0VarM133794c);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (trackParams != null) {
            ?? M133794c = i0e.m133794c("p_purchase_confirm_pop", Dialog.class.getName());
            objectRef.element = M133794c;
            if (M133794c != 0) {
                M133794c.m109039o(trackParams);
            }
        }
        View viewInflate = o7r.m163037a(act).inflate(m6c0.f131658w0, (ViewGroup) null);
        viewInflate.getClass();
        PrivilegeConfirmDialog privilegeConfirmDialog = (PrivilegeConfirmDialog) viewInflate;
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(privilegeConfirmDialog).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.asa
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                dsa.m113434g(cwf0VarM133794c, objectRef, dialogInterface);
            }
        }).m110960O();
        privilegeConfirmDialog.m54232d(content, new d30() { // from class: l.bsa
            @Override // p149l.d30
            public final void call() {
                dsa.m113433f(confirm, dd80VarM110960O);
            }
        }, new d30() { // from class: l.csa
            @Override // p149l.d30
            public final void call() {
                dsa.m113431d(cancel, dd80VarM110960O);
            }
        });
        dd80VarM110960O.show();
        T t = objectRef.element;
        if (((cwf0) t) != null) {
            i0e.m133797f((cwf0) t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m113428a(dd80 dd80Var, d30 d30Var) {
        dd80Var.dismiss();
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m113429b(dd80 dd80Var, d30 d30Var) {
        dd80Var.dismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m113430c() {
        return RemoteConfig.m79298x().m79330s("agreement_check_show_switch_for_promotion_page");
    }

    /* JADX INFO: renamed from: d */
    public static void m113431d(d30 d30Var, dd80 dd80Var) {
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.m220396r("e_unauto_newconfirm", "p_auto_newconfirm");
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m113432e() {
        return RemoteConfig.m79298x().m79330s("agreement_check_show_switch");
    }

    /* JADX INFO: renamed from: f */
    public static void m113433f(d30 d30Var, dd80 dd80Var) {
        if (d30Var != null) {
            d30Var.call();
        }
        zvf0.m220396r("e_auto_newconfirm", "p_auto_newconfirm");
        dd80Var.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m113434g(cwf0 cwf0Var, Ref.ObjectRef objectRef, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        cwf0 cwf0Var2 = (cwf0) objectRef.element;
        if (cwf0Var2 != null) {
            i0e.m133796e(cwf0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static void m113435h(Ref.ObjectRef objectRef, DialogInterface dialogInterface) {
        cwf0 cwf0Var = (cwf0) objectRef.element;
        if (cwf0Var != null) {
            i0e.m133796e(cwf0Var);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m113436i(boolean isChecked) {
        zc0 zc0Var;
        isUserClickAgreementCheckBoxForMyPrivilegePage = isChecked;
        WeakReference<zc0> weakReference = myPrivilegeAgreementCheckEventManger;
        if (weakReference == null || (zc0Var = weakReference.get()) == null) {
            return;
        }
        zc0Var.m218008b(isChecked);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m113437j() {
        return interceptAliAutoPay;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m113438k() {
        boolean z = interceptNormalPayRetainDlg;
        interceptNormalPayRetainDlg = false;
        return z;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final SpannableStringBuilder m113439l(int percentage, @NotNull PurchaseType type) {
        String str;
        type.getClass();
        if (percentage <= 0 || percentage >= 100) {
            str = "受优惠";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), "%s优惠", Arrays.copyOf(new Object[]{percentage + "%"}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), " 同意%1$s，享%2$s和最高%3$s", Arrays.copyOf(new Object[]{"会员协议", str, String.format(Locale.getDefault(), "%d倍加速曝光", Arrays.copyOf(new Object[]{Integer.valueOf(sab0.m182905w(type) ? 3 : 9)}, 1))}, 3));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int iC0 = StringsKt.m93436c0(str2, "会员协议", 0, false, 6, null);
        spannableStringBuilder.setSpan(new c95(we60.f185908b).m105841b(Color.parseColor("#65000000")).m105842c(CoreModule.f17544b.getString(R$string.f27130D6)).m105843d(false), iC0, iC0 + 4, 18);
        return spannableStringBuilder;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final cmd0 m113440m(@NotNull C8765d.a detail) {
        detail.getClass();
        cmd0 cmd0Var = new cmd0(0);
        Merchandise merchandiseM53601s = detail.m53601s();
        if (merchandiseM53601s == null || !merchandiseM53601s.autoRenewable() || !rxa0.m181502w(merchandiseM53601s) || (!merchandiseM53601s.quarterly() && !merchandiseM53601s.semiAnnual())) {
            return cmd0Var;
        }
        cmd0 cmd0VarM107610a = cmd0Var.m107610a(merchandiseM53601s.quantity);
        cmd0VarM107610a.getClass();
        return cmd0VarM107610a;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m113441n(@NotNull C8765d.a detail) {
        detail.getClass();
        if (!rxa0.m181493n(detail.m53601s())) {
            return "限时优惠";
        }
        double firstCouponPrice = detail.m53601s().getFirstCouponPrice();
        double d = detail.m53601s().defaultStockKeepUnit.prices.price;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("已优惠%.0f元", Arrays.copyOf(new Object[]{Double.valueOf(d - firstCouponPrice)}, 1));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static final WeakReference<zc0> m113442o() {
        return tempAgreementCheckEventMangerForPExp;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m113443p() {
        interceptNormalPayRetainDlg = true;
        m113451x(true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final boolean m113444q() {
        return RemoteConfig.m79298x().m79330s("auto_pay_for_reject");
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r */
    public static final boolean m113445r() {
        return m113447t(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s */
    public static final boolean m113446s(@Nullable String fromType) {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m113447t(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "DEFAULT_UNKONW";
        }
        return m113446s(str);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u */
    public static final boolean m113448u() {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final boolean m113449v(@NotNull C8765d.a detail) {
        detail.getClass();
        Merchandise merchandiseM53601s = detail.m53601s();
        return merchandiseM53601s != null && merchandiseM53601s.autoRenewable() && (merchandiseM53601s.quarterly() || merchandiseM53601s.semiAnnual()) && rxa0.m181502w(merchandiseM53601s);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m113450w() {
        interceptNormalPayRetainDlg = false;
        m113451x(false);
    }

    /* JADX INFO: renamed from: x */
    public static final void m113451x(boolean z) {
        if (m113444q()) {
            z = false;
        }
        interceptAliAutoPay = z;
    }

    /* JADX INFO: renamed from: y */
    public static final void m113452y(@Nullable WeakReference<zc0> weakReference) {
        myPrivilegeAgreementCheckEventManger = weakReference;
    }

    /* JADX INFO: renamed from: z */
    public static final void m113453z(@Nullable WeakReference<zc0> weakReference) {
        tempAgreementCheckEventMangerForPExp = weakReference;
    }
}
