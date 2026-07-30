package com.tencent.open.web.security;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.tencent.open.C14521b;
import com.tencent.open.log.SLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.open.web.security.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14564b extends C14521b {
    @Override // com.tencent.open.C14521b
    /* JADX INFO: renamed from: a */
    public boolean mo85425a(WebView webView, String str) {
        SLog.m85492i("openSDK_LOG.SecureJsBridge", "-->canHandleUrl---url = " + str);
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
        SLog.m85492i("openSDK_LOG.SecureJsBridge", "-->canHandleUrl, objectName: " + str2 + " | methodName: " + str3 + " | snStr: " + str4);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            try {
                mo85424a(str2, str3, arrayList.subList(6, arrayList.size() - 1), new C14565c(webView, Long.parseLong(str4), str, str5));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.tencent.open.C14521b
    /* JADX INFO: renamed from: a */
    public void mo85424a(String str, String str2, List<String> list, C14521b.a aVar) {
        SLog.m85496v("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: " + str + " | methodName: " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        C14521b.b bVar = this.f61040a.get(str);
        if (bVar != null) {
            SLog.m85488d("openSDK_LOG.SecureJsBridge", "-->handler != null");
            bVar.call(str2, list, aVar);
            return;
        }
        SLog.m85490e("openSDK_LOG.SecureJsBridge", "-->handler == null objName: " + str);
        if (aVar != null) {
            aVar.mo85426a();
        }
    }
}
