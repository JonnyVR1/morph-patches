package p153l;

import android.app.Activity;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class exk {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m123058a(Activity activity) {
        if (activity != null) {
            try {
                if (activity.isFinishing()) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("hdr_type", m123060c(activity));
                map.put("profile_levels", m123059b());
                q4f q4fVar = new q4f();
                q4fVar.f155566d = EventNameEnum.SYS_CHECK;
                q4fVar.f155581s = "e_android_hdr_static_info";
                i4g0.m138516n(q4fVar, map);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, String> m123059b() {
        String[] supportedTypes;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        String strM123063f;
        int codecCount = MediaCodecList.getCodecCount();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null && supportedTypes.length != 0) {
                for (String str : supportedTypes) {
                    if (!TextUtils.isEmpty(str) && (capabilitiesForType = codecInfoAt.getCapabilitiesForType(str)) != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null && codecProfileLevelArr.length != 0) {
                        if (m123064g(str)) {
                            strM123063f = m123061d(codecProfileLevelArr);
                        } else if (m123065h(str)) {
                            strM123063f = m123062e(codecProfileLevelArr);
                        } else {
                            strM123063f = m123066i(str) ? m123063f(codecProfileLevelArr) : "";
                        }
                        if (!TextUtils.isEmpty(strM123063f)) {
                            map.put(str, strM123063f);
                        }
                    }
                }
            }
        }
        map.toString();
        return map;
    }

    @RequiresApi(api = 24)
    /* JADX INFO: renamed from: c */
    public static String m123060c(Activity activity) {
        StringBuilder sb = new StringBuilder();
        int[] supportedHdrTypes = activity.getWindowManager().getDefaultDisplay().getHdrCapabilities().getSupportedHdrTypes();
        if (supportedHdrTypes == null || supportedHdrTypes.length == 0) {
            sb.append(-1);
        } else {
            for (int i : supportedHdrTypes) {
                sb.append(i);
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m123061d(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        if (codecProfileLevelArr == null || codecProfileLevelArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            int i = codecProfileLevel.profile;
            if (i == 8 || i == 1 || i == 2 || i == 4 || i == 128 || i == 64 || i == 16 || i == 32) {
                sb.append(i);
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m123062e(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        if (codecProfileLevelArr == null || codecProfileLevelArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            int i = codecProfileLevel.profile;
            if (i == 4096) {
                sb.append(i);
                sb.append(Constants.SEPARATOR_COMMA);
            } else if (i == 2) {
                sb.append(i);
                sb.append(Constants.SEPARATOR_COMMA);
            } else if (i == 8192) {
                sb.append(i);
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m123063f(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        if (codecProfileLevelArr == null || codecProfileLevelArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            int i = codecProfileLevel.profile;
            if (i == 4096 || i == 8192) {
                sb.append(i);
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m123064g(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/dolby-vision");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m123065h(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/hevc");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m123066i(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/x-vnd.on2.vp9");
    }

    /* JADX INFO: renamed from: j */
    public static void m123067j(final Activity activity) {
        l51.m152919y(new Runnable() { // from class: l.dxk
            @Override // java.lang.Runnable
            public final void run() {
                exk.m123058a(activity);
            }
        });
    }
}
