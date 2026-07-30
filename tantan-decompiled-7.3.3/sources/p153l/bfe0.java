package p153l;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.hellogroup.p036mk.core.safety.MKUrlNotSafeException;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class bfe0 {

    /* JADX INFO: renamed from: a */
    private static volatile String f76481a;

    /* JADX INFO: renamed from: b */
    private static volatile e7e f76482b;

    /* JADX INFO: renamed from: c */
    private static final String[] f76483c = {"?", "\\", "@"};

    /* JADX INFO: renamed from: d */
    private static volatile boolean f76484d = rs8.m182929t();

    /* JADX INFO: renamed from: a */
    public static boolean m103886a(String str) {
        if (i8g0.m139000b(str)) {
            return false;
        }
        if (f76481a == null) {
            f76481a = rs8.m182922m();
        }
        if (!TextUtils.isEmpty(f76481a)) {
            if (f76482b == null) {
                f76482b = m103892g(f76481a);
            }
            if (f76482b != null && f76482b.m119705a(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m103887b(String str, String str2) {
        if (!f76484d) {
            return false;
        }
        if (!TextUtils.isEmpty(str2)) {
            return m103890e(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            String strM155973c = lv0.m155973c();
            if (str.startsWith("file:///android_asset/")) {
                return true;
            }
            if (!str.startsWith("/data/data/" + strM155973c)) {
                if (str.startsWith("file:///data/data/" + strM155973c)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m103888c(String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            return false;
        }
        try {
            return !m103886a(sjw.m186317f(str));
        } catch (Throwable th) {
            Log.e("SecurityUtils", "", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m103889d(String str) throws MKUrlNotSafeException {
        if (!m103891f() || TextUtils.isEmpty(str)) {
            return;
        }
        String strM186317f = sjw.m186317f(str);
        if (glw.m130714k(strM186317f, str)) {
            return;
        }
        throw new MKUrlNotSafeException("\"" + str + "\" not in whitelist, host=" + strM186317f);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m103890e(String str) {
        for (String str2 : f76483c) {
            if (str.contains(str2)) {
                return false;
            }
        }
        if (f76481a == null) {
            f76481a = rs8.m182922m();
        }
        if (!TextUtils.isEmpty(f76481a)) {
            if (f76482b == null) {
                f76482b = m103892g(f76481a);
            }
            if (f76482b != null && f76482b.m119705a(str)) {
                return true;
            }
        }
        return glw.m130715l(str);
    }

    /* JADX INFO: renamed from: f */
    private static boolean m103891f() {
        i5m i5mVarM186322k = sjw.m186322k();
        return i5mVarM186322k != null && i5mVarM186322k.mo115647b();
    }

    /* JADX INFO: renamed from: g */
    private static e7e m103892g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = WeJson.EMPTY_ARR;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i, "").toLowerCase());
            }
            return new e7e(arrayList);
        } catch (Exception e) {
            jzv.m147729b("SecurityUtils", e.getMessage());
            return new e7e(Collections.EMPTY_LIST);
        }
    }
}
