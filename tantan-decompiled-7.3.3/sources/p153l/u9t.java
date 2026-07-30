package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowInfo;

/* JADX INFO: loaded from: classes5.dex */
public class u9t {
    /* JADX INFO: renamed from: a */
    public static boolean m195112a(BLiveAbsData bLiveAbsData) {
        BLiveOfficialShowInfo bLiveOfficialShowInfo;
        return (bLiveAbsData == null || !(bLiveAbsData instanceof BLive) || (bLiveOfficialShowInfo = ((BLive) bLiveAbsData).officialShowLiveInfo) == null || TextUtils.isEmpty(bLiveOfficialShowInfo.showLiveId)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m195113b(BLiveAbsData bLiveAbsData) {
        BLiveOfficialShowInfo bLiveOfficialShowInfo;
        if ((bLiveAbsData instanceof BLive) && (bLiveOfficialShowInfo = ((BLive) bLiveAbsData).officialShowLiveInfo) != null) {
            return bLiveOfficialShowInfo.showLiveId;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m195114c(oo2 oo2Var) {
        return oo2Var.m168458I0().m98484g();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m195115d(BLiveAbsData bLiveAbsData) {
        return bLiveAbsData != null && TextUtils.equals("officialShow", bLiveAbsData.liveMode);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m195116e(BLiveAbsData bLiveAbsData) {
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
