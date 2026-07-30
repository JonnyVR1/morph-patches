package p153l;

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
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.C9126a;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.C9128c;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAnimationMaskView;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p151v.SimpleCoverGuideView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.VText_AutoFit;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class nnr implements iam<C9128c>, ewl {

    /* JADX INFO: renamed from: A */
    public TextView f142821A;

    /* JADX INFO: renamed from: B */
    public SceneView f142822B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f142823C;

    /* JADX INFO: renamed from: D */
    public ViewStub f142824D;

    /* JADX INFO: renamed from: E */
    public Button f142825E;

    /* JADX INFO: renamed from: F */
    public Runnable f142826F;

    /* JADX INFO: renamed from: G */
    public Runnable f142827G;

    /* JADX INFO: renamed from: H */
    public PutongAct f142828H;

    /* JADX INFO: renamed from: I */
    public LikersFrag f142829I;

    /* JADX INFO: renamed from: J */
    public Runnable f142830J;

    /* JADX INFO: renamed from: K */
    public C9128c f142831K;

    /* JADX INFO: renamed from: L */
    public SimpleCoverGuideView f142832L;

    /* JADX INFO: renamed from: M */
    public LikersAnimationMaskView f142833M;

    /* JADX INFO: renamed from: N */
    public boolean f142834N = false;

    /* JADX INFO: renamed from: a */
    public VFrame f142835a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f142836b;

    /* JADX INFO: renamed from: c */
    public VFrame f142837c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f142838d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f142839e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f142840f;

    /* JADX INFO: renamed from: g */
    public VImage f142841g;

    /* JADX INFO: renamed from: h */
    public ImageView f142842h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f142843i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f142844j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f142845k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f142846l;

    /* JADX INFO: renamed from: m */
    public VImage f142847m;

    /* JADX INFO: renamed from: n */
    public VText f142848n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f142849o;

    /* JADX INFO: renamed from: p */
    public PicksHeaderView f142850p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f142851q;

    /* JADX INFO: renamed from: r */
    public VProgressBar f142852r;

    /* JADX INFO: renamed from: s */
    public VPullUpRecyclerView f142853s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f142854t;

    /* JADX INFO: renamed from: u */
    public BoostViewContainer f142855u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f142856v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f142857w;

    /* JADX INFO: renamed from: x */
    public TextView f142858x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f142859y;

    /* JADX INFO: renamed from: z */
    public TextView f142860z;

    /* JADX INFO: renamed from: l.nnr$a */
    public class C18906a extends GridLayoutManager.AbstractC0554c {
        public C18906a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (CoreMemberModule.m37004F().m187693b().mo36993k() && i == 0) {
                return 2;
            }
            return (rs9.m182939h() && (nnr.this.f142853s.getAdapter() instanceof C9126a) && ((C9126a) nnr.this.f142853s.getAdapter()).getItemViewType(i) != 1) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: l.nnr$b */
    public class ViewOnClickListenerC18907b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f142862a;

        public ViewOnClickListenerC18907b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.uptimeMillis() - this.f142862a > 1000) {
                this.f142862a = SystemClock.uptimeMillis();
                CoreMemberModule.m37004F().m187693b().mo37002yk(nnr.this.f142828H);
            }
        }
    }

    public nnr(LikersFrag likersFrag) {
        this.f142828H = (PutongAct) likersFrag.act();
        this.f142829I = likersFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m163907K(View view) {
        i4g0.m138520r("e_see_list_feedback_button", "p_see_who_likes_me_view");
        m163921B();
    }

    /* JADX INFO: renamed from: Q */
    private void m163908Q() {
        bnl0.m105546b0(this.f142828H.findViewById(R.id.content), new pcj() { // from class: l.enr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f94803a.m163931N();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m163920A(Menu menu) {
        this.f142828H.getMenuInflater().inflate(mfc0.f136642a, menu);
        MenuItem menuItemFindItem = menu.findItem(ddc0.f87912r);
        m163947q(menuItemFindItem.getActionView());
        CoreMemberModule.m37004F().m187693b().mo36997n9(this);
        menuItemFindItem.setShowAsAction(2);
        menuItemFindItem.getActionView().setOnClickListener(new ViewOnClickListenerC18907b());
        m163908Q();
    }

    /* JADX INFO: renamed from: B */
    public boolean m163921B() {
        CoreMemberModule.m37004F().m187693b().mo37002yk(this.f142828H);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public PicksHeaderView m163922C() {
        return bnl0.m105529O0(this.f142853s) ? (PicksHeaderView) this.f142853s.findViewById(ddc0.f87920z) : this.f142850p;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f142828H;
    }

    /* JADX INFO: renamed from: E */
    public void m163923E() {
        this.f142858x.setVisibility(8);
    }

    /* JADX INFO: renamed from: F */
    public boolean m163924F() {
        if (!NullChecker.m82486a(this.f142842h) || this.f142842h.getVisibility() != 0) {
            return false;
        }
        this.f142842h.setVisibility(8);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void m163925G() {
        this.f142855u.m44877b(new y20() { // from class: l.jnr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121883a.m163929L((View) obj);
            }
        }, new vcj() { // from class: l.knr
            @Override // p153l.vcj
            /* JADX INFO: renamed from: a */
            public final Object mo103927a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f127627a.m163930M((Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        this.f142855u.setSceneView(this.f142822B);
    }

    /* JADX INFO: renamed from: H */
    public void m163926H(x20 x20Var) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f142828H, 2);
        gridLayoutManager.m3327v(new C18906a());
        this.f142853s.setLayoutManager(gridLayoutManager);
        this.f142853s.setOnPullUpListener(x20Var);
        this.f142853s.setPullUpInterval(300L);
        this.f142853s.setAdapter(this.f142829I.m57762P4());
        if (IntlCountryCodeController.m29125v()) {
            return;
        }
        new C0607k(this.f142829I.m57763Q4()).m3751g(this.f142853s);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m163927I(View view, TextView textView) {
        if (NullChecker.m82486a(this.f142844j) && NullChecker.m82486a(view)) {
            this.f142844j.removeView(textView);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m163928J(View view, TextView textView, int[] iArr) {
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(view, this.f142844j);
        bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(textView, this.f142844j);
        float f = (c16067gM105562j0.f77559a - c16067gM105562j1.f77559a) + ((c16067gM105562j0.f77561c - c16067gM105562j1.f77561c) / 2);
        float f2 = (c16067gM105562j0.f77560b - c16067gM105562j1.f77560b) - c16067gM105562j1.f77562d;
        textView.setTranslationX(f);
        textView.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m163929L(View view) {
        this.f142844j.removeView(view);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ View m163930M(Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m163951w(this.f142855u, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m163931N() {
        if (!NullChecker.m82486a(this.f142828H.toolbar())) {
            return Boolean.TRUE;
        }
        Iterator it = jyb.m147522n(bnl0.m105579s(this.f142828H.toolbar()), new qcj() { // from class: l.inr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            if (!TextUtils.isEmpty(textView.getText())) {
                textView.setTypeface(lyh0.m156283c(3));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m163932O(View view) {
        this.f142831K.m57868N1("seepageSeePurchaseClick");
    }

    /* JADX INFO: renamed from: R */
    public void m163934R() {
        if (this.f142833M == null) {
            this.f142833M = (LikersAnimationMaskView) this.f142824D.inflate();
        }
        this.f142833M.m57732d();
    }

    /* JADX INFO: renamed from: S */
    public void m163935S(vg60<User> vg60Var) {
        int iM201222d = vg60Var == null ? 0 : vg60Var.m201222d();
        if (!this.f142831K.m57875X0()) {
            setTitle(this.f142831K.mo57870P(iM201222d));
        }
        if (vg60Var == null) {
            mo122954a(true, false);
        } else {
            this.f142829I.m57762P4().m57811T(vg60Var.f184001a);
            mo122954a(false, iM201222d == 0);
        }
        bnl0.m105525M0(this.f142825E, false);
        m163941Y(true);
    }

    /* JADX INFO: renamed from: T */
    public void m163936T(boolean z) {
        ImageView imageView = this.f142842h;
        if (z) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.f142842h.setImageResource(gbc0.f103316h6);
        }
        CoreMemberModule.m37004F().m187693b().mo36982Ss(this);
    }

    /* JADX INFO: renamed from: U */
    public void m163937U(@DrawableRes int i) {
        VNavigationBar vNavigationBar = this.f142843i;
        if (vNavigationBar == null) {
            return;
        }
        vNavigationBar.setLeftIconResource(i);
    }

    /* JADX INFO: renamed from: V */
    public void m163938V() {
        boolean zM57867L1 = this.f142831K.m57867L1();
        Button button = this.f142825E;
        if (zM57867L1) {
            button.setText("查看谁喜欢我");
            this.f142825E.setTextSize(18.0f);
            this.f142825E.setLetterSpacing(0.11f);
            this.f142825E.setTypeface(Typeface.DEFAULT_BOLD);
            this.f142825E.setBackground(this.f142828H.drawable(gbc0.f103372o6));
        } else {
            button.setText("获取特权");
            this.f142825E.setTextSize(16.0f);
            this.f142825E.setLetterSpacing(0.0f);
            this.f142825E.setTypeface(lyh0.m156283c(2));
            this.f142825E.setBackground(this.f142828H.drawable(gbc0.f103348l6));
        }
        this.f142825E.setOnClickListener(new View.OnClickListener() { // from class: l.lnr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132838a.m163932O(view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m163939W(boolean z) {
        this.f142834N = z;
        this.f142829I.m57762P4().m57812U(z);
    }

    /* JADX INFO: renamed from: X */
    public void m163940X(int i) {
        this.f142843i.setTitle(i);
    }

    /* JADX INFO: renamed from: Y */
    public void m163941Y(boolean z) {
        bnl0.m105524M(this.f142855u, z);
    }

    /* JADX INFO: renamed from: Z */
    public void m163942Z(int i) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isBanned()) {
            return;
        }
        i4g0.m138492A("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "bubble"), jyb.m147494Y("tooltips_type_ui", "bubble_basic_double_edge"), jyb.m147494Y("tooltips_trigger_module", "boost_button"), jyb.m147494Y("tooltips_trigger_page", "see_page"), jyb.m147494Y("tooltips_trigger_reason", "guide"));
        final x20 x20Var = new x20() { // from class: l.fnr
            @Override // p153l.x20
            public final void call() {
                i4g0.m138523u("e_bubble_boost_see_page_guide", "p_see_who_likes_me_view", jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "bubble"), jyb.m147494Y("tooltips_type_ui", "bubble_basic_double_edge"), jyb.m147494Y("tooltips_trigger_module", "boost_button"), jyb.m147494Y("tooltips_trigger_page", "see_page"), jyb.m147494Y("tooltips_trigger_reason", "guide"));
            }
        };
        this.f142858x.setVisibility(0);
        this.f142858x.setOnClickListener(new View.OnClickListener() { // from class: l.gnr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        Runnable runnable = new Runnable() { // from class: l.hnr
            @Override // java.lang.Runnable
            public final void run() {
                this.f110814a.m163923E();
            }
        };
        this.f142830J = runnable;
        l51.m152888H(this.f142828H, runnable, i);
        CoreMemberModule.m37004F().m187693b().mo36977O6();
    }

    @Override // p153l.ewl
    /* JADX INFO: renamed from: a */
    public void mo122954a(boolean z, boolean z2) {
        if (z) {
            this.f142845k.setVisibility(0);
            this.f142849o.setVisibility(4);
            this.f142846l.setVisibility(4);
            this.f142852r.setVisibility(0);
            this.f142853s.setVisibility(4);
            return;
        }
        if (!z2 || this.f142834N) {
            this.f142845k.setVisibility(4);
            this.f142846l.setVisibility(4);
            this.f142852r.setVisibility(4);
            this.f142853s.setVisibility(0);
            return;
        }
        this.f142845k.setVisibility(0);
        if (!CoreMemberModule.m37004F().m187693b().mo36993k()) {
            this.f142846l.setVisibility(0);
        } else if (this.f142831K.f38192h == BusinessEntranceStyle.PICKS && PicksHelper.INSTANCE.m57923b().m57919n()) {
            this.f142849o.setVisibility(0);
            this.f142850p.m58006b(PicksHelper.HeaderType.EXPAND);
            this.f142846l.setVisibility(4);
            this.f142851q.setVisibility(0);
        } else {
            this.f142849o.setVisibility(0);
            this.f142850p.m58006b(PicksHelper.HeaderType.HIDE);
            this.f142851q.setVisibility(4);
            this.f142846l.setVisibility(0);
        }
        this.f142852r.setVisibility(4);
        this.f142853s.setVisibility(4);
    }

    /* JADX INFO: renamed from: a0 */
    public void m163943a0() {
        this.f142836b.m44879d(this.f142835a);
    }

    /* JADX INFO: renamed from: b0 */
    public void m163944b0(boolean z) {
        bnl0.m105525M0(this.f142825E, z);
    }

    /* JADX INFO: renamed from: c0 */
    public void m163945c0(x20 x20Var) {
        this.f142833M.m57733e(x20Var);
    }

    @Override // p153l.iam
    public void destroy() {
        Runnable runnable = this.f142827G;
        if (runnable != null) {
            l51.m152890J(runnable);
        }
        Runnable runnable2 = this.f142826F;
        if (runnable2 != null) {
            l51.m152890J(runnable2);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM163949u = m163949u(layoutInflater, viewGroup);
        this.f142844j.setBackgroundColor(this.f142828H.getResources().getColor(f9c0.f97868m));
        this.f142847m.setImageResource(gbc0.f103308g6);
        this.f142848n.setTextSize(14.0f);
        this.f142848n.setTextColor(Color.parseColor("#42000000"));
        this.f142848n.setText(this.f142828H.string(R$string.f21383e1));
        CoreMemberModule.m37004F().m187693b().mo36996m6(this);
        this.f142843i.setLeftIconAsBack(this.f142828H);
        this.f142843i.setLeftIconResource(gbc0.f103261b);
        this.f142843i.setRightIconClip(false);
        View viewM163948s = m163948s(LayoutInflater.from(this.f142828H), this.f142843i.getRightIconContainer());
        m163946p(viewM163948s);
        this.f142843i.m224835z(viewM163948s);
        bnl0.m105509E0(this.f142837c, new View.OnClickListener() { // from class: l.cnr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82757a.m163907K(view);
            }
        });
        m163941Y(true);
        return viewM163949u;
    }

    /* JADX INFO: renamed from: p */
    public final void m163946p(View view) {
        onr.m168346a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m163947q(View view) {
        qnr.m177265a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public View m163948s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return onr.m168347b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.ewl
    public void setTitle(CharSequence charSequence) {
        this.f142843i.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public View m163949u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pnr.m173077b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f142828H;
    }

    /* JADX INFO: renamed from: w */
    public View m163951w(final View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        C4499d.m21895l().m21899k("boost_see_page_guide");
        if (z2 && this.f142858x.getVisibility() == 0) {
            this.f142858x.setVisibility(8);
        }
        this.f142844j.removeView(this.f142844j.findViewWithTag("likeBoostBubble"));
        final TextView textView = new TextView(this.f142844j.getContext());
        textView.setTag("likeBoostBubble");
        textView.setTextColor(i);
        textView.setTextSize(i2);
        textView.setGravity(17);
        textView.setText(charSequence);
        textView.setBackgroundDrawable(drawable);
        if (!z) {
            textView.setPadding(qa00.m175859d(18.0f), qa00.m175859d(17.0f), qa00.m175859d(18.0f), qa00.m175859d(21.0f));
        }
        this.f142844j.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        bnl0.m105533Q0(textView, new y20() { // from class: l.mnr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137722a.m163928J(view, textView, (int[]) obj);
            }
        });
        if (i3 != -1) {
            l51.m152888H(this.f142828H, new Runnable() { // from class: l.dnr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89823a.m163927I(view, textView);
                }
            }, i3);
        }
        return textView;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C9128c c9128c) {
        this.f142831K = c9128c;
    }

    /* JADX INFO: renamed from: y */
    public void m163953y() {
        CoreMemberModule.m37004F().m187693b().mo36980Qe(act(), this.f142855u);
    }

    /* JADX INFO: renamed from: z */
    public boolean m163954z() {
        if (!NullChecker.m82486a(this.f142832L) || !this.f142832L.m224147f()) {
            return false;
        }
        this.f142832L.performClick();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m163933P() {
    }
}
