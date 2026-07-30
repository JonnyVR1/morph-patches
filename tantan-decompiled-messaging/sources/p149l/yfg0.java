package p149l;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yfg0 {

    /* JADX INFO: renamed from: a */
    public boolean f198056a;

    /* JADX INFO: renamed from: b */
    public ArrayList f198057b;

    /* JADX INFO: renamed from: c */
    public String f198058c;

    /* JADX INFO: renamed from: d */
    public String f198059d = "text";

    /* JADX INFO: renamed from: e */
    public boolean f198060e = true;

    /* JADX INFO: renamed from: f */
    public boolean f198061f = true;

    /* JADX INFO: renamed from: a */
    public static yfg0 m214551a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        yfg0 yfg0Var = new yfg0();
        try {
            JSONObject jSONObject = new JSONObject(str);
            yfg0Var.f198056a = jSONObject.optBoolean("isOpen");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("wordList");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String string = jSONArrayOptJSONArray.getString(i);
                    if (!string.isEmpty()) {
                        arrayList.add(string);
                    }
                }
                yfg0Var.f198057b = arrayList;
            }
            yfg0Var.f198058c = jSONObject.optString("wordLanguage");
            if (!jSONObject.isNull("wordType")) {
                yfg0Var.f198059d = jSONObject.optString("wordType");
            }
            yfg0Var.f198060e = jSONObject.optBoolean("enableIsHit");
            yfg0Var.f198061f = jSONObject.optBoolean("enableIsReturnText");
            return yfg0Var;
        } catch (Exception e) {
            e.printStackTrace();
            return yfg0Var;
        }
    }
}
