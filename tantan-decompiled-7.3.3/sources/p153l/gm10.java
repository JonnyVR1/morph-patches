package p153l;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class gm10 extends k7t<dc10> {

    /* JADX INFO: renamed from: n */
    public RecyclerView.AbstractC0578n f104907n;

    /* JADX INFO: renamed from: o */
    public em10 f104908o;

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m130723w(String str) {
        ((dc10) this.f48554b).m115203W3(str);
    }

    /* JADX INFO: renamed from: x */
    public void m130724x(BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard, cm0 cm0Var, em10 em10Var) {
        String str;
        if (bLiveMultiPkLeaderboard.anchorName.length() >= 6) {
            bLiveMultiPkLeaderboard.anchorName = bLiveMultiPkLeaderboard.anchorName.substring(0, 6).concat("...");
        }
        this.f124292f.setText(String.format("%s的本场PK贡献榜", bLiveMultiPkLeaderboard.anchorName));
        String str2 = "暂无人助力";
        if (bLiveMultiPkLeaderboard.rank >= 0) {
            if (bLiveMultiPkLeaderboard.contributorNum > 0) {
                str2 = bLiveMultiPkLeaderboard.contributorNum + "人助力";
            }
            int i = bLiveMultiPkLeaderboard.rank;
            int i2 = bLiveMultiPkLeaderboard.gap;
            if (i == 1) {
                str = "·领先第2名" + yau.m214935c(i2) + "PK值";
            } else {
                str = "·距第1名差" + yau.m214935c(i2) + "PK值";
            }
            this.f124293g.setText(String.format("%s%s", str2, str));
        } else if (bLiveMultiPkLeaderboard.gap <= 0) {
            this.f124293g.setText("暂无人助力");
        } else {
            if (bLiveMultiPkLeaderboard.contributorNum > 0) {
                str2 = bLiveMultiPkLeaderboard.contributorNum + "人助力";
            }
            this.f124293g.setText(String.format("%s%s", str2, "·距第1名差" + yau.m214935c(bLiveMultiPkLeaderboard.gap) + "PK值"));
        }
        List<BLiveMultiPkBoardUser> list = bLiveMultiPkLeaderboard.allLeaderboards;
        if (list == null || list.size() == 0) {
            this.f124296j.setVisibility(0);
            em10 em10Var2 = this.f104908o;
            if (em10Var2 != null) {
                em10Var2.m121312F();
            }
        } else {
            this.f104908o = em10Var;
            em10Var.m121315I(bLiveMultiPkLeaderboard.allLeaderboards, cm0Var, true);
            VRecyclerView vRecyclerView = this.f124295i;
            vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
            this.f124295i.setAdapter(em10Var);
            if (this.f104907n == null) {
                te60 te60Var = new te60(1, qa00.f156322i, qa00.f156308U);
                this.f104907n = te60Var;
                this.f124295i.addItemDecoration(te60Var);
            }
            this.f124296j.setVisibility(8);
        }
        BLiveMultiPkBoardUser bLiveMultiPkBoardUser = bLiveMultiPkLeaderboard.currentLeaderboard;
        MultiCallPkBoardItemView multiCallPkBoardItemView = this.f124299m;
        if (bLiveMultiPkBoardUser == null) {
            multiCallPkBoardItemView.setVisibility(8);
            this.f124297k.setVisibility(8);
            this.f124298l.setVisibility(8);
        } else {
            multiCallPkBoardItemView.m77059l0(new y20() { // from class: l.fm10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99709a.m130723w((String) obj);
                }
            }, bLiveMultiPkLeaderboard.currentLeaderboard, cm0Var);
            this.f124299m.setVisibility(0);
            this.f124297k.setVisibility(0);
            this.f124298l.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m130725y() {
        em10 em10Var = this.f104908o;
        if (em10Var != null) {
            em10Var.m121312F();
        }
        this.f124299m.setVisibility(8);
        this.f124297k.setVisibility(8);
        this.f124298l.setVisibility(8);
        this.f124296j.setVisibility(0);
    }
}
