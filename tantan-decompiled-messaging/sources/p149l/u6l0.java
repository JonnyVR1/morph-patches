package p149l;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class u6l0 implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f174849a;

    /* JADX INFO: renamed from: b */
    public View f174850b;

    /* JADX INFO: renamed from: c */
    public ImageView f174851c;

    /* JADX INFO: renamed from: d */
    public TextView f174852d;

    /* JADX INFO: renamed from: e */
    public VButton f174853e;

    /* JADX INFO: renamed from: f */
    public VButton f174854f;

    /* JADX INFO: renamed from: g */
    public VButton f174855g;

    /* JADX INFO: renamed from: h */
    public ImageView f174856h;

    /* JADX INFO: renamed from: i */
    public Dialog f174857i;

    /* JADX INFO: renamed from: j */
    public final Act f174858j;

    /* JADX INFO: renamed from: k */
    public final nt30 f174859k;

    /* JADX INFO: renamed from: l */
    public c4g0 f174860l;

    /* JADX INFO: renamed from: n */
    public String f174862n;

    /* JADX INFO: renamed from: o */
    public C8765d.a f174863o;

    /* JADX INFO: renamed from: p */
    public c4g0 f174864p;

    /* JADX INFO: renamed from: q */
    public c4g0 f174865q;

    /* JADX INFO: renamed from: r */
    public cwf0 f174866r;

    /* JADX INFO: renamed from: m */
    public final PurchaseType f174861m = PurchaseType.TYPE_GET_VIP;

    /* JADX INFO: renamed from: s */
    public final String f174867s = "video_purchase_dlg_timer";

    /* JADX INFO: renamed from: l.u6l0$a */
    public class C20365a extends er2 {
        public C20365a() {
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_suggest_swipe_limit_popup";
        }
    }

    /* JADX INFO: renamed from: l.u6l0$b */
    public class C20366b extends qlw {

        /* JADX INFO: renamed from: e */
        public final C8765d.a f174869e;

        /* JADX INFO: renamed from: f */
        public final String f174870f;

        public C20366b(Act act, PurchaseType purchaseType, C8765d.a aVar, String str) {
            super(act, purchaseType);
            this.f174869e = aVar;
            this.f174870f = str;
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            super.mo30846c();
            u6l0.this.m192003n();
        }

        @Override // p149l.qlw
        /* JADX INFO: renamed from: x */
        public Object[] mo111721x() {
            try {
                if (NullChecker.m81303a(this.f174869e.m53601s())) {
                    Prices prices = this.f174869e.m53601s().defaultStockKeepUnit.prices;
                    return new Object[]{FirebaseAnalytics.Param.CURRENCY, prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f174870f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.m81296c(new IllegalStateException("Failed to generate payment params", th));
            }
            return qlw.f155260d;
        }
    }

    public u6l0(Act act, nt30 nt30Var) {
        this.f174858j = act;
        this.f174859k = nt30Var;
    }

    /* JADX INFO: renamed from: F */
    private void m191983F() {
        m191998C(15999L);
        CoreModule.f17545c.f19685t1.m31516u("video_purchase_dlg_timer");
        CoreModule.f17545c.f19685t1.m31513r(new RunnableC4733c0.a().m31523g("video_purchase_dlg_timer").m31517a(true).m31522f(mqi0.m155944o() + 15999).m31520d(this));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m191984a(Throwable th) {
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m192007r(ProductCategory productCategory, List<Merchandise> list) {
        Iterator<C8765d> it = cjy.m107330z(productCategory).mo107333a(this.f174858j, this.f174861m, productCategory, list).iterator();
        while (it.hasNext()) {
            C8765d.a aVarM53520b = it.next().m53520b();
            if (aVarM53520b.m53605w() == 1) {
                this.f174862n = aVarM53520b.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId();
                this.f174863o = aVarM53520b;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m191997B() {
        mrm.m156049o().m156055G();
        m192003n();
        mrm.m156049o().m156067w();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: C */
    public final void m191998C(long j) {
        String strM133156c = hvc0.m133156c(R$string.f18359ac);
        VButton vButton = this.f174853e;
        if (j <= 0) {
            vButton.setText(strM133156c);
            return;
        }
        vButton.setText(strM133156c + " (" + (j / 1000) + "s)");
    }

    /* JADX INFO: renamed from: D */
    public final void m191999D(boolean z) {
        if (IntlCountryCodeController.m28111g() ? (vdj.m198001c() || nkp.m159983b()) ? false : true : false) {
            this.f174854f.setVisibility(8);
        }
        xdl0.m208344M(this.f174854f, !z);
        xdl0.m208344M(this.f174855g, z);
        xdl0.m208329E0(this.f174854f, new View.OnClickListener() { // from class: l.o6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142368a.m192008s(view);
            }
        });
        xdl0.m208329E0(this.f174856h, new View.OnClickListener() { // from class: l.p6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147421a.m192009t(view);
            }
        });
        xdl0.m208329E0(this.f174855g, new View.OnClickListener() { // from class: l.q6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152921a.m192010v(view);
            }
        });
        xdl0.m208329E0(this.f174853e, new View.OnClickListener() { // from class: l.r6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157949a.m192011w(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m192000E() {
        m192001G();
        com.p046p1.mobile.android.app.Dialog dialogM20567z = this.f174858j.dialog().m20517M(f6c0.f95888m2).m20496B(false).m20516L(v7c0.f180366m).m20559v().m20566y0(s4e.f162375a).m20567z();
        this.f174857i = dialogM20567z;
        m192002m(dialogM20567z.m20458P());
        final boolean zM191816Y = u59.m191816Y();
        if (!zM191816Y) {
            m192005p();
        }
        m191999D(zM191816Y);
        this.f174857i.show();
        this.f174857i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.i6l0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f111751a.m192012x(zM191816Y, dialogInterface);
            }
        });
        this.f174857i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.l6l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f126648a.m192013y(dialogInterface);
            }
        });
        if (!mrm.m156049o().m156057l()) {
            mrm.m156049o().m156066v(false);
        }
        if (zM191816Y) {
            mrm.m156049o().m156070z();
            xdl0.m208368c0(this.f174849a, 0);
            ImageView imageView = this.f174851c;
            int i = t100.f167275x;
            xdl0.m208360X(imageView, i);
            xdl0.m208360X(this.f174852d, i);
            xdl0.m208360X(this.f174853e, t100.f167273v);
            xdl0.m208344M(this.f174856h, false);
            xdl0.m208344M(this.f174850b, true);
            this.f174853e.setBackgroundResource(x2c0.f190570t);
            this.f174851c.setBackgroundResource(x2c0.f190102e9);
            this.f174852d.setText(R$string.f18328Zb);
            this.f174853e.setTextColor(hvc0.m133154a(w0c0.f183759D0));
            this.f174855g.setTextColor(hvc0.m133154a(w0c0.f183846f0));
            this.f174865q = this.f174858j.lifecycle().skip(1).subscribe(mkd0.m154956H(new e30() { // from class: l.m6l0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131706a.m192014z((C4319c) obj);
                }
            }, new e30() { // from class: l.n6l0
                @Override // p149l.e30
                public final void call(Object obj) {
                    u6l0.m191984a((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m192001G() {
        this.f174866r = new cwf0(new C20365a());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException unused) {
        }
        this.f174866r.m109039o(jSONObject);
        i0e.m133797f(this.f174866r);
    }

    /* JADX INFO: renamed from: m */
    public final void m192002m(View view) {
        v6l0.m197208a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m192003n() {
        m192004o();
        this.f174857i.dismiss();
        i0e.m133796e(this.f174866r);
        if (NullChecker.m81303a(this.f174860l) && !this.f174860l.isUnsubscribed()) {
            this.f174860l.unsubscribe();
            this.f174860l = null;
        }
        if (!NullChecker.m81303a(this.f174864p) || this.f174864p.isUnsubscribed()) {
            return;
        }
        this.f174864p.unsubscribe();
        this.f174864p = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m192004o() {
        if (NullChecker.m81303a(this.f174865q)) {
            mkd0.m154992z(this.f174865q);
        }
        CoreModule.f17545c.f19685t1.m31516u("video_purchase_dlg_timer");
    }

    /* JADX INFO: renamed from: p */
    public final void m192005p() {
        final ProductCategory productCategory = this.f174861m.productCategory();
        this.f174860l = C22306c.just(productCategory).flatMap(new w9j() { // from class: l.s6l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19654j0.m30644y5((ProductCategory) obj);
            }
        }).filter(new w9j() { // from class: l.t6l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.j6l0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f116485a.m192006q((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.k6l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121491a.m192007r(productCategory, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C22306c m192006q(List list) {
        return igj.m136009M(this.f174858j, list);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m192008s(View view) {
        mrm.m156049o().m156054F();
        hqo hqoVar = new hqo(this.f174858j, this.f174861m);
        hqoVar.m132479t(new C20366b(this.f174858j, this.f174861m, this.f174863o, this.f174862n));
        Act act = this.f174858j;
        hqoVar.m132475p(aqo.m98316h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m148933i() : null), true, this.f174862n);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m192009t(View view) {
        m192003n();
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        long j5 = j3 - j;
        m191998C(j5);
        if (j5 <= 0) {
            m191997B();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m192010v(View view) {
        mrm.m156049o().m156069y();
        m192003n();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m192011w(View view) {
        m191997B();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m192012x(boolean z, DialogInterface dialogInterface) {
        if (z) {
            m191983F();
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m192013y(DialogInterface dialogInterface) {
        m192004o();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m192014z(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m191983F();
        } else if (c4319c == C4319c.f15550k) {
            CoreModule.f17545c.f19685t1.m31516u("video_purchase_dlg_timer");
        }
    }
}
