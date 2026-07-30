package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceVirtualUserLeaderBoardContentViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f49242d;

    /* JADX INFO: renamed from: e */
    public VoiceUserLeaderBoardPage f49243e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f49244f;

    /* JADX INFO: renamed from: g */
    public HourBoardEmptyView f49245g;

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context) {
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

    public VoiceUserLeaderBoardPage getRoot() {
        return this.f49243e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73260h0(ViewGroup viewGroup) {
        this.f49243e = (VoiceUserLeaderBoardPage) viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.getChildAt(0);
        this.f49244f = recyclerView;
        String str = recyclerView == null ? "_recyclerView" : null;
        HourBoardEmptyView hourBoardEmptyView = (HourBoardEmptyView) viewGroup.getChildAt(1);
        this.f49245g = hourBoardEmptyView;
        if (hourBoardEmptyView == null) {
            str = "_empty_view";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49242d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199158lb, viewGroup, false);
        m73260h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73260h0(this);
    }

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
