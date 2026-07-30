package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u00020\u00102\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010\u001cJ\u001d\u0010,\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b,\u0010)J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b3\u0010)J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0014J\u000f\u00109\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010\u0014J\u000f\u0010:\u001a\u00020\u0010H\u0002¢\u0006\u0004\b:\u0010\u0014J\u000f\u0010;\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010@R\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010NR*\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010RR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010T¨\u0006V"}, m88121d2 = {"Ll/rr5;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "g", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/y20;", "", SysnotifListener.ACTION_DISMISS, "Ll/x20;", "onCancel", "", "r", "(Ll/y20;Ll/x20;)V", "A", "()V", "", "from", "u", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "q", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/a30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", ResourceDirection.f39656v, "(Ll/a30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", OMSTemplateModeType.view, "n", "(Landroid/view/View;)V", BaseSei.f14624X, "(Ll/y20;)V", BLiveStormDanmakuGiftResourceType.f45294s, "B", "h", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, Constants.KEY_T, "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "m", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/y20;)V", "k", "j", "", "o", "()Z", BaseSei.f14626Z, "w", BLiveStormDanmakuGiftResourceType.f45292l, "p", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "Ljava/lang/String;", "purchaseshowfrom", "Ll/a30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/y20;", "dismissAction", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rr5 {

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

    /* JADX INFO: renamed from: l.rr5$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/rr5$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19901a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f164556b;

        public C19901a(String str) {
            this.f164556b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            rr5.this.act.startActivity(MkWebViewAct.m81421d2(rr5.this.act, "", this.f164556b, true, true, null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            ds.getClass();
            ds.setColor(ds.linkColor);
            ds.setUnderlineText(false);
        }
    }

    public rr5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.purchaseshowfrom = "";
    }

    /* JADX INFO: renamed from: a */
    public static void m182688a(rr5 rr5Var, PurchaseType purchaseType) {
        a30<PurchaseType, Act, String> a30Var = rr5Var.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(purchaseType, rr5Var.act, "p_intl_compliment_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        y20<Integer> y20Var = rr5Var.dismissAction;
        if (y20Var != null) {
            y20Var.call(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m182690c(rr5 rr5Var, y20 y20Var) {
        rr5Var.m182701k(y20Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m182691d(rr5 rr5Var) {
        rr5Var.m182700j();
    }

    /* JADX INFO: renamed from: e */
    public static void m182692e(rr5 rr5Var, View view) {
        rr5Var.m182702l();
    }

    /* JADX INFO: renamed from: y */
    public static final void m182694y(rr5 rr5Var, y20 y20Var, View view) {
        rr5Var.m182698h(y20Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m182695A() {
        y20<Integer> y20Var = this.dismissAction;
        if (y20Var != null) {
            m182698h(y20Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m182696B(C8928d section) {
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

    @Nullable
    /* JADX INFO: renamed from: g */
    public final View m182697g(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(rec0.f162605t, root, false);
        viewInflate.getClass();
        m182704n(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: h */
    public final void m182698h(y20<Integer> dismiss) {
        Merchandise merchandiseM54784s;
        C8928d.a aVarM182699i = m182699i();
        if (aVarM182699i == null || (merchandiseM54784s = aVarM182699i.m54784s()) == null) {
            return;
        }
        m182710t(merchandiseM54784s);
        m182703m(merchandiseM54784s, dismiss);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C8928d.a m182699i() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d != null) {
            return c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m182700j() {
        o1j0.m165634h(R$string.f28281e8);
    }

    /* JADX INFO: renamed from: k */
    public final void m182701k(y20<Integer> dismiss) {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
        CoreModule.f18264c.f20381e0.m116470H9();
        a30<PurchaseType, Act, String> a30Var = this.onPaymentSuccessAction;
        if (a30Var != null) {
            a30Var.mo37058a(PurchaseType.TYPE_COMPLIMENT, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m182702l() {
        i4g0.m138523u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_compliment_iap_view", jyb.m147494Y("subtype", "premium"));
        m182706p();
    }

    /* JADX INFO: renamed from: m */
    public final void m182703m(Merchandise merchandise, final y20<Integer> dismiss) {
        CoreModule.m30933P().m143405a().mo34315Eo(this.act, PurchaseType.TYPE_COMPLIMENT, false, new x20() { // from class: l.or5
            @Override // p153l.x20
            public final void call() {
                rr5.m182690c(this.f148671a, dismiss);
            }
        }, new x20() { // from class: l.pr5
            @Override // p153l.x20
            public final void call() {
                rr5.m182691d(this.f153725a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: n */
    public final void m182704n(View view) {
        this.primaryButton = (VText) view.findViewById(fdc0.f98447w0);
        this.secondaryButton = (VLinear) view.findViewById(fdc0.f98366Q);
        this.secondaryButtonIcon = (VImage) view.findViewById(fdc0.f98368R);
        this.secondaryButtonText = (VText) view.findViewById(fdc0.f98370S);
        this.agreementText = (VText) view.findViewById(fdc0.f98392c);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m182705o() {
        return (joa.m146386f4() && joa.m146396k4()) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m182706p() {
        C8927c.m54567D0(this.act, "p_intl_compliment_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.premium_compliment, null, new y20() { // from class: l.qr5
            @Override // p153l.y20
            public final void call(Object obj) {
                rr5.m182688a(this.f159064a, (PurchaseType) obj);
            }
        }, -1, null, null, null, null, false, false, 3840, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m182707q(@NotNull C8928d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m182696B(section);
    }

    /* JADX INFO: renamed from: r */
    public final void m182708r(@NotNull y20<Integer> dismiss, @Nullable x20 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m182709s();
        m182714x(dismiss);
        m182715z();
    }

    /* JADX INFO: renamed from: s */
    public final void m182709s() {
        String str = SignParameters.NEW_LINE + this.act.string(R$string.f28253c4);
        String string = this.act.getString(R$string.f28233a8, str);
        string.getClass();
        String strM123073j = exm.m123073j();
        int iC0 = StringsKt.m94327c0(string, str, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C19901a(strM123073j), iC0, str.length() + iC0, 33);
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

    /* JADX INFO: renamed from: t */
    public final void m182710t(Merchandise merchandise) {
        i4g0.m138523u("e_intl_compliment_iap_sku_click", "p_intl_compliment_iap_view", jyb.m147494Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId()));
    }

    /* JADX INFO: renamed from: u */
    public final void m182711u(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: v */
    public final void m182712v(@Nullable a30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: w */
    public final void m182713w() {
        bnl0.m105509E0(this.secondaryButton, new View.OnClickListener() { // from class: l.nr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rr5.m182692e(this.f143373a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m182714x(final y20<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.mr5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rr5.m182694y(this.f138298a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m182715z() {
        bnl0.m105524M(this.secondaryButton, !m182705o());
        String string = this.act.getString(R$string.f28228a3, 3);
        string.getClass();
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setText(string);
        }
        m182713w();
    }
}
