package p149l;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class sfn implements uol {

    /* JADX INFO: renamed from: a */
    public VText f164308a;

    /* JADX INFO: renamed from: b */
    public VText f164309b;

    /* JADX INFO: renamed from: c */
    public Act f164310c;

    /* JADX INFO: renamed from: d */
    public int f164311d;

    /* JADX INFO: renamed from: e */
    public String f164312e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f164313f;

    /* JADX INFO: renamed from: g */
    public g30<PurchaseType, Act, String> f164314g;

    /* JADX INFO: renamed from: h */
    public C8765d f164315h;

    /* JADX INFO: renamed from: l.sfn$a */
    public class C19936a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f164316a;

        public C19936a(String str) {
            this.f164316a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = sfn.this.f164310c;
            act.startActivity(WebViewAct.m80164Z1(act, act.string(R$string.f27493j8), this.f164316a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public sfn(Act act, int i, PurchaseType purchaseType) {
        this.f164310c = act;
        this.f164311d = i;
        this.f164313f = purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m183941k(e30 e30Var) {
        ah60.m96376K(this.f164313f, "coin");
        lsi0.m151593w(R$string.f27420d7);
        if (NullChecker.m81303a(this.f164314g)) {
            this.f164314g.mo36055a(this.f164313f, this.f164310c, this.f164312e);
        }
        e30Var.call(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m183942l(e30 e30Var, View view) {
        m183943n(e30Var);
    }

    /* JADX INFO: renamed from: n */
    private void m183943n(final e30<Integer> e30Var) {
        C8765d.a aVarM183946j = m183946j();
        if (aVarM183946j == null) {
            return;
        }
        qib0.m174815e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f164311d;
        if (i == 14 || i == 1) {
            qib0.m174815e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM183946j.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM183946j.m53601s().defaultStockKeepUnit.prices.price;
        zvf0.m220399u("e_purchase_intermediate_button", "p_purchase_page", vwb.m200311Y("skuID", productId));
        zvf0.m220399u("e_purchase_button", "p_purchase_intermediate_page", vwb.m200311Y("platform", "googleplay"), vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f164312e)), vwb.m200311Y("productType", this.f164313f.productCategory().name()), vwb.m200311Y("skuID", productId), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)));
        CoreModule.m29935P().m94651a().mo33312Eo(this.f164310c, this.f164313f, false, new d30() { // from class: l.qfn
            @Override // p149l.d30
            public final void call() {
                this.f154152a.m183941k(e30Var);
            }
        }, new d30() { // from class: l.rfn
            @Override // p149l.d30
            public final void call() {
                lsi0.m151578h(R$string.f27433e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: o */
    private void m183944o() {
        String strString = this.f164310c.string(R$string.f27481i8);
        String string = this.f164310c.getString(R$string.f27385a8, strString);
        String string2 = Uri.parse(xh5.m208767o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", m183947m()).appendQueryParameter("country", IntlCountryCodeController.m28108d(qib0.f154717f0)).toString();
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f164310c.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C19936a(string2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f164309b.setText(spannableStringBuilder);
        this.f164309b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: a */
    public View mo112508a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f164310c.inflater().inflate(m6c0.f131468C2, viewGroup, false);
        m183945i(viewInflate);
        return viewInflate;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: b */
    public void mo112509b(C8765d c8765d) {
        this.f164315h = c8765d;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: c */
    public void mo112510c(String str) {
        this.f164312e = str;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: d */
    public void mo112511d(final e30<Integer> e30Var, d30 d30Var) {
        m183944o();
        xdl0.m208329E0(this.f164308a, new View.OnClickListener() { // from class: l.pfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148575a.m183942l(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m183945i(View view) {
        tfn.m188749a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public C8765d.a m183946j() {
        if (!NullChecker.m81303a(this.f164315h)) {
            return null;
        }
        boolean zM53531m = this.f164315h.m53531m();
        C8765d c8765d = this.f164315h;
        return zM53531m ? c8765d.m53520b() : c8765d.m53522d();
    }

    /* JADX INFO: renamed from: m */
    public String m183947m() {
        Locale locale = this.f164310c.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: p */
    public void m183948p(g30<PurchaseType, Act, String> g30Var) {
        this.f164314g = g30Var;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: e */
    public void mo112512e(long j) {
    }
}
