package p153l;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VButton;

/* JADX INFO: loaded from: classes3.dex */
public class yfl0 implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f199621a;

    /* JADX INFO: renamed from: b */
    public View f199622b;

    /* JADX INFO: renamed from: c */
    public ImageView f199623c;

    /* JADX INFO: renamed from: d */
    public TextView f199624d;

    /* JADX INFO: renamed from: e */
    public VButton f199625e;

    /* JADX INFO: renamed from: f */
    public VButton f199626f;

    /* JADX INFO: renamed from: g */
    public VButton f199627g;

    /* JADX INFO: renamed from: h */
    public ImageView f199628h;

    /* JADX INFO: renamed from: i */
    public Dialog f199629i;

    /* JADX INFO: renamed from: j */
    public final Act f199630j;

    /* JADX INFO: renamed from: k */
    public final b240 f199631k;

    /* JADX INFO: renamed from: l */
    public kcg0 f199632l;

    /* JADX INFO: renamed from: n */
    public String f199634n;

    /* JADX INFO: renamed from: o */
    public C8928d.a f199635o;

    /* JADX INFO: renamed from: p */
    public kcg0 f199636p;

    /* JADX INFO: renamed from: q */
    public kcg0 f199637q;

    /* JADX INFO: renamed from: r */
    public l4g0 f199638r;

    /* JADX INFO: renamed from: m */
    public final PurchaseType f199633m = PurchaseType.TYPE_GET_VIP;

    /* JADX INFO: renamed from: s */
    public final String f199639s = "video_purchase_dlg_timer";

    /* JADX INFO: renamed from: l.yfl0$a */
    public class C21575a extends ur2 {
        public C21575a() {
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_suggest_swipe_limit_popup";
        }
    }

    /* JADX INFO: renamed from: l.yfl0$b */
    public class C21576b extends pow {

        /* JADX INFO: renamed from: e */
        public final C8928d.a f199641e;

        /* JADX INFO: renamed from: f */
        public final String f199642f;

        public C21576b(Act act, PurchaseType purchaseType, C8928d.a aVar, String str) {
            super(act, purchaseType);
            this.f199641e = aVar;
            this.f199642f = str;
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            super.mo31849c();
            yfl0.this.m215771n();
        }

        @Override // p153l.pow
        /* JADX INFO: renamed from: x */
        public Object[] mo115948x() {
            try {
                if (NullChecker.m82486a(this.f199641e.m54784s())) {
                    Prices prices = this.f199641e.m54784s().defaultStockKeepUnit.prices;
                    return new Object[]{FirebaseAnalytics.Param.CURRENCY, prices.currencyCode, "value", Double.valueOf(prices.price), "skuID", this.f199642f, "platform", "android"};
                }
            } catch (Throwable th) {
                CrashHelper.m82479c(new IllegalStateException("Failed to generate payment params", th));
            }
            return pow.f153437d;
        }
    }

    public yfl0(Act act, b240 b240Var) {
        this.f199630j = act;
        this.f199631k = b240Var;
    }

    /* JADX INFO: renamed from: F */
    private void m215751F() {
        m215766C(15999L);
        CoreModule.f18264c.f20427t1.m32519u("video_purchase_dlg_timer");
        CoreModule.f18264c.f20427t1.m32516r(new RunnableC4884c0.a().m32526g("video_purchase_dlg_timer").m32520a(true).m32525f(pzi0.m174454o() + 15999).m32523d(this));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m215752a(Throwable th) {
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m215775r(ProductCategory productCategory, List<Merchandise> list) {
        Iterator<C8928d> it = zry.m221275z(productCategory).mo147671a(this.f199630j, this.f199633m, productCategory, list).iterator();
        while (it.hasNext()) {
            C8928d.a aVarM54703b = it.next().m54703b();
            if (aVarM54703b.m54788w() == 1) {
                this.f199634n = aVarM54703b.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId();
                this.f199635o = aVarM54703b;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m215765B() {
        otm.m169137o().m169143G();
        m215771n();
        otm.m169137o().m169155w();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: C */
    public final void m215766C(long j) {
        String strM148007c = k3d0.m148007c(R$string.f19551pc);
        VButton vButton = this.f199625e;
        if (j <= 0) {
            vButton.setText(strM148007c);
            return;
        }
        vButton.setText(strM148007c + " (" + (j / 1000) + "s)");
    }

    /* JADX INFO: renamed from: D */
    public final void m215767D(boolean z) {
        if (IntlCountryCodeController.m29110g() ? (pgj.m172246c() || nmp.m163833b()) ? false : true : false) {
            this.f199626f.setVisibility(8);
        }
        bnl0.m105524M(this.f199626f, !z);
        bnl0.m105524M(this.f199627g, z);
        bnl0.m105509E0(this.f199626f, new View.OnClickListener() { // from class: l.sfl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167727a.m215776s(view);
            }
        });
        bnl0.m105509E0(this.f199628h, new View.OnClickListener() { // from class: l.tfl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173980a.m215777t(view);
            }
        });
        bnl0.m105509E0(this.f199627g, new View.OnClickListener() { // from class: l.ufl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178787a.m215778v(view);
            }
        });
        bnl0.m105509E0(this.f199625e, new View.OnClickListener() { // from class: l.vfl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183954a.m215779w(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m215768E() {
        m215769G();
        com.p051p1.mobile.android.app.Dialog dialogM21566z = this.f199630j.dialog().m21516M(kec0.f125942m2).m21495B(false).m21515L(agc0.f71127m).m21558v().m21565y0(g6e.f102427a).m21566z();
        this.f199629i = dialogM21566z;
        m215770m(dialogM21566z.m21457P());
        final boolean zM114667Z = d79.m114667Z();
        if (!zM114667Z) {
            m215773p();
        }
        m215767D(zM114667Z);
        this.f199629i.show();
        this.f199629i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.mfl0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f136656a.m215780x(zM114667Z, dialogInterface);
            }
        });
        this.f199629i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pfl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f152195a.m215781y(dialogInterface);
            }
        });
        if (!otm.m169137o().m169145l()) {
            otm.m169137o().m169154v(false);
        }
        if (zM114667Z) {
            otm.m169137o().m169158z();
            bnl0.m105548c0(this.f199621a, 0);
            ImageView imageView = this.f199623c;
            int i = qa00.f156337x;
            bnl0.m105540X(imageView, i);
            bnl0.m105540X(this.f199624d, i);
            bnl0.m105540X(this.f199625e, qa00.f156335v);
            bnl0.m105524M(this.f199628h, false);
            bnl0.m105524M(this.f199622b, true);
            this.f199625e.setBackgroundResource(dbc0.f87465u);
            this.f199623c.setBackgroundResource(dbc0.f86982f9);
            this.f199624d.setText(R$string.f19520oc);
            this.f199625e.setTextColor(k3d0.m148005a(c9c0.f80331E0));
            this.f199627g.setTextColor(k3d0.m148005a(c9c0.f80419g0));
            this.f199637q = this.f199630j.lifecycle().skip(1).subscribe(psd0.m173597H(new y20() { // from class: l.qfl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f157312a.m215782z((C4470c) obj);
                }
            }, new y20() { // from class: l.rfl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    yfl0.m215752a((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m215769G() {
        this.f199638r = new l4g0(new C21575a());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException unused) {
        }
        this.f199638r.m152780o(jSONObject);
        w1e.m204402f(this.f199638r);
    }

    /* JADX INFO: renamed from: m */
    public final void m215770m(View view) {
        zfl0.m219544a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m215771n() {
        m215772o();
        this.f199629i.dismiss();
        w1e.m204401e(this.f199638r);
        if (NullChecker.m82486a(this.f199632l) && !this.f199632l.isUnsubscribed()) {
            this.f199632l.unsubscribe();
            this.f199632l = null;
        }
        if (!NullChecker.m82486a(this.f199636p) || this.f199636p.isUnsubscribed()) {
            return;
        }
        this.f199636p.unsubscribe();
        this.f199636p = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m215772o() {
        if (NullChecker.m82486a(this.f199637q)) {
            psd0.m173633z(this.f199637q);
        }
        CoreModule.f18264c.f20427t1.m32519u("video_purchase_dlg_timer");
    }

    /* JADX INFO: renamed from: p */
    public final void m215773p() {
        final ProductCategory productCategory = this.f199633m.productCategory();
        this.f199632l = C22421c.just(productCategory).flatMap(new qcj() { // from class: l.wfl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20396j0.m31647y5((ProductCategory) obj);
            }
        }).filter(new qcj() { // from class: l.xfl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.nfl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141744a.m215774q((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ofl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147089a.m215775r(productCategory, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C22421c m215774q(List list) {
        return cjj.m110205M(this.f199630j, list);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m215776s(View view) {
        otm.m169137o().m169142F();
        hso hsoVar = new hso(this.f199630j, this.f199633m);
        hsoVar.m137011t(new C21576b(this.f199630j, this.f199633m, this.f199635o, this.f199634n));
        Act act = this.f199630j;
        hsoVar.m137007p(aso.m99953h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m103295i() : null), true, this.f199634n);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m215777t(View view) {
        m215771n();
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        long j5 = j3 - j;
        m215766C(j5);
        if (j5 <= 0) {
            m215765B();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m215778v(View view) {
        otm.m169137o().m169157y();
        m215771n();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m215779w(View view) {
        m215765B();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m215780x(boolean z, DialogInterface dialogInterface) {
        if (z) {
            m215751F();
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m215781y(DialogInterface dialogInterface) {
        m215772o();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m215782z(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m215751F();
        } else if (c4470c == C4470c.f16269k) {
            CoreModule.f18264c.f20427t1.m32519u("video_purchase_dlg_timer");
        }
    }
}
