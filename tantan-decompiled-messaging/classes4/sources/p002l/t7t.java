package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t7t {
    /* JADX INFO: renamed from: a */
    public static boolean m22809a(BLiveAbsData bLiveAbsData) {
        BLiveOfficialShowInfo bLiveOfficialShowInfo;
        return (bLiveAbsData == null || !(bLiveAbsData instanceof BLive) || (bLiveOfficialShowInfo = ((BLive) bLiveAbsData).officialShowLiveInfo) == null || TextUtils.isEmpty(bLiveOfficialShowInfo.showLiveId)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m22810b(BLiveAbsData bLiveAbsData) {
        BLiveOfficialShowInfo bLiveOfficialShowInfo;
        if ((bLiveAbsData instanceof BLive) && (bLiveOfficialShowInfo = ((BLive) bLiveAbsData).officialShowLiveInfo) != null) {
            return bLiveOfficialShowInfo.showLiveId;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m22811c(ho2 ho2Var) {
        return ho2Var.m14505I0().m27371g();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22812d(BLiveAbsData bLiveAbsData) {
        return bLiveAbsData != null && TextUtils.equals("officialShow", bLiveAbsData.liveMode);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m22813e(BLiveAbsData bLiveAbsData) {
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
