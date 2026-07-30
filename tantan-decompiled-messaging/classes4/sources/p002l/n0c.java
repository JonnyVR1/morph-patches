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
public class n0c implements s7m<q0c> {

    /* JADX INFO: renamed from: a */
    public WeekLeaderBoardContentView f15767a;

    /* JADX INFO: renamed from: b */
    public q0c f15768b;

    public n0c(Act act) {
        this.f15767a = WeekLeaderBoardContentView.m8512c(act.inflater());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18331C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m18337i1(q0c q0cVar) {
        this.f15768b = q0cVar;
    }

    /* JADX INFO: renamed from: d */
    public View m18333d() {
        return this.f15767a;
    }

    public void destroy() {
        this.f15767a.m8516f();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m18334e(RadioGroup radioGroup, int i) {
        boolean z = i == g5c0.f10910N4;
        this.f15768b.m20773Y3(z ? "today" : "yesterday");
        xdl0.M(this.f15767a.f6782f, z);
        this.f15767a.f6780d.setEnabled(z);
        this.f15767a.f6780d.setPadding(0, 0, 0, z ? t100.d(82.0f) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m18335f() {
        this.f15768b.m20773Y3("today");
    }

    /* JADX INFO: renamed from: i */
    public void m18336i(List<BLiveHourLeaderBoardItem> list) {
        this.f15767a.m8518h(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m18338j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f15767a.m8520j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m18339k(List<BLiveCurrentHourNotices> list) {
        WeekLeaderBoardContentView weekLeaderBoardContentView = this.f15767a;
        weekLeaderBoardContentView.m8519i(list, weekLeaderBoardContentView.f6777a.getCheckedRadioButtonId() == this.f15767a.f6778b.getId());
    }

    /* JADX INFO: renamed from: l */
    public void m18340l() {
        this.f15767a.m8515e(this.f15768b);
        this.f15767a.m8517g(true);
        this.f15767a.f6778b.setText("今日榜单");
        this.f15767a.f6779c.setText("昨日榜单");
        this.f15767a.f6777a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.l0c
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f14635a.m18334e(radioGroup, i);
            }
        });
        this.f15767a.f6780d.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: l.m0c
            /* JADX INFO: renamed from: q */
            public final void m17640q() {
                this.f15190a.m18335f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m18341m() {
        this.f15767a.f6780d.setRefreshing(false);
    }
}
