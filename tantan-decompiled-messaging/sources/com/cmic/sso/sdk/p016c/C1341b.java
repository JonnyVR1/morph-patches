package com.cmic.sso.sdk.p016c;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p016c.p018b.AbstractC1348g;
import com.cmic.sso.sdk.p016c.p018b.C1344c;
import com.cmic.sso.sdk.p016c.p018b.C1345d;
import com.cmic.sso.sdk.p016c.p019c.C1353c;
import com.cmic.sso.sdk.p016c.p020d.C1357b;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1377q;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C1341b {

    /* JADX INFO: renamed from: a */
    private String f5579a;

    /* JADX INFO: renamed from: b */
    private String f5580b;

    /* JADX INFO: renamed from: a */
    public C1353c m7099a(C1353c c1353c, C1357b c1357b, C1316a c1316a) {
        List<String> list;
        Map<String, List<String>> mapM7186b = c1357b.m7186b();
        if (TextUtils.isEmpty(this.f5579a) && (list = mapM7186b.get("pplocation")) != null && list.size() > 0) {
            this.f5579a = list.get(0);
        }
        C1377q.m7308b(c1316a, String.valueOf(c1357b.m7185a()));
        List<String> list2 = mapM7186b.get("Location");
        if (list2 == null || list2.isEmpty()) {
            list2 = mapM7186b.get("Location".toLowerCase());
        }
        if (list2 != null && list2.size() > 0) {
            String str = list2.get(0);
            this.f5580b = str;
            if (!TextUtils.isEmpty(str)) {
                String strM6969b = c1316a.m6969b("operatortype", "0");
                if ("2".equals(strM6969b)) {
                    C1377q.m7304a(c1316a, "getUnicomMobile");
                } else if ("3".equals(strM6969b)) {
                    C1377q.m7304a(c1316a, "getTelecomMobile");
                } else {
                    C1377q.m7304a(c1316a, Constraint.NONE);
                }
            }
        }
        C1363c.m7234b("Location", this.f5580b);
        C1353c c1353cM7098a = m7098a(this.f5580b, c1353c.m7177f(), "GET", new C1344c(c1353c.m7181j().mo7102a()));
        c1353cM7098a.m7170a(c1353c.m7178g());
        return c1353cM7098a;
    }

    /* JADX INFO: renamed from: b */
    public C1353c m7101b(C1353c c1353c, C1357b c1357b, C1316a c1316a) {
        String strM6969b = c1316a.m6969b("operatortype", "0");
        if ("2".equals(strM6969b)) {
            C1377q.m7304a(c1316a, "getNewUnicomPhoneNumberNotify");
        } else if ("3".equals(strM6969b)) {
            C1377q.m7304a(c1316a, "getNewTelecomPhoneNumberNotify");
        } else {
            C1377q.m7304a(c1316a, Constraint.NONE);
        }
        C1377q.m7308b(c1316a, String.valueOf(c1357b.m7185a()));
        C1345d c1345d = new C1345d(c1353c.m7181j().mo7102a(), "1.0", c1357b.m7187c());
        c1345d.m7134c(c1316a.m6968b("userCapaid"));
        if (c1316a.m6971c("logintype") == 3 || c1316a.m6970b("isRisk", false)) {
            c1345d.m7133b("pre");
        } else {
            c1345d.m7133b("authz");
        }
        C1353c c1353cM7098a = m7098a(this.f5579a, c1353c.m7177f(), "POST", c1345d);
        c1353cM7098a.m7170a(c1353c.m7178g());
        this.f5579a = null;
        return c1353cM7098a;
    }

    /* JADX INFO: renamed from: a */
    private C1353c m7098a(String str, String str2, String str3, AbstractC1348g abstractC1348g) {
        C1353c c1353c = new C1353c(str, abstractC1348g, str3, str2);
        if (str3.equals("GET")) {
            c1353c.m7171a("Content-Type", MimeTypes.FORM_ENCODED);
        }
        return c1353c;
    }

    /* JADX INFO: renamed from: a */
    public String m7100a() {
        return this.f5579a;
    }
}
