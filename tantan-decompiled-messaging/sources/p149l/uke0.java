package p149l;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.meituan.robust.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class uke0 implements tke0 {

    /* JADX INFO: renamed from: a */
    CookieManager f176919a = CookieManager.getInstance();

    @Override // p149l.tke0
    /* JADX INFO: renamed from: a */
    public HashMap<String, String> mo185588a(String str) {
        HashMap<String, String> map = new HashMap<>();
        String strM194153b = m194153b(str);
        if (!TextUtils.isEmpty(strM194153b)) {
            for (String str2 : strM194153b.split(Constants.PACKNAME_END)) {
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
    public String m194153b(String str) {
        return TextUtils.isEmpty(str) ? "" : CookieManager.getInstance().getCookie(str);
    }
}
