package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.idv.identity.util.IdentityUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
public class rc80 {

    /* JADX INFO: renamed from: a */
    public static String f158746a = "";

    /* JADX INFO: renamed from: b */
    public static String f158747b = "";

    /* JADX INFO: renamed from: c */
    private static t3g f158748c;

    /* JADX INFO: renamed from: l.rc80$a */
    public class C19671a implements x74 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f158749a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f158750b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f158751c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f158752d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f158753e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f158754f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Map f158755g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ qc80 f158756h;

        public C19671a(long j, String str, int i, String str2, String str3, String str4, Map map, qc80 qc80Var) {
            this.f158749a = j;
            this.f158750b = str;
            this.f158751c = i;
            this.f158752d = str2;
            this.f158753e = str3;
            this.f158754f = str4;
            this.f158755g = map;
            this.f158756h = qc80Var;
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            String str = ((System.currentTimeMillis() - this.f158749a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s;
            ixq0.m138886c("Request failed: " + this.f158750b + " errorMsg" + iOException.getMessage() + "  (index + 1)=" + (this.f158751c + 1));
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onFailure", "onResponseFailure", "action", this.f158752d, "url", this.f158750b, "host", this.f158753e, "errorMsg", iOException.toString(), "timeCost", str);
            int i = this.f158751c + 1;
            s3g s3gVarM145459B = kcm.m145452H().m145459B();
            if (s3gVarM145459B != null && s3gVarM145459B.m182162c() != null && s3gVarM145459B.m182163d() != null) {
                s3gVarM145459B.m182161b();
                i = 0;
            }
            rc80.m178799g(i, this.f158752d, this.f158754f, this.f158755g, this.f158756h);
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
            String str = ((System.currentTimeMillis() - this.f158749a) / 1000.0d) + BLiveStormDanmakuGiftResourceType.f44446s;
            if (this.f158756h == null) {
                ixq0.m138886c("http error: build callbackError ");
                return;
            }
            if (exc0Var == null) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onFailure", "onResponseNull", "action", this.f158752d, "url", this.f158750b, "host", this.f158753e, "errorMsg", "http error: response is null ", "timeCost", str);
                int i = this.f158751c + 1;
                s3g s3gVarM145459B = kcm.m145452H().m145459B();
                if (s3gVarM145459B != null && s3gVarM145459B.m182162c() != null && s3gVarM145459B.m182163d() != null) {
                    s3gVarM145459B.m182161b();
                    i = 0;
                }
                rc80.m178799g(i, this.f158752d, this.f158754f, this.f158755g, this.f158756h);
                return;
            }
            if (exc0Var.m118597I()) {
                gxc0 gxc0VarM118606k = exc0Var.m118606k();
                String strString = gxc0VarM118606k != null ? gxc0VarM118606k.string() : "";
                oxk oxkVarM118595F = exc0Var.m118595F();
                ixq0.m138884a("http response body: " + strString + " Header: " + (oxkVarM118595F != null ? oxkVarM118595F.toString() : ""));
                if (strString.contains("InvalidTimeStamp.Expired")) {
                    strString = strString.replace("InvalidTimeStamp.Expired", String.valueOf(1009));
                }
                s3g s3gVarM145459B2 = kcm.m145452H().m145459B();
                if (s3gVarM145459B2 != null) {
                    s3gVarM145459B2.m182160a(this.f158750b, this.f158753e);
                }
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onSuccess", "onResponseSuc:", "action", this.f158752d, "url", this.f158750b, "host", this.f158753e, "timeCost", str);
                qc80 qc80Var = this.f158756h;
                if (qc80Var != null) {
                    qc80Var.onSuccess(exc0Var.m118609q(), strString);
                    return;
                }
                return;
            }
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "ACTION_API_RESPONSE", "onFailure", "onResponseNotSuc", "action", this.f158752d, "url", this.f158750b, "host", this.f158753e, "isSuccessful", exc0Var.m118597I() + "", "errorMsg", exc0Var.toString(), "timeCost", str);
            int i2 = this.f158751c + 1;
            s3g s3gVarM145459B3 = kcm.m145452H().m145459B();
            if (s3gVarM145459B3 != null && s3gVarM145459B3.m182162c() != null && s3gVarM145459B3.m182163d() != null) {
                s3gVarM145459B3.m182161b();
                i2 = 0;
            }
            ixq0.m138886c("Response not successful: fallback  action" + this.f158752d + exc0Var.m118609q());
            rc80.m178799g(i2, this.f158752d, this.f158754f, this.f158755g, this.f158756h);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m178794b(Map<String, String> map, String str) throws Exception {
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
            sb.append(m178795c(str2, str));
            sb.append("=");
            sb.append(m178795c(map.get(str2), str));
        }
        return IdentityUtils.m18163gs("POST&" + m178795c("/", str) + "&" + m178795c(sb.toString(), str));
    }

