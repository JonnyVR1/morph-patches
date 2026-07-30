package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class vun {
    /* JADX INFO: renamed from: a */
    public static String m202808a(int i) {
        if (i == 0) {
            return LimitTimePictureStatus.unread;
        }
        if (i != 1) {
            return i != 2 ? "" : "no";
        }
        return "read";
    }

    /* JADX INFO: renamed from: b */
    public static void m202809b(@NonNull qrr qrrVar, String str) {
        if (qrrVar.m177602h()) {
            return;
        }
        String strM202808a = m202808a(qrrVar.m177601g());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i4g0.m138521s("e_bubble_live_followed", str, Collections.singletonMap("show_type", strM202808a));
    }

    /* JADX INFO: renamed from: c */
    public static void m202810c(@NonNull qrr qrrVar, String str) {
        if (qrrVar.m177602h()) {
            return;
        }
        String strM202808a = m202808a(qrrVar.m177601g());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i4g0.m138527y("e_bubble_live_followed", str, Collections.singletonMap("show_type", strM202808a));
    }

    /* JADX INFO: renamed from: d */
    public static void m202811d(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        map.put("anchorId", str2);
        map.put("liveId", str3);
        bfu.m104073e(str, map);
    }

    /* JADX INFO: renamed from: e */
    public static void m202812e(String str) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        bfu.m104074f(str, map);
    }

    /* JADX INFO: renamed from: f */
    public static void m202813f(String str) {
        i4g0.m138520r("e_bubble_live_start", str);
    }

    /* JADX INFO: renamed from: g */
    public static void m202814g(String str) {
        i4g0.m138526x("e_bubble_live_start", str);
    }
}
