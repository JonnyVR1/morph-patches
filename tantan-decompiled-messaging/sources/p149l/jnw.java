package p149l;

import androidx.annotation.NonNull;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class jnw {

    /* JADX INFO: renamed from: a */
    private String f118892a;

    /* JADX INFO: renamed from: b */
    private String f118893b;

    /* JADX INFO: renamed from: c */
    private String f118894c;

    /* JADX INFO: renamed from: d */
    private pnw f118895d;

    /* JADX INFO: renamed from: e */
    private pnw f118896e;

    /* JADX INFO: renamed from: a */
    public void m142393a(pnw pnwVar) {
        this.f118895d = pnwVar;
    }

    /* JADX INFO: renamed from: b */
    public void m142394b(String str) {
        this.f118892a = str;
    }

    /* JADX INFO: renamed from: c */
    public void m142395c(String str) {
        this.f118893b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m142396d(String str) {
        this.f118894c = str;
    }

    /* JADX INFO: renamed from: e */
    public void m142397e(pnw pnwVar) {
        this.f118896e = pnwVar;
    }

    @NonNull
    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bz_1", this.f118892a);
            jSONObject.put("bz_2", this.f118893b);
            jSONObject.put("bz_3", this.f118894c);
            pnw pnwVar = this.f118895d;
            jSONObject.put("json_body", pnwVar != null ? pnwVar.m170471d() : new JSONObject());
            pnw pnwVar2 = this.f118896e;
            jSONObject.put("extra", pnwVar2 != null ? pnwVar2.m170471d() : new JSONObject());
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return WeJson.EMPTY_MAP;
        }
    }
}
