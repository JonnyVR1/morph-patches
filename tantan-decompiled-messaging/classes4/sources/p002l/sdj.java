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
import l.tdj;
import l.vwb;
import l.w2b0;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sdj implements uol {

    /* JADX INFO: renamed from: a */
    public VText f18937a;

    /* JADX INFO: renamed from: b */
    public VText f18938b;

    /* JADX INFO: renamed from: c */
    public Act f18939c;

    /* JADX INFO: renamed from: d */
    public int f18940d;

    /* JADX INFO: renamed from: e */
    public String f18941e;

    /* JADX INFO: renamed from: f */
    public PurchaseType f18942f;

    /* JADX INFO: renamed from: g */
    public g30<PurchaseType, Act, String> f18943g;

    /* JADX INFO: renamed from: h */
    public C0190d f18944h;

    /* JADX INFO: renamed from: l.sdj$a */
    public class C0814a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18945a;

        public C0814a(String str) {
            this.f18945a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = sdj.this.f18939c;
            act.startActivity(WebViewAct.Z1(act, act.string(R.string.d8), this.f18945a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public sdj(Act act, int i, PurchaseType purchaseType) {
        this.f18939c = act;
        this.f18940d = i;
        this.f18942f = purchaseType;
    }

    /* JADX INFO: renamed from: n */
    private void m22363n(final e30<Integer> e30Var) {
        C0190d.a aVarM22366j = m22366j();
        if (aVarM22366j == null) {
            return;
        }
        qib0.e1("tantancoin_purchase_click", new Object[0]);
        int i = this.f18940d;
        if (i == 14 || i == 1) {
            qib0.e1("boost_purchase_click", new Object[0]);
        }
        String productId = aVarM22366j.m4167s().defaultStockKeepUnit.affiliateProducts.getProductId();
        double d = aVarM22366j.m4167s().defaultStockKeepUnit.prices.price;
        zvf0.u("e_purchase_intermediate_button", "p_purchase_page", new j760[]{vwb.Y("skuID", productId)});
        zvf0.u("e_purchase_button", "p_purchase_intermediate_page", new j760[]{vwb.Y("platform", "googleplay"), vwb.Y("purchaseShowFrom", w2b0.b(this.f18941e)), vwb.Y("productType", this.f18942f.productCategory().name()), vwb.Y("skuID", productId), vwb.Y("price", Double.valueOf(d))});
        CoreModule.P().a().Eo(this.f18939c, this.f18942f, false, new d30() { // from class: l.qdj
            public final void call() {
                this.f17956a.m22367k(e30Var);
            }
        }, new d30() { // from class: l.rdj
            public final void call() {
                lsi0.h(R.string.e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: o */
    private void m22364o() {
        String strString = this.f18939c.string(R.string.b8);
        String string = this.f18939c.getString(R.string.a8, strString);
        String string2 = Uri.parse("https://lp.tantanapp.com/intl/ttb").buildUpon().appendQueryParameter("lang", m22369m()).appendQueryParameter("country", IntlCountryCodeController.d(qib0.f0)).toString();
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f18939c.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0814a(string2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f18938b.setText(spannableStringBuilder);
        this.f18938b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: a */
    public View mo11956a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f18939c.inflater().inflate(m6c0.z2, viewGroup, false);
        m22365i(viewInflate);
        return viewInflate;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: b */
    public void mo11957b(C0190d c0190d) {
        this.f18944h = c0190d;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: c */
    public void mo11958c(String str) {
        this.f18941e = str;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: d */
    public void mo11959d(final e30<Integer> e30Var, d30 d30Var) {
        m22364o();
        xdl0.E0(this.f18937a, new View.OnClickListener() { // from class: l.pdj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17209a.m22368l(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m22365i(View view) {
        tdj.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public C0190d.a m22366j() {
        if (!NullChecker.a(this.f18944h)) {
            return null;
        }
        boolean zM4097m = this.f18944h.m4097m();
        C0190d c0190d = this.f18944h;
        return zM4097m ? c0190d.m4086b() : c0190d.m4088d();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m22367k(e30 e30Var) {
        ah60.K(this.f18942f, "coin");
        lsi0.w(R.string.d7);
        if (NullChecker.a(this.f18943g)) {
            this.f18943g.a(this.f18942f, this.f18939c, this.f18941e);
        }
        e30Var.call(0);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m22368l(e30 e30Var, View view) {
        m22363n(e30Var);
    }

    /* JADX INFO: renamed from: m */
    public String m22369m() {
        Locale locale = this.f18939c.getResources().getConfiguration().locale;
        if (TextUtils.isEmpty(locale.getCountry())) {
            return locale.getLanguage();
        }
        return locale.getLanguage() + ExpProfileLoopWheelTypeData.NONE_STR + locale.getCountry();
    }

    /* JADX INFO: renamed from: p */
    public void m22370p(g30<PurchaseType, Act, String> g30Var) {
        this.f18943g = g30Var;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: e */
    public void mo11960e(long j) {
    }
}
