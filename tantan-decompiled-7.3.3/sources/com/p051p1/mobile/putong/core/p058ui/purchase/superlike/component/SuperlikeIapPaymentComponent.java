package com.p051p1.mobile.putong.core.p058ui.purchase.superlike.component;

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
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.superlike.component.SuperlikeIapPaymentComponent;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p153l.gta;
import p153l.h9c0;
import p153l.i4g0;
import p153l.jbc0;
import p153l.joa;
import p153l.jyb;
import p153l.nbr;
import p153l.o1j0;
import p153l.p7f;
import p153l.rec0;
import p153l.tab0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;
import p153l.z99;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010!J\u000f\u0010'\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010!J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0011J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020,H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0011J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0011J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0011J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0011J\u000f\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010\u0011J\u000f\u0010<\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010\u0011J\u0017\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J%\u0010C\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010\u0011J\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020/¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bI\u0010\u0015J)\u0010M\u001a\u00020\b2\u001a\u0010L\u001a\u0016\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/\u0018\u00010J¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0018\u0010c\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0016\u0010f\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR*\u0010i\u001a\u0016\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010jR\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010l¨\u0006o"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", ResourceDirection.f39656v, "(Landroid/view/View;)V", "Ll/y20;", "", SysnotifListener.ACTION_DISMISS, "L", "(Ll/y20;)V", "G", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", p7f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "o", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "H", "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "u", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/y20;)V", BLiveStormDanmakuGiftResourceType.f45294s, "r", "", "P", "()Z", BaseSei.f14626Z, "A", BaseSei.f14624X, BaseSei.f14625Y, BloodType.f39576O, "w", "isUltra", "p", "(Z)I", "N", "Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "", "Q", "()Ljava/lang/String;", "style", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;)V", "k", "j", BLiveStormDanmakuGiftResourceType.f45292l, "K", Constants.KEY_T, c4s.C_ZONE, "B", "D", "Landroid/view/ViewGroup;", "root", "m", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/x20;", "onCancel", "F", "(Ll/y20;Ll/x20;)V", "R", "from", "I", "(Ljava/lang/String;)V", "E", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", "J", "(Ll/a30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "q", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "g", "Ljava/lang/String;", "purchaseshowfrom", "h", "Ll/a30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/y20;", "dismissAction", "ButtonStyle", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public a30<PurchaseType, Act, String> onPaymentSuccessAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dismissAction;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "PREMIUM", "VIP", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum ButtonStyle {
        ULTRA,
        PREMIUM,
        VIP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<ButtonStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.superlike.component.SuperlikeIapPaymentComponent$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8968a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36158a;

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
            f36158a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.superlike.component.SuperlikeIapPaymentComponent$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8969b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f36160b;

        public C8969b(String str) {
            this.f36160b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            SuperlikeIapPaymentComponent.this.act.startActivity(MkWebViewAct.m81421d2(SuperlikeIapPaymentComponent.this.act, "", this.f36160b, true, true, null));
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
    public static final void m55582M(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, y20 y20Var, View view) {
        superlikeIapPaymentComponent.m55615o(y20Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m55583a(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, View view) {
        superlikeIapPaymentComponent.m55620t();
    }

    /* JADX INFO: renamed from: b */
    public static void m55584b(SuperlikeIapPaymentComponent superlikeIapPaymentComponent) {
        superlikeIapPaymentComponent.m55618r();
    }

    /* JADX INFO: renamed from: c */
    public static void m55585c(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        a30<PurchaseType, Act, String> a30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        y20<Integer> y20Var = superlikeIapPaymentComponent.dismissAction;
        if (y20Var != null) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m55586d(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, y20 y20Var) {
        superlikeIapPaymentComponent.m55619s(y20Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m55587e(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        a30<PurchaseType, Act, String> a30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        y20<Integer> y20Var = superlikeIapPaymentComponent.dismissAction;
        if (y20Var != null) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m55589g(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        a30<PurchaseType, Act, String> a30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        y20<Integer> y20Var = superlikeIapPaymentComponent.dismissAction;
        if (y20Var != null) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m55591A() {
        return (joa.m146401n4() && joa.m146386f4()) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public final void m55592B() {
        C8927c.m54567D0(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.vip_super_like, null, new y20() { // from class: l.m6h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m55589g(this.f134998a, (PurchaseType) obj);
            }
        }, 0, null, null, null, null, false, false, 4064, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m55593C() {
        C8927c.m54597N0(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", new y20() { // from class: l.j6h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m55587e(this.f118563a, (PurchaseType) obj);
            }
        }, null, null, Privilege.unlimit_free_super_like, null, 64, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m55594D() {
        C8927c.m54598N1(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.vip_super_like, null, null, false, null, null, new y20() { // from class: l.n6h0
            @Override // p153l.y20
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m55585c(this.f140469a, (PurchaseType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m55595E(@NotNull C8928d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m55608S(section);
    }

    /* JADX INFO: renamed from: F */
    public final void m55596F(@NotNull y20<Integer> dismiss, @Nullable x20 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m55597G();
        m55602L(dismiss);
        m55603N();
    }

    /* JADX INFO: renamed from: G */
    public final void m55597G() {
        String str = SignParameters.NEW_LINE + this.act.string(R$string.f28253c4);
        String string = this.act.getString(R$string.f28233a8, str);
        string.getClass();
        String strM123073j = exm.m123073j();
        int iC0 = StringsKt.m94327c0(string, str, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C8969b(strM123073j), iC0, str.length() + iC0, 33);
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
    public final void m55598H(Merchandise merchandise) {
        i4g0.m138523u("e_intl_superlike_iap_sku_click", "p_intl_super_like_iap_view", jyb.m147494Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId()));
    }

    /* JADX INFO: renamed from: I */
    public final void m55599I(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: J */
    public final void m55600J(@Nullable a30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: K */
    public final void m55601K() {
        bnl0.m105509E0(this.secondaryButton, new View.OnClickListener() { // from class: l.h6h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperlikeIapPaymentComponent.m55583a(this.f108030a, view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final void m55602L(final y20<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.i6h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuperlikeIapPaymentComponent.m55582M(this.f113168a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m55603N() {
        m55609i(m55614n());
        m55601K();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m55604O() {
        CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        if (m55605P()) {
            return false;
        }
        if (coreProviderInterfaceM132214d.mo34737Oi()) {
            return true;
        }
        if (coreProviderInterfaceM132214d.mo34745Qi()) {
            return m55623w();
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m55605P() {
        CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        if (coreProviderInterfaceM132214d.mo34737Oi()) {
            return m55626z() || m55624x();
        }
        if (coreProviderInterfaceM132214d.mo34745Qi()) {
            return m55591A() || m55625y();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final String m55606Q() {
        if (m55605P()) {
            return SummarizedPrivilegesId.ultraPremium;
        }
        return m55604O() ? "premium" : "vip";
    }

    /* JADX INFO: renamed from: R */
    public final void m55607R() {
        y20<Integer> y20Var = this.dismissAction;
        if (y20Var != null) {
            m55615o(y20Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m55608S(C8928d section) {
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

    /* JADX INFO: renamed from: i */
    public final void m55609i(ButtonStyle style) {
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
        }
        int i = C8968a.f36158a[style.ordinal()];
        if (i == 1) {
            m55611k();
            return;
        }
        if (i == 2) {
            m55610j();
        } else if (i == 3) {
            m55612l();
        } else {
            nbr.m162172a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m55610j() {
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
            vText.setText(this.act.getString(m55616p(false)));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m55611k() {
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
            vText.setText(this.act.getString(m55616p(true)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m55612l() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(jbc0.f119227G0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(jbc0.f119408T2);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor(Constants.BLACK));
            vText.setText(this.act.getString(m55616p(false)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final View m55613m(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162522a0, root, false);
        viewInflate.getClass();
        m55622v(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: n */
    public final ButtonStyle m55614n() {
        if (m55605P()) {
            return ButtonStyle.ULTRA;
        }
        return m55604O() ? ButtonStyle.PREMIUM : ButtonStyle.VIP;
    }

    /* JADX INFO: renamed from: o */
    public final void m55615o(y20<Integer> dismiss) {
        Merchandise merchandiseM54784s;
        C8928d.a aVarM55617q = m55617q();
        if (aVarM55617q == null || (merchandiseM54784s = aVarM55617q.m54784s()) == null) {
            return;
        }
        m55598H(merchandiseM54784s);
        m55621u(merchandiseM54784s, dismiss);
    }

    /* JADX INFO: renamed from: p */
    public final int m55616p(boolean isUltra) {
        boolean zM29125v = IntlCountryCodeController.m29125v();
        CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        if (isUltra && zM29125v) {
            return R$string.f28279e6;
        }
        if (isUltra) {
            return R$string.f28267d6;
        }
        if (coreProviderInterfaceM132214d.mo34737Oi() && zM29125v) {
            return R$string.f28312h3;
        }
        if (coreProviderInterfaceM132214d.mo34737Oi()) {
            return R$string.f28300g3;
        }
        return zM29125v ? R$string.f28338j5 : R$string.f28326i5;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final C8928d.a m55617q() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d != null) {
            return c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m55618r() {
        o1j0.m165634h(R$string.f28281e8);
    }

    /* JADX INFO: renamed from: s */
    public final void m55619s(y20<Integer> dismiss) {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
        CoreModule.f18264c.f20381e0.m116470H9();
        a30<PurchaseType, Act, String> a30Var = this.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(PurchaseType.TYPE_GET_VIP_SUPERLIKE, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m55620t() {
        CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
        i4g0.m138523u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_super_like_iap_view", jyb.m147494Y("subtype", m55606Q()));
        if (m55605P()) {
            m55593C();
            return;
        }
        if (!m55604O()) {
            m55594D();
        } else if (coreProviderInterfaceM132214d.mo34737Oi()) {
            m55592B();
        } else {
            m55594D();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m55621u(Merchandise merchandise, final y20<Integer> dismiss) {
        CoreModule.m30933P().m143405a().mo34315Eo(this.act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, false, new x20() { // from class: l.k6h0
            @Override // p153l.x20
            public final void call() {
                SuperlikeIapPaymentComponent.m55586d(this.f124181a, dismiss);
            }
        }, new x20() { // from class: l.l6h0
            @Override // p153l.x20
            public final void call() {
                SuperlikeIapPaymentComponent.m55584b(this.f130258a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: v */
    public final void m55622v(View view) {
        this.primaryButton = (VText) view.findViewById(fdc0.f98447w0);
        this.secondaryButton = (VLinear) view.findViewById(fdc0.f98366Q);
        this.secondaryButtonIcon = (VImage) view.findViewById(fdc0.f98368R);
        this.secondaryButtonText = (VText) view.findViewById(fdc0.f98370S);
        this.agreementText = (VText) view.findViewById(fdc0.f98392c);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m55623w() {
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowTypeM189818i = tab0.m189811h().m189818i("vip", "");
        return TEnum.equals(purchaseDialogConfigTriggerShowTypeM189818i, PurchaseDialogConfigTriggerShowType.vip_svip) || TEnum.equals(purchaseDialogConfigTriggerShowTypeM189818i, "svip");
    }

    /* JADX INFO: renamed from: x */
    public final boolean m55624x() {
        z99 z99Var = CoreModule.f18264c.f20414p0;
        return z99Var.f203451R == 1 && z99Var.f203452S > z99Var.f203453T;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m55625y() {
        z99 z99Var = CoreModule.f18264c.f20414p0;
        return z99Var.f203451R == 1 && z99Var.f203452S > z99Var.f203453T;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m55626z() {
        return !joa.m146386f4();
    }
}
