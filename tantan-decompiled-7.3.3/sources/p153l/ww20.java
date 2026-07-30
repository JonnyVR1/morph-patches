package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterAct;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterZodiacsItem;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ww20 implements iam<mw20>, m1i0.InterfaceC18525a {

    /* JADX INFO: renamed from: a */
    public VImage f191133a;

    /* JADX INFO: renamed from: b */
    public VText f191134b;

    /* JADX INFO: renamed from: c */
    public View f191135c;

    /* JADX INFO: renamed from: d */
    public VText f191136d;

    /* JADX INFO: renamed from: e */
    public VScroll f191137e;

    /* JADX INFO: renamed from: f */
    public NewUIAbFilterBaseSetting f191138f;

    /* JADX INFO: renamed from: g */
    public VText f191139g;

    /* JADX INFO: renamed from: h */
    public VLinear f191140h;

    /* JADX INFO: renamed from: i */
    public VText f191141i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f191142j;

    /* JADX INFO: renamed from: k */
    public TagContainerLayout f191143k;

    /* JADX INFO: renamed from: l */
    public VText f191144l;

    /* JADX INFO: renamed from: m */
    public VText f191145m;

    /* JADX INFO: renamed from: n */
    public VLinear f191146n;

    /* JADX INFO: renamed from: o */
    public NewFilterAct f191147o;

    /* JADX INFO: renamed from: p */
    public mw20 f191148p;

    /* JADX INFO: renamed from: q */
    public lz20 f191149q;

    /* JADX INFO: renamed from: r */
    public Comparator<NewFilterZodiacsItem> f191150r = new Comparator() { // from class: l.tw20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((NewFilterZodiacsItem) obj).getBindViewData().f171763a, ((NewFilterZodiacsItem) obj2).getBindViewData().f171763a);
        }
    };

    /* JADX INFO: renamed from: l.ww20$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC21188a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f191151a;

        public ViewTreeObserverOnGlobalLayoutListenerC21188a(View view) {
            this.f191151a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float right = (this.f191151a.getRight() + this.f191151a.getLeft()) / 2;
            float top = this.f191151a.getTop() + qa00.m175859d(17.0f);
            ww20.this.f191144l.setX(right);
            ww20.this.f191144l.setY(top);
            bnl0.m105525M0(ww20.this.f191144l, true);
            this.f191151a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public ww20(NewFilterAct newFilterAct) {
        this.f191147o = newFilterAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m208116B(View view) {
        this.f191147o.lambda$debugItems$19();
        this.f191148p.m160412k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m208117C(View view) {
        this.f191147o.lambda$debugItems$19();
        this.f191148p.m160412k1();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m208119d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m208124k(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m208127r() {
        bnl0.m105509E0(this.f191133a, new View.OnClickListener() { // from class: l.rw20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165096a.m208116B(view);
            }
        });
        bnl0.m105509E0(this.f191136d, new View.OnClickListener() { // from class: l.sw20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170914a.m208117C(view);
            }
        });
        m208128A();
        VText vText = this.f191136d;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f191134b.setTypeface(this.f191136d.getTypeface(), 1);
    }

    /* JADX INFO: renamed from: A */
    public final void m208128A() {
        lz20 lz20Var = new lz20();
        this.f191149q = lz20Var;
        lz20Var.m156694l(this);
        this.f191143k.setCanAdjustChildHeight(false);
        this.f191143k.setIsSquare(true);
        this.f191143k.setAdapter(this.f191149q);
        this.f191149q.m156402p(Arrays.asList(xve0.f196389e));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f191147o;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m208129E() {
        this.f191137e.scrollTo(0, this.f191139g.getTop());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m208130F() {
        this.f191137e.scrollTo(0, this.f191145m.getTop());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m208131G(View view) {
        this.f191137e.scrollTo(0, view.getTop());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m208132H() {
        if (!CoreModule.f18264c.f20340Q1.m35745g3() || CoreModule.f18264c.f20340Q1.m35746h3()) {
            return;
        }
        CoreModule.f18264c.f20340Q1.m35750l3(true);
        new jl80.C17971a(this.f191147o).m146056y0("服务更新").m146051t0("亲爱的用户，为提升服务质量【不让距离太近的人看到我】将于7天后变更为会员专属服务。到期前，功能正常免费使用。感谢理解与支持。").m146018M(true).m146034c0("知道了", new Runnable() { // from class: l.uw20
            @Override // java.lang.Runnable
            public final void run() {
                ww20.m208119d();
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: I */
    public void m208133I(boolean z) {
        this.f191138f.m56728t0(z);
    }

    /* JADX INFO: renamed from: J */
    public void m208134J(int i) {
        if (i == 1) {
            m208144s(new Runnable() { // from class: l.ow20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f149419a.m208129E();
                }
            });
            return;
        }
        if (i == 2) {
            m208144s(new Runnable() { // from class: l.pw20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154365a.m208130F();
                }
            });
        } else if (i == 3) {
            final View view = (View) this.f191138f.getLocationTitle().getParent();
            if (NullChecker.m82486a(view)) {
                m208144s(new Runnable() { // from class: l.qw20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f159855a.m208131G(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m208135K(AdvancedSettings advancedSettings) {
        List<NewFilterZodiacsItem> listM156691h = this.f191149q.m156691h();
        Collections.sort(listM156691h, this.f191150r);
        advancedSettings.zodiacs.clear();
        for (NewFilterZodiacsItem newFilterZodiacsItem : listM156691h) {
            advancedSettings.zodiacs.add(newFilterZodiacsItem.getBindViewData().f171764b == null ? ProfileZodiac.get(newFilterZodiacsItem.getBindViewData().f171765c) : (ProfileZodiac) newFilterZodiacsItem.getBindViewData().f171764b);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m208136L(HiddenNearByView hiddenNearByView) {
        this.f191138f.setHiddenNearByView(hiddenNearByView);
    }

    /* JADX INFO: renamed from: M */
    public void m208137M(pf60<List<ProfileZodiac>, ProfileZodiac> pf60Var) {
        ArrayList arrayList = new ArrayList();
        for (ProfileZodiac profileZodiac : pf60Var.f152156a) {
            arrayList.add(profileZodiac.toString());
            NewFilterZodiacsItem newFilterZodiacsItem = this.f191149q.m156692j().get(profileZodiac.toString());
            if (newFilterZodiacsItem != null) {
                newFilterZodiacsItem.getBindViewData().f171764b = profileZodiac;
            }
        }
        this.f191149q.m156695m(arrayList);
        ProfileZodiac profileZodiac2 = pf60Var.f152157b;
        if (!NullChecker.m82486a(profileZodiac2)) {
            bnl0.m105525M0(this.f191144l, false);
            return;
        }
        boolean zM217165b = yra.m217165b();
        VText vText = this.f191144l;
        if (zM217165b) {
            vText.setText("今日最配");
        } else {
            vText.setText("Best match today");
        }
        NewFilterZodiacsItem newFilterZodiacsItem2 = this.f191149q.m156692j().get(profileZodiac2.toString());
        newFilterZodiacsItem2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC21188a(newFilterZodiacsItem2));
    }

    /* JADX INFO: renamed from: N */
    public final void m208138N() {
        CoreModule.f18276o.m132214d().mo34853id(this.f191147o);
    }

    /* JADX INFO: renamed from: O */
    public void m208139O() {
        l51.m152888H(this.f191147o, new Runnable() { // from class: l.nw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f143908a.m208132H();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: P */
    public void m208140P(String str) {
        this.f191138f.m56722R0(str);
    }

    @Override // p153l.m1i0.InterfaceC18525a
    /* JADX INFO: renamed from: a */
    public boolean mo133070a(View view) {
        if (this.f191148p.m160411h1() || joa.m146412z3()) {
            i4g0.m138523u("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.valueOf(!view.isSelected())));
            return false;
        }
        i4g0.m138523u("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.valueOf(view.isSelected())));
        m208138N();
        return true;
    }

    @Override // p153l.m1i0.InterfaceC18525a
    /* JADX INFO: renamed from: b */
    public void mo133071b() {
        if (this.f191149q.m156691h().size() > 0) {
            i4g0.m138524v("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.TRUE));
        } else if (this.f191148p.m160411h1()) {
            i4g0.m138524v("e_advanced_filter_constellation", "p_advanced_filter_page", jyb.m147494Y("is_selected", Boolean.FALSE));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM208141n = m208141n(layoutInflater, viewGroup);
        m208127r();
        return viewM208141n;
    }

    /* JADX INFO: renamed from: n */
    public View m208141n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xw20.m213286b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public void m208142p(String str, String str2) {
        this.f191138f.m56724l0(str, str2);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mw20 mw20Var) {
        this.f191148p = mw20Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m208144s(final Runnable runnable) {
        l51.m152887G(new Runnable() { // from class: l.vw20
            @Override // java.lang.Runnable
            public final void run() {
                ww20.m208124k(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m208145u() {
        return this.f191140h;
    }

    /* JADX INFO: renamed from: v */
    public View m208146v() {
        return this.f191146n;
    }

    /* JADX INFO: renamed from: w */
    public boolean m208147w() {
        return bsj0.m106285u(this.f191138f.f37054c);
    }

    /* JADX INFO: renamed from: x */
    public void m208148x(AdvancedSettings advancedSettings) {
        m208137M(CoreModule.f18264c.f20306F0.m118457t3(advancedSettings));
    }

    /* JADX INFO: renamed from: y */
    public void m208149y(Settings settings) {
        this.f191138f.m56720O0(this.f191147o, settings, this.f191148p.m160408O0());
    }

    /* JADX INFO: renamed from: z */
    public void m208150z(Settings settings) {
        this.f191138f.m56729u0(this.f191147o, settings);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
