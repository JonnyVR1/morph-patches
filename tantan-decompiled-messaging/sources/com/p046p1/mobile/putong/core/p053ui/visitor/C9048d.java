package com.p046p1.mobile.putong.core.p053ui.visitor;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VPullUpRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.b3c0;
import p149l.d30;
import p149l.df50;
import p149l.e30;
import p149l.e51;
import p149l.g6m0;
import p149l.hnc0;
import p149l.j760;
import p149l.l80;
import p149l.lm00;
import p149l.o6j0;
import p149l.qib0;
import p149l.s7m;
import p149l.t100;
import p149l.w7c0;
import p149l.w7m;
import p149l.xdl0;
import p149l.xma;
import p149l.y5m0;
import p149l.z0c0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d */
/* JADX INFO: loaded from: classes9.dex */
public class C9048d implements s7m<C9047c>, df50, w7m {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f38150a;

    /* JADX INFO: renamed from: b */
    public VLinear f38151b;

    /* JADX INFO: renamed from: c */
    public VPullDownRefreshLayout f38152c;

    /* JADX INFO: renamed from: d */
    public VPullUpRecyclerView f38153d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f38154e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f38155f;

    /* JADX INFO: renamed from: g */
    public TextView f38156g;

    /* JADX INFO: renamed from: h */
    public TextView f38157h;

    /* JADX INFO: renamed from: i */
    public VLinear f38158i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f38159j;

    /* JADX INFO: renamed from: k */
    public VText f38160k;

    /* JADX INFO: renamed from: l */
    public VRelative f38161l;

    /* JADX INFO: renamed from: m */
    public VImage f38162m;

    /* JADX INFO: renamed from: n */
    public VText f38163n;

    /* JADX INFO: renamed from: o */
    public VText f38164o;

    /* JADX INFO: renamed from: p */
    public VButton f38165p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f38166q;

    /* JADX INFO: renamed from: r */
    public View f38167r;

    /* JADX INFO: renamed from: s */
    public VisitorsFilterBar f38168s;

    /* JADX INFO: renamed from: t */
    public AbstractC9045a f38169t;

    /* JADX INFO: renamed from: u */
    public C9047c f38170u;

    /* JADX INFO: renamed from: v */
    public MomentVisitorsFrag f38171v;

    /* JADX INFO: renamed from: w */
    public l80 f38172w = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d$b */
    public class b extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f38174a;

