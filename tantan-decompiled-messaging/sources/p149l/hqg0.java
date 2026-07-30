package p149l;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class hqg0 {

    /* JADX INFO: renamed from: a */
    public static final String f109056a = "SudGIP ".concat(hqg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public static final ArrayList f109057b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static String m132452a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", i);
            jSONObject.put("ret_msg", str);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
