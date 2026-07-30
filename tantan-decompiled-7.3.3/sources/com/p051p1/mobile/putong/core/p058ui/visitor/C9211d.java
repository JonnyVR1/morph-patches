package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bgc0;
import p153l.bnl0;
import p153l.cfm0;
import p153l.f9c0;
import p153l.gbc0;
import p153l.h80;
import p153l.i4g0;
import p153l.iam;
import p153l.jn50;
import p153l.joa;
import p153l.kfm0;
import p153l.l51;
import p153l.mam;
import p153l.mvc0;
import p153l.pf60;
import p153l.qa00;
import p153l.sfj0;
import p153l.uqb0;
import p153l.uu00;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d */
/* JADX INFO: loaded from: classes12.dex */
public class C9211d implements iam<C9210c>, jn50, mam {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f38998a;

    /* JADX INFO: renamed from: b */
    public VLinear f38999b;

    /* JADX INFO: renamed from: c */
    public VPullDownRefreshLayout f39000c;

    /* JADX INFO: renamed from: d */
    public VPullUpRecyclerView f39001d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f39002e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f39003f;

    /* JADX INFO: renamed from: g */
    public TextView f39004g;

    /* JADX INFO: renamed from: h */
    public TextView f39005h;

    /* JADX INFO: renamed from: i */
    public VLinear f39006i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f39007j;

    /* JADX INFO: renamed from: k */
    public VText f39008k;

    /* JADX INFO: renamed from: l */
    public VRelative f39009l;

    /* JADX INFO: renamed from: m */
    public VImage f39010m;

    /* JADX INFO: renamed from: n */
    public VText f39011n;

    /* JADX INFO: renamed from: o */
    public VText f39012o;

    /* JADX INFO: renamed from: p */
    public VButton f39013p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f39014q;

    /* JADX INFO: renamed from: r */
    public View f39015r;

    /* JADX INFO: renamed from: s */
    public VisitorsFilterBar f39016s;

    /* JADX INFO: renamed from: t */
    public AbstractC9208a f39017t;

    /* JADX INFO: renamed from: u */
    public C9210c f39018u;

    /* JADX INFO: renamed from: v */
    public MomentVisitorsFrag f39019v;

    /* JADX INFO: renamed from: w */
    public h80 f39020w = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d$b */
    public class b extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f39022a;

