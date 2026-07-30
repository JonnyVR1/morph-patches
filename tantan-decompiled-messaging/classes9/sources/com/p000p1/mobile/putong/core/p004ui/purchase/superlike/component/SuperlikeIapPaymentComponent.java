package com.p000p1.mobile.putong.core.p004ui.purchase.superlike.component;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p000p1.mobile.putong.core.p004ui.purchase.superlike.component.SuperlikeIapPaymentComponent;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.b1c0;
import l.d30;
import l.d3c0;
import l.dvm;
import l.e30;
import l.g30;
import l.j760;
import l.l9r;
import l.lsi0;
import l.m6c0;
import l.p2b0;
import l.vwb;
import l.xdl0;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.q89;
import p006l.qib0;
import p006l.ura;
import p006l.xma;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010!J\u000f\u0010'\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010!J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0011J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020,H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0011J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0011J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0011J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0011J\u000f\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010\u0011J\u000f\u0010<\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010\u0011J\u0017\u0010?\u001a\u0004\u0018\u00010\u00062\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J%\u0010C\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010\u0011J\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020/¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bI\u0010\u0015J)\u0010M\u001a\u00020\b2\u001a\u0010L\u001a\u0016\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/\u0018\u00010J¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0018\u0010c\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0016\u0010f\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR*\u0010i\u001a\u0016\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010jR\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010l¨\u0006o"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "view", "", "v", "(Landroid/view/View;)V", "Ll/e30;", "", "dismiss", "L", "(Ll/e30;)V", "G", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "S", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "o", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "H", "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "u", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/e30;)V", "s", "r", "", "P", "()Z", "z", "A", "x", "y", "O", "w", "isUltra", "p", "(Z)I", "N", "Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "", "Q", "()Ljava/lang/String;", "style", "i", "(Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;)V", "k", "j", "l", "K", "t", "C", "B", "D", "Landroid/view/ViewGroup;", "root", "m", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", "onCancel", "F", "(Ll/e30;Ll/d30;)V", "R", "from", "I", "(Ljava/lang/String;)V", "E", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", "J", "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "q", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", "d", "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "g", "Ljava/lang/String;", "purchaseshowfrom", "h", "Ll/g30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/e30;", "dismissAction", "ButtonStyle", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public d currentPurchaseSection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dismissAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "PREMIUM", "VIP", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum ButtonStyle {
        ULTRA,
        PREMIUM,
        VIP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<ButtonStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.superlike.component.SuperlikeIapPaymentComponent$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0241a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5091a;

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
            f5091a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.superlike.component.SuperlikeIapPaymentComponent$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/superlike/component/SuperlikeIapPaymentComponent$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0242b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5093b;

        public C0242b(String str) {
            this.f5093b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            SuperlikeIapPaymentComponent.this.act.startActivity(MkWebViewAct.c2(SuperlikeIapPaymentComponent.this.act, "", this.f5093b, true, true, (ResultReceiver) null));
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
    public static final void m7734M(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, e30 e30Var, View view) {
        superlikeIapPaymentComponent.m7767o(e30Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m7735a(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, View view) {
        superlikeIapPaymentComponent.m7772t();
    }

    /* JADX INFO: renamed from: b */
    public static void m7736b(SuperlikeIapPaymentComponent superlikeIapPaymentComponent) {
        superlikeIapPaymentComponent.m7770r();
    }

    /* JADX INFO: renamed from: c */
    public static void m7737c(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = superlikeIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7738d(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, e30 e30Var) {
        superlikeIapPaymentComponent.m7771s(e30Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m7739e(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = superlikeIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7741g(SuperlikeIapPaymentComponent superlikeIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = superlikeIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(purchaseType, superlikeIapPaymentComponent.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = superlikeIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7743A() {
        return (xma.m27395m4() && xma.m27379e4()) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public final void m7744B() {
        c.D0(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.vip_super_like, (PurchaseType) null, new e30() { // from class: l.eyg0
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m7741g(this.f11512a, (PurchaseType) obj);
            }
        }, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4064, (Object) null);
    }

    /* JADX INFO: renamed from: C */
    public final void m7745C() {
        c.N0(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", new e30() { // from class: l.byg0
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m7739e(this.f9227a, (PurchaseType) obj);
            }
        }, (d30) null, (d30) null, Privilege.unlimit_free_super_like, (String) null, 64, (Object) null);
    }

    /* JADX INFO: renamed from: D */
    public final void m7746D() {
        c.N1(this.act, "p_intl_super_like_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.vip_super_like, (d30) null, (d30) null, false, (User) null, (Object) null, new e30() { // from class: l.fyg0
            public final void call(Object obj) {
                SuperlikeIapPaymentComponent.m7737c(this.f12987a, (PurchaseType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m7747E(@NotNull d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m7760S(section);
    }

    /* JADX INFO: renamed from: F */
    public final void m7748F(@NotNull e30<Integer> dismiss, @Nullable d30 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m7749G();
        m7754L(dismiss);
        m7755N();
    }

    /* JADX INFO: renamed from: G */
    public final void m7749G() {
        String str = "\n" + this.act.string(R.string.c4);
        String string = this.act.getString(R.string.a8, str);
        string.getClass();
        String strJ = dvm.j();
        int iC0 = StringsKt.c0(string, str, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0242b(strJ), iC0, str.length() + iC0, 33);
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
    public final void m7750H(Merchandise merchandise) {
        zvf0.u("e_intl_superlike_iap_sku_click", "p_intl_super_like_iap_view", new j760[]{vwb.Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId())});
    }

    /* JADX INFO: renamed from: I */
    public final void m7751I(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: J */
    public final void m7752J(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: K */
    public final void m7753K() {
        xdl0.E0(this.secondaryButton, new View.OnClickListener() { // from class: l.zxg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuperlikeIapPaymentComponent.m7735a(this.f29023a, view);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final void m7754L(final e30<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.ayg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SuperlikeIapPaymentComponent.m7734M(this.f8598a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m7755N() {
        m7761i(m7766n());
        m7753K();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m7756O() {
        CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
        if (m7757P()) {
            return false;
        }
        if (coreProviderInterfaceM25559d.m5671Oi()) {
            return true;
        }
        if (coreProviderInterfaceM25559d.m5679Qi()) {
            return m7775w();
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m7757P() {
        CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
        if (coreProviderInterfaceM25559d.m5671Oi()) {
            return m7778z() || m7776x();
        }
        if (coreProviderInterfaceM25559d.m5679Qi()) {
            return m7743A() || m7777y();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final String m7758Q() {
        if (m7757P()) {
            return "ultraPremium";
        }
        return m7756O() ? "premium" : "vip";
    }

    /* JADX INFO: renamed from: R */
    public final void m7759R() {
        e30<Integer> e30Var = this.dismissAction;
        if (e30Var != null) {
            m7767o(e30Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m7760S(d section) {
        d.a aVarD = section.d();
        String strQ = e.q(aVarD);
        Merchandise merchandiseS = aVarD.s();
        String string = this.act.getString(R.string.t2, String.valueOf(merchandiseS != null ? merchandiseS.quantity : 0), strQ);
        string.getClass();
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setText(string);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7761i(ButtonStyle style) {
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
        }
        int i = C0241a.f5091a[style.ordinal()];
        if (i == 1) {
            m7763k();
            return;
        }
        if (i == 2) {
            m7762j();
        } else if (i == 3) {
            m7764l();
        } else {
            l9r.a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7762j() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(d3c0.E0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(d3c0.X0);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor("#FFE59D"));
            vText.setText(this.act.getString(m7768p(false)));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7763k() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(d3c0.F0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(d3c0.x2);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor("#F9E7FF"));
            vText.setText(this.act.getString(m7768p(true)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7764l() {
        VLinear vLinear = this.secondaryButton;
        if (vLinear != null) {
            vLinear.setBackgroundResource(d3c0.G0);
        }
        VImage vImage = this.secondaryButtonIcon;
        if (vImage != null) {
            vImage.setBackgroundResource(d3c0.T2);
        }
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTextColor(Color.parseColor("#000000"));
            vText.setText(this.act.getString(m7768p(false)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final View m7765m(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.a0, root, false);
        viewInflate.getClass();
        m7774v(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: n */
    public final ButtonStyle m7766n() {
        if (m7757P()) {
            return ButtonStyle.ULTRA;
        }
        return m7756O() ? ButtonStyle.PREMIUM : ButtonStyle.VIP;
    }

    /* JADX INFO: renamed from: o */
    public final void m7767o(e30<Integer> dismiss) {
        Merchandise merchandiseS;
        d.a aVarM7769q = m7769q();
        if (aVarM7769q == null || (merchandiseS = aVarM7769q.s()) == null) {
            return;
        }
        m7750H(merchandiseS);
        m7773u(merchandiseS, dismiss);
    }

    /* JADX INFO: renamed from: p */
    public final int m7768p(boolean isUltra) {
        boolean zM21v = IntlCountryCodeController.m21v();
        CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
        if (isUltra && zM21v) {
            return R.string.e6;
        }
        if (isUltra) {
            return R.string.d6;
        }
        if (coreProviderInterfaceM25559d.m5671Oi() && zM21v) {
            return R.string.h3;
        }
        if (coreProviderInterfaceM25559d.m5671Oi()) {
            return R.string.g3;
        }
        return zM21v ? R.string.j5 : R.string.i5;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final d.a m7769q() {
        d dVar = this.currentPurchaseSection;
        if (dVar != null) {
            return dVar.m() ? dVar.b() : dVar.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m7770r() {
        lsi0.h(R.string.e8);
    }

    /* JADX INFO: renamed from: s */
    public final void m7771s(e30<Integer> dismiss) {
        CoreModule.f1534c.f3544C0.m27420u4();
        CoreModule.f1534c.f3628e0.m21417W9(qib0.f19804b0.f17706a.userId());
        CoreModule.f1534c.f3628e0.m21360H9();
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(PurchaseType.TYPE_GET_VIP_SUPERLIKE, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m7772t() {
        CoreProviderInterface coreProviderInterfaceM25559d = ura.m25555e().m25559d();
        zvf0.u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_super_like_iap_view", new j760[]{vwb.Y("subtype", m7758Q())});
        if (m7757P()) {
            m7745C();
            return;
        }
        if (!m7756O()) {
            m7746D();
        } else if (coreProviderInterfaceM25559d.m5671Oi()) {
            m7744B();
        } else {
            m7746D();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7773u(Merchandise merchandise, final e30<Integer> dismiss) {
        CoreModule.m1854P().m11706a().m5249Eo(this.act, PurchaseType.TYPE_GET_VIP_SUPERLIKE, false, new d30() { // from class: l.cyg0
            public final void call() {
                SuperlikeIapPaymentComponent.m7738d(this.f9931a, dismiss);
            }
        }, new d30() { // from class: l.dyg0
            public final void call() {
                SuperlikeIapPaymentComponent.m7736b(this.f10655a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: v */
    public final void m7774v(View view) {
        this.primaryButton = view.findViewById(z4c0.w0);
        this.secondaryButton = view.findViewById(z4c0.Q);
        this.secondaryButtonIcon = view.findViewById(z4c0.R);
        this.secondaryButtonText = view.findViewById(z4c0.S);
        this.agreementText = view.findViewById(z4c0.c);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7775w() {
        PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowTypeI = p2b0.h().i("vip", "");
        return TEnum.equals(purchaseDialogConfigTriggerShowTypeI, "vip-svip") || TEnum.equals(purchaseDialogConfigTriggerShowTypeI, "svip");
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7776x() {
        q89 q89Var = CoreModule.f1534c.f3661p0;
        return q89Var.f19661R == 1 && q89Var.f19662S > q89Var.f19663T;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7777y() {
        q89 q89Var = CoreModule.f1534c.f3661p0;
        return q89Var.f19661R == 1 && q89Var.f19662S > q89Var.f19663T;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7778z() {
        return !xma.m27379e4();
    }
}
