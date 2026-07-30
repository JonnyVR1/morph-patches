package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class rsn0 {

    /* JADX INFO: renamed from: a */
    public ArrayList<BLiveLeaderBoards> f164706a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public HashMap<String, BLiveUserMask> f164707b = new HashMap<>();

    public rsn0(BLiveEnvelope bLiveEnvelope) {
        User user;
        if (!jyb.m147479J(bLiveEnvelope.data.leaderboards)) {
            this.f164706a.addAll(bLiveEnvelope.data.leaderboards);
        }
        for (BLiveLeaderBoards bLiveLeaderBoards : this.f164706a) {
            bLiveLeaderBoards.user = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(bLiveLeaderBoards.owner);
            if (zrv.m221193k().m203746u7() && (user = bLiveLeaderBoards.user) != null && user.hierarchy != null) {
                bLiveLeaderBoards.liveUserLevel = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveLeaderBoards.user.hierarchy.grade);
            }
        }
        if (jyb.m147479J(bLiveEnvelope.data.masks)) {
            return;
        }
        jyb.m147537z(bLiveEnvelope.data.masks, new y20() { // from class: l.qsn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159342a.m183022e((BLiveUserMask) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public LivingUsers<BLiveLeaderBoards> m183019b(boolean z) {
        if (jyb.m147479J(this.f164706a)) {
            return new LivingUsers<>();
        }
        if (this.f164707b.isEmpty()) {
            return LivingUsers.create(jyb.m147486Q(this.f164706a, new gcr()));
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveLeaderBoards bLiveLeaderBoards : this.f164706a) {
            if (this.f164707b.get(bLiveLeaderBoards.owner) != null) {
                nsv nsvVarM164636f = nsv.m164636f(bLiveLeaderBoards);
                String str = bLiveLeaderBoards.owner;
                arrayList.add(nsvVarM164636f.m164639c(str, this.f164707b.get(str), z));
            } else {
                arrayList.add(nsv.m164636f(bLiveLeaderBoards));
            }
        }
        return LivingUsers.create(arrayList);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public ArrayList<BLiveLeaderBoards> m183020c() {
        return this.f164706a;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUserMask m183021d(String str) {
        return this.f164707b.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m183022e(BLiveUserMask bLiveUserMask) {
        this.f164707b.put(bLiveUserMask.userId, bLiveUserMask);
    }

    public rsn0() {
    }
}
