package com.p051p1.mobile.putong.live.external.intl.voicesquare.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.external.intl.voicesquare.VoiceSquareBaseViewModel;
import com.p051p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel;
import com.p051p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.e4s;
import p153l.hro0;
import p153l.i4g0;
import p153l.iam;
import p153l.l51;
import p153l.m1v;
import p153l.nro0;
import p153l.qa00;
import p153l.r6s;
import p153l.tbs;
import p153l.uxr;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0019J3\u0010$\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u00020\u00142\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u0010\u0019J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010,J\u000f\u00103\u001a\u00020\"H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0019R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010S\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010a\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010bR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010eR\u0016\u0010h\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010g¨\u0006i"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/voicesquare/common/VoiceRoomSquareCommonViewModel;", "Lcom/p1/mobile/putong/live/external/intl/voicesquare/VoiceSquareBaseViewModel;", "Ll/iam;", "Ll/hro0;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "voiceTab", "", "isWhiteTheme", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "k", "(Ll/hro0;)V", "inflateView", "destroy", "()V", "C0", "()Landroid/content/Context;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Ll/z20;", "", "onViewRequestAction", "m", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;Ll/z20;)V", "", "Ll/r6s;", "feeds", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;)V", "p", "()Z", "Landroidx/recyclerview/widget/RecyclerView$t;", "onScrollListener", "setOnScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$t;)V", "u", "q", "getAdapterItemCount", "()I", "n", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "get_root", "()Landroid/widget/FrameLayout;", "set_root", "(Landroid/widget/FrameLayout;)V", "_root", "Lcom/google/android/material/appbar/AppBarLayout;", RXScreenCaptureService.KEY_INDEX, "Lcom/google/android/material/appbar/AppBarLayout;", "get_app_bar_layout", "()Lcom/google/android/material/appbar/AppBarLayout;", "set_app_bar_layout", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "_app_bar_layout", "Lv/VText;", "Lv/VText;", "get_search_tv", "()Lv/VText;", "set_search_tv", "(Lv/VText;)V", "_search_tv", "Landroidx/recyclerview/widget/RecyclerView;", "get_recycler", "()Landroidx/recyclerview/widget/RecyclerView;", "set_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_recycler", "Landroidx/core/widget/NestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "get_view_group_no_live", "()Landroidx/core/widget/NestedScrollView;", "set_view_group_no_live", "(Landroidx/core/widget/NestedScrollView;)V", "_view_group_no_live", "Lcom/p1/mobile/putong/live/base/view/EmptyView;", "Lcom/p1/mobile/putong/live/base/view/EmptyView;", "get_empty_container", "()Lcom/p1/mobile/putong/live/base/view/EmptyView;", "set_empty_container", "(Lcom/p1/mobile/putong/live/base/view/EmptyView;)V", "_empty_container", "Ll/hro0;", "o", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Z", "isSearchBarShow", "I", "appBarOffset", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SuppressLint({"ViewConstructor"})
public final class VoiceRoomSquareCommonViewModel extends VoiceSquareBaseViewModel implements iam<hro0> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public FrameLayout _root;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public AppBarLayout _app_bar_layout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _search_tv;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public RecyclerView _recycler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public NestedScrollView _view_group_no_live;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public EmptyView _empty_container;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public hro0 presenter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adapter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isSearchBarShow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int appBarOffset;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"com/p1/mobile/putong/live/external/intl/voicesquare/common/VoiceRoomSquareCommonViewModel$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C12729a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveBaseAdapter f46769a;

        public C12729a(LiveBaseAdapter liveBaseAdapter) {
            this.f46769a = liveBaseAdapter;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            return this.f46769a.m68539K(position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRoomSquareCommonViewModel(@NotNull Context context, @NotNull BLiveVoiceTab bLiveVoiceTab, boolean z) {
        super(context, bLiveVoiceTab, z);
        context.getClass();
        bLiveVoiceTab.getClass();
        this.adapter = new LiveBaseAdapter();
        this.appBarOffset = -1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        addView(m71594j(layoutInflaterFrom, this));
        m71601r();
    }

    /* JADX INFO: renamed from: c */
    public static void m71589c(VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel) {
        voiceRoomSquareCommonViewModel.get_app_bar_layout().setExpanded(false);
    }

    /* JADX INFO: renamed from: d */
    public static void m71590d(VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel, AppBarLayout appBarLayout, int i) {
        voiceRoomSquareCommonViewModel.appBarOffset = i;
        hro0 hro0Var = voiceRoomSquareCommonViewModel.presenter;
        if (hro0Var == null) {
            Intrinsics.m88391r("presenter");
            hro0Var = null;
        }
        hro0Var.m136908n0(i >= 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m71591e(Integer num, Integer num2) {
    }

    /* JADX INFO: renamed from: f */
    public static void m71592f(VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel, View view) {
        voiceRoomSquareCommonViewModel.m71596l();
    }

    private final int getAdapterItemCount() {
        RecyclerView.Adapter adapter = get_recycler().getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static void m71593i(LiveBaseAdapter liveBaseAdapter, VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel, int i) {
        if (i == liveBaseAdapter.getItemCount() - 2) {
            hro0 hro0Var = voiceRoomSquareCommonViewModel.presenter;
            if (hro0Var == null) {
                Intrinsics.m88391r("presenter");
                hro0Var = null;
            }
            BLiveVoiceTab voiceTab = voiceRoomSquareCommonViewModel.getVoiceTab();
            voiceTab.getClass();
            hro0Var.m136911q0(voiceTab, new ArrayList());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @NotNull
    public final AppBarLayout get_app_bar_layout() {
        AppBarLayout appBarLayout = this._app_bar_layout;
        if (appBarLayout != null) {
            return appBarLayout;
        }
        Intrinsics.m88391r("_app_bar_layout");
        return null;
    }

    @NotNull
    public final EmptyView get_empty_container() {
        EmptyView emptyView = this._empty_container;
        if (emptyView != null) {
            return emptyView;
        }
        Intrinsics.m88391r("_empty_container");
        return null;
    }

    @NotNull
    public final RecyclerView get_recycler() {
        RecyclerView recyclerView = this._recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_recycler");
        return null;
    }

    @NotNull
    public final FrameLayout get_root() {
        FrameLayout frameLayout = this._root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final VText get_search_tv() {
        VText vText = this._search_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_search_tv");
        return null;
    }

    @NotNull
    public final NestedScrollView get_view_group_no_live() {
        NestedScrollView nestedScrollView = this._view_group_no_live;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.m88391r("_view_group_no_live");
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m71594j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM164503b = nro0.m164503b(this, inflater, parent);
        viewM164503b.getClass();
        return viewM164503b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull hro0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: l */
    public final void m71596l() {
        Act act = getAct();
        if (act != null) {
            act.startActivity(LiveSearchAct.m72011Z1(getAct()));
        }
        i4g0.m138520r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: m */
    public void m71597m(@NotNull RecyclerView recycler, @NotNull final LiveBaseAdapter adapter, @NotNull z20<Integer, Integer> onViewRequestAction) {
        recycler.getClass();
        adapter.getClass();
        onViewRequestAction.getClass();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getAct(), 6);
        gridLayoutManager.m3327v(new C12729a(adapter));
        recycler.setLayoutManager(gridLayoutManager);
        recycler.setItemAnimator(null);
        adapter.m68552X(false);
        adapter.m68558c0(new y20() { // from class: l.kro0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceRoomSquareCommonViewModel.m71593i(adapter, this, ((Integer) obj).intValue());
            }
        });
        recycler.setAdapter(adapter);
        if (getIsWhiteTheme()) {
            bnl0.m105540X(recycler, qa00.f156320g);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m71598n() {
        get_app_bar_layout().addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.lro0
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                VoiceRoomSquareCommonViewModel.m71590d(this.f133349a, appBarLayout, i);
            }
        });
        String strM203675m5 = tbs.f172989b.m203675m5();
        if (!TextUtils.isEmpty(strM203675m5)) {
            get_search_tv().setHint(strM203675m5);
        }
        bnl0.m105509E0(get_search_tv(), new View.OnClickListener() { // from class: l.mro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceRoomSquareCommonViewModel.m71592f(this.f138400a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m71599p() {
        return getAdapterItemCount() != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m71600q() {
        return this.appBarOffset >= 0;
    }

    /* JADX INFO: renamed from: r */
    public final void m71601r() {
        m71587a(get_empty_container());
        bnl0.m105524M(get_view_group_no_live(), false);
        m71597m(get_recycler(), this.adapter, new z20() { // from class: l.jro0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                VoiceRoomSquareCommonViewModel.m71591e((Integer) obj, (Integer) obj2);
            }
        });
        if (getIsWhiteTheme()) {
            m71598n();
        } else {
            get_app_bar_layout().setExpanded(false);
            get_app_bar_layout().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m71602s(@NotNull List<? extends r6s> feeds) {
        feeds.getClass();
        if (get_recycler().getAdapter() == null) {
            return;
        }
        if (feeds.isEmpty()) {
            bnl0.m105524M(get_view_group_no_live(), true);
            bnl0.m105524M(get_recycler(), false);
            return;
        }
        bnl0.m105524M(get_view_group_no_live(), false);
        bnl0.m105524M(get_recycler(), true);
        ArrayList arrayList = new ArrayList();
        hro0 hro0Var = this.presenter;
        if (hro0Var == null) {
            Intrinsics.m88391r("presenter");
            hro0Var = null;
        }
        List<uxr<?>> listM119474b = e4s.m119474b(hro0Var.getCardContext(), feeds);
        listM119474b.getClass();
        arrayList.addAll(listM119474b);
        if (arrayList.size() != 0) {
            arrayList.add(new m1v(true, getIsWhiteTheme(), 6));
        }
        RecyclerView.Adapter adapter = get_recycler().getAdapter();
        adapter.getClass();
        ((LiveBaseAdapter) adapter).m68554Z(arrayList);
    }

    public final void setOnScrollListener(@NotNull RecyclerView.AbstractC0584t onScrollListener) {
        onScrollListener.getClass();
        get_recycler().addOnScrollListener(onScrollListener);
    }

    public final void set_app_bar_layout(@NotNull AppBarLayout appBarLayout) {
        appBarLayout.getClass();
        this._app_bar_layout = appBarLayout;
    }

    public final void set_empty_container(@NotNull EmptyView emptyView) {
        emptyView.getClass();
        this._empty_container = emptyView;
    }

    public final void set_recycler(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._recycler = recyclerView;
    }

    public final void set_root(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._root = frameLayout;
    }

    public final void set_search_tv(@NotNull VText vText) {
        vText.getClass();
        this._search_tv = vText;
    }

    public final void set_view_group_no_live(@NotNull NestedScrollView nestedScrollView) {
        nestedScrollView.getClass();
        this._view_group_no_live = nestedScrollView;
    }

    /* JADX INFO: renamed from: u */
    public final void m71603u() {
        if (this.isSearchBarShow) {
            return;
        }
        this.isSearchBarShow = true;
        l51.m152888H(getContext(), new Runnable() { // from class: l.iro0
            @Override // java.lang.Runnable
            public final void run() {
                VoiceRoomSquareCommonViewModel.m71589c(this.f116595a);
            }
        }, 200L);
    }
}
