package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0482b;
import com.p000p1.mobile.putong.core.p004ui.visitor.frag.VisitorTabFragment;
import com.p000p1.mobile.putong.core.p004ui.visitor.frag.VisitorTabPresenter;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.df50;
import l.e30;
import l.e51;
import l.hnc0;
import l.j760;
import l.l80;
import l.p7m0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.z0c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VLinear;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001k\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0015J!\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u00102\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b.\u0010#J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u001a¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b2\u0010#J\u0015\u00105\u001a\u00020 2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020 2\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u0012R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0016\u0010j\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010eR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006o"}, d2 = {"Ll/o7m0;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "Ll/df50;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "n", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "from", "Ll/d30;", "dissmis", "E", "(Ljava/lang/String;Ll/d30;)V", "", "hidden", "y", "(Z)V", "Ll/hnc0;", "refreshLayout", "w2", "(Ll/hnc0;)V", "", "Ll/y5m0;", "visitorItems", "z", "(Ljava/util/List;)V", "isShow", "C", "emptyText", "A", "(Ljava/lang/String;)V", "H", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "p", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "x", "a", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "Lv/VPullUpRecyclerView;", "b", "Lv/VPullUpRecyclerView;", "w", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "Landroidx/core/widget/NestedScrollView;", "c", "Landroidx/core/widget/NestedScrollView;", "s", "()Landroidx/core/widget/NestedScrollView;", "set_empty", "(Landroidx/core/widget/NestedScrollView;)V", "_empty", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_empty_text", "(Landroid/widget/TextView;)V", "_empty_text", "Lv/VLinear;", "Lv/VLinear;", "v", "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "f", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "q", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "B", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "g", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "adapter", "h", "Z", "isCollapsed", "i", "isShowScrollDlg", "j", "isShowIngScrollDlg", "l/o7m0$b", "k", "Ll/o7m0$b;", "visitorAdapterStatics", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class o7m0 implements s7m<VisitorTabPresenter>, df50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final VisitorTabFragment frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VPullUpRecyclerView _visitors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public NestedScrollView _empty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _empty_text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _get_privilege;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VisitorTabPresenter presenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C0482b adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isCollapsed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isShowScrollDlg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isShowIngScrollDlg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C1076b visitorAdapterStatics;

    /* JADX INFO: renamed from: l.o7m0$a */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"l/o7m0$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1075a extends RecyclerView.t {
        public C1075a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m20415a(o7m0 o7m0Var) {
            o7m0Var.isShowIngScrollDlg = false;
        }

        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (xma.m27351F3()) {
                return;
            }
            if (!o7m0.this.isShowScrollDlg && recyclerView.computeVerticalScrollOffset() > t100.d(600.0f)) {
                o7m0.this.isShowScrollDlg = true;
                o7m0.this.isShowIngScrollDlg = true;
                final o7m0 o7m0Var = o7m0.this;
                o7m0Var.m20399E("p_navigation,visit_module", new d30() { // from class: l.n7m0
                    public final void call() {
                        o7m0.C1075a.m20415a(o7m0Var);
                    }
                });
                return;
            }
            if (o7m0.this.m20404p(recyclerView) && o7m0.this.m20412x(recyclerView) && !o7m0.this.isShowIngScrollDlg) {
                o7m0.m20385F(o7m0.this, "p_navigation,visit_module", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.o7m0$b */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"l/o7m0$b", "Ll/l80;", "Ll/y5m0;", "item", "", "index", "", "s", "(Ll/y5m0;I)V", "data", "", "time", "t", "(Ll/y5m0;IJ)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1076b extends l80<y5m0> {
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void m20416j(y5m0 item, int index) {
            item.getClass();
            if (item.m28088c()) {
                zvf0.A("e_moment_visitor_detail", "p_my_visitor", new j760[]{j760.a("moment_visitor_type", item.m28086a()), j760.a("owner_id", item.f28034b.userId)});
            }
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m20417l(y5m0 data, int index, long time) {
            data.getClass();
        }
    }

    public o7m0(@NotNull VisitorTabFragment visitorTabFragment) {
        visitorTabFragment.getClass();
        this.frag = visitorTabFragment;
        this.visitorAdapterStatics = new C1076b();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m20385F(o7m0 o7m0Var, String str, d30 d30Var, int i, Object obj) {
        if ((i & 2) != 0) {
            d30Var = null;
        }
        o7m0Var.m20399E(str, d30Var);
    }

    /* JADX INFO: renamed from: G */
    public static final void m20386G(o7m0 o7m0Var) {
        o7m0Var.m20405q().getData();
    }

    /* JADX INFO: renamed from: a */
    public static void m20387a(o7m0 o7m0Var, View view) {
        zvf0.r("e_visitor_unlock", "p_my_visitor");
        m20385F(o7m0Var, "p_navigation,visit_module", null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m20389c(final o7m0 o7m0Var, PurchaseType purchaseType) {
        e51.H(o7m0Var.act(), new Runnable() { // from class: l.m7m0
            @Override // java.lang.Runnable
            public final void run() {
                o7m0.m20386G(this.f16840a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: d */
    public static void m20390d() {
    }

    /* JADX INFO: renamed from: A */
    public final void m20395A(@NotNull String emptyText) {
        emptyText.getClass();
        m20408u().setText(emptyText);
    }

    /* JADX INFO: renamed from: B */
    public final void m20396B(@NotNull VisitorTabPresenter visitorTabPresenter) {
        visitorTabPresenter.getClass();
        this.presenter = visitorTabPresenter;
    }

    /* JADX INFO: renamed from: C */
    public final void m20397C(boolean isShow) {
        xdl0.M(m20407s(), isShow);
        xdl0.M(m20410w(), !isShow);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20398C0() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m20399E(@NotNull String from, @Nullable d30 dissmis) {
        from.getClass();
        CoreModule.m1854P().m11711g().m6958Og(act(), from, new e30() { // from class: l.l7m0
            public final void call(Object obj) {
                o7m0.m20389c(this.f16260a, (PurchaseType) obj);
            }
        }, dissmis, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: H */
    public final void m20400H(boolean isShow) {
        if (this._get_privilege != null) {
            if (xma.m27351F3()) {
                isShow = false;
            }
            xdl0.M(m20409v(), isShow);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m20401e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = p7m0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM20401e = m20401e(inflater, parent);
        viewM20401e.setBackgroundResource(z0c0.m);
        return viewM20401e;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m20402i1(@Nullable VisitorTabPresenter presenter) {
        if (presenter != null) {
            m20396B(presenter);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m20404p(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        return recyclerView.computeVerticalScrollExtent() < recyclerView.computeVerticalScrollRange();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VisitorTabPresenter m20405q() {
        VisitorTabPresenter visitorTabPresenter = this.presenter;
        if (visitorTabPresenter != null) {
            return visitorTabPresenter;
        }
        Intrinsics.r("presenter");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m20406r() {
        this.adapter = new cam0(act(), m20405q(), this.visitorAdapterStatics);
        m20410w().setAdapter(this.adapter);
        m20410w().setOnPullUpListener(new d30() { // from class: l.j7m0
            public final void call() {
                o7m0.m20390d();
            }
        });
        if (!xma.m27351F3() && bzc0.INSTANCE.m13045c()) {
            m20410w().setOnScrollListener(new C1075a());
        }
        xdl0.E0(m20409v(), new View.OnClickListener() { // from class: l.k7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o7m0.m20387a(this.f15646a, view);
            }
        });
        m20400H(this.isCollapsed);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final NestedScrollView m20407s() {
        NestedScrollView nestedScrollView = this._empty;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m20408u() {
        TextView textView = this._empty_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VLinear m20409v() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VPullUpRecyclerView m20410w() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_visitors");
        return null;
    }

    /* JADX INFO: renamed from: w2 */
    public void m20411w2(@NotNull hnc0 refreshLayout) {
        refreshLayout.getClass();
        m20405q().m11545R0();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m20412x(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        return recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: z */
    public final void m20414z(@Nullable List<? extends y5m0> visitorItems) {
        List<? extends y5m0> list = visitorItems;
        if (list == null || list.isEmpty()) {
            m20397C(true);
            return;
        }
        m20397C(false);
        m20410w().setVisibility(0);
        C0482b c0482b = this.adapter;
        if (c0482b != null) {
            c0482b.mo11373E(visitorItems);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: y */
    public final void m20413y(boolean hidden) {
    }
}
