package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class k33 {

    /* JADX INFO: renamed from: a */
    private static boolean f120791a;

    /* JADX INFO: renamed from: b */
    private static List<Set<String>> f120792b = new ArrayList(4);

    /* JADX INFO: renamed from: a */
    private static void m144363a() {
        if (f120791a) {
            return;
        }
        f120791a = true;
        f120792b.add(0, m144366d(mei.m154204j(true)));
        f120792b.add(1, m144366d(mei.m154205k(true)));
        f120792b.add(2, m144366d(mei.m154204j(false)));
        f120792b.add(3, m144366d(mei.m154205k(false)));
    }

    /* JADX INFO: renamed from: b */
    public static int m144364b(boolean z, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            String queryParameter = Uri.parse(str).getQueryParameter(z ? "clsE" : "clsL");
            if (queryParameter == null) {
                return -2;
            }
            return "1".equals(queryParameter) ? 0 : 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m144365c(boolean z, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            m144363a();
            String lowerCase = str.toLowerCase();
            String strM149945f = liw.m149945f(lowerCase);
            if (z) {
                return f120792b.get(1).contains(strM149945f) || f120792b.get(0).contains(shw.m184286f(lowerCase));
            }
            return f120792b.get(3).contains(strM149945f) || f120792b.get(2).contains(shw.m184286f(lowerCase));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Set<String> m144366d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = WeJson.EMPTY_ARR;
            }
            JSONArray jSONArray = new JSONArray(str);
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.optString(i, "").toLowerCase());
            }
            return hashSet;
        } catch (Exception e) {
            mxv.m156927b("LogTracker", e.getMessage());
            return new HashSet();
        }
    }
}
