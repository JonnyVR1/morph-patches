package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.clevertap.android.sdk.Constants;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class xqp0 {
    /* JADX INFO: renamed from: a */
    public boolean m212738a(WebView webView, URL url, Uri uri, String str) {
        return (TextUtils.isEmpty(str) || !str.toLowerCase().contains(Constants.INAPP_HTML_TAG) || TextUtils.equals(uri.getPath(), url.getPath())) ? false : true;
    }
}
