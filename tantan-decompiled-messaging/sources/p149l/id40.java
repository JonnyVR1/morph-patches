package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.AgreementComponent;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.NewUiGPPurchaseSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.NewUiGPPurchaseUpgradeSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.NewUiGPPurchaseUpgradeTip;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class id40 extends mp0 {

    /* JADX INFO: renamed from: E */
    public static C22392a<Integer> f112518E = C22392a.m221512b();

    /* JADX INFO: renamed from: F */
    public static C22393b<Unit> f112519F = C22393b.m221521b();

    /* JADX INFO: renamed from: A */
    public NewUiGPPurchaseUpgradeTip f112520A;

    /* JADX INFO: renamed from: B */
    public List<C8765d> f112521B;

    /* JADX INFO: renamed from: C */
    public boolean f112522C;

    /* JADX INFO: renamed from: D */
    public boolean f112523D;

    /* JADX INFO: renamed from: p */
    public PurchaseType f112524p;

    /* JADX INFO: renamed from: q */
    public String f112525q;

    /* JADX INFO: renamed from: r */
    public c4g0 f112526r;

    /* JADX INFO: renamed from: s */
    public int f112527s;

    /* JADX INFO: renamed from: t */
    public int f112528t;

    /* JADX INFO: renamed from: u */
    public int f112529u;

    /* JADX INFO: renamed from: v */
    public int f112530v;

    /* JADX INFO: renamed from: w */
    public c4g0 f112531w;

    /* JADX INFO: renamed from: x */
    public c4g0 f112532x;

    /* JADX INFO: renamed from: y */
    public View f112533y;

    /* JADX INFO: renamed from: z */
    public NewUiGPPurchaseUpgradeSectionView f112534z;

    public id40(Act act, PurchaseType purchaseType, String str) {
        super(act, purchaseType);
        this.f112527s = -1;
        this.f112528t = -1;
        this.f112529u = -1;
        this.f112530v = -1;
        this.f112523D = false;
        this.f112524p = purchaseType;
        this.f112525q = str;
    }

    /* JADX INFO: renamed from: Y */
    private void m135396Y() {
        mkd0.m154992z(this.f112531w);
        this.f112531w = this.f134966a.duringCreated(f112518E).subscribe(mkd0.m154955G(new e30() { // from class: l.hd40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107212a.m135407U((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    private void m135397Z(final List<C8765d> list) {
        if (!h6a.m129470c() && CoreModule.m29935P().m94651a().mo33442Xi() && PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f112524p) {
            mkd0.m154992z(this.f112526r);
            this.f112526r = this.f134966a.duringCreated(ogj.m164200c().f143865b.observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.gd40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f102080a.m135408V(list, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m135398b0() {
        NewUiGPPurchaseUpgradeTip newUiGPPurchaseUpgradeTip;
        if (!vwb.m200296J(this.f112521B) && (newUiGPPurchaseUpgradeTip = this.f112520A) != null) {
            newUiGPPurchaseUpgradeTip.m54370Q(this.f112521B);
        }
        m135417g0(this.f112522C);
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: E */
    public void mo135401E(C8765d c8765d) {
        super.mo135401E(c8765d);
        if (this.f112534z == null || vwb.m200296J(this.f112521B) || !this.f112522C) {
            return;
        }
        this.f112522C = false;
        this.f112534z.m54366l(false);
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: F */
    public void mo135402F(AbsPurchaseSectionView absPurchaseSectionView, C8765d c8765d, boolean z) {
        C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        if (aVarM53520b != null) {
            absPurchaseSectionView.m54325b(z, c8765d.m53531m(), aVarM53520b, null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m135403Q() {
        mkd0.m154992z(this.f112532x);
        this.f112532x = this.f134966a.duringCreated(f112519F).subscribe(mkd0.m154955G(new e30() { // from class: l.ed40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90589a.m135406T((Unit) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public View m135404R(ViewGroup viewGroup) {
        if (this.f112534z == null) {
            this.f112534z = (NewUiGPPurchaseUpgradeSectionView) o7r.m163037a(this.f134966a).inflate(m6c0.f131618m0, viewGroup, false);
        }
        return this.f112534z;
    }

    /* JADX INFO: renamed from: S */
    public View m135405S(ViewGroup viewGroup) {
        if (this.f112520A == null) {
            this.f112520A = (NewUiGPPurchaseUpgradeTip) o7r.m163037a(this.f134966a).inflate(m6c0.f131622n0, viewGroup, false);
        }
        return this.f112520A;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m135406T(Unit unit) {
        List<C8765d> list;
        if (vwb.m200296J(this.f112521B) || this.f112534z == null || this.f112522C || (list = this.f134972g) == null) {
            return;
        }
        Iterator<C8765d> it = list.iterator();
        while (it.hasNext()) {
            it.next().m53540v(false);
        }
        C8765d c8765d = this.f112521B.get(0);
        for (C8765d c8765d2 : this.f112521B) {
            if (c8765d2.m53530l()) {
                c8765d = c8765d2;
                break;
            }
        }
        CoreModule.f17545c.f19569G2.f80121V.onNext(j760.m140076a(this.f112524p, c8765d));
        if (NullChecker.m81303a(this.f134970e)) {
            this.f134970e.call(c8765d);
        }
        this.f112522C = true;
        m155743m(false);
        this.f112534z.m54366l(true);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m135407U(Integer num) {
        List<C8765d> list = this.f134972g;
        if (list == null || list.size() <= num.intValue()) {
            return;
        }
        C8765d c8765d = this.f134972g.get(num.intValue());
        C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        if (NullChecker.m81303a(aVarM53520b)) {
            aVarM53520b.m53578e0("");
        }
        if (c8765d.m53530l()) {
            m155742L(c8765d);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m135408V(List list, Integer num) {
        int iIntValue = num.intValue();
        C8765d c8765d = null;
        int i = 0;
        while (i < list.size()) {
            C8765d c8765d2 = (C8765d) list.get(i);
            c8765d2.m53540v(i == iIntValue);
            c8765d2.m53535q(i == iIntValue);
            if (i == iIntValue) {
                c8765d = c8765d2;
            }
            i++;
        }
        if (c8765d != null) {
            m155742L(c8765d);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m135409W(Boolean bool, C8765d c8765d, Boolean bool2) {
        if (bool2.booleanValue()) {
            if (NullChecker.m81303a(this.f134970e)) {
                this.f134970e.call(c8765d);
                return;
            }
            return;
        }
        if (this.f112522C) {
            if (NullChecker.m81303a(this.f134971f)) {
                this.f134971f.call(c8765d);
                return;
            }
            return;
        }
        List<C8765d> list = this.f134972g;
        if (list != null) {
            Iterator<C8765d> it = list.iterator();
            while (it.hasNext()) {
                it.next().m53540v(false);
            }
        }
        if (NullChecker.m81303a(this.f134970e)) {
            this.f134970e.call(c8765d);
        }
        this.f112522C = true;
        m155743m(false);
        this.f112534z.m54366l(true);
    }

    /* JADX INFO: renamed from: X */
    public void m135410X(List<C8765d> list, e30<C8765d> e30Var, e30<Integer> e30Var2, e30<C8765d> e30Var3, List<C8765d> list2) {
        super.mo105096f(list, e30Var, e30Var2, e30Var3);
        this.f112521B = list2;
        if (vwb.m200296J(list2)) {
            this.f112522C = false;
        }
        if (!this.f112523D) {
            this.f112523D = true;
            if (!vwb.m200296J(list2) && !TEnum.equals(list.get(0).m53521c().category, ProductCategory.tttSvipGoogleplayFreeTrial)) {
                Iterator<C8765d> it = list.iterator();
                while (it.hasNext()) {
                    it.next().m53540v(false);
                }
                this.f112522C = true;
                CoreModule.f17545c.f19569G2.f80121V.onNext(j760.m140076a(this.f112524p, list2.get(0)));
            }
        }
        m135397Z(list);
        m135396Y();
        m135411a0();
        m135398b0();
        m135403Q();
    }

    @Override // p149l.mp0, p149l.c3m
    /* JADX INFO: renamed from: a */
    public View mo105092a(ViewGroup viewGroup, boolean z) {
        LinearLayout linearLayout = new LinearLayout(this.f134966a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        linearLayout.addView(m155736B(m135404R(linearLayout)));
        linearLayout.addView(m155736B(m155745q()));
        linearLayout.addView(m155736B(m135405S(linearLayout)));
        xdl0.m208344M(this.f112534z, false);
        m135417g0(false);
        return linearLayout;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m135411a0() {
        if (this.f112534z == null) {
            return;
        }
        boolean zM200296J = vwb.m200296J(this.f112521B);
        NewUiGPPurchaseUpgradeSectionView newUiGPPurchaseUpgradeSectionView = this.f112534z;
        if (zM200296J) {
            xdl0.m208344M(newUiGPPurchaseUpgradeSectionView, false);
        } else {
            xdl0.m208344M(newUiGPPurchaseUpgradeSectionView, true);
            this.f112534z.m54367m(this.f112524p, this.f112522C, this.f112521B, new g30() { // from class: l.fd40
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f96955a.m135409W((Boolean) obj, (C8765d) obj2, (Boolean) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m135412c0(int i) {
        this.f112530v = i;
    }

    @Override // p149l.xhe0
    /* JADX INFO: renamed from: d */
    public AgreementComponent mo135413d() {
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m135414d0(int i) {
        this.f112528t = i;
    }

    /* JADX INFO: renamed from: e0 */
    public void m135415e0(int i, int i2, int i3, int i4) {
        this.f112528t = i;
        this.f112527s = i2;
        this.f112529u = i3;
        this.f112530v = i4;
    }

    @Override // p149l.mp0, p149l.c3m
    /* JADX INFO: renamed from: f */
    public void mo105096f(List<C8765d> list, e30<C8765d> e30Var, e30<Integer> e30Var2, e30<C8765d> e30Var3) {
        m135410X(list, e30Var, e30Var2, e30Var3, null);
    }

    /* JADX INFO: renamed from: f0 */
    public void m135416f0(int i) {
        this.f112529u = i;
    }

    /* JADX INFO: renamed from: g0 */
    public void m135417g0(boolean z) {
        NewUiGPPurchaseUpgradeTip newUiGPPurchaseUpgradeTip = this.f112520A;
        if (newUiGPPurchaseUpgradeTip != null) {
            xdl0.m208344M(newUiGPPurchaseUpgradeTip, z);
        }
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: o */
    public AbsPurchaseSectionView mo135418o(C8765d c8765d, ViewGroup viewGroup) {
        NewUiGPPurchaseSectionView newUiGPPurchaseSectionView = (NewUiGPPurchaseSectionView) o7r.m163037a(this.f134966a).inflate(m6c0.f131614l0, viewGroup, false);
        newUiGPPurchaseSectionView.setFrom(this.f112525q);
        return newUiGPPurchaseSectionView;
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: p */
    public View mo135419p() {
        if (this.f112533y == null) {
            this.f112533y = m155736B(new d6n(this.f134966a).m110180b());
        }
        return this.f112533y;
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: r */
    public int mo135420r() {
        return this.f112530v;
    }

    @Override // p149l.mp0, p149l.c3m
    public void release() {
        super.release();
        mkd0.m154992z(this.f112526r);
        mkd0.m154992z(this.f112531w);
        mkd0.m154992z(this.f112532x);
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: s */
    public int mo135421s() {
        return (ura.m195053e().m195057d().mo33910qq() && TextUtils.equals(this.f112525q, "form_sub")) ? t100.f167260i : super.mo135421s();
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: t */
    public int mo135422t() {
        int i = this.f112528t;
        return i != -1 ? i : super.mo135422t();
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: v */
    public int mo135423v() {
        int i = this.f112529u;
        return i != -1 ? i : super.mo135423v();
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: w */
    public int mo135424w() {
        int i = this.f112527s;
        return i >= 0 ? i : super.mo135424w();
    }

    public id40(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f112527s = -1;
        this.f112528t = -1;
        this.f112529u = -1;
        this.f112530v = -1;
        this.f112523D = false;
        this.f112524p = purchaseType;
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: D */
    public void mo135400D() {
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: b */
    public void mo105093b() {
    }

    @Override // p149l.mp0
    /* JADX INFO: renamed from: C */
    public void mo135399C(C8765d c8765d) {
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: c */
    public void mo105094c(b90 b90Var) {
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: e */
    public void mo105095e(PayMethod payMethod) {
    }
}
