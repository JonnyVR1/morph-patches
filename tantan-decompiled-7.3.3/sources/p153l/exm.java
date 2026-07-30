package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class exm {

    /* JADX INFO: renamed from: a */
    public VLinear f96301a;

    /* JADX INFO: renamed from: b */
    public VRelative f96302b;

    /* JADX INFO: renamed from: c */
    public VText f96303c;

    /* JADX INFO: renamed from: d */
    public VText f96304d;

    /* JADX INFO: renamed from: e */
    public VLinear f96305e;

    /* JADX INFO: renamed from: f */
    public VText f96306f;

    /* JADX INFO: renamed from: g */
    public VText f96307g;

    /* JADX INFO: renamed from: h */
    public Act f96308h;

    /* JADX INFO: renamed from: i */
    public String f96309i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f96310j;

    /* JADX INFO: renamed from: k */
    public a30<PurchaseType, Act, String> f96311k;

    /* JADX INFO: renamed from: l */
    public C8928d f96312l;

    /* JADX INFO: renamed from: l.exm$a */
    public class C16853a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f96313a;

        public C16853a(String str) {
            this.f96313a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = exm.this.f96308h;
            act.startActivity(MkWebViewAct.m81421d2(act, "", this.f96313a, true, true, null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public exm(Act act, PurchaseType purchaseType) {
        this.f96308h = act;
        this.f96310j = purchaseType;
    }

    /* JADX INFO: renamed from: j */
    public static String m123073j() {
        return Uri.parse("https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/membership-automatic-renewal/index.html?speed=true&_bid=1005449&devtool=1&hideNavigationBar=1&hideNotch=1").buildUpon().appendQueryParameter("country", IntlCountryCodeController.m29107d(uqb0.f180400f0)).toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m123074d(View view) {
        fxm.m127993a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public View m123075e(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f96308h.inflater().inflate(rec0.f162551g, viewGroup, false);
        m123074d(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: f */
    public C8928d.a m123076f() {
        if (!NullChecker.m82486a(this.f96312l)) {
            return null;
        }
        boolean zM54714m = this.f96312l.m54714m();
        C8928d c8928d = this.f96312l;
        return zM54714m ? c8928d.m54703b() : c8928d.m54705d();
    }

    /* JADX INFO: renamed from: g */
    public void m123077g() {
        this.f96302b.setVisibility(8);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m123078h(y20 y20Var) {
        CoreModule.f18264c.f20297C0.m146425v4();
        o1j0.m165649w(R$string.f28268d7);
        if (NullChecker.m82486a(this.f96311k)) {
            this.f96311k.mo37058a(this.f96310j, this.f96308h, this.f96309i);
        }
        y20Var.call(0);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m123079i(y20 y20Var, View view) {
        m123081l(y20Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m123080k(C8928d.a aVar, final y20<Integer> y20Var) {
        if (aVar == null) {
            return;
        }
        String productId = aVar.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId();
        i4g0.m138523u("e_intl_instantmatch_iap_sku_click", "p_intl_instantmatch_iap_view", jyb.m147494Y("skuID", productId));
        CoreModule.m30933P().m143405a().mo34315Eo(this.f96308h, this.f96310j, false, new x20() { // from class: l.cxm
            @Override // p153l.x20
            public final void call() {
                this.f84258a.m123078h(y20Var);
            }
        }, new x20() { // from class: l.dxm
            @Override // p153l.x20
            public final void call() {
                o1j0.m165634h(R$string.f28281e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: l */
    public final void m123081l(y20<Integer> y20Var) {
        m123080k(m123076f(), y20Var);
    }

    /* JADX INFO: renamed from: m */
    public void m123082m(C8928d c8928d) {
        this.f96312l = c8928d;
        this.f96306f.setText(String.format(this.f96308h.getString(R$string.f28043J5), C8929e.m54826q(c8928d.m54705d())));
    }

    /* JADX INFO: renamed from: n */
    public void m123083n(final y20<Integer> y20Var, x20 x20Var) {
        m123084o();
        this.f96306f.setTypeface(Typeface.defaultFromStyle(1));
        bnl0.m105509E0(this.f96305e, new View.OnClickListener() { // from class: l.bxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78889a.m123079i(y20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m123084o() {
        String str = SignParameters.NEW_LINE + this.f96308h.string(R$string.f28253c4);
        String str2 = this.f96308h.getString(R$string.f28108P4, Integer.valueOf(CoreModule.f18276o.m132214d().mo34864jm())) + str;
        String strM123073j = m123073j();
        int iIndexOf = str2.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f96308h.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C16853a(strM123073j), iIndexOf, str.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f96307g.setText(spannableStringBuilder);
        this.f96307g.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: p */
    public void m123085p(String str) {
        this.f96309i = str;
    }

    /* JADX INFO: renamed from: q */
    public void m123086q(a30<PurchaseType, Act, String> a30Var) {
        this.f96311k = a30Var;
    }
}
