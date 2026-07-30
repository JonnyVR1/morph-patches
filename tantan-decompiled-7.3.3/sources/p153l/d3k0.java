package p153l;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes11.dex */
public class d3k0 {

    /* JADX INFO: renamed from: a */
    public static rg50 f84914a;

    /* JADX INFO: renamed from: b */
    public static final e7y f84915b = e7y.m119773d("application/json; charset=utf-8");

    static {
        rg50.C19837b c19837bM181368f = new rg50.C19837b().m181368f(5L, TimeUnit.SECONDS);
        d1j0.m113576a(c19837bM181368f);
        f84914a = c19837bM181368f.m181365c();
    }

    /* JADX INFO: renamed from: a */
    public static JsonArray m113833a(List<v4f> list) {
        HashMap map = new HashMap();
        for (v4f v4fVar : list) {
            JsonObject jsonObject = (JsonObject) new JsonParser().parse(v4fVar.f182359b);
            JsonObject jsonObject2 = (JsonObject) new JsonParser().parse(v4fVar.f182360c);
            if (jsonObject != null && jsonObject2 != null && !jsonObject.entrySet().isEmpty()) {
                JsonArray jsonArray = (JsonArray) map.get(jsonObject);
                if (jsonArray == null) {
                    JsonArray jsonArray2 = new JsonArray();
                    jsonObject2.addProperty("sdtm", Long.valueOf(System.currentTimeMillis()));
                    jsonArray2.add(jsonObject2);
                    map.put(jsonObject, jsonArray2);
                } else {
                    jsonObject2.addProperty("sdtm", Long.valueOf(System.currentTimeMillis()));
                    jsonArray.add(jsonObject2);
                }
            }
        }
        JsonArray jsonArray3 = new JsonArray();
        for (Map.Entry entry : map.entrySet()) {
            JsonObject jsonObject3 = (JsonObject) entry.getKey();
            jsonObject3.add("evs", (JsonArray) entry.getValue());
            jsonArray3.add(jsonObject3);
        }
        return jsonArray3;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m113834b(String str, JsonArray jsonArray, int i) {
        i5d0 i5d0VarExecute;
        if (jsonArray == null || jsonArray.size() <= 0 || !i4g0.m138510h()) {
            return true;
        }
        try {
            z1d0 z1d0VarCreate = z1d0.create(f84915b, sjj.m186098a(jsonArray.toString()));
            Object objM82508d = m4g0.m157014f().m157018d().m82508d("build");
            if (objM82508d == null) {
                objM82508d = "";
            }
            x1d0 x1d0VarM209028b = new x1d0.C21228a().m209043q(str).m209027a("count", "" + i).m209027a("buildv", objM82508d.toString()).m209027a("sdkv", "0.9.3.2-SNAPSHOT").m209027a("Content-Encoding", HttpHeaderValues.GZIP).m209027a("localId", tvv.m192837a(i4g0.m138507e())).m209038l(z1d0VarCreate).m209028b();
            rg50 rg50VarM138508f = i4g0.m138508f();
            if (rg50VarM138508f == null) {
                rg50VarM138508f = f84914a;
            }
            i5d0VarExecute = rg50VarM138508f.mo181341a(x1d0VarM209028b).execute();
        } catch (Exception e) {
            wu80.m207938b(e);
            i5d0VarExecute = null;
        }
        if (i5d0VarExecute == null) {
            return false;
        }
        boolean z = i5d0VarExecute.m138673q() == 200;
        i5d0VarExecute.close();
        return z;
    }
}
