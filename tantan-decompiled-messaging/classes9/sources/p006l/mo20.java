package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterAct;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterZodiacsItem;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.tags.TagContainerLayout;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.dd80;
import l.e51;
import l.j760;
import l.mqa;
import l.no20;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VImage;
import v.VLinear;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mo20 implements s7m<co20>, eth0.InterfaceC0689a {

    /* JADX INFO: renamed from: a */
    public VImage f17130a;

    /* JADX INFO: renamed from: b */
    public VText f17131b;

    /* JADX INFO: renamed from: c */
    public View f17132c;

    /* JADX INFO: renamed from: d */
    public VText f17133d;

    /* JADX INFO: renamed from: e */
    public VScroll f17134e;

    /* JADX INFO: renamed from: f */
    public NewUIAbFilterBaseSetting f17135f;

    /* JADX INFO: renamed from: g */
    public VText f17136g;

    /* JADX INFO: renamed from: h */
    public VLinear f17137h;

    /* JADX INFO: renamed from: i */
    public VText f17138i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f17139j;

    /* JADX INFO: renamed from: k */
    public TagContainerLayout f17140k;

    /* JADX INFO: renamed from: l */
    public VText f17141l;

    /* JADX INFO: renamed from: m */
    public VText f17142m;

    /* JADX INFO: renamed from: n */
    public VLinear f17143n;

    /* JADX INFO: renamed from: o */
    public NewFilterAct f17144o;

    /* JADX INFO: renamed from: p */
    public co20 f17145p;

    /* JADX INFO: renamed from: q */
    public br20 f17146q;

    /* JADX INFO: renamed from: r */
    public Comparator<NewFilterZodiacsItem> f17147r = new Comparator() { // from class: l.jo20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((NewFilterZodiacsItem) obj).getBindViewData().f16655a, ((NewFilterZodiacsItem) obj2).getBindViewData().f16655a);
        }
    };

    /* JADX INFO: renamed from: l.mo20$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC1026a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f17148a;

        public ViewTreeObserverOnGlobalLayoutListenerC1026a(View view) {
            this.f17148a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float right = (this.f17148a.getRight() + this.f17148a.getLeft()) / 2;
            float top = this.f17148a.getTop() + t100.d(17.0f);
            mo20.this.f17141l.setX(right);
            mo20.this.f17141l.setY(top);
            xdl0.M0(mo20.this.f17141l, true);
            this.f17148a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public mo20(NewFilterAct newFilterAct) {
        this.f17144o = newFilterAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m19439B(View view) {
        this.f17144o.finish();
        this.f17145p.m13604k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m19440C(View view) {
        this.f17144o.finish();
        this.f17145p.m13604k1();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m19442d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m19447k(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m19450r() {
        xdl0.E0(this.f17130a, new View.OnClickListener() { // from class: l.ho20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13985a.m19439B(view);
            }
        });
        xdl0.E0(this.f17133d, new View.OnClickListener() { // from class: l.io20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14584a.m19440C(view);
            }
        });
        m19451A();
        VText vText = this.f17133d;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f17131b.setTypeface(this.f17133d.getTypeface(), 1);
    }

    /* JADX INFO: renamed from: A */
    public final void m19451A() {
        br20 br20Var = new br20();
        this.f17146q = br20Var;
        br20Var.m14883l(this);
        this.f17140k.setCanAdjustChildHeight(false);
        this.f17140k.setIsSquare(true);
        this.f17140k.setAdapter(this.f17146q);
        this.f17146q.m12844p(Arrays.asList(qne0.f19938e));
    }

    /* JADX INFO: renamed from: C0 */
    public Context m19452C0() {
        return this.f17144o;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m19453E() {
        this.f17134e.scrollTo(0, this.f17136g.getTop());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m19454F() {
        this.f17134e.scrollTo(0, this.f17142m.getTop());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m19455G(View view) {
        this.f17134e.scrollTo(0, view.getTop());
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m19456H() {
        if (!CoreModule.f1534c.f3587Q1.m6679g3() || CoreModule.f1534c.f3587Q1.m6680h3()) {
            return;
        }
        CoreModule.f1534c.f3587Q1.m6684l3(true);
        new dd80.a(this.f17144o).y0("服务更新").t0("亲爱的用户，为提升服务质量【不让距离太近的人看到我】将于7天后变更为会员专属服务。到期前，功能正常免费使用。感谢理解与支持。").M(true).c0("知道了", new Runnable() { // from class: l.ko20
            @Override // java.lang.Runnable
            public final void run() {
                mo20.m19442d();
            }
        }).r0();
    }

    /* JADX INFO: renamed from: I */
    public void m19457I(boolean z) {
        this.f17135f.m8928t0(z);
    }

    /* JADX INFO: renamed from: J */
    public void m19458J(int i) {
        if (i == 1) {
            m19469s(new Runnable() { // from class: l.eo20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11299a.m19453E();
                }
            });
            return;
        }
        if (i == 2) {
            m19469s(new Runnable() { // from class: l.fo20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12812a.m19454F();
                }
            });
        } else if (i == 3) {
            final View view = (View) this.f17135f.getLocationTitle().getParent();
            if (NullChecker.a(view)) {
                m19469s(new Runnable() { // from class: l.go20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13415a.m19455G(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m19459K(AdvancedSettings advancedSettings) {
        List<NewFilterZodiacsItem> listM14880h = this.f17146q.m14880h();
        Collections.sort(listM14880h, this.f17147r);
        advancedSettings.zodiacs.clear();
        for (NewFilterZodiacsItem newFilterZodiacsItem : listM14880h) {
            advancedSettings.zodiacs.add(newFilterZodiacsItem.getBindViewData().f16656b == null ? ProfileZodiac.get(newFilterZodiacsItem.getBindViewData().f16657c) : (ProfileZodiac) newFilterZodiacsItem.getBindViewData().f16656b);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m19460L(HiddenNearByView hiddenNearByView) {
        this.f17135f.setHiddenNearByView(hiddenNearByView);
    }

    /* JADX INFO: renamed from: M */
    public void m19461M(j760<List<ProfileZodiac>, ProfileZodiac> j760Var) {
        ArrayList arrayList = new ArrayList();
        for (ProfileZodiac profileZodiac : (List) j760Var.a) {
            arrayList.add(profileZodiac.toString());
            NewFilterZodiacsItem newFilterZodiacsItem = this.f17146q.m14881j().get(profileZodiac.toString());
            if (newFilterZodiacsItem != null) {
                newFilterZodiacsItem.getBindViewData().f16656b = profileZodiac;
            }
        }
        this.f17146q.m14884m(arrayList);
        ProfileZodiac profileZodiac2 = (ProfileZodiac) j760Var.b;
        if (!NullChecker.a(profileZodiac2)) {
            xdl0.M0(this.f17141l, false);
            return;
        }
        boolean zB = mqa.b();
        VText vText = this.f17141l;
        if (zB) {
            vText.setText("今日最配");
        } else {
            vText.setText("Best match today");
        }
        NewFilterZodiacsItem newFilterZodiacsItem2 = this.f17146q.m14881j().get(profileZodiac2.toString());
        newFilterZodiacsItem2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1026a(newFilterZodiacsItem2));
    }

    /* JADX INFO: renamed from: N */
    public final void m19462N() {
        CoreModule.f1546o.m25559d().m5787id(this.f17144o);
    }

    /* JADX INFO: renamed from: O */
    public void m19463O() {
        e51.H(this.f17144o, new Runnable() { // from class: l.do20
            @Override // java.lang.Runnable
            public final void run() {
                this.f10489a.m19456H();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: P */
    public void m19464P(String str) {
        this.f17135f.m8922R0(str);
    }

    @Override // p006l.eth0.InterfaceC0689a
    /* JADX INFO: renamed from: a */
    public boolean mo14885a(View view) {
        if (this.f17145p.m13603h1() || xma.m27405y3()) {
            zvf0.u("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.valueOf(!view.isSelected()))});
            return false;
        }
        zvf0.u("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.valueOf(view.isSelected()))});
        m19462N();
        return true;
    }

    @Override // p006l.eth0.InterfaceC0689a
    /* JADX INFO: renamed from: b */
    public void mo14886b() {
        if (this.f17146q.m14880h().size() > 0) {
            zvf0.v("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.TRUE)});
        } else if (this.f17145p.m13603h1()) {
            zvf0.v("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.FALSE)});
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM19466n = m19466n(layoutInflater, viewGroup);
        m19450r();
        return viewM19466n;
    }

    /* JADX INFO: renamed from: n */
    public View m19466n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return no20.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public void m19467p(String str, String str2) {
        this.f17135f.m8924l0(str, str2);
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m19465i1(co20 co20Var) {
        this.f17145p = co20Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m19469s(final Runnable runnable) {
        e51.G(new Runnable() { // from class: l.lo20
            @Override // java.lang.Runnable
            public final void run() {
                mo20.m19447k(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public View m19470u() {
        return this.f17137h;
    }

    /* JADX INFO: renamed from: v */
    public View m19471v() {
        return this.f17143n;
    }

    /* JADX INFO: renamed from: w */
    public boolean m19472w() {
        return yij0.u(this.f17135f.f5987c);
    }

    /* JADX INFO: renamed from: x */
    public void m19473x(AdvancedSettings advancedSettings) {
        m19461M(CoreModule.f1534c.f3553F0.m12320t3(advancedSettings));
    }

    /* JADX INFO: renamed from: y */
    public void m19474y(Settings settings) {
        this.f17135f.m8920O0(this.f17144o, settings, this.f17145p.m13600O0());
    }

    /* JADX INFO: renamed from: z */
    public void m19475z(Settings settings) {
        this.f17135f.m8929u0(this.f17144o, settings);
    }

    public void destroy() {
    }
}
