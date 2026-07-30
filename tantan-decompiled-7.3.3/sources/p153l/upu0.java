package p153l;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class upu0 {

    /* JADX INFO: renamed from: a */
    public final Executor f180328a;

    /* JADX INFO: renamed from: b */
    public final ppu0 f180329b;

    public upu0(Executor executor, ppu0 ppu0Var) {
        this.f180328a = executor;
        this.f180329b = ppu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m197190a(JSONObject jSONObject, String str) {
        hpr hprVarM173981h;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return pvw0.m173981h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                hprVarM173981h = pvw0.m173981h(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                if (strOptString == null) {
                    hprVarM173981h = pvw0.m173981h(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    hprVarM173981h = "string".equals(strOptString2) ? pvw0.m173981h(new tpu0(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? pvw0.m173986m(this.f180329b.m173262e(jSONObjectOptJSONObject, "image_value"), new eow0() { // from class: l.rpu0
                        @Override // p153l.eow0
                        public final Object apply(Object obj) {
                            return new tpu0(strOptString, (fks0) obj);
                        }
                    }, this.f180328a) : pvw0.m173981h(null);
                }
            }
            arrayList.add(hprVarM173981h);
        }
        return pvw0.m173986m(pvw0.m173977d(arrayList), new eow0() { // from class: l.spu0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (tpu0 tpu0Var : (List) obj) {
                    if (tpu0Var != null) {
                        arrayList2.add(tpu0Var);
                    }
                }
                return arrayList2;
            }
        }, this.f180328a);
    }
}
