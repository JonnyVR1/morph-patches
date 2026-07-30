package p003l;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.data.Active;
import com.p000p1.mobile.putong.core.data.DeviceType;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.Prices;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.c4g0;
import l.cjy;
import l.cwf0;
import l.e30;
import l.er2;
import l.f6c0;
import l.hqo;
import l.hvc0;
import l.i0e;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.nkp;
import l.nt30;
import l.qlw;
import l.t100;
import l.u59;
import l.v7c0;
import l.vdj;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u6l0 implements c0.c {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f7673a;

    /* JADX INFO: renamed from: b */
    public View f7674b;

    /* JADX INFO: renamed from: c */
    public ImageView f7675c;

    /* JADX INFO: renamed from: d */
    public TextView f7676d;

    /* JADX INFO: renamed from: e */
    public VButton f7677e;

    /* JADX INFO: renamed from: f */
    public VButton f7678f;

    /* JADX INFO: renamed from: g */
    public VButton f7679g;

    /* JADX INFO: renamed from: h */
    public ImageView f7680h;

    /* JADX INFO: renamed from: i */
    public Dialog f7681i;

    /* JADX INFO: renamed from: j */
    public final Act f7682j;

    /* JADX INFO: renamed from: k */
    public final nt30 f7683k;

    /* JADX INFO: renamed from: l */
    public c4g0 f7684l;

    /* JADX INFO: renamed from: n */
    public String f7686n;

    /* JADX INFO: renamed from: o */
    public d.a f7687o;

    /* JADX INFO: renamed from: p */
    public c4g0 f7688p;

    /* JADX INFO: renamed from: q */
    public c4g0 f7689q;

    /* JADX INFO: renamed from: r */
    public cwf0 f7690r;

    /* JADX INFO: renamed from: m */
    public final PurchaseType f7685m = PurchaseType.TYPE_GET_VIP;

    /* JADX INFO: renamed from: s */
    public final String f7691s = "video_purchase_dlg_timer";

    /* JADX INFO: renamed from: l.u6l0$a */
    public class C3438a extends er2 {
        public C3438a() {
        }

        public String pageId() {
            return "p_suggest_swipe_limit_popup";
        }
    }

    /* JADX INFO: renamed from: l.u6l0$b */
    public class C3439b extends qlw {

        /* JADX INFO: renamed from: e */
        public final d.a f7693e;

        /* JADX INFO: renamed from: f */
        public final String f7694f;

        public C3439b(Act act, PurchaseType purchaseType, d.a aVar, String str) {
            super(act, purchaseType);
            this.f7693e = aVar;
            this.f7694f = str;
        }

        /* JADX INFO: renamed from: c */
        public void m9688c() {
            super.c();
            u6l0.this.m9675n();
        }

        /* JADX INFO: renamed from: x */
        public Object[] m9689x() {
            try {
                if (NullChecker.a(this.f7693e.s())) {
                    Prices prices = this.f7693e.s().defaultStockKeepUnit.prices;
                    return new Object[]{"currency", prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f7694f, "platform", DeviceType.android};
                }
            } catch (Throwable th) {
                CrashHelper.c(new IllegalStateException("Failed to generate payment params", th));
            }
            return qlw.d;
        }
    }

    public u6l0(Act act, nt30 nt30Var) {
        this.f7682j = act;
        this.f7683k = nt30Var;
    }

    /* JADX INFO: renamed from: F */
    private void m9655F() {
        m9670C(15999L);
        CoreModule.c.t1.u("video_purchase_dlg_timer");
        CoreModule.c.t1.r(new c0.a().g("video_purchase_dlg_timer").a(true).f(mqi0.o() + 15999).d(this));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9656a(Throwable th) {
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m9679r(ProductCategory productCategory, List<Merchandise> list) {
        Iterator it = cjy.z(productCategory).a(this.f7682j, this.f7685m, productCategory, list).iterator();
        while (it.hasNext()) {
            d.a aVarB = ((d) it.next()).b();
            if (aVarB.w() == 1) {
                this.f7686n = aVarB.s().defaultStockKeepUnit.affiliateProducts.getProductId();
                this.f7687o = aVarB;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m9669B() {
        mrm.m8229o().m8235G();
        m9675n();
        mrm.m8229o().m8247w();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: C */
    public final void m9670C(long j) {
        String strC = hvc0.c(R.string.ac);
        VButton vButton = this.f7677e;
        if (j <= 0) {
            vButton.setText(strC);
            return;
        }
        vButton.setText(strC + " (" + (j / 1000) + "s)");
    }

    /* JADX INFO: renamed from: D */
    public final void m9671D(boolean z) {
        if (IntlCountryCodeController.g() ? (vdj.c() || nkp.b()) ? false : true : false) {
            this.f7678f.setVisibility(8);
        }
        xdl0.M(this.f7678f, !z);
        xdl0.M(this.f7679g, z);
        xdl0.E0(this.f7678f, new View.OnClickListener() { // from class: l.o6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6617a.m9680s(view);
            }
        });
        xdl0.E0(this.f7680h, new View.OnClickListener() { // from class: l.p6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6811a.m9681t(view);
            }
        });
        xdl0.E0(this.f7679g, new View.OnClickListener() { // from class: l.q6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6976a.m9683v(view);
            }
        });
        xdl0.E0(this.f7677e, new View.OnClickListener() { // from class: l.r6l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7132a.m9684w(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m9672E() {
        m9673G();
        com.p1.mobile.android.app.Dialog dialogZ = this.f7682j.dialog().M(f6c0.m2).B(false).L(v7c0.m).v().y0(s4e.f7273a).z();
        this.f7681i = dialogZ;
        m9674m(dialogZ.P());
        final boolean zY = u59.Y();
        if (!zY) {
            m9677p();
        }
        m9671D(zY);
        this.f7681i.show();
        this.f7681i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.i6l0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f4999a.m9685x(zY, dialogInterface);
            }
        });
        this.f7681i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.l6l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6123a.m9686y(dialogInterface);
            }
        });
        if (!mrm.m8229o().m8237l()) {
            mrm.m8229o().m8246v(false);
        }
        if (zY) {
            mrm.m8229o().m8250z();
            xdl0.c0(this.f7673a, 0);
            ImageView imageView = this.f7675c;
            int i = t100.x;
            xdl0.X(imageView, i);
            xdl0.X(this.f7676d, i);
            xdl0.X(this.f7677e, t100.v);
            xdl0.M(this.f7680h, false);
            xdl0.M(this.f7674b, true);
            this.f7677e.setBackgroundResource(x2c0.t);
            this.f7675c.setBackgroundResource(x2c0.e9);
            this.f7676d.setText(R.string.Zb);
            this.f7677e.setTextColor(hvc0.a(w0c0.D0));
            this.f7679g.setTextColor(hvc0.a(w0c0.f0));
            this.f7689q = this.f7682j.lifecycle().skip(1).subscribe(mkd0.H(new e30() { // from class: l.m6l0
                public final void call(Object obj) {
                    this.f6279a.m9687z((c) obj);
                }
            }, new e30() { // from class: l.n6l0
                public final void call(Object obj) {
                    u6l0.m9656a((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m9673G() {
        this.f7690r = new cwf0(new C3438a());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException unused) {
        }
        this.f7690r.o(jSONObject);
        i0e.f(this.f7690r);
    }

    /* JADX INFO: renamed from: m */
    public final void m9674m(View view) {
        v6l0.m9843a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m9675n() {
        m9676o();
        this.f7681i.dismiss();
        i0e.e(this.f7690r);
        if (NullChecker.a(this.f7684l) && !this.f7684l.isUnsubscribed()) {
            this.f7684l.unsubscribe();
            this.f7684l = null;
        }
        if (!NullChecker.a(this.f7688p) || this.f7688p.isUnsubscribed()) {
            return;
        }
        this.f7688p.unsubscribe();
        this.f7688p = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m9676o() {
        if (NullChecker.a(this.f7689q)) {
            mkd0.z(this.f7689q);
        }
        CoreModule.c.t1.u("video_purchase_dlg_timer");
    }

    /* JADX INFO: renamed from: p */
    public final void m9677p() {
        final ProductCategory productCategory = this.f7685m.productCategory();
        this.f7684l = rx.c.just(productCategory).flatMap(new w9j() { // from class: l.s6l0
            public final Object call(Object obj) {
                return CoreModule.c.j0.y5((ProductCategory) obj);
            }
        }).filter(new w9j() { // from class: l.t6l0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.j6l0
            public final Object call(Object obj) {
                return this.f5260a.m9678q((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.k6l0
            public final void call(Object obj) {
                this.f5617a.m9679r(productCategory, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ rx.c m9678q(List list) {
        return igj.m7194M(this.f7682j, list);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m9680s(View view) {
        mrm.m8229o().m8234F();
        hqo hqoVar = new hqo(this.f7682j, this.f7685m);
        hqoVar.t(new C3439b(this.f7682j, this.f7685m, this.f7687o, this.f7686n));
        PutongAct putongAct = this.f7682j;
        hqoVar.p(aqo.m5501h(putongAct, putongAct instanceof PutongAct ? putongAct.iap().i() : null), true, this.f7686n);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m9681t(View view) {
        m9675n();
    }

    /* JADX INFO: renamed from: u */
    public void m9682u(String str, long j, long j2, long j3, long j4) {
        long j5 = j3 - j;
        m9670C(j5);
        if (j5 <= 0) {
            m9669B();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m9683v(View view) {
        mrm.m8229o().m8249y();
        m9675n();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m9684w(View view) {
        m9669B();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m9685x(boolean z, DialogInterface dialogInterface) {
        if (z) {
            m9655F();
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m9686y(DialogInterface dialogInterface) {
        m9676o();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m9687z(c cVar) {
        if (cVar == c.i) {
            m9655F();
        } else if (cVar == c.k) {
            CoreModule.c.t1.u("video_purchase_dlg_timer");
        }
    }
}
