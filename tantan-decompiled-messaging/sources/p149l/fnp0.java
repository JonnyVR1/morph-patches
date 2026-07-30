package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fnp0 implements s7m<inp0> {

    /* JADX INFO: renamed from: a */
    public WeekLeaderBoardContentView f98440a;

    /* JADX INFO: renamed from: b */
    public inp0 f98441b;

    public fnp0(Act act) {
        this.f98440a = WeekLeaderBoardContentView.m74910c(act.inflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m122331e(RadioGroup radioGroup, int i) {
        boolean z = i == g5c0.f100760N4;
        this.f98441b.m137156Y3(z ? "currentWeek" : "lastWeek");
        xdl0.m208344M(this.f98440a.f50740f, z);
        this.f98440a.f50738d.setEnabled(z);
        this.f98440a.f50738d.setPadding(0, 0, 0, z ? t100.m186890d(82.0f) : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m122332f() {
        this.f98441b.m137156Y3("currentWeek");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return super.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(inp0 inp0Var) {
        this.f98441b = inp0Var;
    }

    /* JADX INFO: renamed from: d */
    public View m122334d() {
        return this.f98440a;
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f98440a.m74914f();
    }

    /* JADX INFO: renamed from: i */
    public void m122335i(List<BLiveHourLeaderBoardItem> list) {
        this.f98440a.m74916h(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m122336j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f98440a.m74918j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m122337k(List<BLiveCurrentHourNotices> list) {
        WeekLeaderBoardContentView weekLeaderBoardContentView = this.f98440a;
        weekLeaderBoardContentView.m74917i(list, weekLeaderBoardContentView.f50735a.getCheckedRadioButtonId() == this.f98440a.f50736b.getId());
    }

    /* JADX INFO: renamed from: l */
    public void m122338l() {
        this.f98440a.m74913e(this.f98441b);
        this.f98440a.m74915g(true);
        this.f98440a.f50736b.setText("本周榜单");
        this.f98440a.f50737c.setText("上周榜单");
        this.f98440a.f50735a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.dnp0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f87089a.m122331e(radioGroup, i);
            }
        });
        this.f98440a.f50738d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.enp0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f92333a.m122332f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m122339m() {
        this.f98440a.f50738d.setRefreshing(false);
    }
}
