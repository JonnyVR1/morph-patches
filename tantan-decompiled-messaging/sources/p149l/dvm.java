package p149l;

import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dvm {

    /* JADX INFO: renamed from: a */
    public VLinear f88070a;

    /* JADX INFO: renamed from: b */
    public VRelative f88071b;

    /* JADX INFO: renamed from: c */
    public VText f88072c;

    /* JADX INFO: renamed from: d */
    public VText f88073d;

    /* JADX INFO: renamed from: e */
    public VLinear f88074e;

    /* JADX INFO: renamed from: f */
    public VText f88075f;

    /* JADX INFO: renamed from: g */
    public VText f88076g;

    /* JADX INFO: renamed from: h */
    public Act f88077h;

    /* JADX INFO: renamed from: i */
    public String f88078i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f88079j;

    /* JADX INFO: renamed from: k */
    public g30<PurchaseType, Act, String> f88080k;

    /* JADX INFO: renamed from: l */
    public C8765d f88081l;

    /* JADX INFO: renamed from: l.dvm$a */
    public class C16477a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f88082a;

        public C16477a(String str) {
            this.f88082a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = dvm.this.f88077h;
            act.startActivity(MkWebViewAct.m80238c2(act, "", this.f88082a, true, true, null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public dvm(Act act, PurchaseType purchaseType) {
        this.f88077h = act;
        this.f88079j = purchaseType;
    }

    /* JADX INFO: renamed from: j */
    public static String m113794j() {
        return Uri.parse("https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/membership-automatic-renewal/index.html?speed=true&_bid=1005449&devtool=1&hideNavigationBar=1&hideNotch=1").buildUpon().appendQueryParameter("country", IntlCountryCodeController.m28108d(qib0.f154717f0)).toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m113795d(View view) {
        evm.m118299a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public View m113796e(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f88077h.inflater().inflate(m6c0.f131591g, viewGroup, false);
        m113795d(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: f */
    public C8765d.a m113797f() {
        if (!NullChecker.m81303a(this.f88081l)) {
            return null;
        }
        boolean zM53531m = this.f88081l.m53531m();
        C8765d c8765d = this.f88081l;
        return zM53531m ? c8765d.m53520b() : c8765d.m53522d();
    }

    /* JADX INFO: renamed from: g */
    public void m113798g() {
        this.f88071b.setVisibility(8);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m113799h(e30 e30Var) {
        CoreModule.f17545c.f19555C0.m210112u4();
        lsi0.m151593w(R$string.f27420d7);
        if (NullChecker.m81303a(this.f88080k)) {
            this.f88080k.mo36055a(this.f88079j, this.f88077h, this.f88078i);
        }
        e30Var.call(0);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m113800i(e30 e30Var, View view) {
        m113802l(e30Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m113801k(C8765d.a aVar, final e30<Integer> e30Var) {
        if (aVar == null) {
            return;
        }
        String productId = aVar.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId();
        zvf0.m220399u("e_intl_instantmatch_iap_sku_click", "p_intl_instantmatch_iap_view", vwb.m200311Y("skuID", productId));
        CoreModule.m29935P().m94651a().mo33312Eo(this.f88077h, this.f88079j, false, new d30() { // from class: l.bvm
            @Override // p149l.d30
            public final void call() {
                this.f77472a.m113799h(e30Var);
            }
        }, new d30() { // from class: l.cvm
            @Override // p149l.d30
            public final void call() {
                lsi0.m151578h(R$string.f27433e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: l */
    public final void m113802l(e30<Integer> e30Var) {
        m113801k(m113797f(), e30Var);
    }

    /* JADX INFO: renamed from: m */
    public void m113803m(C8765d c8765d) {
        this.f88081l = c8765d;
        this.f88075f.setText(String.format(this.f88077h.getString(R$string.f27195J5), C8766e.m53643q(c8765d.m53522d())));
    }

    /* JADX INFO: renamed from: n */
    public void m113804n(final e30<Integer> e30Var, d30 d30Var) {
        m113805o();
        this.f88075f.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.m208329E0(this.f88074e, new View.OnClickListener() { // from class: l.avm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71951a.m113800i(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m113805o() {
        String str = SignParameters.NEW_LINE + this.f88077h.string(R$string.f27405c4);
        String str2 = this.f88077h.getString(R$string.f27260P4, Integer.valueOf(CoreModule.f17557o.m195057d().mo33861jm())) + str;
        String strM113794j = m113794j();
        int iIndexOf = str2.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f88077h.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C16477a(strM113794j), iIndexOf, str.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f88076g.setText(spannableStringBuilder);
        this.f88076g.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: p */
    public void m113806p(String str) {
        this.f88078i = str;
    }

    /* JADX INFO: renamed from: q */
    public void m113807q(g30<PurchaseType, Act, String> g30Var) {
        this.f88080k = g30Var;
    }
}
