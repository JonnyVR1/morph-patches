package p009l;

import android.app.Activity;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import l.e51;
import l.l3f;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ouk {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20026a(Activity activity) {
        if (activity != null) {
            try {
                if (activity.isFinishing()) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("hdr_type", m20028c(activity));
                map.put("profile_levels", m20027b());
                l3f l3fVar = new l3f();
                l3fVar.d = EventNameEnum.SYS_CHECK;
                l3fVar.s = "e_android_hdr_static_info";
                zvf0.n(l3fVar, map);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, String> m20027b() {
        String[] supportedTypes;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        String strM20031f;
        int codecCount = MediaCodecList.getCodecCount();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null && supportedTypes.length != 0) {
                for (String str : supportedTypes) {
                    if (!TextUtils.isEmpty(str) && (capabilitiesForType = codecInfoAt.getCapabilitiesForType(str)) != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null && codecProfileLevelArr.length != 0) {
                        if (m20032g(str)) {
                            strM20031f = m20029d(codecProfileLevelArr);
                        } else if (m20033h(str)) {
                            strM20031f = m20030e(codecProfileLevelArr);
                        } else {
                            strM20031f = m20034i(str) ? m20031f(codecProfileLevelArr) : "";
                        }
                        if (!TextUtils.isEmpty(strM20031f)) {
                            map.put(str, strM20031f);
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
    public static String m20028c(Activity activity) {
        StringBuilder sb = new StringBuilder();
        int[] supportedHdrTypes = activity.getWindowManager().getDefaultDisplay().getHdrCapabilities().getSupportedHdrTypes();
        if (supportedHdrTypes == null || supportedHdrTypes.length == 0) {
            sb.append(-1);
        } else {
            for (int i : supportedHdrTypes) {
                sb.append(i);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m20029d(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        if (codecProfileLevelArr == null || codecProfileLevelArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            int i = codecProfileLevel.profile;
            if (i == 8 || i == 1 || i == 2 || i == 4 || i == 128 || i == 64 || i == 16 || i == 32) {
                sb.append(i);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m20030e(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        if (codecProfileLevelArr == null || codecProfileLevelArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            int i = codecProfileLevel.profile;
            if (i == 4096) {
                sb.append(i);
                sb.append(",");
            } else if (i == 2) {
                sb.append(i);
                sb.append(",");
            } else if (i == 8192) {
                sb.append(i);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m20031f(MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr) {
        if (codecProfileLevelArr == null || codecProfileLevelArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            int i = codecProfileLevel.profile;
            if (i == 4096 || i == 8192) {
                sb.append(i);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20032g(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/dolby-vision");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20033h(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/hevc");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m20034i(String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase("video/x-vnd.on2.vp9");
    }

    /* JADX INFO: renamed from: j */
    public static void m20035j(final Activity activity) {
        e51.y(new Runnable() { // from class: l.nuk
            @Override // java.lang.Runnable
            public final void run() {
                ouk.m20026a(activity);
            }
        });
    }
}
