package com.tencent.open.web.security;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.tencent.open.C14358b;
import com.tencent.open.log.SLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.open.web.security.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14401b extends C14358b {
    @Override // com.tencent.open.C14358b
    /* JADX INFO: renamed from: a */
    public boolean mo84242a(WebView webView, String str) {
        SLog.m84309i("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.concat("/#").split("/")));
        if (arrayList.size() < 7) {
            return false;
        }
        String str2 = (String) arrayList.get(2);
        String str3 = (String) arrayList.get(3);
        String str4 = (String) arrayList.get(4);
        String str5 = (String) arrayList.get(5);
        SLog.m84309i("openSDK_LOG.SecureJsBridge", "-->canHandleUrl, objectName: " + str2 + " | methodName: " + str3 + " | snStr: " + str4);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            try {
                mo84241a(str2, str3, arrayList.subList(6, arrayList.size() - 1), new C14402c(webView, Long.parseLong(str4), str, str5));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.tencent.open.C14358b
    /* JADX INFO: renamed from: a */
    public void mo84241a(String str, String str2, List<String> list, C14358b.a aVar) {
        SLog.m84313v("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str + " | methodName: " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        C14358b.b bVar = this.f60192a.get(str);
        if (bVar != null) {
            SLog.m84305d("openSDK_LOG.SecureJsBridge", "-->handler != null");
            bVar.call(str2, list, aVar);
            return;
        }
        SLog.m84307e("openSDK_LOG.SecureJsBridge", "-->handler == null objName: " + str);
        if (aVar != null) {
            aVar.mo84243a();
        }
    }
}
