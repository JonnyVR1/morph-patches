package p153l;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.meituan.robust.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class zse0 implements yse0 {
    @Override // p153l.yse0
    /* JADX INFO: renamed from: a */
    public HashMap<String, String> mo136968a(String str) {
        HashMap<String, String> map = new HashMap<>();
        String strM221342b = m221342b(str);
        jzv.m147728a("MWCEngine", "Cookie:" + strM221342b);
        if (!TextUtils.isEmpty(strM221342b)) {
            for (String str2 : strM221342b.split(Constants.PACKNAME_END)) {
                if (!TextUtils.isEmpty(str2) && str2.contains("=")) {
                    String[] strArrSplit = str2.split("=", 2);
                    if (strArrSplit.length == 2) {
                        String strTrim = strArrSplit[0].trim();
                        String strTrim2 = strArrSplit[1].trim();
                        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                            map.put(strTrim, strTrim2);
                        }
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public String m221342b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (lv0.m155971a() != null) {
                CookieSyncManager.createInstance(lv0.m155971a());
            }
            return CookieManager.getInstance().getCookie(str);
        } catch (Throwable th) {
            Log.e("SessionProvider", "", th);
            return "";
        }
    }
}
