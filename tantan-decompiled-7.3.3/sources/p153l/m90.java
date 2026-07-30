package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m90 extends zh2 {

    /* JADX INFO: renamed from: d */
    public boolean f135308d;

    /* JADX INFO: renamed from: e */
    public boolean f135309e;

    /* JADX INFO: renamed from: g */
    public int f135311g;

    /* JADX INFO: renamed from: f */
    public long f135310f = 0;

    /* JADX INFO: renamed from: h */
    public boolean f135312h = false;

    public m90(boolean z, boolean z2) {
        this.f135308d = z;
        this.f135309e = z2;
    }

    @Override // p153l.zh2
    /* JADX INFO: renamed from: e */
    public List<LiveMessage> mo100025e(LiveMessage liveMessage, List<LiveMessage> list, pf60<Integer, Integer> pf60Var) {
        String str;
        String str2;
        this.f135312h = false;
        if (!this.f135308d && !this.f135309e) {
            int size = list.size();
            LiveMessage liveMessage2 = size != 0 ? list.get(size - 1) : null;
            if (liveMessage2 != null && liveMessage2.extInfo != null && liveMessage.extInfo != null && System.currentTimeMillis() - this.f135310f < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && (str = liveMessage.extInfo.followUserId) != null && !str.equals(zrv.f205799a.m207631D0()) && (str2 = liveMessage2.extInfo.followUserId) != null && !str2.equals(zrv.f205799a.m207631D0()) && this.f135311g < zrv.m221193k().m203667l5() && "live.room.enter".equals(liveMessage2.extInfo.msgName) && "live.room.enter".equals(liveMessage.extInfo.msgName)) {
                this.f135310f = System.currentTimeMillis();
                int i = size - 1;
                liveMessage.setLayoutId(list.get(i).layoutId);
                list.set(i, liveMessage);
                this.f135311g++;
                this.f135312h = true;
                return list;
            }
            this.f135310f = System.currentTimeMillis();
            this.f135311g = 0;
        }
        return list;
    }

    @Override // p153l.zh2
    /* JADX INFO: renamed from: f */
    public boolean mo100026f() {
        return this.f135312h;
    }
}
