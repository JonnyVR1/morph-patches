package p149l;

import androidx.annotation.Nullable;
import com.android.volley.C0918d;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qpq extends tpq<JSONObject> {
    @Deprecated
    public qpq(String str, @Nullable JSONObject jSONObject, C0918d.b<JSONObject> bVar, @Nullable C0918d.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    @Override // p149l.tpq, com.android.volley.Request
    public C0918d<JSONObject> parseNetworkResponse(sc20 sc20Var) {
        try {
            return C0918d.m5096c(new JSONObject(new String(sc20Var.f163699b, jkl.m141889f(sc20Var.f163700c, "utf-8"))), jkl.m141888e(sc20Var));
        } catch (UnsupportedEncodingException e) {
            return C0918d.m5095a(new ParseError(e));
        } catch (JSONException e2) {
            return C0918d.m5095a(new ParseError(e2));
        }
    }

    public qpq(String str, C0918d.b<JSONObject> bVar, @Nullable C0918d.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    public qpq(int i, String str, @Nullable JSONObject jSONObject, C0918d.b<JSONObject> bVar, @Nullable C0918d.a aVar) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
