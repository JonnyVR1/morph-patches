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
public class n0c implements s7m<q0c> {

    /* JADX INFO: renamed from: a */
    public WeekLeaderBoardContentView f136490a;

    /* JADX INFO: renamed from: b */
    public q0c f136491b;

    public n0c(Act act) {
        this.f136490a = WeekLeaderBoardContentView.m74910c(act.inflater());
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
    public void mo21065i1(q0c q0cVar) {
        this.f136491b = q0cVar;
    }

    /* JADX INFO: renamed from: d */
    public View m157260d() {
        return this.f136490a;
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f136490a.m74914f();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m157261e(RadioGroup radioGroup, int i) {
        boolean z = i == g5c0.f100760N4;
        this.f136491b.m172318Y3(z ? "today" : "yesterday");
        xdl0.m208344M(this.f136490a.f50740f, z);
        this.f136490a.f50738d.setEnabled(z);
        this.f136490a.f50738d.setPadding(0, 0, 0, z ? t100.m186890d(82.0f) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m157262f() {
        this.f136491b.m172318Y3("today");
    }

    /* JADX INFO: renamed from: i */
    public void m157263i(List<BLiveHourLeaderBoardItem> list) {
        this.f136490a.m74916h(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m157264j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f136490a.m74918j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m157265k(List<BLiveCurrentHourNotices> list) {
        WeekLeaderBoardContentView weekLeaderBoardContentView = this.f136490a;
        weekLeaderBoardContentView.m74917i(list, weekLeaderBoardContentView.f50735a.getCheckedRadioButtonId() == this.f136490a.f50736b.getId());
    }

    /* JADX INFO: renamed from: l */
    public void m157266l() {
        this.f136490a.m74913e(this.f136491b);
        this.f136490a.m74915g(true);
        this.f136490a.f50736b.setText("今日榜单");
        this.f136490a.f50737c.setText("昨日榜单");
        this.f136490a.f50735a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.l0c
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f125485a.m157261e(radioGroup, i);
            }
        });
        this.f136490a.f50738d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.m0c
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f130729a.m157262f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m157267m() {
        this.f136490a.f50738d.setRefreshing(false);
    }
}
