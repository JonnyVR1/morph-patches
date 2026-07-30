package p149l;

import android.app.Activity;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ouk {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m166075a(Activity activity) {
        if (activity != null) {
            try {
                if (activity.isFinishing()) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("hdr_type", m166077c(activity));
                map.put("profile_levels", m166076b());
                l3f l3fVar = new l3f();
                l3fVar.f125885d = EventNameEnum.SYS_CHECK;
                l3fVar.f125900s = "e_android_hdr_static_info";
                zvf0.m220392n(l3fVar, map);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, String> m166076b() {
        String[] supportedTypes;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        String strM166080f;
        int codecCount = MediaCodecList.getCodecCount();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null && supportedTypes.length != 0) {
                for (String str : supportedTypes) {
                    if (!TextUtils.isEmpty(str) && (capabilitiesForType = codecInfoAt.getCapabilitiesForType(str)) != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null && codecProfileLevelArr.length != 0) {
                        if (m166081g(str)) {
                            strM166080f = m166078d(codecProfileLevelArr);
                        } else if (m166082h(str)) {
                            strM166080f = m166079e(codecProfileLevelArr);
                        } else {
                            strM166080f = m166083i(str) ? m166080f(codecProfileLevelArr) : "";
                        }
                        if (!TextUtils.isEmpty(strM166080f)) {
                            map.put(str, strM166080f);
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
    public static String m166077c(Activity activity) {
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
    public static String m166078d(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
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
    public static String m166079e(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
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
    public static String m166080f(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
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
    public static boolean m166081g(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/dolby-vision");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m166082h(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/hevc");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m166083i(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/x-vnd.on2.vp9");
    }

    /* JADX INFO: renamed from: j */
    public static void m166084j(final Activity activity) {
        e51.m114774y(new Runnable() { // from class: l.nuk
            @Override // java.lang.Runnable
            public final void run() {
                ouk.m166075a(activity);
            }
        });
    }
}
