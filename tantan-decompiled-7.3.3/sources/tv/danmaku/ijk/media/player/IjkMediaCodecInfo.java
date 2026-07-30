package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class IjkMediaCodecInfo {
    public static int RANK_ACCEPTABLE = 700;
    public static int RANK_LAST_CHANCE = 600;
    public static int RANK_MAX = 1000;
    public static int RANK_NON_STANDARD = 100;
    public static int RANK_NO_SENSE = 0;
    public static int RANK_SECURE = 300;
    public static int RANK_SOFTWARE = 200;
    public static int RANK_TESTED = 800;
    private static final String TAG = "IjkMediaCodecInfo";
    private static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank = 0;

    private static synchronized Map<String, Integer> getKnownCodecList() {
        Map<String, Integer> map = sKnownCodecList;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        sKnownCodecList = treeMap;
        treeMap.put("OMX.Nvidia.h264.decode", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.Nvidia.h264.decode.secure", Integer.valueOf(RANK_SECURE));
        sKnownCodecList.put("OMX.Intel.hw_vd.h264", Integer.valueOf(RANK_TESTED + 1));
        sKnownCodecList.put("OMX.Intel.VideoDecoder.AVC", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.qcom.video.decoder.avc", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.ittiam.video.decoder.avc", Integer.valueOf(RANK_NO_SENSE));
        sKnownCodecList.put("OMX.SEC.avc.dec", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.SEC.AVC.Decoder", Integer.valueOf(RANK_TESTED - 1));
        sKnownCodecList.put("OMX.SEC.avcdec", Integer.valueOf(RANK_TESTED - 2));
        sKnownCodecList.put("OMX.SEC.avc.sw.dec", Integer.valueOf(RANK_SOFTWARE));
        sKnownCodecList.put("OMX.Exynos.avc.dec", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.Exynos.AVC.Decoder", Integer.valueOf(RANK_TESTED - 1));
        sKnownCodecList.put("OMX.k3.video.decoder.avc", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.IMG.MSVDX.Decoder.AVC", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.TI.DUCATI1.VIDEO.DECODER", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.rk.video_decoder.avc", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.amlogic.avc.decoder.awesome", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", Integer.valueOf(RANK_TESTED));
        sKnownCodecList.put("OMX.MARVELL.VIDEO.H264DECODER", Integer.valueOf(RANK_SOFTWARE));
        sKnownCodecList.remove("OMX.BRCM.vc4.decoder.avc");
        sKnownCodecList.remove("OMX.brcm.video.h264.hw.decoder");
        sKnownCodecList.remove("OMX.brcm.video.h264.decoder");
        sKnownCodecList.remove("OMX.ST.VFM.H264Dec");
        sKnownCodecList.remove("OMX.allwinner.video.decoder.avc");
        sKnownCodecList.remove("OMX.MS.AVC.Decoder");
        sKnownCodecList.remove("OMX.hantro.81x0.video.decoder");
        sKnownCodecList.remove("OMX.hisi.video.decoder");
        sKnownCodecList.remove("OMX.cosmo.video.decoder.avc");
        sKnownCodecList.remove("OMX.duos.h264.decoder");
        sKnownCodecList.remove("OMX.bluestacks.hw.decoder");
        sKnownCodecList.put("OMX.google.h264.decoder", Integer.valueOf(RANK_SOFTWARE));
        sKnownCodecList.put("OMX.google.h264.lc.decoder", Integer.valueOf(RANK_SOFTWARE));
        sKnownCodecList.put("OMX.k3.ffmpeg.decoder", Integer.valueOf(RANK_SOFTWARE));
        sKnownCodecList.put("OMX.ffmpeg.video.decoder", Integer.valueOf(RANK_SOFTWARE));
        return sKnownCodecList;
    }

    public static String getLevelName(int i) {
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "1b";
        }
        switch (i) {
            case 4:
                return Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE;
            case 8:
                return Constants.VIA_REPORT_TYPE_SET_AVATAR;
            case 16:
                return Constants.VIA_REPORT_TYPE_JOININ_GROUP;
            case 32:
                return "2";
            case 64:
                return "21";
            case 128:
                return Constants.VIA_REPORT_TYPE_DATALINE;
            case 256:
                return "3";
            case 512:
                return "31";
            case 1024:
                return "32";
            case 2048:
                return "4";
            case 4096:
                return "41";
            case 8192:
                return "42";
            case 16384:
                return "5";
            case 32768:
                return "51";
            case 65536:
                return "52";
            default:
                return "0";
        }
    }

    public static String getProfileLevelName(int i, int i2) {
        return String.format(Locale.US, " %s Profile Level %s (%d,%d)", getProfileName(i), getLevelName(i2), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String getProfileName(int i) {
        if (i == 1) {
            return "Baseline";
        }
        if (i == 2) {
            return "Main";
        }
        if (i == 4) {
            return "Extends";
        }
        if (i == 8) {
            return "High";
        }
        if (i == 16) {
            return "High10";
        }
        if (i != 32) {
            return i != 64 ? "Unknown" : "High444";
        }
        return "High422";
    }

    @TargetApi(16)
    public static IjkMediaCodecInfo setupCandidate(MediaCodecInfo mediaCodecInfo, String str) {
        int iIntValue;
        if (mediaCodecInfo == null) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        String lowerCase = name.toLowerCase(Locale.US);
        if (!lowerCase.startsWith("omx.")) {
            iIntValue = RANK_NON_STANDARD;
        } else if (lowerCase.startsWith("omx.pv") || lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || lowerCase.startsWith("omx.k3.ffmpeg.") || lowerCase.startsWith("omx.avcodec.")) {
            iIntValue = RANK_SOFTWARE;
        } else if (lowerCase.startsWith("omx.ittiam.")) {
            iIntValue = RANK_NO_SENSE;
        } else if (lowerCase.startsWith("omx.mtk.")) {
            iIntValue = RANK_TESTED;
        } else {
            Integer num = getKnownCodecList().get(lowerCase);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                try {
                    iIntValue = mediaCodecInfo.getCapabilitiesForType(str) != null ? RANK_ACCEPTABLE : RANK_LAST_CHANCE;
                } catch (Throwable unused) {
                    iIntValue = RANK_LAST_CHANCE;
                }
            }
        }
        IjkMediaCodecInfo ijkMediaCodecInfo = new IjkMediaCodecInfo();
        ijkMediaCodecInfo.mCodecInfo = mediaCodecInfo;
        ijkMediaCodecInfo.mRank = iIntValue;
        ijkMediaCodecInfo.mMimeType = str;
        return ijkMediaCodecInfo;
    }

    @TargetApi(16)
    public void dumpProfileLevels(String str) {
        int iMax;
        int iMax2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = this.mCodecInfo.getCapabilitiesForType(str);
            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                iMax = 0;
                iMax2 = 0;
            } else {
                iMax = 0;
                iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel != null) {
                        iMax = Math.max(iMax, codecProfileLevel.profile);
                        iMax2 = Math.max(iMax2, codecProfileLevel.level);
                    }
                }
            }
            String.format(Locale.US, "%s", getProfileLevelName(iMax, iMax2));
        } catch (Throwable unused) {
        }
    }
}
