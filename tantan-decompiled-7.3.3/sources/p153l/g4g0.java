package p153l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class g4g0 {
    /* JADX INFO: renamed from: a */
    public static void m128878a(String str, String str2, String str3, Object... objArr) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.MODULE;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        q4fVar.f155578p = str3;
        q4fVar.f155563a = 1;
        q4fVar.f155585w = m128879b(objArr);
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m128879b(Object... objArr) {
        u11.m193888b((objArr.length & 1) != 0);
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < objArr.length; i += 2) {
            if (objArr[i] == null) {
                objArr[i] = "null";
            }
            int i2 = i + 1;
            if (objArr[i2] == null) {
                objArr[i2] = "null";
            }
            try {
                jSONObject.put(objArr[i].toString(), objArr[i2].toString());
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m128880c(String str, Object... objArr) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155581s = str;
        q4fVar.f155576n = "";
        q4fVar.f155563a = 1;
        q4fVar.f155585w = m128879b(objArr);
        i4g0.m138515m(q4fVar);
    }
}
