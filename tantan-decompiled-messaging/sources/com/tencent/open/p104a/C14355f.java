package com.tencent.open.p104a;

import android.os.Build;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14389g;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14392j;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.open.a.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14355f {

    /* JADX INFO: renamed from: a */
    private static C14355f f60185a;

    /* JADX INFO: renamed from: b */
    private C14392j f60186b;

    /* JADX INFO: renamed from: c */
    private InterfaceC14350a f60187c;

    public C14355f() {
        m84228b();
    }

    /* JADX INFO: renamed from: b */
    private void m84228b() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + C14389g.m84397a().m84401b(C14390h.m84404a()) + "_" + Build.VERSION.RELEASE;
        try {
            this.f60187c = new C14354e(str);
        } catch (NoClassDefFoundError e) {
            SLog.m84308e("openSDK_LOG.OpenHttpService", "initClient okHttp catch error", e);
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th);
        }
        if (this.f60187c == null) {
            this.f60187c = new C14351b(str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84229c() {
        C14392j c14392j = this.f60186b;
        if (c14392j == null) {
            return;
        }
        int iM84424a = c14392j.m84424a("Common_HttpConnectionTimeout");
        if (iM84424a == 0) {
            iM84424a = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        }
        int iM84424a2 = this.f60186b.m84424a("Common_SocketConnectionTimeout");
        if (iM84424a2 == 0) {
            iM84424a2 = 30000;
        }
        m84233a(iM84424a, iM84424a2);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14356g m84231a(String str, Map<String, String> map) throws IOException {
        if (map == null || map.isEmpty()) {
            return m84230a(str, "");
        }
        StringBuilder sb = new StringBuilder("");
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (str3 != null) {
                sb.append(URLEncoder.encode(str2, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "UTF-8"));
                sb.append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return m84230a(str, sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC14356g m84235b(String str, Map<String, String> map) throws IOException {
        SLog.m84309i("openSDK_LOG.OpenHttpService", "post data");
        return this.f60187c.mo84212a(str, map);
    }

    /* JADX INFO: renamed from: a */
    public void m84234a(C14392j c14392j) {
        this.f60186b = c14392j;
        m84229c();
    }

    /* JADX INFO: renamed from: a */
    public void m84233a(long j, long j2) {
        InterfaceC14350a interfaceC14350a = this.f60187c;
        if (interfaceC14350a != null) {
            interfaceC14350a.mo84214a(j, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14355f m84227a() {
        if (f60185a == null) {
            synchronized (C14355f.class) {
                try {
                    if (f60185a == null) {
                        f60185a = new C14355f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f60185a.m84229c();
        return f60185a;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14356g m84230a(String str, String str2) throws IOException {
        SLog.m84309i("openSDK_LOG.OpenHttpService", "get.");
        return this.f60187c.mo84211a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14356g m84232a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 != null && map2.size() != 0) {
            return this.f60187c.mo84213a(str, map, map2);
        }
        return m84235b(str, map);
    }
}
