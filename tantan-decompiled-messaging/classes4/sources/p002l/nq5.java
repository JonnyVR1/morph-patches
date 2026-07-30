package p002l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.b1c0;
import l.d30;
import l.e30;
import l.g30;
import l.j760;
import l.lsi0;
import l.m6c0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u00020\u00102\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010\u001cJ\u001d\u0010,\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b,\u0010)J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b3\u0010)J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0014J\u000f\u00109\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010\u0014J\u000f\u0010:\u001a\u00020\u0010H\u0002¢\u0006\u0004\b:\u0010\u0014J\u000f\u0010;\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0018\u0010M\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010@R\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010NR*\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010RR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010T¨\u0006V"}, d2 = {"Ll/nq5;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "g", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, "Ll/d30;", "onCancel", "", "r", "(Ll/e30;Ll/d30;)V", "A", "()V", "", "from", "u", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "q", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/g30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onPaySuccess", "v", "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "i", "()Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "view", "n", "(Landroid/view/View;)V", "x", "(Ll/e30;)V", "s", "B", "h", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "t", "(Lcom/p1/mobile/putong/core/data/Merchandise;)V", "m", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ll/e30;)V", "k", "j", "", "o", "()Z", "z", "w", "l", "p", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VText;", "b", "Lv/VText;", "primaryButton", "Lv/VLinear;", "c", "Lv/VLinear;", "secondaryButton", "Lv/VImage;", "d", "Lv/VImage;", "secondaryButtonIcon", "e", "secondaryButtonText", "f", "agreementText", "Ljava/lang/String;", "purchaseshowfrom", "Ll/g30;", "onPaymentSuccessAction", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Ll/e30;", "dismissAction", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public C0190d currentPurchaseSection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dismissAction;

    /* JADX INFO: renamed from: l.nq5$a */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/nq5$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0708a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f16161b;

        public C0708a(String str) {
            this.f16161b = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            nq5.this.act.startActivity(MkWebViewAct.c2(nq5.this.act, "", this.f16161b, true, true, (ResultReceiver) null));
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
    public static void m18910a(nq5 nq5Var, PurchaseType purchaseType) {
        g30<PurchaseType, Act, String> g30Var = nq5Var.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(purchaseType, nq5Var.act, "p_intl_compliment_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click");
        }
        e30<Integer> e30Var = nq5Var.dismissAction;
        if (e30Var != null) {
            e30Var.call(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18912c(nq5 nq5Var, e30 e30Var) {
        nq5Var.m18923k(e30Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m18913d(nq5 nq5Var) {
        nq5Var.m18922j();
    }

    /* JADX INFO: renamed from: e */
    public static void m18914e(nq5 nq5Var, View view) {
        nq5Var.m18924l();
    }

    /* JADX INFO: renamed from: y */
    public static final void m18916y(nq5 nq5Var, e30 e30Var, View view) {
        nq5Var.m18920h(e30Var);
    }

    /* JADX INFO: renamed from: A */
    public final void m18917A() {
        e30<Integer> e30Var = this.dismissAction;
        if (e30Var != null) {
            m18920h(e30Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m18918B(C0190d section) {
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

    @Nullable
    /* JADX INFO: renamed from: g */
    public final View m18919g(@NotNull ViewGroup root) {
        root.getClass();
        View viewInflate = LayoutInflater.from(this.act).inflate(m6c0.t, root, false);
        viewInflate.getClass();
        m18926n(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: h */
    public final void m18920h(e30<Integer> dismiss) {
        Merchandise merchandiseM4167s;
        C0190d.a aVarM18921i = m18921i();
        if (aVarM18921i == null || (merchandiseM4167s = aVarM18921i.m4167s()) == null) {
            return;
        }
        m18932t(merchandiseM4167s);
        m18925m(merchandiseM4167s, dismiss);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C0190d.a m18921i() {
        C0190d c0190d = this.currentPurchaseSection;
        if (c0190d != null) {
            return c0190d.m4097m() ? c0190d.m4086b() : c0190d.m4088d();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m18922j() {
        lsi0.h(R.string.e8);
    }

    /* JADX INFO: renamed from: k */
    public final void m18923k(e30<Integer> dismiss) {
        CoreModule.c.C0.u4();
        CoreModule.c.e0.W9(qib0.b0.a.userId());
        CoreModule.c.e0.H9();
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccessAction;
        if (g30Var != null) {
            g30Var.a(PurchaseType.TYPE_COMPLIMENT, this.act, this.purchaseshowfrom);
        }
        dismiss.call(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m18924l() {
        zvf0.u("e_intl_consume_iap_pop_subscribe_guiding_click", "p_intl_compliment_iap_view", new j760[]{vwb.Y("subtype", "premium")});
        m18928p();
    }

    /* JADX INFO: renamed from: m */
    public final void m18925m(Merchandise merchandise, final e30<Integer> dismiss) {
        CoreModule.P().a().Eo(this.act, PurchaseType.TYPE_COMPLIMENT, false, new d30() { // from class: l.kq5
            public final void call() {
                nq5.m18912c(this.f14455a, dismiss);
            }
        }, new d30() { // from class: l.lq5
            public final void call() {
                nq5.m18913d(this.f14982a);
            }
        }, merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    /* JADX INFO: renamed from: n */
    public final void m18926n(View view) {
        this.primaryButton = view.findViewById(z4c0.w0);
        this.secondaryButton = view.findViewById(z4c0.Q);
        this.secondaryButtonIcon = view.findViewById(z4c0.R);
        this.secondaryButtonText = view.findViewById(z4c0.S);
        this.agreementText = view.findViewById(z4c0.c);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m18927o() {
        return (xma.e4() && xma.j4()) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m18928p() {
        C0189c.m3950D0(this.act, "p_intl_compliment_iap_view,e_intl_consume_iap_pop_subscribe_guiding_click,click", Privilege.premium_compliment, null, new e30() { // from class: l.mq5
            public final void call(Object obj) {
                nq5.m18910a(this.f15560a, (PurchaseType) obj);
            }
        }, -1, null, null, null, null, false, false, 3840, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m18929q(@NotNull C0190d section) {
        section.getClass();
        this.currentPurchaseSection = section;
        m18918B(section);
    }

    /* JADX INFO: renamed from: r */
    public final void m18930r(@NotNull e30<Integer> dismiss, @Nullable d30 onCancel) {
        dismiss.getClass();
        this.dismissAction = dismiss;
        m18931s();
        m18936x(dismiss);
        m18937z();
    }

    /* JADX INFO: renamed from: s */
    public final void m18931s() {
        String str = "\n" + this.act.string(R.string.c4);
        String string = this.act.getString(R.string.a8, str);
        string.getClass();
        String strM12065j = dvm.m12065j();
        int iC0 = StringsKt.c0(string, str, 0, false, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.act.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0708a(strM12065j), iC0, str.length() + iC0, 33);
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
    public final void m18932t(Merchandise merchandise) {
        zvf0.u("e_intl_compliment_iap_sku_click", "p_intl_compliment_iap_view", new j760[]{vwb.Y("skuID", merchandise.defaultStockKeepUnit.affiliateProducts.getProductId())});
    }

    /* JADX INFO: renamed from: u */
    public final void m18933u(@NotNull String from) {
        from.getClass();
        this.purchaseshowfrom = from;
    }

    /* JADX INFO: renamed from: v */
    public final void m18934v(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    /* JADX INFO: renamed from: w */
    public final void m18935w() {
        xdl0.E0(this.secondaryButton, new View.OnClickListener() { // from class: l.jq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nq5.m18914e(this.f13978a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m18936x(final e30<Integer> dismiss) {
        VText vText = this.primaryButton;
        if (vText != null) {
            vText.setTypeface(Typeface.defaultFromStyle(1));
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.iq5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nq5.m18916y(this.f13354a, dismiss, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m18937z() {
        xdl0.M(this.secondaryButton, !m18927o());
        String string = this.act.getString(R.string.a3, 3);
        string.getClass();
        VText vText = this.secondaryButtonText;
        if (vText != null) {
            vText.setText(string);
        }
        m18935w();
    }
}
