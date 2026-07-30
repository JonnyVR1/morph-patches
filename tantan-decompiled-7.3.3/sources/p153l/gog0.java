package p153l;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gog0 {

    /* JADX INFO: renamed from: a */
    public boolean f105289a;

    /* JADX INFO: renamed from: b */
    public ArrayList f105290b;

    /* JADX INFO: renamed from: c */
    public String f105291c;

    /* JADX INFO: renamed from: d */
    public String f105292d = "text";

    /* JADX INFO: renamed from: e */
    public boolean f105293e = true;

    /* JADX INFO: renamed from: f */
    public boolean f105294f = true;

    /* JADX INFO: renamed from: a */
    public static gog0 m131110a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        gog0 gog0Var = new gog0();
        try {
            JSONObject jSONObject = new JSONObject(str);
            gog0Var.f105289a = jSONObject.optBoolean("isOpen");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("wordList");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String string = jSONArrayOptJSONArray.getString(i);
                    if (!string.isEmpty()) {
                        arrayList.add(string);
                    }
                }
                gog0Var.f105290b = arrayList;
            }
            gog0Var.f105291c = jSONObject.optString("wordLanguage");
            if (!jSONObject.isNull("wordType")) {
                gog0Var.f105292d = jSONObject.optString("wordType");
            }
            gog0Var.f105293e = jSONObject.optBoolean("enableIsHit");
            gog0Var.f105294f = jSONObject.optBoolean("enableIsReturnText");
            return gog0Var;
        } catch (Exception e) {
            e.printStackTrace();
            return gog0Var;
        }
    }
}
