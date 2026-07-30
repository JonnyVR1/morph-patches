package p153l;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class bwi0 {

    /* JADX INFO: renamed from: a */
    private static Set<String> f78741a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static boolean f78742b = false;

    /* JADX INFO: renamed from: a */
    public static boolean m106699a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strM186317f = sjw.m186317f(str);
        if (TextUtils.isEmpty(strM186317f)) {
            return false;
        }
        return m106700b(strM186317f);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m106700b(@NonNull String str) {
        if (!f78742b) {
            i5m i5mVarM186322k = sjw.m186322k();
            String str2 = WeJson.EMPTY_ARR;
            String strMo115646a = i5mVarM186322k != null ? sjw.m186322k().mo115646a() : WeJson.EMPTY_ARR;
            if (!TextUtils.isEmpty(strMo115646a)) {
                str2 = strMo115646a;
            }
            try {
                JSONArray jSONArray = new JSONArray(str2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        f78741a.add(jSONArray.optString(i));
                    }
                }
            } catch (Exception e) {
                Log.e("MK---WebView", "", e);
            }
            f78742b = true;
        }
        if (f78741a.contains(str)) {
            return true;
        }
        Iterator<String> it = f78741a.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }
}
