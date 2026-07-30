package com.tencent.open.p109a;

import android.os.Build;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14552g;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14555j;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.open.a.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14518f {

    /* JADX INFO: renamed from: a */
    private static C14518f f61033a;

    /* JADX INFO: renamed from: b */
    private C14555j f61034b;

    /* JADX INFO: renamed from: c */
    private InterfaceC14513a f61035c;

    public C14518f() {
        m85411b();
    }

    /* JADX INFO: renamed from: b */
    private void m85411b() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + C14552g.m85580a().m85584b(C14553h.m85587a()) + "_" + Build.VERSION.RELEASE;
        try {
            this.f61035c = new C14517e(str);
        } catch (NoClassDefFoundError e) {
            SLog.m85491e("openSDK_LOG.OpenHttpService", "initClient okHttp catch error", e);
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th);
        }
        if (this.f61035c == null) {
            this.f61035c = new C14514b(str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m85412c() {
        C14555j c14555j = this.f61034b;
        if (c14555j == null) {
            return;
        }
        int iM85607a = c14555j.m85607a("Common_HttpConnectionTimeout");
        if (iM85607a == 0) {
            iM85607a = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        }
        int iM85607a2 = this.f61034b.m85607a("Common_SocketConnectionTimeout");
        if (iM85607a2 == 0) {
            iM85607a2 = 30000;
        }
        m85416a(iM85607a, iM85607a2);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14519g m85414a(String str, Map<String, String> map) throws IOException {
        if (map == null || map.isEmpty()) {
            return m85413a(str, "");
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
        return m85413a(str, sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC14519g m85418b(String str, Map<String, String> map) throws IOException {
        SLog.m85492i("openSDK_LOG.OpenHttpService", "post data");
        return this.f61035c.mo85395a(str, map);
    }

    /* JADX INFO: renamed from: a */
    public void m85417a(C14555j c14555j) {
        this.f61034b = c14555j;
        m85412c();
    }

    /* JADX INFO: renamed from: a */
    public void m85416a(long j, long j2) {
        InterfaceC14513a interfaceC14513a = this.f61035c;
        if (interfaceC14513a != null) {
            interfaceC14513a.mo85397a(j, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14518f m85410a() {
        if (f61033a == null) {
            synchronized (C14518f.class) {
                try {
                    if (f61033a == null) {
                        f61033a = new C14518f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f61033a.m85412c();
        return f61033a;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14519g m85413a(String str, String str2) throws IOException {
        SLog.m85492i("openSDK_LOG.OpenHttpService", "get.");
        return this.f61035c.mo85394a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14519g m85415a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 != null && map2.size() != 0) {
            return this.f61035c.mo85396a(str, map, map2);
        }
        return m85418b(str, map);
    }
}
