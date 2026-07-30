package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VButton;

/* JADX INFO: loaded from: classes11.dex */
public class pow implements bn50 {

    /* JADX INFO: renamed from: d */
    public static final Object[] f153437d = new Object[0];

    /* JADX INFO: renamed from: a */
    public final Act f153438a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f153439b;

    /* JADX INFO: renamed from: c */
    public final y3m f153440c;

    public pow(Act act, PurchaseType purchaseType, y3m y3mVar) {
        this.f153438a = act;
        this.f153439b = purchaseType;
        this.f153440c = y3mVar;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m173115d(List list) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m173117f(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m173118g(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m173119h() {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20303E0.m141077S3();
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m173121j() {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        CoreModule.f18264c.f20385f1.m155915o4();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m173122k() {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20385f1.m155915o4();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m173125n(jl80 jl80Var, View view) {
        sfj0.m185596c("e_privilege_activated_done_button", "p_privilege_activated", new sfj0.C20032a[0]);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m173128q(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m173134w() {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.f18264c.f20296B2.m186430y3();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m173135z(PurchaseType purchaseType) {
        return wib0.m206579w(purchaseType) || wib0.m206575s(purchaseType) || wib0.m206573q(purchaseType) || wib0.m206578v(purchaseType);
    }

    @Override // p153l.bn50
    /* JADX INFO: renamed from: a */
    public void mo31848a() {
        if (NullChecker.m82486a(this.f153440c)) {
            this.f153440c.mo37060d();
        }
    }

    @Override // p153l.bn50
    /* JADX INFO: renamed from: b */
    public void mo47745b() {
        if (wib0.m206579w(this.f153439b)) {
            uqb0.m197269e1("vip_purchase_complete_shown", new Object[0]);
        } else {
            PurchaseType purchaseType = this.f153439b;
            if (purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE) {
                uqb0.m197269e1("superlike_purchase_complete_shown", new Object[0]);
            } else if (purchaseType == PurchaseType.TYPE_GET_BOOST) {
                uqb0.m197269e1("svip_v1_boost_purchase_complete", new Object[0]);
            } else if (wib0.m206575s(purchaseType)) {
                uqb0.m197269e1("see_purchase_complete_show", new Object[0]);
            }
        }
        uqb0.m197269e1("order_paid", new Object[0]);
    }

    @Override // p153l.bn50
    /* JADX INFO: renamed from: c */
    public void mo31849c() {
        CoreModule.f18264c.f20381e0.m116470H9();
        if (!wib0.m206563g(this.f153439b)) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.vnw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
                }
            }, 200L);
        }
        if (wib0.m206573q(this.f153439b) || (CoreModule.m30933P().m143405a().mo34510h5() && (wib0.m206579w(this.f153439b) || wib0.m206573q(this.f153439b)))) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.xnw
                @Override // java.lang.Runnable
                public final void run() {
                    pow.m173122k();
                }
            }, 1000L);
        } else if (wib0.m206563g(this.f153439b)) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.ynw
                @Override // java.lang.Runnable
                public final void run() {
                    pow.m173119h();
                }
            }, 1000L);
        } else if (wib0.m206580x(this.f153439b)) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.znw
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20297C0.m146425v4();
                }
            }, 1000L);
        } else if (wib0.m206572p(this.f153439b)) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.aow
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20297C0.m146425v4();
                }
            }, 1000L);
        } else if (wib0.m206578v(this.f153439b)) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.bow
                @Override // java.lang.Runnable
                public final void run() {
                    pow.m173121j();
                }
            }, 1000L);
        } else if (wib0.m206564h(this.f153439b)) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.cow
                @Override // java.lang.Runnable
                public final void run() {
                    pow.m173134w();
                }
            }, 1000L);
        }
        if (CoreModule.m30933P().m143405a().mo180463f() && (wib0.m206565i(this.f153439b) || wib0.m206566j(this.f153439b))) {
            CoreModule.f18264c.f20376c1.m197851N3();
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.dow
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20385f1.m155914n4();
                }
            }, 1000L);
        } else if (s7a.m184977f() && wib0.m206571o(this.f153439b)) {
            CoreModule.f18264c.f20376c1.m197851N3();
        }
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.eow
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20297C0.m146425v4();
                }
            }, 1000L);
        }
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.fow
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20381e0.m116470H9();
                }
            }, 1000L);
        }
        PurchaseType purchaseType = PurchaseType.TYPE_GET_NON_LIVE_COIN;
        PurchaseType purchaseType2 = this.f153439b;
        if (purchaseType == purchaseType2 || PurchaseType.TYPE_INTL_TTT_COIN == purchaseType2) {
            fp60.m126549K(purchaseType2, "coin");
        }
        if (CoreModule.m30933P().m143405a().mo34586s3() && (wib0.m206565i(this.f153439b) || wib0.m206566j(this.f153439b) || wib0.m206570n(this.f153439b) || wib0.m206569m(this.f153439b))) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.gow
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20297C0.m146425v4();
                }
            }, 1000L);
            CoreModule.f18264c.f20396j0.m31596K5();
        }
        if (!IntlCountryCodeController.m29114k()) {
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
            PurchaseType purchaseType4 = this.f153439b;
            if (purchaseType3 == purchaseType4 || PurchaseType.TYPE_GET_LIKERS == purchaseType4 || PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == purchaseType4 || PurchaseType.TYPE_ULTRA_PREMIUM == purchaseType4) {
                CoreModule.f18264c.f20396j0.m31608Q5();
            }
        }
        if (!NullChecker.m82486a(this.f153440c) || !this.f153440c.mo37061e()) {
            if (wib0.m206579w(this.f153439b)) {
                String str = null;
                ViewGroup viewGroup = (ViewGroup) this.f153438a.inflater().inflate(rec0.f162488R2, (ViewGroup) null);
                ImageView imageView = (ImageView) viewGroup.findViewById(fdc0.f98384Z);
                TextView textView = (TextView) viewGroup.findViewById(fdc0.f98385Z0);
                VButton vButton = (VButton) viewGroup.findViewById(fdc0.f98360N);
                VButton vButton2 = (VButton) viewGroup.findViewById(fdc0.f98424m1);
                final l4g0 l4g0VarM204399c = w1e.m204399c("p_privilege_activated", Dialog.class.getName());
                Object[] objArrMo115948x = mo115948x();
                int iM147477H = jyb.m147477H(objArrMo115948x, "skuID");
                if (iM147477H >= 0 && iM147477H < objArrMo115948x.length) {
                    str = (String) objArrMo115948x[iM147477H + 1];
                }
                l4g0VarM204399c.m152781p(jyb.m147494Y("productType", "vip"), jyb.m147494Y("skuID", str));
                if (this.f153438a.isFinishing()) {
                    return;
                }
                final jl80 jl80VarM146049r0 = this.f153438a.newDialog().m146023R(viewGroup).m146046o0(new DialogInterface.OnShowListener() { // from class: l.how
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        w1e.m204402f(l4g0VarM204399c);
                    }
                }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.iow
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        w1e.m204401e(l4g0VarM204399c);
                    }
                }).m146049r0();
                imageView.setImageDrawable(this.f153438a.drawable(jbc0.f119705oc));
                textView.setText(R$string.f28190W9);
                vButton.setOnClickListener(new View.OnClickListener() { // from class: l.jow
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pow.m173125n(jl80VarM146049r0, view);
                    }
                });
                vButton2.setOnClickListener(new View.OnClickListener() { // from class: l.kow
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f127805a.m173136y(jl80VarM146049r0, view);
                    }
                });
                jxd0 jxd0Var = CoreModule.f18264c.f20396j0.f20030a0;
                Boolean bool = Boolean.FALSE;
                jxd0Var.put(bool);
                CoreModule.f18264c.f20396j0.f20031b0.put(bool);
            } else if (!wib0.m206563g(this.f153439b) && !wib0.m206566j(this.f153439b) && !wib0.m206572p(this.f153439b)) {
                if (wib0.m206580x(this.f153439b)) {
                    o1j0.m165651y("购买成功，立刻体验专属权益吧");
                } else {
                    o1j0.m165649w(R$string.f28268d7);
                }
            }
        }
        if (CoreModule.m30933P().m143405a().mo34445Xi()) {
            if (wib0.m206579w(this.f153439b)) {
                CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("vip"));
            } else if (wib0.m206575s(this.f153439b)) {
                CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("seeWhoLikedMe"));
            } else if (wib0.m206573q(this.f153439b)) {
                CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("svip"));
            }
        }
        if (m173135z(this.f153439b)) {
            CoreModule.f18264c.f20297C0.m146428y4().flatMap(new qcj() { // from class: l.low
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20438x0.m31220v4();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.mow
                @Override // p153l.y20
                public final void call(Object obj) {
                    pow.m173115d((List) obj);
                }
            }, new y20() { // from class: l.now
                @Override // p153l.y20
                public final void call(Object obj) {
                    pow.m173118g((Throwable) obj);
                }
            }));
        } else {
            CoreModule.f18264c.f20297C0.m146428y4().subscribe(psd0.m173597H(new y20() { // from class: l.oow
                @Override // p153l.y20
                public final void call(Object obj) {
                    pow.m173117f((uxj0) obj);
                }
            }, new y20() { // from class: l.wnw
                @Override // p153l.y20
                public final void call(Object obj) {
                    pow.m173128q((Throwable) obj);
                }
            }));
        }
        if (PurchaseType.TYPE_INTL_DIAMOND == this.f153439b) {
            CoreModule.f18264c.f20315I0.m144059P3();
        }
    }

    /* JADX INFO: renamed from: x */
    public Object[] mo115948x() {
        return f153437d;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m173136y(jl80 jl80Var, View view) {
        sfj0.m185596c("e_privilege_activated_view_privilege_button", "p_privilege_activated", new sfj0.C20032a[0]);
        if (!CoreModule.m30933P().m143405a().mo34563pf(this.f153438a)) {
            this.f153438a.startActivity(CoreModule.m30933P().m143405a().mo34353K6(this.f153438a));
        }
        jl80Var.dismiss();
    }

    public pow(Act act, PurchaseType purchaseType) {
        this(act, purchaseType, null);
    }
}
