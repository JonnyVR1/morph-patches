package com.p051p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveLoveLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLeaderboard;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p051p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;
import p151v.VButton;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.cm0;
import p153l.efv;
import p153l.hcr;
import p153l.obc0;
import p153l.qa00;
import p153l.riy;
import p153l.wiy;
import p153l.y20;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class MemberLeaderViewDomestic extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MemberLeaderViewDomestic f50074a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f50075b;

    /* JADX INFO: renamed from: c */
    public TextView f50076c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshLayout f50077d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f50078e;

    /* JADX INFO: renamed from: f */
    public VLinear f50079f;

    /* JADX INFO: renamed from: g */
    public VButton f50080g;

    /* JADX INFO: renamed from: h */
    public View f50081h;

    /* JADX INFO: renamed from: i */
    public LiveMemberItem f50082i;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f50083j;

    public MemberLeaderViewDomestic(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m74262a(riy riyVar, String str, View view) {
        if (zrv.m221193k().m203589b7()) {
            riyVar.m138876w3(str, qa00.m175859d(574.0f), 4100, 24);
        } else {
            riyVar.m138875v3(str, qa00.m175859d(497.0f), 4100);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m74264c(BLiveLoveLeaderboard bLiveLoveLeaderboard, y20 y20Var, View view) {
        int i = bLiveLoveLeaderboard.count;
        if (i > 0) {
            y20Var.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public static MemberLeaderViewDomestic m74265e(LayoutInflater layoutInflater) {
        return (MemberLeaderViewDomestic) layoutInflater.inflate(yec0.f198875P3, (ViewGroup) null, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m74266d(View view) {
        wiy.m206614a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74267f(View view) {
        View.OnClickListener onClickListener = this.f50083j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m74268g(boolean z, Act act, hcr hcrVar, cm0 cm0Var, y20<String> y20Var) {
        if (hcrVar.m134492b() == null) {
            return;
        }
        this.f50082i.m74252o(y20Var, hcrVar.m134492b(), cm0Var);
        this.f50082i.m74254q(z, act, hcrVar.m134492b(), hcrVar.m134496f().loveLeaderboard);
    }

    /* JADX INFO: renamed from: h */
    public void m74269h(BLiveUserLeaderboard bLiveUserLeaderboard, final riy<?> riyVar, final y20<Integer> y20Var) {
        final BLiveLoveLeaderboard bLiveLoveLeaderboardNew_ = bLiveUserLeaderboard == null ? BLiveLoveLeaderboard.new_() : bLiveUserLeaderboard.loveLeaderboard;
        final String str = (bLiveUserLeaderboard == null || TextUtils.isEmpty(bLiveUserLeaderboard.ruleUrl)) ? efv.f93869z : bLiveUserLeaderboard.ruleUrl;
        int i = bLiveLoveLeaderboardNew_.count;
        TextView textView = this.f50076c;
        if (i == 0) {
            textView.setText("暂无用户登上宠爱榜");
            this.f50076c.setCompoundDrawablePadding(0);
            this.f50076c.setCompoundDrawables(null, null, null, null);
        } else {
            textView.setText("宠爱榜用户(" + bLiveLoveLeaderboardNew_.count + ")");
            this.f50076c.setCompoundDrawablesWithIntrinsicBounds(0, 0, obc0.f146533w3, 0);
        }
        bnl0.m105509E0(this.f50075b, new View.OnClickListener() { // from class: l.uiy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberLeaderViewDomestic.m74262a(riyVar, str, view);
            }
        });
        bnl0.m105509E0(this.f50076c, new View.OnClickListener() { // from class: l.viy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberLeaderViewDomestic.m74264c(bLiveLoveLeaderboardNew_, y20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74266d(this);
        this.f50078e.setLayoutManager(new LinearLayoutManager(getContext()));
        bnl0.m105509E0(this.f50080g, new View.OnClickListener() { // from class: l.tiy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174517a.m74267f(view);
            }
        });
    }

    public void setOnJumpClickListener(View.OnClickListener onClickListener) {
        this.f50083j = onClickListener;
    }

    public MemberLeaderViewDomestic(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MemberLeaderViewDomestic(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
