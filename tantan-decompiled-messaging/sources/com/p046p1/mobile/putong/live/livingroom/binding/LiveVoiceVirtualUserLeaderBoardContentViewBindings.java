package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceVirtualUserLeaderBoardContentViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48394d;

    /* JADX INFO: renamed from: e */
    public VoiceUserLeaderBoardPage f48395e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f48396f;

    /* JADX INFO: renamed from: g */
    public HourBoardEmptyView f48397g;

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context) {
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

    public VoiceUserLeaderBoardPage getRoot() {
        return this.f48395e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72077h0(ViewGroup viewGroup) {
        this.f48395e = (VoiceUserLeaderBoardPage) viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.getChildAt(0);
        this.f48396f = recyclerView;
        String str = recyclerView == null ? "_recyclerView" : null;
        HourBoardEmptyView hourBoardEmptyView = (HourBoardEmptyView) viewGroup.getChildAt(1);
        this.f48397g = hourBoardEmptyView;
        if (hourBoardEmptyView == null) {
            str = "_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48394d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168426lb, viewGroup, false);
        m72077h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72077h0(this);
    }

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
