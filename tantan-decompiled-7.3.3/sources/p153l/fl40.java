package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.AgreementComponent;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.C8922a;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.InterfaceC8923b;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUIPurchaseSectionViewAutoPay;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUITotalPricePurchaseSectionView1;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.ODiamondAllPriceSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.PicksTimesPurchaseSectionView;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class fl40 implements t5m, zul {

    /* JADX INFO: renamed from: A */
    public int f99589A;

    /* JADX INFO: renamed from: a */
    public HorizontalScrollView f99590a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f99591b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f99592c;

    /* JADX INFO: renamed from: d */
    public final Act f99593d;

    /* JADX INFO: renamed from: e */
    public final PurchaseType f99594e;

    /* JADX INFO: renamed from: f */
    public final String f99595f;

    /* JADX INFO: renamed from: g */
    public PurchaseType f99596g;

    /* JADX INFO: renamed from: h */
    public C8928d f99597h;

    /* JADX INFO: renamed from: i */
    public x80 f99598i;

    /* JADX INFO: renamed from: j */
    public PayMethod f99599j;

    /* JADX INFO: renamed from: k */
    public y20<C8928d> f99600k;

    /* JADX INFO: renamed from: l */
    public List<C8928d> f99601l;

    /* JADX INFO: renamed from: m */
    public final List<C8928d> f99602m;

    /* JADX INFO: renamed from: n */
    public C8928d f99603n;

    /* JADX INFO: renamed from: o */
    public AgreementComponent.AgreementState f99604o;

    /* JADX INFO: renamed from: p */
    public boolean f99605p;

    /* JADX INFO: renamed from: q */
    public y20<Boolean> f99606q;

    /* JADX INFO: renamed from: r */
    public final int f99607r;

    /* JADX INFO: renamed from: s */
    public InterfaceC8923b f99608s;

    /* JADX INFO: renamed from: t */
    public boolean f99609t;

    /* JADX INFO: renamed from: u */
    public y20<CharSequence> f99610u;

    /* JADX INFO: renamed from: v */
    public boolean f99611v;

    /* JADX INFO: renamed from: w */
    public boolean f99612w;

    /* JADX INFO: renamed from: x */
    public vhb0 f99613x;

    /* JADX INFO: renamed from: y */
    public View f99614y;

    /* JADX INFO: renamed from: z */
    public boolean f99615z;

    /* JADX INFO: renamed from: l.fl40$a */
    public static /* synthetic */ class C17005a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99616a;

        static {
            int[] iArr = new int[AgreementComponent.AgreementState.values().length];
            f99616a = iArr;
            try {
                iArr[AgreementComponent.AgreementState.checked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99616a[AgreementComponent.AgreementState.unchecked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: W */
    private void m126067W(AbsPurchaseSectionView absPurchaseSectionView, C8928d c8928d, boolean z) {
        C8928d.a aVarM54705d;
        if (m126091H()) {
            aVarM54705d = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        } else {
            aVarM54705d = NullChecker.m82486a(c8928d.m54705d()) ? c8928d.m54705d() : c8928d.m54703b();
        }
        absPurchaseSectionView.m55508b(z, aVarM54705d.m54784s().autoRenewable(), aVarM54705d, this.f99599j);
    }

    /* JADX INFO: renamed from: X */
    private void m126068X(List<C8928d> list) {
        for (int i = 0; i < list.size(); i++) {
            C8928d c8928d = list.get(i);
            m126067W(m126087D(i, list), c8928d, c8928d.m54713l());
            if (c8928d.m54713l()) {
                this.f99603n = c8928d;
                mo126110b();
                m126113c0();
                if (NullChecker.m82486a(this.f99600k)) {
                    this.f99600k.call(this.f99603n);
                }
            }
        }
        if (m126091H() && NullChecker.m82486a(this.f99591b) && NullChecker.m82486a(this.f99614y)) {
            if (this.f99614y.getMeasuredWidth() == 0) {
                this.f99591b.post(new Runnable() { // from class: l.qk40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f158096a.m126096M();
                    }
                });
            } else {
                l51.m152893M(new Runnable() { // from class: l.wk40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f189527a.m126096M();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m126072l(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Boolean m126073m(int i, C8928d c8928d) {
        if (!NullChecker.m82486a(c8928d.m54703b())) {
            return Boolean.FALSE;
        }
        Merchandise merchandiseM54784s = c8928d.m54703b().m54784s();
        return Boolean.valueOf(merchandiseM54784s.quantity == i && merchandiseM54784s.monthType());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Boolean m126076p(int i, C8928d c8928d) {
        if (!NullChecker.m82486a(c8928d.m54705d())) {
            return Boolean.FALSE;
        }
        Merchandise merchandiseM54784s = c8928d.m54705d().m54784s();
        return Boolean.valueOf(merchandiseM54784s.quantity == i && merchandiseM54784s.monthType());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m126078r() {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m126082v(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: A */
    public final AbsPurchaseSectionView m126084A() {
        if (wib0.m206565i(this.f99594e)) {
            ODiamondAllPriceSectionView oDiamondAllPriceSectionView = (ODiamondAllPriceSectionView) p9r.m171370a(this.f99593d).inflate(rec0.f162590p0, (ViewGroup) this.f99591b, false);
            oDiamondAllPriceSectionView.setInVipFrag(TextUtils.equals(this.f99595f, "PrivilegeODiamondContent"));
            oDiamondAllPriceSectionView.m55566n(this.f99615z);
            return oDiamondAllPriceSectionView;
        }
        if (CoreModule.m30933P().m143405a().mo34532k() && wib0.m206570n(this.f99596g)) {
            return (PicksTimesPurchaseSectionView) p9r.m171370a(this.f99593d).inflate(rec0.f162602s0, (ViewGroup) this.f99591b, false);
        }
        if (CoreModule.m30933P().m143405a().mo34527j3() && TEnum.equals(this.f99599j, "alipay") && CoreModule.f18264c.f20333O0.m31084u3(this.f99596g)) {
            return (NewUIPurchaseSectionViewAutoPay) p9r.m171370a(this.f99593d).inflate(rec0.f162594q0, (ViewGroup) this.f99591b, false);
        }
        NewUITotalPricePurchaseSectionView1 newUITotalPricePurchaseSectionView1 = (NewUITotalPricePurchaseSectionView1) p9r.m171370a(this.f99593d).inflate(rec0.f162598r0, (ViewGroup) this.f99591b, false);
        newUITotalPricePurchaseSectionView1.m55535o(this.f99615z);
        return newUITotalPricePurchaseSectionView1;
    }

    /* JADX INFO: renamed from: B */
    public C8928d m126085B(final int i) {
        return (C8928d) jyb.m147529r(this.f99602m, new qcj() { // from class: l.dl40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fl40.m126073m(i, (C8928d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public Merchandise m126086C(final int i) {
        C8928d c8928d = (C8928d) jyb.m147529r(this.f99602m, new qcj() { // from class: l.zk40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fl40.m126076p(i, (C8928d) obj);
            }
        });
        if (NullChecker.m82486a(c8928d)) {
            return c8928d.m54705d().m54784s();
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final AbsPurchaseSectionView m126087D(int i, final List<C8928d> list) {
        if (i < this.f99591b.getChildCount()) {
            return (AbsPurchaseSectionView) this.f99591b.getChildAt(i);
        }
        final C8928d c8928d = list.get(i);
        AbsPurchaseSectionView absPurchaseSectionViewM126084A = m126084A();
        absPurchaseSectionViewM126084A.setOnClickListener(new View.OnClickListener() { // from class: l.xk40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194709a.m126094K(c8928d, list, view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f99607r, -1);
        if (i != 0) {
            layoutParams.leftMargin = qa00.f156320g;
        }
        this.f99591b.addView(absPurchaseSectionViewM126084A, layoutParams);
        return absPurchaseSectionViewM126084A;
    }

    /* JADX INFO: renamed from: E */
    public View m126088E(boolean z) {
        this.f99609t = z;
        return this.f99608s.mo54392d(z);
    }

    /* JADX INFO: renamed from: F */
    public boolean m126089F() {
        if (NullChecker.m82486a(this.f99608s) && (this.f99608s instanceof C8922a)) {
            return this.f99605p;
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void m126090G(boolean z) {
        this.f99612w = z;
    }

    /* JADX INFO: renamed from: H */
    public boolean m126091H() {
        return m126092I(this.f99602m);
    }

    /* JADX INFO: renamed from: I */
    public boolean m126092I(List<C8928d> list) {
        for (C8928d c8928d : list) {
            if (c8928d.m54705d() == null || c8928d.m54703b() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m126093J() {
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m126094K(C8928d c8928d, List list, View view) {
        if (c8928d.m54713l()) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.rk40
            @Override // p153l.y20
            public final void call(Object obj) {
                ((C8928d) obj).m54723v(false);
            }
        });
        c8928d.m54723v(true);
        m126068X(list);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m126097N() {
        m126114d0(true);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m126098O() {
        m126114d0(true);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m126099P() {
        m126114d0(true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m126100Q(PurchaseType purchaseType, Boolean bool) {
        AgreementComponent.AgreementState agreementState = this.f99604o;
        this.f99604o = bool.booleanValue() ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked;
        this.f99605p = bool.booleanValue();
        if (NullChecker.m82486a(this.f99606q)) {
            this.f99606q.call(Boolean.valueOf(this.f99605p));
        }
        pta.m173716i(bool.booleanValue());
        if (g6b.m129214d()) {
            if (wib0.m206579w(purchaseType) || wib0.m206573q(purchaseType)) {
                boolean zBooleanValue = this.f99608s.mo54391c().booleanValue();
                AgreementComponent.AgreementState agreementState2 = this.f99604o;
                if (zBooleanValue) {
                    m126103T(agreementState, agreementState2, new x20() { // from class: l.al40
                        @Override // p153l.x20
                        public final void call() {
                            this.f72071a.m126097N();
                        }
                    });
                    return;
                } else {
                    m126095L(agreementState2);
                    return;
                }
            }
            if (wib0.m206565i(purchaseType)) {
                if (!this.f99608s.mo54391c().booleanValue() || this.f99612w) {
                    return;
                }
                m126102S(this.f99604o, new x20() { // from class: l.bl40
                    @Override // p153l.x20
                    public final void call() {
                        this.f77145a.m126098O();
                    }
                });
                return;
            }
            if (wib0.m206571o(purchaseType) && this.f99608s.mo54391c().booleanValue() && !this.f99612w) {
                m126104U(this.f99604o, new x20() { // from class: l.cl40
                    @Override // p153l.x20
                    public final void call() {
                        this.f82346a.m126099P();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void m126101R() {
        this.f99605p = true;
        if (NullChecker.m82486a(this.f99608s)) {
            InterfaceC8923b interfaceC8923b = this.f99608s;
            if (interfaceC8923b instanceof C8922a) {
                ((C8922a) interfaceC8923b).m54399m();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m126102S(AgreementComponent.AgreementState agreementState, final x20 x20Var) {
        if (agreementState == AgreementComponent.AgreementState.unchecked) {
            h7f0.m133793a(this.f99593d, this.f99596g, this.f99597h, new x20() { // from class: l.uk40
                @Override // p153l.x20
                public final void call() {
                    fl40.m126072l(x20Var);
                }
            }, new x20() { // from class: l.vk40
                @Override // p153l.x20
                public final void call() {
                    fl40.m126078r();
                }
            });
        }
    }

    /* JADX INFO: renamed from: T */
    public void m126103T(AgreementComponent.AgreementState agreementState, final AgreementComponent.AgreementState agreementState2, final x20 x20Var) {
        if (this.f99597h == null || jyb.m147479J(this.f99601l)) {
            return;
        }
        mo126110b();
        int i = C17005a.f99616a[agreementState2.ordinal()];
        if (i == 1) {
            m126095L(agreementState2);
            return;
        }
        if (i == 2 && agreementState != AgreementComponent.AgreementState.hidden) {
            if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.f99596g && C8929e.m54833x(this.f99595f)) {
                m126095L(agreementState2);
            } else {
                h7f0.m133793a(this.f99593d, this.f99596g, this.f99597h, new x20() { // from class: l.sk40
                    @Override // p153l.x20
                    public final void call() {
                        fl40.m126082v(x20Var);
                    }
                }, new x20() { // from class: l.tk40
                    @Override // p153l.x20
                    public final void call() {
                        this.f174650a.m126095L(agreementState2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m126104U(AgreementComponent.AgreementState agreementState, x20 x20Var) {
        m126102S(agreementState, x20Var);
    }

    /* JADX INFO: renamed from: V */
    public final void m126105V(PayMethod payMethod) {
        this.f99599j = payMethod;
        if (jyb.m147479J(this.f99601l)) {
            return;
        }
        m126120z(this.f99613x.m201275j(this.f99604o, this.f99599j));
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m126096M() {
        int measuredWidth = this.f99614y.getMeasuredWidth();
        if (measuredWidth <= (this.f99591b.getChildCount() * this.f99607r) + ((this.f99591b.getChildCount() - 1) * qa00.f156320g) + (this.f99589A * 2) || this.f99591b.getChildCount() <= 0) {
            return;
        }
        int childCount = ((measuredWidth - (this.f99589A * 2)) - ((this.f99591b.getChildCount() - 1) * qa00.m175859d(6.0f))) / this.f99591b.getChildCount();
        for (int i = 0; i < this.f99591b.getChildCount(); i++) {
            View childAt = this.f99591b.getChildAt(i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(childCount, -1);
            if (i != 0) {
                layoutParams.leftMargin = qa00.f156320g;
            }
            childAt.setLayoutParams(layoutParams);
        }
        this.f99614y.invalidate();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m126107Z(int i, x20 x20Var) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.f99602m.size();
            List<C8928d> list = this.f99602m;
            if (i2 >= size) {
                m126068X(list);
                this.f99590a.smoothScrollTo((qa00.m175859d(106.0f) * i3) + qa00.f156320g, 0);
                Act act = this.f99593d;
                Objects.requireNonNull(x20Var);
                l51.m152888H(act, new bri0(x20Var), 500L);
                return true;
            }
            C8928d c8928d = list.get(i2);
            if (NullChecker.m82486a(c8928d.m54703b())) {
                Merchandise merchandiseM54784s = c8928d.m54703b().m54784s();
                if (merchandiseM54784s.quantity == i && merchandiseM54784s.monthType()) {
                    c8928d.m54723v(true);
                    i3 = i2;
                } else {
                    c8928d.m54723v(false);
                }
            } else if (NullChecker.m82486a(c8928d.m54705d())) {
                c8928d.m54723v(false);
            }
            i2++;
        }
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: a */
    public View mo126108a(ViewGroup viewGroup, boolean z) {
        View viewInflate = this.f99593d.inflater().inflate(rec0.f162612u2, viewGroup, false);
        m126118x(viewInflate);
        LinearLayout linearLayout = this.f99591b;
        int i = this.f99589A;
        linearLayout.setPadding(i, 0, i, 0);
        boolean zM126093J = m126093J();
        FrameLayout frameLayout = this.f99592c;
        if (zM126093J) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = qa00.f156320g;
            this.f99592c.setLayoutParams(layoutParams);
        } else {
            frameLayout.addView(m126088E(false));
        }
        this.f99614y = viewInflate;
        return viewInflate;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m126109a0(final int i, x20 x20Var) {
        if (!NullChecker.m82486a((C8928d) jyb.m147529r(this.f99602m, new qcj() { // from class: l.el40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                C8928d c8928d = (C8928d) obj;
                return Boolean.valueOf(NullChecker.m82486a(c8928d.m54705d()) && c8928d.m54705d().m54784s().quantity == i && c8928d.m54705d().m54784s().monthType());
            }
        }))) {
            pta.m173730w();
            return false;
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int size = this.f99602m.size();
            List<C8928d> list = this.f99602m;
            if (i3 >= size) {
                m126068X(list);
                this.f99590a.smoothScrollTo((qa00.m175859d(106.0f) * i2) + qa00.f156320g, 0);
                Act act = this.f99593d;
                Objects.requireNonNull(x20Var);
                l51.m152888H(act, new bri0(x20Var), 500L);
                return true;
            }
            C8928d c8928d = list.get(i3);
            if (NullChecker.m82486a(c8928d.m54705d())) {
                Merchandise merchandiseM54784s = c8928d.m54705d().m54784s();
                if (merchandiseM54784s.quantity == i && merchandiseM54784s.monthType()) {
                    c8928d.m54723v(true);
                    i2 = i3;
                } else {
                    c8928d.m54723v(false);
                }
            } else if (NullChecker.m82486a(c8928d.m54703b())) {
                c8928d.m54723v(false);
            }
            i3++;
        }
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: b */
    public void mo126110b() {
        C8928d c8928d = this.f99603n;
        if (c8928d == null || this.f99598i == null) {
            this.f99597h = c8928d;
            this.f99596g = this.f99594e;
        } else {
            this.f99597h = c8928d;
            this.f99596g = this.f99594e;
            m126113c0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m126111b0(y20<Boolean> y20Var) {
        this.f99606q = y20Var;
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: c */
    public void mo126112c(x80 x80Var) {
        this.f99598i = x80Var;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m126113c0() {
        CharSequence charSequenceM105324G;
        final PurchaseType purchaseType = this.f99596g;
        boolean zM54714m = this.f99597h.m54714m();
        C8928d c8928d = this.f99597h;
        Merchandise merchandiseM54784s = (zM54714m ? c8928d.m54703b() : c8928d.m54705d()).m54784s();
        if (!merchandiseM54784s.autoRenewable() && (!m126091H() || TEnum.equals(this.f99599j, PayMethod.jingdong) || (!TEnum.equals(this.f99599j, "wechat") && this.f99604o == AgreementComponent.AgreementState.hidden))) {
            boolean z = this.f99615z;
            boolean z2 = this.f99609t;
            charSequenceM105324G = z ? bn60.m105322E(purchaseType, z2) : bn60.m105354m(purchaseType, z2);
        } else if (wib0.m206571o(purchaseType)) {
            charSequenceM105324G = TextUtils.equals(this.f99595f, "PrivilegePlatinumContent") ? bn60.m105320C(merchandiseM54784s, bn60.m105335R(true)) : bn60.m105320C(merchandiseM54784s, bn60.m105335R(false));
        } else if (CoreModule.m30933P().m143405a().mo180463f() && wib0.m206565i(purchaseType)) {
            if (this.f99615z) {
                charSequenceM105324G = bn60.m105319B(merchandiseM54784s);
            } else {
                charSequenceM105324G = TextUtils.equals(this.f99595f, "PrivilegeODiamondContent") ? bn60.m105318A(merchandiseM54784s, bn60.m105334Q(true)) : bn60.m105318A(merchandiseM54784s, bn60.m105334Q(false));
            }
        } else if (wib0.m206573q(purchaseType)) {
            if (merchandiseM54784s.monthly() && merchandiseM54784s.autoRenewable() && v5b0.m199785k(merchandiseM54784s)) {
                boolean z3 = this.f99611v;
                StockKeepUnit stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit;
                charSequenceM105324G = z3 ? bn60.m105366y(stockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandiseM54784s.defaultStockKeepUnit.prices.price)) : bn60.m105329L(stockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandiseM54784s.defaultStockKeepUnit.prices.price));
            } else if (v5b0.m199790p(merchandiseM54784s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP)) {
                boolean zEquals = TEnum.equals(this.f99599j, "wechat");
                boolean z4 = this.f99611v;
                if (zEquals) {
                    boolean z5 = this.f99609t;
                    charSequenceM105324G = z4 ? bn60.m105362u(merchandiseM54784s, purchaseType, z5) : bn60.m105326I(merchandiseM54784s, purchaseType, z5);
                } else {
                    boolean z6 = this.f99609t;
                    charSequenceM105324G = z4 ? bn60.m105361t(merchandiseM54784s, purchaseType, z6) : bn60.m105325H(merchandiseM54784s, purchaseType, z6);
                }
            } else if (v5b0.m199790p(merchandiseM54784s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
                boolean zEquals2 = TEnum.equals(this.f99599j, "wechat");
                boolean z7 = this.f99611v;
                if (zEquals2) {
                    boolean z8 = this.f99609t;
                    charSequenceM105324G = z7 ? bn60.m105362u(merchandiseM54784s, purchaseType, z8) : bn60.m105326I(merchandiseM54784s, purchaseType, z8);
                } else {
                    boolean z9 = this.f99609t;
                    charSequenceM105324G = z7 ? bn60.m105361t(merchandiseM54784s, purchaseType, z9) : bn60.m105325H(merchandiseM54784s, purchaseType, z9);
                }
            } else if (this.f99611v && v5b0.m199796v("svip", merchandiseM54784s)) {
                charSequenceM105324G = bn60.m105361t(merchandiseM54784s, purchaseType, this.f99609t);
            } else {
                boolean z10 = this.f99611v;
                boolean z11 = this.f99609t;
                charSequenceM105324G = z10 ? bn60.m105365x(purchaseType, z11) : bn60.m105324G(purchaseType, z11);
            }
        } else if (wib0.m206579w(purchaseType)) {
            if (tqi.m192303c() && v5b0.m199790p(merchandiseM54784s, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
                charSequenceM105324G = this.f99611v ? bn60.m105360s(this.f99593d, merchandiseM54784s, purchaseType) : bn60.m105325H(merchandiseM54784s, purchaseType, this.f99609t);
            } else if (tqi.m192303c() && (v5b0.m199790p(merchandiseM54784s, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP) || (this.f99611v && v5b0.m199796v(ProductCategory.tttVip, merchandiseM54784s)))) {
                boolean z12 = this.f99611v;
                boolean z13 = this.f99609t;
                charSequenceM105324G = z12 ? bn60.m105361t(merchandiseM54784s, purchaseType, z13) : bn60.m105325H(merchandiseM54784s, purchaseType, z13);
            } else {
                boolean z14 = this.f99611v;
                boolean z15 = this.f99609t;
                charSequenceM105324G = z14 ? bn60.m105365x(purchaseType, z15) : bn60.m105324G(purchaseType, z15);
            }
        } else if (!CoreModule.m30933P().m143405a().mo34532k() || PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP != purchaseType) {
            charSequenceM105324G = (CoreModule.m30933P().m143405a().mo34532k() && PurchaseType.TYPE_PICKS_MEMBERSHIP == purchaseType) ? bn60.m105324G(purchaseType, this.f99609t) : "";
        } else if (v5b0.m199790p(merchandiseM54784s, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks) || v5b0.m199790p(merchandiseM54784s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            charSequenceM105324G = bn60.m105325H(merchandiseM54784s, purchaseType, this.f99609t);
        } else {
            boolean zM199790p = v5b0.m199790p(merchandiseM54784s, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
            boolean z16 = this.f99609t;
            charSequenceM105324G = zM199790p ? bn60.m105325H(merchandiseM54784s, purchaseType, z16) : bn60.m105324G(purchaseType, z16);
        }
        if (NullChecker.m82486a(this.f99608s)) {
            this.f99608s.mo54390b(charSequenceM105324G);
            InterfaceC8923b interfaceC8923b = this.f99608s;
            if (interfaceC8923b instanceof C8922a) {
                ((C8922a) interfaceC8923b).m54400n(new y20() { // from class: l.yk40
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f200372a.m126100Q(purchaseType, (Boolean) obj);
                    }
                });
                ((C8922a) this.f99608s).m54401o(this.f99597h, this.f99596g, this.f99605p, this.f99609t, m126091H() && this.f99604o != AgreementComponent.AgreementState.hidden, this.f99599j);
            }
        }
        if (NullChecker.m82486a(this.f99610u)) {
            this.f99610u.call(charSequenceM105324G);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m126114d0(boolean z) {
        this.f99605p = z;
        if (NullChecker.m82486a(this.f99608s)) {
            InterfaceC8923b interfaceC8923b = this.f99608s;
            if (interfaceC8923b instanceof C8922a) {
                ((C8922a) interfaceC8923b).m54394h(this.f99605p);
            }
        }
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: e */
    public void mo126115e(PayMethod payMethod) {
        if (this.f99599j != payMethod) {
            this.f99599j = payMethod;
            if (!g6b.m129214d() && wib0.m206573q(this.f99594e) && TEnum.equals(this.f99599j, "wechat")) {
                this.f99604o = AgreementComponent.AgreementState.checked;
            }
            m126105V(payMethod);
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
    @Override // p153l.zul
    /* JADX INFO: renamed from: g */
    public void mo126116g(boolean z) {
        AgreementComponent.AgreementState agreementState;
        AgreementComponent.AgreementState state;
        InterfaceC8923b interfaceC8923b;
        if (jyb.m147479J(this.f99601l)) {
            return;
        }
        if (z) {
            AgreementComponent.AgreementState agreementState2 = this.f99604o;
            AgreementComponent.AgreementState agreementState3 = AgreementComponent.AgreementState.hidden;
            if (agreementState2 != agreementState3) {
                this.f99604o = agreementState3;
            } else {
                if (!z) {
                    return;
                }
                agreementState = this.f99604o;
                state = AgreementComponent.AgreementState.checked;
                if (agreementState != state) {
                    return;
                }
                if (g6b.m129215e(this.f99594e) || !m126092I(this.f99601l)) {
                    if (this.f99591b == null) {
                        return;
                    } else {
                        this.f99604o = state;
                    }
                } else if (this.f99591b == null || (interfaceC8923b = this.f99608s) == null) {
                    this.f99604o = state;
                } else {
                    if (interfaceC8923b.getState() != null) {
                        state = this.f99608s.getState();
                    }
                    if (state == this.f99604o) {
                        return;
                    } else {
                        this.f99604o = state;
                    }
                }
            }
        } else {
            if (!z) {
                return;
            }
            agreementState = this.f99604o;
            state = AgreementComponent.AgreementState.checked;
            if (agreementState != state) {
                return;
            }
            if (g6b.m129215e(this.f99594e)) {
                if (this.f99591b == null) {
                    return;
                } else {
                    this.f99604o = state;
                }
            } else if (this.f99591b == null) {
                return;
            } else {
                this.f99604o = state;
            }
        }
        m126120z(this.f99613x.m201275j(this.f99604o, this.f99599j));
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: h */
    public void mo126117h(List<C8928d> list, y20<C8928d> y20Var, y20<Integer> y20Var2) {
        this.f99600k = y20Var;
        this.f99601l = list;
        if (g6b.m129215e(this.f99594e) && m126092I(list)) {
            PurchaseType purchaseType = this.f99594e;
            this.f99613x = new vhb0(purchaseType, list, jyb.m147507f0(new tkq0(purchaseType, list), new di0(this.f99594e, list), new ai0(this.f99594e, list), new ti0(this.f99594e, list), new j550(this.f99594e, list)));
        } else {
            this.f99613x = new vhb0(this.f99594e, list);
        }
        m126120z(this.f99613x.m201275j(this.f99604o, this.f99599j));
    }

    /* JADX INFO: renamed from: x */
    public final void m126118x(View view) {
        gl40.m130616a(this, view);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m126095L(AgreementComponent.AgreementState agreementState) {
        if (jyb.m147479J(this.f99601l)) {
            return;
        }
        boolean z = agreementState == AgreementComponent.AgreementState.checked;
        if (m126091H()) {
            for (C8928d c8928d : this.f99601l) {
                c8928d.m54724w(z);
                c8928d.m54717p("changeAutoRenew:" + z);
            }
        }
        m126120z(this.f99613x.m201275j(agreementState, this.f99599j));
    }

    /* JADX INFO: renamed from: z */
    public final void m126120z(List<C8928d> list) {
        this.f99591b.removeAllViews();
        this.f99602m.clear();
        this.f99602m.addAll(list);
        m126068X(this.f99602m);
    }

    @Override // p153l.t5m
    public void release() {
    }
}
