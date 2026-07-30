package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p1.mobile.putong.live.base.data.BLiveUserLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;
import l.e30;
import l.fld0;
import l.ggv;
import l.idv;
import l.mqv;
import l.vwb;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class far {

    /* JADX INFO: renamed from: a */
    public BLiveUserLeaderboard f10214a;

    /* JADX INFO: renamed from: b */
    public mqv<BLiveLeaderBoards> f10215b;

    /* JADX INFO: renamed from: c */
    public ArrayList<BLiveLeaderBoards> f10216c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, BLiveUserMask> f10217d = new HashMap<>();

    public far(BLiveEnvelope bLiveEnvelope, boolean z) {
        BLiveLeaderBoards bLiveLeaderBoards;
        BLiveLeaderBoards bLiveLeaderBoards2;
        User user;
        User user2;
        this.f10214a = z ? bLiveEnvelope.data.userWeekLeaderboard : bLiveEnvelope.data.userLeaderboard;
        if (!vwb.J(bLiveEnvelope.data.leaderboards)) {
            this.f10216c.addAll(bLiveEnvelope.data.leaderboards);
        }
        for (BLiveLeaderBoards bLiveLeaderBoards3 : this.f10216c) {
            bLiveLeaderBoards3.user = ((idv) ypv.l(fld0.b)).i(bLiveLeaderBoards3.owner);
            if (ypv.k().u7() && (user2 = bLiveLeaderBoards3.user) != null && user2.hierarchy != null) {
                bLiveLeaderBoards3.liveUserLevel = ((ggv) ypv.l(fld0.c)).v(bLiveLeaderBoards3.user.hierarchy.grade);
            }
        }
        if (!vwb.J(bLiveEnvelope.data.masks)) {
            vwb.z(bLiveEnvelope.data.masks, new e30() { // from class: l.dar
                public final void call(Object obj) {
                    this.f9149a.m13045g((BLiveUserMask) obj);
                }
            });
        }
        BLiveUserLeaderboard bLiveUserLeaderboard = this.f10214a;
        if (bLiveUserLeaderboard == null || (bLiveLeaderBoards = bLiveUserLeaderboard.currentLeaderboard) == null || TextUtils.isEmpty(bLiveLeaderBoards.owner)) {
            return;
        }
        this.f10214a.currentLeaderboard.user = ((idv) ypv.l(fld0.b)).i(this.f10214a.currentLeaderboard.owner);
        if (ypv.k().u7() && (user = (bLiveLeaderBoards2 = this.f10214a.currentLeaderboard).user) != null && user.hierarchy != null) {
            bLiveLeaderBoards2.liveUserLevel = ((ggv) ypv.l(fld0.c)).v(this.f10214a.currentLeaderboard.user.hierarchy.grade);
        }
        BLiveUserMask bLiveUserMask = this.f10217d.get(this.f10214a.currentLeaderboard.owner);
        BLiveUserLeaderboard bLiveUserLeaderboard2 = this.f10214a;
        if (bLiveUserMask != null) {
            this.f10215b = mqv.f(bLiveUserLeaderboard2.currentLeaderboard).e(this.f10217d.get(this.f10214a.currentLeaderboard.owner));
        } else {
            this.f10215b = mqv.f(bLiveUserLeaderboard2.currentLeaderboard);
        }
    }

    /* JADX INFO: renamed from: b */
    public mqv<BLiveLeaderBoards> m13040b() {
        return this.f10215b;
    }

    /* JADX INFO: renamed from: c */
    public LivingUsers<BLiveLeaderBoards> m13041c() {
        if (vwb.J(this.f10216c)) {
            return new LivingUsers<>();
        }
        if (this.f10217d.isEmpty()) {
            return LivingUsers.create(vwb.Q(this.f10216c, new w9j() { // from class: l.ear
                public final Object call(Object obj) {
                    return mqv.f((BLiveLeaderBoards) obj);
                }
            }));
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveLeaderBoards bLiveLeaderBoards : this.f10216c) {
            if (this.f10217d.get(bLiveLeaderBoards.owner) != null) {
                arrayList.add(mqv.f(bLiveLeaderBoards).e(this.f10217d.get(bLiveLeaderBoards.owner)));
            } else {
                arrayList.add(mqv.f(bLiveLeaderBoards));
            }
        }
        return LivingUsers.create(arrayList);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public ArrayList<BLiveLeaderBoards> m13042d() {
        return this.f10216c;
    }

    /* JADX INFO: renamed from: e */
    public BLiveUserMask m13043e(String str) {
        return this.f10217d.get(str);
    }

    /* JADX INFO: renamed from: f */
    public BLiveUserLeaderboard m13044f() {
        return this.f10214a;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m13045g(BLiveUserMask bLiveUserMask) {
        this.f10217d.put(bLiveUserMask.userId, bLiveUserMask);
    }

    public far() {
    }
}
