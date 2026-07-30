package com.p000p1.mobile.putong.core.p002ui.intl.visitor;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p002ui.intl.visitor.IntlVisitorsViewModel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.IntlVisitor;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundTextView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.c4g0;
import l.e30;
import l.e51;
import l.lop;
import l.mkd0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w0c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.eop;
import p009l.rmp;
import p009l.ump;
import p009l.ymp;
import rx.c;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VPullUpRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020$H\u0016¢\u0006\u0004\b\u0005\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\nJ\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J%\u0010.\u001a\u00020\b2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0006\u0010-\u001a\u00020\u0011¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0014J\u001f\u00104\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u00105J'\u00107\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u0006\u00106\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010u\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010y\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010E\u001a\u0004\bw\u0010G\"\u0004\bx\u0010IR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u001e\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u001b\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u0090\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "Ll/s7m;", "Ll/eop;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;)V", "", "F", "()V", "", "dy", "q", "(I)V", "C", "J", "", "show", "I", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "i", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "n", "m", "G", "presenter", "p", "(Ll/eop;)V", "inflateView", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/core/data/IntlVisitor;", "visitorItems", "hasPrivilege", "H", "(Ljava/util/List;Z)V", "E", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "a", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "y", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "x", "()Landroid/widget/FrameLayout;", "set_intl_visitors_discount_banner_container", "(Landroid/widget/FrameLayout;)V", "_intl_visitors_discount_banner_container", "Lv/VLinear;", "d", "Lv/VLinear;", "B", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VPullDownRefreshLayout;", "e", "Lv/VPullDownRefreshLayout;", "z", "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lv/VPullUpRecyclerView;", "f", "Lv/VPullUpRecyclerView;", "A", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "g", "w", "set_empty", "_empty", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "get_empty_empty_img", "()Landroid/widget/ImageView;", "set_empty_empty_img", "(Landroid/widget/ImageView;)V", "_empty_empty_img", "Lv/VText;", "Lv/VText;", "get_empty_empty_tv", "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "j", "u", "set_bottom_bg", "_bottom_bg", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "k", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "v", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "set_bottom_bg_get_privilege", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;)V", "_bottom_bg_get_privilege", "Ll/ump;", "l", "Ll/ump;", "adapter", "Ll/eop;", "Z", "isDragging", "o", "isShowed", "scrollY", "Ll/ymp;", "Ll/ymp;", "intlVisitorsAffiliateDiscountBannerHost", "Ll/c4g0;", "Ll/c4g0;", "loadSub", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlVisitorsViewModel extends RecyclerView.t implements s7m<eop> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlVisitorsAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _intl_visitors_discount_banner_container;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _visitors_ll;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VPullDownRefreshLayout _swipe_refresh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VPullUpRecyclerView _visitors;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ImageView _empty_empty_img;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _empty_empty_tv;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public FrameLayout _bottom_bg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public RoundTextView _bottom_bg_get_privilege;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public ump adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public eop presenter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isDragging;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean isShowed;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int scrollY;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public ymp intlVisitorsAffiliateDiscountBannerHost;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public c4g0 loadSub;

    public IntlVisitorsViewModel(@NotNull IntlVisitorsAct intlVisitorsAct) {
        intlVisitorsAct.getClass();
        this.act = intlVisitorsAct;
    }

    /* JADX INFO: renamed from: C */
    private final void m8281C() {
        if (NullChecker.a(this.loadSub)) {
            return;
        }
        c cVarFh = CoreModule.l.a().fh(this.act);
        this.loadSub = cVarFh != null ? cVarFh.subscribe(mkd0.H(new e30() { // from class: l.jop
            public final void call(Object obj) {
                IntlVisitorsViewModel.m8289f(this.f15251a, (View) obj);
            }
        }, new e30() { // from class: l.kop
            public final void call(Object obj) {
                IntlVisitorsViewModel.m8284a((Throwable) obj);
            }
        })) : null;
    }

    /* JADX INFO: renamed from: F */
    private final void m8282F() {
        ymp ympVar = this.intlVisitorsAffiliateDiscountBannerHost;
        if (ympVar != null) {
            ympVar.m25468j();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m8283J() {
        m8310w().setVisibility(0);
        m8295B().setVisibility(8);
        m8282F();
    }

    /* JADX INFO: renamed from: a */
    public static void m8284a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static Unit m8285b(final IntlVisitorsViewModel intlVisitorsViewModel) {
        e51.F(intlVisitorsViewModel.act, new Runnable() { // from class: l.iop
            @Override // java.lang.Runnable
            public final void run() {
                IntlVisitorsViewModel.m8293s(this.f14732a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m8286c(IntlVisitorsViewModel intlVisitorsViewModel, View view) {
        rmp rmpVar = rmp.INSTANCE;
        rmpVar.m21753i("e_intl_visitors_list_unlock_btn");
        rmp.m21747p(rmpVar, intlVisitorsViewModel.act, "p_intl_visitors_list,e_intl_visitors_list_unlock_btn,check", null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m8288e(IntlVisitorsViewModel intlVisitorsViewModel) {
        intlVisitorsViewModel.m8294A().stopScroll();
    }

    /* JADX INFO: renamed from: f */
    public static void m8289f(IntlVisitorsViewModel intlVisitorsViewModel, View view) {
        if (NullChecker.a(view)) {
            IntlVisitor intlVisitorNew_ = IntlVisitor.new_();
            intlVisitorNew_.id = "fake_visitor_list_admob_id";
            ump umpVar = intlVisitorsViewModel.adapter;
            if (umpVar != null) {
                umpVar.m23077F(intlVisitorNew_, view);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m8293s(IntlVisitorsViewModel intlVisitorsViewModel) {
        intlVisitorsViewModel.m8294A().smoothScrollToPosition(0);
        intlVisitorsViewModel.isShowed = false;
        intlVisitorsViewModel.isDragging = false;
        intlVisitorsViewModel.scrollY = 0;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VPullUpRecyclerView m8294A() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_visitors");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VLinear m8295B() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_visitors_ll");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m8296C0() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m8297E(boolean hasPrivilege) {
        m8300I(!hasPrivilege);
        ump umpVar = this.adapter;
        if (umpVar != null) {
            umpVar.m23080K(hasPrivilege);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m8298G() {
        VPullUpRecyclerView vPullUpRecyclerViewM8294A = m8294A();
        if (vPullUpRecyclerViewM8294A != null) {
            vPullUpRecyclerViewM8294A.removeOnScrollListener(this);
        }
        this.isDragging = false;
    }

    /* JADX INFO: renamed from: H */
    public final void m8299H(@Nullable List<? extends IntlVisitor> visitorItems, boolean hasPrivilege) {
        m8300I(!hasPrivilege);
        if (NullChecker.a(visitorItems) && visitorItems != null && visitorItems.size() == 0) {
            m8283J();
            return;
        }
        if (visitorItems != null) {
            m8310w().setVisibility(8);
            m8295B().setVisibility(0);
            ump umpVar = this.adapter;
            if (umpVar != null) {
                umpVar.m23081L(visitorItems);
            }
            if (!vwb.J(visitorItems)) {
                m8281C();
            }
        }
        m8282F();
    }

    /* JADX INFO: renamed from: I */
    public final void m8300I(boolean show) {
        if (show) {
            rmp.INSTANCE.m21754j("e_intl_visitors_list_unlock_btn");
        }
        if (CoreModule.c.p0.l3()) {
            m8309v().setBackgroundResource(b3c0.O);
            m8309v().setTextColor(Color.parseColor("#F9E7FF"));
        } else if (CoreModule.c.p0.i3()) {
            m8309v().setBackgroundResource(b3c0.Q);
            m8309v().setTextColor(Color.parseColor("#000000"));
        } else {
            m8309v().setBackgroundResource(b3c0.P);
            m8309v().setTextColor(Color.parseColor("#FFFFFF"));
        }
        xdl0.M(m8309v(), show);
        xdl0.M(m8308u(), show);
    }

    @NotNull
    public Act act() {
        return this.act;
    }

    public void destroy() {
        ymp ympVar = this.intlVisitorsAffiliateDiscountBannerHost;
        if (ympVar != null) {
            ympVar.m25465g();
        }
        this.intlVisitorsAffiliateDiscountBannerHost = null;
        c4g0 c4g0Var = this.loadSub;
        if (c4g0Var != null) {
            mkd0.z(c4g0Var);
        }
        ump umpVar = this.adapter;
        if (umpVar != null) {
            umpVar.m23078H();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m8301i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = lop.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM8301i = m8301i(inflater, parent);
        m8312y().setLeftIconAsBack(this.act);
        viewM8301i.setBackgroundColor(this.act.getResources().getColor(w0c0.b2));
        xdl0.E0(m8309v(), new View.OnClickListener() { // from class: l.fop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlVisitorsViewModel.m8286c(this.f13128a, view);
            }
        });
        return viewM8301i;
    }

    /* JADX INFO: renamed from: m */
    public final void m8303m() {
        VPullUpRecyclerView vPullUpRecyclerViewM8294A = m8294A();
        if (vPullUpRecyclerViewM8294A != null) {
            vPullUpRecyclerViewM8294A.addOnScrollListener(this);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8304n() {
        if (this.intlVisitorsAffiliateDiscountBannerHost != null) {
            return;
        }
        IntlVisitorsAct intlVisitorsAct = this.act;
        eop eopVar = this.presenter;
        if (eopVar == null) {
            Intrinsics.r("presenter");
            eopVar = null;
        }
        ymp ympVar = new ymp(intlVisitorsAct, eopVar);
        this.intlVisitorsAffiliateDiscountBannerHost = ympVar;
        ympVar.m25463e(m8311x());
    }

    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        recyclerView.getClass();
        super.onScrollStateChanged(recyclerView, newState);
        boolean z = true;
        if (newState != 1 && newState != 2) {
            z = false;
        }
        this.isDragging = z;
        this.scrollY = 0;
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, dx, dy);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m8302i1(@NotNull eop presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: q */
    public final void m8306q(int dy) {
        int i = this.scrollY + dy;
        this.scrollY = i;
        if (i > t100.Q) {
            this.isShowed = true;
            e51.F(this.act, new Runnable() { // from class: l.gop
                @Override // java.lang.Runnable
                public final void run() {
                    IntlVisitorsViewModel.m8288e(this.f13655a);
                }
            });
            rmp.INSTANCE.m21756o(this.act, "p_intl_visitors_list,swipe", new Function0() { // from class: l.hop
                public final Object invoke() {
                    return IntlVisitorsViewModel.m8285b(this.f14201a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8307r() {
        m8312y().setLeftIconAsBack(this.act);
        m8312y().setTitle(R.string.Lb);
        IntlVisitorsAct intlVisitorsAct = this.act;
        eop eopVar = this.presenter;
        if (eopVar == null) {
            Intrinsics.r("presenter");
            eopVar = null;
        }
        this.adapter = new ump(intlVisitorsAct, eopVar);
        m8313z().I(false);
        VPullUpRecyclerView vPullUpRecyclerViewM8294A = m8294A();
        final Context contextM8296C0 = m8296C0();
        vPullUpRecyclerViewM8294A.setLayoutManager(new LinearLayoutManager(contextM8296C0) { // from class: com.p1.mobile.putong.core.ui.intl.visitor.IntlVisitorsViewModel$initView$1
            public boolean canScrollVertically() {
                return !this.f6779a.isShowed;
            }

            public int scrollVerticallyBy(int dy, RecyclerView.v recycler, RecyclerView.z state) {
                int iScrollVerticallyBy = super.scrollVerticallyBy(dy, recycler, state);
                if (this.f6779a.isDragging && !this.f6779a.isShowed) {
                    this.f6779a.m8306q(dy);
                }
                return iScrollVerticallyBy;
            }
        });
        m8294A().setAdapter(this.adapter);
        m8304n();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final FrameLayout m8308u() {
        FrameLayout frameLayout = this._bottom_bg;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_bottom_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final RoundTextView m8309v() {
        RoundTextView roundTextView = this._bottom_bg_get_privilege;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.r("_bottom_bg_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VLinear m8310w() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final FrameLayout m8311x() {
        FrameLayout frameLayout = this._intl_visitors_discount_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_intl_visitors_discount_banner_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VNavigationBar m8312y() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VPullDownRefreshLayout m8313z() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.r("_swipe_refresh");
        return null;
    }
}
