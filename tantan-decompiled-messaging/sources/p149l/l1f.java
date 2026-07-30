package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class l1f {
    /* JADX INFO: renamed from: a */
    public static boolean m148173a(Intent intent) {
        if (!NullChecker.m81303a(intent)) {
            return false;
        }
        Serializable serializableExtra = intent.getSerializableExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA);
        if (serializableExtra instanceof AudienceStartData) {
            return m148174b((AudienceStartData) serializableExtra, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m148174b(AudienceStartData audienceStartData, boolean z) {
        BLiveAbsData bLiveAbsData;
        if (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null) {
            return false;
        }
        if (ypv.f199493a == null) {
            hfw.m130790a("EnterRoomChecker", "livingRoomBridge is null");
            return true;
        }
        String strM199384z = bLiveAbsData.isVoiceLive() ? ypv.f199493a.m199384z(100001, audienceStartData.live.f44323id, z) : ypv.f199493a.m199302A(100002, z);
        hfw.m130790a("EnterRoomChecker", "isInterceptAudienceEnterRooms");
        return !MomentAllowForwardState.allow.equals(strM199384z);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m148175c() {
        String strM199302A = ypv.f199493a.m199302A(100018, false);
        hfw.m130790a("EnterRoomChecker", "isInterceptStartVideoLives");
        return !MomentAllowForwardState.allow.equals(strM199302A);
    }
}
