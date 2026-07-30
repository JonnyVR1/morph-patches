package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class vsn {
    /* JADX INFO: renamed from: a */
    public static String m199873a(int i) {
        if (i == 0) {
            return LimitTimePictureStatus.unread;
        }
        if (i != 1) {
            return i != 2 ? "" : "no";
        }
        return "read";
    }

    /* JADX INFO: renamed from: b */
    public static void m199874b(@NonNull ppr pprVar, String str) {
        if (pprVar.m170766h()) {
            return;
        }
        String strM199873a = m199873a(pprVar.m170765g());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.m220397s("e_bubble_live_followed", str, Collections.singletonMap("show_type", strM199873a));
    }

    /* JADX INFO: renamed from: c */
    public static void m199875c(@NonNull ppr pprVar, String str) {
        if (pprVar.m170766h()) {
            return;
        }
        String strM199873a = m199873a(pprVar.m170765g());
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.m220403y("e_bubble_live_followed", str, Collections.singletonMap("show_type", strM199873a));
    }

    /* JADX INFO: renamed from: d */
    public static void m199876d(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        map.put("anchorId", str2);
        map.put("liveId", str3);
        adu.m96009e(str, map);
    }

    /* JADX INFO: renamed from: e */
    public static void m199877e(String str) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        adu.m96010f(str, map);
    }

    /* JADX INFO: renamed from: f */
    public static void m199878f(String str) {
        zvf0.m220396r("e_bubble_live_start", str);
    }

    /* JADX INFO: renamed from: g */
    public static void m199879g(String str) {
        zvf0.m220402x("e_bubble_live_start", str);
    }
}