        public b(GridLayoutManager gridLayoutManager) {
            this.f39022a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            int itemViewType = C9211d.this.f39017t.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == 3) {
                return this.f39022a.m3318m();
            }
            return 1;
        }
    }

    public C9211d(MomentVisitorsFrag momentVisitorsFrag) {
        this.f39019v = momentVisitorsFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m59104A() {
        if (joa.m146357G3()) {
            return;
        }
        RecyclerView.AbstractC0579o layoutManager = this.f39001d.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() <= 0) {
            return;
        }
        m59125M("p_navigation_visit,button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m59105B(View view) {
        sfj0.m185596c("e_visitor_unlock", "p_my_visitor", new sfj0.C20032a[0]);
        m59125M("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m59116C(Boolean bool) {
        this.f39018u.m59099d1(bool.booleanValue());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f39019v.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m59117E(View view) {
        this.f39016s.m58983g();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m59118F() {
        this.f39018u.getData();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m59119G(PurchaseType purchaseType) {
        l51.m152889I(this.f39019v, new Runnable() { // from class: l.ru00
            @Override // java.lang.Runnable
            public final void run() {
                this.f164890a.m59118F();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m59120H(View view) {
        if (CoreModule.m30933P().m143405a().mo34452Y9()) {
            i4g0.m138520r("e_my_visitor_set", "p_my_visitor");
        } else {
            i4g0.m138520r("e_moment_visitor_set", "p_moment_visitor");
        }
        m59123K();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m59121I(View view) {
        if (CoreModule.m30933P().m143405a().mo34452Y9()) {
            i4g0.m138520r("e_my_visitor_set", "p_my_visitor");
        } else {
            i4g0.m138520r("e_moment_visitor_set", "p_moment_visitor");
        }
        m59123K();
    }

    /* JADX INFO: renamed from: J */
    public void m59122J() {
        this.f39018u.m59098c1();
    }

    /* JADX INFO: renamed from: K */
    public void m59123K() {
        new kfm0(this.f39019v.act(), bgc0.f76584e, true).m149572t(new y20() { // from class: l.su00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170635a.m59116C((Boolean) obj);
            }
        }).show();
    }

    /* JADX INFO: renamed from: L */
    public void m59124L(List<cfm0> list) {
        if (list == null || list.size() == 0) {
            this.f39006i.setVisibility(0);
            this.f38999b.setVisibility(8);
            this.f39002e.setVisibility(8);
            uqb0.f180374G.m127138Y0(this.f39007j, gbc0.f103168N5);
            this.f39008k.setText("没有符合条件的访客");
            return;
        }
        this.f39006i.setVisibility(8);
        this.f38999b.setVisibility(0);
        if (!CoreModule.m30933P().m143405a().mo180463f() || joa.m146357G3()) {
            this.f39002e.setVisibility(8);
            if (CoreModule.m30933P().m143405a().mo34452Y9()) {
                int paddingBottom = this.f39001d.getPaddingBottom();
                int i = qa00.f156326m;
                if (paddingBottom != i) {
                    VPullUpRecyclerView vPullUpRecyclerView = this.f39001d;
                    vPullUpRecyclerView.setPadding(vPullUpRecyclerView.getPaddingLeft(), this.f39001d.getPaddingTop(), this.f39001d.getPaddingRight(), i);
                }
            }
        } else {
            sfj0.m185601h("e_visitor_unlock", "p_my_visitor", new sfj0.C20032a[0]);
            this.f39002e.setVisibility(0);
            if (CoreModule.m30933P().m143405a().mo34452Y9() && this.f39001d.getPaddingBottom() != 0) {
                VPullUpRecyclerView vPullUpRecyclerView2 = this.f39001d;
                vPullUpRecyclerView2.setPadding(vPullUpRecyclerView2.getPaddingLeft(), this.f39001d.getPaddingTop(), this.f39001d.getPaddingRight(), 0);
            }
        }
        this.f39017t.mo59047E(list);
    }

    /* JADX INFO: renamed from: M */
    public void m59125M(String str) {
        CoreModule.m30933P().m143410g().mo36024Og(this.f39019v.act(), str, new y20() { // from class: l.pu00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154132a.m59119G((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: N */
    public void m59126N() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f39000c;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(true);
    }

    /* JADX INFO: renamed from: O */
    public void m59127O(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f39000c;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m225024w(z);
    }

    /* JADX INFO: renamed from: P */
    public void m59128P() {
        if (!this.f39018u.f38991b) {
            this.f38998a.m224830B();
            return;
        }
        if (CoreModule.m30933P().m143405a().mo180463f()) {
            ImageView imageView = new ImageView(this.f39019v.act());
            imageView.setImageResource(gbc0.f103182P5);
            this.f38998a.m224835z(imageView);
            if (!CoreModule.m30933P().m143405a().mo34452Y9()) {
                i4g0.m138526x("e_moment_visitor_set", "p_moment_visitor");
            }
            bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.nu00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f143663a.m59120H(view);
                }
            });
            return;
        }
        TextView textView = new TextView(this.f39019v.act());
        textView.setText("设置");
        textView.setTextColor(this.f39019v.act().color(f9c0.f97858c));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(16.0f);
        textView.setPadding(0, 0, qa00.m175859d(12.0f), 0);
        this.f38998a.m224835z(textView);
        if (!CoreModule.m30933P().m143405a().mo34452Y9()) {
            i4g0.m138526x("e_moment_visitor_set", "p_moment_visitor");
        }
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.ou00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149044a.m59121I(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m59129Q(boolean z, boolean z2) {
        if (CoreModule.m30933P().m143405a().mo180463f() && !joa.m146357G3()) {
            bnl0.m105524M(this.f39002e, z);
        }
        bnl0.m105524M(this.f38999b, z);
        bnl0.m105524M(this.f39009l, !z);
        m59135v();
        if (z) {
            this.f39018u.getData();
        } else {
            this.f39006i.setVisibility(8);
        }
        if (z2) {
            MomentVisitorsFrag momentVisitorsFrag = this.f39019v;
            if (z) {
                momentVisitorsFrag.getPermissionPageHelper().m152772g();
                this.f39019v.getDefaultPageHelper().m152783r();
            } else {
                momentVisitorsFrag.getDefaultPageHelper().m152772g();
                this.f39019v.getPermissionPageHelper().m152783r();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void m59130R() {
        m59128P();
        bnl0.m105524M(this.f38999b, this.f39018u.f38991b);
        bnl0.m105524M(this.f39009l, !this.f39018u.f38991b);
        m59135v();
        if (!CoreModule.m30933P().m143405a().mo180463f() || joa.m146357G3()) {
            return;
        }
        bnl0.m105524M(this.f39002e, this.f39018u.f38991b);
    }

    @Override // p153l.mam
    @NonNull
    /* JADX INFO: renamed from: a */
    public VisitorFilterSettings mo59131a() {
        return this.f39018u.m59079D0();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f39019v.act();
    }

    @Override // p153l.mam
    /* JADX INFO: renamed from: b */
    public void mo59132b(boolean z) {
        if (z) {
            this.f39015r.setOnClickListener(new View.OnClickListener() { // from class: l.tu00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176128a.m59117E(view);
                }
            });
            bnl0.m105525M0(this.f39015r, true);
            return;
        }
        if (this.f39018u.m59078C0()) {
            this.f39001d.scrollToPosition(0);
            this.f39018u.m59101f1();
            this.f39018u.m59098c1();
        }
        bnl0.m105525M0(this.f39015r, false);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM59133s = m59133s(layoutInflater, viewGroup);
        this.f38998a.setLeftIconAsBack(getAct());
        viewM59133s.setBackgroundColor(this.f39019v.act().color(f9c0.f97868m));
        return viewM59133s;
    }

    /* JADX INFO: renamed from: s */
    public View m59133s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uu00.m198138b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C9210c c9210c) {
        this.f39018u = c9210c;
    }

    /* JADX INFO: renamed from: v */
    public void m59135v() {
    }

    /* JADX INFO: renamed from: w */
    public final void m59136w() {
        if (CoreModule.m30933P().m143405a().mo34452Y9()) {
            this.f39003f.setBackgroundResource(gbc0.f103175O5);
            this.f39004g.setTextColor(Color.parseColor("#E8CB8C"));
            this.f39005h.setTextColor(Color.parseColor("#CCE8CB8C"));
        }
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        m59122J();
    }

    /* JADX INFO: renamed from: x */
    public final void m59138x() {
        this.f39011n.setTypeface(null, 1);
        this.f39013p.setTypeface(null, 1);
        this.f39011n.setText("开启后可查看谁看过我");
        boolean zMo180463f = CoreModule.m30933P().m143405a().mo180463f();
        VText vText = this.f39012o;
        if (zMo180463f) {
            vText.setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        } else {
            vText.setText("·记录仅展示同样已开启的用户\n·你查看他人动态也将留下记录");
        }
        bnl0.m105509E0(this.f39013p, new View.OnClickListener() { // from class: l.qu00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159507a.m59140z(view);
            }
        });
        if (this.f39019v.getArguments().getBoolean("fromDeeplink", false)) {
            this.f39006i.setVisibility(8);
            this.f39007j.setVisibility(8);
            this.f39008k.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m59139y(boolean z) {
        VNavigationBar vNavigationBar = this.f38998a;
        if (z) {
            bnl0.m105524M(vNavigationBar, false);
        } else {
            bnl0.m105524M(vNavigationBar, true);
            this.f38998a.setLeftIconAsBack(getAct());
            boolean zMo180463f = CoreModule.m30933P().m143405a().mo180463f();
            VNavigationBar vNavigationBar2 = this.f38998a;
            if (zMo180463f) {
                vNavigationBar2.setTitle("我的访客");
            } else {
                vNavigationBar2.setTitle("动态访客");
            }
        }
        m59138x();
        m59136w();
        this.f39000c.mo224405O(this);
        boolean zMo34452Y9 = CoreModule.m30933P().m143405a().mo34452Y9();
        MomentVisitorsFrag momentVisitorsFrag = this.f39019v;
        if (zMo34452Y9) {
            this.f39017t = new C9213f(momentVisitorsFrag.act(), this.f39018u, this.f39020w);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getAct(), 2);
            gridLayoutManager.m3327v(new b(gridLayoutManager));
            this.f39001d.setLayoutManager(gridLayoutManager);
            VPullUpRecyclerView vPullUpRecyclerView = this.f39001d;
            int i = qa00.f156318e;
            vPullUpRecyclerView.setPadding(i, i, i, 0);
        } else {
            this.f39017t = new C9209b(momentVisitorsFrag.act(), this.f39018u, this.f39020w);
        }
        this.f39001d.setAdapter(this.f39017t);
        m59130R();
        if (CoreModule.m30933P().m143405a().mo180463f()) {
            this.f39001d.setOnPullUpListener(new x20() { // from class: l.lu00
                @Override // p153l.x20
                public final void call() {
                    this.f133586a.m59104A();
                }
            });
            bnl0.m105509E0(this.f39003f, new View.OnClickListener() { // from class: l.mu00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f138713a.m59105B(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m59140z(View view) {
        i4g0.m138520r("e_moment_visitor_set_on", "p_moment_visitor_set");
        this.f39018u.m59099d1(true);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d$a */
    public class a extends h80<cfm0> {
        public a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(cfm0 cfm0Var, int i) {
            if (cfm0Var.m109547c()) {
                i4g0.m138492A("e_moment_visitor_detail", "p_moment_visitor", pf60.m172085a("moment_visitor_type", cfm0Var.m109545a()), pf60.m172085a("owner_id", cfm0Var.f81524b.userId));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(cfm0 cfm0Var, int i, long j) {
        }
    }
}
