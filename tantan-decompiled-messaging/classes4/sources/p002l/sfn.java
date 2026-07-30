package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.ah60;
import l.b1c0;
import l.d30;
import l.e30;
import l.g30;
import l.j760;
import l.lsi0;
import l.m6c0;
import l.qib0;
import l.tfn;
import l.vwb;
import l.w2b0;
import l.xdl0;
import l.xh5;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sfn implements uol {

    /* JADX INFO: renamed from: a */
    public VText f18993a;

    /* JADX INFO: renamed from: b */
    public VText f18994b;

    /* JADX INFO: renamed from: c */
    public Act f18995c;

    /* JADX INFO: renamed from: d */
    public int f18996d;

    /* JADX INFO: renamed from: e */
    public String f18997e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f18998f;

    /* JADX INFO: renamed from: g */
    public g30<PurchaseType, Act, String> f18999g;

    /* JADX INFO: renamed from: h */
    public C0190d f19000h;

    /* JADX INFO: renamed from: l.sfn$a */
    public class C0816a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f19001a;

        public C0816a(String str) {
            this.f19001a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = sfn.this.f18995c;
            act.startActivity(WebViewAct.Z1(act, act.string(R.string.j8), this.f19001a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public sfn(Act act, int i, PurchaseType purchaseType) {
        this.f18995c = act;
        this.f18996d = i;
        this.f18998f = purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m22421k(e30 e30Var) {
        ah60.K(this.f18998f, "coin");
        lsi0.w(R.string.d7);
        if (NullChecker.a(this.f18999g)) {
            this.f18999g.a(this.f18998f, this.f18995c, this.f18997e);
        }
        e30Var.call(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m22422l(e30 e30Var, View view) {
        m22423n(e30Var);
    }

    /* JADX INFO: renamed from: n */
    private void m22423n(final e30<Integer> e30Var) {
        C0190d.a aVarM22426j = m22426j();
        if (aVarM22426j == null) {
            return;
        }
        qib0.e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f18996d;
        if (i == 14 || i == 1) {
            qib0.e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM22426j.m4167s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM22426j.m4167s().defaultStockKeepUnit.prices.price;
        zvf0.u("e_purchase_intermediate_button", "p_purchase_page", new j760[]{vwb.Y("skuID", productId)});
        zvf0.u("e_purchase_button", "p_purchase_intermediate_page", new j760[]{vwb.Y("platform", "googleplay"), vwb.Y("purchaseShowFrom", w2b0.b(this.f18997e)), vwb.Y("productType", this.f18998f.productCategory().name()), vwb.Y("skuID", productId), vwb.Y("price", Double.valueOf(d))});
        CoreModule.P().a().Eo(this.f18995c, this.f18998f, false, new d30() { // from class: l.qfn
            public final void call() {
                this.f17970a.m22421k(e30Var);
            }
        }, new d30() { // from class: l.rfn
            public final void call() {
                lsi0.h(R.string.e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: o */
    private void m22424o() {
        String strString = this.f18995c.string(R.string.i8);
        String string = this.f18995c.getString(R.string.a8, strString);
        String string2 = Uri.parse(xh5.o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", m22427m()).appendQueryParameter("country", IntlCountryCodeController.d(qib0.f0)).toString();
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f18995c.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0816a(string2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f18994b.setText(spannableStringBuilder);
        this.f18994b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: a */
    public View mo11956a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f18995c.inflater().inflate(m6c0.C2, viewGroup, false);
        m22425i(viewInflate);
        return viewInflate;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: b */
    public void mo11957b(C0190d c0190d) {
        this.f19000h = c0190d;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: c */
    public void mo11958c(String str) {
        this.f18997e = str;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: d */
    public void mo11959d(final e30<Integer> e30Var, d30 d30Var) {
        m22424o();
        xdl0.E0(this.f18993a, new View.OnClickListener() { // from class: l.pfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17255a.m22422l(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m22425i(View view) {
        tfn.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public C0190d.a m22426j() {
        if (!NullChecker.a(this.f19000h)) {
            return null;
        }
        boolean zM4097m = this.f19000h.m4097m();
        C0190d c0190d = this.f19000h;
        return zM4097m ? c0190d.m4086b() : c0190d.m4088d();
    }

    /* JADX INFO: renamed from: m */
    public String m22427m() {
        Locale locale = this.f18995c.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + ExpProfileLoopWheelTypeData.NONE_STR + locale.getCountry();
    }

    /* JADX INFO: renamed from: p */
    public void m22428p(g30<PurchaseType, Act, String> g30Var) {
        this.f18999g = g30Var;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: e */
    public void mo11960e(long j) {
    }
}
