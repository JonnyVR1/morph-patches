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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dmo implements uol {

    /* JADX INFO: renamed from: a */
    public LinearLayout f86966a;

    /* JADX INFO: renamed from: b */
    public VText f86967b;

    /* JADX INFO: renamed from: c */
    public VLinear f86968c;

    /* JADX INFO: renamed from: d */
    public VImage f86969d;

    /* JADX INFO: renamed from: e */
    public VText f86970e;

    /* JADX INFO: renamed from: f */
    public VText f86971f;

    /* JADX INFO: renamed from: g */
    public Act f86972g;

    /* JADX INFO: renamed from: h */
    public int f86973h;

    /* JADX INFO: renamed from: i */
    public String f86974i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f86975j;

    /* JADX INFO: renamed from: k */
    public g30<PurchaseType, Act, String> f86976k;

    /* JADX INFO: renamed from: l */
    public C8765d f86977l;

    /* JADX INFO: renamed from: l.dmo$a */
    public class C16412a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f86978a;

        public C16412a(String str) {
            this.f86978a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            int i = CoreModule.m29932K().mo30835xf() ? R$string.f27493j8 : R$string.f27421d8;
            Act act = dmo.this.f86972g;
            act.startActivity(WebViewAct.m80164Z1(act, act.string(i), this.f86978a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public dmo(Act act, int i, PurchaseType purchaseType) {
        this.f86972g = act;
        this.f86973h = i;
        this.f86975j = purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m112504o(View view) {
        zvf0.m220396r("e_intl_boost_pop_ultra_btn", "p_purchase_page");
        C8764c.m53408L0(this.f86972g, "p_purchase_page,e_intl_boost_pop_ultra_btn,click", null, null, null, Privilege.full_boost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m112505p(e30 e30Var, View view) {
        m112506r(e30Var);
    }

    /* JADX INFO: renamed from: r */
    private void m112506r(final e30<Integer> e30Var) {
        C8765d.a aVarM112514l = m112514l();
        if (aVarM112514l == null) {
            return;
        }
        qib0.m174815e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f86973h;
        if (i == 14 || i == 1) {
            qib0.m174815e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM112514l.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM112514l.m53601s().defaultStockKeepUnit.prices.price;
        zvf0.m220399u("e_purchase_intermediate_button", "p_purchase_page", vwb.m200311Y("skuID", productId));
        zvf0.m220399u("e_purchase_button", "p_purchase_intermediate_page", vwb.m200311Y("platform", "googleplay"), vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f86974i)), vwb.m200311Y("productType", this.f86975j.productCategory().name()), vwb.m200311Y("skuID", productId), vwb.m200311Y(FirebaseAnalytics.Param.PRICE, Double.valueOf(d)));
        CoreModule.m29935P().m94651a().mo33312Eo(this.f86972g, this.f86975j, false, new d30() { // from class: l.bmo
            @Override // p149l.d30
            public final void call() {
                this.f76291a.m112515m(e30Var);
            }
        }, new d30() { // from class: l.cmo
            @Override // p149l.d30
            public final void call() {
                lsi0.m151578h(R$string.f27433e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: s */
    private void m112507s() {
        String str = SignParameters.NEW_LINE + this.f86972g.string(l7n.m148815c());
        String string = this.f86972g.getString(R$string.f27385a8, str);
        String string2 = CoreModule.m29932K().mo30835xf() ? Uri.parse(xh5.m208767o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", m112517q()).appendQueryParameter("country", IntlCountryCodeController.m28108d(qib0.f154717f0)).toString() : this.f86972g.string(R$string.f27409c8);
        int iIndexOf = string.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f86972g.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C16412a(string2), iIndexOf, str.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f86971f.setText(spannableStringBuilder);
        this.f86971f.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: a */
    public View mo112508a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f86972g.inflater().inflate(m6c0.f131629p, viewGroup, false);
        m112513k(viewInflate);
        return viewInflate;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: b */
    public void mo112509b(C8765d c8765d) {
        this.f86977l = c8765d;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: c */
    public void mo112510c(String str) {
        this.f86974i = str;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: d */
    public void mo112511d(final e30<Integer> e30Var, d30 d30Var) {
        if (CoreModule.f17557o.m195057d().mo33766Vd()) {
            int i = this.f86973h;
            if (i == 2) {
                zvf0.m220402x("e_intl_superlike_pop_ultra_btn", "p_purchase_page");
                xdl0.m208344M(this.f86968c, true);
                this.f86970e.setText(IntlCountryCodeController.m28126v() ? R$string.f27431e6 : R$string.f27336W3);
                xdl0.m208329E0(this.f86968c, new View.OnClickListener() { // from class: l.ylo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f198905a.m112516n(view);
                    }
                });
            } else if (i == 1 || i == 14) {
                xdl0.m208344M(this.f86968c, true);
                zvf0.m220402x("e_intl_boost_pop_ultra_btn", "p_purchase_page");
                this.f86970e.setText(IntlCountryCodeController.m28126v() ? R$string.f27338W5 : R$string.f27499k2);
                xdl0.m208329E0(this.f86968c, new View.OnClickListener() { // from class: l.zlo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f203649a.m112504o(view);
                    }
                });
            }
        }
        m112507s();
        xdl0.m208329E0(this.f86966a, new View.OnClickListener() { // from class: l.amo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70635a.m112505p(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m112513k(View view) {
        emo.m117207a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public C8765d.a m112514l() {
        if (!NullChecker.m81303a(this.f86977l)) {
            return null;
        }
        boolean zM53531m = this.f86977l.m53531m();
        C8765d c8765d = this.f86977l;
        return zM53531m ? c8765d.m53520b() : c8765d.m53522d();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m112515m(e30 e30Var) {
        ah60.m96376K(this.f86975j, "coin");
        lsi0.m151593w(R$string.f27420d7);
        if (NullChecker.m81303a(this.f86976k)) {
            this.f86976k.mo36055a(this.f86975j, this.f86972g, this.f86974i);
        }
        e30Var.call(0);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m112516n(View view) {
        zvf0.m220396r("e_intl_superlike_pop_ultra_btn", "p_purchase_page");
        C8764c.m53408L0(this.f86972g, "p_purchase_page,e_intl_superlike_pop_ultra_btn,click", null, null, null, Privilege.unlimit_free_super_like);
    }

    /* JADX INFO: renamed from: q */
    public String m112517q() {
        Locale locale = this.f86972g.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* JADX INFO: renamed from: t */
    public void m112518t(g30<PurchaseType, Act, String> g30Var) {
        this.f86976k = g30Var;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: e */
    public void mo112512e(long j) {
    }
}
