package p009l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.l3f;
import l.n11;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xvf0 {
    /* JADX INFO: renamed from: a */
    public static void m25027a(String str, String str2, String str3, Object... objArr) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE;
        l3fVar.s = str;
        l3fVar.n = str2;
        l3fVar.p = str3;
        l3fVar.a = 1;
        l3fVar.w = m25028b(objArr);
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m25028b(Object... objArr) {
        n11.b((objArr.length & 1) != 0);
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
                CrashHelper.c(e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m25029c(String str, Object... objArr) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.s = str;
        l3fVar.n = "";
        l3fVar.a = 1;
        l3fVar.w = m25028b(objArr);
        zvf0.m(l3fVar);
    }
}