    /* JADX INFO: renamed from: c */
    private static String m178795c(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return URLEncoder.encode(str, str2).replace(Marker.ANY_NON_NULL_MARKER, "%20").replace("*", "%2A").replace("%7E", "~");
    }

    /* JADX INFO: renamed from: d */
    private static String m178796d(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat.format(date);
    }

    /* JADX INFO: renamed from: e */
    public static void m178797e(t3g t3gVar) {
        f158748c = t3gVar;
    }

    /* JADX INFO: renamed from: f */
    public static void m178798f(String str, String str2, Map<String, String> map, qc80 qc80Var) {
        t3g t3gVar = f158748c;
        if (t3gVar == null) {
            ixq0.m138886c("FallbackConfigManager not initialized.");
            return;
        }
        t3g.InterfaceC20102a interfaceC20102aM187114a = t3gVar.m187114a();
        List<String> listMo108517b = interfaceC20102aM187114a.mo108517b();
        interfaceC20102aM187114a.mo108516a();
        if (listMo108517b.isEmpty()) {
            ixq0.m138886c("No fallback URLs configured.");
        } else {
            m178799g(0, str, str2, map, qc80Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m178799g(int i, String str, String str2, Map<String, String> map, qc80 qc80Var) {
        String strM182163d;
        String strM182162c;
        t3g t3gVar = f158748c;
        if (t3gVar == null || qc80Var == null) {
            return;
        }
        t3g.InterfaceC20102a interfaceC20102aM187114a = t3gVar.m187114a();
        s3g s3gVarM145459B = kcm.m145452H().m145459B();
        if (s3gVarM145459B == null || s3gVarM145459B.m182163d() == null || s3gVarM145459B.m182162c() == null) {
            if (interfaceC20102aM187114a == null) {
                qc80Var.onError(-1, "FallbackConfigManager is null");
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "FallbackConfigManager", Constants.KEY_CONFIG, " FallbackConfigManager is null");
                return;
            }
            List<String> listMo108517b = interfaceC20102aM187114a.mo108517b();
            List<String> listMo108516a = interfaceC20102aM187114a.mo108516a();
            if (listMo108517b == null || ((listMo108516a == null && i >= listMo108517b.size()) || i >= listMo108516a.size())) {
                qc80Var.onError(-1, "All fallback URLs failed");
                return;
            } else {
                strM182163d = listMo108517b.get(i);
                strM182162c = listMo108516a.get(i);
            }
        } else {
            strM182162c = s3gVarM145459B.m182162c();
            strM182163d = s3gVarM145459B.m182163d();
        }
        String str3 = strM182162c;
        String str4 = strM182163d;
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "tryNextUrl", FirebaseAnalytics.Param.INDEX, i + "", "url", str4, "host", str3, "action", str);
        k850.C17954b c17954b = new k850.C17954b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k850 k850VarM144882c = c17954b.m144885f(20L, timeUnit).m144899t(20L, timeUnit).m144903x(20L, timeUnit).m144882c();
        ixq0.m138884a("Trying URL: " + str4 + " HOST:" + str3);
        HashMap map2 = new HashMap();
        String str5 = f158746a;
        if (str5 == null || str5.isEmpty()) {
            f158746a = IdentityUtils.m18162gk();
        }
        map2.put("AccessKeyId", f158746a);
        map2.put("Format", JsonFactory.FORMAT_NAME_JSON);
        map2.put("SignatureMethod", "HMAC-SHA1");
        map2.put("TimestampKeep", m178796d(new Date()));
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
            map2.put(RequestParameters.SIGNATURE, m178794b(map2, "UTF-8"));
        } catch (Throwable unused) {
            map2.put(RequestParameters.SIGNATURE, "null");
        }
        qyi.C19606a c19606a = new qyi.C19606a();
        for (Map.Entry entry2 : map2.entrySet()) {
            c19606a.m177040a((String) entry2.getKey(), (String) entry2.getValue());
        }
        stc0.C20027a c20027a = new stc0.C20027a();
        if (!TextUtils.isEmpty(str3)) {
            c20027a.m185889h("host", str3);
        }
        k850VarM144882c.mo144849a(c20027a.m185898q(str4).m185893l(c19606a.m177041b()).m185883b()).mo96077h(new C19671a(System.currentTimeMillis(), str4, i, str, str3, str2, map, qc80Var));
    }
}
