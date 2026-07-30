package p149l;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class cih0 {

    /* JADX INFO: renamed from: a */
    private static List<String> f81088a;

    /* JADX INFO: renamed from: l.cih0$a */
    public class C16164a implements ValueCallback<Boolean> {
        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            mxv.m156926a("SystemWhiteListUtils", "white list callback value ----> " + bool);
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m107067a() {
        if (f81088a == null) {
            f81088a = m107068b();
        }
        return f81088a;
    }

    /* JADX INFO: renamed from: b */
    private static List<String> m107068b() {
        try {
            if (shw.m184294n() == null) {
                return new ArrayList();
            }
            String strMo110235g = shw.m184294n().mo110235g();
            if (!TextUtils.isEmpty(strMo110235g)) {
                JSONArray jSONArray = new JSONArray(strMo110235g);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
                return arrayList;
            }
            return new ArrayList();
        } catch (Exception e) {
            mxv.m156927b("SystemWhiteListUtils", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m107069c(WebSettings webSettings) {
        List<String> listM107067a;
        if (webSettings != null) {
            try {
                if (Build.VERSION.SDK_INT < 27 || (listM107067a = m107067a()) == null || listM107067a.size() <= 0) {
                    return;
                }
                webSettings.setSafeBrowsingEnabled(true);
                mxv.m156930e("SystemWhiteListUtils", "whiteList :" + listM107067a.toString());
                WebView.setSafeBrowsingWhitelist(listM107067a, new C16164a());
            } catch (Throwable th) {
                mxv.m156927b("SystemWhiteListUtils", th.getMessage());
            }
        }
    }
}
