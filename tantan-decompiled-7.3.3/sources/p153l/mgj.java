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
public class mgj implements frl {

    /* JADX INFO: renamed from: a */
    public VText f136744a;

    /* JADX INFO: renamed from: b */
    public VText f136745b;

    /* JADX INFO: renamed from: c */
    public Act f136746c;

    /* JADX INFO: renamed from: d */
    public int f136747d;

    /* JADX INFO: renamed from: e */
    public String f136748e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f136749f;

    /* JADX INFO: renamed from: g */
    public a30<PurchaseType, Act, String> f136750g;

    /* JADX INFO: renamed from: h */
    public C8928d f136751h;

    /* JADX INFO: renamed from: l.mgj$a */
    public class C18612a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f136752a;

        public C18612a(String str) {
            this.f136752a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = mgj.this.f136746c;
            act.startActivity(WebViewAct.m81347a2(act, act.string(R$string.f28269d8), this.f136752a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public mgj(Act act, int i, PurchaseType purchaseType) {
        this.f136746c = act;
        this.f136747d = i;
        this.f136749f = purchaseType;
    }

    /* JADX INFO: renamed from: n */
    private void m158338n(final y20<Integer> y20Var) {
        C8928d.a aVarM158341j = m158341j();
        if (aVarM158341j == null) {
            return;
        }
        uqb0.m197269e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f136747d;
        if (i == 14 || i == 1) {
            uqb0.m197269e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM158341j.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM158341j.m54784s().defaultStockKeepUnit.prices.price;
        i4g0.m138523u("e_purchase_intermediate_button", "p_purchase_page", jyb.m147494Y("skuID", productId));
        i4g0.m138523u("e_purchase_button", "p_purchase_intermediate_page", jyb.m147494Y("platform", "googleplay"), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f136748e)), jyb.m147494Y("productType", this.f136749f.productCategory().name()), jyb.m147494Y("skuID", productId), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)));
        CoreModule.m30933P().m143405a().mo34315Eo(this.f136746c, this.f136749f, false, new x20() { // from class: l.kgj
            @Override // p153l.x20
            public final void call() {
                this.f126621a.m158342k(y20Var);
            }
        }, new x20() { // from class: l.lgj
            @Override // p153l.x20
            public final void call() {
                o1j0.m165634h(R$string.f28281e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: o */
    private void m158339o() {
        String strString = this.f136746c.string(R$string.f28245b8);
        String string = this.f136746c.getString(R$string.f28233a8, strString);
        String string2 = Uri.parse("https://lp.tantanapp.com/intl/ttb").buildUpon().appendQueryParameter("lang", m158344m()).appendQueryParameter("country", IntlCountryCodeController.m29107d(uqb0.f180400f0)).toString();
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f136746c.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C18612a(string2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f136745b.setText(spannableStringBuilder);
        this.f136745b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: a */
    public View mo117348a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f136746c.inflater().inflate(rec0.f162632z2, viewGroup, false);
        m158340i(viewInflate);
        return viewInflate;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: b */
    public void mo117349b(C8928d c8928d) {
        this.f136751h = c8928d;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: c */
    public void mo117350c(String str) {
        this.f136748e = str;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: d */
    public void mo117351d(final y20<Integer> y20Var, x20 x20Var) {
        m158339o();
        bnl0.m105509E0(this.f136744a, new View.OnClickListener() { // from class: l.jgj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120734a.m158343l(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m158340i(View view) {
        ngj.m162983a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public C8928d.a m158341j() {
        if (!NullChecker.m82486a(this.f136751h)) {
            return null;
        }
        boolean zM54714m = this.f136751h.m54714m();
        C8928d c8928d = this.f136751h;
        return zM54714m ? c8928d.m54703b() : c8928d.m54705d();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m158342k(y20 y20Var) {
        fp60.m126549K(this.f136749f, "coin");
        o1j0.m165649w(R$string.f28268d7);
        if (NullChecker.m82486a(this.f136750g)) {
            this.f136750g.mo37058a(this.f136749f, this.f136746c, this.f136748e);
        }
        y20Var.call(0);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m158343l(y20 y20Var, View view) {
        m158338n(y20Var);
    }

    /* JADX INFO: renamed from: m */
    public String m158344m() {
        Locale locale = this.f136746c.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: p */
    public void m158345p(a30<PurchaseType, Act, String> a30Var) {
        this.f136750g = a30Var;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: e */
    public void mo117352e(long j) {
    }
}
