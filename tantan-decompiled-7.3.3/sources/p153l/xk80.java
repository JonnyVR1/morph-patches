package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.util.IdentityUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class xk80 {

    /* JADX INFO: renamed from: a */
    public static String f194717a = "";

    /* JADX INFO: renamed from: b */
    public static String f194718b = "";

    /* JADX INFO: renamed from: c */
    private static h5g f194719c;

    /* JADX INFO: renamed from: l.xk80$a */
    public class C21358a implements w84 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f194720a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f194721b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f194722c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f194723d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f194724e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f194725f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Map f194726g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ wk80 f194727h;

        public C21358a(long j, String str, int i, String str2, String str3, String str4, Map map, wk80 wk80Var) {
            this.f194720a = j;
            this.f194721b = str;
            this.f194722c = i;
            this.f194723d = str2;
            this.f194724e = str3;
            this.f194725f = str4;
            this.f194726g = map;
            this.f194727h = wk80Var;
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) {
            String str = ((System.currentTimeMillis() - this.f194720a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s;
            o6r0.m166283c("Request failed: " + this.f194721b + " errorMsg" + iOException.getMessage() + "  (index + 1)=" + (this.f194722c + 1));
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onFailure", "onResponseFailure", "action", this.f194723d, "url", this.f194721b, "host", this.f194724e, "errorMsg", iOException.toString(), "timeCost", str);
            int i = this.f194722c + 1;
            g5g g5gVarM97367B = afm.m97360H().m97367B();
            if (g5gVarM97367B != null && g5gVarM97367B.m129053c() != null && g5gVarM97367B.m129054d() != null) {
                g5gVarM97367B.m129052b();
                i = 0;
            }
            xk80.m211347g(i, this.f194723d, this.f194725f, this.f194726g, this.f194727h);
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws IOException {
            String str = ((System.currentTimeMillis() - this.f194720a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f45294s;
            if (this.f194727h == null) {
                o6r0.m166283c("http error: build callbackError ");
                return;
            }
            if (i5d0Var == null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onFailure", "onResponseNull", "action", this.f194723d, "url", this.f194721b, "host", this.f194724e, "errorMsg", "http error: response is null ", "timeCost", str);
                int i = this.f194722c + 1;
                g5g g5gVarM97367B = afm.m97360H().m97367B();
                if (g5gVarM97367B != null && g5gVarM97367B.m129053c() != null && g5gVarM97367B.m129054d() != null) {
                    g5gVarM97367B.m129052b();
                    i = 0;
                }
                xk80.m211347g(i, this.f194723d, this.f194725f, this.f194726g, this.f194727h);
                return;
            }
            if (i5d0Var.m138661I()) {
                k5d0 k5d0VarM138670k = i5d0Var.m138670k();
                String strString = k5d0VarM138670k != null ? k5d0VarM138670k.string() : "";
                e0l e0lVarM138659F = i5d0Var.m138659F();
                o6r0.m166281a("http response body: " + strString + " Header: " + (e0lVarM138659F != null ? e0lVarM138659F.toString() : ""));
                if (strString.contains("InvalidTimeStamp.Expired")) {
                    strString = strString.replace("InvalidTimeStamp.Expired", String.valueOf(1009));
                }
                g5g g5gVarM97367B2 = afm.m97360H().m97367B();
                if (g5gVarM97367B2 != null) {
                    g5gVarM97367B2.m129051a(this.f194721b, this.f194724e);
                }
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onSuccess", "onResponseSuc:", "action", this.f194723d, "url", this.f194721b, "host", this.f194724e, "timeCost", str);
                wk80 wk80Var = this.f194727h;
                if (wk80Var != null) {
                    wk80Var.onSuccess(i5d0Var.m138673q(), strString);
                    return;
                }
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onFailure", "onResponseNotSuc", "action", this.f194723d, "url", this.f194721b, "host", this.f194724e, "isSuccessful", i5d0Var.m138661I() + "", "errorMsg", i5d0Var.toString(), "timeCost", str);
            int i2 = this.f194722c + 1;
            g5g g5gVarM97367B3 = afm.m97360H().m97367B();
            if (g5gVarM97367B3 != null && g5gVarM97367B3.m129053c() != null && g5gVarM97367B3.m129054d() != null) {
                g5gVarM97367B3.m129052b();
                i2 = 0;
            }
            o6r0.m166283c("Response not successful: fallback  action" + this.f194723d + i5d0Var.m138673q());
            xk80.m211347g(i2, this.f194723d, this.f194725f, this.f194726g, this.f194727h);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m211342b(Map<String, String> map, String str) throws Exception {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : strArr) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(m211343c(str2, str));
            sb.append("=");
            sb.append(m211343c(map.get(str2), str));
        }
        return IdentityUtils.m19240gs("POST&" + m211343c("/", str) + "&" + m211343c(sb.toString(), str));
    }

    /* JADX INFO: renamed from: c */
    private static String m211343c(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return URLEncoder.encode(str, str2).replace(Marker.ANY_NON_NULL_MARKER, "%20").replace("*", "%2A").replace("%7E", "~");
    }

    /* JADX INFO: renamed from: d */
    private static String m211344d(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: renamed from: e */
    public static void m211345e(h5g h5gVar) {
        f194719c = h5gVar;
    }

    /* JADX INFO: renamed from: f */
    public static void m211346f(String str, String str2, Map<String, String> map, wk80 wk80Var) {
        h5g h5gVar = f194719c;
        if (h5gVar == null) {
            o6r0.m166283c("FallbackConfigManager not initialized.");
            return;
        }
        h5g.InterfaceC17403a interfaceC17403aM133657a = h5gVar.m133657a();
        List<String> listMo122676b = interfaceC17403aM133657a.mo122676b();
        interfaceC17403aM133657a.mo122675a();
        if (listMo122676b.isEmpty()) {
            o6r0.m166283c("No fallback URLs configured.");
        } else {
            m211347g(0, str, str2, map, wk80Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m211347g(int i, String str, String str2, Map<String, String> map, wk80 wk80Var) {
        String strM129054d;
        String strM129053c;
        h5g h5gVar = f194719c;
        if (h5gVar == null || wk80Var == null) {
            return;
        }
        h5g.InterfaceC17403a interfaceC17403aM133657a = h5gVar.m133657a();
        g5g g5gVarM97367B = afm.m97360H().m97367B();
        if (g5gVarM97367B == null || g5gVarM97367B.m129054d() == null || g5gVarM97367B.m129053c() == null) {
            if (interfaceC17403aM133657a == null) {
                wk80Var.onError(-1, "FallbackConfigManager is null");
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "FallbackConfigManager", Constants.KEY_CONFIG, " FallbackConfigManager is null");
                return;
            }
            List<String> listMo122676b = interfaceC17403aM133657a.mo122676b();
            List<String> listMo122675a = interfaceC17403aM133657a.mo122675a();
            if (listMo122676b == null || ((listMo122675a == null && i >= listMo122676b.size()) || i >= listMo122675a.size())) {
                wk80Var.onError(-1, "All fallback URLs failed");
                return;
            } else {
                strM129054d = listMo122676b.get(i);
                strM129053c = listMo122675a.get(i);
            }
        } else {
            strM129053c = g5gVarM97367B.m129053c();
            strM129054d = g5gVarM97367B.m129054d();
        }
        String str3 = strM129053c;
        String str4 = strM129054d;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "tryNextUrl", FirebaseAnalytics.Param.INDEX, i + "", "url", str4, "host", str3, "action", str);
        rg50.C19837b c19837b = new rg50.C19837b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        rg50 rg50VarM181365c = c19837b.m181368f(20L, timeUnit).m181383u(20L, timeUnit).m181387y(20L, timeUnit).m181365c();
        o6r0.m166281a("Trying URL: " + str4 + " HOST:" + str3);
        HashMap map2 = new HashMap();
        String str5 = f194717a;
        if (str5 == null || str5.isEmpty()) {
            f194717a = IdentityUtils.m19239gk();
        }
        map2.put("AccessKeyId", f194717a);
        map2.put("Format", JsonFactory.FORMAT_NAME_JSON);
        map2.put("SignatureMethod", "HMAC-SHA1");
        map2.put("TimestampKeep", m211344d(new Date()));
        map2.put("SignatureVersion", "1.0");
        map2.put("SignatureNonce", UUID.randomUUID().toString());
        map2.put(Constants.CLTAP_APP_VERSION, str2);
        map2.put("Action", str);
        if (map != null) {
            map.remove(RequestParameters.SIGNATURE);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    map2.put(key, value);
                }
            }
        }
        try {
            map2.put(RequestParameters.SIGNATURE, m211342b(map2, "UTF-8"));
        } catch (Throwable unused) {
            map2.put(RequestParameters.SIGNATURE, "null");
        }
        l1j.C18332a c18332a = new l1j.C18332a();
        for (Map.Entry entry2 : map2.entrySet()) {
            c18332a.m152497a((String) entry2.getKey(), (String) entry2.getValue());
        }
        x1d0.C21228a c21228a = new x1d0.C21228a();
        if (!TextUtils.isEmpty(str3)) {
            c21228a.m209034h("host", str3);
        }
        rg50VarM181365c.mo181341a(c21228a.m209043q(str4).m209038l(c18332a.m152498b()).m209028b()).mo135840h(new C21358a(System.currentTimeMillis(), str4, i, str, str3, str2, map, wk80Var));
    }
}
