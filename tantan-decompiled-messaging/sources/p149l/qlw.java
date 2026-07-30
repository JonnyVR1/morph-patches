package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VButton;

/* JADX INFO: loaded from: classes11.dex */
public class qlw implements ue50 {

    /* JADX INFO: renamed from: d */
    public static final Object[] f155260d = new Object[0];

    /* JADX INFO: renamed from: a */
    public final Act f155261a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f155262b;

    /* JADX INFO: renamed from: c */
    public final f1m f155263c;

    public qlw(Act act, PurchaseType purchaseType, f1m f1mVar) {
        this.f155261a = act;
        this.f155262b = purchaseType;
        this.f155263c = f1mVar;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m175504d(List list) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m175506f(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m175507g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m175508h() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19561E0.m203789S3();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m175510j() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19643f1.m118077o4();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m175511k() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19643f1.m118077o4();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m175514n(dd80 dd80Var, View view) {
        o6j0.m162859c("e_privilege_activated_done_button", "p_privilege_activated", new o6j0.C18854a[0]);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m175517q(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m175523w() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.f17545c.f19554B2.m141782y3();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m175524z(PurchaseType purchaseType) {
        return sab0.m182905w(purchaseType) || sab0.m182901s(purchaseType) || sab0.m182899q(purchaseType) || sab0.m182904v(purchaseType);
    }

    @Override // p149l.ue50
    /* JADX INFO: renamed from: a */
    public void mo30845a() {
        if (NullChecker.m81303a(this.f155263c)) {
            this.f155263c.mo36057d();
        }
    }

    @Override // p149l.ue50
    /* JADX INFO: renamed from: b */
    public void mo46562b() {
        if (sab0.m182905w(this.f155262b)) {
            qib0.m174815e1("vip_purchase_complete_shown", new Object[0]);
        } else {
            PurchaseType purchaseType = this.f155262b;
            if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
                qib0.m174815e1("superlike_purchase_complete_shown", new Object[0]);
            } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
                qib0.m174815e1("svip_v1_boost_purchase_complete", new Object[0]);
            } else if (sab0.m182901s(purchaseType)) {
                qib0.m174815e1("see_purchase_complete_show", new Object[0]);
            }
        }
        qib0.m174815e1("order_paid", new Object[0]);
    }

    @Override // p149l.ue50
    /* JADX INFO: renamed from: c */
    public void mo30846c() {
        CoreModule.f17545c.f19639e0.m169397H9();
        if (!sab0.m182889g(this.f155262b)) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.wkw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
                }
            }, 200L);
        }
        if (sab0.m182899q(this.f155262b) || (CoreModule.m29935P().m94651a().mo33507h5() && (sab0.m182905w(this.f155262b) || sab0.m182899q(this.f155262b)))) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.ykw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m175511k();
                }
            }, 1000L);
        } else if (sab0.m182889g(this.f155262b)) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.zkw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m175508h();
                }
            }, 1000L);
        } else if (sab0.m182906x(this.f155262b)) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.alw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19555C0.m210112u4();
                }
            }, 1000L);
        } else if (sab0.m182898p(this.f155262b)) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.blw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19555C0.m210112u4();
                }
            }, 1000L);
        } else if (sab0.m182904v(this.f155262b)) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.clw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m175510j();
                }
            }, 1000L);
        } else if (sab0.m182890h(this.f155262b)) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.dlw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m175523w();
                }
            }, 1000L);
        }
        if (CoreModule.m29935P().m94651a().mo158371f() && (sab0.m182891i(this.f155262b) || sab0.m182892j(this.f155262b))) {
            CoreModule.f17545c.f19634c1.m137864N3();
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.elw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19643f1.m118076n4();
                }
            }, 1000L);
        } else if (g6a.m124557f() && sab0.m182897o(this.f155262b)) {
            CoreModule.f17545c.f19634c1.m137864N3();
        }
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.flw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19555C0.m210112u4();
                }
            }, 1000L);
        }
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.glw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19639e0.m169397H9();
                }
            }, 1000L);
        }
        PurchaseType purchaseType = PurchaseType.TYPE_GET_NON_LIVE_COIN;
        PurchaseType purchaseType2 = this.f155262b;
        if (purchaseType == purchaseType2 || PurchaseType.TYPE_INTL_TTT_COIN == purchaseType2) {
            ah60.m96376K(purchaseType2, "coin");
        }
        if (CoreModule.m29935P().m94651a().mo33583s3() && (sab0.m182891i(this.f155262b) || sab0.m182892j(this.f155262b) || sab0.m182896n(this.f155262b) || sab0.m182895m(this.f155262b))) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.hlw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19555C0.m210112u4();
                }
            }, 1000L);
            CoreModule.f17545c.f19654j0.m30593K5();
        }
        if (!IntlCountryCodeController.m28115k()) {
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
            PurchaseType purchaseType4 = this.f155262b;
            if (purchaseType3 == purchaseType4 || PurchaseType.TYPE_GET_LIKERS == purchaseType4 || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == purchaseType4 || PurchaseType.TYPE_ULTRA_PREMIUM == purchaseType4) {
                CoreModule.f17545c.f19654j0.m30605Q5();
            }
        }
        if (!NullChecker.m81303a(this.f155263c) || !this.f155263c.mo36058e()) {
            if (sab0.m182905w(this.f155262b)) {
                String str = null;
                ViewGroup viewGroup = (ViewGroup) this.f155261a.inflater().inflate(m6c0.f131528R2, (ViewGroup) null);
                ImageView imageView = (ImageView) viewGroup.findViewById(z4c0.f201508Z);
                TextView textView = (TextView) viewGroup.findViewById(z4c0.f201509Z0);
                VButton vButton = (VButton) viewGroup.findViewById(z4c0.f201484N);
                VButton vButton2 = (VButton) viewGroup.findViewById(z4c0.f201548m1);
                final cwf0 cwf0VarM133794c = i0e.m133794c("p_privilege_activated", Dialog.class.getName());
                Object[] objArrMo111721x = mo111721x();
                int iM200294H = vwb.m200294H(objArrMo111721x, "skuID");
                if (iM200294H >= 0 && iM200294H < objArrMo111721x.length) {
                    str = (String) objArrMo111721x[iM200294H + 1];
                }
                cwf0VarM133794c.m109040p(vwb.m200311Y("productType", "vip"), vwb.m200311Y("skuID", str));
                if (this.f155261a.isFinishing()) {
                    return;
                }
                final dd80 dd80VarM110989r0 = this.f155261a.newDialog().m110963R(viewGroup).m110986o0(new DialogInterface.OnShowListener() { // from class: l.ilw
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        i0e.m133797f(cwf0VarM133794c);
                    }
                }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jlw
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.m133796e(cwf0VarM133794c);
                    }
                }).m110989r0();
                imageView.setImageDrawable(this.f155261a.drawable(d3c0.f84050oc));
                textView.setText(R$string.f27342W9);
                vButton.setOnClickListener(new View.OnClickListener() { // from class: l.klw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qlw.m175514n(dd80VarM110989r0, view);
                    }
                });
                vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.llw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f128757a.m175525y(dd80VarM110989r0, view);
                    }
                });
                hpd0 hpd0Var = CoreModule.f17545c.f19654j0.f19288a0;
                Boolean bool = Boolean.FALSE;
                hpd0Var.put(bool);
                CoreModule.f17545c.f19654j0.f19289b0.put(bool);
            } else if (!sab0.m182889g(this.f155262b) && !sab0.m182892j(this.f155262b) && !sab0.m182898p(this.f155262b)) {
                if (sab0.m182906x(this.f155262b)) {
                    lsi0.m151595y("购买成功，立刻体验专属权益吧");
                } else {
                    lsi0.m151593w(R$string.f27420d7);
                }
            }
        }
        if (CoreModule.m29935P().m94651a().mo33442Xi()) {
            if (sab0.m182905w(this.f155262b)) {
                CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("vip"));
            } else if (sab0.m182901s(this.f155262b)) {
                CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("seeWhoLikedMe"));
            } else if (sab0.m182899q(this.f155262b)) {
                CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("svip"));
            }
        }
        if (m175524z(this.f155262b)) {
            CoreModule.f17545c.f19555C0.m210115x4().flatMap(new w9j() { // from class: l.mlw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19696x0.m30222v4();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.nlw
                @Override // p149l.e30
                public final void call(Object obj) {
                    qlw.m175504d((List) obj);
                }
            }, new e30() { // from class: l.olw
                @Override // p149l.e30
                public final void call(Object obj) {
                    qlw.m175507g((Throwable) obj);
                }
            }));
        } else {
            CoreModule.f17545c.f19555C0.m210115x4().subscribe(mkd0.m154956H(new e30() { // from class: l.plw
                @Override // p149l.e30
                public final void call(Object obj) {
                    qlw.m175506f((roj0) obj);
                }
            }, new e30() { // from class: l.xkw
                @Override // p149l.e30
                public final void call(Object obj) {
                    qlw.m175517q((Throwable) obj);
                }
            }));
        }
        if (PurchaseType.TYPE_INTL_DIAMOND == this.f155262b) {
            CoreModule.f17545c.f19573I0.m140262P3();
        }
    }

    /* JADX INFO: renamed from: x */
    public Object[] mo111721x() {
        return f155260d;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m175525y(dd80 dd80Var, View view) {
        o6j0.m162859c("e_privilege_activated_view_privilege_button", "p_privilege_activated", new o6j0.C18854a[0]);
        if (!CoreModule.m29935P().m94651a().mo33560pf(this.f155261a)) {
            this.f155261a.startActivity(CoreModule.m29935P().m94651a().mo33350K6(this.f155261a));
        }
        dd80Var.dismiss();
    }

    public qlw(Act act, PurchaseType purchaseType) {
        this(act, purchaseType, null);
    }
}
