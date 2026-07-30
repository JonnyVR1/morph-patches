package com.p000p1.mobile.putong.core.p004ui.visitor;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import java.util.List;
import l.b3c0;
import l.d30;
import l.df50;
import l.e30;
import l.e51;
import l.hnc0;
import l.j760;
import l.l80;
import l.lm00;
import l.o6j0;
import l.s7m;
import l.t100;
import l.w7c0;
import l.xdl0;
import l.z0c0;
import l.zvf0;
import p006l.g6m0;
import p006l.qib0;
import p006l.w7m;
import p006l.xma;
import p006l.y5m0;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VPullUpRecyclerView;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0484d implements s7m<C0483c>, df50, w7m {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f7931a;

    /* JADX INFO: renamed from: b */
    public VLinear f7932b;

    /* JADX INFO: renamed from: c */
    public VPullDownRefreshLayout f7933c;

    /* JADX INFO: renamed from: d */
    public VPullUpRecyclerView f7934d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f7935e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f7936f;

    /* JADX INFO: renamed from: g */
    public TextView f7937g;

    /* JADX INFO: renamed from: h */
    public TextView f7938h;

    /* JADX INFO: renamed from: i */
    public VLinear f7939i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f7940j;

    /* JADX INFO: renamed from: k */
    public VText f7941k;

    /* JADX INFO: renamed from: l */
    public VRelative f7942l;

    /* JADX INFO: renamed from: m */
    public VImage f7943m;

    /* JADX INFO: renamed from: n */
    public VText f7944n;

    /* JADX INFO: renamed from: o */
    public VText f7945o;

    /* JADX INFO: renamed from: p */
    public VButton f7946p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f7947q;

    /* JADX INFO: renamed from: r */
    public View f7948r;

    /* JADX INFO: renamed from: s */
    public VisitorsFilterBar f7949s;

    /* JADX INFO: renamed from: t */
    public AbstractC0481a f7950t;

    /* JADX INFO: renamed from: u */
    public C0483c f7951u;

    /* JADX INFO: renamed from: v */
    public MomentVisitorsFrag f7952v;

    /* JADX INFO: renamed from: w */
    public l80 f7953w = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d$b */
    public class b extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f7955a;

        public b(GridLayoutManager gridLayoutManager) {
            this.f7955a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m11478f(int i) {
            int itemViewType = C0484d.this.f7950t.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == 3) {
                return this.f7955a.m();
            }
            return 1;
        }
    }

    public C0484d(MomentVisitorsFrag momentVisitorsFrag) {
        this.f7952v = momentVisitorsFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m11435A() {
        if (xma.m27351F3()) {
            return;
        }
        LinearLayoutManager layoutManager = this.f7934d.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || layoutManager.findFirstCompletelyVisibleItemPosition() <= 0) {
            return;
        }
        m11457M("p_navigation_visit,button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m11436B(View view) {
        o6j0.c("e_visitor_unlock", "p_my_visitor", new o6j0.a[0]);
        m11457M("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m11447C(Boolean bool) {
        this.f7951u.m11430d1(bool.booleanValue());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11448C0() {
        return this.f7952v.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m11449E(View view) {
        this.f7949s.m11301g();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m11450F() {
        this.f7951u.getData();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m11451G(PurchaseType purchaseType) {
        e51.I(this.f7952v, new Runnable() { // from class: l.im00
            @Override // java.lang.Runnable
            public final void run() {
                this.f14555a.m11450F();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m11452H(View view) {
        if (CoreModule.m1854P().m11706a().m5386Y9()) {
            zvf0.r("e_my_visitor_set", "p_my_visitor");
        } else {
            zvf0.r("e_moment_visitor_set", "p_moment_visitor");
        }
        m11455K();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m11453I(View view) {
        if (CoreModule.m1854P().m11706a().m5386Y9()) {
            zvf0.r("e_my_visitor_set", "p_my_visitor");
        } else {
            zvf0.r("e_moment_visitor_set", "p_moment_visitor");
        }
        m11455K();
    }

    /* JADX INFO: renamed from: J */
    public void m11454J() {
        this.f7951u.m11429c1();
    }

    /* JADX INFO: renamed from: K */
    public void m11455K() {
        new g6m0(this.f7952v.act(), w7c0.e, true).m15620t(new e30() { // from class: l.jm00
            public final void call(Object obj) {
                this.f15263a.m11447C((Boolean) obj);
            }
        }).show();
    }

    /* JADX INFO: renamed from: L */
    public void m11456L(List<y5m0> list) {
        if (list == null || list.size() == 0) {
            this.f7939i.setVisibility(0);
            this.f7932b.setVisibility(8);
            this.f7935e.setVisibility(8);
            qib0.f19782G.m12767Y0(this.f7940j, b3c0.N5);
            this.f7941k.setText("没有符合条件的访客");
            return;
        }
        this.f7939i.setVisibility(8);
        this.f7932b.setVisibility(0);
        if (!CoreModule.m1854P().m11706a().m19879f() || xma.m27351F3()) {
            this.f7935e.setVisibility(8);
            if (CoreModule.m1854P().m11706a().m5386Y9()) {
                int paddingBottom = this.f7934d.getPaddingBottom();
                int i = t100.m;
                if (paddingBottom != i) {
                    VPullUpRecyclerView vPullUpRecyclerView = this.f7934d;
                    vPullUpRecyclerView.setPadding(vPullUpRecyclerView.getPaddingLeft(), this.f7934d.getPaddingTop(), this.f7934d.getPaddingRight(), i);
                }
            }
        } else {
            o6j0.h("e_visitor_unlock", "p_my_visitor", new o6j0.a[0]);
            this.f7935e.setVisibility(0);
            if (CoreModule.m1854P().m11706a().m5386Y9() && this.f7934d.getPaddingBottom() != 0) {
                VPullUpRecyclerView vPullUpRecyclerView2 = this.f7934d;
                vPullUpRecyclerView2.setPadding(vPullUpRecyclerView2.getPaddingLeft(), this.f7934d.getPaddingTop(), this.f7934d.getPaddingRight(), 0);
            }
        }
        this.f7950t.mo11373E(list);
    }

    /* JADX INFO: renamed from: M */
    public void m11457M(String str) {
        CoreModule.m1854P().m11711g().m6958Og(this.f7952v.act(), str, new e30() { // from class: l.gm00
            public final void call(Object obj) {
                this.f13384a.m11451G((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: N */
    public void m11458N() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f7933c;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(true);
    }

    /* JADX INFO: renamed from: O */
    public void m11459O(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f7933c;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.w(z);
    }

    /* JADX INFO: renamed from: P */
    public void m11460P() {
        if (!this.f7951u.f7924b) {
            this.f7931a.B();
            return;
        }
        if (CoreModule.m1854P().m11706a().m19879f()) {
            ImageView imageView = new ImageView(this.f7952v.act());
            imageView.setImageResource(b3c0.P5);
            this.f7931a.z(new View[]{imageView});
            if (!CoreModule.m1854P().m11706a().m5386Y9()) {
                zvf0.x("e_moment_visitor_set", "p_moment_visitor");
            }
            xdl0.E0(imageView, new View.OnClickListener() { // from class: l.em00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11250a.m11452H(view);
                }
            });
            return;
        }
        TextView textView = new TextView(this.f7952v.act());
        textView.setText("设置");
        textView.setTextColor(this.f7952v.act().color(z0c0.c));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(16.0f);
        textView.setPadding(0, 0, t100.d(12.0f), 0);
        this.f7931a.z(new View[]{textView});
        if (!CoreModule.m1854P().m11706a().m5386Y9()) {
            zvf0.x("e_moment_visitor_set", "p_moment_visitor");
        }
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.fm00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12773a.m11453I(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m11461Q(boolean z, boolean z2) {
        if (CoreModule.m1854P().m11706a().m19879f() && !xma.m27351F3()) {
            xdl0.M(this.f7935e, z);
        }
        xdl0.M(this.f7932b, z);
        xdl0.M(this.f7942l, !z);
        m11468v();
        if (z) {
            this.f7951u.getData();
        } else {
            this.f7939i.setVisibility(8);
        }
        if (z2) {
            MomentVisitorsFrag momentVisitorsFrag = this.f7952v;
            if (z) {
                momentVisitorsFrag.getPermissionPageHelper().g();
                this.f7952v.getDefaultPageHelper().r();
            } else {
                momentVisitorsFrag.getDefaultPageHelper().g();
                this.f7952v.getPermissionPageHelper().r();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void m11462R() {
        m11460P();
        xdl0.M(this.f7932b, this.f7951u.f7924b);
        xdl0.M(this.f7942l, !this.f7951u.f7924b);
        m11468v();
        if (!CoreModule.m1854P().m11706a().m19879f() || xma.m27351F3()) {
            return;
        }
        xdl0.M(this.f7935e, this.f7951u.f7924b);
    }

    @Override // p006l.w7m
    @NonNull
    /* JADX INFO: renamed from: a */
    public VisitorFilterSettings mo11463a() {
        return this.f7951u.m11409D0();
    }

    public Act act() {
        return this.f7952v.act();
    }

    @Override // p006l.w7m
    /* JADX INFO: renamed from: b */
    public void mo11464b(boolean z) {
        if (z) {
            this.f7948r.setOnClickListener(new View.OnClickListener() { // from class: l.km00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15900a.m11449E(view);
                }
            });
            xdl0.M0(this.f7948r, true);
            return;
        }
        if (this.f7951u.m11408C0()) {
            this.f7934d.scrollToPosition(0);
            this.f7951u.m11432f1();
            this.f7951u.m11429c1();
        }
        xdl0.M0(this.f7948r, false);
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM11466s = m11466s(layoutInflater, viewGroup);
        this.f7931a.setLeftIconAsBack(act());
        viewM11466s.setBackgroundColor(this.f7952v.act().color(z0c0.m));
        return viewM11466s;
    }

    /* JADX INFO: renamed from: s */
    public View m11466s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lm00.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m11465i1(C0483c c0483c) {
        this.f7951u = c0483c;
    }

    /* JADX INFO: renamed from: v */
    public void m11468v() {
    }

    /* JADX INFO: renamed from: w */
    public final void m11469w() {
        if (CoreModule.m1854P().m11706a().m5386Y9()) {
            this.f7936f.setBackgroundResource(b3c0.O5);
            this.f7937g.setTextColor(Color.parseColor("#E8CB8C"));
            this.f7938h.setTextColor(Color.parseColor("#CCE8CB8C"));
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m11470w2(@NonNull hnc0 hnc0Var) {
        m11454J();
    }

    /* JADX INFO: renamed from: x */
    public final void m11471x() {
        this.f7944n.setTypeface((Typeface) null, 1);
        this.f7946p.setTypeface(null, 1);
        this.f7944n.setText("开启后可查看谁看过我");
        boolean zM19879f = CoreModule.m1854P().m11706a().m19879f();
        VText vText = this.f7945o;
        if (zM19879f) {
            vText.setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        } else {
            vText.setText("·记录仅展示同样已开启的用户\n·你查看他人动态也将留下记录");
        }
        xdl0.E0(this.f7946p, new View.OnClickListener() { // from class: l.hm00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13938a.m11473z(view);
            }
        });
        if (this.f7952v.getArguments().getBoolean("fromDeeplink", false)) {
            this.f7939i.setVisibility(8);
            this.f7940j.setVisibility(8);
            this.f7941k.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m11472y(boolean z) {
        VNavigationBar vNavigationBar = this.f7931a;
        if (z) {
            xdl0.M(vNavigationBar, false);
        } else {
            xdl0.M(vNavigationBar, true);
            this.f7931a.setLeftIconAsBack(act());
            boolean zM19879f = CoreModule.m1854P().m11706a().m19879f();
            VNavigationBar vNavigationBar2 = this.f7931a;
            if (zM19879f) {
                vNavigationBar2.setTitle("我的访客");
            } else {
                vNavigationBar2.setTitle("动态访客");
            }
        }
        m11471x();
        m11469w();
        this.f7933c.O(this);
        boolean zM5386Y9 = CoreModule.m1854P().m11706a().m5386Y9();
        MomentVisitorsFrag momentVisitorsFrag = this.f7952v;
        if (zM5386Y9) {
            this.f7950t = new C0486f(momentVisitorsFrag.act(), this.f7951u, this.f7953w);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
            gridLayoutManager.v(new b(gridLayoutManager));
            this.f7934d.setLayoutManager(gridLayoutManager);
            VPullUpRecyclerView vPullUpRecyclerView = this.f7934d;
            int i = t100.e;
            vPullUpRecyclerView.setPadding(i, i, i, 0);
        } else {
            this.f7950t = new C0482b(momentVisitorsFrag.act(), this.f7951u, this.f7953w);
        }
        this.f7934d.setAdapter(this.f7950t);
        m11462R();
        if (CoreModule.m1854P().m11706a().m19879f()) {
            this.f7934d.setOnPullUpListener(new d30() { // from class: l.cm00
                public final void call() {
                    this.f9725a.m11435A();
                }
            });
            xdl0.E0(this.f7936f, new View.OnClickListener() { // from class: l.dm00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10470a.m11436B(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m11473z(View view) {
        zvf0.r("e_moment_visitor_set_on", "p_moment_visitor_set");
        this.f7951u.m11430d1(true);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d$a */
    public class a extends l80<y5m0> {
        public a() {
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void m11474j(y5m0 y5m0Var, int i) {
            if (y5m0Var.m28088c()) {
                zvf0.A("e_moment_visitor_detail", "p_moment_visitor", new j760[]{j760.a("moment_visitor_type", y5m0Var.m28086a()), j760.a("owner_id", y5m0Var.f28034b.userId)});
            }
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m11475l(y5m0 y5m0Var, int i, long j) {
        }
    }
}
