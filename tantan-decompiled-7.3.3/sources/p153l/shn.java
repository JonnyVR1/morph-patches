package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class shn implements frl {

    /* JADX INFO: renamed from: a */
    public VText f168721a;

    /* JADX INFO: renamed from: b */
    public VText f168722b;

    /* JADX INFO: renamed from: c */
    public Act f168723c;

    /* JADX INFO: renamed from: d */
    public int f168724d;

    /* JADX INFO: renamed from: e */
    public String f168725e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f168726f;

    /* JADX INFO: renamed from: g */
    public a30<PurchaseType, Act, String> f168727g;

    /* JADX INFO: renamed from: h */
    public C8928d f168728h;

    /* JADX INFO: renamed from: l.shn$a */
    public class C20046a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f168729a;

        public C20046a(String str) {
            this.f168729a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = shn.this.f168723c;
            act.startActivity(WebViewAct.m81347a2(act, act.string(R$string.f28341j8), this.f168729a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public shn(Act act, int i, PurchaseType purchaseType) {
        this.f168723c = act;
        this.f168724d = i;
        this.f168726f = purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m185928k(y20 y20Var) {
        fp60.m126549K(this.f168726f, "coin");
        o1j0.m165649w(R$string.f28268d7);
        if (NullChecker.m82486a(this.f168727g)) {
            this.f168727g.mo37058a(this.f168726f, this.f168723c, this.f168725e);
        }
        y20Var.call(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m185929l(y20 y20Var, View view) {
        m185930n(y20Var);
    }

    /* JADX INFO: renamed from: n */
    private void m185930n(final y20<Integer> y20Var) {
        C8928d.a aVarM185933j = m185933j();
        if (aVarM185933j == null) {
            return;
        }
        uqb0.m197269e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f168724d;
        if (i == 14 || i == 1) {
            uqb0.m197269e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM185933j.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM185933j.m54784s().defaultStockKeepUnit.prices.price;
        i4g0.m138523u("e_purchase_intermediate_button", "p_purchase_page", jyb.m147494Y("skuID", productId));
        i4g0.m138523u("e_purchase_button", "p_purchase_intermediate_page", jyb.m147494Y("platform", "googleplay"), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f168725e)), jyb.m147494Y("productType", this.f168726f.productCategory().name()), jyb.m147494Y("skuID", productId), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)));
        CoreModule.m30933P().m143405a().mo34315Eo(this.f168723c, this.f168726f, false, new x20() { // from class: l.qhn
            @Override // p153l.x20
            public final void call() {
                this.f157737a.m185928k(y20Var);
            }
        }, new x20() { // from class: l.rhn
            @Override // p153l.x20
            public final void call() {
                o1j0.m165634h(R$string.f28281e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: o */
    private void m185931o() {
        String strString = this.f168723c.string(R$string.f28329i8);
        String string = this.f168723c.getString(R$string.f28233a8, strString);
        String string2 = Uri.parse(xi5.m211113o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", m185934m()).appendQueryParameter("country", IntlCountryCodeController.m29107d(uqb0.f180400f0)).toString();
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f168723c.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C20046a(string2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f168722b.setText(spannableStringBuilder);
        this.f168722b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: a */
    public View mo117348a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f168723c.inflater().inflate(rec0.f162428C2, viewGroup, false);
        m185932i(viewInflate);
        return viewInflate;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: b */
    public void mo117349b(C8928d c8928d) {
        this.f168728h = c8928d;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: c */
    public void mo117350c(String str) {
        this.f168725e = str;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: d */
    public void mo117351d(final y20<Integer> y20Var, x20 x20Var) {
        m185931o();
        bnl0.m105509E0(this.f168721a, new View.OnClickListener() { // from class: l.phn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152461a.m185929l(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m185932i(View view) {
        thn.m191279a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public C8928d.a m185933j() {
        if (!NullChecker.m82486a(this.f168728h)) {
            return null;
        }
        boolean zM54714m = this.f168728h.m54714m();
        C8928d c8928d = this.f168728h;
        return zM54714m ? c8928d.m54703b() : c8928d.m54705d();
    }

    /* JADX INFO: renamed from: m */
    public String m185934m() {
        Locale locale = this.f168723c.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: p */
    public void m185935p(a30<PurchaseType, Act, String> a30Var) {
        this.f168727g = a30Var;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: e */
    public void mo117352e(long j) {
    }
}
