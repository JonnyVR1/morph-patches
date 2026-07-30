package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUiGPPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUiGPPurchaseUpgradeSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUiGPPurchaseUpgradeTip;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.agreement.AgreementComponent;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import l.c4g0;
import l.d6n;
import l.e30;
import l.g30;
import l.j760;
import l.jo0;
import l.m6c0;
import l.mkd0;
import l.o7r;
import l.ogj;
import l.t100;
import l.vwb;
import l.xdl0;
import rx.subjects.a;
import rx.subjects.b;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class id40 extends mp0 {

    /* JADX INFO: renamed from: E */
    public static a<Integer> f14364E = a.b();

    /* JADX INFO: renamed from: F */
    public static b<Unit> f14365F = b.b();

    /* JADX INFO: renamed from: A */
    public NewUiGPPurchaseUpgradeTip f14366A;

    /* JADX INFO: renamed from: B */
    public List<d> f14367B;

    /* JADX INFO: renamed from: C */
    public boolean f14368C;

    /* JADX INFO: renamed from: D */
    public boolean f14369D;

    /* JADX INFO: renamed from: p */
    public PurchaseType f14370p;

    /* JADX INFO: renamed from: q */
    public String f14371q;

    /* JADX INFO: renamed from: r */
    public c4g0 f14372r;

    /* JADX INFO: renamed from: s */
    public int f14373s;

    /* JADX INFO: renamed from: t */
    public int f14374t;

    /* JADX INFO: renamed from: u */
    public int f14375u;

    /* JADX INFO: renamed from: v */
    public int f14376v;

    /* JADX INFO: renamed from: w */
    public c4g0 f14377w;

    /* JADX INFO: renamed from: x */
    public c4g0 f14378x;

    /* JADX INFO: renamed from: y */
    public View f14379y;

    /* JADX INFO: renamed from: z */
    public NewUiGPPurchaseUpgradeSectionView f14380z;

    public id40(Act act, PurchaseType purchaseType, String str) {
        super(act, purchaseType);
        this.f14373s = -1;
        this.f14374t = -1;
        this.f14375u = -1;
        this.f14376v = -1;
        this.f14369D = false;
        this.f14370p = purchaseType;
        this.f14371q = str;
    }

    /* JADX INFO: renamed from: Y */
    private void m16591Y() {
        mkd0.z(this.f14377w);
        this.f14377w = this.f17158a.duringCreated(f14364E).subscribe(mkd0.G(new e30() { // from class: l.hd40
            public final void call(Object obj) {
                this.f13836a.m16602U((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    private void m16592Z(final List<d> list) {
        if (!h6a.m16049c() && CoreModule.m1854P().m11706a().m5379Xi() && PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f14370p) {
            mkd0.z(this.f14372r);
            this.f14372r = this.f17158a.duringCreated(ogj.c().b.observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.gd40
                public final void call(Object obj) {
                    this.f13220a.m16603V(list, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m16593b0() {
        NewUiGPPurchaseUpgradeTip newUiGPPurchaseUpgradeTip;
        if (!vwb.J(this.f14367B) && (newUiGPPurchaseUpgradeTip = this.f14366A) != null) {
            newUiGPPurchaseUpgradeTip.m7705Q(this.f14367B);
        }
        m16612g0(this.f14368C);
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: E */
    public void mo16596E(d dVar) {
        super.mo16596E(dVar);
        if (this.f14380z == null || vwb.J(this.f14367B) || !this.f14368C) {
            return;
        }
        this.f14368C = false;
        this.f14380z.m7701l(false);
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: F */
    public void mo16597F(AbsPurchaseSectionView absPurchaseSectionView, d dVar, boolean z) {
        d.a aVarB = dVar.m() ? dVar.b() : dVar.d();
        if (aVarB != null) {
            absPurchaseSectionView.m7660b(z, dVar.m(), aVarB, null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m16598Q() {
        mkd0.z(this.f14378x);
        this.f14378x = this.f17158a.duringCreated(f14365F).subscribe(mkd0.G(new e30() { // from class: l.ed40
            public final void call(Object obj) {
                this.f11082a.m16601T((Unit) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public View m16599R(ViewGroup viewGroup) {
        if (this.f14380z == null) {
            this.f14380z = (NewUiGPPurchaseUpgradeSectionView) o7r.a(this.f17158a).inflate(m6c0.m0, viewGroup, false);
        }
        return this.f14380z;
    }

    /* JADX INFO: renamed from: S */
    public View m16600S(ViewGroup viewGroup) {
        if (this.f14366A == null) {
            this.f14366A = (NewUiGPPurchaseUpgradeTip) o7r.a(this.f17158a).inflate(m6c0.n0, viewGroup, false);
        }
        return this.f14366A;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m16601T(Unit unit) {
        List<d> list;
        if (vwb.J(this.f14367B) || this.f14380z == null || this.f14368C || (list = this.f17164g) == null) {
            return;
        }
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            it.next().v(false);
        }
        d dVar = this.f14367B.get(0);
        for (d dVar2 : this.f14367B) {
            if (dVar2.l()) {
                dVar = dVar2;
                break;
            }
        }
        CoreModule.f1534c.f3558G2.f9577V.onNext(j760.a(this.f14370p, dVar));
        if (NullChecker.a(this.f17162e)) {
            this.f17162e.call(dVar);
        }
        this.f14368C = true;
        m19490m(false);
        this.f14380z.m7701l(true);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m16602U(Integer num) {
        List<d> list = this.f17164g;
        if (list == null || list.size() <= num.intValue()) {
            return;
        }
        d dVar = this.f17164g.get(num.intValue());
        d.a aVarB = dVar.m() ? dVar.b() : dVar.d();
        if (NullChecker.a(aVarB)) {
            aVarB.e0("");
        }
        if (dVar.l()) {
            m19489L(dVar);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m16603V(List list, Integer num) {
        int iIntValue = num.intValue();
        d dVar = null;
        int i = 0;
        while (i < list.size()) {
            d dVar2 = (d) list.get(i);
            dVar2.v(i == iIntValue);
            dVar2.q(i == iIntValue);
            if (i == iIntValue) {
                dVar = dVar2;
            }
            i++;
        }
        if (dVar != null) {
            m19489L(dVar);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m16604W(Boolean bool, d dVar, Boolean bool2) {
        if (bool2.booleanValue()) {
            if (NullChecker.a(this.f17162e)) {
                this.f17162e.call(dVar);
                return;
            }
            return;
        }
        if (this.f14368C) {
            if (NullChecker.a(this.f17163f)) {
                this.f17163f.call(dVar);
                return;
            }
            return;
        }
        List<d> list = this.f17164g;
        if (list != null) {
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                it.next().v(false);
            }
        }
        if (NullChecker.a(this.f17162e)) {
            this.f17162e.call(dVar);
        }
        this.f14368C = true;
        m19490m(false);
        this.f14380z.m7701l(true);
    }

    /* JADX INFO: renamed from: X */
    public void m16605X(List<d> list, e30<d> e30Var, e30<Integer> e30Var2, e30<d> e30Var3, List<d> list2) {
        super.mo13102f(list, e30Var, e30Var2, e30Var3);
        this.f14367B = list2;
        if (vwb.J(list2)) {
            this.f14368C = false;
        }
        if (!this.f14369D) {
            this.f14369D = true;
            if (!vwb.J(list2) && !TEnum.equals(list.get(0).c().category, "tttSvipGoogleplayFreeTrial")) {
                Iterator<d> it = list.iterator();
                while (it.hasNext()) {
                    it.next().v(false);
                }
                this.f14368C = true;
                CoreModule.f1534c.f3558G2.f9577V.onNext(j760.a(this.f14370p, list2.get(0)));
            }
        }
        m16592Z(list);
        m16591Y();
        m16606a0();
        m16593b0();
        m16598Q();
    }

    @Override // p006l.mp0, p006l.c3m
    /* JADX INFO: renamed from: a */
    public View mo13098a(ViewGroup viewGroup, boolean z) {
        LinearLayout linearLayout = new LinearLayout(this.f17158a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        linearLayout.addView(m19483B(m16599R(linearLayout)));
        linearLayout.addView(m19483B(m19492q()));
        linearLayout.addView(m19483B(m16600S(linearLayout)));
        xdl0.M(this.f14380z, false);
        m16612g0(false);
        return linearLayout;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m16606a0() {
        if (this.f14380z == null) {
            return;
        }
        boolean zJ = vwb.J(this.f14367B);
        NewUiGPPurchaseUpgradeSectionView newUiGPPurchaseUpgradeSectionView = this.f14380z;
        if (zJ) {
            xdl0.M(newUiGPPurchaseUpgradeSectionView, false);
        } else {
            xdl0.M(newUiGPPurchaseUpgradeSectionView, true);
            this.f14380z.m7702m(this.f14370p, this.f14368C, this.f14367B, new g30() { // from class: l.fd40
                /* JADX INFO: renamed from: a */
                public final void m15308a(Object obj, Object obj2, Object obj3) {
                    this.f12658a.m16604W((Boolean) obj, (d) obj2, (Boolean) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m16607c0(int i) {
        this.f14376v = i;
    }

    @Override // p006l.xhe0
    /* JADX INFO: renamed from: d */
    public AgreementComponent mo16608d() {
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m16609d0(int i) {
        this.f14374t = i;
    }

    /* JADX INFO: renamed from: e0 */
    public void m16610e0(int i, int i2, int i3, int i4) {
        this.f14374t = i;
        this.f14373s = i2;
        this.f14375u = i3;
        this.f14376v = i4;
    }

    @Override // p006l.mp0, p006l.c3m
    /* JADX INFO: renamed from: f */
    public void mo13102f(List<d> list, e30<d> e30Var, e30<Integer> e30Var2, e30<d> e30Var3) {
        m16605X(list, e30Var, e30Var2, e30Var3, null);
    }

    /* JADX INFO: renamed from: f0 */
    public void m16611f0(int i) {
        this.f14375u = i;
    }

    /* JADX INFO: renamed from: g0 */
    public void m16612g0(boolean z) {
        VLinear vLinear = this.f14366A;
        if (vLinear != null) {
            xdl0.M(vLinear, z);
        }
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: o */
    public AbsPurchaseSectionView mo16613o(d dVar, ViewGroup viewGroup) {
        NewUiGPPurchaseSectionView newUiGPPurchaseSectionView = (NewUiGPPurchaseSectionView) o7r.a(this.f17158a).inflate(m6c0.l0, viewGroup, false);
        newUiGPPurchaseSectionView.setFrom(this.f14371q);
        return newUiGPPurchaseSectionView;
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: p */
    public View mo16614p() {
        if (this.f14379y == null) {
            this.f14379y = m19483B(new d6n(this.f17158a).b());
        }
        return this.f14379y;
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: r */
    public int mo16615r() {
        return this.f14376v;
    }

    @Override // p006l.mp0, p006l.c3m
    public void release() {
        super.release();
        mkd0.z(this.f14372r);
        mkd0.z(this.f14377w);
        mkd0.z(this.f14378x);
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: s */
    public int mo16616s() {
        return (ura.m25555e().m25559d().m5847qq() && TextUtils.equals(this.f14371q, "form_sub")) ? t100.i : super.mo16616s();
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: t */
    public int mo16617t() {
        int i = this.f14374t;
        return i != -1 ? i : super.mo16617t();
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: v */
    public int mo16618v() {
        int i = this.f14375u;
        return i != -1 ? i : super.mo16618v();
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: w */
    public int mo16619w() {
        int i = this.f14373s;
        return i >= 0 ? i : super.mo16619w();
    }

    public id40(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f14373s = -1;
        this.f14374t = -1;
        this.f14375u = -1;
        this.f14376v = -1;
        this.f14369D = false;
        this.f14370p = purchaseType;
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: D */
    public void mo16595D() {
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: b */
    public void mo13099b() {
    }

    @Override // p006l.mp0
    /* JADX INFO: renamed from: C */
    public void mo16594C(d dVar) {
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: c */
    public void mo13100c(b90 b90Var) {
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: e */
    public void mo13101e(PayMethod payMethod) {
    }
}
