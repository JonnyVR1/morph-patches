package com.p000p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p000p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveLoveLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveUserLeaderboard;
import l.ddv;
import l.e30;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.far;
import p002l.gm0;
import p002l.i3c0;
import p002l.t6c0;
import p002l.u9y;
import p002l.z9y;
import v.VButton;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MemberLeaderViewDomestic extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MemberLeaderViewDomestic f5268a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5269b;

    /* JADX INFO: renamed from: c */
    public TextView f5270c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshLayout f5271d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f5272e;

    /* JADX INFO: renamed from: f */
    public VLinear f5273f;

    /* JADX INFO: renamed from: g */
    public VButton f5274g;

    /* JADX INFO: renamed from: h */
    public View f5275h;

    /* JADX INFO: renamed from: i */
    public LiveMemberItem f5276i;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f5277j;

    public MemberLeaderViewDomestic(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6605a(u9y u9yVar, String str, View view) {
        if (ypv.k().b7()) {
            u9yVar.m14204w3(str, t100.d(574.0f), 4100, 24);
        } else {
            u9yVar.m14203v3(str, t100.d(497.0f), 4100);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6607c(BLiveLoveLeaderboard bLiveLoveLeaderboard, e30 e30Var, View view) {
        int i = bLiveLoveLeaderboard.count;
        if (i > 0) {
            e30Var.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static MemberLeaderViewDomestic m6608e(LayoutInflater layoutInflater) {
        return (MemberLeaderViewDomestic) layoutInflater.inflate(t6c0.f19639P3, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m6609d(View view) {
        z9y.m27141a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6610f(View view) {
        View.OnClickListener onClickListener = this.f5277j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m6611g(boolean z, Act act, far farVar, gm0 gm0Var, e30<String> e30Var) {
        if (farVar.m13040b() == null) {
            return;
        }
        this.f5276i.m6595o(e30Var, farVar.m13040b(), gm0Var);
        this.f5276i.m6597q(z, act, farVar.m13040b(), farVar.m13044f().loveLeaderboard);
    }

    /* JADX INFO: renamed from: h */
    public void m6612h(BLiveUserLeaderboard bLiveUserLeaderboard, final u9y<?> u9yVar, final e30<Integer> e30Var) {
        final BLiveLoveLeaderboard bLiveLoveLeaderboardNew_ = bLiveUserLeaderboard == null ? BLiveLoveLeaderboard.new_() : bLiveUserLeaderboard.loveLeaderboard;
        final String str = (bLiveUserLeaderboard == null || TextUtils.isEmpty(bLiveUserLeaderboard.ruleUrl)) ? ddv.z : bLiveUserLeaderboard.ruleUrl;
        int i = bLiveLoveLeaderboardNew_.count;
        TextView textView = this.f5270c;
        if (i == 0) {
            textView.setText("暂无用户登上宠爱榜");
            this.f5270c.setCompoundDrawablePadding(0);
            this.f5270c.setCompoundDrawables(null, null, null, null);
        } else {
            textView.setText("宠爱榜用户(" + bLiveLoveLeaderboardNew_.count + ")");
            this.f5270c.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f12990w3, 0);
        }
        xdl0.E0(this.f5269b, new View.OnClickListener() { // from class: l.x9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberLeaderViewDomestic.m6605a(u9yVar, str, view);
            }
        });
        xdl0.E0(this.f5270c, new View.OnClickListener() { // from class: l.y9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberLeaderViewDomestic.m6607c(bLiveLoveLeaderboardNew_, e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6609d(this);
        this.f5272e.setLayoutManager(new LinearLayoutManager(getContext()));
        xdl0.E0(this.f5274g, new View.OnClickListener() { // from class: l.w9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21585a.m6610f(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f5277j = onClickListener;
    }

    public MemberLeaderViewDomestic(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MemberLeaderViewDomestic(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
