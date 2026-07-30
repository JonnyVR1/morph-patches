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
public class sdj implements uol {

    /* JADX INFO: renamed from: a */
    public VText f163846a;

    /* JADX INFO: renamed from: b */
    public VText f163847b;

    /* JADX INFO: renamed from: c */
    public Act f163848c;

    /* JADX INFO: renamed from: d */
    public int f163849d;

    /* JADX INFO: renamed from: e */
    public String f163850e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f163851f;

    /* JADX INFO: renamed from: g */
    public g30<PurchaseType, Act, String> f163852g;

    /* JADX INFO: renamed from: h */
    public C8765d f163853h;

    /* JADX INFO: renamed from: l.sdj$a */
    public class C19910a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f163854a;

        public C19910a(String str) {
            this.f163854a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = sdj.this.f163848c;
            act.startActivity(WebViewAct.m80164Z1(act, act.string(R$string.f27421d8), this.f163854a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public sdj(Act act, int i, PurchaseType purchaseType) {
        this.f163848c = act;
        this.f163849d = i;
        this.f163851f = purchaseType;
    }

    /* JADX INFO: renamed from: n */
    private void m183497n(final e30<Integer> e30Var) {
        C8765d.a aVarM183500j = m183500j();
        if (aVarM183500j == null) {
            return;
        }
        qib0.m174815e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f163849d;
        if (i == 14 || i == 1) {
            qib0.m174815e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM183500j.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM183500j.m53601s().defaultStockKeepUnit.prices.price;
        zvf0.m220399u("e_purchase_intermediate_button", "p_purchase_page", vwb.m200311Y("skuID", productId));
        zvf0.m220399u("e_purchase_button", "p_purchase_intermediate_page", vwb.m200311Y("platform", "googleplay"), vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f163850e)), vwb.m200311Y("productType", this.f163851f.productCategory().name()), vwb.m200311Y("skuID", productId), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)));
        CoreModule.m29935P().m94651a().mo33312Eo(this.f163848c, this.f163851f, false, new d30() { // from class: l.qdj
            @Override // p149l.d30
            public final void call() {
                this.f153934a.m183501k(e30Var);
            }
        }, new d30() { // from class: l.rdj
            @Override // p149l.d30
            public final void call() {
                lsi0.m151578h(R$string.f27433e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: o */
    private void m183498o() {
        String strString = this.f163848c.string(R$string.f27397b8);
        String string = this.f163848c.getString(R$string.f27385a8, strString);
        String string2 = Uri.parse("https://lp.tantanapp.com/intl/ttb").buildUpon().appendQueryParameter("lang", m183503m()).appendQueryParameter("country", IntlCountryCodeController.m28108d(qib0.f154717f0)).toString();
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f163848c.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C19910a(string2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f163847b.setText(spannableStringBuilder);
        this.f163847b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: a */
    public View mo112508a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f163848c.inflater().inflate(m6c0.f131672z2, viewGroup, false);
        m183499i(viewInflate);
        return viewInflate;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: b */
    public void mo112509b(C8765d c8765d) {
        this.f163853h = c8765d;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: c */
    public void mo112510c(String str) {
        this.f163850e = str;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: d */
    public void mo112511d(final e30<Integer> e30Var, d30 d30Var) {
        m183498o();
        xdl0.m208329E0(this.f163846a, new View.OnClickListener() { // from class: l.pdj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148307a.m183502l(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m183499i(View view) {
        tdj.m188125a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public C8765d.a m183500j() {
        if (!NullChecker.m81303a(this.f163853h)) {
            return null;
        }
        boolean zM53531m = this.f163853h.m53531m();
        C8765d c8765d = this.f163853h;
        return zM53531m ? c8765d.m53520b() : c8765d.m53522d();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m183501k(e30 e30Var) {
        ah60.m96376K(this.f163851f, "coin");
        lsi0.m151593w(R$string.f27420d7);
        if (NullChecker.m81303a(this.f163852g)) {
            this.f163852g.mo36055a(this.f163851f, this.f163848c, this.f163850e);
        }
        e30Var.call(0);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m183502l(e30 e30Var, View view) {
        m183497n(e30Var);
    }

    /* JADX INFO: renamed from: m */
    public String m183503m() {
        Locale locale = this.f163848c.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: p */
    public void m183504p(g30<PurchaseType, Act, String> g30Var) {
        this.f163852g = g30Var;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: e */
    public void mo112512e(long j) {
    }
}
