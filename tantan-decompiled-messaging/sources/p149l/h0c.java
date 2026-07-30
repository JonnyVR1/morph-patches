package p149l;

import com.p046p1.mobile.putong.data.ResourceDirection;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class h0c {

    /* JADX INFO: renamed from: a */
    private final k850 f105207a;

    public h0c(String str) {
        k850.C17954b c17954bM144889j = new k850.C17954b().m144889j(new nsm(str));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f105207a = c17954bM144889j.m144903x(5L, timeUnit).m144900u(true).m144899t(5L, timeUnit).m144882c();
    }

    /* JADX INFO: renamed from: b */
    private String m128948b(String str, String str2, String str3) throws Exception {
        e5e.m114785b("CosmosSdkDns", "request url:%s, params:%s", str2, str3);
        String strM193873g = uie.m193873g(6);
        String strM141098b = je2.m141098b(uie.m193869a(strM193873g.getBytes()));
        String strM193875c = uie.m193870d().m193875c(str3, strM193873g);
        qyi.C19606a c19606a = new qyi.C19606a();
        c19606a.m177040a("mzip", strM193875c);
        c19606a.m177040a("msc", strM141098b);
        exc0 exc0VarExecute = this.f105207a.mo144849a(new stc0.C20027a().m185898q(str2).m185893l(c19606a.m177041b()).m185882a("User-Agent", j0c.m139158b(str).getUserAgent()).m185883b()).execute();
        try {
            if (exc0VarExecute.m118609q() == 304) {
                exc0VarExecute.close();
                return "304";
            }
            e5e.m114784a("CosmosSdkDns", "result code:" + exc0VarExecute.m118609q());
            byte[] bArrBytes = exc0VarExecute.m118606k().bytes();
            exc0VarExecute.close();
            String strM193874b = uie.m193870d().m193874b(new String(bArrBytes, "UTF-8"), strM193873g);
            e5e.m114784a("CosmosSdkDns", "descResult: " + strM193874b);
            return strM193874b;
        } catch (Throwable th) {
            if (exc0VarExecute != null) {
                try {
                    exc0VarExecute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m128949a(String str, String str2, String str3) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("etag", str3);
        jSONObject.put("appid", str);
        jSONObject.put("keystore_sha1", j0c.m139158b(str).mo105303c());
        jSONObject.put("dn", str2);
        jSONObject.put("os", "Android");
        jSONObject.put(ResourceDirection.f38808v, 2);
        return m128948b(str, "https://httpdns.immomo.com/resolve", jSONObject.toString());
    }
}
