package com.p000p1.mobile.putong.core.p001ui.purchase.boost.component;

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
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0191e;
import com.p000p1.mobile.putong.core.p001ui.purchase.boost.component.BoostIapPaymentComponent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.b1c0;
import l.d30;
import l.d3c0;
import l.e30;
import l.g30;
import l.j760;
import l.l9r;
import l.lsi0;
import l.m6c0;
import l.q89;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.dvm;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001hB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0011J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0011J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0011J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0011J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0011J\u0017\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J%\u0010>\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\u0011J\u0015\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020,¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bD\u0010\u0015J)\u0010H\u001a\u00020\b2\u001a\u0010G\u001a\u0016\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,\u0018\u00010E¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010QR\u0018\u0010^\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010QR\u0016\u0010a\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R*\u0010c\u001a\u0016\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010dR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010f¨\u0006i"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "view", "", "t", "(Landroid/view/View;)V", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, "G", "(Ll/e30;)V", "B", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "M", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "m", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "C", "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "s", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/e30;)V", "q", "p", "", "J", "()Z", "v", "w", "u", "isUltra", "n", "(Z)I", "I", "Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", "l", "()Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", "", "K", "()Ljava/lang/String;", "style", "h", "(Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;)V", "j", "i", "F", "r", "y", "x", "Landroid/view/ViewGroup;", "root", "k", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", "onCancel", "A", "(Ll/e30;Ll/d30;)V", "L", "from", "D", "(Ljava/lang/String;)V", "z", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", "E", "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "o", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", "d", "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "g", "Ljava/lang/String;", "purchaseshowfrom", "Ll/g30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/e30;", "dismissAction", "ButtonStyle", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public C0190d currentPurchaseSection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dismissAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ULTRA", "PREMIUM", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum ButtonStyle {
        ULTRA,
        PREMIUM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<ButtonStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.boost.component.BoostIapPaymentComponent$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0187a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2338a;

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
            f2338a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.boost.component.BoostIapPaymentComponent$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/boost/component/BoostIapPaymentComponent$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0188b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f2340b;

        public C0188b(String str) {
            this.f2340b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            BoostIapPaymentComponent.this.act.startActivity(MkWebViewAct.c2(BoostIapPaymentComponent.this.act, "", this.f2340b, true, true, (ResultReceiver) null));
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
    public static final void m3901H(BoostIapPaymentComponent boostIapPaymentComponent, e30 e30Var, View view) {
        boostIapPaymentComponent.m3926m(e30Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m3902a(BoostIapPaymentComponent boostIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = boostIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(purchaseType, boostIapPaymentComponent.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = boostIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3903b(BoostIapPaymentComponent boostIapPaymentComponent, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = boostIapPaymentComponent.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(purchaseType, boostIapPaymentComponent.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = boostIapPaymentComponent.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3904c(BoostIapPaymentComponent boostIapPaymentComponent, e30 e30Var) {
        boostIapPaymentComponent.m3930q(e30Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m3905d(BoostIapPaymentComponent boostIapPaymentComponent) {
        boostIapPaymentComponent.m3929p();
    }

    /* JADX INFO: renamed from: e */
    public static void m3906e(BoostIapPaymentComponent boostIapPaymentComponent, View view) {
        boostIapPaymentComponent.m3931r();
    }

    /* JADX INFO: renamed from: A */
    public final void m3909A(@NotNull e30<Integer> dismiss, @Nullable d30 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m3910B();
        m3915G(dismiss);
        m3916I();
    }

    /* JADX INFO: renamed from: B */
    public final void m3910B() {
        String str = "\n" + this.act.string(R.string.c4);
        String string = this.act.getString(R.string.a8, str);
        string.getClass();
        String strM12065j = dvm.m12065j();
        int iC0 = StringsKt.c0(string, str, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0188b(strM12065j), iC0, str.length() + iC0, 33);
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
    public final void m3911C(Merchandise merchandise) {
        zvf0.u("e_intl_boost_iap_sku_click", "p_intl_boost_iap_view", new j760[]{vwb.Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId())});
    }

    /* JADX INFO: renamed from: D */
    public final void m3912D(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: E */
    public final void m3913E(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: F */
    public final void m3914F() {
        xdl0.E0(this.secondaryButton, new View.OnClickListener() { // from class: l.i83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostIapPaymentComponent.m3906e(this.f13100a, view);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m3915G(final e30<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.j83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostIapPaymentComponent.m3901H(this.f13632a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m3916I() {
        m3921h(m3925l());
        m3914F();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m3917J() {
        if (m3935v()) {
            return true;
        }
        return m3936w() && m3934u();
    }

    /* JADX INFO: renamed from: K */
    public final String m3918K() {
        return m3917J() ? "ultraPremium" : "premium";
    }

    /* JADX INFO: renamed from: L */
    public final void m3919L() {
        e30<Integer> e30Var = this.dismissAction;
        if (e30Var != null) {
            m3926m(e30Var);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m3920M(C0190d section) {
        C0190d.a aVarM4088d = section.m4088d();
        String strM4209q = C0191e.m4209q(aVarM4088d);
        Merchandise merchandiseM4167s = aVarM4088d.m4167s();
        String string = this.act.getString(R.string.t2, String.valueOf(merchandiseM4167s != null ? merchandiseM4167s.quantity : 0), strM4209q);
        string.getClass();
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setText(string);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3921h(ButtonStyle style) {
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
        }
        int i = C0187a.f2338a[style.ordinal()];
        if (i == 1) {
            m3923j();
        } else if (i == 2) {
            m3922i();
        } else {
            l9r.a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3922i() {
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
            vText.setText(this.act.getString(m3927n(false)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3923j() {
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
            vText.setText(this.act.getString(m3927n(true)));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final View m3924k(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.k, root, false);
        viewInflate.getClass();
        m3933t(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public final ButtonStyle m3925l() {
        return m3917J() ? ButtonStyle.ULTRA : ButtonStyle.PREMIUM;
    }

    /* JADX INFO: renamed from: m */
    public final void m3926m(e30<Integer> dismiss) {
        Merchandise merchandiseM4167s;
        C0190d.a aVarM3928o = m3928o();
        if (aVarM3928o == null || (merchandiseM4167s = aVarM3928o.m4167s()) == null) {
            return;
        }
        m3911C(merchandiseM4167s);
        m3932s(merchandiseM4167s, dismiss);
    }

    /* JADX INFO: renamed from: n */
    public final int m3927n(boolean isUltra) {
        boolean zV = IntlCountryCodeController.v();
        if (isUltra && zV) {
            return R.string.W5;
        }
        if (isUltra) {
            return R.string.V5;
        }
        return zV ? R.string.h4 : R.string.y4;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final C0190d.a m3928o() {
        C0190d c0190d = this.currentPurchaseSection;
        if (c0190d != null) {
            return c0190d.m4097m() ? c0190d.m4086b() : c0190d.m4088d();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m3929p() {
        lsi0.h(R.string.e8);
    }

    /* JADX INFO: renamed from: q */
    public final void m3930q(e30<Integer> dismiss) {
        CoreModule.c.C0.u4();
        CoreModule.c.e0.W9(qib0.b0.a.userId());
        CoreModule.c.e0.H9();
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(PurchaseType.TYPE_TTC_BOOST, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: r */
    public final void m3931r() {
        zvf0.u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_boost_iap_view", new j760[]{vwb.Y("subtype", m3918K())});
        if (m3917J()) {
            m3938y();
        } else {
            m3937x();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3932s(Merchandise merchandise, final e30<Integer> dismiss) {
        CoreModule.P().a().Eo(this.act, PurchaseType.TYPE_TTC_BOOST, false, new d30() { // from class: l.m83
            public final void call() {
                BoostIapPaymentComponent.m3904c(this.f15269a, dismiss);
            }
        }, new d30() { // from class: l.n83
            public final void call() {
                BoostIapPaymentComponent.m3905d(this.f15859a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: t */
    public final void m3933t(View view) {
        this.primaryButton = view.findViewById(z4c0.w0);
        this.secondaryButton = view.findViewById(z4c0.Q);
        this.secondaryButtonIcon = view.findViewById(z4c0.R);
        this.secondaryButtonText = view.findViewById(z4c0.S);
        this.agreementText = view.findViewById(z4c0.c);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3934u() {
        q89 q89Var = CoreModule.c.p0;
        return q89Var.R == 1 && q89Var.S > q89Var.T;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3935v() {
        return !xma.e4();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3936w() {
        return xma.e4();
    }

    /* JADX INFO: renamed from: x */
    public final void m3937x() {
        C0189c.m3950D0(this.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.boost, null, new e30() { // from class: l.k83
            public final void call(Object obj) {
                BoostIapPaymentComponent.m3902a(this.f14234a, (PurchaseType) obj);
            }
        }, -1, null, null, null, null, false, false, 3840, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m3938y() {
        C0189c.m3980N0(this.act, "p_intl_boost_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", new e30() { // from class: l.l83
            public final void call(Object obj) {
                BoostIapPaymentComponent.m3903b(this.f14711a, (PurchaseType) obj);
            }
        }, null, null, Privilege.full_boost, null, 64, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m3939z(@NotNull C0190d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m3920M(section);
    }
}
