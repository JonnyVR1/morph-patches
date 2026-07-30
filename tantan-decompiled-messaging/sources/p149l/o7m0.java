package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9046b;
import com.p046p1.mobile.putong.core.p053ui.visitor.frag.VisitorTabFragment;
import com.p046p1.mobile.putong.core.p053ui.visitor.frag.VisitorTabPresenter;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001k\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0015J!\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u00102\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b.\u0010#J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u001a¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b2\u0010#J\u0015\u00105\u001a\u00020 2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020 2\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010\u0012R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0016\u0010j\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010eR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006o"}, m87232d2 = {"Ll/o7m0;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "Ll/df50;", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "n", "(Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "", "from", "Ll/d30;", "dissmis", "E", "(Ljava/lang/String;Ll/d30;)V", "", "hidden", BaseSei.f13931Y, "(Z)V", "Ll/hnc0;", "refreshLayout", "w2", "(Ll/hnc0;)V", "", "Ll/y5m0;", "visitorItems", BaseSei.f13932Z, "(Ljava/util/List;)V", "isShow", b2s.C_ZONE, "emptyText", "A", "(Ljava/lang/String;)V", "H", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "p", "(Landroidx/recyclerview/widget/RecyclerView;)Z", BaseSei.f13930X, "a", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "Lv/VPullUpRecyclerView;", "b", "Lv/VPullUpRecyclerView;", "w", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "Landroidx/core/widget/NestedScrollView;", "c", "Landroidx/core/widget/NestedScrollView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroidx/core/widget/NestedScrollView;", "set_empty", "(Landroidx/core/widget/NestedScrollView;)V", "_empty", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_empty_text", "(Landroid/widget/TextView;)V", "_empty_text", "Lv/VLinear;", "Lv/VLinear;", ResourceDirection.f38808v, "()Lv/VLinear;", "set_get_privilege", "(Lv/VLinear;)V", "_get_privilege", "f", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "q", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "B", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "g", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "adapter", "h", "Z", "isCollapsed", RXScreenCaptureService.KEY_INDEX, "isShowScrollDlg", "j", "isShowIngScrollDlg", "l/o7m0$b", "k", "Ll/o7m0$b;", "visitorAdapterStatics", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public C9046b adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isCollapsed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isShowScrollDlg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isShowIngScrollDlg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C18865b visitorAdapterStatics;

    /* JADX INFO: renamed from: l.o7m0$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"l/o7m0$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18864a extends RecyclerView.AbstractC0582t {
        public C18864a() {
        }

        /* JADX INFO: renamed from: a */
        public static void m163029a(o7m0 o7m0Var) {
            o7m0Var.isShowIngScrollDlg = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (xma.m210043F3()) {
                return;
            }
            if (!o7m0.this.isShowScrollDlg && recyclerView.computeVerticalScrollOffset() > t100.m186890d(600.0f)) {
                o7m0.this.isShowScrollDlg = true;
                o7m0.this.isShowIngScrollDlg = true;
                final o7m0 o7m0Var = o7m0.this;
                o7m0Var.m163015E("p_navigation,visit_module", new d30() { // from class: l.n7m0
                    @Override // p149l.d30
                    public final void call() {
                        o7m0.C18864a.m163029a(o7m0Var);
                    }
                });
                return;
            }
            if (o7m0.this.m163019p(recyclerView) && o7m0.this.m163026x(recyclerView) && !o7m0.this.isShowIngScrollDlg) {
                o7m0.m163002F(o7m0.this, "p_navigation,visit_module", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.o7m0$b */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"l/o7m0$b", "Ll/l80;", "Ll/y5m0;", Item.TYPE, "", FirebaseAnalytics.Param.INDEX, "", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/y5m0;I)V", "data", "", "time", Constants.KEY_T, "(Ll/y5m0;IJ)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18865b extends l80<y5m0> {
        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(y5m0 item, int index) {
            item.getClass();
            if (item.m213003c()) {
                zvf0.m220368A("e_moment_visitor_detail", "p_my_visitor", j760.m140076a("moment_visitor_type", item.m213001a()), j760.m140076a("owner_id", item.f196455b.userId));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(y5m0 data, int index, long time) {
            data.getClass();
        }
    }

    public o7m0(@NotNull VisitorTabFragment visitorTabFragment) {
        visitorTabFragment.getClass();
        this.frag = visitorTabFragment;
        this.visitorAdapterStatics = new C18865b();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m163002F(o7m0 o7m0Var, String str, d30 d30Var, int i, Object obj) {
        if ((i & 2) != 0) {
            d30Var = null;
        }
        o7m0Var.m163015E(str, d30Var);
    }

    /* JADX INFO: renamed from: G */
    public static final void m163003G(o7m0 o7m0Var) {
        o7m0Var.m163020q().getData();
    }

    /* JADX INFO: renamed from: a */
    public static void m163004a(o7m0 o7m0Var, View view) {
        zvf0.m220396r("e_visitor_unlock", "p_my_visitor");
        m163002F(o7m0Var, "p_navigation,visit_module", null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m163006c(final o7m0 o7m0Var, PurchaseType purchaseType) {
        e51.m114743H(o7m0Var.act(), new Runnable() { // from class: l.m7m0
            @Override // java.lang.Runnable
            public final void run() {
                o7m0.m163003G(this.f131834a);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: d */
    public static void m163007d() {
    }

    /* JADX INFO: renamed from: A */
    public final void m163012A(@NotNull String emptyText) {
        emptyText.getClass();
        m163023u().setText(emptyText);
    }

    /* JADX INFO: renamed from: B */
    public final void m163013B(@NotNull VisitorTabPresenter visitorTabPresenter) {
        visitorTabPresenter.getClass();
        this.presenter = visitorTabPresenter;
    }

    /* JADX INFO: renamed from: C */
    public final void m163014C(boolean isShow) {
        xdl0.m208344M(m163022s(), isShow);
        xdl0.m208344M(m163025w(), !isShow);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m163015E(@NotNull String from, @Nullable d30 dissmis) {
        from.getClass();
        CoreModule.m29935P().m94656g().mo35021Og(act(), from, new e30() { // from class: l.l7m0
            @Override // p149l.e30
            public final void call(Object obj) {
                o7m0.m163006c(this.f126733a, (PurchaseType) obj);
            }
        }, dissmis, null, Privilege.oDiamondVisitor);
    }

    /* JADX INFO: renamed from: H */
    public final void m163016H(boolean isShow) {
        if (this._get_privilege != null) {
            if (xma.m210043F3()) {
                isShow = false;
            }
            xdl0.m208344M(m163024v(), isShow);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m163017e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM167762b = p7m0.m167762b(this, inflater, parent);
        viewM167762b.getClass();
        return viewM167762b;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM163017e = m163017e(inflater, parent);
        viewM163017e.setBackgroundResource(z0c0.f200985m);
        return viewM163017e;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable VisitorTabPresenter presenter) {
        if (presenter != null) {
            m163013B(presenter);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m163019p(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        return recyclerView.computeVerticalScrollExtent() < recyclerView.computeVerticalScrollRange();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VisitorTabPresenter m163020q() {
        VisitorTabPresenter visitorTabPresenter = this.presenter;
        if (visitorTabPresenter != null) {
            return visitorTabPresenter;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m163021r() {
        this.adapter = new cam0(act(), m163020q(), this.visitorAdapterStatics);
        m163025w().setAdapter(this.adapter);
        m163025w().setOnPullUpListener(new d30() { // from class: l.j7m0
            @Override // p149l.d30
            public final void call() {
                o7m0.m163007d();
            }
        });
        if (!xma.m210043F3() && bzc0.INSTANCE.m104571c()) {
            m163025w().setOnScrollListener(new C18864a());
        }
        xdl0.m208329E0(m163024v(), new View.OnClickListener() { // from class: l.k7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o7m0.m163004a(this.f121610a, view);
            }
        });
        m163016H(this.isCollapsed);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final NestedScrollView m163022s() {
        NestedScrollView nestedScrollView = this._empty;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m163023u() {
        TextView textView = this._empty_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VLinear m163024v() {
        VLinear vLinear = this._get_privilege;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VPullUpRecyclerView m163025w() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_visitors");
        return null;
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NotNull hnc0 refreshLayout) {
        refreshLayout.getClass();
        m163020q().m58022R0();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m163026x(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        return recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange();
    }

    /* JADX INFO: renamed from: z */
    public final void m163028z(@Nullable List<? extends y5m0> visitorItems) {
        List<? extends y5m0> list = visitorItems;
        if (list == null || list.isEmpty()) {
            m163014C(true);
            return;
        }
        m163014C(false);
        m163025w().setVisibility(0);
        C9046b c9046b = this.adapter;
        if (c9046b != null) {
            c9046b.mo57864E(visitorItems);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: y */
    public final void m163027y(boolean hidden) {
    }
}
