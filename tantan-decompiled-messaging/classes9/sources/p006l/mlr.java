package p006l;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.C0399a;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.C0401c;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAnimationMaskView;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.PicksHelper;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksHeaderView;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.putong.data.User;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import l.b3c0;
import l.baj;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.i7c0;
import l.j760;
import l.nlr;
import l.olr;
import l.plr;
import l.q860;
import l.s7m;
import l.t100;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x4c0;
import l.xdl0;
import l.z0c0;
import l.zvf0;
import v.SimpleCoverGuideView;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VProgressBar;
import v.VPullUpRecyclerView;
import v.VText;
import v.VText_AutoFit;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mlr implements s7m<C0401c>, qtl {

    /* JADX INFO: renamed from: A */
    public TextView f17033A;

    /* JADX INFO: renamed from: B */
    public SceneView f17034B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f17035C;

    /* JADX INFO: renamed from: D */
    public ViewStub f17036D;

    /* JADX INFO: renamed from: E */
    public Button f17037E;

    /* JADX INFO: renamed from: F */
    public Runnable f17038F;

    /* JADX INFO: renamed from: G */
    public Runnable f17039G;

    /* JADX INFO: renamed from: H */
    public PutongAct f17040H;

    /* JADX INFO: renamed from: I */
    public LikersFrag f17041I;

    /* JADX INFO: renamed from: J */
    public Runnable f17042J;

    /* JADX INFO: renamed from: K */
    public C0401c f17043K;

    /* JADX INFO: renamed from: L */
    public SimpleCoverGuideView f17044L;

    /* JADX INFO: renamed from: M */
    public LikersAnimationMaskView f17045M;

    /* JADX INFO: renamed from: N */
    public boolean f17046N = false;

    /* JADX INFO: renamed from: a */
    public VFrame f17047a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f17048b;

    /* JADX INFO: renamed from: c */
    public VFrame f17049c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f17050d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f17051e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f17052f;

    /* JADX INFO: renamed from: g */
    public VImage f17053g;

    /* JADX INFO: renamed from: h */
    public ImageView f17054h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f17055i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f17056j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f17057k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f17058l;

    /* JADX INFO: renamed from: m */
    public VImage f17059m;

    /* JADX INFO: renamed from: n */
    public VText f17060n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f17061o;

    /* JADX INFO: renamed from: p */
    public PicksHeaderView f17062p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f17063q;

    /* JADX INFO: renamed from: r */
    public VProgressBar f17064r;

    /* JADX INFO: renamed from: s */
    public VPullUpRecyclerView f17065s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f17066t;

    /* JADX INFO: renamed from: u */
    public BoostViewContainer f17067u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f17068v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f17069w;

    /* JADX INFO: renamed from: x */
    public TextView f17070x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f17071y;

    /* JADX INFO: renamed from: z */
    public TextView f17072z;

    /* JADX INFO: renamed from: l.mlr$a */
    public class C1018a extends GridLayoutManager.c {
        public C1018a() {
        }

        /* JADX INFO: renamed from: f */
        public int m19327f(int i) {
            if (CoreMemberModule.F().b().k() && i == 0) {
                return 2;
            }
            return (gr9.m15939h() && (mlr.this.f17065s.getAdapter() instanceof C0399a) && mlr.this.f17065s.getAdapter().getItemViewType(i) != 1) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: l.mlr$b */
    public class ViewOnClickListenerC1019b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f17074a;

        public ViewOnClickListenerC1019b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f17074a > 1000) {
                this.f17074a = SystemClock.uptimeMillis();
                CoreMemberModule.F().b().yk(mlr.this.f17040H);
            }
        }
    }

    public mlr(LikersFrag likersFrag) {
        this.f17040H = (PutongAct) likersFrag.act();
        this.f17041I = likersFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m19277K(View view) {
        zvf0.r("e_see_list_feedback_button", "p_see_who_likes_me_view");
        m19291B();
    }

    /* JADX INFO: renamed from: Q */
    private void m19278Q() {
        xdl0.b0(this.f17040H.findViewById(R.id.content), new v9j() { // from class: l.dlr
            public final Object call() {
                return this.f10466a.m19302N();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m19290A(Menu menu) {
        this.f17040H.getMenuInflater().inflate(i7c0.a, menu);
        MenuItem menuItemFindItem = menu.findItem(x4c0.r);
        m19319q(menuItemFindItem.getActionView());
        CoreMemberModule.F().b().n9(this);
        menuItemFindItem.setShowAsAction(2);
        menuItemFindItem.getActionView().setOnClickListener(new ViewOnClickListenerC1019b());
        m19278Q();
    }

    /* JADX INFO: renamed from: B */
    public boolean m19291B() {
        CoreMemberModule.F().b().yk(this.f17040H);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public PicksHeaderView m19292C() {
        return xdl0.O0(this.f17065s) ? (PicksHeaderView) this.f17065s.findViewById(x4c0.z) : this.f17062p;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19293C0() {
        return this.f17040H;
    }

    /* JADX INFO: renamed from: E */
    public void m19294E() {
        this.f17070x.setVisibility(8);
    }

    /* JADX INFO: renamed from: F */
    public boolean m19295F() {
        if (!NullChecker.a(this.f17054h) || this.f17054h.getVisibility() != 0) {
            return false;
        }
        this.f17054h.setVisibility(8);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void m19296G() {
        this.f17067u.b(new e30() { // from class: l.ilr
            public final void call(Object obj) {
                this.f14554a.m19300L((View) obj);
            }
        }, new baj() { // from class: l.jlr
            /* JADX INFO: renamed from: a */
            public final Object m17618a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f15260a.m19301M((Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        this.f17067u.setSceneView(this.f17034B);
    }

    /* JADX INFO: renamed from: H */
    public void m19297H(d30 d30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f17040H, 2);
        gridLayoutManager.v(new C1018a());
        this.f17065s.setLayoutManager(gridLayoutManager);
        this.f17065s.setOnPullUpListener(d30Var);
        this.f17065s.setPullUpInterval(300L);
        this.f17065s.setAdapter(this.f17041I.m10021P4());
        if (IntlCountryCodeController.m21v()) {
            return;
        }
        new k(this.f17041I.m10022Q4()).g(this.f17065s);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m19298I(View view, TextView textView) {
        if (NullChecker.a(this.f17056j) && NullChecker.a(view)) {
            this.f17056j.removeView(textView);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m19299J(View view, TextView textView, int[] iArr) {
        xdl0.g gVarJ0 = xdl0.j0(view, this.f17056j);
        xdl0.g gVarJ1 = xdl0.j0(textView, this.f17056j);
        float f = (gVarJ0.a - gVarJ1.a) + ((gVarJ0.c - gVarJ1.c) / 2);
        float f2 = (gVarJ0.b - gVarJ1.b) - gVarJ1.d;
        textView.setTranslationX(f);
        textView.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m19300L(View view) {
        this.f17056j.removeView(view);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ View m19301M(Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m19323w(this.f17067u, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m19302N() {
        if (!NullChecker.a(this.f17040H.toolbar())) {
            return Boolean.TRUE;
        }
        Iterator it = vwb.n(xdl0.s(this.f17040H.toolbar()), new w9j() { // from class: l.hlr
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.c(3));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m19303O(View view) {
        this.f17043K.m10142N1("seepageSeePurchaseClick");
    }

    /* JADX INFO: renamed from: R */
    public void m19305R() {
        if (this.f17045M == null) {
            this.f17045M = (LikersAnimationMaskView) this.f17036D.inflate();
        }
        this.f17045M.m9991d();
    }

    /* JADX INFO: renamed from: S */
    public void m19306S(q860<User> q860Var) {
        int iD = q860Var == null ? 0 : q860Var.d();
        if (!this.f17043K.m10149X0()) {
            setTitle(this.f17043K.mo10144P(iD));
        }
        if (q860Var == null) {
            mo19264a(true, false);
        } else {
            this.f17041I.m10021P4().m10074T(q860Var.a);
            mo19264a(false, iD == 0);
        }
        xdl0.M0(this.f17037E, false);
        m19312Y(true);
    }

    /* JADX INFO: renamed from: T */
    public void m19307T(boolean z) {
        ImageView imageView = this.f17054h;
        if (z) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.f17054h.setImageResource(b3c0.h6);
        }
        CoreMemberModule.F().b().Ss(this);
    }

    /* JADX INFO: renamed from: U */
    public void m19308U(@DrawableRes int i) {
        VNavigationBar vNavigationBar = this.f17055i;
        if (vNavigationBar == null) {
            return;
        }
        vNavigationBar.setLeftIconResource(i);
    }

    /* JADX INFO: renamed from: V */
    public void m19309V() {
        boolean zM10141L1 = this.f17043K.m10141L1();
        Button button = this.f17037E;
        if (zM10141L1) {
            button.setText("查看谁喜欢我");
            this.f17037E.setTextSize(18.0f);
            this.f17037E.setLetterSpacing(0.11f);
            this.f17037E.setTypeface(Typeface.DEFAULT_BOLD);
            this.f17037E.setBackground(this.f17040H.drawable(b3c0.o6));
        } else {
            button.setText("获取特权");
            this.f17037E.setTextSize(16.0f);
            this.f17037E.setLetterSpacing(0.0f);
            this.f17037E.setTypeface(eqh0.c(2));
            this.f17037E.setBackground(this.f17040H.drawable(b3c0.l6));
        }
        this.f17037E.setOnClickListener(new View.OnClickListener() { // from class: l.klr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15899a.m19303O(view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m19310W(boolean z) {
        this.f17046N = z;
        this.f17041I.m10021P4().m10075U(z);
    }

    /* JADX INFO: renamed from: X */
    public void m19311X(int i) {
        this.f17055i.setTitle(i);
    }

    /* JADX INFO: renamed from: Y */
    public void m19312Y(boolean z) {
        xdl0.M(this.f17067u, z);
    }

    /* JADX INFO: renamed from: Z */
    public void m19313Z(int i) {
        if (CoreModule.f1534c.f3628e0.m21490p9().isBanned()) {
            return;
        }
        zvf0.A("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "bubble"), vwb.Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.Y("tooltips_trigger_module", "boost_button"), vwb.Y("tooltips_trigger_page", "see_page"), vwb.Y("tooltips_trigger_reason", "guide")});
        final d30 d30Var = new d30() { // from class: l.elr
            public final void call() {
                zvf0.u("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "bubble"), vwb.Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.Y("tooltips_trigger_module", "boost_button"), vwb.Y("tooltips_trigger_page", "see_page"), vwb.Y("tooltips_trigger_reason", "guide")});
            }
        };
        this.f17070x.setVisibility(0);
        this.f17070x.setOnClickListener(new View.OnClickListener() { // from class: l.flr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        Runnable runnable = new Runnable() { // from class: l.glr
            @Override // java.lang.Runnable
            public final void run() {
                this.f13382a.m19294E();
            }
        };
        this.f17042J = runnable;
        e51.H(this.f17040H, runnable, i);
        CoreMemberModule.F().b().O6();
    }

    @Override // p006l.qtl
    /* JADX INFO: renamed from: a */
    public void mo19264a(boolean z, boolean z2) {
        if (z) {
            this.f17057k.setVisibility(0);
            this.f17061o.setVisibility(4);
            this.f17058l.setVisibility(4);
            this.f17064r.setVisibility(0);
            this.f17065s.setVisibility(4);
            return;
        }
        if (!z2 || this.f17046N) {
            this.f17057k.setVisibility(4);
            this.f17058l.setVisibility(4);
            this.f17064r.setVisibility(4);
            this.f17065s.setVisibility(0);
            return;
        }
        this.f17057k.setVisibility(0);
        if (!CoreMemberModule.F().b().k()) {
            this.f17058l.setVisibility(0);
        } else if (this.f17043K.f7125h == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m10199b().m10195n()) {
            this.f17061o.setVisibility(0);
            this.f17062p.m10293b(PicksHelper.HeaderType.EXPAND);
            this.f17058l.setVisibility(4);
            this.f17063q.setVisibility(0);
        } else {
            this.f17061o.setVisibility(0);
            this.f17062p.m10293b(PicksHelper.HeaderType.HIDE);
            this.f17063q.setVisibility(4);
            this.f17058l.setVisibility(0);
        }
        this.f17064r.setVisibility(4);
        this.f17065s.setVisibility(4);
    }

    /* JADX INFO: renamed from: a0 */
    public void m19314a0() {
        this.f17048b.d(this.f17047a);
    }

    /* JADX INFO: renamed from: b0 */
    public void m19315b0(boolean z) {
        xdl0.M0(this.f17037E, z);
    }

    /* JADX INFO: renamed from: c0 */
    public void m19316c0(d30 d30Var) {
        this.f17045M.m9992e(d30Var);
    }

    public void destroy() {
        Runnable runnable = this.f17039G;
        if (runnable != null) {
            e51.J(runnable);
        }
        Runnable runnable2 = this.f17038F;
        if (runnable2 != null) {
            e51.J(runnable2);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM19321u = m19321u(layoutInflater, viewGroup);
        this.f17056j.setBackgroundColor(this.f17040H.getResources().getColor(z0c0.m));
        this.f17059m.setImageResource(b3c0.g6);
        this.f17060n.setTextSize(14.0f);
        this.f17060n.setTextColor(Color.parseColor("#42000000"));
        this.f17060n.setText(this.f17040H.string(com.p1.mobile.putong.core.member.R.string.e1));
        CoreMemberModule.F().b().m6(this);
        this.f17055i.setLeftIconAsBack(this.f17040H);
        this.f17055i.setLeftIconResource(b3c0.b);
        this.f17055i.setRightIconClip(false);
        View viewM19320s = m19320s(LayoutInflater.from(this.f17040H), this.f17055i.getRightIconContainer());
        m19318p(viewM19320s);
        this.f17055i.z(new View[]{viewM19320s});
        xdl0.E0(this.f17049c, new View.OnClickListener() { // from class: l.blr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8978a.m19277K(view);
            }
        });
        m19312Y(true);
        return viewM19321u;
    }

    /* JADX INFO: renamed from: p */
    public final void m19318p(View view) {
        nlr.a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m19319q(View view) {
        plr.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public View m19320s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nlr.b(this, layoutInflater, viewGroup);
    }

    @Override // p006l.qtl
    public void setTitle(CharSequence charSequence) {
        this.f17055i.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public View m19321u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return olr.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f17040H;
    }

    /* JADX INFO: renamed from: w */
    public View m19323w(final View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        d.l().k("boost_see_page_guide");
        if (z2 && this.f17070x.getVisibility() == 0) {
            this.f17070x.setVisibility(8);
        }
        this.f17056j.removeView(this.f17056j.findViewWithTag("likeBoostBubble"));
        final TextView textView = new TextView(this.f17056j.getContext());
        textView.setTag("likeBoostBubble");
        textView.setTextColor(i);
        textView.setTextSize(i2);
        textView.setGravity(17);
        textView.setText(charSequence);
        textView.setBackgroundDrawable(drawable);
        if (!z) {
            textView.setPadding(t100.d(18.0f), t100.d(17.0f), t100.d(18.0f), t100.d(21.0f));
        }
        this.f17056j.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        xdl0.Q0(textView, new e30() { // from class: l.llr
            public final void call(Object obj) {
                this.f16514a.m19299J(view, textView, (int[]) obj);
            }
        });
        if (i3 != -1) {
            e51.H(this.f17040H, new Runnable() { // from class: l.clr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9719a.m19298I(view, textView);
                }
            }, i3);
        }
        return textView;
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m19317i1(C0401c c0401c) {
        this.f17043K = c0401c;
    }

    /* JADX INFO: renamed from: y */
    public void m19325y() {
        CoreMemberModule.F().b().Qe(act(), this.f17067u);
    }

    /* JADX INFO: renamed from: z */
    public boolean m19326z() {
        if (!NullChecker.a(this.f17044L) || !this.f17044L.f()) {
            return false;
        }
        this.f17044L.performClick();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m19304P() {
    }
}
