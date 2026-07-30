package p149l;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class r5c {
    /* JADX INFO: renamed from: a */
    private static JSONObject m177927a() throws JSONException {
        mgf0 mgf0VarM137166d = inw.m137166d();
        JSONObject jSONObjectMo132027a = mgf0VarM137166d != null ? mgf0VarM137166d.mo132027a() : new JSONObject();
        jSONObjectMo132027a.put("log_t", System.currentTimeMillis());
        return jSONObjectMo132027a;
    }

    /* JADX INFO: renamed from: b */
    private static JSONArray m177928b(@NonNull List<jnw> list) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<jnw> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next().toString()));
            }
            return jSONArray;
        } catch (Exception e) {
            inw.m137183u(e);
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m177929c(@NonNull List<jnw> list) throws JSONException {
        JSONObject jSONObjectM177927a = m177927a();
        jSONObjectM177927a.put("list", m177928b(list));
        return jSONObjectM177927a;
    }

    /* JADX INFO: renamed from: d */
    public static jnw m177930d(gxv gxvVar) {
        try {
            jnw jnwVar = new jnw();
            jnwVar.m142397e(gxvVar.f104929b);
            jnwVar.m142393a(gxvVar.f104928a);
            jnwVar.m142394b(gxvVar.business);
            jnwVar.m142395c(gxvVar.secondLBusiness);
            jnwVar.m142396d(gxvVar.thirdLBusiness);
            return jnwVar;
        } catch (Exception e) {
            inw.m137183u(e);
            return null;
        }
    }
}
