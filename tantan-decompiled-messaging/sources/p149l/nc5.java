package p149l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.PurchasePaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nc5 implements uol {

    /* JADX INFO: renamed from: a */
    public LinearLayout f138099a;

    /* JADX INFO: renamed from: b */
    public VImage f138100b;

    /* JADX INFO: renamed from: c */
    public VText f138101c;

    /* JADX INFO: renamed from: d */
    public VText f138102d;

    /* JADX INFO: renamed from: e */
    public VImage f138103e;

    /* JADX INFO: renamed from: f */
    public TextView f138104f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f138105g;

    /* JADX INFO: renamed from: h */
    public VText f138106h;

    /* JADX INFO: renamed from: i */
    public VText f138107i;

    /* JADX INFO: renamed from: j */
    public final Act f138108j;

    /* JADX INFO: renamed from: k */
    public final int f138109k;

    /* JADX INFO: renamed from: l */
    public final PurchaseType f138110l;

    /* JADX INFO: renamed from: m */
    public long f138111m;

    /* JADX INFO: renamed from: n */
    public String f138112n;

    /* JADX INFO: renamed from: o */
    public g30<PurchaseType, Act, String> f138113o;

    /* JADX INFO: renamed from: p */
    public C8765d f138114p;

    /* JADX INFO: renamed from: q */
    public hab0 f138115q;

    /* JADX INFO: renamed from: r */
    public PayMethod f138116r;

    /* JADX INFO: renamed from: s */
    public e30<PayMethod> f138117s;

    /* JADX INFO: renamed from: l.nc5$a */
    public class C18669a implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8765d.a f138118a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f138119b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f138120c;

        public C18669a(C8765d.a aVar, String str, e30 e30Var) {
            this.f138118a = aVar;
            this.f138119b = str;
            this.f138120c = e30Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public /* synthetic */ void m158911e() {
            if (NullChecker.m81303a(nc5.this.f138113o)) {
                nc5.this.f138113o.mo36055a(nc5.this.f138110l, nc5.this.f138108j, nc5.this.f138112n);
            }
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            lsi0.m151578h(R$string.f27433e8);
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            ah60.m96376K(nc5.this.f138110l, "coin");
            lsi0.m151595y(String.format(nc5.this.f138108j.getString(R$string.f27163G6), Integer.valueOf(this.f138118a.m53605w())));
            if (nc5.this.f138109k == 25) {
                CoreModule.m29935P().m94651a().mo33426U7(nc5.this.f138108j, this.f138118a.m53607y(), new d30() { // from class: l.mc5
                    @Override // p149l.d30
                    public final void call() {
                        this.f133083a.m158911e();
                    }
                }, null);
            } else if (NullChecker.m81303a(nc5.this.f138113o)) {
                nc5.this.f138113o.mo36055a(nc5.this.f138110l, nc5.this.f138108j, nc5.this.f138112n);
            }
            swh0.m186255p0().m186291N0(nc5.this.f138116r);
            swh0.m186255p0().m186290M0(this.f138119b);
            this.f138120c.call(0);
        }
    }

    /* JADX INFO: renamed from: l.nc5$b */
    public class C18670b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f138122a;

        public C18670b(String str) {
            this.f138122a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            nc5.this.f138108j.startActivity(WebViewAct.m80164Z1(nc5.this.f138108j, nc5.this.f138108j.string(R$string.f27421d8), this.f138122a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: s */
    private C8765d.a m158894s() {
        if (!NullChecker.m81303a(this.f138114p)) {
            return null;
        }
        boolean zM53531m = this.f138114p.m53531m();
        C8765d c8765d = this.f138114p;
        return zM53531m ? c8765d.m53520b() : c8765d.m53522d();
    }

    /* JADX INFO: renamed from: A */
    public final void m158895A(final e30<Integer> e30Var) {
        C8765d.a aVarM158894s = m158894s();
        if (aVarM158894s == null) {
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33368Mf() && this.f138109k == 25 && m158904u(aVarM158894s)) {
            this.f138108j.progress(R$string.f27301T1);
            CoreModule.m29935P().m94651a().mo33426U7(this.f138108j, aVarM158894s.m53607y(), new d30() { // from class: l.ic5
                @Override // p149l.d30
                public final void call() {
                    this.f112429a.m158905v(e30Var);
                }
            }, new d30() { // from class: l.jc5
                @Override // p149l.d30
                public final void call() {
                    this.f117264a.m158906w();
                }
            });
            return;
        }
        String str = aVarM158894s.m53601s().defaultStockKeepUnit.f20507id;
        PurchasePaymentParam purchasePaymentParamM214467a = new yf60(this.f138110l).m214474h(str).m214478l(aVarM158894s.m53605w()).m214470d(this.f138109k).m214467a();
        if (NullChecker.m81303a(this.f138115q)) {
            purchasePaymentParamM214467a.setPurchaseTrackId(this.f138115q.getPurchaseTrackId());
        }
        swh0.m186179B0(this.f138108j, this.f138116r, this.f138110l, new m6b0().m153189b(purchasePaymentParamM214467a).m153190c(new C18669a(aVarM158894s, str, e30Var)).m153188a());
        double d = aVarM158894s.m53601s().defaultStockKeepUnit.prices.price;
        String str2 = "alipay";
        if (!TEnum.equals(this.f138116r, "alipay")) {
            str2 = "wechat";
            if (!TEnum.equals(this.f138116r, "wechat")) {
                str2 = "";
            }
        }
        HashMap map = new HashMap();
        if (this.f138109k == 25) {
            map.put("coin_price", Integer.valueOf(aVarM158894s.m53607y().price));
        }
        map.put("skuID", str);
        map.put("platform", str2);
        map.put("purchaseShowFrom", w2b0.m201088b(this.f138112n));
        map.put(FirebaseAnalytics.Param.PRICE, Double.valueOf(d));
        map.put("fold", 0);
        map.put("productType", this.f138110l.productCategory().name());
        if (CoreModule.m29935P().m94651a().mo33425U()) {
            map.put("no_secret_payment", CoreModule.f17545c.f19591O0.m30077E3());
            map.put("user_secret_staus", CoreModule.f17545c.f19591O0.m30076D3());
        }
        zvf0.m220397s("e_purchase_button", "p_purchase_page", map);
    }

    /* JADX INFO: renamed from: B */
    public final void m158896B() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_intermediate_page", getClass().getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE), vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f138112n)), vwb.m200311Y("productType", this.f138110l.productCategory().name()), vwb.m200311Y("skuID", m158903t()));
        new wf60(this.f138108j).m202975r(this.f138116r).m202974q(this.f138117s).m202973p(new DialogInterface.OnDismissListener() { // from class: l.lc5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m202972o("coin").m202976s();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: C */
    public final void m158897C() {
        String strString = this.f138108j.string(R$string.f27397b8);
        String string = this.f138108j.getString(R$string.f27385a8, strString);
        String strString2 = this.f138108j.string(R$string.f27409c8);
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f138108j.color(b1c0.f72559l));
        spannableStringBuilder.setSpan(new C18670b(strString2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f138107i.setText(spannableStringBuilder);
        this.f138107i.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: D */
    public final void m158898D() {
        this.f138101c.setText(R$string.f27287R9);
        this.f138100b.setImageResource(d3c0.f83894da);
        this.f138116r = PayMethod.get("alipay");
        if (!CoreModule.m29935P().m94651a().mo33386Oo()) {
            xdl0.m208344M(this.f138102d, false);
            return;
        }
        this.f138102d.setText(CoreModule.m29935P().m94651a().mo33555oc());
        xdl0.m208344M(this.f138102d, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m158899E() {
        if (this.f138109k == 25) {
            xdl0.m208344M(this.f138104f, true);
            xdl0.m208329E0(this.f138104f, new View.OnClickListener() { // from class: l.kc5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122288a.m158909z(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public void m158900F(g30<PurchaseType, Act, String> g30Var) {
        this.f138113o = g30Var;
    }

    /* JADX INFO: renamed from: G */
    public void m158901G(hab0 hab0Var) {
        this.f138115q = hab0Var;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: a */
    public View mo112508a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f138108j.inflater().inflate(m6c0.f131668y2, viewGroup, false);
        m158902r(viewInflate);
        this.f138101c.setTypeface(eqh0.m117752c(3), 1);
        return viewInflate;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: b */
    public void mo112509b(C8765d c8765d) {
        this.f138114p = c8765d;
        if (this.f138109k == 25) {
            if (CoreModule.m29935P().m94651a().mo33368Mf() && m158904u(m158894s())) {
                this.f138106h.setText("立即购买");
            } else {
                this.f138106h.setText(String.format("立即购买 %s%s", m158894s().m53583h(), m158894s().m53591l()));
            }
        }
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: c */
    public void mo112510c(String str) {
        this.f138112n = str;
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: d */
    public void mo112511d(final e30<Integer> e30Var, d30 d30Var) {
        m158897C();
        m158898D();
        m158899E();
        xdl0.m208329E0(this.f138099a, new View.OnClickListener() { // from class: l.gc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101988a.m158907x(view);
            }
        });
        xdl0.m208329E0(this.f138105g, new View.OnClickListener() { // from class: l.hc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107009a.m158908y(e30Var, view);
            }
        });
    }

    @Override // p149l.uol
    /* JADX INFO: renamed from: e */
    public void mo112512e(long j) {
        this.f138111m = j;
    }

    /* JADX INFO: renamed from: r */
    public final void m158902r(View view) {
        oc5.m163477a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final String m158903t() {
        C8765d.a aVarM158894s = m158894s();
        return aVarM158894s == null ? "" : aVarM158894s.m53601s().defaultStockKeepUnit.f20507id;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m158904u(C8765d.a aVar) {
        return aVar != null && this.f138111m >= ((long) aVar.m53607y().price);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m158905v(e30 e30Var) {
        this.f138108j.progressDismiss();
        if (NullChecker.m81303a(this.f138113o)) {
            this.f138113o.mo36055a(this.f138110l, this.f138108j, this.f138112n);
        }
        e30Var.call(0);
        if ("p_suggest_users_home_view,e_superlike,click".equals(this.f138112n) || "p_home,superlike".equals(this.f138112n)) {
            return;
        }
        lsi0.m151593w(R$string.f27447fa);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m158906w() {
        this.f138108j.progressDismiss();
        lsi0.m151580j("购买失败");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m158907x(View view) {
        m158896B();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m158908y(e30 e30Var, View view) {
        m158895A(e30Var);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m158909z(View view) {
        CoreModule.m29935P().m94651a().mo33429Uh(this.f138108j, this.f138112n);
    }
}
