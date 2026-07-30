package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class q90 extends sh2 {

    /* JADX INFO: renamed from: d */
    public boolean f153347d;

    /* JADX INFO: renamed from: e */
    public boolean f153348e;

    /* JADX INFO: renamed from: g */
    public int f153350g;

    /* JADX INFO: renamed from: f */
    public long f153349f = 0;

    /* JADX INFO: renamed from: h */
    public boolean f153351h = false;

    public q90(boolean z, boolean z2) {
        this.f153347d = z;
        this.f153348e = z2;
    }

    @Override // p149l.sh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo134048e(LiveMessage liveMessage, List<LiveMessage> list, j760<Integer, Integer> j760Var) {
        String str;
        String str2;
        this.f153351h = false;
        if (!this.f153347d && !this.f153348e) {
            int size = list.size();
            LiveMessage liveMessage2 = size != 0 ? list.get(size - 1) : null;
            if (liveMessage2 != null && liveMessage2.extInfo != null && liveMessage.extInfo != null && System.currentTimeMillis() - this.f153349f < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && (str = liveMessage.extInfo.followUserId) != null && !str.equals(ypv.f199493a.m199309D0()) && (str2 = liveMessage2.extInfo.followUserId) != null && !str2.equals(ypv.f199493a.m199309D0()) && this.f153350g < ypv.m215672k().m195880l5() && "live.room.enter".equals(liveMessage2.extInfo.msgName) && "live.room.enter".equals(liveMessage.extInfo.msgName)) {
                this.f153349f = System.currentTimeMillis();
                int i = size - 1;
                liveMessage.setLayoutId(list.get(i).layoutId);
                list.set(i, liveMessage);
                this.f153350g++;
                this.f153351h = true;
                return list;
            }
            this.f153349f = System.currentTimeMillis();
            this.f153350g = 0;
        }
        return list;
    }

    @Override // p149l.sh2
    /* JADX INFO: renamed from: f */
    public boolean mo134049f() {
        return this.f153351h;
    }
}
