package p009l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.dd80;
import l.e30;
import l.e51;
import l.f1m;
import l.g6a;
import l.hpd0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.roj0;
import l.sab0;
import l.vwb;
import l.w9j;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qlw implements ue50 {

    /* JADX INFO: renamed from: d */
    public static final Object[] f19380d = new Object[0];

    /* JADX INFO: renamed from: a */
    public final Act f19381a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f19382b;

    /* JADX INFO: renamed from: c */
    public final f1m f19383c;

    public qlw(Act act, PurchaseType purchaseType, f1m f1mVar) {
        this.f19381a = act;
        this.f19382b = purchaseType;
        this.f19383c = f1mVar;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21087d(List list) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m21089f(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m21090g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m21091h() {
        CoreModule.c.C0.u4();
        CoreModule.c.E0.S3();
        CoreModule.c.e0.W9(CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m21093j() {
        CoreModule.c.C0.u4();
        CoreModule.c.e0.W9(CoreModule.H().userId());
        CoreModule.c.f1.o4();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m21094k() {
        CoreModule.c.C0.u4();
        CoreModule.c.f1.o4();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m21097n(dd80 dd80Var, View view) {
        o6j0.c("e_privilege_activated_done_button", "p_privilege_activated", new o6j0.a[0]);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m21100q(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m21106w() {
        CoreModule.c.C0.u4();
        CoreModule.c.f0.Fo();
        CoreModule.c.B2.y3();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m21107z(PurchaseType purchaseType) {
        return sab0.w(purchaseType) || sab0.s(purchaseType) || sab0.q(purchaseType) || sab0.v(purchaseType);
    }

    @Override // p009l.ue50
    /* JADX INFO: renamed from: a */
    public void mo21108a() {
        if (NullChecker.a(this.f19383c)) {
            this.f19383c.d();
        }
    }

    @Override // p009l.ue50
    /* JADX INFO: renamed from: b */
    public void mo21109b() {
        if (sab0.w(this.f19382b)) {
            qib0.e1("vip_purchase_complete_shown", new Object[0]);
        } else {
            PurchaseType purchaseType = this.f19382b;
            if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
                qib0.e1("superlike_purchase_complete_shown", new Object[0]);
            } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
                qib0.e1("svip_v1_boost_purchase_complete", new Object[0]);
            } else if (sab0.s(purchaseType)) {
                qib0.e1("see_purchase_complete_show", new Object[0]);
            }
        }
        qib0.e1("order_paid", new Object[0]);
    }

    @Override // p009l.ue50
    /* JADX INFO: renamed from: c */
    public void mo21110c() {
        CoreModule.c.e0.H9();
        if (!sab0.g(this.f19382b)) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.wkw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.e0.W9(CoreModule.H().userId());
                }
            }, 200L);
        }
        if (sab0.q(this.f19382b) || (CoreModule.P().a().h5() && (sab0.w(this.f19382b) || sab0.q(this.f19382b)))) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.ykw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m21094k();
                }
            }, 1000L);
        } else if (sab0.g(this.f19382b)) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.zkw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m21091h();
                }
            }, 1000L);
        } else if (sab0.x(this.f19382b)) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.alw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.C0.u4();
                }
            }, 1000L);
        } else if (sab0.p(this.f19382b)) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.blw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.C0.u4();
                }
            }, 1000L);
        } else if (sab0.v(this.f19382b)) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.clw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m21093j();
                }
            }, 1000L);
        } else if (sab0.h(this.f19382b)) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.dlw
                @Override // java.lang.Runnable
                public final void run() {
                    qlw.m21106w();
                }
            }, 1000L);
        }
        if (CoreModule.P().a().f() && (sab0.i(this.f19382b) || sab0.j(this.f19382b))) {
            CoreModule.c.c1.N3();
            e51.H(CoreModule.b, new Runnable() { // from class: l.elw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.f1.n4();
                }
            }, 1000L);
        } else if (g6a.f() && sab0.o(this.f19382b)) {
            CoreModule.c.c1.N3();
        }
        if (CoreModule.P().a().B()) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.flw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.C0.u4();
                }
            }, 1000L);
        }
        if (CoreModule.P().a().B()) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.glw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.e0.H9();
                }
            }, 1000L);
        }
        PurchaseType purchaseType = PurchaseType.TYPE_GET_NON_LIVE_COIN;
        PurchaseType purchaseType2 = this.f19382b;
        if (purchaseType == purchaseType2 || PurchaseType.TYPE_INTL_TTT_COIN == purchaseType2) {
            ah60.m11414K(purchaseType2, "coin");
        }
        if (CoreModule.P().a().s3() && (sab0.i(this.f19382b) || sab0.j(this.f19382b) || sab0.n(this.f19382b) || sab0.m(this.f19382b))) {
            e51.H(CoreModule.b, new Runnable() { // from class: l.hlw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.C0.u4();
                }
            }, 1000L);
            CoreModule.c.j0.K5();
        }
        if (!IntlCountryCodeController.k()) {
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
            PurchaseType purchaseType4 = this.f19382b;
            if (purchaseType3 == purchaseType4 || PurchaseType.TYPE_GET_LIKERS == purchaseType4 || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == purchaseType4 || PurchaseType.TYPE_ULTRA_PREMIUM == purchaseType4) {
                CoreModule.c.j0.Q5();
            }
        }
        if (!NullChecker.a(this.f19383c) || !this.f19383c.e()) {
            if (sab0.w(this.f19382b)) {
                String str = null;
                ViewGroup viewGroup = (ViewGroup) this.f19381a.inflater().inflate(m6c0.f16587R2, (ViewGroup) null);
                ImageView imageView = (ImageView) viewGroup.findViewById(z4c0.f23394Z);
                TextView textView = (TextView) viewGroup.findViewById(z4c0.f23395Z0);
                VButton vButtonFindViewById = viewGroup.findViewById(z4c0.f23370N);
                VButton vButtonFindViewById2 = viewGroup.findViewById(z4c0.f23434m1);
                final cwf0 cwf0VarM16062c = i0e.m16062c("p_privilege_activated", Dialog.class.getName());
                Object[] objArrM21111x = m21111x();
                int iH = vwb.H(objArrM21111x, "skuID");
                if (iH >= 0 && iH < objArrM21111x.length) {
                    str = (String) objArrM21111x[iH + 1];
                }
                cwf0VarM16062c.p(new j760[]{vwb.Y("productType", "vip"), vwb.Y("skuID", str)});
                if (this.f19381a.isFinishing()) {
                    return;
                }
                final dd80 dd80VarR0 = this.f19381a.newDialog().R(viewGroup).o0(new DialogInterface.OnShowListener() { // from class: l.ilw
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        i0e.m16065f(cwf0VarM16062c);
                    }
                }).n0(new DialogInterface.OnDismissListener() { // from class: l.jlw
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.m16064e(cwf0VarM16062c);
                    }
                }).r0();
                imageView.setImageDrawable(this.f19381a.drawable(d3c0.f11473oc));
                textView.setText(R$string.f6120W9);
                vButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.klw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qlw.m21097n(dd80VarR0, view);
                    }
                });
                vButtonFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.llw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16252a.m21112y(dd80VarR0, view);
                    }
                });
                hpd0 hpd0Var = CoreModule.c.j0.a0;
                Boolean bool = Boolean.FALSE;
                hpd0Var.put(bool);
                CoreModule.c.j0.b0.put(bool);
            } else if (!sab0.g(this.f19382b) && !sab0.j(this.f19382b) && !sab0.p(this.f19382b)) {
                if (sab0.x(this.f19382b)) {
                    lsi0.y("购买成功，立刻体验专属权益吧");
                } else {
                    lsi0.w(R$string.f6198d7);
                }
            }
        }
        if (CoreModule.P().a().Xi()) {
            if (sab0.w(this.f19382b)) {
                CoreModule.c.j0.N4(ProductCategory.get("vip"));
            } else if (sab0.s(this.f19382b)) {
                CoreModule.c.j0.N4(ProductCategory.get("seeWhoLikedMe"));
            } else if (sab0.q(this.f19382b)) {
                CoreModule.c.j0.N4(ProductCategory.get("svip"));
            }
        }
        if (m21107z(this.f19382b)) {
            CoreModule.c.C0.x4().flatMap(new w9j() { // from class: l.mlw
                public final Object call(Object obj) {
                    return CoreModule.c.x0.v4();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.nlw
                public final void call(Object obj) {
                    qlw.m21087d((List) obj);
                }
            }, new e30() { // from class: l.olw
                public final void call(Object obj) {
                    qlw.m21090g((Throwable) obj);
                }
            }));
        } else {
            CoreModule.c.C0.x4().subscribe(mkd0.H(new e30() { // from class: l.plw
                public final void call(Object obj) {
                    qlw.m21089f((roj0) obj);
                }
            }, new e30() { // from class: l.xkw
                public final void call(Object obj) {
                    qlw.m21100q((Throwable) obj);
                }
            }));
        }
        if (PurchaseType.TYPE_INTL_DIAMOND == this.f19382b) {
            CoreModule.c.I0.P3();
        }
    }

    /* JADX INFO: renamed from: x */
    public Object[] m21111x() {
        return f19380d;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m21112y(dd80 dd80Var, View view) {
        o6j0.c("e_privilege_activated_view_privilege_button", "p_privilege_activated", new o6j0.a[0]);
        if (!CoreModule.P().a().pf(this.f19381a)) {
            this.f19381a.startActivity(CoreModule.P().a().K6(this.f19381a));
        }
        dd80Var.dismiss();
    }

    public qlw(Act act, PurchaseType purchaseType) {
        this(act, purchaseType, null);
    }
}
