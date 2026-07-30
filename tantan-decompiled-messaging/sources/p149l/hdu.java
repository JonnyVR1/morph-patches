package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveType;

/* JADX INFO: loaded from: classes13.dex */
public class hdu {
    /* JADX INFO: renamed from: a */
    public static String m130613a(String str) {
        return (!TextUtils.equals(str, "live") && TextUtils.equals(str, BLiveAbsData.VOICE_LIVE)) ? BLiveType.voiceLive : "live";
    }
}
