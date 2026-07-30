package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUIPurchaseSectionViewAutoPay;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUITotalPricePurchaseSectionView1;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.ODiamondAllPriceSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.PicksTimesPurchaseSectionView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.ui.purchase.agreement.AgreementComponent;
import com.p1.mobile.putong.core.ui.purchase.agreement.a;
import com.p1.mobile.putong.core.ui.purchase.agreement.b;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import l.bii0;
import l.d30;
import l.e30;
import l.e51;
import l.m6c0;
import l.o7r;
import l.rxa0;
import l.sab0;
import l.sc40;
import l.t100;
import l.vwb;
import l.w9j;
import l.we60;
import l.xni;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rc40 implements c3m, msl {

    /* JADX INFO: renamed from: A */
    public int f20483A;

    /* JADX INFO: renamed from: a */
    public HorizontalScrollView f20484a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f20485b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f20486c;

    /* JADX INFO: renamed from: d */
    public final Act f20487d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f20488e;

    /* JADX INFO: renamed from: f */
    public final String f20489f;

    /* JADX INFO: renamed from: g */
    public PurchaseType f20490g;

    /* JADX INFO: renamed from: h */
    public d f20491h;

    /* JADX INFO: renamed from: i */
    public b90 f20492i;

    /* JADX INFO: renamed from: j */
    public PayMethod f20493j;

    /* JADX INFO: renamed from: k */
    public e30<d> f20494k;

    /* JADX INFO: renamed from: l */
    public List<d> f20495l;

    /* JADX INFO: renamed from: m */
    public final List<d> f20496m;

    /* JADX INFO: renamed from: n */
    public d f20497n;

    /* JADX INFO: renamed from: o */
    public AgreementComponent.AgreementState f20498o;

    /* JADX INFO: renamed from: p */
    public boolean f20499p;

    /* JADX INFO: renamed from: q */
    public e30<Boolean> f20500q;

    /* JADX INFO: renamed from: r */
    public final int f20501r;

    /* JADX INFO: renamed from: s */
    public b f20502s;

    /* JADX INFO: renamed from: t */
    public boolean f20503t;

    /* JADX INFO: renamed from: u */
    public e30<CharSequence> f20504u;

    /* JADX INFO: renamed from: v */
    public boolean f20505v;

    /* JADX INFO: renamed from: w */
    public boolean f20506w;

    /* JADX INFO: renamed from: x */
    public r9b0 f20507x;

    /* JADX INFO: renamed from: y */
    public View f20508y;

    /* JADX INFO: renamed from: z */
    public boolean f20509z;

    /* JADX INFO: renamed from: l.rc40$a */
    public static /* synthetic */ class C1214a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20510a;

        static {
            int[] iArr = new int[AgreementComponent.AgreementState.values().length];
            f20510a = iArr;
            try {
                iArr[AgreementComponent.AgreementState.checked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20510a[AgreementComponent.AgreementState.unchecked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: W */
    private void m22793W(AbsPurchaseSectionView absPurchaseSectionView, d dVar, boolean z) {
        d.a aVarD;
        if (m22817H()) {
            aVarD = dVar.m() ? dVar.b() : dVar.d();
        } else {
            aVarD = NullChecker.a(dVar.d()) ? dVar.d() : dVar.b();
        }
        absPurchaseSectionView.m7660b(z, aVarD.s().autoRenewable(), aVarD, this.f20493j);
    }

    /* JADX INFO: renamed from: X */
    private void m22794X(List<d> list) {
        for (int i = 0; i < list.size(); i++) {
            d dVar = list.get(i);
            m22793W(m22813D(i, list), dVar, dVar.l());
            if (dVar.l()) {
                this.f20497n = dVar;
                mo13099b();
                m22836c0();
                if (NullChecker.a(this.f20494k)) {
                    this.f20494k.call(this.f20497n);
                }
            }
        }
        if (m22817H() && NullChecker.a(this.f20485b) && NullChecker.a(this.f20508y)) {
            if (this.f20508y.getMeasuredWidth() == 0) {
                this.f20485b.post(new Runnable() { // from class: l.cc40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9587a.m22822M();
                    }
                });
            } else {
                e51.M(new Runnable() { // from class: l.ic40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14353a.m22822M();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m22798l(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Boolean m22799m(int i, d dVar) {
        if (!NullChecker.a(dVar.b())) {
            return Boolean.FALSE;
        }
        Merchandise merchandiseS = dVar.b().s();
        return Boolean.valueOf(merchandiseS.quantity == i && merchandiseS.monthType());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Boolean m22802p(int i, d dVar) {
        if (!NullChecker.a(dVar.d())) {
            return Boolean.FALSE;
        }
        Merchandise merchandiseS = dVar.d().s();
        return Boolean.valueOf(merchandiseS.quantity == i && merchandiseS.monthType());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m22804r() {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m22808v(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public final AbsPurchaseSectionView m22810A() {
        if (sab0.i(this.f20488e)) {
            ODiamondAllPriceSectionView oDiamondAllPriceSectionView = (ODiamondAllPriceSectionView) o7r.a(this.f20487d).inflate(m6c0.p0, (ViewGroup) this.f20485b, false);
            oDiamondAllPriceSectionView.setInVipFrag(TextUtils.equals(this.f20489f, "PrivilegeODiamondContent"));
            oDiamondAllPriceSectionView.m7718n(this.f20509z);
            return oDiamondAllPriceSectionView;
        }
        if (CoreModule.m1854P().m11706a().m5466k() && sab0.n(this.f20490g)) {
            return (PicksTimesPurchaseSectionView) o7r.a(this.f20487d).inflate(m6c0.s0, (ViewGroup) this.f20485b, false);
        }
        if (CoreModule.m1854P().m11706a().m5461j3() && TEnum.equals(this.f20493j, "alipay") && CoreModule.f1534c.f3580O0.m2014u3(this.f20490g)) {
            return (NewUIPurchaseSectionViewAutoPay) o7r.a(this.f20487d).inflate(m6c0.q0, (ViewGroup) this.f20485b, false);
        }
        NewUITotalPricePurchaseSectionView1 newUITotalPricePurchaseSectionView1 = (NewUITotalPricePurchaseSectionView1) o7r.a(this.f20487d).inflate(m6c0.r0, (ViewGroup) this.f20485b, false);
        newUITotalPricePurchaseSectionView1.m7687o(this.f20509z);
        return newUITotalPricePurchaseSectionView1;
    }

    /* JADX INFO: renamed from: B */
    public d m22811B(final int i) {
        return (d) vwb.r(this.f20496m, new w9j() { // from class: l.pc40
            public final Object call(Object obj) {
                return rc40.m22799m(i, (d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public Merchandise m22812C(final int i) {
        d dVar = (d) vwb.r(this.f20496m, new w9j() { // from class: l.lc40
            public final Object call(Object obj) {
                return rc40.m22802p(i, (d) obj);
            }
        });
        if (NullChecker.a(dVar)) {
            return dVar.d().s();
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final AbsPurchaseSectionView m22813D(int i, final List<d> list) {
        if (i < this.f20485b.getChildCount()) {
            return (AbsPurchaseSectionView) this.f20485b.getChildAt(i);
        }
        final d dVar = list.get(i);
        AbsPurchaseSectionView absPurchaseSectionViewM22810A = m22810A();
        absPurchaseSectionViewM22810A.setOnClickListener(new View.OnClickListener() { // from class: l.jc40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15106a.m22820K(dVar, list, view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f20501r, -1);
        if (i != 0) {
            layoutParams.leftMargin = t100.g;
        }
        this.f20485b.addView(absPurchaseSectionViewM22810A, layoutParams);
        return absPurchaseSectionViewM22810A;
    }

    /* JADX INFO: renamed from: E */
    public View m22814E(boolean z) {
        this.f20503t = z;
        return this.f20502s.d(z);
    }

    /* JADX INFO: renamed from: F */
    public boolean m22815F() {
        if (NullChecker.a(this.f20502s) && (this.f20502s instanceof a)) {
            return this.f20499p;
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void m22816G(boolean z) {
        this.f20506w = z;
    }

    /* JADX INFO: renamed from: H */
    public boolean m22817H() {
        return m22818I(this.f20496m);
    }

    /* JADX INFO: renamed from: I */
    public boolean m22818I(List<d> list) {
        for (d dVar : list) {
            if (dVar.d() == null || dVar.b() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m22819J() {
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m22820K(d dVar, List list, View view) {
        if (dVar.l()) {
            return;
        }
        vwb.z(list, new e30() { // from class: l.dc40
            public final void call(Object obj) {
                ((d) obj).v(false);
            }
        });
        dVar.v(true);
        m22794X(list);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m22823N() {
        m22837d0(true);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m22824O() {
        m22837d0(true);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m22825P() {
        m22837d0(true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m22826Q(PurchaseType purchaseType, Boolean bool) {
        AgreementComponent.AgreementState agreementState = this.f20498o;
        this.f20498o = bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked;
        this.f20499p = bool.booleanValue();
        if (NullChecker.a(this.f20500q)) {
            this.f20500q.call(Boolean.valueOf(this.f20499p));
        }
        dsa.m14201i(bool.booleanValue());
        if (t4b.m24454d()) {
            if (sab0.w(purchaseType) || sab0.q(purchaseType)) {
                boolean zBooleanValue = this.f20502s.c().booleanValue();
                AgreementComponent.AgreementState agreementState2 = this.f20498o;
                if (zBooleanValue) {
                    m22829T(agreementState, agreementState2, new d30() { // from class: l.mc40
                        public final void call() {
                            this.f16895a.m22823N();
                        }
                    });
                    return;
                } else {
                    m22821L(agreementState2);
                    return;
                }
            }
            if (sab0.i(purchaseType)) {
                if (!this.f20502s.c().booleanValue() || this.f20506w) {
                    return;
                }
                m22828S(this.f20498o, new d30() { // from class: l.nc40
                    public final void call() {
                        this.f17587a.m22824O();
                    }
                });
                return;
            }
            if (sab0.o(purchaseType) && this.f20502s.c().booleanValue() && !this.f20506w) {
                m22830U(this.f20498o, new d30() { // from class: l.oc40
                    public final void call() {
                        this.f18144a.m22825P();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void m22827R() {
        this.f20499p = true;
        if (NullChecker.a(this.f20502s)) {
            a aVar = this.f20502s;
            if (aVar instanceof a) {
                aVar.m();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m22828S(AgreementComponent.AgreementState agreementState, final d30 d30Var) {
        if (agreementState == AgreementComponent.AgreementState.unchecked) {
            aze0.m12358a(this.f20487d, this.f20490g, this.f20491h, new d30() { // from class: l.gc40
                public final void call() {
                    rc40.m22798l(d30Var);
                }
            }, new d30() { // from class: l.hc40
                public final void call() {
                    rc40.m22804r();
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public void m22829T(AgreementComponent.AgreementState agreementState, final AgreementComponent.AgreementState agreementState2, final d30 d30Var) {
        if (this.f20491h == null || vwb.J(this.f20495l)) {
            return;
        }
        mo13099b();
        int i = C1214a.f20510a[agreementState2.ordinal()];
        if (i == 1) {
            m22821L(agreementState2);
            return;
        }
        if (i == 2 && agreementState != AgreementComponent.AgreementState.hidden) {
            if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f20490g && e.x(this.f20489f)) {
                m22821L(agreementState2);
            } else {
                aze0.m12358a(this.f20487d, this.f20490g, this.f20491h, new d30() { // from class: l.ec40
                    public final void call() {
                        rc40.m22808v(d30Var);
                    }
                }, new d30() { // from class: l.fc40
                    public final void call() {
                        this.f12642a.m22821L(agreementState2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m22830U(AgreementComponent.AgreementState agreementState, d30 d30Var) {
        m22828S(agreementState, d30Var);
    }

    /* JADX INFO: renamed from: V */
    public final void m22831V(PayMethod payMethod) {
        this.f20493j = payMethod;
        if (vwb.J(this.f20495l)) {
            return;
        }
        m22840z(this.f20507x.m22730j(this.f20498o, this.f20493j));
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m22822M() {
        int measuredWidth = this.f20508y.getMeasuredWidth();
        if (measuredWidth <= (this.f20485b.getChildCount() * this.f20501r) + ((this.f20485b.getChildCount() - 1) * t100.g) + (this.f20483A * 2) || this.f20485b.getChildCount() <= 0) {
            return;
        }
        int childCount = ((measuredWidth - (this.f20483A * 2)) - ((this.f20485b.getChildCount() - 1) * t100.d(6.0f))) / this.f20485b.getChildCount();
        for (int i = 0; i < this.f20485b.getChildCount(); i++) {
            View childAt = this.f20485b.getChildAt(i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(childCount, -1);
            if (i != 0) {
                layoutParams.leftMargin = t100.g;
            }
            childAt.setLayoutParams(layoutParams);
        }
        this.f20508y.invalidate();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m22833Z(int i, d30 d30Var) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.f20496m.size();
            List<d> list = this.f20496m;
            if (i2 >= size) {
                m22794X(list);
                this.f20484a.smoothScrollTo((t100.d(106.0f) * i3) + t100.g, 0);
                Act act = this.f20487d;
                Objects.requireNonNull(d30Var);
                e51.H(act, new bii0(d30Var), 500L);
                return true;
            }
            d dVar = list.get(i2);
            if (NullChecker.a(dVar.b())) {
                Merchandise merchandiseS = dVar.b().s();
                if (merchandiseS.quantity == i && merchandiseS.monthType()) {
                    dVar.v(true);
                    i3 = i2;
                } else {
                    dVar.v(false);
                }
            } else if (NullChecker.a(dVar.d())) {
                dVar.v(false);
            }
            i2++;
        }
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: a */
    public View mo13098a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f20487d.inflater().inflate(m6c0.u2, viewGroup, false);
        m22838x(viewInflate);
        LinearLayout linearLayout = this.f20485b;
        int i = this.f20483A;
        linearLayout.setPadding(i, 0, i, 0);
        boolean zM22819J = m22819J();
        FrameLayout frameLayout = this.f20486c;
        if (zM22819J) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = t100.g;
            this.f20486c.setLayoutParams(layoutParams);
        } else {
            frameLayout.addView(m22814E(false));
        }
        this.f20508y = viewInflate;
        return viewInflate;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m22834a0(final int i, d30 d30Var) {
        if (!NullChecker.a((d) vwb.r(this.f20496m, new w9j() { // from class: l.qc40
            public final Object call(Object obj) {
                d dVar = (d) obj;
                return Boolean.valueOf(NullChecker.a(dVar.d()) && dVar.d().s().quantity == i && dVar.d().s().monthType());
            }
        }))) {
            dsa.m14215w();
            return false;
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int size = this.f20496m.size();
            List<d> list = this.f20496m;
            if (i3 >= size) {
                m22794X(list);
                this.f20484a.smoothScrollTo((t100.d(106.0f) * i2) + t100.g, 0);
                Act act = this.f20487d;
                Objects.requireNonNull(d30Var);
                e51.H(act, new bii0(d30Var), 500L);
                return true;
            }
            d dVar = list.get(i3);
            if (NullChecker.a(dVar.d())) {
                Merchandise merchandiseS = dVar.d().s();
                if (merchandiseS.quantity == i && merchandiseS.monthType()) {
                    dVar.v(true);
                    i2 = i3;
                } else {
                    dVar.v(false);
                }
            } else if (NullChecker.a(dVar.b())) {
                dVar.v(false);
            }
            i3++;
        }
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: b */
    public void mo13099b() {
        d dVar = this.f20497n;
        if (dVar == null || this.f20492i == null) {
            this.f20491h = dVar;
            this.f20490g = this.f20488e;
        } else {
            this.f20491h = dVar;
            this.f20490g = this.f20488e;
            m22836c0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m22835b0(e30<Boolean> e30Var) {
        this.f20500q = e30Var;
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: c */
    public void mo13100c(b90 b90Var) {
        this.f20492i = b90Var;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m22836c0() {
        CharSequence charSequenceG;
        final PurchaseType purchaseType = this.f20490g;
        boolean zM = this.f20491h.m();
        d dVar = this.f20491h;
        Merchandise merchandiseS = (zM ? dVar.b() : dVar.d()).s();
        if (!merchandiseS.autoRenewable() && (!m22817H() || TEnum.equals(this.f20493j, "jingdong") || (!TEnum.equals(this.f20493j, "wechat") && this.f20498o == AgreementComponent.AgreementState.hidden))) {
            boolean z = this.f20509z;
            boolean z2 = this.f20503t;
            charSequenceG = z ? we60.E(purchaseType, z2) : we60.m(purchaseType, z2);
        } else if (sab0.o(purchaseType)) {
            charSequenceG = TextUtils.equals(this.f20489f, "PrivilegePlatinumContent") ? we60.C(merchandiseS, we60.R(true)) : we60.C(merchandiseS, we60.R(false));
        } else if (CoreModule.m1854P().m11706a().m19879f() && sab0.i(purchaseType)) {
            if (this.f20509z) {
                charSequenceG = we60.B(merchandiseS);
            } else {
                charSequenceG = TextUtils.equals(this.f20489f, "PrivilegeODiamondContent") ? we60.A(merchandiseS, we60.Q(true)) : we60.A(merchandiseS, we60.Q(false));
            }
        } else if (sab0.q(purchaseType)) {
            if (merchandiseS.monthly() && merchandiseS.autoRenewable() && rxa0.k(merchandiseS)) {
                boolean z3 = this.f20505v;
                StockKeepUnit stockKeepUnit = merchandiseS.defaultStockKeepUnit;
                charSequenceG = z3 ? we60.y(stockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandiseS.defaultStockKeepUnit.prices.price)) : we60.L(stockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandiseS.defaultStockKeepUnit.prices.price));
            } else if (rxa0.p(merchandiseS, ProductCategory.get("svip"), "lowPriceCustomerSVIP")) {
                boolean zEquals = TEnum.equals(this.f20493j, "wechat");
                boolean z4 = this.f20505v;
                if (zEquals) {
                    boolean z5 = this.f20503t;
                    charSequenceG = z4 ? we60.u(merchandiseS, purchaseType, z5) : we60.I(merchandiseS, purchaseType, z5);
                } else {
                    boolean z6 = this.f20503t;
                    charSequenceG = z4 ? we60.t(merchandiseS, purchaseType, z6) : we60.H(merchandiseS, purchaseType, z6);
                }
            } else if (rxa0.p(merchandiseS, ProductCategory.get("svip"), "lowPriceCustomerUpliftSVIP")) {
                boolean zEquals2 = TEnum.equals(this.f20493j, "wechat");
                boolean z7 = this.f20505v;
                if (zEquals2) {
                    boolean z8 = this.f20503t;
                    charSequenceG = z7 ? we60.u(merchandiseS, purchaseType, z8) : we60.I(merchandiseS, purchaseType, z8);
                } else {
                    boolean z9 = this.f20503t;
                    charSequenceG = z7 ? we60.t(merchandiseS, purchaseType, z9) : we60.H(merchandiseS, purchaseType, z9);
                }
            } else if (this.f20505v && rxa0.v("svip", merchandiseS)) {
                charSequenceG = we60.t(merchandiseS, purchaseType, this.f20503t);
            } else {
                boolean z10 = this.f20505v;
                boolean z11 = this.f20503t;
                charSequenceG = z10 ? we60.x(purchaseType, z11) : we60.G(purchaseType, z11);
            }
        } else if (sab0.w(purchaseType)) {
            if (xni.c() && rxa0.p(merchandiseS, ProductCategory.get("tttVip"), "lowPrice3Month")) {
                charSequenceG = this.f20505v ? we60.s(this.f20487d, merchandiseS, purchaseType) : we60.H(merchandiseS, purchaseType, this.f20503t);
            } else if (xni.c() && (rxa0.p(merchandiseS, ProductCategory.get("tttVip"), "lowPriceCustomerVIP") || (this.f20505v && rxa0.v("tttVip", merchandiseS)))) {
                boolean z12 = this.f20505v;
                boolean z13 = this.f20503t;
                charSequenceG = z12 ? we60.t(merchandiseS, purchaseType, z13) : we60.H(merchandiseS, purchaseType, z13);
            } else {
                boolean z14 = this.f20505v;
                boolean z15 = this.f20503t;
                charSequenceG = z14 ? we60.x(purchaseType, z15) : we60.G(purchaseType, z15);
            }
        } else if (!CoreModule.m1854P().m11706a().m5466k() || PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP != purchaseType) {
            charSequenceG = (CoreModule.m1854P().m11706a().m5466k() && PurchaseType.TYPE_PICKS_MEMBERSHIP == purchaseType) ? we60.G(purchaseType, this.f20503t) : "";
        } else if (rxa0.p(merchandiseS, ProductCategory.get("svipPicksMembership"), "lowPriceSVIPPicks") || rxa0.p(merchandiseS, ProductCategory.get("svip"), "lowPriceCustomerSVIP")) {
            charSequenceG = we60.H(merchandiseS, purchaseType, this.f20503t);
        } else {
            boolean zP = rxa0.p(merchandiseS, ProductCategory.get("svip"), "lowPriceCustomerUpliftSVIP");
            boolean z16 = this.f20503t;
            charSequenceG = zP ? we60.H(merchandiseS, purchaseType, z16) : we60.G(purchaseType, z16);
        }
        if (NullChecker.a(this.f20502s)) {
            this.f20502s.b(charSequenceG);
            a aVar = this.f20502s;
            if (aVar instanceof a) {
                aVar.n(new e30() { // from class: l.kc40
                    public final void call(Object obj) {
                        this.f15691a.m22826Q(purchaseType, (Boolean) obj);
                    }
                });
                this.f20502s.o(this.f20491h, this.f20490g, this.f20499p, this.f20503t, m22817H() && this.f20498o != AgreementComponent.AgreementState.hidden, this.f20493j);
            }
        }
        if (NullChecker.a(this.f20504u)) {
            this.f20504u.call(charSequenceG);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m22837d0(boolean z) {
        this.f20499p = z;
        if (NullChecker.a(this.f20502s)) {
            a aVar = this.f20502s;
            if (aVar instanceof a) {
                aVar.h(this.f20499p);
            }
        }
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: e */
    public void mo13101e(PayMethod payMethod) {
        if (this.f20493j != payMethod) {
            this.f20493j = payMethod;
            if (!t4b.m24454d() && sab0.q(this.f20488e) && TEnum.equals(this.f20493j, "wechat")) {
                this.f20498o = AgreementComponent.AgreementState.checked;
            }
            m22831V(payMethod);
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
    @Override // p006l.msl
    /* JADX INFO: renamed from: g */
    public void mo19506g(boolean z) {
        AgreementComponent.AgreementState agreementState;
        AgreementComponent.AgreementState agreementStateA;
        b bVar;
        if (vwb.J(this.f20495l)) {
            return;
        }
        if (z) {
            AgreementComponent.AgreementState agreementState2 = this.f20498o;
            AgreementComponent.AgreementState agreementState3 = AgreementComponent.AgreementState.hidden;
            if (agreementState2 != agreementState3) {
                this.f20498o = agreementState3;
            } else {
                if (!z) {
                    return;
                }
                agreementState = this.f20498o;
                agreementStateA = AgreementComponent.AgreementState.checked;
                if (agreementState != agreementStateA) {
                    return;
                }
                if (t4b.m24455e(this.f20488e) || !m22818I(this.f20495l)) {
                    if (this.f20485b == null) {
                        return;
                    } else {
                        this.f20498o = agreementStateA;
                    }
                } else if (this.f20485b == null || (bVar = this.f20502s) == null) {
                    this.f20498o = agreementStateA;
                } else {
                    if (bVar.a() != null) {
                        agreementStateA = this.f20502s.a();
                    }
                    if (agreementStateA == this.f20498o) {
                        return;
                    } else {
                        this.f20498o = agreementStateA;
                    }
                }
            }
        } else {
            if (!z) {
                return;
            }
            agreementState = this.f20498o;
            agreementStateA = AgreementComponent.AgreementState.checked;
            if (agreementState != agreementStateA) {
                return;
            }
            if (t4b.m24455e(this.f20488e)) {
                if (this.f20485b == null) {
                    return;
                } else {
                    this.f20498o = agreementStateA;
                }
            } else if (this.f20485b == null) {
                return;
            } else {
                this.f20498o = agreementStateA;
            }
        }
        m22840z(this.f20507x.m22730j(this.f20498o, this.f20493j));
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: h */
    public void mo13103h(List<d> list, e30<d> e30Var, e30<Integer> e30Var2) {
        this.f20494k = e30Var;
        this.f20495l = list;
        if (t4b.m24455e(this.f20488e) && m22818I(list)) {
            PurchaseType purchaseType = this.f20488e;
            this.f20507x = new r9b0(purchaseType, list, vwb.f0(new AbstractC1073o5[]{new obq0(purchaseType, list), new hi0(this.f20488e, list), new ei0(this.f20488e, list), new xi0(this.f20488e, list), new uw40(this.f20488e, list)}));
        } else {
            this.f20507x = new r9b0(this.f20488e, list);
        }
        m22840z(this.f20507x.m22730j(this.f20498o, this.f20493j));
    }

    /* JADX INFO: renamed from: x */
    public final void m22838x(View view) {
        sc40.a(this, view);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m22821L(AgreementComponent.AgreementState agreementState) {
        if (vwb.J(this.f20495l)) {
            return;
        }
        boolean z = agreementState == AgreementComponent.AgreementState.checked;
        if (m22817H()) {
            for (d dVar : this.f20495l) {
                dVar.w(z);
                dVar.p("changeAutoRenew:" + z);
            }
        }
        m22840z(this.f20507x.m22730j(agreementState, this.f20493j));
    }

    /* JADX INFO: renamed from: z */
    public final void m22840z(List<d> list) {
        this.f20485b.removeAllViews();
        this.f20496m.clear();
        this.f20496m.addAll(list);
        m22794X(this.f20496m);
    }

    @Override // p006l.c3m
    public void release() {
    }
}
