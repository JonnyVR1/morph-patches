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
public class a2c implements iam<d2c> {

    /* JADX INFO: renamed from: a */
    public WeekLeaderBoardContentView f67948a;

    /* JADX INFO: renamed from: b */
    public d2c f67949b;

    public a2c(Act act) {
        this.f67948a = WeekLeaderBoardContentView.m76093c(act.inflater());
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
    public void mo22064i1(d2c d2cVar) {
        this.f67949b = d2cVar;
    }

    /* JADX INFO: renamed from: d */
    public View m95622d() {
        return this.f67948a;
    }

    @Override // p153l.iam
    public void destroy() {
        this.f67948a.m76097f();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m95623e(RadioGroup radioGroup, int i) {
        boolean z = i == mdc0.f136005N4;
        this.f67949b.m113683Y3(z ? "today" : "yesterday");
        bnl0.m105524M(this.f67948a.f51588f, z);
        this.f67948a.f51586d.setEnabled(z);
        this.f67948a.f51586d.setPadding(0, 0, 0, z ? qa00.m175859d(82.0f) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m95624f() {
        this.f67949b.m113683Y3("today");
    }

    /* JADX INFO: renamed from: i */
    public void m95625i(List<BLiveHourLeaderBoardItem> list) {
        this.f67948a.m76099h(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m95626j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f67948a.m76101j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m95627k(List<BLiveCurrentHourNotices> list) {
        WeekLeaderBoardContentView weekLeaderBoardContentView = this.f67948a;
        weekLeaderBoardContentView.m76100i(list, weekLeaderBoardContentView.f51583a.getCheckedRadioButtonId() == this.f67948a.f51584b.getId());
    }

    /* JADX INFO: renamed from: l */
    public void m95628l() {
        this.f67948a.m76096e(this.f67949b);
        this.f67948a.m76098g(true);
        this.f67948a.f51584b.setText("今日榜单");
        this.f67948a.f51585c.setText("昨日榜单");
        this.f67948a.f51583a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.y1c
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f197092a.m95623e(radioGroup, i);
            }
        });
        this.f67948a.f51586d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.z1c
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f202501a.m95624f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m95629m() {
        this.f67948a.f51586d.setRefreshing(false);
    }
}
