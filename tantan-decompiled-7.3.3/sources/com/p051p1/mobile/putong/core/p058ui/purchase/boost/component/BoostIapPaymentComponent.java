package com.p051p1.mobile.putong.core.p058ui.purchase.boost.component;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.boost.component.BoostIapPaymentComponent;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.a30;
import p153l.bnl0;
import p153l.c4s;
import p153l.exm;
import p153l.fdc0;
import p153l.h9c0;
import p153l.i4g0;
import p153l.jbc0;
import p153l.joa;
import p153l.jyb;
import p153l.nbr;
import p153l.o1j0;
import p153l.rec0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;
import p153l.z99;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001hB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0011J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0011J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0011J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0011J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0011J\u0017\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J%\u0010>\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\u0011J\u0015\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020,¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bD\u0010\u0015J)\u0010H\u001a\u00020\b2\u001a\u0010G\u001a\u0016\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,\u0018\u00010E¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010QR\u0018\u0010^\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010QR\u0016\u0010a\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R*\u0010c\u001a\u0016\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010dR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010f¨\u0006i"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", Constants.KEY_T, "(Landroid/view/View;)V", "Ll/y20;", "", SysnotifListener.ACTION_DISMISS, "G", "(Ll/y20;)V", "B", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "M", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "m", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, c4s.C_ZONE, "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/y20;)V", "q", "p", "", "J", "()Z", ResourceDirection.f39656v, "w", "u", "isUltra", "n", "(Z)I", "I", "Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", "", "K", "()Ljava/lang/String;", "style", "h", "(Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;)V", "j", RXScreenCaptureService.KEY_INDEX, "F", "r", BaseSei.f14625Y, BaseSei.f14624X, "Landroid/view/ViewGroup;", "root", "k", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/x20;", "onCancel", "A", "(Ll/y20;Ll/x20;)V", "L", "from", "D", "(Ljava/lang/String;)V", BaseSei.f14626Z, "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", "E", "(Ll/a30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "o", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "g", "Ljava/lang/String;", "purchaseshowfrom", "Ll/a30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/y20;", "dismissAction", "ButtonStyle", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public a30<PurchaseType, Act, String> onPaymentSuccessAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dismissAction;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "PREMIUM", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum ButtonStyle {
        ULTRA,
        PREMIUM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<ButtonStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.boost.component.BoostIapPaymentComponent$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8925a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35364a;

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
            f35364a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.boost.component.BoostIapPaymentComponent$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8926b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f35366b;

        public C8926b(String str) {
            this.f35366b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            BoostIapPaymentComponent.this.act.startActivity(MkWebViewAct.m81421d2(BoostIapPaymentComponent.this.act, "", this.f35366b, true, true, null));
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
    public static final void m54518H(BoostIapPaymentComponent boostIapPaymentComponent, y20 y20Var, View view) {
        boostIapPaymentComponent.m54543m(y20Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m54519a(BoostIapPaymentComponent boostIapPaymentComponent, PurchaseType purchaseType) {
        a30<PurchaseType, Act, String> a30Var = boostIapPaymentComponent.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(purchaseType, boostIapPaymentComponent.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        y20<Integer> y20Var = boostIapPaymentComponent.dismissAction;
        if (y20Var != null) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m54520b(BoostIapPaymentComponent boostIapPaymentComponent, PurchaseType purchaseType) {
        a30<PurchaseType, Act, String> a30Var = boostIapPaymentComponent.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(purchaseType, boostIapPaymentComponent.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        y20<Integer> y20Var = boostIapPaymentComponent.dismissAction;
        if (y20Var != null) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m54521c(BoostIapPaymentComponent boostIapPaymentComponent, y20 y20Var) {
        boostIapPaymentComponent.m54547q(y20Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m54522d(BoostIapPaymentComponent boostIapPaymentComponent) {
        boostIapPaymentComponent.m54546p();
    }

    /* JADX INFO: renamed from: e */
    public static void m54523e(BoostIapPaymentComponent boostIapPaymentComponent, View view) {
        boostIapPaymentComponent.m54548r();
    }

    /* JADX INFO: renamed from: A */
    public final void m54526A(@NotNull y20<Integer> dismiss, @Nullable x20 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m54527B();
        m54532G(dismiss);
        m54533I();
    }

    /* JADX INFO: renamed from: B */
    public final void m54527B() {
        String str = SignParameters.NEW_LINE + this.act.string(R$string.f28253c4);
        String string = this.act.getString(R$string.f28233a8, str);
        string.getClass();
        String strM123073j = exm.m123073j();
        int iC0 = StringsKt.m94327c0(string, str, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C8926b(strM123073j), iC0, str.length() + iC0, 33);
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
    public final void m54528C(Merchandise merchandise) {
        i4g0.m138523u("e_intl_boost_iap_sku_click", "p_intl_boost_iap_view", jyb.m147494Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId()));
    }

    /* JADX INFO: renamed from: D */
    public final void m54529D(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: E */
    public final void m54530E(@Nullable a30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: F */
    public final void m54531F() {
        bnl0.m105509E0(this.secondaryButton, new View.OnClickListener() { // from class: l.x83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostIapPaymentComponent.m54523e(this.f192778a, view);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m54532G(final y20<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.y83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostIapPaymentComponent.m54518H(this.f197937a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m54533I() {
        m54538h(m54542l());
        m54531F();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m54534J() {
        if (m54552v()) {
            return true;
        }
        return m54553w() && m54551u();
    }

    /* JADX INFO: renamed from: K */
    public final String m54535K() {
        return m54534J() ? SummarizedPrivilegesId.ultraPremium : "premium";
    }

    /* JADX INFO: renamed from: L */
    public final void m54536L() {
        y20<Integer> y20Var = this.dismissAction;
        if (y20Var != null) {
            m54543m(y20Var);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m54537M(C8928d section) {
        C8928d.a aVarM54705d = section.m54705d();
        String strM54826q = C8929e.m54826q(aVarM54705d);
        Merchandise merchandiseM54784s = aVarM54705d.m54784s();
        String string = this.act.getString(R$string.f28452t2, String.valueOf(merchandiseM54784s != null ? merchandiseM54784s.quantity : 0), strM54826q);
        string.getClass();
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setText(string);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m54538h(ButtonStyle style) {
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
        }
        int i = C8925a.f35364a[style.ordinal()];
        if (i == 1) {
            m54540j();
        } else if (i == 2) {
            m54539i();
        } else {
            nbr.m162172a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m54539i() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(jbc0.f119199E0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(jbc0.f119458X0);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor("#FFE59D"));
            vText.setText(this.act.getString(m54544n(false)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m54540j() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(jbc0.f119213F0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(jbc0.f119821x2);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor("#F9E7FF"));
            vText.setText(this.act.getString(m54544n(true)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final View m54541k(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162569k, root, false);
        viewInflate.getClass();
        m54550t(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public final ButtonStyle m54542l() {
        return m54534J() ? ButtonStyle.ULTRA : ButtonStyle.PREMIUM;
    }

    /* JADX INFO: renamed from: m */
    public final void m54543m(y20<Integer> dismiss) {
        Merchandise merchandiseM54784s;
        C8928d.a aVarM54545o = m54545o();
        if (aVarM54545o == null || (merchandiseM54784s = aVarM54545o.m54784s()) == null) {
            return;
        }
        m54528C(merchandiseM54784s);
        m54549s(merchandiseM54784s, dismiss);
    }

    /* JADX INFO: renamed from: n */
    public final int m54544n(boolean isUltra) {
        boolean zM29125v = IntlCountryCodeController.m29125v();
        if (isUltra && zM29125v) {
            return R$string.f28186W5;
        }
        if (isUltra) {
            return R$string.f28175V5;
        }
        return zM29125v ? R$string.f28313h4 : R$string.f28509y4;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final C8928d.a m54545o() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d != null) {
            return c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m54546p() {
        o1j0.m165634h(R$string.f28281e8);
    }

    /* JADX INFO: renamed from: q */
    public final void m54547q(y20<Integer> dismiss) {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
        CoreModule.f18264c.f20381e0.m116470H9();
        a30<PurchaseType, Act, String> a30Var = this.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(PurchaseType.TYPE_TTC_BOOST, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: r */
    public final void m54548r() {
        i4g0.m138523u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_boost_iap_view", jyb.m147494Y("subtype", m54535K()));
        if (m54534J()) {
            m54555y();
        } else {
            m54554x();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m54549s(Merchandise merchandise, final y20<Integer> dismiss) {
        CoreModule.m30933P().m143405a().mo34315Eo(this.act, PurchaseType.TYPE_TTC_BOOST, false, new x20() { // from class: l.b93
            @Override // p153l.x20
            public final void call() {
                BoostIapPaymentComponent.m54521c(this.f75503a, dismiss);
            }
        }, new x20() { // from class: l.c93
            @Override // p153l.x20
            public final void call() {
                BoostIapPaymentComponent.m54522d(this.f80283a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: t */
    public final void m54550t(View view) {
        this.primaryButton = (VText) view.findViewById(fdc0.f98447w0);
        this.secondaryButton = (VLinear) view.findViewById(fdc0.f98366Q);
        this.secondaryButtonIcon = (VImage) view.findViewById(fdc0.f98368R);
        this.secondaryButtonText = (VText) view.findViewById(fdc0.f98370S);
        this.agreementText = (VText) view.findViewById(fdc0.f98392c);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m54551u() {
        z99 z99Var = CoreModule.f18264c.f20414p0;
        return z99Var.f203451R == 1 && z99Var.f203452S > z99Var.f203453T;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m54552v() {
        return !joa.m146386f4();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m54553w() {
        return joa.m146386f4();
    }

    /* JADX INFO: renamed from: x */
    public final void m54554x() {
        C8927c.m54567D0(this.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.boost, null, new y20() { // from class: l.z83
            @Override // p153l.y20
            public final void call(Object obj) {
                BoostIapPaymentComponent.m54519a(this.f203303a, (PurchaseType) obj);
            }
        }, -1, null, null, null, null, false, false, 3840, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m54555y() {
        C8927c.m54597N0(this.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", new y20() { // from class: l.a93
            @Override // p153l.y20
            public final void call(Object obj) {
                BoostIapPaymentComponent.m54520b(this.f68983a, (PurchaseType) obj);
            }
        }, null, null, Privilege.full_boost, null, 64, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m54556z(@NotNull C8928d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m54537M(section);
    }
}
