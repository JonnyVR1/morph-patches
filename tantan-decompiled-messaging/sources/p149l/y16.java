package p149l;

import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveBoardHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y16 {

    /* JADX INFO: renamed from: a */
    public LivingUsers<C21278b> f195384a;

    /* JADX INFO: renamed from: l.y16$a */
    public static class C21277a {

        /* JADX INFO: renamed from: a */
        public boolean f195385a;

        /* JADX INFO: renamed from: b */
        public BLiveEnvelope f195386b;

        /* JADX INFO: renamed from: c */
        public y16 m212138c() {
            return new y16(this);
        }

        /* JADX INFO: renamed from: d */
        public C21277a m212139d(BLiveEnvelope bLiveEnvelope) {
            this.f195386b = bLiveEnvelope;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21277a m212140e(boolean z) {
            this.f195385a = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.y16$b */
    public static class C21278b {

        /* JADX INFO: renamed from: a */
        public String f195387a;

        /* JADX INFO: renamed from: b */
        public BLiveLeaderboardRecord f195388b;

        /* JADX INFO: renamed from: c */
        public BLiveBoardHierarchy f195389c;

        /* JADX INFO: renamed from: d */
        public BLiveLeaderboardUser f195390d;
    }

    public y16(C21277a c21277a) {
        this.f195384a = new LivingUsers<>();
        if (c21277a.f195386b != null) {
            m212135f(c21277a.f195386b, c21277a.f195385a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveBoardHierarchy m212130a(BLiveBoardHierarchy bLiveBoardHierarchy) {
        return bLiveBoardHierarchy;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveLeaderboardUser m212132c(BLiveLeaderboardUser bLiveLeaderboardUser) {
        return bLiveLeaderboardUser;
    }

    /* JADX INFO: renamed from: e */
    public LivingUsers<C21278b> m212134e() {
        return this.f195384a;
    }

    /* JADX INFO: renamed from: f */
    public final void m212135f(BLiveEnvelope bLiveEnvelope, boolean z) {
        if (vwb.m200296J(bLiveEnvelope.data.records)) {
            return;
        }
        HashMap<String, BLiveUserMask> mapM186524k = sxn0.m186524k(bLiveEnvelope);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (!vwb.m200296J(bLiveEnvelope.data.hierarchies)) {
            map2 = vwb.m200319d(bLiveEnvelope.data.hierarchies, new w9j() { // from class: l.u16
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBoardHierarchy) obj).userId;
                }
            }, new w9j() { // from class: l.v16
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return y16.m212130a((BLiveBoardHierarchy) obj);
                }
            });
        }
        if (!vwb.m200296J(bLiveEnvelope.data.leaderboardUsers)) {
            map = vwb.m200319d(bLiveEnvelope.data.leaderboardUsers, new w9j() { // from class: l.w16
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveLeaderboardUser) obj).userId;
                }
            }, new w9j() { // from class: l.x16
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return y16.m212132c((BLiveLeaderboardUser) obj);
                }
            });
        }
        this.f195384a = new LivingUsers<>();
        for (BLiveLeaderboardRecord bLiveLeaderboardRecord : bLiveEnvelope.data.records) {
            C21278b c21278b = new C21278b();
            String str = bLiveLeaderboardRecord.owner.f44419id;
            c21278b.f195387a = str;
            c21278b.f195388b = bLiveLeaderboardRecord;
            c21278b.f195389c = (BLiveBoardHierarchy) map2.get(str);
            c21278b.f195390d = (BLiveLeaderboardUser) map.get(c21278b.f195387a);
            LivingUsers<C21278b> livingUsers = this.f195384a;
            if (z) {
                mqv mqvVarM155998f = mqv.m155998f(c21278b);
                String str2 = c21278b.f195387a;
                livingUsers.add(mqvVarM155998f.m156001c(str2, mapM186524k.get(str2), true));
            } else {
                livingUsers.add(mqv.m155998f(c21278b).m156003e(mapM186524k.get(c21278b.f195387a)));
            }
        }
    }

    public y16() {
        this.f195384a = new LivingUsers<>();
        this.f195384a = new LivingUsers<>();
    }
}
