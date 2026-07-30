package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.AgreementComponent;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUiGPPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUiGPPurchaseUpgradeSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUiGPPurchaseUpgradeTip;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes12.dex */
public class wl40 extends ip0 {

    /* JADX INFO: renamed from: E */
    public static C22507a<Integer> f189637E = C22507a.m222758b();

    /* JADX INFO: renamed from: F */
    public static C22508b<Unit> f189638F = C22508b.m222767b();

    /* JADX INFO: renamed from: A */
    public NewUiGPPurchaseUpgradeTip f189639A;

    /* JADX INFO: renamed from: B */
    public List<C8928d> f189640B;

    /* JADX INFO: renamed from: C */
    public boolean f189641C;

    /* JADX INFO: renamed from: D */
    public boolean f189642D;

    /* JADX INFO: renamed from: p */
    public PurchaseType f189643p;

    /* JADX INFO: renamed from: q */
    public String f189644q;

    /* JADX INFO: renamed from: r */
    public kcg0 f189645r;

    /* JADX INFO: renamed from: s */
    public int f189646s;

    /* JADX INFO: renamed from: t */
    public int f189647t;

    /* JADX INFO: renamed from: u */
    public int f189648u;

    /* JADX INFO: renamed from: v */
    public int f189649v;

    /* JADX INFO: renamed from: w */
    public kcg0 f189650w;

    /* JADX INFO: renamed from: x */
    public kcg0 f189651x;

    /* JADX INFO: renamed from: y */
    public View f189652y;

    /* JADX INFO: renamed from: z */
    public NewUiGPPurchaseUpgradeSectionView f189653z;

    public wl40(Act act, PurchaseType purchaseType, String str) {
        super(act, purchaseType);
        this.f189646s = -1;
        this.f189647t = -1;
        this.f189648u = -1;
        this.f189649v = -1;
        this.f189642D = false;
        this.f189643p = purchaseType;
        this.f189644q = str;
    }

