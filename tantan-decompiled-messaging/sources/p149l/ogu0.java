package p149l;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ogu0 {

    /* JADX INFO: renamed from: a */
    public final Executor f143918a;

    /* JADX INFO: renamed from: b */
    public final jgu0 f143919b;

    public ogu0(Executor executor, jgu0 jgu0Var) {
        this.f143918a = executor;
        this.f143919b = jgu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m164279a(JSONObject jSONObject, String str) {
        gnr gnrVarM142235h;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return jmw0.m142235h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                gnrVarM142235h = jmw0.m142235h(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                if (strOptString == null) {
                    gnrVarM142235h = jmw0.m142235h(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    gnrVarM142235h = "string".equals(strOptString2) ? jmw0.m142235h(new ngu0(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? jmw0.m142240m(this.f143919b.m141342e(jSONObjectOptJSONObject, "image_value"), new yew0() { // from class: l.lgu0
                        @Override // p149l.yew0
                        public final Object apply(Object obj) {
                            return new ngu0(strOptString, (zas0) obj);
                        }
                    }, this.f143918a) : jmw0.m142235h(null);
                }
            }
            arrayList.add(gnrVarM142235h);
        }
        return jmw0.m142240m(jmw0.m142231d(arrayList), new yew0() { // from class: l.mgu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (ngu0 ngu0Var : (List) obj) {
                    if (ngu0Var != null) {
                        arrayList2.add(ngu0Var);
                    }
                }
                return arrayList2;
            }
        }, this.f143918a);
    }
}
