package p153l;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class jqh0 {

    /* JADX INFO: renamed from: a */
    private static List<String> f122214a;

    /* JADX INFO: renamed from: l.jqh0$a */
    public class C18005a implements ValueCallback<Boolean> {
        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            jzv.m147728a("SystemWhiteListUtils", "white list callback value ----> " + bool);
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m146581a() {
        if (f122214a == null) {
            f122214a = m146582b();
        }
        return f122214a;
    }

    /* JADX INFO: renamed from: b */
    private static List<String> m146582b() {
        try {
            if (sjw.m186322k() == null) {
                return new ArrayList();
            }
            String strMo115650e = sjw.m186322k().mo115650e();
            if (!TextUtils.isEmpty(strMo115650e)) {
                JSONArray jSONArray = new JSONArray(strMo115650e);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
                return arrayList;
            }
            return new ArrayList();
        } catch (Exception e) {
            jzv.m147729b("SystemWhiteListUtils", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m146583c(WebSettings webSettings) {
        List<String> listM146581a;
        if (webSettings != null) {
            try {
                if (Build.VERSION.SDK_INT < 27 || (listM146581a = m146581a()) == null || listM146581a.size() <= 0) {
                    return;
                }
                webSettings.setSafeBrowsingEnabled(true);
                jzv.m147734g("SystemWhiteListUtils", "whiteList :" + listM146581a.toString());
                WebView.setSafeBrowsingWhitelist(listM146581a, new C18005a());
            } catch (Throwable th) {
                jzv.m147729b("SystemWhiteListUtils", th.getMessage());
            }
        }
    }
}
