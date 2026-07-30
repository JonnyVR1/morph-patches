package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterZodiacsItem;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class gz20 implements iam<vy20>, m1i0.InterfaceC18525a {

    /* JADX INFO: renamed from: a */
    public VImage f107138a;

    /* JADX INFO: renamed from: b */
    public VText f107139b;

    /* JADX INFO: renamed from: c */
    public VText f107140c;

    /* JADX INFO: renamed from: d */
    public VScroll f107141d;

    /* JADX INFO: renamed from: e */
    public NewFilterBaseSetting f107142e;

    /* JADX INFO: renamed from: f */
    public View f107143f;

    /* JADX INFO: renamed from: g */
    public VText f107144g;

    /* JADX INFO: renamed from: h */
    public VText f107145h;

    /* JADX INFO: renamed from: i */
    public VLinear f107146i;

    /* JADX INFO: renamed from: j */
    public VText f107147j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f107148k;

    /* JADX INFO: renamed from: l */
    public TagContainerLayout f107149l;

    /* JADX INFO: renamed from: m */
    public VText f107150m;

    /* JADX INFO: renamed from: n */
    public VText f107151n;

    /* JADX INFO: renamed from: o */
    public VLinear f107152o;

    /* JADX INFO: renamed from: p */
    public VFrame f107153p;

    /* JADX INFO: renamed from: q */
    public VText f107154q;

    /* JADX INFO: renamed from: r */
    public Act f107155r;

    /* JADX INFO: renamed from: s */
    public vy20 f107156s;

    /* JADX INFO: renamed from: t */
    public lz20 f107157t;

    /* JADX INFO: renamed from: u */
    public Comparator<NewFilterZodiacsItem> f107158u = new Comparator() { // from class: l.zy20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((NewFilterZodiacsItem) obj).getBindViewData().f171763a, ((NewFilterZodiacsItem) obj2).getBindViewData().f171763a);
        }
    };

    /* JADX INFO: renamed from: l.gz20$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC17357a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f107159a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f107160b;

        public ViewTreeObserverOnGlobalLayoutListenerC17357a(View view, boolean z) {
            this.f107159a = view;
            this.f107160b = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float right = ((this.f107159a.getRight() + this.f107159a.getLeft()) / 2) - qa00.m175859d(10.0f);
            float top = this.f107159a.getTop() + jvd.m147011a(gz20.this.f107155r, 4.0f);
            if (this.f107160b) {
                right = this.f107159a.getLeft() + qa00.m175859d(2.0f);
            }
            gz20.this.f107150m.setX(right);
            gz20.this.f107150m.setY(top);
            bnl0.m105525M0(gz20.this.f107150m, true);
            this.f107159a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public gz20(Act act) {
        this.f107155r = act;
    }

    /* JADX INFO: renamed from: C */
    private void m133039C() {
        lz20 lz20Var = new lz20();
        this.f107157t = lz20Var;
        lz20Var.m156694l(this);
        this.f107149l.setCanAdjustChildHeight(false);
        this.f107149l.setIsSquare(true);
        this.f107149l.setAdapter(this.f107157t);
        this.f107157t.m156402p(Arrays.asList(xve0.f196388d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m133040E(View view) {
        this.f107156s.m203944g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m133041F(View view) {
        this.f107156s.m203944g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m133042G(VScroll vScroll, int i, int i2, int i3, int i4) {
        bnl0.m105524M(this.f107153p, i2 > this.f107144g.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m133043H() {
        this.f107141d.scrollTo(0, this.f107144g.getTop());
    }

    /* JADX INFO: renamed from: Q */
    private void m133044Q() {
        CoreModule.f18276o.m132214d().mo34853id(this.f107155r);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m133046d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m133051k(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m133056r() {
        bnl0.m105509E0(this.f107138a, new View.OnClickListener() { // from class: l.wy20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191567a.m133040E(view);
            }
        });
        bnl0.m105509E0(this.f107140c, new View.OnClickListener() { // from class: l.xy20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196711a.m133041F(view);
            }
        });
        m133039C();
        this.f107141d.m224439d(new VScroll.InterfaceC22681a() { // from class: l.yy20
            @Override // p151v.VScroll.InterfaceC22681a
            /* JADX INFO: renamed from: a */
            public final void mo44202a(VScroll vScroll, int i, int i2, int i3, int i4) {
                this.f202074a.m133042G(vScroll, i, i2, i3, i4);
            }
        });
        VText vText = this.f107140c;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f107139b.setTypeface(this.f107140c.getTypeface(), 1);
        Drawable drawable = getAct().drawable(CoreModule.f18276o.m132214d().mo34709J9());
        drawable.setBounds(0, 0, qa00.m175859d(39.0f), qa00.m175859d(14.0f));
        this.f107144g.setCompoundDrawables(null, null, drawable, null);
        this.f107151n.setCompoundDrawables(null, null, drawable, null);
        this.f107154q.setCompoundDrawables(null, null, drawable, null);
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            bnl0.m105540X(this.f107143f, qa00.f156326m);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m133057v(final Runnable runnable) {
        l51.m152887G(new Runnable() { // from class: l.fz20
            @Override // java.lang.Runnable
            public final void run() {
                gz20.m133051k(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m133058A(Settings settings) {
        this.f107142e.m56652O0(this.f107155r, settings, this.f107156s.m203927M());
    }

    /* JADX INFO: renamed from: B */
    public void m133059B(Settings settings) {
        this.f107142e.m56663u0(this.f107155r, settings);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f107155r;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m133060I() {
        this.f107141d.scrollTo(0, this.f107151n.getTop());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m133061J(View view) {
        this.f107141d.scrollTo(0, view.getTop());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m133062K() {
        if (!CoreModule.f18264c.f20340Q1.m35745g3() || CoreModule.f18264c.f20340Q1.m35746h3()) {
            return;
        }
        CoreModule.f18264c.f20340Q1.m35750l3(true);
        new jl80.C17971a(this.f107155r).m146056y0("服务更新").m146051t0("亲爱的用户，为提升服务质量【不让距离太近的人看到我】将于7天后变更为会员专属服务。到期前，功能正常免费使用。感谢理解与支持。").m146018M(true).m146034c0("知道了", new Runnable() { // from class: l.ez20
            @Override // java.lang.Runnable
            public final void run() {
                gz20.m133046d();
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: L */
    public void m133063L(boolean z) {
        this.f107142e.m56662t0(z);
    }

    /* JADX INFO: renamed from: M */
    public void m133064M(int i) {
        if (i == 1) {
            m133057v(new Runnable() { // from class: l.az20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74072a.m133043H();
                }
            });
            return;
        }
        if (i == 2) {
            m133057v(new Runnable() { // from class: l.bz20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79092a.m133060I();
                }
            });
        } else if (i == 3) {
            final View view = (View) this.f107142e.getLocationTitle().getParent();
            if (NullChecker.m82486a(view)) {
                m133057v(new Runnable() { // from class: l.cz20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f84418a.m133061J(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m133065N(AdvancedSettings advancedSettings) {
        List<NewFilterZodiacsItem> listM156691h = this.f107157t.m156691h();
        Collections.sort(listM156691h, this.f107158u);
        advancedSettings.zodiacs.clear();
        for (NewFilterZodiacsItem newFilterZodiacsItem : listM156691h) {
            advancedSettings.zodiacs.add(newFilterZodiacsItem.getBindViewData().f171764b == null ? ProfileZodiac.get(newFilterZodiacsItem.getBindViewData().f171765c) : (ProfileZodiac) newFilterZodiacsItem.getBindViewData().f171764b);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m133066O(HiddenNearByView hiddenNearByView) {
        this.f107142e.setHiddenNearByView(hiddenNearByView);
    }

    /* JADX INFO: renamed from: P */
    public void m133067P(pf60<List<ProfileZodiac>, ProfileZodiac> pf60Var) {
        ArrayList arrayList = new ArrayList();
        for (ProfileZodiac profileZodiac : pf60Var.f152156a) {
            arrayList.add(profileZodiac.toString());
            NewFilterZodiacsItem newFilterZodiacsItem = this.f107157t.m156692j().get(profileZodiac.toString());
            if (newFilterZodiacsItem != null) {
                newFilterZodiacsItem.getBindViewData().f171764b = profileZodiac;
            }
        }
        this.f107157t.m156695m(arrayList);
        ProfileZodiac profileZodiac2 = pf60Var.f152157b;
        if (!NullChecker.m82486a(profileZodiac2)) {
            bnl0.m105525M0(this.f107150m, false);
            return;
        }
        boolean zM217165b = yra.m217165b();
        boolean z = !zM217165b;
        VText vText = this.f107150m;
        if (zM217165b) {
            vText.setText("今日最配");
        } else {
            vText.setText("Best match today");
        }
        NewFilterZodiacsItem newFilterZodiacsItem2 = this.f107157t.m156692j().get(profileZodiac2.toString());
        newFilterZodiacsItem2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17357a(newFilterZodiacsItem2, z));
    }

    /* JADX INFO: renamed from: R */
    public void m133068R() {
        l51.m152888H(this.f107155r, new Runnable() { // from class: l.dz20
            @Override // java.lang.Runnable
            public final void run() {
                this.f91320a.m133062K();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: S */
    public void m133069S(String str) {
        this.f107142e.m56655R0(str);
    }

    @Override // p153l.m1i0.InterfaceC18525a
    /* JADX INFO: renamed from: a */
    public boolean mo133070a(View view) {
        if (this.f107156s.m203941d0() || joa.m146412z3()) {
            i4g0.m138523u("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.valueOf(!view.isSelected())));
            return false;
        }
        i4g0.m138523u("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.valueOf(view.isSelected())));
        m133044Q();
        return true;
    }

    @Override // p153l.m1i0.InterfaceC18525a
    /* JADX INFO: renamed from: b */
    public void mo133071b() {
        if (this.f107157t.m156691h().size() > 0) {
            i4g0.m138524v("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.TRUE));
        } else if (this.f107156s.m203941d0()) {
            i4g0.m138524v("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.FALSE));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM133072q = m133072q(layoutInflater, viewGroup);
        m133056r();
        return viewM133072q;
    }

    /* JADX INFO: renamed from: q */
    public View m133072q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hz20.m137803b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public void m133073s(String str, String str2) {
        this.f107142e.m56657l0(str, str2);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vy20 vy20Var) {
        this.f107156s = vy20Var;
    }

    /* JADX INFO: renamed from: w */
    public View m133075w() {
        return this.f107146i;
    }

    /* JADX INFO: renamed from: x */
    public View m133076x() {
        return this.f107152o;
    }

    /* JADX INFO: renamed from: y */
    public boolean m133077y() {
        return bsj0.m106285u(this.f107142e.f36985c);
    }

    /* JADX INFO: renamed from: z */
    public void m133078z(AdvancedSettings advancedSettings) {
        m133067P(CoreModule.f18264c.f20306F0.m118457t3(advancedSettings));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
