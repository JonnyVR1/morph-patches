package com.p046p1.mobile.putong.core.p053ui.purchase.boost.component;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.boost.component.BoostIapPaymentComponent;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.b1c0;
import p149l.b2s;
import p149l.d30;
import p149l.d3c0;
import p149l.dvm;
import p149l.e30;
import p149l.g30;
import p149l.l9r;
import p149l.lsi0;
import p149l.m6c0;
import p149l.q89;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.z4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001hB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0011J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0011J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0011J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0011J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0011J\u0017\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J%\u0010>\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\u0011J\u0015\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020,¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bD\u0010\u0015J)\u0010H\u001a\u00020\b2\u001a\u0010G\u001a\u0016\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,\u0018\u00010E¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010QR\u0018\u0010^\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010QR\u0016\u0010a\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R*\u0010c\u001a\u0016\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010dR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010f¨\u0006i"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.KEY_T, "(Landroid/view/View;)V", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, "G", "(Ll/e30;)V", "B", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "M", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "m", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, b2s.C_ZONE, "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/e30;)V", "q", "p", "", "J", "()Z", ResourceDirection.f38808v, "w", "u", "isUltra", "n", "(Z)I", "I", "Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", "", "K", "()Ljava/lang/String;", "style", "h", "(Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;)V", "j", RXScreenCaptureService.KEY_INDEX, "F", "r", BaseSei.f13931Y, BaseSei.f13930X, "Landroid/view/ViewGroup;", "root", "k", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", "onCancel", "A", "(Ll/e30;Ll/d30;)V", "L", "from", "D", "(Ljava/lang/String;)V", BaseSei.f13932Z, "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", "E", "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "o", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "g", "Ljava/lang/String;", "purchaseshowfrom", "Ll/g30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/e30;", "dismissAction", "ButtonStyle", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class BoostIapPaymentComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public VText primaryButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public VLinear secondaryButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public VImage secondaryButtonIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public VText secondaryButtonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public VText agreementText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String purchaseshowfrom;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccessAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dismissAction;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "PREMIUM", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum ButtonStyle {
        ULTRA,
        PREMIUM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<ButtonStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.boost.component.BoostIapPaymentComponent$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8762a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34516a;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.ULTRA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34516a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.boost.component.BoostIapPaymentComponent$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8763b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f34518b;

        public C8763b(String str) {
            this.f34518b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            BoostIapPaymentComponent.this.act.startActivity(MkWebViewAct.m80238c2(BoostIapPaymentComponent.this.act, "", this.f34518b, true, true, null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            ds.getClass();
            ds.setColor(ds.linkColor);
            ds.setUnderlineText(false);
        }
    }

    public BoostIapPaymentComponent(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.purchaseshowfrom = "";
    }

    /* JADX INFO: renamed from: H */
    public static final void m53335H(BoostIapPaymentComponent boostIapPaymentComponent, e30 e30Var, View view) {
        boostIapPaymentComponent.m53360m(e30Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m53336a(BoostIapPaymentComponent boostIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = boostIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(purchaseType, boostIapPaymentComponent.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = boostIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m53337b(BoostIapPaymentComponent boostIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = boostIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(purchaseType, boostIapPaymentComponent.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = boostIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m53338c(BoostIapPaymentComponent boostIapPaymentComponent, e30 e30Var) {
        boostIapPaymentComponent.m53364q(e30Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m53339d(BoostIapPaymentComponent boostIapPaymentComponent) {
        boostIapPaymentComponent.m53363p();
    }

    /* JADX INFO: renamed from: e */
    public static void m53340e(BoostIapPaymentComponent boostIapPaymentComponent, View view) {
        boostIapPaymentComponent.m53365r();
    }

    /* JADX INFO: renamed from: A */
    public final void m53343A(@NotNull e30<Integer> dismiss, @Nullable d30 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m53344B();
        m53349G(dismiss);
        m53350I();
    }

    /* JADX INFO: renamed from: B */
    public final void m53344B() {
        String str = SignParameters.NEW_LINE + this.act.string(R$string.f27405c4);
        String string = this.act.getString(R$string.f27385a8, str);
        string.getClass();
        String strM113794j = dvm.m113794j();
        int iC0 = StringsKt.m93436c0(string, str, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C8763b(strM113794j), iC0, str.length() + iC0, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iC0, str.length() + iC0, 33);
        VText vText = this.agreementText;
        if (vText != null) {
            vText.setText(spannableStringBuilder);
        }
        VText vText2 = this.agreementText;
        if (vText2 != null) {
            vText2.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m53345C(Merchandise merchandise) {
        zvf0.m220399u("e_intl_boost_iap_sku_click", "p_intl_boost_iap_view", vwb.m200311Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId()));
    }

    /* JADX INFO: renamed from: D */
    public final void m53346D(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: E */
    public final void m53347E(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: F */
    public final void m53348F() {
        xdl0.m208329E0(this.secondaryButton, new View.OnClickListener() { // from class: l.i83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostIapPaymentComponent.m53340e(this.f111975a, view);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m53349G(final e30<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.j83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostIapPaymentComponent.m53335H(this.f116675a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m53350I() {
        m53355h(m53359l());
        m53348F();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m53351J() {
        if (m53369v()) {
            return true;
        }
        return m53370w() && m53368u();
    }

    /* JADX INFO: renamed from: K */
    public final String m53352K() {
        return m53351J() ? SummarizedPrivilegesId.ultraPremium : "premium";
    }

    /* JADX INFO: renamed from: L */
    public final void m53353L() {
        e30<Integer> e30Var = this.dismissAction;
        if (e30Var != null) {
            m53360m(e30Var);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m53354M(C8765d section) {
        C8765d.a aVarM53522d = section.m53522d();
        String strM53643q = C8766e.m53643q(aVarM53522d);
        Merchandise merchandiseM53601s = aVarM53522d.m53601s();
        String string = this.act.getString(R$string.f27604t2, String.valueOf(merchandiseM53601s != null ? merchandiseM53601s.quantity : 0), strM53643q);
        string.getClass();
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setText(string);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m53355h(ButtonStyle style) {
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
        }
        int i = C8762a.f34516a[style.ordinal()];
        if (i == 1) {
            m53357j();
        } else if (i == 2) {
            m53356i();
        } else {
            l9r.m149037a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m53356i() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(d3c0.f83544E0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(d3c0.f83803X0);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor("#FFE59D"));
            vText.setText(this.act.getString(m53361n(false)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m53357j() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(d3c0.f83558F0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(d3c0.f84166x2);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor("#F9E7FF"));
            vText.setText(this.act.getString(m53361n(true)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final View m53358k(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.f131609k, root, false);
        viewInflate.getClass();
        m53367t(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public final ButtonStyle m53359l() {
        return m53351J() ? ButtonStyle.ULTRA : ButtonStyle.PREMIUM;
    }

    /* JADX INFO: renamed from: m */
    public final void m53360m(e30<Integer> dismiss) {
        Merchandise merchandiseM53601s;
        C8765d.a aVarM53362o = m53362o();
        if (aVarM53362o == null || (merchandiseM53601s = aVarM53362o.m53601s()) == null) {
            return;
        }
        m53345C(merchandiseM53601s);
        m53366s(merchandiseM53601s, dismiss);
    }

    /* JADX INFO: renamed from: n */
    public final int m53361n(boolean isUltra) {
        boolean zM28126v = IntlCountryCodeController.m28126v();
        if (isUltra && zM28126v) {
            return R$string.f27338W5;
        }
        if (isUltra) {
            return R$string.f27327V5;
        }
        return zM28126v ? R$string.f27465h4 : R$string.f27661y4;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final C8765d.a m53362o() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d != null) {
            return c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m53363p() {
        lsi0.m151578h(R$string.f27433e8);
    }

    /* JADX INFO: renamed from: q */
    public final void m53364q(e30<Integer> dismiss) {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
        CoreModule.f17545c.f19639e0.m169397H9();
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(PurchaseType.TYPE_TTC_BOOST, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: r */
    public final void m53365r() {
        zvf0.m220399u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_boost_iap_view", vwb.m200311Y("subtype", m53352K()));
        if (m53351J()) {
            m53372y();
        } else {
            m53371x();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m53366s(Merchandise merchandise, final e30<Integer> dismiss) {
        CoreModule.m29935P().m94651a().mo33312Eo(this.act, PurchaseType.TYPE_TTC_BOOST, false, new d30() { // from class: l.m83
            @Override // p149l.d30
            public final void call() {
                BoostIapPaymentComponent.m53338c(this.f132507a, dismiss);
            }
        }, new d30() { // from class: l.n83
            @Override // p149l.d30
            public final void call() {
                BoostIapPaymentComponent.m53339d(this.f137573a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: t */
    public final void m53367t(View view) {
        this.primaryButton = (VText) view.findViewById(z4c0.f201571w0);
        this.secondaryButton = (VLinear) view.findViewById(z4c0.f201490Q);
        this.secondaryButtonIcon = (VImage) view.findViewById(z4c0.f201492R);
        this.secondaryButtonText = (VText) view.findViewById(z4c0.f201494S);
        this.agreementText = (VText) view.findViewById(z4c0.f201516c);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m53368u() {
        q89 q89Var = CoreModule.f17545c.f19672p0;
        return q89Var.f153140R == 1 && q89Var.f153141S > q89Var.f153142T;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m53369v() {
        return !xma.m210071e4();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m53370w() {
        return xma.m210071e4();
    }

    /* JADX INFO: renamed from: x */
    public final void m53371x() {
        C8764c.m53384D0(this.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.boost, null, new e30() { // from class: l.k83
            @Override // p149l.e30
            public final void call(Object obj) {
                BoostIapPaymentComponent.m53336a(this.f121715a, (PurchaseType) obj);
            }
        }, -1, null, null, null, null, false, false, 3840, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m53372y() {
        C8764c.m53414N0(this.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", new e30() { // from class: l.l83
            @Override // p149l.e30
            public final void call(Object obj) {
                BoostIapPaymentComponent.m53337b(this.f126783a, (PurchaseType) obj);
            }
        }, null, null, Privilege.full_boost, null, 64, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m53373z(@NotNull C8765d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m53354M(section);
    }
}
