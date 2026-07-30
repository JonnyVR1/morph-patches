package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.PurchasePaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.ah60;
import l.b1c0;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.g30;
import l.hab0;
import l.i0e;
import l.j760;
import l.lsi0;
import l.m6b0;
import l.m6c0;
import l.oc5;
import l.swh0;
import l.ue50;
import l.vwb;
import l.w2b0;
import l.xdl0;
import l.yf60;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nc5 implements uol {

    /* JADX INFO: renamed from: a */
    public LinearLayout f15917a;

    /* JADX INFO: renamed from: b */
    public VImage f15918b;

    /* JADX INFO: renamed from: c */
    public VText f15919c;

    /* JADX INFO: renamed from: d */
    public VText f15920d;

    /* JADX INFO: renamed from: e */
    public VImage f15921e;

    /* JADX INFO: renamed from: f */
    public TextView f15922f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f15923g;

    /* JADX INFO: renamed from: h */
    public VText f15924h;

    /* JADX INFO: renamed from: i */
    public VText f15925i;

    /* JADX INFO: renamed from: j */
    public final Act f15926j;

    /* JADX INFO: renamed from: k */
    public final int f15927k;

    /* JADX INFO: renamed from: l */
    public final PurchaseType f15928l;

    /* JADX INFO: renamed from: m */
    public long f15929m;

    /* JADX INFO: renamed from: n */
    public String f15930n;

    /* JADX INFO: renamed from: o */
    public g30<PurchaseType, Act, String> f15931o;

    /* JADX INFO: renamed from: p */
    public C0190d f15932p;

    /* JADX INFO: renamed from: q */
    public hab0 f15933q;

    /* JADX INFO: renamed from: r */
    public PayMethod f15934r;

    /* JADX INFO: renamed from: s */
    public e30<PayMethod> f15935s;

    /* JADX INFO: renamed from: l.nc5$a */
    public class C0699a implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0190d.a f15936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f15937b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f15938c;

        public C0699a(C0190d.a aVar, String str, e30 e30Var) {
            this.f15936a = aVar;
            this.f15937b = str;
            this.f15938c = e30Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public /* synthetic */ void m18676e() {
            if (NullChecker.a(nc5.this.f15931o)) {
                nc5.this.f15931o.a(nc5.this.f15928l, nc5.this.f15926j, nc5.this.f15930n);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m18677a() {
            lsi0.h(R.string.e8);
        }

        /* JADX INFO: renamed from: c */
        public void m18678c() {
            ah60.K(nc5.this.f15928l, "coin");
            lsi0.y(String.format(nc5.this.f15926j.getString(R.string.G6), Integer.valueOf(this.f15936a.m4171w())));
            if (nc5.this.f15927k == 25) {
                CoreModule.P().a().U7(nc5.this.f15926j, this.f15936a.m4173y(), new d30() { // from class: l.mc5
                    public final void call() {
                        this.f15325a.m18676e();
                    }
                }, (d30) null);
            } else if (NullChecker.a(nc5.this.f15931o)) {
                nc5.this.f15931o.a(nc5.this.f15928l, nc5.this.f15926j, nc5.this.f15930n);
            }
            swh0.p0().N0(nc5.this.f15934r);
            swh0.p0().M0(this.f15937b);
            this.f15938c.call(0);
        }
    }

    /* JADX INFO: renamed from: l.nc5$b */
    public class C0700b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f15940a;

        public C0700b(String str) {
            this.f15940a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            nc5.this.f15926j.startActivity(WebViewAct.Z1(nc5.this.f15926j, nc5.this.f15926j.string(R.string.d8), this.f15940a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: s */
    private C0190d.a m18659s() {
        if (!NullChecker.a(this.f15932p)) {
            return null;
        }
        boolean zM4097m = this.f15932p.m4097m();
        C0190d c0190d = this.f15932p;
        return zM4097m ? c0190d.m4086b() : c0190d.m4088d();
    }

    /* JADX INFO: renamed from: A */
    public final void m18660A(final e30<Integer> e30Var) {
        C0190d.a aVarM18659s = m18659s();
        if (aVarM18659s == null) {
            return;
        }
        if (CoreModule.P().a().Mf() && this.f15927k == 25 && m18669u(aVarM18659s)) {
            this.f15926j.progress(R.string.T1);
            CoreModule.P().a().U7(this.f15926j, aVarM18659s.m4173y(), new d30() { // from class: l.ic5
                public final void call() {
                    this.f13140a.m18670v(e30Var);
                }
            }, new d30() { // from class: l.jc5
                public final void call() {
                    this.f13676a.m18671w();
                }
            });
            return;
        }
        String str = aVarM18659s.m4167s().defaultStockKeepUnit.id;
        PurchasePaymentParam purchasePaymentParamA = new yf60(this.f15928l).h(str).l(aVarM18659s.m4171w()).d(this.f15927k).a();
        if (NullChecker.a(this.f15933q)) {
            purchasePaymentParamA.setPurchaseTrackId(this.f15933q.n());
        }
        swh0.B0(this.f15926j, this.f15934r, this.f15928l, new m6b0().b(purchasePaymentParamA).c(new C0699a(aVarM18659s, str, e30Var)).a());
        double d = aVarM18659s.m4167s().defaultStockKeepUnit.prices.price;
        String str2 = "alipay";
        if (!TEnum.equals(this.f15934r, "alipay")) {
            str2 = "wechat";
            if (!TEnum.equals(this.f15934r, "wechat")) {
                str2 = "";
            }
        }
        HashMap map = new HashMap();
        if (this.f15927k == 25) {
            map.put("coin_price", Integer.valueOf(aVarM18659s.m4173y().price));
        }
        map.put("skuID", str);
        map.put("platform", str2);
        map.put("purchaseShowFrom", w2b0.b(this.f15930n));
        map.put("price", Double.valueOf(d));
        map.put("fold", 0);
        map.put("productType", this.f15928l.productCategory().name());
        if (CoreModule.P().a().U()) {
            map.put("no_secret_payment", CoreModule.c.O0.E3());
            map.put("user_secret_staus", CoreModule.c.O0.D3());
        }
        zvf0.s("e_purchase_button", "p_purchase_page", map);
    }

    /* JADX INFO: renamed from: B */
    public final void m18661B() {
        final cwf0 cwf0VarC = i0e.c("p_purchase_intermediate_page", getClass().getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "active"), vwb.Y("purchaseShowFrom", w2b0.b(this.f15930n)), vwb.Y("productType", this.f15928l.productCategory().name()), vwb.Y("skuID", m18668t())});
        new wf60(this.f15926j).m24556r(this.f15934r).m24555q(this.f15935s).m24554p(new DialogInterface.OnDismissListener() { // from class: l.lc5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).m24553o("coin").m24557s();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: C */
    public final void m18662C() {
        String strString = this.f15926j.string(R.string.b8);
        String string = this.f15926j.getString(R.string.a8, strString);
        String strString2 = this.f15926j.string(R.string.c8);
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f15926j.color(b1c0.l));
        spannableStringBuilder.setSpan(new C0700b(strString2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f15925i.setText(spannableStringBuilder);
        this.f15925i.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: D */
    public final void m18663D() {
        this.f15919c.setText(R.string.R9);
        this.f15918b.setImageResource(d3c0.da);
        this.f15934r = PayMethod.get("alipay");
        if (!CoreModule.P().a().Oo()) {
            xdl0.M(this.f15920d, false);
            return;
        }
        this.f15920d.setText(CoreModule.P().a().oc());
        xdl0.M(this.f15920d, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m18664E() {
        if (this.f15927k == 25) {
            xdl0.M(this.f15922f, true);
            xdl0.E0(this.f15922f, new View.OnClickListener() { // from class: l.kc5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14277a.m18674z(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public void m18665F(g30<PurchaseType, Act, String> g30Var) {
        this.f15931o = g30Var;
    }

    /* JADX INFO: renamed from: G */
    public void m18666G(hab0 hab0Var) {
        this.f15933q = hab0Var;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: a */
    public View mo11956a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f15926j.inflater().inflate(m6c0.y2, viewGroup, false);
        m18667r(viewInflate);
        this.f15919c.setTypeface(eqh0.c(3), 1);
        return viewInflate;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: b */
    public void mo11957b(C0190d c0190d) {
        this.f15932p = c0190d;
        if (this.f15927k == 25) {
            if (CoreModule.P().a().Mf() && m18669u(m18659s())) {
                this.f15924h.setText("立即购买");
            } else {
                this.f15924h.setText(String.format("立即购买 %s%s", m18659s().m4149h(), m18659s().m4157l()));
            }
        }
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: c */
    public void mo11958c(String str) {
        this.f15930n = str;
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: d */
    public void mo11959d(final e30<Integer> e30Var, d30 d30Var) {
        m18662C();
        m18663D();
        m18664E();
        xdl0.E0(this.f15917a, new View.OnClickListener() { // from class: l.gc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11356a.m18672x(view);
            }
        });
        xdl0.E0(this.f15923g, new View.OnClickListener() { // from class: l.hc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11965a.m18673y(e30Var, view);
            }
        });
    }

    @Override // p002l.uol
    /* JADX INFO: renamed from: e */
    public void mo11960e(long j) {
        this.f15929m = j;
    }

    /* JADX INFO: renamed from: r */
    public final void m18667r(View view) {
        oc5.a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final String m18668t() {
        C0190d.a aVarM18659s = m18659s();
        return aVarM18659s == null ? "" : aVarM18659s.m4167s().defaultStockKeepUnit.id;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18669u(C0190d.a aVar) {
        return aVar != null && this.f15929m >= ((long) aVar.m4173y().price);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m18670v(e30 e30Var) {
        this.f15926j.progressDismiss();
        if (NullChecker.a(this.f15931o)) {
            this.f15931o.a(this.f15928l, this.f15926j, this.f15930n);
        }
        e30Var.call(0);
        if ("p_suggest_users_home_view,e_superlike,click".equals(this.f15930n) || "p_home,superlike".equals(this.f15930n)) {
            return;
        }
        lsi0.w(R.string.fa);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m18671w() {
        this.f15926j.progressDismiss();
        lsi0.j("购买失败");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m18672x(View view) {
        m18661B();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m18673y(e30 e30Var, View view) {
        m18660A(e30Var);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m18674z(View view) {
        CoreModule.P().a().Uh(this.f15926j, this.f15930n);
    }
}