    /* JADX INFO: renamed from: Y */
    private void m206915Y() {
        psd0.m173633z(this.f189650w);
        this.f189650w = this.f116232a.duringCreated(f189637E).subscribe(psd0.m173596G(new y20() { // from class: l.vl40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184540a.m206922U((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    private void m206916Z(final List<C8928d> list) {
        if (!t7a.m189547c() && CoreModule.m30933P().m143405a().mo34445Xi() && PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f189643p) {
            psd0.m173633z(this.f189645r);
            this.f189645r = this.f116232a.duringCreated(ijj.m140191c().f115232b.observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.ul40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f179482a.m206923V(list, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m206917b0() {
        NewUiGPPurchaseUpgradeTip newUiGPPurchaseUpgradeTip;
        if (!jyb.m147479J(this.f189640B) && (newUiGPPurchaseUpgradeTip = this.f189639A) != null) {
            newUiGPPurchaseUpgradeTip.m55553Q(this.f189640B);
        }
        m206931g0(this.f189641C);
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: E */
    public void mo141369E(C8928d c8928d) {
        super.mo141369E(c8928d);
        if (this.f189653z == null || jyb.m147479J(this.f189640B) || !this.f189641C) {
            return;
        }
        this.f189641C = false;
        this.f189653z.m55549l(false);
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: F */
    public void mo141370F(AbsPurchaseSectionView absPurchaseSectionView, C8928d c8928d, boolean z) {
        C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        if (aVarM54703b != null) {
            absPurchaseSectionView.m55508b(z, c8928d.m54714m(), aVarM54703b, null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m206918Q() {
        psd0.m173633z(this.f189651x);
        this.f189651x = this.f116232a.duringCreated(f189638F).subscribe(psd0.m173596G(new y20() { // from class: l.sl40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169349a.m206921T((Unit) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public View m206919R(ViewGroup viewGroup) {
        if (this.f189653z == null) {
            this.f189653z = (NewUiGPPurchaseUpgradeSectionView) p9r.m171370a(this.f116232a).inflate(rec0.f162578m0, viewGroup, false);
        }
        return this.f189653z;
    }

    /* JADX INFO: renamed from: S */
    public View m206920S(ViewGroup viewGroup) {
        if (this.f189639A == null) {
            this.f189639A = (NewUiGPPurchaseUpgradeTip) p9r.m171370a(this.f116232a).inflate(rec0.f162582n0, viewGroup, false);
        }
        return this.f189639A;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m206921T(Unit unit) {
        List<C8928d> list;
        if (jyb.m147479J(this.f189640B) || this.f189653z == null || this.f189641C || (list = this.f116238g) == null) {
            return;
        }
        Iterator<C8928d> it = list.iterator();
        while (it.hasNext()) {
            it.next().m54723v(false);
        }
        C8928d c8928d = this.f189640B.get(0);
        for (C8928d c8928d2 : this.f189640B) {
            if (c8928d2.m54713l()) {
                c8928d = c8928d2;
                break;
            }
        }
        CoreModule.f18264c.f20311G2.f131287V.onNext(pf60.m172085a(this.f189643p, c8928d));
        if (NullChecker.m82486a(this.f116236e)) {
            this.f116236e.call(c8928d);
        }
        this.f189641C = true;
        m141378m(false);
        this.f189653z.m55549l(true);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m206922U(Integer num) {
        List<C8928d> list = this.f116238g;
        if (list == null || list.size() <= num.intValue()) {
            return;
        }
        C8928d c8928d = this.f116238g.get(num.intValue());
        C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        if (NullChecker.m82486a(aVarM54703b)) {
            aVarM54703b.m54761e0("");
        }
        if (c8928d.m54713l()) {
            m141376L(c8928d);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m206923V(List list, Integer num) {
        int iIntValue = num.intValue();
        C8928d c8928d = null;
        int i = 0;
        while (i < list.size()) {
            C8928d c8928d2 = (C8928d) list.get(i);
            c8928d2.m54723v(i == iIntValue);
            c8928d2.m54718q(i == iIntValue);
            if (i == iIntValue) {
                c8928d = c8928d2;
            }
            i++;
        }
        if (c8928d != null) {
            m141376L(c8928d);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m206924W(Boolean bool, C8928d c8928d, Boolean bool2) {
        if (bool2.booleanValue()) {
            if (NullChecker.m82486a(this.f116236e)) {
                this.f116236e.call(c8928d);
                return;
            }
            return;
        }
        if (this.f189641C) {
            if (NullChecker.m82486a(this.f116237f)) {
                this.f116237f.call(c8928d);
                return;
            }
            return;
        }
        List<C8928d> list = this.f116238g;
        if (list != null) {
            Iterator<C8928d> it = list.iterator();
            while (it.hasNext()) {
                it.next().m54723v(false);
            }
        }
        if (NullChecker.m82486a(this.f116236e)) {
            this.f116236e.call(c8928d);
        }
        this.f189641C = true;
        m141378m(false);
        this.f189653z.m55549l(true);
    }

    /* JADX INFO: renamed from: X */
    public void m206925X(List<C8928d> list, y20<C8928d> y20Var, y20<Integer> y20Var2, y20<C8928d> y20Var3, List<C8928d> list2) {
        super.mo141377f(list, y20Var, y20Var2, y20Var3);
        this.f189640B = list2;
        if (jyb.m147479J(list2)) {
            this.f189641C = false;
        }
        if (!this.f189642D) {
            this.f189642D = true;
            if (!jyb.m147479J(list2) && !TEnum.equals(list.get(0).m54704c().category, ProductCategory.tttSvipGoogleplayFreeTrial)) {
                Iterator<C8928d> it = list.iterator();
                while (it.hasNext()) {
                    it.next().m54723v(false);
                }
                this.f189641C = true;
                CoreModule.f18264c.f20311G2.f131287V.onNext(pf60.m172085a(this.f189643p, list2.get(0)));
            }
        }
        m206916Z(list);
        m206915Y();
        m206926a0();
        m206917b0();
        m206918Q();
    }

    @Override // p153l.ip0, p153l.t5m
    /* JADX INFO: renamed from: a */
    public View mo126108a(ViewGroup viewGroup, boolean z) {
        LinearLayout linearLayout = new LinearLayout(this.f116232a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        linearLayout.addView(m141366B(m206919R(linearLayout)));
        linearLayout.addView(m141366B(m141382q()));
        linearLayout.addView(m141366B(m206920S(linearLayout)));
        bnl0.m105524M(this.f189653z, false);
        m206931g0(false);
        return linearLayout;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m206926a0() {
        if (this.f189653z == null) {
            return;
        }
        boolean zM147479J = jyb.m147479J(this.f189640B);
        NewUiGPPurchaseUpgradeSectionView newUiGPPurchaseUpgradeSectionView = this.f189653z;
        if (zM147479J) {
            bnl0.m105524M(newUiGPPurchaseUpgradeSectionView, false);
        } else {
            bnl0.m105524M(newUiGPPurchaseUpgradeSectionView, true);
            this.f189653z.m55550m(this.f189643p, this.f189641C, this.f189640B, new a30() { // from class: l.tl40
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f174785a.m206924W((Boolean) obj, (C8928d) obj2, (Boolean) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m206927c0(int i) {
        this.f189649v = i;
    }

    @Override // p153l.cqe0
    /* JADX INFO: renamed from: d */
    public AgreementComponent mo111896d() {
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m206928d0(int i) {
        this.f189647t = i;
    }

    /* JADX INFO: renamed from: e0 */
    public void m206929e0(int i, int i2, int i3, int i4) {
        this.f189647t = i;
        this.f189646s = i2;
        this.f189648u = i3;
        this.f189649v = i4;
    }

    @Override // p153l.ip0, p153l.t5m
    /* JADX INFO: renamed from: f */
    public void mo141377f(List<C8928d> list, y20<C8928d> y20Var, y20<Integer> y20Var2, y20<C8928d> y20Var3) {
        m206925X(list, y20Var, y20Var2, y20Var3, null);
    }

    /* JADX INFO: renamed from: f0 */
    public void m206930f0(int i) {
        this.f189648u = i;
    }

    /* JADX INFO: renamed from: g0 */
    public void m206931g0(boolean z) {
        NewUiGPPurchaseUpgradeTip newUiGPPurchaseUpgradeTip = this.f189639A;
        if (newUiGPPurchaseUpgradeTip != null) {
            bnl0.m105524M(newUiGPPurchaseUpgradeTip, z);
        }
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: o */
    public AbsPurchaseSectionView mo141380o(C8928d c8928d, ViewGroup viewGroup) {
        NewUiGPPurchaseSectionView newUiGPPurchaseSectionView = (NewUiGPPurchaseSectionView) p9r.m171370a(this.f116232a).inflate(rec0.f162574l0, viewGroup, false);
        newUiGPPurchaseSectionView.setFrom(this.f189644q);
        return newUiGPPurchaseSectionView;
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: p */
    public View mo141381p() {
        if (this.f189652y == null) {
            this.f189652y = m141366B(new d8n(this.f116232a).m114915b());
        }
        return this.f189652y;
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: r */
    public int mo141383r() {
        return this.f189649v;
    }

    @Override // p153l.ip0, p153l.t5m
    public void release() {
        super.release();
        psd0.m173633z(this.f189645r);
        psd0.m173633z(this.f189650w);
        psd0.m173633z(this.f189651x);
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: s */
    public int mo141384s() {
        return (gta.m132210e().m132214d().mo34913qq() && TextUtils.equals(this.f189644q, "form_sub")) ? qa00.f156322i : super.mo141384s();
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: t */
    public int mo141385t() {
        int i = this.f189647t;
        return i != -1 ? i : super.mo141385t();
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: v */
    public int mo141387v() {
        int i = this.f189648u;
        return i != -1 ? i : super.mo141387v();
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: w */
    public int mo141388w() {
        int i = this.f189646s;
        return i >= 0 ? i : super.mo141388w();
    }

    public wl40(Act act, PurchaseType purchaseType) {
        super(act, purchaseType);
        this.f189646s = -1;
        this.f189647t = -1;
        this.f189648u = -1;
        this.f189649v = -1;
        this.f189642D = false;
        this.f189643p = purchaseType;
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: D */
    public void mo141368D() {
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: b */
    public void mo126110b() {
    }

    @Override // p153l.ip0
    /* JADX INFO: renamed from: C */
    public void mo141367C(C8928d c8928d) {
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: c */
    public void mo126112c(x80 x80Var) {
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: e */
    public void mo126115e(PayMethod payMethod) {
    }
}
