package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;
import l.j760;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q90 extends sh2 {

    /* JADX INFO: renamed from: d */
    public boolean f17862d;

    /* JADX INFO: renamed from: e */
    public boolean f17863e;

    /* JADX INFO: renamed from: g */
    public int f17865g;

    /* JADX INFO: renamed from: f */
    public long f17864f = 0;

    /* JADX INFO: renamed from: h */
    public boolean f17866h = false;

    public q90(boolean z, boolean z2) {
        this.f17862d = z;
        this.f17863e = z2;
    }

    @Override // p002l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo14986e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        String str;
        String str2;
        this.f17866h = false;
        if (!this.f17862d && !this.f17863e) {
            int size = list.size();
            LiveMessage liveMessage2 = size != 0 ? list.get(size - 1) : null;
            if (liveMessage2 != null && liveMessage2.extInfo != null && liveMessage.extInfo != null && System.currentTimeMillis() - this.f17864f < 5000 && (str = liveMessage.extInfo.followUserId) != null && !str.equals(ypv.a.D0()) && (str2 = liveMessage2.extInfo.followUserId) != null && !str2.equals(ypv.a.D0()) && this.f17865g < ypv.k().l5() && "live.room.enter".equals(liveMessage2.extInfo.msgName) && "live.room.enter".equals(liveMessage.extInfo.msgName)) {
                this.f17864f = System.currentTimeMillis();
                int i = size - 1;
                liveMessage.setLayoutId(list.get(i).layoutId);
                list.set(i, liveMessage);
                this.f17865g++;
                this.f17866h = true;
                return list;
            }
            this.f17864f = System.currentTimeMillis();
            this.f17865g = 0;
        }
        return list;
    }

    @Override // p002l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo14987f() {
        return this.f17866h;
    }
}
