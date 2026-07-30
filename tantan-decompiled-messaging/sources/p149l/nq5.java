package p149l;

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
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u00020\u00102\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010\u001cJ\u001d\u0010,\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b,\u0010)J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b3\u0010)J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0014J\u000f\u00109\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010\u0014J\u000f\u0010:\u001a\u00020\u0010H\u0002¢\u0006\u0004\b:\u0010\u0014J\u000f\u0010;\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010@R\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010NR*\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010RR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010T¨\u0006V"}, m87232d2 = {"Ll/nq5;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "g", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, "Ll/d30;", "onCancel", "", "r", "(Ll/e30;Ll/d30;)V", "A", "()V", "", "from", "u", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "q", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", ResourceDirection.f38808v, "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", OMSTemplateModeType.view, "n", "(Landroid/view/View;)V", BaseSei.f13930X, "(Ll/e30;)V", BLiveStormDanmakuGiftResourceType.f44446s, "B", "h", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, Constants.KEY_T, "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "m", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/e30;)V", "k", "j", "", "o", "()Z", BaseSei.f13932Z, "w", BLiveStormDanmakuGiftResourceType.f44444l, "p", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "Ljava/lang/String;", "purchaseshowfrom", "Ll/g30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/e30;", "dismissAction", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class nq5 {

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

    /* JADX INFO: renamed from: l.nq5$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/nq5$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18749a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f140040b;

        public C18749a(String str) {
            this.f140040b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            nq5.this.act.startActivity(MkWebViewAct.m80238c2(nq5.this.act, "", this.f140040b, true, true, null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            ds.getClass();
            ds.setColor(ds.linkColor);
            ds.setUnderlineText(false);
        }
    }

    public nq5(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.purchaseshowfrom = "";
    }

    /* JADX INFO: renamed from: a */
    public static void m160556a(nq5 nq5Var, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = nq5Var.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(purchaseType, nq5Var.act, "p_intl_compliment_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = nq5Var.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m160558c(nq5 nq5Var, e30 e30Var) {
        nq5Var.m160569k(e30Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m160559d(nq5 nq5Var) {
        nq5Var.m160568j();
    }

    /* JADX INFO: renamed from: e */
    public static void m160560e(nq5 nq5Var, View view) {
        nq5Var.m160570l();
    }

    /* JADX INFO: renamed from: y */
    public static final void m160562y(nq5 nq5Var, e30 e30Var, View view) {
        nq5Var.m160566h(e30Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m160563A() {
        e30<Integer> e30Var = this.dismissAction;
        if (e30Var != null) {
            m160566h(e30Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m160564B(C8765d section) {
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

    @Nullable
    /* JADX INFO: renamed from: g */
    public final View m160565g(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.f131645t, root, false);
        viewInflate.getClass();
        m160572n(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: h */
    public final void m160566h(e30<Integer> dismiss) {
        Merchandise merchandiseM53601s;
        C8765d.a aVarM160567i = m160567i();
        if (aVarM160567i == null || (merchandiseM53601s = aVarM160567i.m53601s()) == null) {
            return;
        }
        m160578t(merchandiseM53601s);
        m160571m(merchandiseM53601s, dismiss);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C8765d.a m160567i() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d != null) {
            return c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m160568j() {
        lsi0.m151578h(R$string.f27433e8);
    }

    /* JADX INFO: renamed from: k */
    public final void m160569k(e30<Integer> dismiss) {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
        CoreModule.f17545c.f19639e0.m169397H9();
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.mo36055a(PurchaseType.TYPE_COMPLIMENT, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m160570l() {
        zvf0.m220399u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_compliment_iap_view", vwb.m200311Y("subtype", "premium"));
        m160574p();
    }

    /* JADX INFO: renamed from: m */
    public final void m160571m(Merchandise merchandise, final e30<Integer> dismiss) {
        CoreModule.m29935P().m94651a().mo33312Eo(this.act, PurchaseType.TYPE_COMPLIMENT, false, new d30() { // from class: l.kq5
            @Override // p149l.d30
            public final void call() {
                nq5.m160558c(this.f124223a, dismiss);
            }
        }, new d30() { // from class: l.lq5
            @Override // p149l.d30
            public final void call() {
                nq5.m160559d(this.f129295a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: n */
    public final void m160572n(View view) {
        this.primaryButton = (VText) view.findViewById(z4c0.f201571w0);
        this.secondaryButton = (VLinear) view.findViewById(z4c0.f201490Q);
        this.secondaryButtonIcon = (VImage) view.findViewById(z4c0.f201492R);
        this.secondaryButtonText = (VText) view.findViewById(z4c0.f201494S);
        this.agreementText = (VText) view.findViewById(z4c0.f201516c);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m160573o() {
        return (xma.m210071e4() && xma.m210081j4()) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m160574p() {
        C8764c.m53384D0(this.act, "p_intl_compliment_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.premium_compliment, null, new e30() { // from class: l.mq5
            @Override // p149l.e30
            public final void call(Object obj) {
                nq5.m160556a(this.f135167a, (PurchaseType) obj);
            }
        }, -1, null, null, null, null, false, false, 3840, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m160575q(@NotNull C8765d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m160564B(section);
    }

    /* JADX INFO: renamed from: r */
    public final void m160576r(@NotNull e30<Integer> dismiss, @Nullable d30 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m160577s();
        m160582x(dismiss);
        m160583z();
    }

    /* JADX INFO: renamed from: s */
    public final void m160577s() {
        String str = SignParameters.NEW_LINE + this.act.string(R$string.f27405c4);
        String string = this.act.getString(R$string.f27385a8, str);
        string.getClass();
        String strM113794j = dvm.m113794j();
        int iC0 = StringsKt.m93436c0(string, str, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C18749a(strM113794j), iC0, str.length() + iC0, 33);
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
    public final void m160578t(Merchandise merchandise) {
        zvf0.m220399u("e_intl_compliment_iap_sku_click", "p_intl_compliment_iap_view", vwb.m200311Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId()));
    }

    /* JADX INFO: renamed from: u */
    public final void m160579u(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: v */
    public final void m160580v(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: w */
    public final void m160581w() {
        xdl0.m208329E0(this.secondaryButton, new View.OnClickListener() { // from class: l.jq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nq5.m160560e(this.f119249a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m160582x(final e30<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.iq5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nq5.m160562y(this.f114419a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m160583z() {
        xdl0.m208344M(this.secondaryButton, !m160573o());
        String string = this.act.getString(R$string.f27380a3, 3);
        string.getClass();
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setText(string);
        }
        m160581w();
    }
}
