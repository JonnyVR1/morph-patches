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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.ah60;
import l.b1c0;
import l.d30;
import l.e30;
import l.emo;
import l.g30;
import l.j760;
import l.l7n;
import l.lsi0;
import l.m6c0;
import l.qib0;
import l.vwb;
import l.w2b0;
import l.xdl0;
import l.xh5;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dmo implements uol {

    /* JADX INFO: renamed from: a */
    public LinearLayout f9336a;

    /* JADX INFO: renamed from: b */
    public VText f9337b;

    /* JADX INFO: renamed from: c */
    public VLinear f9338c;

    /* JADX INFO: renamed from: d */
    public VImage f9339d;

    /* JADX INFO: renamed from: e */
    public VText f9340e;

    /* JADX INFO: renamed from: f */
    public VText f9341f;

    /* JADX INFO: renamed from: g */
    public Act f9342g;

    /* JADX INFO: renamed from: h */
    public int f9343h;

    /* JADX INFO: renamed from: i */
    public String f9344i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f9345j;

    /* JADX INFO: renamed from: k */
    public g30<PurchaseType, Act, String> f9346k;

    /* JADX INFO: renamed from: l */
    public C0190d f9347l;

    /* JADX INFO: renamed from: l.dmo$a */
    public class C0533a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f9348a;

        public C0533a(String str) {
            this.f9348a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            int i = CoreModule.K().xf() ? R.string.j8 : R.string.d8;
            Act act = dmo.this.f9342g;
            act.startActivity(WebViewAct.Z1(act, act.string(i), this.f9348a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public dmo(Act act, int i, PurchaseType purchaseType) {
        this.f9342g = act;
        this.f9343h = i;
        this.f9345j = purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m11952o(View view) {
        zvf0.r("e_intl_boost_pop_ultra_btn", "p_purchase_page");
        C0189c.m3974L0(this.f9342g, "p_purchase_page,e_intl_boost_pop_ultra_btn,click", null, null, null, Privilege.full_boost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m11953p(e30 e30Var, View view) {
        m11954r(e30Var);
    }

    /* JADX INFO: renamed from: r */
    private void m11954r(final e30<Integer> e30Var) {
        C0190d.a aVarM11962l = m11962l();
        if (aVarM11962l == null) {
            return;
        }
        qib0.e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f9343h;
        if (i == 14 || i == 1) {
            qib0.e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM11962l.m4167s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM11962l.m4167s().defaultStockKeepUnit.prices.price;
        zvf0.u("e_purchase_intermediate_button", "p_purchase_page", new j760[]{vwb.Y("skuID", productId)});
        zvf0.u("e_purchase_button", "p_purchase_intermediate_page", new j760[]{vwb.Y("platform", "googleplay"), vwb.Y("purchaseShowFrom", w2b0.b(this.f9344i)), vwb.Y("productType", this.f9345j.productCategory().name()), vwb.Y("skuID", productId), vwb.Y("price", Double.valueOf(d))});
        CoreModule.P().a().Eo(this.f9342g, this.f9345j, false, new d30() { // from class: l.bmo
            public final void call() {
                this.f8264a.m11963m(e30Var);
            }
        }, new d30() { // from class: l.cmo
            public final void call() {
                lsi0.h(R.string.e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: s */
    private void m11955s() {
        String str = "\n" + this.f9342g.string(l7n.c());
        String string = this.f9342g.getString(R.string.a8, str);
        String string2 = CoreModule.K().xf() ? Uri.parse(xh5.o("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/diamond-purchase-agreement/index.html?speed=true&_bid=1005375")).buildUpon().appendQueryParameter("lang", m11965q()).appendQueryParameter("country", IntlCountryCodeController.d(qib0.f0)).toString() : this.f9342g.string(R.string.c8);
        int iIndexOf = string.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f9342g.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0533a(string2), iIndexOf, str.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f9341f.setText(spannableStringBuilder);
        this.f9341f.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: a */
    public View mo11956a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f9342g.inflater().inflate(m6c0.p, viewGroup, false);
        m11961k(viewInflate);
        return viewInflate;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: b */
    public void mo11957b(C0190d c0190d) {
        this.f9347l = c0190d;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: c */
    public void mo11958c(String str) {
        this.f9344i = str;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: d */
    public void mo11959d(final e30<Integer> e30Var, d30 d30Var) {
        if (CoreModule.o.d().Vd()) {
            int i = this.f9343h;
            if (i == 2) {
                zvf0.x("e_intl_superlike_pop_ultra_btn", "p_purchase_page");
                xdl0.M(this.f9338c, true);
                this.f9340e.setText(IntlCountryCodeController.v() ? R.string.e6 : R.string.W3);
                xdl0.E0(this.f9338c, new View.OnClickListener() { // from class: l.ylo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f22966a.m11964n(view);
                    }
                });
            } else if (i == 1 || i == 14) {
                xdl0.M(this.f9338c, true);
                zvf0.x("e_intl_boost_pop_ultra_btn", "p_purchase_page");
                this.f9340e.setText(IntlCountryCodeController.v() ? R.string.W5 : R.string.k2);
                xdl0.E0(this.f9338c, new View.OnClickListener() { // from class: l.zlo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f23500a.m11952o(view);
                    }
                });
            }
        }
        m11955s();
        xdl0.E0(this.f9336a, new View.OnClickListener() { // from class: l.amo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7753a.m11953p(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m11961k(View view) {
        emo.a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public C0190d.a m11962l() {
        if (!NullChecker.a(this.f9347l)) {
            return null;
        }
        boolean zM4097m = this.f9347l.m4097m();
        C0190d c0190d = this.f9347l;
        return zM4097m ? c0190d.m4086b() : c0190d.m4088d();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m11963m(e30 e30Var) {
        ah60.K(this.f9345j, "coin");
        lsi0.w(R.string.d7);
        if (NullChecker.a(this.f9346k)) {
            this.f9346k.a(this.f9345j, this.f9342g, this.f9344i);
        }
        e30Var.call(0);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11964n(View view) {
        zvf0.r("e_intl_superlike_pop_ultra_btn", "p_purchase_page");
        C0189c.m3974L0(this.f9342g, "p_purchase_page,e_intl_superlike_pop_ultra_btn,click", null, null, null, Privilege.unlimit_free_super_like);
    }

    /* JADX INFO: renamed from: q */
    public String m11965q() {
        Locale locale = this.f9342g.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + ExpProfileLoopWheelTypeData.NONE_STR + locale.getCountry();
    }

    /* JADX INFO: renamed from: t */
    public void m11966t(g30<PurchaseType, Act, String> g30Var) {
        this.f9346k = g30Var;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: e */
    public void mo11960e(long j) {
    }
}
