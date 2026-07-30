package p149l;

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
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.C8963a;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.C8965c;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAnimationMaskView;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p147v.SimpleCoverGuideView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class mlr implements s7m<C8965c>, qtl {

    /* JADX INFO: renamed from: A */
    public TextView f134472A;

    /* JADX INFO: renamed from: B */
    public SceneView f134473B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f134474C;

    /* JADX INFO: renamed from: D */
    public ViewStub f134475D;

    /* JADX INFO: renamed from: E */
    public Button f134476E;

    /* JADX INFO: renamed from: F */
    public Runnable f134477F;

    /* JADX INFO: renamed from: G */
    public Runnable f134478G;

    /* JADX INFO: renamed from: H */
    public PutongAct f134479H;

    /* JADX INFO: renamed from: I */
    public LikersFrag f134480I;

    /* JADX INFO: renamed from: J */
    public Runnable f134481J;

    /* JADX INFO: renamed from: K */
    public C8965c f134482K;

    /* JADX INFO: renamed from: L */
    public SimpleCoverGuideView f134483L;

    /* JADX INFO: renamed from: M */
    public LikersAnimationMaskView f134484M;

    /* JADX INFO: renamed from: N */
    public boolean f134485N = false;

    /* JADX INFO: renamed from: a */
    public VFrame f134486a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f134487b;

    /* JADX INFO: renamed from: c */
    public VFrame f134488c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f134489d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f134490e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f134491f;

    /* JADX INFO: renamed from: g */
    public VImage f134492g;

    /* JADX INFO: renamed from: h */
    public ImageView f134493h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f134494i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f134495j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f134496k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f134497l;

    /* JADX INFO: renamed from: m */
    public VImage f134498m;

    /* JADX INFO: renamed from: n */
    public VText f134499n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f134500o;

    /* JADX INFO: renamed from: p */
    public PicksHeaderView f134501p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f134502q;

    /* JADX INFO: renamed from: r */
    public VProgressBar f134503r;

    /* JADX INFO: renamed from: s */
    public VPullUpRecyclerView f134504s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f134505t;

    /* JADX INFO: renamed from: u */
    public BoostViewContainer f134506u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f134507v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f134508w;

    /* JADX INFO: renamed from: x */
    public TextView f134509x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f134510y;

    /* JADX INFO: renamed from: z */
    public TextView f134511z;

    /* JADX INFO: renamed from: l.mlr$a */
    public class C18494a extends GridLayoutManager.AbstractC0553c {
        public C18494a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (CoreMemberModule.m36001F().m132651b().mo35990k() && i == 0) {
                return 2;
            }
            return (gr9.m127683h() && (mlr.this.f134504s.getAdapter() instanceof C8963a) && ((C8963a) mlr.this.f134504s.getAdapter()).getItemViewType(i) != 1) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: l.mlr$b */
    public class ViewOnClickListenerC18495b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f134513a;

        public ViewOnClickListenerC18495b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f134513a > 1000) {
                this.f134513a = SystemClock.uptimeMillis();
                CoreMemberModule.m36001F().m132651b().mo35999yk(mlr.this.f134479H);
            }
        }
    }

    public mlr(LikersFrag likersFrag) {
        this.f134479H = (PutongAct) likersFrag.act();
        this.f134480I = likersFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m155196K(View view) {
        zvf0.m220396r("e_see_list_feedback_button", "p_see_who_likes_me_view");
        m155210B();
    }

    /* JADX INFO: renamed from: Q */
    private void m155197Q() {
        xdl0.m208366b0(this.f134479H.findViewById(R.id.content), new v9j() { // from class: l.dlr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86850a.m155220N();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m155209A(Menu menu) {
        this.f134479H.getMenuInflater().inflate(i7c0.f111876a, menu);
        MenuItem menuItemFindItem = menu.findItem(x4c0.f191007r);
        m155236q(menuItemFindItem.getActionView());
        CoreMemberModule.m36001F().m132651b().mo35994n9(this);
        menuItemFindItem.setShowAsAction(2);
        menuItemFindItem.getActionView().setOnClickListener(new ViewOnClickListenerC18495b());
        m155197Q();
    }

    /* JADX INFO: renamed from: B */
    public boolean m155210B() {
        CoreMemberModule.m36001F().m132651b().mo35999yk(this.f134479H);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public PicksHeaderView m155211C() {
        return xdl0.m208349O0(this.f134504s) ? (PicksHeaderView) this.f134504s.findViewById(x4c0.f191015z) : this.f134501p;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f134479H;
    }

    /* JADX INFO: renamed from: E */
    public void m155212E() {
        this.f134509x.setVisibility(8);
    }

    /* JADX INFO: renamed from: F */
    public boolean m155213F() {
        if (!NullChecker.m81303a(this.f134493h) || this.f134493h.getVisibility() != 0) {
            return false;
        }
        this.f134493h.setVisibility(8);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void m155214G() {
        this.f134506u.m43691b(new e30() { // from class: l.ilr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113865a.m155218L((View) obj);
            }
        }, new baj() { // from class: l.jlr
            @Override // p149l.baj
            /* JADX INFO: renamed from: a */
            public final Object mo100908a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f118558a.m155219M((Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        this.f134506u.setSceneView(this.f134473B);
    }

    /* JADX INFO: renamed from: H */
    public void m155215H(d30 d30Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f134479H, 2);
        gridLayoutManager.m3326v(new C18494a());
        this.f134504s.setLayoutManager(gridLayoutManager);
        this.f134504s.setOnPullUpListener(d30Var);
        this.f134504s.setPullUpInterval(300L);
        this.f134504s.setAdapter(this.f134480I.m56579P4());
        if (IntlCountryCodeController.m28126v()) {
            return;
        }
        new C0605k(this.f134480I.m56580Q4()).m3750g(this.f134504s);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m155216I(View view, TextView textView) {
        if (NullChecker.m81303a(this.f134495j) && NullChecker.m81303a(view)) {
            this.f134495j.removeView(textView);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m155217J(View view, TextView textView, int[] iArr) {
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(view, this.f134495j);
        xdl0.C21104g c21104gM208382j1 = xdl0.m208382j0(textView, this.f134495j);
        float f = (c21104gM208382j0.f192418a - c21104gM208382j1.f192418a) + ((c21104gM208382j0.f192420c - c21104gM208382j1.f192420c) / 2);
        float f2 = (c21104gM208382j0.f192419b - c21104gM208382j1.f192419b) - c21104gM208382j1.f192421d;
        textView.setTranslationX(f);
        textView.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m155218L(View view) {
        this.f134495j.removeView(view);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ View m155219M(Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m155240w(this.f134506u, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m155220N() {
        if (!NullChecker.m81303a(this.f134479H.toolbar())) {
            return Boolean.TRUE;
        }
        Iterator it = vwb.m200339n(xdl0.m208399s(this.f134479H.toolbar()), new w9j() { // from class: l.hlr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(eqh0.m117752c(3));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m155221O(View view) {
        this.f134482K.m56685N1("seepageSeePurchaseClick");
    }

    /* JADX INFO: renamed from: R */
    public void m155223R() {
        if (this.f134484M == null) {
            this.f134484M = (LikersAnimationMaskView) this.f134475D.inflate();
        }
        this.f134484M.m56549d();
    }

    /* JADX INFO: renamed from: S */
    public void m155224S(q860<User> q860Var) {
        int iM173344d = q860Var == null ? 0 : q860Var.m173344d();
        if (!this.f134482K.m56692X0()) {
            setTitle(this.f134482K.mo56687P(iM173344d));
        }
        if (q860Var == null) {
            mo154901a(true, false);
        } else {
            this.f134480I.m56579P4().m56628T(q860Var.f153135a);
            mo154901a(false, iM173344d == 0);
        }
        xdl0.m208345M0(this.f134476E, false);
        m155230Y(true);
    }

    /* JADX INFO: renamed from: T */
    public void m155225T(boolean z) {
        ImageView imageView = this.f134493h;
        if (z) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.f134493h.setImageResource(b3c0.f73065h6);
        }
        CoreMemberModule.m36001F().m132651b().mo35979Ss(this);
    }

    /* JADX INFO: renamed from: U */
    public void m155226U(@DrawableRes int i) {
        VNavigationBar vNavigationBar = this.f134494i;
        if (vNavigationBar == null) {
            return;
        }
        vNavigationBar.setLeftIconResource(i);
    }

    /* JADX INFO: renamed from: V */
    public void m155227V() {
        boolean zM56684L1 = this.f134482K.m56684L1();
        Button button = this.f134476E;
        if (zM56684L1) {
            button.setText("查看谁喜欢我");
            this.f134476E.setTextSize(18.0f);
            this.f134476E.setLetterSpacing(0.11f);
            this.f134476E.setTypeface(Typeface.DEFAULT_BOLD);
            this.f134476E.setBackground(this.f134479H.drawable(b3c0.f73121o6));
        } else {
            button.setText("获取特权");
            this.f134476E.setTextSize(16.0f);
            this.f134476E.setLetterSpacing(0.0f);
            this.f134476E.setTypeface(eqh0.m117752c(2));
            this.f134476E.setBackground(this.f134479H.drawable(b3c0.f73097l6));
        }
        this.f134476E.setOnClickListener(new View.OnClickListener() { // from class: l.klr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123689a.m155221O(view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m155228W(boolean z) {
        this.f134485N = z;
        this.f134480I.m56579P4().m56629U(z);
    }

    /* JADX INFO: renamed from: X */
    public void m155229X(int i) {
        this.f134494i.setTitle(i);
    }

    /* JADX INFO: renamed from: Y */
    public void m155230Y(boolean z) {
        xdl0.m208344M(this.f134506u, z);
    }

    /* JADX INFO: renamed from: Z */
    public void m155231Z(int i) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isBanned()) {
            return;
        }
        zvf0.m220368A("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "bubble"), vwb.m200311Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.m200311Y("tooltips_trigger_module", "boost_button"), vwb.m200311Y("tooltips_trigger_page", "see_page"), vwb.m200311Y("tooltips_trigger_reason", "guide"));
        final d30 d30Var = new d30() { // from class: l.elr
            @Override // p149l.d30
            public final void call() {
                zvf0.m220399u("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "bubble"), vwb.m200311Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.m200311Y("tooltips_trigger_module", "boost_button"), vwb.m200311Y("tooltips_trigger_page", "see_page"), vwb.m200311Y("tooltips_trigger_reason", "guide"));
            }
        };
        this.f134509x.setVisibility(0);
        this.f134509x.setOnClickListener(new View.OnClickListener() { // from class: l.flr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        Runnable runnable = new Runnable() { // from class: l.glr
            @Override // java.lang.Runnable
            public final void run() {
                this.f103393a.m155212E();
            }
        };
        this.f134481J = runnable;
        e51.m114743H(this.f134479H, runnable, i);
        CoreMemberModule.m36001F().m132651b().mo35974O6();
    }

    @Override // p149l.qtl
    /* JADX INFO: renamed from: a */
    public void mo154901a(boolean z, boolean z2) {
        if (z) {
            this.f134496k.setVisibility(0);
            this.f134500o.setVisibility(4);
            this.f134497l.setVisibility(4);
            this.f134503r.setVisibility(0);
            this.f134504s.setVisibility(4);
            return;
        }
        if (!z2 || this.f134485N) {
            this.f134496k.setVisibility(4);
            this.f134497l.setVisibility(4);
            this.f134503r.setVisibility(4);
            this.f134504s.setVisibility(0);
            return;
        }
        this.f134496k.setVisibility(0);
        if (!CoreMemberModule.m36001F().m132651b().mo35990k()) {
            this.f134497l.setVisibility(0);
        } else if (this.f134482K.f37344h == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m56740b().m56736n()) {
            this.f134500o.setVisibility(0);
            this.f134501p.m56823b(PicksHelper.HeaderType.EXPAND);
            this.f134497l.setVisibility(4);
            this.f134502q.setVisibility(0);
        } else {
            this.f134500o.setVisibility(0);
            this.f134501p.m56823b(PicksHelper.HeaderType.HIDE);
            this.f134502q.setVisibility(4);
            this.f134497l.setVisibility(0);
        }
        this.f134503r.setVisibility(4);
        this.f134504s.setVisibility(4);
    }

    /* JADX INFO: renamed from: a0 */
    public void m155232a0() {
        this.f134487b.m43693d(this.f134486a);
    }

    /* JADX INFO: renamed from: b0 */
    public void m155233b0(boolean z) {
        xdl0.m208345M0(this.f134476E, z);
    }

    /* JADX INFO: renamed from: c0 */
    public void m155234c0(d30 d30Var) {
        this.f134484M.m56550e(d30Var);
    }

    @Override // p149l.s7m
    public void destroy() {
        Runnable runnable = this.f134478G;
        if (runnable != null) {
            e51.m114745J(runnable);
        }
        Runnable runnable2 = this.f134477F;
        if (runnable2 != null) {
            e51.m114745J(runnable2);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM155238u = m155238u(layoutInflater, viewGroup);
        this.f134495j.setBackgroundColor(this.f134479H.getResources().getColor(z0c0.f200985m));
        this.f134498m.setImageResource(b3c0.f73057g6);
        this.f134499n.setTextSize(14.0f);
        this.f134499n.setTextColor(Color.parseColor("#42000000"));
        this.f134499n.setText(this.f134479H.string(R$string.f20641e1));
        CoreMemberModule.m36001F().m132651b().mo35993m6(this);
        this.f134494i.setLeftIconAsBack(this.f134479H);
        this.f134494i.setLeftIconResource(b3c0.f73010b);
        this.f134494i.setRightIconClip(false);
        View viewM155237s = m155237s(LayoutInflater.from(this.f134479H), this.f134494i.getRightIconContainer());
        m155235p(viewM155237s);
        this.f134494i.m223589z(viewM155237s);
        xdl0.m208329E0(this.f134488c, new View.OnClickListener() { // from class: l.blr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76207a.m155196K(view);
            }
        });
        m155230Y(true);
        return viewM155238u;
    }

    /* JADX INFO: renamed from: p */
    public final void m155235p(View view) {
        nlr.m160073a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m155236q(View view) {
        plr.m170253a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public View m155237s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nlr.m160074b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.qtl
    public void setTitle(CharSequence charSequence) {
        this.f134494i.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public View m155238u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return olr.m164989b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f134479H;
    }

    /* JADX INFO: renamed from: w */
    public View m155240w(final View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        C4348d.m20896l().m20900k("boost_see_page_guide");
        if (z2 && this.f134509x.getVisibility() == 0) {
            this.f134509x.setVisibility(8);
        }
        this.f134495j.removeView(this.f134495j.findViewWithTag("likeBoostBubble"));
        final TextView textView = new TextView(this.f134495j.getContext());
        textView.setTag("likeBoostBubble");
        textView.setTextColor(i);
        textView.setTextSize(i2);
        textView.setGravity(17);
        textView.setText(charSequence);
        textView.setBackgroundDrawable(drawable);
        if (!z) {
            textView.setPadding(t100.m186890d(18.0f), t100.m186890d(17.0f), t100.m186890d(18.0f), t100.m186890d(21.0f));
        }
        this.f134495j.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        xdl0.m208353Q0(textView, new e30() { // from class: l.llr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128744a.m155217J(view, textView, (int[]) obj);
            }
        });
        if (i3 != -1) {
            e51.m114743H(this.f134479H, new Runnable() { // from class: l.clr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81459a.m155216I(view, textView);
                }
            }, i3);
        }
        return textView;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8965c c8965c) {
        this.f134482K = c8965c;
    }

    /* JADX INFO: renamed from: y */
    public void m155242y() {
        CoreMemberModule.m36001F().m132651b().mo35977Qe(act(), this.f134506u);
    }

    /* JADX INFO: renamed from: z */
    public boolean m155243z() {
        if (!NullChecker.m81303a(this.f134483L) || !this.f134483L.m222901f()) {
            return false;
        }
        this.f134483L.performClick();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m155222P() {
    }
}
