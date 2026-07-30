package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class far {

    /* JADX INFO: renamed from: a */
    public BLiveUserLeaderboard f96652a;

    /* JADX INFO: renamed from: b */
    public mqv<BLiveLeaderBoards> f96653b;

    /* JADX INFO: renamed from: c */
    public ArrayList<BLiveLeaderBoards> f96654c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, BLiveUserMask> f96655d = new HashMap<>();

    public far(BLiveEnvelope bLiveEnvelope, boolean z) {
        BLiveLeaderBoards bLiveLeaderBoards;
        BLiveLeaderBoards bLiveLeaderBoards2;
        User user;
        User user2;
        this.f96652a = z ? bLiveEnvelope.data.userWeekLeaderboard : bLiveEnvelope.data.userLeaderboard;
        if (!vwb.m200296J(bLiveEnvelope.data.leaderboards)) {
            this.f96654c.addAll(bLiveEnvelope.data.leaderboards);
        }
        for (BLiveLeaderBoards bLiveLeaderBoards3 : this.f96654c) {
            bLiveLeaderBoards3.user = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(bLiveLeaderBoards3.owner);
            if (ypv.m215672k().m195959u7() && (user2 = bLiveLeaderBoards3.user) != null && user2.hierarchy != null) {
                bLiveLeaderBoards3.liveUserLevel = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveLeaderBoards3.user.hierarchy.grade);
            }
        }
        if (!vwb.m200296J(bLiveEnvelope.data.masks)) {
            vwb.m200354z(bLiveEnvelope.data.masks, new e30() { // from class: l.dar
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f85257a.m120303g((BLiveUserMask) obj);
                }
            });
        }
        BLiveUserLeaderboard bLiveUserLeaderboard = this.f96652a;
        if (bLiveUserLeaderboard == null || (bLiveLeaderBoards = bLiveUserLeaderboard.currentLeaderboard) == null || TextUtils.isEmpty(bLiveLeaderBoards.owner)) {
            return;
        }
        this.f96652a.currentLeaderboard.user = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(this.f96652a.currentLeaderboard.owner);
        if (ypv.m215672k().m195959u7() && (user = (bLiveLeaderBoards2 = this.f96652a.currentLeaderboard).user) != null && user.hierarchy != null) {
            bLiveLeaderBoards2.liveUserLevel = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(this.f96652a.currentLeaderboard.user.hierarchy.grade);
        }
        BLiveUserMask bLiveUserMask = this.f96655d.get(this.f96652a.currentLeaderboard.owner);
        BLiveUserLeaderboard bLiveUserLeaderboard2 = this.f96652a;
        if (bLiveUserMask != null) {
            this.f96653b = mqv.m155998f(bLiveUserLeaderboard2.currentLeaderboard).m156003e(this.f96655d.get(this.f96652a.currentLeaderboard.owner));
        } else {
            this.f96653b = mqv.m155998f(bLiveUserLeaderboard2.currentLeaderboard);
        }
    }

    /* JADX INFO: renamed from: b */
    public mqv<BLiveLeaderBoards> m120298b() {
        return this.f96653b;
    }

    /* JADX INFO: renamed from: c */
    public LivingUsers<BLiveLeaderBoards> m120299c() {
        if (vwb.m200296J(this.f96654c)) {
            return new LivingUsers<>();
        }
        if (this.f96655d.isEmpty()) {
            return LivingUsers.create(vwb.m200303Q(this.f96654c, new ear()));
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveLeaderBoards bLiveLeaderBoards : this.f96654c) {
            if (this.f96655d.get(bLiveLeaderBoards.owner) != null) {
                arrayList.add(mqv.m155998f(bLiveLeaderBoards).m156003e(this.f96655d.get(bLiveLeaderBoards.owner)));
            } else {
                arrayList.add(mqv.m155998f(bLiveLeaderBoards));
            }
        }
        return LivingUsers.create(arrayList);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public ArrayList<BLiveLeaderBoards> m120300d() {
        return this.f96654c;
    }

    /* JADX INFO: renamed from: e */
    public BLiveUserMask m120301e(String str) {
        return this.f96655d.get(str);
    }

    /* JADX INFO: renamed from: f */
    public BLiveUserLeaderboard m120302f() {
        return this.f96652a;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m120303g(BLiveUserMask bLiveUserMask) {
        this.f96655d.put(bLiveUserMask.userId, bLiveUserMask);
    }

    public far() {
    }
}
