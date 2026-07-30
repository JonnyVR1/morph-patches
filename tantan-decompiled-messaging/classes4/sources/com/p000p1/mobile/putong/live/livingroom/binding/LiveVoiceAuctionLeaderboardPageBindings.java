package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.view.EmptyView;
import com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.leaderboard.LiveVoiceAuctionLeaderboardListPage;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;
import v.VDraweeView;
import v.VLinear;
import v.VPullDownRefreshLayout;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceAuctionLeaderboardPageBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4251d;

    /* JADX INFO: renamed from: e */
    public LiveVoiceAuctionLeaderboardListPage f4252e;

    /* JADX INFO: renamed from: f */
    public VPullDownRefreshLayout f4253f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f4254g;

    /* JADX INFO: renamed from: h */
    public EmptyView f4255h;

    /* JADX INFO: renamed from: i */
    public VLinear f4256i;

    /* JADX INFO: renamed from: j */
    public VText f4257j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f4258k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f4259l;

    /* JADX INFO: renamed from: m */
    public VText f4260m;

    /* JADX INFO: renamed from: n */
    public VText f4261n;

    /* JADX INFO: renamed from: o */
    public VText f4262o;

    public LiveVoiceAuctionLeaderboardPageBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5511C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public LiveVoiceAuctionLeaderboardListPage getRoot() {
        return this.f4252e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5512h0(ViewGroup viewGroup) {
        this.f4252e = (LiveVoiceAuctionLeaderboardListPage) viewGroup;
        VPullDownRefreshLayout childAt = viewGroup.getChildAt(0);
        this.f4253f = childAt;
        String str = childAt == null ? "_load_more_layout" : null;
        RecyclerView recyclerViewFindViewById = viewGroup.findViewById(g5c0.f11208t3);
        this.f4254g = recyclerViewFindViewById;
        if (recyclerViewFindViewById == null) {
            str = "_list";
        }
        EmptyView childAt2 = viewGroup.getChildAt(1);
        this.f4255h = childAt2;
        if (childAt2 == null) {
            str = "_rv_empty_view";
        }
        VLinear childAt3 = viewGroup.getChildAt(2);
        this.f4256i = childAt3;
        if (childAt3 == null) {
            str = "_my_leaderboard";
        }
        VText childAt4 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        this.f4257j = childAt4;
        if (childAt4 == null) {
            str = "_my_leaderboard_rank";
        }
        VDraweeView childAt5 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        this.f4258k = childAt5;
        if (childAt5 == null) {
            str = "_my_leaderboard_avatar_view";
        }
        VDraweeView childAt6 = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        this.f4259l = childAt6;
        if (childAt6 == null) {
            str = "_my_leaderboard_avatar_view_other";
        }
        VText childAt7 = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        this.f4260m = childAt7;
        if (childAt7 == null) {
            str = "_my_leaderboard_name";
        }
        VText childAt8 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        this.f4261n = childAt8;
        if (childAt8 == null) {
            str = "_my_leaderboard_relation";
        }
        VText childAt9 = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        this.f4262o = childAt9;
        if (childAt9 == null) {
            str = "_my_leaderboard_user_worth";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5513i1(T t) {
        this.f4251d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19499D7, viewGroup, false);
        m5512h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5512h0(this);
    }

    public LiveVoiceAuctionLeaderboardPageBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceAuctionLeaderboardPageBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
