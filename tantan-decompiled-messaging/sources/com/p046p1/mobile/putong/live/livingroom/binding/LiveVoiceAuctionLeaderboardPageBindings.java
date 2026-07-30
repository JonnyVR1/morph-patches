package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VText;
import p149l.g5c0;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionLeaderboardPageBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48209d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceAuctionLeaderboardListPage f48210e;

    /* JADX INFO: renamed from: f */
    public VPullDownRefreshLayout f48211f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f48212g;

    /* JADX INFO: renamed from: h */
    public EmptyView f48213h;

    /* JADX INFO: renamed from: i */
    public VLinear f48214i;

    /* JADX INFO: renamed from: j */
    public VText f48215j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f48216k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f48217l;

    /* JADX INFO: renamed from: m */
    public VText f48218m;

    /* JADX INFO: renamed from: n */
    public VText f48219n;

    /* JADX INFO: renamed from: o */
    public VText f48220o;

    public LiveVoiceAuctionLeaderboardPageBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public LiveVoiceAuctionLeaderboardListPage getRoot() {
        return this.f48210e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72054h0(ViewGroup viewGroup) {
        this.f48210e = (LiveVoiceAuctionLeaderboardListPage) viewGroup;
        VPullDownRefreshLayout vPullDownRefreshLayout = (VPullDownRefreshLayout) viewGroup.getChildAt(0);
        this.f48211f = vPullDownRefreshLayout;
        String str = vPullDownRefreshLayout == null ? "_load_more_layout" : null;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(g5c0.f101058t3);
        this.f48212g = recyclerView;
        if (recyclerView == null) {
            str = "_list";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(1);
        this.f48213h = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(2);
        this.f48214i = vLinear;
        if (vLinear == null) {
            str = "_my_leaderboard";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f48215j = vText;
        if (vText == null) {
            str = "_my_leaderboard_rank";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f48216k = vDraweeView;
        if (vDraweeView == null) {
            str = "_my_leaderboard_avatar_view";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f48217l = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_my_leaderboard_avatar_view_other";
        }
        VText vText2 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        this.f48218m = vText2;
        if (vText2 == null) {
            str = "_my_leaderboard_name";
        }
        VText vText3 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        this.f48219n = vText3;
        if (vText3 == null) {
            str = "_my_leaderboard_relation";
        }
        VText vText4 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        this.f48220o = vText4;
        if (vText4 == null) {
            str = "_my_leaderboard_user_worth";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48209d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168003D7, viewGroup, false);
        m72054h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72054h0(this);
    }

    public LiveVoiceAuctionLeaderboardPageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardPageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
