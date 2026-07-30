package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveType;

/* JADX INFO: loaded from: classes13.dex */
public class ifu {
    /* JADX INFO: renamed from: a */
    public static String m139749a(String str) {
        return (!TextUtils.equals(str, "live") && TextUtils.equals(str, BLiveAbsData.VOICE_LIVE)) ? BLiveType.voiceLive : "live";
    }
}
