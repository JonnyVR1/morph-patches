package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.face.api.ZIMFacade;
import com.idv.identity.platform.api.IdentityPlatform;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class uvf {
    /* JADX INFO: renamed from: a */
    public static Boolean m196073a(HashMap<String, Object> map, String str) {
        if (map == null || map.size() <= 0) {
            return Boolean.FALSE;
        }
        Object obj = map.get(str);
        return Boolean.valueOf(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false);
    }

    /* JADX INFO: renamed from: b */
    public static Integer m196074b(HashMap<String, Object> map, String str) {
        if (map == null || map.size() <= 0) {
            return 0;
        }
        Object obj = map.get(str);
        return Integer.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : 0);
    }

    /* JADX INFO: renamed from: c */
    public static String m196075c(Context context, boolean z) {
        return z ? IdentityPlatform.getMetaInfo(context) : ZIMFacade.getMetaInfos(context);
    }

    /* JADX INFO: renamed from: d */
    public static String m196076d(HashMap<String, Object> map, String str) {
        if (map != null && map.size() > 0) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public static String m196077e(String str) {
        return (TextUtils.isEmpty(str) || !("WBFaceVerifyLanguage_zh_cn".equals(str) || "WBFaceVerifyLanguage_zh_hk".equals(str) || "WBFaceVerifyLanguage_en".equals(str) || "WBFaceVerifyLanguage_id".equals(str) || "WBFaceVerifyLanguage_ja".equals(str) || "WBFaceVerifyLanguage_ko".equals(str) || "WBFaceVerifyLanguage_th".equals(str))) ? "WBFaceVerifyLanguage_zh_cn" : str;
    }
}
