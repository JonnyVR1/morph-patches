package com.p046p1.mobile.putong.core.p053ui.purchase.superlike.component;

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
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.superlike.component.SuperlikeIapPaymentComponent;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import p149l.j6f;
import p149l.l9r;
import p149l.lsi0;
import p149l.m6c0;
import p149l.p2b0;
import p149l.q89;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.z4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010!J\u000f\u0010'\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010!J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0011J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020,H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0011J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0011J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0011J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0011J\u000f\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010\u0011J\u000f\u0010<\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010\u0011J\u0017\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J%\u0010C\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010\u0011J\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020/¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bI\u0010\u0015J)\u0010M\u001a\u00020\b2\u001a\u0010L\u001a\u0016\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/\u0018\u00010J¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0018\u0010c\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0016\u0010f\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR*\u0010i\u001a\u0016\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010jR\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010l¨\u0006o"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", ResourceDirection.f38808v, "(Landroid/view/View;)V", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, "L", "(Ll/e30;)V", "G", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", j6f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "o", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "H", "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "u", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/e30;)V", BLiveStormDanmakuGiftResourceType.f44446s, "r", "", "P", "()Z", BaseSei.f13932Z, "A", BaseSei.f13930X, BaseSei.f13931Y, BloodType.f38728O, "w", "isUltra", "p", "(Z)I", "N", "Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "", "Q", "()Ljava/lang/String;", "style", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;)V", "k", "j", BLiveStormDanmakuGiftResourceType.f44444l, "K", Constants.KEY_T, b2s.C_ZONE, "B", "D", "Landroid/view/ViewGroup;", "root", "m", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", "onCancel", "F", "(Ll/e30;Ll/d30;)V", "R", "from", "I", "(Ljava/lang/String;)V", "E", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", "J", "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "q", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "g", "Ljava/lang/String;", "purchaseshowfrom", "h", "Ll/g30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/e30;", "dismissAction", "ButtonStyle", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SuperlikeIapPaymentComponent {

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

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "PREMIUM", "VIP", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum ButtonStyle {
        ULTRA,
        PREMIUM,
        VIP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<ButtonStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.superlike.component.SuperlikeIapPaymentComponent$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8805a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35310a;

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
            try {
                iArr[ButtonStyle.VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35310a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.superlike.component.SuperlikeIapPaymentComponent$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8806b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f35312b;

        public C8806b(String str) {
            this.f35312b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            SuperlikeIapPaymentComponent.this.act.startActivity(MkWebViewAct.m80238c2(SuperlikeIapPaymentComponent.this.act, "", this.f35312b, true, true, null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            ds.getClass();
            ds.setColor(ds.linkColor);
            ds.setUnderlineText(false);
        }
    }

    public SuperlikeIapPaymentComponent(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.purchaseshowfrom = "";
    }

    /* JADX INFO: renamed from: M */
    public static final void m54399M(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, e30 e30Var, View view) {
        superlikeIapPaymentComponent.m54432o(e30Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m54400a(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, View view) {
        superlikeIapPaymentComponent.m54437t();
    }

    /* JADX INFO: renamed from: b */
    public static void m54401b(SuperlikeIapPaymentComponent superlikeIapPaymentComponent) {
        superlikeIapPaymentComponent.m54435r();
    }

    /* JADX INFO: renamed from: c */
    public static void m54402c(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = superlikeIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m54403d(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, e30 e30Var) {
        superlikeIapPaymentComponent.m54436s(e30Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m54404e(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = superlikeIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m54406g(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = superlikeIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m54408A() {
        return (xma.m210087m4() && xma.m210071e4()) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public final void m54409B() {
        C8764c.m53384D0(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.vip_super_like, null, new e30() { // from class: l.eyg0
            @Override // p149l.e30
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m54406g(this.f93752a, (PurchaseType) obj);
            }
        }, 0, null, null, null, null, false, false, 4064, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m54410C() {
        C8764c.m53414N0(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", new e30() { // from class: l.byg0
            @Override // p149l.e30
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m54404e(this.f77918a, (PurchaseType) obj);
            }
        }, null, null, Privilege.unlimit_free_super_like, null, 64, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m54411D() {
        C8764c.m53415N1(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.vip_super_like, null, null, false, null, null, new e30() { // from class: l.fyg0
            @Override // p149l.e30
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m54402c(this.f99870a, (PurchaseType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m54412E(@NotNull C8765d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m54425S(section);
    }

    /* JADX INFO: renamed from: F */
    public final void m54413F(@NotNull e30<Integer> dismiss, @Nullable d30 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m54414G();
        m54419L(dismiss);
        m54420N();
    }

    /* JADX INFO: renamed from: G */
    public final void m54414G() {
        String str = SignParameters.NEW_LINE + this.act.string(R$string.f27405c4);
        String string = this.act.getString(R$string.f27385a8, str);
        string.getClass();
        String strM113794j = dvm.m113794j();
        int iC0 = StringsKt.m93436c0(string, str, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C8806b(strM113794j), iC0, str.length() + iC0, 33);
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

    /* JADX INFO: renamed from: H */
    public final void m54415H(Merchandise merchandise) {
        zvf0.m220399u("e_intl_superlike_iap_sku_click", "p_intl_super_like_iap_view", vwb.m200311Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId()));
    }

    /* JADX INFO: renamed from: I */
    public final void m54416I(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: J */
    public final void m54417J(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: K */
    public final void m54418K() {
        xdl0.m208329E0(this.secondaryButton, new View.OnClickListener() { // from class: l.zxg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperlikeIapPaymentComponent.m54400a(this.f205410a, view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final void m54419L(final e30<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.ayg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuperlikeIapPaymentComponent.m54399M(this.f72276a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m54420N() {
        m54426i(m54431n());
        m54418K();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m54421O() {
        CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        if (m54422P()) {
            return false;
        }
        if (coreProviderInterfaceM195057d.mo33734Oi()) {
            return true;
        }
        if (coreProviderInterfaceM195057d.mo33742Qi()) {
            return m54440w();
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m54422P() {
        CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        if (coreProviderInterfaceM195057d.mo33734Oi()) {
            return m54443z() || m54441x();
        }
        if (coreProviderInterfaceM195057d.mo33742Qi()) {
            return m54408A() || m54442y();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final String m54423Q() {
        if (m54422P()) {
            return SummarizedPrivilegesId.ultraPremium;
        }
        return m54421O() ? "premium" : "vip";
    }

    /* JADX INFO: renamed from: R */
    public final void m54424R() {
        e30<Integer> e30Var = this.dismissAction;
        if (e30Var != null) {
            m54432o(e30Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m54425S(C8765d section) {
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

    /* JADX INFO: renamed from: i */
    public final void m54426i(ButtonStyle style) {
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
        }
        int i = C8805a.f35310a[style.ordinal()];
        if (i == 1) {
            m54428k();
            return;
        }
        if (i == 2) {
            m54427j();
        } else if (i == 3) {
            m54429l();
        } else {
            l9r.m149037a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m54427j() {
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
            vText.setText(this.act.getString(m54433p(false)));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m54428k() {
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
            vText.setText(this.act.getString(m54433p(true)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m54429l() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(d3c0.f83572G0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(d3c0.f83753T2);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor(Constants.BLACK));
            vText.setText(this.act.getString(m54433p(false)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final View m54430m(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.f131562a0, root, false);
        viewInflate.getClass();
        m54439v(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: n */
    public final ButtonStyle m54431n() {
        if (m54422P()) {
            return ButtonStyle.ULTRA;
        }
        return m54421O() ? ButtonStyle.PREMIUM : ButtonStyle.VIP;
    }

    /* JADX INFO: renamed from: o */
    public final void m54432o(e30<Integer> dismiss) {
        Merchandise merchandiseM53601s;
        C8765d.a aVarM54434q = m54434q();
        if (aVarM54434q == null || (merchandiseM53601s = aVarM54434q.m53601s()) == null) {
            return;
        }
        m54415H(merchandiseM53601s);
        m54438u(merchandiseM53601s, dismiss);
    }

    /* JADX INFO: renamed from: p */
    public final int m54433p(boolean isUltra) {
        boolean zM28126v = IntlCountryCodeController.m28126v();
        CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        if (isUltra && zM28126v) {
            return R$string.f27431e6;
        }
        if (isUltra) {
            return R$string.f27419d6;
        }
        if (coreProviderInterfaceM195057d.mo33734Oi() && zM28126v) {
            return R$string.f27464h3;
        }
        if (coreProviderInterfaceM195057d.mo33734Oi()) {
            return R$string.f27452g3;
        }
        return zM28126v ? R$string.f27490j5 : R$string.f27478i5;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final C8765d.a m54434q() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d != null) {
            return c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m54435r() {
        lsi0.m151578h(R$string.f27433e8);
    }

    /* JADX INFO: renamed from: s */
    public final void m54436s(e30<Integer> dismiss) {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
        CoreModule.f17545c.f19639e0.m169397H9();
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(PurchaseType.TYPE_GET_VIP_SUPERLIKE, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m54437t() {
        CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
        zvf0.m220399u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_super_like_iap_view", vwb.m200311Y("subtype", m54423Q()));
        if (m54422P()) {
            m54410C();
            return;
        }
        if (!m54421O()) {
            m54411D();
        } else if (coreProviderInterfaceM195057d.mo33734Oi()) {
            m54409B();
        } else {
            m54411D();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m54438u(Merchandise merchandise, final e30<Integer> dismiss) {
        CoreModule.m29935P().m94651a().mo33312Eo(this.act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, false, new d30() { // from class: l.cyg0
            @Override // p149l.d30
            public final void call() {
                SuperlikeIapPaymentComponent.m54403d(this.f82982a, dismiss);
            }
        }, new d30() { // from class: l.dyg0
            @Override // p149l.d30
            public final void call() {
                SuperlikeIapPaymentComponent.m54401b(this.f88392a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: v */
    public final void m54439v(View view) {
        this.primaryButton = (VText) view.findViewById(z4c0.f201571w0);
        this.secondaryButton = (VLinear) view.findViewById(z4c0.f201490Q);
        this.secondaryButtonIcon = (VImage) view.findViewById(z4c0.f201492R);
        this.secondaryButtonText = (VText) view.findViewById(z4c0.f201494S);
        this.agreementText = (VText) view.findViewById(z4c0.f201516c);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m54440w() {
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowTypeM167140i = p2b0.m167133h().m167140i("vip", "");
        return TEnum.equals(purchaseDialogConfigTriggerShowTypeM167140i, PurchaseDialogConfigTriggerShowType.vip_svip) || TEnum.equals(purchaseDialogConfigTriggerShowTypeM167140i, "svip");
    }

    /* JADX INFO: renamed from: x */
    public final boolean m54441x() {
        q89 q89Var = CoreModule.f17545c.f19672p0;
        return q89Var.f153140R == 1 && q89Var.f153141S > q89Var.f153142T;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m54442y() {
        q89 q89Var = CoreModule.f17545c.f19672p0;
        return q89Var.f153140R == 1 && q89Var.f153141S > q89Var.f153142T;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m54443z() {
        return !xma.m210071e4();
    }
}
