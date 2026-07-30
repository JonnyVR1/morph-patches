package p153l;

import androidx.annotation.Nullable;
import com.android.volley.C0922d;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qrq extends urq<JSONObject> {
    @Deprecated
    public qrq(String str, @Nullable JSONObject jSONObject, C0922d.b<JSONObject> bVar, @Nullable C0922d.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    @Override // p153l.urq, com.android.volley.Request
    public C0922d<JSONObject> parseNetworkResponse(cl20 cl20Var) {
        try {
            return C0922d.m5106c(new JSONObject(new String(cl20Var.f82339b, xml.m211737f(cl20Var.f82340c, "utf-8"))), xml.m211736e(cl20Var));
        } catch (UnsupportedEncodingException e) {
            return C0922d.m5105a(new ParseError(e));
        } catch (JSONException e2) {
            return C0922d.m5105a(new ParseError(e2));
        }
    }

    public qrq(String str, C0922d.b<JSONObject> bVar, @Nullable C0922d.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    public qrq(int i, String str, @Nullable JSONObject jSONObject, C0922d.b<JSONObject> bVar, @Nullable C0922d.a aVar) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