        public b(GridLayoutManager gridLayoutManager) {
            this.f38174a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            int itemViewType = C9048d.this.f38169t.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == 3) {
                return this.f38174a.m3317m();
            }
            return 1;
        }
    }

    public C9048d(MomentVisitorsFrag momentVisitorsFrag) {
        this.f38171v = momentVisitorsFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m57921A() {
        if (xma.m210043F3()) {
            return;
        }
        RecyclerView.AbstractC0577o layoutManager = this.f38153d.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() <= 0) {
            return;
        }
        m57942M("p_navigation_visit,button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m57922B(View view) {
        o6j0.m162859c("e_visitor_unlock", "p_my_visitor", new o6j0.C18854a[0]);
        m57942M("p_navigation_visit,button_pull");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m57933C(Boolean bool) {
        this.f38170u.m57916d1(bool.booleanValue());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f38171v.act();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m57934E(View view) {
        this.f38168s.m57800g();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m57935F() {
        this.f38170u.getData();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m57936G(PurchaseType purchaseType) {
        e51.m114744I(this.f38171v, new Runnable() { // from class: l.im00
            @Override // java.lang.Runnable
            public final void run() {
                this.f113888a.m57935F();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m57937H(View view) {
        if (CoreModule.m29935P().m94651a().mo33449Y9()) {
            zvf0.m220396r("e_my_visitor_set", "p_my_visitor");
        } else {
            zvf0.m220396r("e_moment_visitor_set", "p_moment_visitor");
        }
        m57940K();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m57938I(View view) {
        if (CoreModule.m29935P().m94651a().mo33449Y9()) {
            zvf0.m220396r("e_my_visitor_set", "p_my_visitor");
        } else {
            zvf0.m220396r("e_moment_visitor_set", "p_moment_visitor");
        }
        m57940K();
    }

    /* JADX INFO: renamed from: J */
    public void m57939J() {
        this.f38170u.m57915c1();
    }

    /* JADX INFO: renamed from: K */
    public void m57940K() {
        new g6m0(this.f38171v.act(), w7c0.f185042e, true).m124610t(new e30() { // from class: l.jm00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118606a.m57933C((Boolean) obj);
            }
        }).show();
    }

    /* JADX INFO: renamed from: L */
    public void m57941L(List<y5m0> list) {
        if (list == null || list.size() == 0) {
            this.f38158i.setVisibility(0);
            this.f38151b.setVisibility(8);
            this.f38154e.setVisibility(8);
            qib0.f154691G.m102354Y0(this.f38159j, b3c0.f72917N5);
            this.f38160k.setText("没有符合条件的访客");
            return;
        }
        this.f38158i.setVisibility(8);
        this.f38151b.setVisibility(0);
        if (!CoreModule.m29935P().m94651a().mo158371f() || xma.m210043F3()) {
            this.f38154e.setVisibility(8);
            if (CoreModule.m29935P().m94651a().mo33449Y9()) {
                int paddingBottom = this.f38153d.getPaddingBottom();
                int i = t100.f167264m;
                if (paddingBottom != i) {
                    VPullUpRecyclerView vPullUpRecyclerView = this.f38153d;
                    vPullUpRecyclerView.setPadding(vPullUpRecyclerView.getPaddingLeft(), this.f38153d.getPaddingTop(), this.f38153d.getPaddingRight(), i);
                }
            }
        } else {
            o6j0.m162864h("e_visitor_unlock", "p_my_visitor", new o6j0.C18854a[0]);
            this.f38154e.setVisibility(0);
            if (CoreModule.m29935P().m94651a().mo33449Y9() && this.f38153d.getPaddingBottom() != 0) {
                VPullUpRecyclerView vPullUpRecyclerView2 = this.f38153d;
                vPullUpRecyclerView2.setPadding(vPullUpRecyclerView2.getPaddingLeft(), this.f38153d.getPaddingTop(), this.f38153d.getPaddingRight(), 0);
            }
        }
        this.f38169t.mo57864E(list);
    }

    /* JADX INFO: renamed from: M */
    public void m57942M(String str) {
        CoreModule.m29935P().m94656g().mo35021Og(this.f38171v.act(), str, new e30() { // from class: l.gm00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103419a.m57936G((PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: N */
    public void m57943N() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f38152c;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(true);
    }

    /* JADX INFO: renamed from: O */
    public void m57944O(boolean z) {
        VPullDownRefreshLayout vPullDownRefreshLayout = this.f38152c;
        if (vPullDownRefreshLayout == null) {
            return;
        }
        vPullDownRefreshLayout.m223778w(z);
    }

    /* JADX INFO: renamed from: P */
    public void m57945P() {
        if (!this.f38170u.f38143b) {
            this.f38150a.m223584B();
            return;
        }
        if (CoreModule.m29935P().m94651a().mo158371f()) {
            ImageView imageView = new ImageView(this.f38171v.act());
            imageView.setImageResource(b3c0.f72931P5);
            this.f38150a.m223589z(imageView);
            if (!CoreModule.m29935P().m94651a().mo33449Y9()) {
                zvf0.m220402x("e_moment_visitor_set", "p_moment_visitor");
            }
            xdl0.m208329E0(imageView, new View.OnClickListener() { // from class: l.em00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92158a.m57937H(view);
                }
            });
            return;
        }
        TextView textView = new TextView(this.f38171v.act());
        textView.setText("设置");
        textView.setTextColor(this.f38171v.act().color(z0c0.f200975c));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(16.0f);
        textView.setPadding(0, 0, t100.m186890d(12.0f), 0);
        this.f38150a.m223589z(textView);
        if (!CoreModule.m29935P().m94651a().mo33449Y9()) {
            zvf0.m220402x("e_moment_visitor_set", "p_moment_visitor");
        }
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.fm00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98235a.m57938I(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m57946Q(boolean z, boolean z2) {
        if (CoreModule.m29935P().m94651a().mo158371f() && !xma.m210043F3()) {
            xdl0.m208344M(this.f38154e, z);
        }
        xdl0.m208344M(this.f38151b, z);
        xdl0.m208344M(this.f38161l, !z);
        m57952v();
        if (z) {
            this.f38170u.getData();
        } else {
            this.f38158i.setVisibility(8);
        }
        if (z2) {
            MomentVisitorsFrag momentVisitorsFrag = this.f38171v;
            if (z) {
                momentVisitorsFrag.getPermissionPageHelper().m109031g();
                this.f38171v.getDefaultPageHelper().m109042r();
            } else {
                momentVisitorsFrag.getDefaultPageHelper().m109031g();
                this.f38171v.getPermissionPageHelper().m109042r();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public void m57947R() {
        m57945P();
        xdl0.m208344M(this.f38151b, this.f38170u.f38143b);
        xdl0.m208344M(this.f38161l, !this.f38170u.f38143b);
        m57952v();
        if (!CoreModule.m29935P().m94651a().mo158371f() || xma.m210043F3()) {
            return;
        }
        xdl0.m208344M(this.f38154e, this.f38170u.f38143b);
    }

    @Override // p149l.w7m
    @NonNull
    /* JADX INFO: renamed from: a */
    public VisitorFilterSettings mo57948a() {
        return this.f38170u.m57896D0();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f38171v.act();
    }

    @Override // p149l.w7m
    /* JADX INFO: renamed from: b */
    public void mo57949b(boolean z) {
        if (z) {
            this.f38167r.setOnClickListener(new View.OnClickListener() { // from class: l.km00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123729a.m57934E(view);
                }
            });
            xdl0.m208345M0(this.f38167r, true);
            return;
        }
        if (this.f38170u.m57895C0()) {
            this.f38153d.scrollToPosition(0);
            this.f38170u.m57918f1();
            this.f38170u.m57915c1();
        }
        xdl0.m208345M0(this.f38167r, false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM57950s = m57950s(layoutInflater, viewGroup);
        this.f38150a.setLeftIconAsBack(getAct());
        viewM57950s.setBackgroundColor(this.f38171v.act().color(z0c0.f200985m));
        return viewM57950s;
    }

    /* JADX INFO: renamed from: s */
    public View m57950s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lm00.m150553b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C9047c c9047c) {
        this.f38170u = c9047c;
    }

    /* JADX INFO: renamed from: v */
    public void m57952v() {
    }

    /* JADX INFO: renamed from: w */
    public final void m57953w() {
        if (CoreModule.m29935P().m94651a().mo33449Y9()) {
            this.f38155f.setBackgroundResource(b3c0.f72924O5);
            this.f38156g.setTextColor(Color.parseColor("#E8CB8C"));
            this.f38157h.setTextColor(Color.parseColor("#CCE8CB8C"));
        }
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        m57939J();
    }

    /* JADX INFO: renamed from: x */
    public final void m57955x() {
        this.f38163n.setTypeface(null, 1);
        this.f38165p.setTypeface(null, 1);
        this.f38163n.setText("开启后可查看谁看过我");
        boolean zMo158371f = CoreModule.m29935P().m94651a().mo158371f();
        VText vText = this.f38164o;
        if (zMo158371f) {
            vText.setText("·记录仅展示同样已开启的用户\n·你查看他人也会留下记录");
        } else {
            vText.setText("·记录仅展示同样已开启的用户\n·你查看他人动态也将留下记录");
        }
        xdl0.m208329E0(this.f38165p, new View.OnClickListener() { // from class: l.hm00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108383a.m57957z(view);
            }
        });
        if (this.f38171v.getArguments().getBoolean("fromDeeplink", false)) {
            this.f38158i.setVisibility(8);
            this.f38159j.setVisibility(8);
            this.f38160k.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m57956y(boolean z) {
        VNavigationBar vNavigationBar = this.f38150a;
        if (z) {
            xdl0.m208344M(vNavigationBar, false);
        } else {
            xdl0.m208344M(vNavigationBar, true);
            this.f38150a.setLeftIconAsBack(getAct());
            boolean zMo158371f = CoreModule.m29935P().m94651a().mo158371f();
            VNavigationBar vNavigationBar2 = this.f38150a;
            if (zMo158371f) {
                vNavigationBar2.setTitle("我的访客");
            } else {
                vNavigationBar2.setTitle("动态访客");
            }
        }
        m57955x();
        m57953w();
        this.f38152c.mo223159O(this);
        boolean zMo33449Y9 = CoreModule.m29935P().m94651a().mo33449Y9();
        MomentVisitorsFrag momentVisitorsFrag = this.f38171v;
        if (zMo33449Y9) {
            this.f38169t = new C9050f(momentVisitorsFrag.act(), this.f38170u, this.f38172w);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getAct(), 2);
            gridLayoutManager.m3326v(new b(gridLayoutManager));
            this.f38153d.setLayoutManager(gridLayoutManager);
            VPullUpRecyclerView vPullUpRecyclerView = this.f38153d;
            int i = t100.f167256e;
            vPullUpRecyclerView.setPadding(i, i, i, 0);
        } else {
            this.f38169t = new C9046b(momentVisitorsFrag.act(), this.f38170u, this.f38172w);
        }
        this.f38153d.setAdapter(this.f38169t);
        m57947R();
        if (CoreModule.m29935P().m94651a().mo158371f()) {
            this.f38153d.setOnPullUpListener(new d30() { // from class: l.cm00
                @Override // p149l.d30
                public final void call() {
                    this.f81486a.m57921A();
                }
            });
            xdl0.m208329E0(this.f38155f, new View.OnClickListener() { // from class: l.dm00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f86890a.m57922B(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m57957z(View view) {
        zvf0.m220396r("e_moment_visitor_set_on", "p_moment_visitor_set");
        this.f38170u.m57916d1(true);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.d$a */
    public class a extends l80<y5m0> {
        public a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(y5m0 y5m0Var, int i) {
            if (y5m0Var.m213003c()) {
                zvf0.m220368A("e_moment_visitor_detail", "p_moment_visitor", j760.m140076a("moment_visitor_type", y5m0Var.m213001a()), j760.m140076a("owner_id", y5m0Var.f196455b.userId));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(y5m0 y5m0Var, int i, long j) {
        }
    }
}
