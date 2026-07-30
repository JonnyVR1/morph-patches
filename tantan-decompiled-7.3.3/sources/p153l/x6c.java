package p153l;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class x6c {
    /* JADX INFO: renamed from: a */
    private static JSONObject m209464a() throws JSONException {
        tof0 tof0VarM131480d = gqw.m131480d();
        JSONObject jSONObjectMo126808a = tof0VarM131480d != null ? tof0VarM131480d.mo126808a() : new JSONObject();
        jSONObjectMo126808a.put("log_t", System.currentTimeMillis());
        return jSONObjectMo126808a;
    }

    /* JADX INFO: renamed from: b */
    private static JSONArray m209465b(@NonNull List<hqw> list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<hqw> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next().toString()));
            }
            return jSONArray;
        } catch (Exception e) {
            gqw.m131497u(e);
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m209466c(@NonNull List<hqw> list) throws JSONException {
        JSONObject jSONObjectM209464a = m209464a();
        jSONObjectM209464a.put("list", m209465b(list));
        return jSONObjectM209464a;
    }

    /* JADX INFO: renamed from: d */
    public static hqw m209467d(fzv fzvVar) {
        try {
            hqw hqwVar = new hqw();
            hqwVar.m136707e(fzvVar.f101551b);
            hqwVar.m136703a(fzvVar.f101550a);
            hqwVar.m136704b(fzvVar.business);
            hqwVar.m136705c(fzvVar.secondLBusiness);
            hqwVar.m136706d(fzvVar.thirdLBusiness);
            return hqwVar;
        } catch (Exception e) {
            gqw.m131497u(e);
            return null;
        }
    }
}
