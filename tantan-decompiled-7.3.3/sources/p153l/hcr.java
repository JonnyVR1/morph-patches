package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class hcr {

    /* JADX INFO: renamed from: a */
    public BLiveUserLeaderboard f108731a;

    /* JADX INFO: renamed from: b */
    public nsv<BLiveLeaderBoards> f108732b;

    /* JADX INFO: renamed from: c */
    public ArrayList<BLiveLeaderBoards> f108733c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, BLiveUserMask> f108734d = new HashMap<>();

    public hcr(BLiveEnvelope bLiveEnvelope, boolean z) {
        BLiveLeaderBoards bLiveLeaderBoards;
        BLiveLeaderBoards bLiveLeaderBoards2;
        User user;
        User user2;
        this.f108731a = z ? bLiveEnvelope.data.userWeekLeaderboard : bLiveEnvelope.data.userLeaderboard;
        if (!jyb.m147479J(bLiveEnvelope.data.leaderboards)) {
            this.f108733c.addAll(bLiveEnvelope.data.leaderboards);
        }
        for (BLiveLeaderBoards bLiveLeaderBoards3 : this.f108733c) {
            bLiveLeaderBoards3.user = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(bLiveLeaderBoards3.owner);
            if (zrv.m221193k().m203746u7() && (user2 = bLiveLeaderBoards3.user) != null && user2.hierarchy != null) {
                bLiveLeaderBoards3.liveUserLevel = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveLeaderBoards3.user.hierarchy.grade);
            }
        }
        if (!jyb.m147479J(bLiveEnvelope.data.masks)) {
            jyb.m147537z(bLiveEnvelope.data.masks, new y20() { // from class: l.fcr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98256a.m134497g((BLiveUserMask) obj);
                }
            });
        }
        BLiveUserLeaderboard bLiveUserLeaderboard = this.f108731a;
        if (bLiveUserLeaderboard == null || (bLiveLeaderBoards = bLiveUserLeaderboard.currentLeaderboard) == null || TextUtils.isEmpty(bLiveLeaderBoards.owner)) {
            return;
        }
        this.f108731a.currentLeaderboard.user = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(this.f108731a.currentLeaderboard.owner);
        if (zrv.m221193k().m203746u7() && (user = (bLiveLeaderBoards2 = this.f108731a.currentLeaderboard).user) != null && user.hierarchy != null) {
            bLiveLeaderBoards2.liveUserLevel = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(this.f108731a.currentLeaderboard.user.hierarchy.grade);
        }
        BLiveUserMask bLiveUserMask = this.f108734d.get(this.f108731a.currentLeaderboard.owner);
        BLiveUserLeaderboard bLiveUserLeaderboard2 = this.f108731a;
        if (bLiveUserMask != null) {
            this.f108732b = nsv.m164636f(bLiveUserLeaderboard2.currentLeaderboard).m164641e(this.f108734d.get(this.f108731a.currentLeaderboard.owner));
        } else {
            this.f108732b = nsv.m164636f(bLiveUserLeaderboard2.currentLeaderboard);
        }
    }

    /* JADX INFO: renamed from: b */
    public nsv<BLiveLeaderBoards> m134492b() {
        return this.f108732b;
    }

    /* JADX INFO: renamed from: c */
    public LivingUsers<BLiveLeaderBoards> m134493c() {
        if (jyb.m147479J(this.f108733c)) {
            return new LivingUsers<>();
        }
        if (this.f108734d.isEmpty()) {
            return LivingUsers.create(jyb.m147486Q(this.f108733c, new gcr()));
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveLeaderBoards bLiveLeaderBoards : this.f108733c) {
            if (this.f108734d.get(bLiveLeaderBoards.owner) != null) {
                arrayList.add(nsv.m164636f(bLiveLeaderBoards).m164641e(this.f108734d.get(bLiveLeaderBoards.owner)));
            } else {
                arrayList.add(nsv.m164636f(bLiveLeaderBoards));
            }
        }
        return LivingUsers.create(arrayList);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public ArrayList<BLiveLeaderBoards> m134494d() {
        return this.f108733c;
    }

    /* JADX INFO: renamed from: e */
    public BLiveUserMask m134495e(String str) {
        return this.f108734d.get(str);
    }

    /* JADX INFO: renamed from: f */
    public BLiveUserLeaderboard m134496f() {
        return this.f108731a;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m134497g(BLiveUserMask bLiveUserMask) {
        this.f108734d.put(bLiveUserMask.userId, bLiveUserMask);
    }

    public hcr() {
    }
}
