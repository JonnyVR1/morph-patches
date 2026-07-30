package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardEmptyView;
import com.p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceVirtualUserLeaderBoardContentViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4436d;

    /* JADX INFO: renamed from: e */
    public VoiceUserLeaderBoardPage f4437e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f4438f;

    /* JADX INFO: renamed from: g */
    public HourBoardEmptyView f4439g;

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5546C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public VoiceUserLeaderBoardPage getRoot() {
        return this.f4437e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5547h0(ViewGroup viewGroup) {
        this.f4437e = (VoiceUserLeaderBoardPage) viewGroup;
        RecyclerView childAt = viewGroup.getChildAt(0);
        this.f4438f = childAt;
        String str = childAt == null ? "_recyclerView" : null;
        HourBoardEmptyView hourBoardEmptyView = (HourBoardEmptyView) viewGroup.getChildAt(1);
        this.f4439g = hourBoardEmptyView;
        if (hourBoardEmptyView == null) {
            str = "_empty_view";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5548i1(T t) {
        this.f4436d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19922lb, viewGroup, false);
        m5547h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5547h0(this);
    }

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualUserLeaderBoardContentViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
