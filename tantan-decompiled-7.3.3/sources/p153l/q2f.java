package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class q2f {
    /* JADX INFO: renamed from: a */
    public static boolean m175024a(Intent intent) {
        if (!NullChecker.m82486a(intent)) {
            return false;
        }
        Serializable serializableExtra = intent.getSerializableExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA);
        if (serializableExtra instanceof AudienceStartData) {
            return m175025b((AudienceStartData) serializableExtra, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m175025b(AudienceStartData audienceStartData, boolean z) {
        BLiveAbsData bLiveAbsData;
        if (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null) {
            return false;
        }
        if (zrv.f205799a == null) {
            fhw.m125605a("EnterRoomChecker", "livingRoomBridge is null");
            return true;
        }
        String strM207706z = bLiveAbsData.isVoiceLive() ? zrv.f205799a.m207706z(100001, audienceStartData.live.f45171id, z) : zrv.f205799a.m207624A(100002, z);
        fhw.m125605a("EnterRoomChecker", "isInterceptAudienceEnterRooms");
        return !MomentAllowForwardState.allow.equals(strM207706z);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m175026c() {
        String strM207624A = zrv.f205799a.m207624A(100018, false);
        fhw.m125605a("EnterRoomChecker", "isInterceptStartVideoLives");
        return !MomentAllowForwardState.allow.equals(strM207624A);
    }
}
