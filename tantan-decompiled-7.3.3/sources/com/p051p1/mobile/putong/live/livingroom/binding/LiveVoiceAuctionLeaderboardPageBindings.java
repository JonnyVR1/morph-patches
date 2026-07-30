package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mdc0;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceAuctionLeaderboardPageBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f49057d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceAuctionLeaderboardListPage f49058e;

    /* JADX INFO: renamed from: f */
    public VPullDownRefreshLayout f49059f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f49060g;

    /* JADX INFO: renamed from: h */
    public EmptyView f49061h;

    /* JADX INFO: renamed from: i */
    public VLinear f49062i;

    /* JADX INFO: renamed from: j */
    public VText f49063j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f49064k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f49065l;

    /* JADX INFO: renamed from: m */
    public VText f49066m;

    /* JADX INFO: renamed from: n */
    public VText f49067n;

    /* JADX INFO: renamed from: o */
    public VText f49068o;

    public LiveVoiceAuctionLeaderboardPageBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public LiveVoiceAuctionLeaderboardListPage getRoot() {
        return this.f49058e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73237h0(ViewGroup viewGroup) {
        this.f49058e = (LiveVoiceAuctionLeaderboardListPage) viewGroup;
        VPullDownRefreshLayout vPullDownRefreshLayout = (VPullDownRefreshLayout) viewGroup.getChildAt(0);
        this.f49059f = vPullDownRefreshLayout;
        String str = vPullDownRefreshLayout == null ? "_load_more_layout" : null;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(mdc0.f136303t3);
        this.f49060g = recyclerView;
        if (recyclerView == null) {
            str = "_list";
        }
        EmptyView emptyView = (EmptyView) viewGroup.getChildAt(1);
        this.f49061h = emptyView;
        if (emptyView == null) {
            str = "_rv_empty_view";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(2);
        this.f49062i = vLinear;
        if (vLinear == null) {
            str = "_my_leaderboard";
        }
        VText vText = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f49063j = vText;
        if (vText == null) {
            str = "_my_leaderboard_rank";
        }
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f49064k = vDraweeView;
        if (vDraweeView == null) {
            str = "_my_leaderboard_avatar_view";
        }
        VDraweeView vDraweeView2 = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f49065l = vDraweeView2;
        if (vDraweeView2 == null) {
            str = "_my_leaderboard_avatar_view_other";
        }
        VText vText2 = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        this.f49066m = vText2;
        if (vText2 == null) {
            str = "_my_leaderboard_name";
        }
        VText vText3 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        this.f49067n = vText3;
        if (vText3 == null) {
            str = "_my_leaderboard_relation";
        }
        VText vText4 = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        this.f49068o = vText4;
        if (vText4 == null) {
            str = "_my_leaderboard_user_worth";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49057d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198735D7, viewGroup, false);
        m73237h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73237h0(this);
    }

    public LiveVoiceAuctionLeaderboardPageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardPageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
