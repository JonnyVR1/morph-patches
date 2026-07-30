package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowInfo;

/* JADX INFO: loaded from: classes4.dex */
public class t7t {
    /* JADX INFO: renamed from: a */
    public static boolean m187501a(BLiveAbsData bLiveAbsData) {
        BLiveOfficialShowInfo bLiveOfficialShowInfo;
        return (bLiveAbsData == null || !(bLiveAbsData instanceof BLive) || (bLiveOfficialShowInfo = ((BLive) bLiveAbsData).officialShowLiveInfo) == null || TextUtils.isEmpty(bLiveOfficialShowInfo.showLiveId)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m187502b(BLiveAbsData bLiveAbsData) {
        BLiveOfficialShowInfo bLiveOfficialShowInfo;
        if ((bLiveAbsData instanceof BLive) && (bLiveOfficialShowInfo = ((BLive) bLiveAbsData).officialShowLiveInfo) != null) {
            return bLiveOfficialShowInfo.showLiveId;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m187503c(ho2 ho2Var) {
        return ho2Var.m132069I0().m218720g();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m187504d(BLiveAbsData bLiveAbsData) {
        return bLiveAbsData != null && TextUtils.equals("officialShow", bLiveAbsData.liveMode);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m187505e(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData != null && (bLiveAbsData instanceof BLive)) {
            BLive bLive = (BLive) bLiveAbsData;
            BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = bLive.officialShowCurrentAnchorInfo;
            if (bLiveOfficialShowCurrentAnchorInfo != null && !TextUtils.isEmpty(bLiveOfficialShowCurrentAnchorInfo.showId)) {
                return true;
            }
            BLiveOfficialShowInfo bLiveOfficialShowInfo = bLive.officialShowLiveInfo;
            if (bLiveOfficialShowInfo != null && !TextUtils.isEmpty(bLiveOfficialShowInfo.showLiveId)) {
                return true;
            }
        }
        return false;
    }
}
