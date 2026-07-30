package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.WeekLeaderBoardContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import java.util.List;
import l.s7m;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fnp0 implements s7m<inp0> {

    /* JADX INFO: renamed from: a */
    public WeekLeaderBoardContentView f10538a;

    /* JADX INFO: renamed from: b */
    public inp0 f10539b;

    public fnp0(Act act) {
        this.f10538a = WeekLeaderBoardContentView.m8512c(act.inflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m13392e(RadioGroup radioGroup, int i) {
        boolean z = i == g5c0.f10910N4;
        this.f10539b.m15254Y3(z ? "currentWeek" : "lastWeek");
        xdl0.M(this.f10538a.f6782f, z);
        this.f10538a.f6780d.setEnabled(z);
        this.f10538a.f6780d.setPadding(0, 0, 0, z ? t100.d(82.0f) : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m13393f() {
        this.f10539b.m15254Y3("currentWeek");
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13394C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m13398i1(inp0 inp0Var) {
        this.f10539b = inp0Var;
    }

    /* JADX INFO: renamed from: d */
    public View m13396d() {
        return this.f10538a;
    }

    public void destroy() {
        this.f10538a.m8516f();
    }

    /* JADX INFO: renamed from: i */
    public void m13397i(List<BLiveHourLeaderBoardItem> list) {
        this.f10538a.m8518h(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m13399j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f10538a.m8520j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m13400k(List<BLiveCurrentHourNotices> list) {
        WeekLeaderBoardContentView weekLeaderBoardContentView = this.f10538a;
        weekLeaderBoardContentView.m8519i(list, weekLeaderBoardContentView.f6777a.getCheckedRadioButtonId() == this.f10538a.f6778b.getId());
    }

    /* JADX INFO: renamed from: l */
    public void m13401l() {
        this.f10538a.m8515e(this.f10539b);
        this.f10538a.m8517g(true);
        this.f10538a.f6778b.setText("本周榜单");
        this.f10538a.f6779c.setText("上周榜单");
        this.f10538a.f6777a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.dnp0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f9365a.m13392e(radioGroup, i);
            }
        });
        this.f10538a.f6780d.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: l.enp0
            /* JADX INFO: renamed from: q */
            public final void m12623q() {
                this.f9885a.m13393f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m13402m() {
        this.f10538a.f6780d.setRefreshing(false);
    }
}
