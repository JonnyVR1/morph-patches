package p149l;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class pr4 {
    /* JADX INFO: renamed from: a */
    public static nr4 m170989a(File file) {
        Map<String, String> mapM170990b = m170990b(file);
        if (mapM170990b == null) {
            return null;
        }
        String str = mapM170990b.get("channel");
        mapM170990b.remove("channel");
        return new nr4(str, mapM170990b);
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m170990b(File file) {
        try {
            String strM170991c = m170991c(file);
            if (strM170991c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM170991c);
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
    public static String m170991c(File file) {
        return oc60.m163481d(file, 1903654775);
    }
}
