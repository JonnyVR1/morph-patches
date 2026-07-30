package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class a43 {

    /* JADX INFO: renamed from: a */
    private static boolean f68348a;

    /* JADX INFO: renamed from: b */
    private static List<Set<String>> f68349b = new ArrayList(4);

    /* JADX INFO: renamed from: a */
    private static void m95879a() {
        if (f68348a) {
            return;
        }
        f68348a = true;
        f68349b.add(0, m95882d(rs8.m182916g(true)));
        f68349b.add(1, m95882d(rs8.m182917h(true)));
        f68349b.add(2, m95882d(rs8.m182916g(false)));
        f68349b.add(3, m95882d(rs8.m182917h(false)));
    }

    /* JADX INFO: renamed from: b */
    public static int m95880b(boolean z, String str) {
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
            Log.e("BlackListUtils", "", e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m95881c(boolean z, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            m95879a();
            String lowerCase = str.toLowerCase();
            String strM130709f = glw.m130709f(lowerCase);
            if (z) {
                return f68349b.get(1).contains(strM130709f) || f68349b.get(0).contains(sjw.m186317f(lowerCase));
            }
            return f68349b.get(3).contains(strM130709f) || f68349b.get(2).contains(sjw.m186317f(lowerCase));
        } catch (Exception e) {
            Log.e("BlackListUtils", "", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Set<String> m95882d(String str) {
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
            jzv.m147729b("BlackListUtils", e.getMessage());
            return new HashSet();
        }
    }
}
