package p153l;

import androidx.annotation.NonNull;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class hqw {

    /* JADX INFO: renamed from: a */
    private String f111192a;

    /* JADX INFO: renamed from: b */
    private String f111193b;

    /* JADX INFO: renamed from: c */
    private String f111194c;

    /* JADX INFO: renamed from: d */
    private nqw f111195d;

    /* JADX INFO: renamed from: e */
    private nqw f111196e;

    /* JADX INFO: renamed from: a */
    public void m136703a(nqw nqwVar) {
        this.f111195d = nqwVar;
    }

    /* JADX INFO: renamed from: b */
    public void m136704b(String str) {
        this.f111192a = str;
    }

    /* JADX INFO: renamed from: c */
    public void m136705c(String str) {
        this.f111193b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m136706d(String str) {
        this.f111194c = str;
    }

    /* JADX INFO: renamed from: e */
    public void m136707e(nqw nqwVar) {
        this.f111196e = nqwVar;
    }

    @NonNull
    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bz_1", this.f111192a);
            jSONObject.put("bz_2", this.f111193b);
            jSONObject.put("bz_3", this.f111194c);
            nqw nqwVar = this.f111195d;
            jSONObject.put("json_body", nqwVar != null ? nqwVar.m164358d() : new JSONObject());
            nqw nqwVar2 = this.f111196e;
            jSONObject.put("extra", nqwVar2 != null ? nqwVar2.m164358d() : new JSONObject());
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return WeJson.EMPTY_MAP;
        }
    }
}
