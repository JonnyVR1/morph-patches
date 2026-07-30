package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class ani0 {

    /* JADX INFO: renamed from: a */
    private static Set<String> f70740a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static boolean f70741b = false;

    /* JADX INFO: renamed from: a */
    public static boolean m97753a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strM184286f = shw.m184286f(str);
        if (TextUtils.isEmpty(strM184286f)) {
            return false;
        }
        return m97754b(strM184286f);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m97754b(@NonNull String str) {
        if (!f70741b) {
            p2m p2mVarM184294n = shw.m184294n();
            String str2 = WeJson.EMPTY_ARR;
            String strMo110229a = p2mVarM184294n != null ? shw.m184294n().mo110229a() : WeJson.EMPTY_ARR;
            if (!TextUtils.isEmpty(strMo110229a)) {
                str2 = strMo110229a;
            }
            try {
                MDLog.m7389d("MK---WebView", "3rdParty config: " + str2);
                JSONArray jSONArray = new JSONArray(str2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        f70740a.add(jSONArray.optString(i));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            f70741b = true;
        }
        if (f70740a.contains(str)) {
            return true;
        }
        Iterator<String> it = f70740a.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }
}
