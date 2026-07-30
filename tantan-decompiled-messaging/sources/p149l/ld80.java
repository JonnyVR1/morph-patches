package p149l;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ld80 {

    /* JADX INFO: renamed from: a */
    private String f127524a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f127525b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f127526c;

    /* JADX INFO: renamed from: d */
    private syi[] f127527d;

    /* JADX INFO: renamed from: a */
    public stc0 m149403a() {
        utc0 utc0VarM177041b;
        syi[] syiVarArr = this.f127527d;
        if (syiVarArr == null || syiVarArr.length == 0) {
            qyi.C19606a c19606a = new qyi.C19606a();
            Map<String, String> map = this.f127526c;
            if (map != null && !map.isEmpty()) {
                for (String str : this.f127526c.keySet()) {
                    c19606a.m177040a(str, this.f127526c.get(str));
                }
            }
            utc0VarM177041b = c19606a.m177041b();
        } else {
            cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
            Map<String, String> map2 = this.f127526c;
            if (map2 != null && !map2.isEmpty()) {
                for (String str2 : this.f127526c.keySet()) {
                    c16191aM107600f.m107597c(oxk.m166553j(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str2 + "\""), utc0.create((hyx) null, this.f127526c.get(str2)));
                }
            }
            syi[] syiVarArr2 = this.f127527d;
            if (syiVarArr2.length > 0) {
                syi syiVar = syiVarArr2[0];
                throw null;
            }
            utc0VarM177041b = c16191aM107600f.m107599e();
        }
        oxk.C19066a c19066a = new oxk.C19066a();
        Map<String, String> map3 = this.f127525b;
        if (map3 != null && !map3.isEmpty()) {
            for (String str3 : this.f127525b.keySet()) {
                c19066a.m166563a(str3, this.f127525b.get(str3));
            }
        }
        return new stc0.C20027a().m185898q(this.f127524a).m185890i(c19066a.m166567e()).m185893l(utc0VarM177041b).m185883b();
    }

    /* JADX INFO: renamed from: b */
    public ld80 m149404b(syi... syiVarArr) {
        this.f127527d = syiVarArr;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public ld80 m149405c(Map<String, String> map) {
        this.f127525b = map;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public ld80 m149406d(Map<String, String> map) {
        this.f127526c = map;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public ld80 m149407e(String str) {
        this.f127524a = str;
        return this;
    }
}
