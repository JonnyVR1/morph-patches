package p153l;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ul80 {

    /* JADX INFO: renamed from: a */
    private String f179490a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f179491b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f179492c;

    /* JADX INFO: renamed from: d */
    private n1j[] f179493d;

    /* JADX INFO: renamed from: a */
    public x1d0 m196542a() {
        z1d0 z1d0VarM152498b;
        n1j[] n1jVarArr = this.f179493d;
        if (n1jVarArr == null || n1jVarArr.length == 0) {
            l1j.C18332a c18332a = new l1j.C18332a();
            Map<String, String> map = this.f179492c;
            if (map != null && !map.isEmpty()) {
                for (String str : this.f179492c.keySet()) {
                    c18332a.m152497a(str, this.f179492c.get(str));
                }
            }
            z1d0VarM152498b = c18332a.m152498b();
        } else {
            ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
            Map<String, String> map2 = this.f179492c;
            if (map2 != null && !map2.isEmpty()) {
                for (String str2 : this.f179492c.keySet()) {
                    c18260aM151432f.m151429c(e0l.m118872j(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str2 + "\""), z1d0.create((e7y) null, this.f179492c.get(str2)));
                }
            }
            n1j[] n1jVarArr2 = this.f179493d;
            if (n1jVarArr2.length > 0) {
                n1j n1jVar = n1jVarArr2[0];
                throw null;
            }
            z1d0VarM152498b = c18260aM151432f.m151431e();
        }
        e0l.C16674a c16674a = new e0l.C16674a();
        Map<String, String> map3 = this.f179491b;
        if (map3 != null && !map3.isEmpty()) {
            for (String str3 : this.f179491b.keySet()) {
                c16674a.m118882a(str3, this.f179491b.get(str3));
            }
        }
        return new x1d0.C21228a().m209043q(this.f179490a).m209035i(c16674a.m118886e()).m209038l(z1d0VarM152498b).m209028b();
    }

    /* JADX INFO: renamed from: b */
    public ul80 m196543b(n1j... n1jVarArr) {
        this.f179493d = n1jVarArr;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public ul80 m196544c(Map<String, String> map) {
        this.f179491b = map;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public ul80 m196545d(Map<String, String> map) {
        this.f179492c = map;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public ul80 m196546e(String str) {
        this.f179490a = str;
        return this;
    }
}
