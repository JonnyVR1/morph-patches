package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.PurchasePaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nd5 implements frl {

    /* JADX INFO: renamed from: a */
    public LinearLayout f141426a;

    /* JADX INFO: renamed from: b */
    public VImage f141427b;

    /* JADX INFO: renamed from: c */
    public VText f141428c;

    /* JADX INFO: renamed from: d */
    public VText f141429d;

    /* JADX INFO: renamed from: e */
    public VImage f141430e;

    /* JADX INFO: renamed from: f */
    public TextView f141431f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f141432g;

    /* JADX INFO: renamed from: h */
    public VText f141433h;

    /* JADX INFO: renamed from: i */
    public VText f141434i;

    /* JADX INFO: renamed from: j */
    public final Act f141435j;

    /* JADX INFO: renamed from: k */
    public final int f141436k;

    /* JADX INFO: renamed from: l */
    public final PurchaseType f141437l;

    /* JADX INFO: renamed from: m */
    public long f141438m;

    /* JADX INFO: renamed from: n */
    public String f141439n;

    /* JADX INFO: renamed from: o */
    public a30<PurchaseType, Act, String> f141440o;

    /* JADX INFO: renamed from: p */
    public C8928d f141441p;

    /* JADX INFO: renamed from: q */
    public lib0 f141442q;

    /* JADX INFO: renamed from: r */
    public PayMethod f141443r;

    /* JADX INFO: renamed from: s */
    public y20<PayMethod> f141444s;

    /* JADX INFO: renamed from: l.nd5$a */
    public class C18857a implements bn50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8928d.a f141445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f141446b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y20 f141447c;

        public C18857a(C8928d.a aVar, String str, y20 y20Var) {
            this.f141445a = aVar;
            this.f141446b = str;
            this.f141447c = y20Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public /* synthetic */ void m162639e() {
            if (NullChecker.m82486a(nd5.this.f141440o)) {
                nd5.this.f141440o.mo37058a(nd5.this.f141437l, nd5.this.f141435j, nd5.this.f141439n);
            }
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            o1j0.m165634h(R$string.f28281e8);
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            fp60.m126549K(nd5.this.f141437l, "coin");
            o1j0.m165651y(String.format(nd5.this.f141435j.getString(R$string.f28011G6), Integer.valueOf(this.f141445a.m54788w())));
            if (nd5.this.f141436k == 25) {
                CoreModule.m30933P().m143405a().mo34429U7(nd5.this.f141435j, this.f141445a.m54790y(), new x20() { // from class: l.md5
                    @Override // p153l.x20
                    public final void call() {
                        this.f135865a.m162639e();
                    }
                }, null);
            } else if (NullChecker.m82486a(nd5.this.f141440o)) {
                nd5.this.f141440o.mo37058a(nd5.this.f141437l, nd5.this.f141435j, nd5.this.f141439n);
            }
            a5i0.m96160p0().m96196N0(nd5.this.f141443r);
            a5i0.m96160p0().m96195M0(this.f141446b);
            this.f141447c.call(0);
        }
    }

    /* JADX INFO: renamed from: l.nd5$b */
    public class C18858b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f141449a;

        public C18858b(String str) {
            this.f141449a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            nd5.this.f141435j.startActivity(WebViewAct.m81347a2(nd5.this.f141435j, nd5.this.f141435j.string(R$string.f28269d8), this.f141449a));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: s */
    private C8928d.a m162622s() {
        if (!NullChecker.m82486a(this.f141441p)) {
            return null;
        }
        boolean zM54714m = this.f141441p.m54714m();
        C8928d c8928d = this.f141441p;
        return zM54714m ? c8928d.m54703b() : c8928d.m54705d();
    }

    /* JADX INFO: renamed from: A */
    public final void m162623A(final y20<Integer> y20Var) {
        C8928d.a aVarM162622s = m162622s();
        if (aVarM162622s == null) {
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34371Mf() && this.f141436k == 25 && m162632u(aVarM162622s)) {
            this.f141435j.progress(R$string.f28149T1);
            CoreModule.m30933P().m143405a().mo34429U7(this.f141435j, aVarM162622s.m54790y(), new x20() { // from class: l.id5
                @Override // p153l.x20
                public final void call() {
                    this.f114471a.m162633v(y20Var);
                }
            }, new x20() { // from class: l.jd5
                @Override // p153l.x20
                public final void call() {
                    this.f120111a.m162634w();
                }
            });
            return;
        }
        String str = aVarM162622s.m54784s().defaultStockKeepUnit.f21249id;
        PurchasePaymentParam purchasePaymentParamM117176a = new do60(this.f141437l).m117183h(str).m117187l(aVarM162622s.m54788w()).m117179d(this.f141436k).m117176a();
        if (NullChecker.m82486a(this.f141442q)) {
            purchasePaymentParamM117176a.setPurchaseTrackId(this.f141442q.getPurchaseTrackId());
        }
        a5i0.m96084B0(this.f141435j, this.f141443r, this.f141437l, new qeb0().m176235b(purchasePaymentParamM117176a).m176236c(new C18857a(aVarM162622s, str, y20Var)).m176234a());
        double d = aVarM162622s.m54784s().defaultStockKeepUnit.prices.price;
        String str2 = "alipay";
        if (!TEnum.equals(this.f141443r, "alipay")) {
            str2 = "wechat";
            if (!TEnum.equals(this.f141443r, "wechat")) {
                str2 = "";
            }
        }
        HashMap map = new HashMap();
        if (this.f141436k == 25) {
            map.put("coin_price", Integer.valueOf(aVarM162622s.m54790y().price));
        }
        map.put("skuID", str);
        map.put("platform", str2);
        map.put("purchaseShowFrom", abb0.m96735b(this.f141439n));
        map.put(FirebaseAnalytics.Param.PRICE, Double.valueOf(d));
        map.put("fold", 0);
        map.put("productType", this.f141437l.productCategory().name());
        if (CoreModule.m30933P().m143405a().mo34428U()) {
            map.put("no_secret_payment", CoreModule.f18264c.f20333O0.m31075E3());
            map.put("user_secret_staus", CoreModule.f18264c.f20333O0.m31074D3());
        }
        i4g0.m138521s("e_purchase_button", "p_purchase_page", map);
    }

    /* JADX INFO: renamed from: B */
    public final void m162624B() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_intermediate_page", getClass().getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f141439n)), jyb.m147494Y("productType", this.f141437l.productCategory().name()), jyb.m147494Y("skuID", m162631t()));
        new bo60(this.f141435j).m105668r(this.f141443r).m105667q(this.f141444s).m105666p(new DialogInterface.OnDismissListener() { // from class: l.ld5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m105665o("coin").m105669s();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: C */
    public final void m162625C() {
        String strString = this.f141435j.string(R$string.f28245b8);
        String string = this.f141435j.getString(R$string.f28233a8, strString);
        String strString2 = this.f141435j.string(R$string.f28257c8);
        int iIndexOf = string.indexOf(strString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f141435j.color(h9c0.f108379l));
        spannableStringBuilder.setSpan(new C18858b(strString2), iIndexOf, strString.length() + iIndexOf, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strString.length() + iIndexOf, 33);
        this.f141434i.setText(spannableStringBuilder);
        this.f141434i.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: D */
    public final void m162626D() {
        this.f141428c.setText(R$string.f28135R9);
        this.f141427b.setImageResource(jbc0.f119549da);
        this.f141443r = PayMethod.get("alipay");
        if (!CoreModule.m30933P().m143405a().mo34389Oo()) {
            bnl0.m105524M(this.f141429d, false);
            return;
        }
        this.f141429d.setText(CoreModule.m30933P().m143405a().mo34558oc());
        bnl0.m105524M(this.f141429d, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m162627E() {
        if (this.f141436k == 25) {
            bnl0.m105524M(this.f141431f, true);
            bnl0.m105509E0(this.f141431f, new View.OnClickListener() { // from class: l.kd5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f125153a.m162637z(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: F */
    public void m162628F(a30<PurchaseType, Act, String> a30Var) {
        this.f141440o = a30Var;
    }

    /* JADX INFO: renamed from: G */
    public void m162629G(lib0 lib0Var) {
        this.f141442q = lib0Var;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: a */
    public View mo117348a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f141435j.inflater().inflate(rec0.f162628y2, viewGroup, false);
        m162630r(viewInflate);
        this.f141428c.setTypeface(lyh0.m156283c(3), 1);
        return viewInflate;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: b */
    public void mo117349b(C8928d c8928d) {
        this.f141441p = c8928d;
        if (this.f141436k == 25) {
            if (CoreModule.m30933P().m143405a().mo34371Mf() && m162632u(m162622s())) {
                this.f141433h.setText("立即购买");
            } else {
                this.f141433h.setText(String.format("立即购买 %s%s", m162622s().m54766h(), m162622s().m54774l()));
            }
        }
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: c */
    public void mo117350c(String str) {
        this.f141439n = str;
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: d */
    public void mo117351d(final y20<Integer> y20Var, x20 x20Var) {
        m162625C();
        m162626D();
        m162627E();
        bnl0.m105509E0(this.f141426a, new View.OnClickListener() { // from class: l.gd5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103626a.m162635x(view);
            }
        });
        bnl0.m105509E0(this.f141432g, new View.OnClickListener() { // from class: l.hd5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108785a.m162636y(y20Var, view);
            }
        });
    }

    @Override // p153l.frl
    /* JADX INFO: renamed from: e */
    public void mo117352e(long j) {
        this.f141438m = j;
    }

    /* JADX INFO: renamed from: r */
    public final void m162630r(View view) {
        od5.m167278a(this, view);
    }

    /* JADX INFO: renamed from: t */
    public final String m162631t() {
        C8928d.a aVarM162622s = m162622s();
        return aVarM162622s == null ? "" : aVarM162622s.m54784s().defaultStockKeepUnit.f21249id;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m162632u(C8928d.a aVar) {
        return aVar != null && this.f141438m >= ((long) aVar.m54790y().price);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m162633v(y20 y20Var) {
        this.f141435j.progressDismiss();
        if (NullChecker.m82486a(this.f141440o)) {
            this.f141440o.mo37058a(this.f141437l, this.f141435j, this.f141439n);
        }
        y20Var.call(0);
        if ("p_suggest_users_home_view,e_superlike,click".equals(this.f141439n) || "p_home,superlike".equals(this.f141439n)) {
            return;
        }
        o1j0.m165649w(R$string.f28295fa);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m162634w() {
        this.f141435j.progressDismiss();
        o1j0.m165636j("购买失败");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m162635x(View view) {
        m162624B();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m162636y(y20 y20Var, View view) {
        m162623A(y20Var);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m162637z(View view) {
        CoreModule.m30933P().m143405a().mo34432Uh(this.f141435j, this.f141439n);
    }
}
