package com.cmic.sso.sdk.p017c;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p017c.p019b.AbstractC1371g;
import com.cmic.sso.sdk.p017c.p019b.C1367c;
import com.cmic.sso.sdk.p017c.p019b.C1368d;
import com.cmic.sso.sdk.p017c.p020c.C1376c;
import com.cmic.sso.sdk.p017c.p021d.C1380b;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1400q;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C1364b {

    /* JADX INFO: renamed from: a */
    private String f5616a;

    /* JADX INFO: renamed from: b */
    private String f5617b;

    /* JADX INFO: renamed from: a */
    public C1376c m7153a(C1376c c1376c, C1380b c1380b, C1339a c1339a) {
        List<String> list;
        Map<String, List<String>> mapM7240b = c1380b.m7240b();
        if (TextUtils.isEmpty(this.f5616a) && (list = mapM7240b.get("pplocation")) != null && list.size() > 0) {
            this.f5616a = list.get(0);
        }
        C1400q.m7362b(c1339a, String.valueOf(c1380b.m7239a()));
        List<String> list2 = mapM7240b.get("Location");
        if (list2 == null || list2.isEmpty()) {
            list2 = mapM7240b.get("Location".toLowerCase());
        }
        if (list2 != null && list2.size() > 0) {
            String str = list2.get(0);
            this.f5617b = str;
            if (!TextUtils.isEmpty(str)) {
                String strM7023b = c1339a.m7023b("operatortype", "0");
                if ("2".equals(strM7023b)) {
                    C1400q.m7358a(c1339a, "getUnicomMobile");
                } else if ("3".equals(strM7023b)) {
                    C1400q.m7358a(c1339a, "getTelecomMobile");
                } else {
                    C1400q.m7358a(c1339a, Constraint.NONE);
                }
            }
        }
        C1386c.m7288b("Location", this.f5617b);
        C1376c c1376cM7152a = m7152a(this.f5617b, c1376c.m7231f(), "GET", new C1367c(c1376c.m7235j().mo7156a()));
        c1376cM7152a.m7224a(c1376c.m7232g());
        return c1376cM7152a;
    }

    /* JADX INFO: renamed from: b */
    public C1376c m7155b(C1376c c1376c, C1380b c1380b, C1339a c1339a) {
        String strM7023b = c1339a.m7023b("operatortype", "0");
        if ("2".equals(strM7023b)) {
            C1400q.m7358a(c1339a, "getNewUnicomPhoneNumberNotify");
        } else if ("3".equals(strM7023b)) {
            C1400q.m7358a(c1339a, "getNewTelecomPhoneNumberNotify");
        } else {
            C1400q.m7358a(c1339a, Constraint.NONE);
        }
        C1400q.m7362b(c1339a, String.valueOf(c1380b.m7239a()));
        C1368d c1368d = new C1368d(c1376c.m7235j().mo7156a(), "1.0", c1380b.m7241c());
        c1368d.m7188c(c1339a.m7022b("userCapaid"));
        if (c1339a.m7025c("logintype") == 3 || c1339a.m7024b("isRisk", false)) {
            c1368d.m7187b("pre");
        } else {
            c1368d.m7187b("authz");
        }
        C1376c c1376cM7152a = m7152a(this.f5616a, c1376c.m7231f(), "POST", c1368d);
        c1376cM7152a.m7224a(c1376c.m7232g());
        this.f5616a = null;
        return c1376cM7152a;
    }

    /* JADX INFO: renamed from: a */
    private C1376c m7152a(String str, String str2, String str3, AbstractC1371g abstractC1371g) {
        C1376c c1376c = new C1376c(str, abstractC1371g, str3, str2);
        if (str3.equals("GET")) {
            c1376c.m7225a("Content-Type", MimeTypes.FORM_ENCODED);
        }
        return c1376c;
    }

    /* JADX INFO: renamed from: a */
    public String m7154a() {
        return this.f5616a;
    }
}
