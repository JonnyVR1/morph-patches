package p002l;

import android.content.Intent;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.NullChecker;
import l.hfw;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l1f {
    /* JADX INFO: renamed from: a */
    public static boolean m16934a(Intent intent) {
        if (!NullChecker.a(intent)) {
            return false;
        }
        AudienceStartData serializableExtra = intent.getSerializableExtra("LIVE_AUDIENCE_START_DATA");
        if (serializableExtra instanceof AudienceStartData) {
            return m16935b(serializableExtra, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16935b(AudienceStartData audienceStartData, boolean z) {
        BLiveAbsData bLiveAbsData;
        if (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null) {
            return false;
        }
        if (ypv.a == null) {
            hfw.a("EnterRoomChecker", "livingRoomBridge is null");
            return true;
        }
        String strZ = bLiveAbsData.isVoiceLive() ? ypv.a.z(100001, audienceStartData.live.id, z) : ypv.a.A(100002, z);
        hfw.a("EnterRoomChecker", "isInterceptAudienceEnterRooms");
        return !"allow".equals(strZ);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16936c() {
        String strA = ypv.a.A(100018, false);
        hfw.a("EnterRoomChecker", "isInterceptStartVideoLives");
        return !"allow".equals(strA);
    }
}
