package p149l;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class wd10 extends j5t<t310> {

    /* JADX INFO: renamed from: n */
    public RecyclerView.AbstractC0576n f185751n;

    /* JADX INFO: renamed from: o */
    public ud10 f185752o;

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m202698w(String str) {
        ((t310) this.f47706b).m187095W3(str);
    }

    /* JADX INFO: renamed from: x */
    public void m202699x(BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard, gm0 gm0Var, ud10 ud10Var) {
        String str;
        if (bLiveMultiPkLeaderboard.anchorName.length() >= 6) {
            bLiveMultiPkLeaderboard.anchorName = bLiveMultiPkLeaderboard.anchorName.substring(0, 6).concat("...");
        }
        this.f116343f.setText(String.format("%s的本场PK贡献榜", bLiveMultiPkLeaderboard.anchorName));
        String str2 = "暂无人助力";
        if (bLiveMultiPkLeaderboard.rank >= 0) {
            if (bLiveMultiPkLeaderboard.contributorNum > 0) {
                str2 = bLiveMultiPkLeaderboard.contributorNum + "人助力";
            }
            int i = bLiveMultiPkLeaderboard.rank;
            int i2 = bLiveMultiPkLeaderboard.gap;
            if (i == 1) {
                str = "·领先第2名" + x8u.m207433c(i2) + "PK值";
            } else {
                str = "·距第1名差" + x8u.m207433c(i2) + "PK值";
            }
            this.f116344g.setText(String.format("%s%s", str2, str));
        } else if (bLiveMultiPkLeaderboard.gap <= 0) {
            this.f116344g.setText("暂无人助力");
        } else {
            if (bLiveMultiPkLeaderboard.contributorNum > 0) {
                str2 = bLiveMultiPkLeaderboard.contributorNum + "人助力";
            }
            this.f116344g.setText(String.format("%s%s", str2, "·距第1名差" + x8u.m207433c(bLiveMultiPkLeaderboard.gap) + "PK值"));
        }
        List<BLiveMultiPkBoardUser> list = bLiveMultiPkLeaderboard.allLeaderboards;
        if (list == null || list.size() == 0) {
            this.f116347j.setVisibility(0);
            ud10 ud10Var2 = this.f185752o;
            if (ud10Var2 != null) {
                ud10Var2.m193115F();
            }
        } else {
            this.f185752o = ud10Var;
            ud10Var.m193118I(bLiveMultiPkLeaderboard.allLeaderboards, gm0Var, true);
            VRecyclerView vRecyclerView = this.f116346i;
            vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
            this.f116346i.setAdapter(ud10Var);
            if (this.f185751n == null) {
                n660 n660Var = new n660(1, t100.f167260i, t100.f167246U);
                this.f185751n = n660Var;
                this.f116346i.addItemDecoration(n660Var);
            }
            this.f116347j.setVisibility(8);
        }
        BLiveMultiPkBoardUser bLiveMultiPkBoardUser = bLiveMultiPkLeaderboard.currentLeaderboard;
        MultiCallPkBoardItemView multiCallPkBoardItemView = this.f116350m;
        if (bLiveMultiPkBoardUser == null) {
            multiCallPkBoardItemView.setVisibility(8);
            this.f116348k.setVisibility(8);
            this.f116349l.setVisibility(8);
        } else {
            multiCallPkBoardItemView.m75876l0(new e30() { // from class: l.vd10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181009a.m202698w((String) obj);
                }
            }, bLiveMultiPkLeaderboard.currentLeaderboard, gm0Var);
            this.f116350m.setVisibility(0);
            this.f116348k.setVisibility(0);
            this.f116349l.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m202700y() {
        ud10 ud10Var = this.f185752o;
        if (ud10Var != null) {
            ud10Var.m193115F();
        }
        this.f116350m.setVisibility(8);
        this.f116348k.setVisibility(8);
        this.f116349l.setVisibility(8);
        this.f116347j.setVisibility(0);
    }
}
