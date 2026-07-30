package com.p046p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveLoveLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLeaderboard;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p046p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;
import p147v.VButton;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.ddv;
import p149l.e30;
import p149l.far;
import p149l.gm0;
import p149l.i3c0;
import p149l.t100;
import p149l.t6c0;
import p149l.u9y;
import p149l.xdl0;
import p149l.ypv;
import p149l.z9y;

/* JADX INFO: loaded from: classes4.dex */
public class MemberLeaderViewDomestic extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MemberLeaderViewDomestic f49226a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f49227b;

    /* JADX INFO: renamed from: c */
    public TextView f49228c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshLayout f49229d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f49230e;

    /* JADX INFO: renamed from: f */
    public VLinear f49231f;

    /* JADX INFO: renamed from: g */
    public VButton f49232g;

    /* JADX INFO: renamed from: h */
    public View f49233h;

    /* JADX INFO: renamed from: i */
    public LiveMemberItem f49234i;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f49235j;

    public MemberLeaderViewDomestic(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73079a(u9y u9yVar, String str, View view) {
        if (ypv.m215672k().m195802b7()) {
            u9yVar.m129317w3(str, t100.m186890d(574.0f), 4100, 24);
        } else {
            u9yVar.m129316v3(str, t100.m186890d(497.0f), 4100);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m73081c(BLiveLoveLeaderboard bLiveLoveLeaderboard, e30 e30Var, View view) {
        int i = bLiveLoveLeaderboard.count;
        if (i > 0) {
            e30Var.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static MemberLeaderViewDomestic m73082e(LayoutInflater layoutInflater) {
        return (MemberLeaderViewDomestic) layoutInflater.inflate(t6c0.f168143P3, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m73083d(View view) {
        z9y.m217707a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73084f(View view) {
        View.OnClickListener onClickListener = this.f49235j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m73085g(boolean z, Act act, far farVar, gm0 gm0Var, e30<String> e30Var) {
        if (farVar.m120298b() == null) {
            return;
        }
        this.f49234i.m73069o(e30Var, farVar.m120298b(), gm0Var);
        this.f49234i.m73071q(z, act, farVar.m120298b(), farVar.m120302f().loveLeaderboard);
    }

    /* JADX INFO: renamed from: h */
    public void m73086h(BLiveUserLeaderboard bLiveUserLeaderboard, final u9y<?> u9yVar, final e30<Integer> e30Var) {
        final BLiveLoveLeaderboard bLiveLoveLeaderboardNew_ = bLiveUserLeaderboard == null ? BLiveLoveLeaderboard.new_() : bLiveUserLeaderboard.loveLeaderboard;
        final String str = (bLiveUserLeaderboard == null || TextUtils.isEmpty(bLiveUserLeaderboard.ruleUrl)) ? ddv.f85676z : bLiveUserLeaderboard.ruleUrl;
        int i = bLiveLoveLeaderboardNew_.count;
        TextView textView = this.f49228c;
        if (i == 0) {
            textView.setText("暂无用户登上宠爱榜");
            this.f49228c.setCompoundDrawablePadding(0);
            this.f49228c.setCompoundDrawables(null, null, null, null);
        } else {
            textView.setText("宠爱榜用户(" + bLiveLoveLeaderboardNew_.count + ")");
            this.f49228c.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f111205w3, 0);
        }
        xdl0.m208329E0(this.f49227b, new View.OnClickListener() { // from class: l.x9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberLeaderViewDomestic.m73079a(u9yVar, str, view);
            }
        });
        xdl0.m208329E0(this.f49228c, new View.OnClickListener() { // from class: l.y9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberLeaderViewDomestic.m73081c(bLiveLoveLeaderboardNew_, e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73083d(this);
        this.f49230e.setLayoutManager(new LinearLayoutManager(getContext()));
        xdl0.m208329E0(this.f49232g, new View.OnClickListener() { // from class: l.w9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185412a.m73084f(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f49235j = onClickListener;
    }

    public MemberLeaderViewDomestic(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MemberLeaderViewDomestic(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
