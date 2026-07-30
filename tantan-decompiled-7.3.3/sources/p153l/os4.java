package p153l;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class os4 {
    /* JADX INFO: renamed from: a */
    public static ms4 m168959a(File file) {
        Map<String, String> mapM168960b = m168960b(file);
        if (mapM168960b == null) {
            return null;
        }
        String str = mapM168960b.get("channel");
        mapM168960b.remove("channel");
        return new ms4(str, mapM168960b);
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m168960b(File file) {
        try {
            String strM168961c = m168961c(file);
            if (strM168961c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM168961c);
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                map.put(string, jSONObject.getString(string));
            }
            return map;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m168961c(File file) {
        return tk60.m191543d(file, 1903654775);
    }
}
