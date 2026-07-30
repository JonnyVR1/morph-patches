package p153l;

import com.p051p1.mobile.putong.data.ResourceDirection;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class u1c {

    /* JADX INFO: renamed from: a */
    private final rg50 f176983a;

    public u1c(String str) {
        rg50.C19837b c19837bM181372j = new rg50.C19837b().m181372j(new pum(str));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f176983a = c19837bM181372j.m181387y(5L, timeUnit).m181384v(true).m181383u(5L, timeUnit).m181365c();
    }

    /* JADX INFO: renamed from: b */
    private String m193951b(String str, String str2, String str3) throws Exception {
        s6e.m184883b("CosmosSdkDns", "request url:%s, params:%s", str2, str3);
        String strM216404g = yje.m216404g(6);
        String strM180959b = re2.m180959b(yje.m216400a(strM216404g.getBytes()));
        String strM216406c = yje.m216401d().m216406c(str3, strM216404g);
        l1j.C18332a c18332a = new l1j.C18332a();
        c18332a.m152497a("mzip", strM216406c);
        c18332a.m152497a("msc", strM180959b);
        i5d0 i5d0VarExecute = this.f176983a.mo181341a(new x1d0.C21228a().m209043q(str2).m209038l(c18332a.m152498b()).m209027a("User-Agent", w1c.m204391b(str).getUserAgent()).m209028b()).execute();
        try {
            if (i5d0VarExecute.m138673q() == 304) {
                i5d0VarExecute.close();
                return "304";
            }
            s6e.m184882a("CosmosSdkDns", "result code:" + i5d0VarExecute.m138673q());
            byte[] bArrBytes = i5d0VarExecute.m138670k().bytes();
            i5d0VarExecute.close();
            String strM216405b = yje.m216401d().m216405b(new String(bArrBytes, "UTF-8"), strM216404g);
            s6e.m184882a("CosmosSdkDns", "descResult: " + strM216405b);
            return strM216405b;
        } catch (Throwable th) {
            if (i5d0VarExecute != null) {
                try {
                    i5d0VarExecute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m193952a(String str, String str2, String str3) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("etag", str3);
        jSONObject.put("appid", str);
        jSONObject.put("keystore_sha1", w1c.m204391b(str).mo155716c());
        jSONObject.put("dn", str2);
        jSONObject.put("os", "Android");
        jSONObject.put(ResourceDirection.f39656v, 2);
        return m193951b(str, "https://httpdns.immomo.com/resolve", jSONObject.toString());
    }
}
