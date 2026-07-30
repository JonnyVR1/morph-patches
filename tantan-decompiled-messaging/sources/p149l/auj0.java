package p149l;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes13.dex */
public class auj0 {

    /* JADX INFO: renamed from: a */
    public static k850 f71784a;

    /* JADX INFO: renamed from: b */
    public static final hyx f71785b = hyx.m133628d("application/json; charset=utf-8");

    static {
        k850.C17954b c17954bM144885f = new k850.C17954b().m144885f(5L, TimeUnit.SECONDS);
        asi0.m98594a(c17954bM144885f);
        f71784a = c17954bM144885f.m144882c();
    }

    /* JADX INFO: renamed from: a */
    public static JsonArray m98995a(List<r3f> list) {
        HashMap map = new HashMap();
        for (r3f r3fVar : list) {
            JsonObject jsonObject = (JsonObject) new JsonParser().parse(r3fVar.f157527b);
            JsonObject jsonObject2 = (JsonObject) new JsonParser().parse(r3fVar.f157528c);
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
    public static boolean m98996b(String str, JsonArray jsonArray, int i) {
        exc0 exc0VarExecute;
        if (jsonArray == null || jsonArray.size() <= 0 || !zvf0.m220386h()) {
            return true;
        }
        try {
            utc0 utc0VarCreate = utc0.create(f71785b, ygj.m214725a(jsonArray.toString()));
            Object objM81325d = dwf0.m113869f().m113873d().m81325d("build");
            if (objM81325d == null) {
                objM81325d = "";
            }
            stc0 stc0VarM185883b = new stc0.C20027a().m185898q(str).m185882a("count", "" + i).m185882a("buildv", objM81325d.toString()).m185882a("sdkv", "0.9.3.2-SNAPSHOT").m185882a("Content-Encoding", HttpHeaderValues.GZIP).m185882a("localId", stv.m185972a(zvf0.m220383e())).m185893l(utc0VarCreate).m185883b();
            k850 k850VarM220384f = zvf0.m220384f();
            if (k850VarM220384f == null) {
                k850VarM220384f = f71784a;
            }
            exc0VarExecute = k850VarM220384f.mo144849a(stc0VarM185883b).execute();
        } catch (Exception e) {
            sm80.m184942b(e);
            exc0VarExecute = null;
        }
        if (exc0VarExecute == null) {
            return false;
        }
        boolean z = exc0VarExecute.m118609q() == 200;
        exc0VarExecute.close();
        return z;
    }
}
