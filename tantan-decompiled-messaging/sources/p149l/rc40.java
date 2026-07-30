package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.AgreementComponent;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.C8759a;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.InterfaceC8760b;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.NewUIPurchaseSectionViewAutoPay;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.NewUITotalPricePurchaseSectionView1;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.ODiamondAllPriceSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.PicksTimesPurchaseSectionView;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class rc40 implements c3m, msl {

    /* JADX INFO: renamed from: A */
    public int f158714A;

    /* JADX INFO: renamed from: a */
    public HorizontalScrollView f158715a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f158716b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f158717c;

    /* JADX INFO: renamed from: d */
    public final Act f158718d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f158719e;

    /* JADX INFO: renamed from: f */
    public final String f158720f;

    /* JADX INFO: renamed from: g */
    public PurchaseType f158721g;

    /* JADX INFO: renamed from: h */
    public C8765d f158722h;

    /* JADX INFO: renamed from: i */
    public b90 f158723i;

    /* JADX INFO: renamed from: j */
    public PayMethod f158724j;

    /* JADX INFO: renamed from: k */
    public e30<C8765d> f158725k;

    /* JADX INFO: renamed from: l */
    public List<C8765d> f158726l;

    /* JADX INFO: renamed from: m */
    public final List<C8765d> f158727m;

    /* JADX INFO: renamed from: n */
    public C8765d f158728n;

    /* JADX INFO: renamed from: o */
    public AgreementComponent.AgreementState f158729o;

    /* JADX INFO: renamed from: p */
    public boolean f158730p;

    /* JADX INFO: renamed from: q */
    public e30<Boolean> f158731q;

    /* JADX INFO: renamed from: r */
    public final int f158732r;

    /* JADX INFO: renamed from: s */
    public InterfaceC8760b f158733s;

    /* JADX INFO: renamed from: t */
    public boolean f158734t;

    /* JADX INFO: renamed from: u */
    public e30<CharSequence> f158735u;

    /* JADX INFO: renamed from: v */
    public boolean f158736v;

    /* JADX INFO: renamed from: w */
    public boolean f158737w;

    /* JADX INFO: renamed from: x */
    public r9b0 f158738x;

    /* JADX INFO: renamed from: y */
    public View f158739y;

    /* JADX INFO: renamed from: z */
    public boolean f158740z;

    /* JADX INFO: renamed from: l.rc40$a */
    public static /* synthetic */ class C19670a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f158741a;

        static {
            int[] iArr = new int[AgreementComponent.AgreementState.values().length];
            f158741a = iArr;
            try {
                iArr[AgreementComponent.AgreementState.checked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f158741a[AgreementComponent.AgreementState.unchecked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: W */
    private void m178738W(AbsPurchaseSectionView absPurchaseSectionView, C8765d c8765d, boolean z) {
        C8765d.a aVarM53522d;
        if (m178762H()) {
            aVarM53522d = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        } else {
            aVarM53522d = NullChecker.m81303a(c8765d.m53522d()) ? c8765d.m53522d() : c8765d.m53520b();
        }
        absPurchaseSectionView.m54325b(z, aVarM53522d.m53601s().autoRenewable(), aVarM53522d, this.f158724j);
    }

    /* JADX INFO: renamed from: X */
    private void m178739X(List<C8765d> list) {
        for (int i = 0; i < list.size(); i++) {
            C8765d c8765d = list.get(i);
            m178738W(m178758D(i, list), c8765d, c8765d.m53530l());
            if (c8765d.m53530l()) {
                this.f158728n = c8765d;
                mo105093b();
                m178781c0();
                if (NullChecker.m81303a(this.f158725k)) {
                    this.f158725k.call(this.f158728n);
                }
            }
        }
        if (m178762H() && NullChecker.m81303a(this.f158716b) && NullChecker.m81303a(this.f158739y)) {
            if (this.f158739y.getMeasuredWidth() == 0) {
                this.f158716b.post(new Runnable() { // from class: l.cc40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80205a.m178767M();
                    }
                });
            } else {
                e51.m114748M(new Runnable() { // from class: l.ic40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f112428a.m178767M();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m178743l(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Boolean m178744m(int i, C8765d c8765d) {
        if (!NullChecker.m81303a(c8765d.m53520b())) {
            return Boolean.FALSE;
        }
        Merchandise merchandiseM53601s = c8765d.m53520b().m53601s();
        return Boolean.valueOf(merchandiseM53601s.quantity == i && merchandiseM53601s.monthType());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Boolean m178747p(int i, C8765d c8765d) {
        if (!NullChecker.m81303a(c8765d.m53522d())) {
            return Boolean.FALSE;
        }
        Merchandise merchandiseM53601s = c8765d.m53522d().m53601s();
        return Boolean.valueOf(merchandiseM53601s.quantity == i && merchandiseM53601s.monthType());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m178749r() {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m178753v(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public final AbsPurchaseSectionView m178755A() {
        if (sab0.m182891i(this.f158719e)) {
            ODiamondAllPriceSectionView oDiamondAllPriceSectionView = (ODiamondAllPriceSectionView) o7r.m163037a(this.f158718d).inflate(m6c0.f131630p0, (ViewGroup) this.f158716b, false);
            oDiamondAllPriceSectionView.setInVipFrag(TextUtils.equals(this.f158720f, "PrivilegeODiamondContent"));
            oDiamondAllPriceSectionView.m54383n(this.f158740z);
            return oDiamondAllPriceSectionView;
        }
        if (CoreModule.m29935P().m94651a().mo33529k() && sab0.m182896n(this.f158721g)) {
            return (PicksTimesPurchaseSectionView) o7r.m163037a(this.f158718d).inflate(m6c0.f131642s0, (ViewGroup) this.f158716b, false);
        }
        if (CoreModule.m29935P().m94651a().mo33524j3() && TEnum.equals(this.f158724j, "alipay") && CoreModule.f17545c.f19591O0.m30086u3(this.f158721g)) {
            return (NewUIPurchaseSectionViewAutoPay) o7r.m163037a(this.f158718d).inflate(m6c0.f131634q0, (ViewGroup) this.f158716b, false);
        }
        NewUITotalPricePurchaseSectionView1 newUITotalPricePurchaseSectionView1 = (NewUITotalPricePurchaseSectionView1) o7r.m163037a(this.f158718d).inflate(m6c0.f131638r0, (ViewGroup) this.f158716b, false);
        newUITotalPricePurchaseSectionView1.m54352o(this.f158740z);
        return newUITotalPricePurchaseSectionView1;
    }

    /* JADX INFO: renamed from: B */
    public C8765d m178756B(final int i) {
        return (C8765d) vwb.m200346r(this.f158727m, new w9j() { // from class: l.pc40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rc40.m178744m(i, (C8765d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public Merchandise m178757C(final int i) {
        C8765d c8765d = (C8765d) vwb.m200346r(this.f158727m, new w9j() { // from class: l.lc40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rc40.m178747p(i, (C8765d) obj);
            }
        });
        if (NullChecker.m81303a(c8765d)) {
            return c8765d.m53522d().m53601s();
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final AbsPurchaseSectionView m178758D(int i, final List<C8765d> list) {
        if (i < this.f158716b.getChildCount()) {
            return (AbsPurchaseSectionView) this.f158716b.getChildAt(i);
        }
        final C8765d c8765d = list.get(i);
        AbsPurchaseSectionView absPurchaseSectionViewM178755A = m178755A();
        absPurchaseSectionViewM178755A.setOnClickListener(new View.OnClickListener() { // from class: l.jc40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117261a.m178765K(c8765d, list, view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f158732r, -1);
        if (i != 0) {
            layoutParams.leftMargin = t100.f167258g;
        }
        this.f158716b.addView(absPurchaseSectionViewM178755A, layoutParams);
        return absPurchaseSectionViewM178755A;
    }

    /* JADX INFO: renamed from: E */
    public View m178759E(boolean z) {
        this.f158734t = z;
        return this.f158733s.mo53209d(z);
    }

    /* JADX INFO: renamed from: F */
    public boolean m178760F() {
        if (NullChecker.m81303a(this.f158733s) && (this.f158733s instanceof C8759a)) {
            return this.f158730p;
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void m178761G(boolean z) {
        this.f158737w = z;
    }

    /* JADX INFO: renamed from: H */
    public boolean m178762H() {
        return m178763I(this.f158727m);
    }

    /* JADX INFO: renamed from: I */
    public boolean m178763I(List<C8765d> list) {
        for (C8765d c8765d : list) {
            if (c8765d.m53522d() == null || c8765d.m53520b() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m178764J() {
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m178765K(C8765d c8765d, List list, View view) {
        if (c8765d.m53530l()) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.dc40
            @Override // p149l.e30
            public final void call(Object obj) {
                ((C8765d) obj).m53540v(false);
            }
        });
        c8765d.m53540v(true);
        m178739X(list);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m178768N() {
        m178782d0(true);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m178769O() {
        m178782d0(true);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m178770P() {
        m178782d0(true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m178771Q(PurchaseType purchaseType, Boolean bool) {
        AgreementComponent.AgreementState agreementState = this.f158729o;
        this.f158729o = bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked;
        this.f158730p = bool.booleanValue();
        if (NullChecker.m81303a(this.f158731q)) {
            this.f158731q.call(Boolean.valueOf(this.f158730p));
        }
        dsa.m113436i(bool.booleanValue());
        if (t4b.m187163d()) {
            if (sab0.m182905w(purchaseType) || sab0.m182899q(purchaseType)) {
                boolean zBooleanValue = this.f158733s.mo53208c().booleanValue();
                AgreementComponent.AgreementState agreementState2 = this.f158729o;
                if (zBooleanValue) {
                    m178774T(agreementState, agreementState2, new d30() { // from class: l.mc40
                        @Override // p149l.d30
                        public final void call() {
                            this.f133082a.m178768N();
                        }
                    });
                    return;
                } else {
                    m178766L(agreementState2);
                    return;
                }
            }
            if (sab0.m182891i(purchaseType)) {
                if (!this.f158733s.mo53208c().booleanValue() || this.f158737w) {
                    return;
                }
                m178773S(this.f158729o, new d30() { // from class: l.nc40
                    @Override // p149l.d30
                    public final void call() {
                        this.f138098a.m178769O();
                    }
                });
                return;
            }
            if (sab0.m182897o(purchaseType) && this.f158733s.mo53208c().booleanValue() && !this.f158737w) {
                m178775U(this.f158729o, new d30() { // from class: l.oc40
                    @Override // p149l.d30
                    public final void call() {
                        this.f143010a.m178770P();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void m178772R() {
        this.f158730p = true;
        if (NullChecker.m81303a(this.f158733s)) {
            InterfaceC8760b interfaceC8760b = this.f158733s;
            if (interfaceC8760b instanceof C8759a) {
                ((C8759a) interfaceC8760b).m53216m();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m178773S(AgreementComponent.AgreementState agreementState, final d30 d30Var) {
        if (agreementState == AgreementComponent.AgreementState.unchecked) {
            aze0.m99658a(this.f158718d, this.f158721g, this.f158722h, new d30() { // from class: l.gc40
                @Override // p149l.d30
                public final void call() {
                    rc40.m178743l(d30Var);
                }
            }, new d30() { // from class: l.hc40
                @Override // p149l.d30
                public final void call() {
                    rc40.m178749r();
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public void m178774T(AgreementComponent.AgreementState agreementState, final AgreementComponent.AgreementState agreementState2, final d30 d30Var) {
        if (this.f158722h == null || vwb.m200296J(this.f158726l)) {
            return;
        }
        mo105093b();
        int i = C19670a.f158741a[agreementState2.ordinal()];
        if (i == 1) {
            m178766L(agreementState2);
            return;
        }
        if (i == 2 && agreementState != AgreementComponent.AgreementState.hidden) {
            if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f158721g && C8766e.m53650x(this.f158720f)) {
                m178766L(agreementState2);
            } else {
                aze0.m99658a(this.f158718d, this.f158721g, this.f158722h, new d30() { // from class: l.ec40
                    @Override // p149l.d30
                    public final void call() {
                        rc40.m178753v(d30Var);
                    }
                }, new d30() { // from class: l.fc40
                    @Override // p149l.d30
                    public final void call() {
                        this.f96767a.m178766L(agreementState2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m178775U(AgreementComponent.AgreementState agreementState, d30 d30Var) {
        m178773S(agreementState, d30Var);
    }

    /* JADX INFO: renamed from: V */
    public final void m178776V(PayMethod payMethod) {
        this.f158724j = payMethod;
        if (vwb.m200296J(this.f158726l)) {
            return;
        }
        m178785z(this.f158738x.m178311j(this.f158729o, this.f158724j));
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m178767M() {
        int measuredWidth = this.f158739y.getMeasuredWidth();
        if (measuredWidth <= (this.f158716b.getChildCount() * this.f158732r) + ((this.f158716b.getChildCount() - 1) * t100.f167258g) + (this.f158714A * 2) || this.f158716b.getChildCount() <= 0) {
            return;
        }
        int childCount = ((measuredWidth - (this.f158714A * 2)) - ((this.f158716b.getChildCount() - 1) * t100.m186890d(6.0f))) / this.f158716b.getChildCount();
        for (int i = 0; i < this.f158716b.getChildCount(); i++) {
            View childAt = this.f158716b.getChildAt(i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(childCount, -1);
            if (i != 0) {
                layoutParams.leftMargin = t100.f167258g;
            }
            childAt.setLayoutParams(layoutParams);
        }
        this.f158739y.invalidate();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m178778Z(int i, d30 d30Var) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.f158727m.size();
            List<C8765d> list = this.f158727m;
            if (i2 >= size) {
                m178739X(list);
                this.f158715a.smoothScrollTo((t100.m186890d(106.0f) * i3) + t100.f167258g, 0);
                Act act = this.f158718d;
                Objects.requireNonNull(d30Var);
                e51.m114743H(act, new bii0(d30Var), 500L);
                return true;
            }
            C8765d c8765d = list.get(i2);
            if (NullChecker.m81303a(c8765d.m53520b())) {
                Merchandise merchandiseM53601s = c8765d.m53520b().m53601s();
                if (merchandiseM53601s.quantity == i && merchandiseM53601s.monthType()) {
                    c8765d.m53540v(true);
                    i3 = i2;
                } else {
                    c8765d.m53540v(false);
                }
            } else if (NullChecker.m81303a(c8765d.m53522d())) {
                c8765d.m53540v(false);
            }
            i2++;
        }
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: a */
    public View mo105092a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f158718d.inflater().inflate(m6c0.f131652u2, viewGroup, false);
        m178783x(viewInflate);
        LinearLayout linearLayout = this.f158716b;
        int i = this.f158714A;
        linearLayout.setPadding(i, 0, i, 0);
        boolean zM178764J = m178764J();
        FrameLayout frameLayout = this.f158717c;
        if (zM178764J) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = t100.f167258g;
            this.f158717c.setLayoutParams(layoutParams);
        } else {
            frameLayout.addView(m178759E(false));
        }
        this.f158739y = viewInflate;
        return viewInflate;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m178779a0(final int i, d30 d30Var) {
        if (!NullChecker.m81303a((C8765d) vwb.m200346r(this.f158727m, new w9j() { // from class: l.qc40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                C8765d c8765d = (C8765d) obj;
                return Boolean.valueOf(NullChecker.m81303a(c8765d.m53522d()) && c8765d.m53522d().m53601s().quantity == i && c8765d.m53522d().m53601s().monthType());
            }
        }))) {
            dsa.m113450w();
            return false;
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int size = this.f158727m.size();
            List<C8765d> list = this.f158727m;
            if (i3 >= size) {
                m178739X(list);
                this.f158715a.smoothScrollTo((t100.m186890d(106.0f) * i2) + t100.f167258g, 0);
                Act act = this.f158718d;
                Objects.requireNonNull(d30Var);
                e51.m114743H(act, new bii0(d30Var), 500L);
                return true;
            }
            C8765d c8765d = list.get(i3);
            if (NullChecker.m81303a(c8765d.m53522d())) {
                Merchandise merchandiseM53601s = c8765d.m53522d().m53601s();
                if (merchandiseM53601s.quantity == i && merchandiseM53601s.monthType()) {
                    c8765d.m53540v(true);
                    i2 = i3;
                } else {
                    c8765d.m53540v(false);
                }
            } else if (NullChecker.m81303a(c8765d.m53520b())) {
                c8765d.m53540v(false);
            }
            i3++;
        }
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: b */
    public void mo105093b() {
        C8765d c8765d = this.f158728n;
        if (c8765d == null || this.f158723i == null) {
            this.f158722h = c8765d;
            this.f158721g = this.f158719e;
        } else {
            this.f158722h = c8765d;
            this.f158721g = this.f158719e;
            m178781c0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m178780b0(e30<Boolean> e30Var) {
        this.f158731q = e30Var;
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: c */
    public void mo105094c(b90 b90Var) {
        this.f158723i = b90Var;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m178781c0() {
        CharSequence charSequenceM202842G;
        final PurchaseType purchaseType = this.f158721g;
        boolean zM53531m = this.f158722h.m53531m();
        C8765d c8765d = this.f158722h;
        Merchandise merchandiseM53601s = (zM53531m ? c8765d.m53520b() : c8765d.m53522d()).m53601s();
        if (!merchandiseM53601s.autoRenewable() && (!m178762H() || TEnum.equals(this.f158724j, PayMethod.jingdong) || (!TEnum.equals(this.f158724j, "wechat") && this.f158729o == AgreementComponent.AgreementState.hidden))) {
            boolean z = this.f158740z;
            boolean z2 = this.f158734t;
            charSequenceM202842G = z ? we60.m202840E(purchaseType, z2) : we60.m202872m(purchaseType, z2);
        } else if (sab0.m182897o(purchaseType)) {
            charSequenceM202842G = TextUtils.equals(this.f158720f, "PrivilegePlatinumContent") ? we60.m202838C(merchandiseM53601s, we60.m202853R(true)) : we60.m202838C(merchandiseM53601s, we60.m202853R(false));
        } else if (CoreModule.m29935P().m94651a().mo158371f() && sab0.m182891i(purchaseType)) {
            if (this.f158740z) {
                charSequenceM202842G = we60.m202837B(merchandiseM53601s);
            } else {
                charSequenceM202842G = TextUtils.equals(this.f158720f, "PrivilegeODiamondContent") ? we60.m202836A(merchandiseM53601s, we60.m202852Q(true)) : we60.m202836A(merchandiseM53601s, we60.m202852Q(false));
            }
        } else if (sab0.m182899q(purchaseType)) {
            if (merchandiseM53601s.monthly() && merchandiseM53601s.autoRenewable() && rxa0.m181490k(merchandiseM53601s)) {
                boolean z3 = this.f158736v;
                StockKeepUnit stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit;
                charSequenceM202842G = z3 ? we60.m202884y(stockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandiseM53601s.defaultStockKeepUnit.prices.price)) : we60.m202847L(stockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandiseM53601s.defaultStockKeepUnit.prices.price));
            } else if (rxa0.m181495p(merchandiseM53601s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP)) {
                boolean zEquals = TEnum.equals(this.f158724j, "wechat");
                boolean z4 = this.f158736v;
                if (zEquals) {
                    boolean z5 = this.f158734t;
                    charSequenceM202842G = z4 ? we60.m202880u(merchandiseM53601s, purchaseType, z5) : we60.m202844I(merchandiseM53601s, purchaseType, z5);
                } else {
                    boolean z6 = this.f158734t;
                    charSequenceM202842G = z4 ? we60.m202879t(merchandiseM53601s, purchaseType, z6) : we60.m202843H(merchandiseM53601s, purchaseType, z6);
                }
            } else if (rxa0.m181495p(merchandiseM53601s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
                boolean zEquals2 = TEnum.equals(this.f158724j, "wechat");
                boolean z7 = this.f158736v;
                if (zEquals2) {
                    boolean z8 = this.f158734t;
                    charSequenceM202842G = z7 ? we60.m202880u(merchandiseM53601s, purchaseType, z8) : we60.m202844I(merchandiseM53601s, purchaseType, z8);
                } else {
                    boolean z9 = this.f158734t;
                    charSequenceM202842G = z7 ? we60.m202879t(merchandiseM53601s, purchaseType, z9) : we60.m202843H(merchandiseM53601s, purchaseType, z9);
                }
            } else if (this.f158736v && rxa0.m181501v("svip", merchandiseM53601s)) {
                charSequenceM202842G = we60.m202879t(merchandiseM53601s, purchaseType, this.f158734t);
            } else {
                boolean z10 = this.f158736v;
                boolean z11 = this.f158734t;
                charSequenceM202842G = z10 ? we60.m202883x(purchaseType, z11) : we60.m202842G(purchaseType, z11);
            }
        } else if (sab0.m182905w(purchaseType)) {
            if (xni.m210165c() && rxa0.m181495p(merchandiseM53601s, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
                charSequenceM202842G = this.f158736v ? we60.m202878s(this.f158718d, merchandiseM53601s, purchaseType) : we60.m202843H(merchandiseM53601s, purchaseType, this.f158734t);
            } else if (xni.m210165c() && (rxa0.m181495p(merchandiseM53601s, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP) || (this.f158736v && rxa0.m181501v(ProductCategory.tttVip, merchandiseM53601s)))) {
                boolean z12 = this.f158736v;
                boolean z13 = this.f158734t;
                charSequenceM202842G = z12 ? we60.m202879t(merchandiseM53601s, purchaseType, z13) : we60.m202843H(merchandiseM53601s, purchaseType, z13);
            } else {
                boolean z14 = this.f158736v;
                boolean z15 = this.f158734t;
                charSequenceM202842G = z14 ? we60.m202883x(purchaseType, z15) : we60.m202842G(purchaseType, z15);
            }
        } else if (!CoreModule.m29935P().m94651a().mo33529k() || PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP != purchaseType) {
            charSequenceM202842G = (CoreModule.m29935P().m94651a().mo33529k() && PurchaseType.TYPE_PICKS_MEMBERSHIP == purchaseType) ? we60.m202842G(purchaseType, this.f158734t) : "";
        } else if (rxa0.m181495p(merchandiseM53601s, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks) || rxa0.m181495p(merchandiseM53601s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            charSequenceM202842G = we60.m202843H(merchandiseM53601s, purchaseType, this.f158734t);
        } else {
            boolean zM181495p = rxa0.m181495p(merchandiseM53601s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
            boolean z16 = this.f158734t;
            charSequenceM202842G = zM181495p ? we60.m202843H(merchandiseM53601s, purchaseType, z16) : we60.m202842G(purchaseType, z16);
        }
        if (NullChecker.m81303a(this.f158733s)) {
            this.f158733s.mo53207b(charSequenceM202842G);
            InterfaceC8760b interfaceC8760b = this.f158733s;
            if (interfaceC8760b instanceof C8759a) {
                ((C8759a) interfaceC8760b).m53217n(new e30() { // from class: l.kc40
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f122286a.m178771Q(purchaseType, (Boolean) obj);
                    }
                });
                ((C8759a) this.f158733s).m53218o(this.f158722h, this.f158721g, this.f158730p, this.f158734t, m178762H() && this.f158729o != AgreementComponent.AgreementState.hidden, this.f158724j);
            }
        }
        if (NullChecker.m81303a(this.f158735u)) {
            this.f158735u.call(charSequenceM202842G);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m178782d0(boolean z) {
        this.f158730p = z;
        if (NullChecker.m81303a(this.f158733s)) {
            InterfaceC8760b interfaceC8760b = this.f158733s;
            if (interfaceC8760b instanceof C8759a) {
                ((C8759a) interfaceC8760b).m53211h(this.f158730p);
            }
        }
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: e */
    public void mo105095e(PayMethod payMethod) {
        if (this.f158724j != payMethod) {
            this.f158724j = payMethod;
            if (!t4b.m187163d() && sab0.m182899q(this.f158719e) && TEnum.equals(this.f158724j, "wechat")) {
                this.f158729o = AgreementComponent.AgreementState.checked;
            }
            m178776V(payMethod);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0014 A[DONT_INVERT] */
    @Override // p149l.msl
    /* JADX INFO: renamed from: g */
    public void mo156151g(boolean z) {
        AgreementComponent.AgreementState agreementState;
        AgreementComponent.AgreementState state;
        InterfaceC8760b interfaceC8760b;
        if (vwb.m200296J(this.f158726l)) {
            return;
        }
        if (z) {
            AgreementComponent.AgreementState agreementState2 = this.f158729o;
            AgreementComponent.AgreementState agreementState3 = AgreementComponent.AgreementState.hidden;
            if (agreementState2 != agreementState3) {
                this.f158729o = agreementState3;
            } else {
                if (!z) {
                    return;
                }
                agreementState = this.f158729o;
                state = AgreementComponent.AgreementState.checked;
                if (agreementState != state) {
                    return;
                }
                if (t4b.m187164e(this.f158719e) || !m178763I(this.f158726l)) {
                    if (this.f158716b == null) {
                        return;
                    } else {
                        this.f158729o = state;
                    }
                } else if (this.f158716b == null || (interfaceC8760b = this.f158733s) == null) {
                    this.f158729o = state;
                } else {
                    if (interfaceC8760b.getState() != null) {
                        state = this.f158733s.getState();
                    }
                    if (state == this.f158729o) {
                        return;
                    } else {
                        this.f158729o = state;
                    }
                }
            }
        } else {
            if (!z) {
                return;
            }
            agreementState = this.f158729o;
            state = AgreementComponent.AgreementState.checked;
            if (agreementState != state) {
                return;
            }
            if (t4b.m187164e(this.f158719e)) {
                if (this.f158716b == null) {
                    return;
                } else {
                    this.f158729o = state;
                }
            } else if (this.f158716b == null) {
                return;
            } else {
                this.f158729o = state;
            }
        }
        m178785z(this.f158738x.m178311j(this.f158729o, this.f158724j));
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: h */
    public void mo105097h(List<C8765d> list, e30<C8765d> e30Var, e30<Integer> e30Var2) {
        this.f158725k = e30Var;
        this.f158726l = list;
        if (t4b.m187164e(this.f158719e) && m178763I(list)) {
            PurchaseType purchaseType = this.f158719e;
            this.f158738x = new r9b0(purchaseType, list, vwb.m200324f0(new obq0(purchaseType, list), new hi0(this.f158719e, list), new ei0(this.f158719e, list), new xi0(this.f158719e, list), new uw40(this.f158719e, list)));
        } else {
            this.f158738x = new r9b0(this.f158719e, list);
        }
        m178785z(this.f158738x.m178311j(this.f158729o, this.f158724j));
    }

    /* JADX INFO: renamed from: x */
    public final void m178783x(View view) {
        sc40.m183373a(this, view);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m178766L(AgreementComponent.AgreementState agreementState) {
        if (vwb.m200296J(this.f158726l)) {
            return;
        }
        boolean z = agreementState == AgreementComponent.AgreementState.checked;
        if (m178762H()) {
            for (C8765d c8765d : this.f158726l) {
                c8765d.m53541w(z);
                c8765d.m53534p("changeAutoRenew:" + z);
            }
        }
        m178785z(this.f158738x.m178311j(agreementState, this.f158724j));
    }

    /* JADX INFO: renamed from: z */
    public final void m178785z(List<C8765d> list) {
        this.f158716b.removeAllViews();
        this.f158727m.clear();
        this.f158727m.addAll(list);
        m178739X(this.f158727m);
    }

    @Override // p149l.c3m
    public void release() {
    }
}
