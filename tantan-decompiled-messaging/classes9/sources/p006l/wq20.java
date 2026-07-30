package p006l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterBaseSetting;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterZodiacsItem;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.tags.TagContainerLayout;
import com.p1.mobile.android.app.Act;
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
import l.s7m;
import l.t100;
import l.vtd;
import l.vwb;
import l.xdl0;
import l.xq20;
import l.yij0;
import l.zvf0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wq20 implements s7m<lq20>, eth0.InterfaceC0689a {

    /* JADX INFO: renamed from: a */
    public VImage f25286a;

    /* JADX INFO: renamed from: b */
    public VText f25287b;

    /* JADX INFO: renamed from: c */
    public VText f25288c;

    /* JADX INFO: renamed from: d */
    public VScroll f25289d;

    /* JADX INFO: renamed from: e */
    public NewFilterBaseSetting f25290e;

    /* JADX INFO: renamed from: f */
    public View f25291f;

    /* JADX INFO: renamed from: g */
    public VText f25292g;

    /* JADX INFO: renamed from: h */
    public VText f25293h;

    /* JADX INFO: renamed from: i */
    public VLinear f25294i;

    /* JADX INFO: renamed from: j */
    public VText f25295j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f25296k;

    /* JADX INFO: renamed from: l */
    public TagContainerLayout f25297l;

    /* JADX INFO: renamed from: m */
    public VText f25298m;

    /* JADX INFO: renamed from: n */
    public VText f25299n;

    /* JADX INFO: renamed from: o */
    public VLinear f25300o;

    /* JADX INFO: renamed from: p */
    public VFrame f25301p;

    /* JADX INFO: renamed from: q */
    public VText f25302q;

    /* JADX INFO: renamed from: r */
    public Act f25303r;

    /* JADX INFO: renamed from: s */
    public lq20 f25304s;

    /* JADX INFO: renamed from: t */
    public br20 f25305t;

    /* JADX INFO: renamed from: u */
    public Comparator<NewFilterZodiacsItem> f25306u = new Comparator() { // from class: l.pq20
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((NewFilterZodiacsItem) obj).getBindViewData().f16655a, ((NewFilterZodiacsItem) obj2).getBindViewData().f16655a);
        }
    };

    /* JADX INFO: renamed from: l.wq20$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC1418a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f25307a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f25308b;

        public ViewTreeObserverOnGlobalLayoutListenerC1418a(View view, boolean z) {
            this.f25307a = view;
            this.f25308b = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float right = ((this.f25307a.getRight() + this.f25307a.getLeft()) / 2) - t100.d(10.0f);
            float top = this.f25307a.getTop() + vtd.a(wq20.this.f25303r, 4.0f);
            if (this.f25308b) {
                right = this.f25307a.getLeft() + t100.d(2.0f);
            }
            wq20.this.f25298m.setX(right);
            wq20.this.f25298m.setY(top);
            xdl0.M0(wq20.this.f25298m, true);
            this.f25307a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public wq20(Act act) {
        this.f25303r = act;
    }

    /* JADX INFO: renamed from: C */
    private void m26591C() {
        br20 br20Var = new br20();
        this.f25305t = br20Var;
        br20Var.m14883l(this);
        this.f25297l.setCanAdjustChildHeight(false);
        this.f25297l.setIsSquare(true);
        this.f25297l.setAdapter(this.f25305t);
        this.f25305t.m12844p(Arrays.asList(qne0.f19937d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m26592E(View view) {
        this.f25304s.m18952g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m26593F(View view) {
        this.f25304s.m18952g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m26594G(VScroll vScroll, int i, int i2, int i3, int i4) {
        xdl0.M(this.f25301p, i2 > this.f25292g.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m26595H() {
        this.f25289d.scrollTo(0, this.f25292g.getTop());
    }

    /* JADX INFO: renamed from: Q */
    private void m26596Q() {
        CoreModule.f1546o.m25559d().m5787id(this.f25303r);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m26598d() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m26603k(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m26608r() {
        xdl0.E0(this.f25286a, new View.OnClickListener() { // from class: l.mq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17179a.m26592E(view);
            }
        });
        xdl0.E0(this.f25288c, new View.OnClickListener() { // from class: l.nq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17804a.m26593F(view);
            }
        });
        m26591C();
        this.f25289d.d(new VScroll.a() { // from class: l.oq20
            /* JADX INFO: renamed from: a */
            public final void m20713a(VScroll vScroll, int i, int i2, int i3, int i4) {
                this.f18326a.m26594G(vScroll, i, i2, i3, i4);
            }
        });
        VText vText = this.f25288c;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f25287b.setTypeface(this.f25288c.getTypeface(), 1);
        Drawable drawable = act().drawable(CoreModule.f1546o.m25559d().m5643J9());
        drawable.setBounds(0, 0, t100.d(39.0f), t100.d(14.0f));
        this.f25292g.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.f25299n.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.f25302q.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            xdl0.X(this.f25291f, t100.m);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m26609v(final Runnable runnable) {
        e51.G(new Runnable() { // from class: l.vq20
            @Override // java.lang.Runnable
            public final void run() {
                wq20.m26603k(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m26610A(Settings settings) {
        this.f25290e.m8844O0(this.f25303r, settings, this.f25304s.m18935M());
    }

    /* JADX INFO: renamed from: B */
    public void m26611B(Settings settings) {
        this.f25290e.m8855u0(this.f25303r, settings);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m26612C0() {
        return this.f25303r;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m26613I() {
        this.f25289d.scrollTo(0, this.f25299n.getTop());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m26614J(View view) {
        this.f25289d.scrollTo(0, view.getTop());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m26615K() {
        if (!CoreModule.f1534c.f3587Q1.m6679g3() || CoreModule.f1534c.f3587Q1.m6680h3()) {
            return;
        }
        CoreModule.f1534c.f3587Q1.m6684l3(true);
        new dd80.a(this.f25303r).y0("服务更新").t0("亲爱的用户，为提升服务质量【不让距离太近的人看到我】将于7天后变更为会员专属服务。到期前，功能正常免费使用。感谢理解与支持。").M(true).c0("知道了", new Runnable() { // from class: l.uq20
            @Override // java.lang.Runnable
            public final void run() {
                wq20.m26598d();
            }
        }).r0();
    }

    /* JADX INFO: renamed from: L */
    public void m26616L(boolean z) {
        this.f25290e.m8854t0(z);
    }

    /* JADX INFO: renamed from: M */
    public void m26617M(int i) {
        if (i == 1) {
            m26609v(new Runnable() { // from class: l.qq20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19973a.m26595H();
                }
            });
            return;
        }
        if (i == 2) {
            m26609v(new Runnable() { // from class: l.rq20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20677a.m26613I();
                }
            });
        } else if (i == 3) {
            final View view = (View) this.f25290e.getLocationTitle().getParent();
            if (NullChecker.a(view)) {
                m26609v(new Runnable() { // from class: l.sq20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21569a.m26614J(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m26618N(AdvancedSettings advancedSettings) {
        List<NewFilterZodiacsItem> listM14880h = this.f25305t.m14880h();
        Collections.sort(listM14880h, this.f25306u);
        advancedSettings.zodiacs.clear();
        for (NewFilterZodiacsItem newFilterZodiacsItem : listM14880h) {
            advancedSettings.zodiacs.add(newFilterZodiacsItem.getBindViewData().f16656b == null ? ProfileZodiac.get(newFilterZodiacsItem.getBindViewData().f16657c) : (ProfileZodiac) newFilterZodiacsItem.getBindViewData().f16656b);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m26619O(HiddenNearByView hiddenNearByView) {
        this.f25290e.setHiddenNearByView(hiddenNearByView);
    }

    /* JADX INFO: renamed from: P */
    public void m26620P(j760<List<ProfileZodiac>, ProfileZodiac> j760Var) {
        ArrayList arrayList = new ArrayList();
        for (ProfileZodiac profileZodiac : (List) j760Var.a) {
            arrayList.add(profileZodiac.toString());
            NewFilterZodiacsItem newFilterZodiacsItem = this.f25305t.m14881j().get(profileZodiac.toString());
            if (newFilterZodiacsItem != null) {
                newFilterZodiacsItem.getBindViewData().f16656b = profileZodiac;
            }
        }
        this.f25305t.m14884m(arrayList);
        ProfileZodiac profileZodiac2 = (ProfileZodiac) j760Var.b;
        if (!NullChecker.a(profileZodiac2)) {
            xdl0.M0(this.f25298m, false);
            return;
        }
        boolean zB = mqa.b();
        boolean z = !zB;
        VText vText = this.f25298m;
        if (zB) {
            vText.setText("今日最配");
        } else {
            vText.setText("Best match today");
        }
        NewFilterZodiacsItem newFilterZodiacsItem2 = this.f25305t.m14881j().get(profileZodiac2.toString());
        newFilterZodiacsItem2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1418a(newFilterZodiacsItem2, z));
    }

    /* JADX INFO: renamed from: R */
    public void m26621R() {
        e51.H(this.f25303r, new Runnable() { // from class: l.tq20
            @Override // java.lang.Runnable
            public final void run() {
                this.f22234a.m26615K();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: S */
    public void m26622S(String str) {
        this.f25290e.m8847R0(str);
    }

    @Override // p006l.eth0.InterfaceC0689a
    /* JADX INFO: renamed from: a */
    public boolean mo14885a(View view) {
        if (this.f25304s.m18949d0() || xma.m27405y3()) {
            zvf0.u("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.valueOf(!view.isSelected()))});
            return false;
        }
        zvf0.u("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.valueOf(view.isSelected()))});
        m26596Q();
        return true;
    }

    @Override // p006l.eth0.InterfaceC0689a
    /* JADX INFO: renamed from: b */
    public void mo14886b() {
        if (this.f25305t.m14880h().size() > 0) {
            zvf0.v("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.TRUE)});
        } else if (this.f25304s.m18949d0()) {
            zvf0.v("e_advanced_filter_constellation", "p_advanced_filter_page", new j760[]{vwb.Y("is_selected", Boolean.FALSE)});
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM26624q = m26624q(layoutInflater, viewGroup);
        m26608r();
        return viewM26624q;
    }

    /* JADX INFO: renamed from: q */
    public View m26624q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xq20.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public void m26625s(String str, String str2) {
        this.f25290e.m8849l0(str, str2);
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m26623i1(lq20 lq20Var) {
        this.f25304s = lq20Var;
    }

    /* JADX INFO: renamed from: w */
    public View m26627w() {
        return this.f25294i;
    }

    /* JADX INFO: renamed from: x */
    public View m26628x() {
        return this.f25300o;
    }

    /* JADX INFO: renamed from: y */
    public boolean m26629y() {
        return yij0.u(this.f25290e.f5918c);
    }

    /* JADX INFO: renamed from: z */
    public void m26630z(AdvancedSettings advancedSettings) {
        m26620P(CoreModule.f1534c.f3553F0.m12320t3(advancedSettings));
    }

    public void destroy() {
    }
}
