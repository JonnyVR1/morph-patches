package p002l;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0191e;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import l.b1c0;
import l.d30;
import l.e30;
import l.evm;
import l.g30;
import l.j760;
import l.lsi0;
import l.m6c0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dvm {

    /* JADX INFO: renamed from: a */
    public VLinear f9442a;

    /* JADX INFO: renamed from: b */
    public VRelative f9443b;

    /* JADX INFO: renamed from: c */
    public VText f9444c;

    /* JADX INFO: renamed from: d */
    public VText f9445d;

    /* JADX INFO: renamed from: e */
    public VLinear f9446e;

    /* JADX INFO: renamed from: f */
    public VText f9447f;

    /* JADX INFO: renamed from: g */
    public VText f9448g;

    /* JADX INFO: renamed from: h */
    public Act f9449h;

    /* JADX INFO: renamed from: i */
    public String f9450i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f9451j;

    /* JADX INFO: renamed from: k */
    public g30<PurchaseType, Act, String> f9452k;

    /* JADX INFO: renamed from: l */
    public C0190d f9453l;

    /* JADX INFO: renamed from: l.dvm$a */
    public class C0535a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f9454a;

        public C0535a(String str) {
            this.f9454a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            Act act = dvm.this.f9449h;
            act.startActivity(MkWebViewAct.c2(act, "", this.f9454a, true, true, (ResultReceiver) null));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public dvm(Act act, PurchaseType purchaseType) {
        this.f9449h = act;
        this.f9451j = purchaseType;
    }

    /* JADX INFO: renamed from: j */
    public static String m12065j() {
        return Uri.parse("https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/membership-automatic-renewal/index.html?speed=true&_bid=1005449&devtool=1&hideNavigationBar=1&hideNotch=1").buildUpon().appendQueryParameter("country", IntlCountryCodeController.d(qib0.f0)).toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m12066d(View view) {
        evm.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public View m12067e(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f9449h.inflater().inflate(m6c0.g, viewGroup, false);
        m12066d(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: f */
    public C0190d.a m12068f() {
        if (!NullChecker.a(this.f9453l)) {
            return null;
        }
        boolean zM4097m = this.f9453l.m4097m();
        C0190d c0190d = this.f9453l;
        return zM4097m ? c0190d.m4086b() : c0190d.m4088d();
    }

    /* JADX INFO: renamed from: g */
    public void m12069g() {
        this.f9443b.setVisibility(8);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m12070h(e30 e30Var) {
        CoreModule.c.C0.u4();
        lsi0.w(R.string.d7);
        if (NullChecker.a(this.f9452k)) {
            this.f9452k.a(this.f9451j, this.f9449h, this.f9450i);
        }
        e30Var.call(0);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m12071i(e30 e30Var, View view) {
        m12073l(e30Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m12072k(C0190d.a aVar, final e30<Integer> e30Var) {
        if (aVar == null) {
            return;
        }
        String productId = aVar.m4167s().defaultStockKeepUnit.affiliateProducts.getProductId();
        zvf0.u("e_intl_instantmatch_iap_sku_click", "p_intl_instantmatch_iap_view", new j760[]{vwb.Y("skuID", productId)});
        CoreModule.P().a().Eo(this.f9449h, this.f9451j, false, new d30() { // from class: l.bvm
            public final void call() {
                this.f8376a.m12070h(e30Var);
            }
        }, new d30() { // from class: l.cvm
            public final void call() {
                lsi0.h(R.string.e8);
            }
        }, productId);
    }

    /* JADX INFO: renamed from: l */
    public final void m12073l(e30<Integer> e30Var) {
        m12072k(m12068f(), e30Var);
    }

    /* JADX INFO: renamed from: m */
    public void m12074m(C0190d c0190d) {
        this.f9453l = c0190d;
        this.f9447f.setText(String.format(this.f9449h.getString(R.string.J5), C0191e.m4209q(c0190d.m4088d())));
    }

    /* JADX INFO: renamed from: n */
    public void m12075n(final e30<Integer> e30Var, d30 d30Var) {
        m12076o();
        this.f9447f.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.E0(this.f9446e, new View.OnClickListener() { // from class: l.avm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7900a.m12071i(e30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m12076o() {
        String str = "\n" + this.f9449h.string(R.string.c4);
        String str2 = this.f9449h.getString(R.string.P4, Integer.valueOf(CoreModule.o.d().jm())) + str;
        String strM12065j = m12065j();
        int iIndexOf = str2.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f9449h.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0535a(strM12065j), iIndexOf, str.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, str.length() + iIndexOf, 33);
        this.f9448g.setText(spannableStringBuilder);
        this.f9448g.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: p */
    public void m12077p(String str) {
        this.f9450i = str;
    }

    /* JADX INFO: renamed from: q */
    public void m12078q(g30<PurchaseType, Act, String> g30Var) {
        this.f9452k = g30Var;
    }
}
