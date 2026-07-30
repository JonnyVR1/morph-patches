package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class njn0 {

    /* JADX INFO: renamed from: a */
    public ArrayList<BLiveLeaderBoards> f139298a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public HashMap<String, BLiveUserMask> f139299b = new HashMap<>();

    public njn0(BLiveEnvelope bLiveEnvelope) {
        User user;
        if (!vwb.m200296J(bLiveEnvelope.data.leaderboards)) {
            this.f139298a.addAll(bLiveEnvelope.data.leaderboards);
        }
        for (BLiveLeaderBoards bLiveLeaderBoards : this.f139298a) {
            bLiveLeaderBoards.user = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(bLiveLeaderBoards.owner);
            if (ypv.m215672k().m195959u7() && (user = bLiveLeaderBoards.user) != null && user.hierarchy != null) {
                bLiveLeaderBoards.liveUserLevel = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveLeaderBoards.user.hierarchy.grade);
            }
        }
        if (vwb.m200296J(bLiveEnvelope.data.masks)) {
            return;
        }
        vwb.m200354z(bLiveEnvelope.data.masks, new e30() { // from class: l.mjn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134220a.m159766e((BLiveUserMask) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public LivingUsers<BLiveLeaderBoards> m159763b(boolean z) {
        if (vwb.m200296J(this.f139298a)) {
            return new LivingUsers<>();
        }
        if (this.f139299b.isEmpty()) {
            return LivingUsers.create(vwb.m200303Q(this.f139298a, new ear()));
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveLeaderBoards bLiveLeaderBoards : this.f139298a) {
            if (this.f139299b.get(bLiveLeaderBoards.owner) != null) {
                mqv mqvVarM155998f = mqv.m155998f(bLiveLeaderBoards);
                String str = bLiveLeaderBoards.owner;
                arrayList.add(mqvVarM155998f.m156001c(str, this.f139299b.get(str), z));
            } else {
                arrayList.add(mqv.m155998f(bLiveLeaderBoards));
            }
        }
        return LivingUsers.create(arrayList);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public ArrayList<BLiveLeaderBoards> m159764c() {
        return this.f139298a;
    }

    /* JADX INFO: renamed from: d */
    public BLiveUserMask m159765d(String str) {
        return this.f139299b.get(str);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m159766e(BLiveUserMask bLiveUserMask) {
        this.f139299b.put(bLiveUserMask.userId, bLiveUserMask);
    }

    public njn0() {
    }
}
