package p153l;

import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveBoardHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d36 {

    /* JADX INFO: renamed from: a */
    public LivingUsers<C16429b> f84863a;

    /* JADX INFO: renamed from: l.d36$a */
    public static class C16428a {

        /* JADX INFO: renamed from: a */
        public boolean f84864a;

        /* JADX INFO: renamed from: b */
        public BLiveEnvelope f84865b;

        /* JADX INFO: renamed from: c */
        public d36 m113794c() {
            return new d36(this);
        }

        /* JADX INFO: renamed from: d */
        public C16428a m113795d(BLiveEnvelope bLiveEnvelope) {
            this.f84865b = bLiveEnvelope;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16428a m113796e(boolean z) {
            this.f84864a = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.d36$b */
    public static class C16429b {

        /* JADX INFO: renamed from: a */
        public String f84866a;

        /* JADX INFO: renamed from: b */
        public BLiveLeaderboardRecord f84867b;

        /* JADX INFO: renamed from: c */
        public BLiveBoardHierarchy f84868c;

        /* JADX INFO: renamed from: d */
        public BLiveLeaderboardUser f84869d;
    }

    public d36(C16428a c16428a) {
        this.f84863a = new LivingUsers<>();
        if (c16428a.f84865b != null) {
            m113791f(c16428a.f84865b, c16428a.f84864a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveBoardHierarchy m113786a(BLiveBoardHierarchy bLiveBoardHierarchy) {
        return bLiveBoardHierarchy;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveLeaderboardUser m113788c(BLiveLeaderboardUser bLiveLeaderboardUser) {
        return bLiveLeaderboardUser;
    }

    /* JADX INFO: renamed from: e */
    public LivingUsers<C16429b> m113790e() {
        return this.f84863a;
    }

    /* JADX INFO: renamed from: f */
    public final void m113791f(BLiveEnvelope bLiveEnvelope, boolean z) {
        if (jyb.m147479J(bLiveEnvelope.data.records)) {
            return;
        }
        HashMap<String, BLiveUserMask> mapM205186k = w6o0.m205186k(bLiveEnvelope);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (!jyb.m147479J(bLiveEnvelope.data.hierarchies)) {
            map2 = jyb.m147502d(bLiveEnvelope.data.hierarchies, new qcj() { // from class: l.z26
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBoardHierarchy) obj).userId;
                }
            }, new qcj() { // from class: l.a36
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return d36.m113786a((BLiveBoardHierarchy) obj);
                }
            });
        }
        if (!jyb.m147479J(bLiveEnvelope.data.leaderboardUsers)) {
            map = jyb.m147502d(bLiveEnvelope.data.leaderboardUsers, new qcj() { // from class: l.b36
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveLeaderboardUser) obj).userId;
                }
            }, new qcj() { // from class: l.c36
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return d36.m113788c((BLiveLeaderboardUser) obj);
                }
            });
        }
        this.f84863a = new LivingUsers<>();
        for (BLiveLeaderboardRecord bLiveLeaderboardRecord : bLiveEnvelope.data.records) {
            C16429b c16429b = new C16429b();
            String str = bLiveLeaderboardRecord.owner.f45267id;
            c16429b.f84866a = str;
            c16429b.f84867b = bLiveLeaderboardRecord;
            c16429b.f84868c = (BLiveBoardHierarchy) map2.get(str);
            c16429b.f84869d = (BLiveLeaderboardUser) map.get(c16429b.f84866a);
            LivingUsers<C16429b> livingUsers = this.f84863a;
            if (z) {
                nsv nsvVarM164636f = nsv.m164636f(c16429b);
                String str2 = c16429b.f84866a;
                livingUsers.add(nsvVarM164636f.m164639c(str2, mapM205186k.get(str2), true));
            } else {
                livingUsers.add(nsv.m164636f(c16429b).m164641e(mapM205186k.get(c16429b.f84866a)));
            }
        }
    }

    public d36() {
        this.f84863a = new LivingUsers<>();
        this.f84863a = new LivingUsers<>();
    }
}
