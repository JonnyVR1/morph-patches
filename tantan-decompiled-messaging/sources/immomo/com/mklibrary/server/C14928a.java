package immomo.com.mklibrary.server;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.cosmos.mdlog.MDLog;
import fi.iki.elonen.NanoHTTPD;
import java.util.HashMap;
import java.util.Map;
import p149l.fqd;
import p149l.jrl;
import p149l.w0m;
import p149l.zhw;

/* JADX INFO: renamed from: immomo.com.mklibrary.server.a */
/* JADX INFO: loaded from: classes2.dex */
class C14928a extends NanoHTTPD {

    /* JADX INFO: renamed from: n */
    private HashMap<NanoHTTPD.Method, w0m> f63330n;

    /* JADX INFO: renamed from: o */
    private jrl f63331o;

    public C14928a(HashMap<NanoHTTPD.Method, w0m> map, jrl jrlVar, String str, int i) {
        super(str, i);
        this.f63330n = map;
        this.f63331o = jrlVar;
        m87206E();
    }

    /* JADX INFO: renamed from: D */
    private NanoHTTPD.Response m87205D(NanoHTTPD.Response response, long j) {
        response.m86960b(OSSHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        if (LocalServerHandler.m87200g()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            response.m86960b("outTime", jCurrentTimeMillis + "");
            response.m86960b("inTime", j + "");
            response.m86960b("processTime", (jCurrentTimeMillis - j) + "");
        }
        return response;
    }

    /* JADX INFO: renamed from: E */
    private void m87206E() {
    }

    /* JADX INFO: renamed from: F */
    private w0m m87207F(NanoHTTPD.Method method) {
        HashMap<NanoHTTPD.Method, w0m> map = this.f63330n;
        if (map != null) {
            return map.get(method);
        }
        return null;
    }

    @Override // fi.iki.elonen.NanoHTTPD
    /* JADX INFO: renamed from: t */
    public NanoHTTPD.Response mo86944t(NanoHTTPD.InterfaceC14902l interfaceC14902l) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strMo86981a = interfaceC14902l.mo86981a();
        NanoHTTPD.Method method = interfaceC14902l.getMethod();
        Map<String, String> mapMo86983c = interfaceC14902l.mo86983c();
        MDLog.m7390d("LOCAL_SERVER_LocalServer", "thread: %s, uri: %s, method: %s, params: %s \n time: %d", Thread.currentThread().toString(), strMo86981a, method != null ? method.toString() : "null", mapMo86983c != null ? mapMo86983c.toString() : "null", Long.valueOf(jCurrentTimeMillis));
        String str = mapMo86983c.get("uri");
        mapMo86983c.put("url", strMo86981a);
        if (TextUtils.isEmpty(str)) {
            return m87205D(fqd.m122699f(), jCurrentTimeMillis);
        }
        String strM218869b = zhw.m218869b(str);
        if (TextUtils.isEmpty(strM218869b)) {
            return m87205D(fqd.m122695b(), jCurrentTimeMillis);
        }
        jrl jrlVar = this.f63331o;
        if (jrlVar != null && jrlVar.mo97152a(mapMo86983c, strMo86981a, strM218869b)) {
            return m87205D(this.f63331o.mo97153b(mapMo86983c, strMo86981a, strM218869b), jCurrentTimeMillis);
        }
        w0m w0mVarM87207F = m87207F(method);
        return w0mVarM87207F == null ? m87205D(fqd.m122696c(method), jCurrentTimeMillis) : m87205D(w0mVarM87207F.mo97153b(mapMo86983c, str, strM218869b), jCurrentTimeMillis);
    }
}
