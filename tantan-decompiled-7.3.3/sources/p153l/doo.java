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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class doo implements frl {

    /* JADX INFO: renamed from: a */
    public LinearLayout f89979a;

    /* JADX INFO: renamed from: b */
    public VText f89980b;

    /* JADX INFO: renamed from: c */
    public VLinear f89981c;

    /* JADX INFO: renamed from: d */
    public VImage f89982d;

    /* JADX INFO: renamed from: e */
    public VText f89983e;

    /* JADX INFO: renamed from: f */
    public VText f89984f;

    /* JADX INFO: renamed from: g */
    public Act f89985g;

    /* JADX INFO: renamed from: h */
    public int f89986h;

    /* JADX INFO: renamed from: i */
    public String f89987i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f89988j;

    /* JADX INFO: renamed from: k */
    public a30<PurchaseType, Act, String> f89989k;

    /* JADX INFO: renamed from: l */
    public C8928d f89990l;

    /* JADX INFO: renamed from: l.doo$a */
    public class C16594a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f89991a;

        public C16594a(String str) {
            this.f89991a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            int i = CoreModule.m30930K().mo31838xf() ? R$string.f28341j8 : R$string.f28269d8;
            Act act = doo.this.f89985g;
            act.startActivity(WebViewAct.m81347a2(act, act.string(i), this.f89991a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public doo(Act act, int i, PurchaseType purchaseType) {
        this.f89985g = act;
        this.f89986h = i;
        this.f89988j = purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m117344o(View view) {
        i4g0.m138520r("e_intl_boost_pop_ultra_btn", "p_purchase_page");
        C8927c.m54591L0(this.f89985g, "p_purchase_page,e_intl_boost_pop_ultra_btn,click", null, null, null, Privilege.full_boost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m117345p(y20 y20Var, View view) {
        m117346r(y20Var);
    }

    /* JADX INFO: renamed from: r */
    private void m117346r(final y20<Integer> y20Var) {
        C8928d.a aVarM117354l = m117354l();
        if (aVarM117354l == null) {
            return;
        }
        uqb0.m197269e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f89986h;
        if (i == 14 || i == 1) {
            uqb0.m197269e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM117354l.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM117354l.m54784s().defaultStockKeepUnit.prices.price;
        i4g0.m138523u("e_purchase_intermediate_button", "p_purchase_page", jyb.m147494Y("skuID", productId));
        i4g0.m138523u("e_purchase_button", "p_purchase_intermediate_page", jyb.m147494Y("platform", "googleplay"), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f89987i)), jyb.m147494Y("productType", this.f89988j.productCategory().name()), jyb.m147494Y("skuID", productId), jyb.m147494Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)));
        CoreModule.m30933P().m143405a().mo34315Eo(this.f89985g, this.f89988j, false, new x20() { // from class: l.boo
            @Override // p153l.x20
            public final void call() {
                this.f77696a.m117355m(y20Var);
            }
        }, new x20() { // from class: l.coo
            @Override // p153l.x20
            public final void call() {
                o1j0.m165634h(R$string.f28281e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: s */
    private void m117347s() {
        String str = SignParameters.NEW_LINE + this.f89985g.string(l9n.m153438c());
        String string = this.f89985g.getString(R$string.f28233a8, str);
        String string2 = CoreModule.m30930K().mo31838xf() ? Uri.parse(xi5.m211113o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", m117357q()).appendQueryParameter("country", IntlCountryCodeController.m29107d(uqb0.f180400f0)).toString() : this.f89985g.string(R$string.f28257c8);
        int iIndexOf = string.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f89985g.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C16594a(string2), iIndexOf, str.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f89984f.setText(spannableStringBuilder);
        this.f89984f.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: a */
    public View mo117348a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f89985g.inflater().inflate(rec0.f162589p, viewGroup, false);
        m117353k(viewInflate);
        return viewInflate;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: b */
    public void mo117349b(C8928d c8928d) {
        this.f89990l = c8928d;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: c */
    public void mo117350c(String str) {
        this.f89987i = str;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: d */
    public void mo117351d(final y20<Integer> y20Var, x20 x20Var) {
        if (CoreModule.f18276o.m132214d().mo34769Vd()) {
            int i = this.f89986h;
            if (i == 2) {
                i4g0.m138526x("e_intl_superlike_pop_ultra_btn", "p_purchase_page");
                bnl0.m105524M(this.f89981c, true);
                this.f89983e.setText(IntlCountryCodeController.m29125v() ? R$string.f28279e6 : R$string.f28184W3);
                bnl0.m105509E0(this.f89981c, new View.OnClickListener() { // from class: l.yno
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f200894a.m117356n(view);
                    }
                });
            } else if (i == 1 || i == 14) {
                bnl0.m105524M(this.f89981c, true);
                i4g0.m138526x("e_intl_boost_pop_ultra_btn", "p_purchase_page");
                this.f89983e.setText(IntlCountryCodeController.m29125v() ? R$string.f28186W5 : R$string.f28347k2);
                bnl0.m105509E0(this.f89981c, new View.OnClickListener() { // from class: l.zno
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f205214a.m117344o(view);
                    }
                });
            }
        }
        m117347s();
        bnl0.m105509E0(this.f89979a, new View.OnClickListener() { // from class: l.aoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72480a.m117345p(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m117353k(View view) {
        eoo.m121755a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public C8928d.a m117354l() {
        if (!NullChecker.m82486a(this.f89990l)) {
            return null;
        }
        boolean zM54714m = this.f89990l.m54714m();
        C8928d c8928d = this.f89990l;
        return zM54714m ? c8928d.m54703b() : c8928d.m54705d();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m117355m(y20 y20Var) {
        fp60.m126549K(this.f89988j, "coin");
        o1j0.m165649w(R$string.f28268d7);
        if (NullChecker.m82486a(this.f89989k)) {
            this.f89989k.mo37058a(this.f89988j, this.f89985g, this.f89987i);
        }
        y20Var.call(0);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m117356n(View view) {
        i4g0.m138520r("e_intl_superlike_pop_ultra_btn", "p_purchase_page");
        C8927c.m54591L0(this.f89985g, "p_purchase_page,e_intl_superlike_pop_ultra_btn,click", null, null, null, Privilege.unlimit_free_super_like);
    }

    /* JADX INFO: renamed from: q */
    public String m117357q() {
        Locale locale = this.f89985g.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: t */
    public void m117358t(a30<PurchaseType, Act, String> a30Var) {
        this.f89989k = a30Var;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: e */
    public void mo117352e(long j) {
    }
}
