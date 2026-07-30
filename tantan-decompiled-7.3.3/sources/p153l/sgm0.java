package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9209b;
import com.p051p1.mobile.putong.core.p058ui.visitor.frag.VisitorTabFragment;
import com.p051p1.mobile.putong.core.p058ui.visitor.frag.VisitorTabPresenter;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001k\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0015J!\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u00102\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b.\u0010#J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u001a¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b2\u0010#J\u0015\u00105\u001a\u00020 2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020 2\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u0012R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0016\u0010j\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010eR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006o"}, m88121d2 = {"Ll/sgm0;", "Ll/iam;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "Ll/jn50;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "n", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "from", "Ll/x20;", "dissmis", "E", "(Ljava/lang/String;Ll/x20;)V", "", "hidden", BaseSei.f14625Y, "(Z)V", "Ll/mvc0;", "refreshLayout", "w2", "(Ll/mvc0;)V", "", "Ll/cfm0;", "visitorItems", BaseSei.f14626Z, "(Ljava/util/List;)V", "isShow", c4s.C_ZONE, "emptyText", "A", "(Ljava/lang/String;)V", "H", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "p", "(Landroidx/recyclerview/widget/RecyclerView;)Z", BaseSei.f14624X, "a", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "Lv/VPullUpRecyclerView;", "b", "Lv/VPullUpRecyclerView;", "w", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "Landroidx/core/widget/NestedScrollView;", "c", "Landroidx/core/widget/NestedScrollView;", BLiveStormDanmakuGiftResourceType.f45294s, "()Landroidx/core/widget/NestedScrollView;", "set_empty", "(Landroidx/core/widget/NestedScrollView;)V", "_empty", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_empty_text", "(Landroid/widget/TextView;)V", "_empty_text", "Lv/VLinear;", "Lv/VLinear;", ResourceDirection.f39656v, "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "f", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "q", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "B", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "g", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "adapter", "h", "Z", "isCollapsed", RXScreenCaptureService.KEY_INDEX, "isShowScrollDlg", "j", "isShowIngScrollDlg", "l/sgm0$b", "k", "Ll/sgm0$b;", "visitorAdapterStatics", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class sgm0 implements iam<VisitorTabPresenter>, jn50 {

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
    public C9209b adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isCollapsed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isShowScrollDlg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isShowIngScrollDlg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C20043b visitorAdapterStatics;

    /* JADX INFO: renamed from: l.sgm0$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/sgm0$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20042a extends RecyclerView.AbstractC0584t {
        public C20042a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m185822a(sgm0 sgm0Var) {
            sgm0Var.isShowIngScrollDlg = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (joa.m146357G3()) {
                return;
            }
            if (!sgm0.this.isShowScrollDlg && recyclerView.computeVerticalScrollOffset() > qa00.m175859d(600.0f)) {
                sgm0.this.isShowScrollDlg = true;
                sgm0.this.isShowIngScrollDlg = true;
                final sgm0 sgm0Var = sgm0.this;
                sgm0Var.m185808E("p_navigation,visit_module", new x20() { // from class: l.rgm0
                    @Override // p153l.x20
                    public final void call() {
                        sgm0.C20042a.m185822a(sgm0Var);
                    }
                });
                return;
            }
            if (sgm0.this.m185812p(recyclerView) && sgm0.this.m185819x(recyclerView) && !sgm0.this.isShowIngScrollDlg) {
                sgm0.m185795F(sgm0.this, "p_navigation,visit_module", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.sgm0$b */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"l/sgm0$b", "Ll/h80;", "Ll/cfm0;", Item.TYPE, "", FirebaseAnalytics.Param.INDEX, "", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/cfm0;I)V", "data", "", "time", Constants.KEY_T, "(Ll/cfm0;IJ)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20043b extends h80<cfm0> {
        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(cfm0 item, int index) {
            item.getClass();
            if (item.m109547c()) {
                i4g0.m138492A("e_moment_visitor_detail", "p_my_visitor", pf60.m172085a("moment_visitor_type", item.m109545a()), pf60.m172085a("owner_id", item.f81524b.userId));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(cfm0 data, int index, long time) {
            data.getClass();
        }
    }

    public sgm0(@NotNull VisitorTabFragment visitorTabFragment) {
        visitorTabFragment.getClass();
        this.frag = visitorTabFragment;
        this.visitorAdapterStatics = new C20043b();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m185795F(sgm0 sgm0Var, String str, x20 x20Var, int i, Object obj) {
        if ((i & 2) != 0) {
            x20Var = null;
        }
        sgm0Var.m185808E(str, x20Var);
    }

    /* JADX INFO: renamed from: G */
    public static final void m185796G(sgm0 sgm0Var) {
        sgm0Var.m185813q().getData();
    }

    /* JADX INFO: renamed from: a */
    public static void m185797a(sgm0 sgm0Var, View view) {
        i4g0.m138520r("e_visitor_unlock", "p_my_visitor");
        m185795F(sgm0Var, "p_navigation,visit_module", null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m185799c(final sgm0 sgm0Var, PurchaseType purchaseType) {
        l51.m152888H(sgm0Var.act(), new Runnable() { // from class: l.qgm0
            @Override // java.lang.Runnable
            public final void run() {
                sgm0.m185796G(this.f157442a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: d */
    public static void m185800d() {
    }

    /* JADX INFO: renamed from: A */
    public final void m185805A(@NotNull String emptyText) {
        emptyText.getClass();
        m185816u().setText(emptyText);
    }

    /* JADX INFO: renamed from: B */
    public final void m185806B(@NotNull VisitorTabPresenter visitorTabPresenter) {
        visitorTabPresenter.getClass();
        this.presenter = visitorTabPresenter;
    }

    /* JADX INFO: renamed from: C */
    public final void m185807C(boolean isShow) {
        bnl0.m105524M(m185815s(), isShow);
        bnl0.m105524M(m185818w(), !isShow);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m185808E(@NotNull String from, @Nullable x20 dissmis) {
        from.getClass();
        CoreModule.m30933P().m143410g().mo36024Og(act(), from, new y20() { // from class: l.pgm0
            @Override // p153l.y20
            public final void call(Object obj) {
                sgm0.m185799c(this.f152316a, (PurchaseType) obj);
            }
        }, dissmis, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: H */
    public final void m185809H(boolean isShow) {
        if (this._get_privilege != null) {
            if (joa.m146357G3()) {
                isShow = false;
            }
            bnl0.m105524M(m185817v(), isShow);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m185810e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM191043b = tgm0.m191043b(this, inflater, parent);
        viewM191043b.getClass();
        return viewM191043b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM185810e = m185810e(inflater, parent);
        viewM185810e.setBackgroundResource(f9c0.f97868m);
        return viewM185810e;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable VisitorTabPresenter presenter) {
        if (presenter != null) {
            m185806B(presenter);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m185812p(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        return recyclerView.computeVerticalScrollExtent() < recyclerView.computeVerticalScrollRange();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VisitorTabPresenter m185813q() {
        VisitorTabPresenter visitorTabPresenter = this.presenter;
        if (visitorTabPresenter != null) {
            return visitorTabPresenter;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m185814r() {
        this.adapter = new gjm0(act(), m185813q(), this.visitorAdapterStatics);
        m185818w().setAdapter(this.adapter);
        m185818w().setOnPullUpListener(new x20() { // from class: l.ngm0
            @Override // p153l.x20
            public final void call() {
                sgm0.m185800d();
            }
        });
        if (!joa.m146357G3() && e7d0.INSTANCE.m119702c()) {
            m185818w().setOnScrollListener(new C20042a());
        }
        bnl0.m105509E0(m185817v(), new View.OnClickListener() { // from class: l.ogm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sgm0.m185797a(this.f147295a, view);
            }
        });
        m185809H(this.isCollapsed);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final NestedScrollView m185815s() {
        NestedScrollView nestedScrollView = this._empty;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m185816u() {
        TextView textView = this._empty_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VLinear m185817v() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VPullUpRecyclerView m185818w() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_visitors");
        return null;
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NotNull mvc0 refreshLayout) {
        refreshLayout.getClass();
        m185813q().m59205R0();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m185819x(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        return recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: z */
    public final void m185821z(@Nullable List<? extends cfm0> visitorItems) {
        List<? extends cfm0> list = visitorItems;
        if (list == null || list.isEmpty()) {
            m185807C(true);
            return;
        }
        m185807C(false);
        m185818w().setVisibility(0);
        C9209b c9209b = this.adapter;
        if (c9209b != null) {
            c9209b.mo59047E(visitorItems);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: y */
    public final void m185820y(boolean hidden) {
    }
}
