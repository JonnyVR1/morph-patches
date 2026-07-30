package com.p051p1.mobile.putong.core.p058ui.intl.visitor;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlVisitor;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsViewModel;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundTextView;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.c4s;
import p153l.c9c0;
import p153l.eqp;
import p153l.gbc0;
import p153l.iam;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.lqp;
import p153l.psd0;
import p153l.qa00;
import p153l.rop;
import p153l.uop;
import p153l.y20;
import p153l.yop;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020$H\u0016¢\u0006\u0004\b\u0005\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\nJ\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J%\u0010.\u001a\u00020\b2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0006\u0010-\u001a\u00020\u0011¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0014J\u001f\u00104\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u00105J'\u00107\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u0006\u00106\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010u\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010y\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010E\u001a\u0004\bw\u0010G\"\u0004\bx\u0010IR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u001e\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u001b\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u0090\u0001¨\u0006\u0092\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsViewModel;", "Ll/iam;", "Ll/eqp;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;)V", "", "F", "()V", "", "dy", "q", "(I)V", c4s.C_ZONE, "J", "", "show", "I", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "n", "m", "G", "presenter", "p", "(Ll/eqp;)V", "inflateView", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/core/data/IntlVisitor;", "visitorItems", "hasPrivilege", "H", "(Ljava/util/List;Z)V", "E", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "a", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", BaseSei.f14625Y, "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", BaseSei.f14624X, "()Landroid/widget/FrameLayout;", "set_intl_visitors_discount_banner_container", "(Landroid/widget/FrameLayout;)V", "_intl_visitors_discount_banner_container", "Lv/VLinear;", Constants.INAPP_DATA_TAG, "Lv/VLinear;", "B", "()Lv/VLinear;", "set_visitors_ll", "(Lv/VLinear;)V", "_visitors_ll", "Lv/VPullDownRefreshLayout;", "e", "Lv/VPullDownRefreshLayout;", BaseSei.f14626Z, "()Lv/VPullDownRefreshLayout;", "set_swipe_refresh", "(Lv/VPullDownRefreshLayout;)V", "_swipe_refresh", "Lv/VPullUpRecyclerView;", "f", "Lv/VPullUpRecyclerView;", "A", "()Lv/VPullUpRecyclerView;", "set_visitors", "(Lv/VPullUpRecyclerView;)V", "_visitors", "g", "w", "set_empty", "_empty", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "get_empty_empty_img", "()Landroid/widget/ImageView;", "set_empty_empty_img", "(Landroid/widget/ImageView;)V", "_empty_empty_img", "Lv/VText;", "Lv/VText;", "get_empty_empty_tv", "()Lv/VText;", "set_empty_empty_tv", "(Lv/VText;)V", "_empty_empty_tv", "j", "u", "set_bottom_bg", "_bottom_bg", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "k", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", ResourceDirection.f39656v, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;", "set_bottom_bg_get_privilege", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundTextView;)V", "_bottom_bg_get_privilege", "Ll/uop;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/uop;", "adapter", "Ll/eqp;", "Z", "isDragging", "o", "isShowed", "scrollY", "Ll/yop;", "Ll/yop;", "intlVisitorsAffiliateDiscountBannerHost", "Ll/kcg0;", "Ll/kcg0;", "loadSub", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlVisitorsViewModel extends RecyclerView.AbstractC0584t implements iam<eqp> {

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
    public uop adapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public eqp presenter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isDragging;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean isShowed;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int scrollY;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public yop intlVisitorsAffiliateDiscountBannerHost;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public kcg0 loadSub;

    public IntlVisitorsViewModel(@NotNull IntlVisitorsAct intlVisitorsAct) {
        intlVisitorsAct.getClass();
        this.act = intlVisitorsAct;
    }

    /* JADX INFO: renamed from: C */
    private final void m47380C() {
        if (NullChecker.m82486a(this.loadSub)) {
            return;
        }
        C22421c<View> c22421cMo34502fh = CoreModule.f18273l.m143405a().mo34502fh(this.act);
        this.loadSub = c22421cMo34502fh != null ? c22421cMo34502fh.subscribe(psd0.m173597H(new y20() { // from class: l.jqp
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlVisitorsViewModel.m47388f(this.f122235a, (View) obj);
            }
        }, new y20() { // from class: l.kqp
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlVisitorsViewModel.m47383a((Throwable) obj);
            }
        })) : null;
    }

    /* JADX INFO: renamed from: F */
    private final void m47381F() {
        yop yopVar = this.intlVisitorsAffiliateDiscountBannerHost;
        if (yopVar != null) {
            yopVar.m216988j();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m47382J() {
        m47407w().setVisibility(0);
        m47394B().setVisibility(8);
        m47381F();
    }

    /* JADX INFO: renamed from: a */
    public static void m47383a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static Unit m47384b(final IntlVisitorsViewModel intlVisitorsViewModel) {
        l51.m152886F(intlVisitorsViewModel.act, new Runnable() { // from class: l.iqp
            @Override // java.lang.Runnable
            public final void run() {
                IntlVisitorsViewModel.m47392s(this.f116443a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m47385c(IntlVisitorsViewModel intlVisitorsViewModel, View view) {
        rop ropVar = rop.INSTANCE;
        ropVar.m182434i("e_intl_visitors_list_unlock_btn");
        rop.m182428p(ropVar, intlVisitorsViewModel.act, "p_intl_visitors_list,e_intl_visitors_list_unlock_btn,check", null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m47387e(IntlVisitorsViewModel intlVisitorsViewModel) {
        intlVisitorsViewModel.m47393A().stopScroll();
    }

    /* JADX INFO: renamed from: f */
    public static void m47388f(IntlVisitorsViewModel intlVisitorsViewModel, View view) {
        if (NullChecker.m82486a(view)) {
            IntlVisitor intlVisitorNew_ = IntlVisitor.new_();
            intlVisitorNew_.f21172id = "fake_visitor_list_admob_id";
            uop uopVar = intlVisitorsViewModel.adapter;
            if (uopVar != null) {
                uopVar.m197006F(intlVisitorNew_, view);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m47392s(IntlVisitorsViewModel intlVisitorsViewModel) {
        intlVisitorsViewModel.m47393A().smoothScrollToPosition(0);
        intlVisitorsViewModel.isShowed = false;
        intlVisitorsViewModel.isDragging = false;
        intlVisitorsViewModel.scrollY = 0;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VPullUpRecyclerView m47393A() {
        VPullUpRecyclerView vPullUpRecyclerView = this._visitors;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m88391r("_visitors");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final VLinear m47394B() {
        VLinear vLinear = this._visitors_ll;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_visitors_ll");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m47395E(boolean hasPrivilege) {
        m47398I(!hasPrivilege);
        uop uopVar = this.adapter;
        if (uopVar != null) {
            uopVar.m197009K(hasPrivilege);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m47396G() {
        VPullUpRecyclerView vPullUpRecyclerViewM47393A = m47393A();
        if (vPullUpRecyclerViewM47393A != null) {
            vPullUpRecyclerViewM47393A.removeOnScrollListener(this);
        }
        this.isDragging = false;
    }

    /* JADX INFO: renamed from: H */
    public final void m47397H(@Nullable List<? extends IntlVisitor> visitorItems, boolean hasPrivilege) {
        m47398I(!hasPrivilege);
        if (NullChecker.m82486a(visitorItems) && visitorItems != null && visitorItems.size() == 0) {
            m47382J();
            return;
        }
        if (visitorItems != null) {
            m47407w().setVisibility(8);
            m47394B().setVisibility(0);
            uop uopVar = this.adapter;
            if (uopVar != null) {
                uopVar.m197010L(visitorItems);
            }
            if (!jyb.m147479J(visitorItems)) {
                m47380C();
            }
        }
        m47381F();
    }

    /* JADX INFO: renamed from: I */
    public final void m47398I(boolean show) {
        if (show) {
            rop.INSTANCE.m182435j("e_intl_visitors_list_unlock_btn");
        }
        if (CoreModule.f18264c.f20414p0.m219067l3()) {
            m47406v().setBackgroundResource(gbc0.f103169O);
            m47406v().setTextColor(Color.parseColor("#F9E7FF"));
        } else if (CoreModule.f18264c.f20414p0.m219064i3()) {
            m47406v().setBackgroundResource(gbc0.f103183Q);
            m47406v().setTextColor(Color.parseColor(Constants.BLACK));
        } else {
            m47406v().setBackgroundResource(gbc0.f103176P);
            m47406v().setTextColor(Color.parseColor("#FFFFFF"));
        }
        bnl0.m105524M(m47406v(), show);
        bnl0.m105524M(m47405u(), show);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.act;
    }

    @Override // p153l.iam
    public void destroy() {
        yop yopVar = this.intlVisitorsAffiliateDiscountBannerHost;
        if (yopVar != null) {
            yopVar.m216985g();
        }
        this.intlVisitorsAffiliateDiscountBannerHost = null;
        kcg0 kcg0Var = this.loadSub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        uop uopVar = this.adapter;
        if (uopVar != null) {
            uopVar.m197007H();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final View m47399i(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM155501b = lqp.m155501b(this, inflater, parent);
        viewM155501b.getClass();
        return viewM155501b;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM47399i = m47399i(inflater, parent);
        m47409y().setLeftIconAsBack(this.act);
        viewM47399i.setBackgroundColor(this.act.getResources().getColor(c9c0.f80407c2));
        bnl0.m105509E0(m47406v(), new View.OnClickListener() { // from class: l.fqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlVisitorsViewModel.m47385c(this.f100320a, view);
            }
        });
        return viewM47399i;
    }

    /* JADX INFO: renamed from: m */
    public final void m47400m() {
        VPullUpRecyclerView vPullUpRecyclerViewM47393A = m47393A();
        if (vPullUpRecyclerViewM47393A != null) {
            vPullUpRecyclerViewM47393A.addOnScrollListener(this);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m47401n() {
        if (this.intlVisitorsAffiliateDiscountBannerHost != null) {
            return;
        }
        IntlVisitorsAct intlVisitorsAct = this.act;
        eqp eqpVar = this.presenter;
        if (eqpVar == null) {
            Intrinsics.m88391r("presenter");
            eqpVar = null;
        }
        yop yopVar = new yop(intlVisitorsAct, eqpVar);
        this.intlVisitorsAffiliateDiscountBannerHost = yopVar;
        yopVar.m216983e(m47408x());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, dx, dy);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull eqp presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: q */
    public final void m47403q(int dy) {
        int i = this.scrollY + dy;
        this.scrollY = i;
        if (i > qa00.f156304Q) {
            this.isShowed = true;
            l51.m152886F(this.act, new Runnable() { // from class: l.gqp
                @Override // java.lang.Runnable
                public final void run() {
                    IntlVisitorsViewModel.m47387e(this.f105713a);
                }
            });
            rop.INSTANCE.m182437o(this.act, "p_intl_visitors_list,swipe", new Function0() { // from class: l.hqp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IntlVisitorsViewModel.m47384b(this.f111162a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m47404r() {
        m47409y().setLeftIconAsBack(this.act);
        m47409y().setTitle(R$string.f19089ac);
        IntlVisitorsAct intlVisitorsAct = this.act;
        eqp eqpVar = this.presenter;
        if (eqpVar == null) {
            Intrinsics.m88391r("presenter");
            eqpVar = null;
        }
        this.adapter = new uop(intlVisitorsAct, eqpVar);
        m47410z().m225003I(false);
        VPullUpRecyclerView vPullUpRecyclerViewM47393A = m47393A();
        final Context context = getContext();
        vPullUpRecyclerViewM47393A.setLayoutManager(new LinearLayoutManager(context) { // from class: com.p1.mobile.putong.core.ui.intl.visitor.IntlVisitorsViewModel$initView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
            public boolean canScrollVertically() {
                return !this.f30676a.isShowed;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
            public int scrollVerticallyBy(int dy, RecyclerView.C0586v recycler, RecyclerView.C0561a0 state) {
                int iScrollVerticallyBy = super.scrollVerticallyBy(dy, recycler, state);
                if (this.f30676a.isDragging && !this.f30676a.isShowed) {
                    this.f30676a.m47403q(dy);
                }
                return iScrollVerticallyBy;
            }
        });
        m47393A().setAdapter(this.adapter);
        m47401n();
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final FrameLayout m47405u() {
        FrameLayout frameLayout = this._bottom_bg;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_bottom_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final RoundTextView m47406v() {
        RoundTextView roundTextView = this._bottom_bg_get_privilege;
        if (roundTextView != null) {
            return roundTextView;
        }
        Intrinsics.m88391r("_bottom_bg_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VLinear m47407w() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final FrameLayout m47408x() {
        FrameLayout frameLayout = this._intl_visitors_discount_banner_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_intl_visitors_discount_banner_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VNavigationBar m47409y() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final VPullDownRefreshLayout m47410z() {
        VPullDownRefreshLayout vPullDownRefreshLayout = this._swipe_refresh;
        if (vPullDownRefreshLayout != null) {
            return vPullDownRefreshLayout;
        }
        Intrinsics.m88391r("_swipe_refresh");
        return null;
    }
}
