package p002l;

import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveBoardHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.HashMap;
import l.mqv;
import l.sxn0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public final class y16 {

    /* JADX INFO: renamed from: a */
    public LivingUsers<C0904b> f22597a;

    /* JADX INFO: renamed from: l.y16$a */
    public static class C0903a {

        /* JADX INFO: renamed from: a */
        public boolean f22598a;

        /* JADX INFO: renamed from: b */
        public BLiveEnvelope f22599b;

        /* JADX INFO: renamed from: c */
        public y16 m26298c() {
            return new y16(this);
        }

        /* JADX INFO: renamed from: d */
        public C0903a m26299d(BLiveEnvelope bLiveEnvelope) {
            this.f22599b = bLiveEnvelope;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0903a m26300e(boolean z) {
            this.f22598a = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.y16$b */
    public static class C0904b {

        /* JADX INFO: renamed from: a */
        public String f22600a;

        /* JADX INFO: renamed from: b */
        public BLiveLeaderboardRecord f22601b;

        /* JADX INFO: renamed from: c */
        public BLiveBoardHierarchy f22602c;

        /* JADX INFO: renamed from: d */
        public BLiveLeaderboardUser f22603d;
    }

    public y16(C0903a c0903a) {
        this.f22597a = new LivingUsers<>();
        if (c0903a.f22599b != null) {
            m26295f(c0903a.f22599b, c0903a.f22598a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveBoardHierarchy m26290a(BLiveBoardHierarchy bLiveBoardHierarchy) {
        return bLiveBoardHierarchy;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveLeaderboardUser m26292c(BLiveLeaderboardUser bLiveLeaderboardUser) {
        return bLiveLeaderboardUser;
    }

    /* JADX INFO: renamed from: e */
    public LivingUsers<C0904b> m26294e() {
        return this.f22597a;
    }

    /* JADX INFO: renamed from: f */
    public final void m26295f(BLiveEnvelope bLiveEnvelope, boolean z) {
        if (vwb.J(bLiveEnvelope.data.records)) {
            return;
        }
        HashMap mapK = sxn0.k(bLiveEnvelope);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (!vwb.J(bLiveEnvelope.data.hierarchies)) {
            map2 = vwb.d(bLiveEnvelope.data.hierarchies, new w9j() { // from class: l.u16
                public final Object call(Object obj) {
                    return ((BLiveBoardHierarchy) obj).userId;
                }
            }, new w9j() { // from class: l.v16
                public final Object call(Object obj) {
                    return y16.m26290a((BLiveBoardHierarchy) obj);
                }
            });
        }
        if (!vwb.J(bLiveEnvelope.data.leaderboardUsers)) {
            map = vwb.d(bLiveEnvelope.data.leaderboardUsers, new w9j() { // from class: l.w16
                public final Object call(Object obj) {
                    return ((BLiveLeaderboardUser) obj).userId;
                }
            }, new w9j() { // from class: l.x16
                public final Object call(Object obj) {
                    return y16.m26292c((BLiveLeaderboardUser) obj);
                }
            });
        }
        this.f22597a = new LivingUsers<>();
        for (BLiveLeaderboardRecord bLiveLeaderboardRecord : bLiveEnvelope.data.records) {
            C0904b c0904b = new C0904b();
            String str = bLiveLeaderboardRecord.owner.id;
            c0904b.f22600a = str;
            c0904b.f22601b = bLiveLeaderboardRecord;
            c0904b.f22602c = (BLiveBoardHierarchy) map2.get(str);
            c0904b.f22603d = (BLiveLeaderboardUser) map.get(c0904b.f22600a);
            LivingUsers<C0904b> livingUsers = this.f22597a;
            if (z) {
                mqv mqvVarF = mqv.f(c0904b);
                String str2 = c0904b.f22600a;
                livingUsers.add(mqvVarF.c(str2, (BLiveUserMask) mapK.get(str2), true));
            } else {
                livingUsers.add(mqv.f(c0904b).e((BLiveUserMask) mapK.get(c0904b.f22600a)));
            }
        }
    }

    public y16() {
        this.f22597a = new LivingUsers<>();
        this.f22597a = new LivingUsers<>();
    }
}
