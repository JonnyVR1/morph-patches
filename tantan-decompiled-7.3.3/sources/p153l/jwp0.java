package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jwp0 implements iam<mwp0> {

    /* JADX INFO: renamed from: a */
    public WeekLeaderBoardContentView f122950a;

    /* JADX INFO: renamed from: b */
    public mwp0 f122951b;

    public jwp0(Act act) {
        this.f122950a = WeekLeaderBoardContentView.m76093c(act.inflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m147176e(RadioGroup radioGroup, int i) {
        boolean z = i == mdc0.f136005N4;
        this.f122951b.m160583Y3(z ? "currentWeek" : "lastWeek");
        bnl0.m105524M(this.f122950a.f51588f, z);
        this.f122950a.f51586d.setEnabled(z);
        this.f122950a.f51586d.setPadding(0, 0, 0, z ? qa00.m175859d(82.0f) : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m147177f() {
        this.f122951b.m160583Y3("currentWeek");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return super.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mwp0 mwp0Var) {
        this.f122951b = mwp0Var;
    }

    /* JADX INFO: renamed from: d */
    public View m147179d() {
        return this.f122950a;
    }

    @Override // p153l.iam
    public void destroy() {
        this.f122950a.m76097f();
    }

    /* JADX INFO: renamed from: i */
    public void m147180i(List<BLiveHourLeaderBoardItem> list) {
        this.f122950a.m76099h(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m147181j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f122950a.m76101j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m147182k(List<BLiveCurrentHourNotices> list) {
        WeekLeaderBoardContentView weekLeaderBoardContentView = this.f122950a;
        weekLeaderBoardContentView.m76100i(list, weekLeaderBoardContentView.f51583a.getCheckedRadioButtonId() == this.f122950a.f51584b.getId());
    }

    /* JADX INFO: renamed from: l */
    public void m147183l() {
        this.f122950a.m76096e(this.f122951b);
        this.f122950a.m76098g(true);
        this.f122950a.f51584b.setText("本周榜单");
        this.f122950a.f51585c.setText("上周榜单");
        this.f122950a.f51583a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.hwp0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f111908a.m147176e(radioGroup, i);
            }
        });
        this.f122950a.f51586d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.iwp0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f117287a.m147177f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m147184m() {
        this.f122950a.f51586d.setRefreshing(false);
    }
}
