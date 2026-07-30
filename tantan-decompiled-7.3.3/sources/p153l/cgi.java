package p153l;

import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/cgi;", "", "<init>", "()V", "Lorg/json/JSONObject;", "dataObj", "", "", "b", "(Lorg/json/JSONObject;)Ljava/util/Map;", Constants.MessagePayloadKeys.RAW_DATA, "Ll/zfi;", "a", "(Ljava/lang/String;)Ll/zfi;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class cgi {
    public static final cgi INSTANCE = new cgi();

    private cgi() {
    }

    /* JADX INFO: renamed from: b */
    private final Map<String, String> m109689b(JSONObject dataObj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject = dataObj.optJSONObject("switch");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next, "");
                next.getClass();
                strOptString.getClass();
                linkedHashMap.put(next, strOptString);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final zfi m109690a(@NotNull String rawData) {
        rawData.getClass();
        JSONObject jSONObjectOptJSONObject = new JSONObject(rawData).optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            wg3.m206174a("Data object is null");
            return null;
        }
        String strOptString = jSONObjectOptJSONObject.optString("hash", "");
        boolean z = jSONObjectOptJSONObject.optInt("need_update", 0) == 1;
        Map<String, String> mapM109689b = m109689b(jSONObjectOptJSONObject);
        Map<String, Object> mapM187636c = srq.INSTANCE.m187636c(jSONObjectOptJSONObject);
        Object obj = mapM187636c.get("mk_config");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map mapEmptyMap = (Map) obj;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map map = mapEmptyMap;
        Object obj2 = mapM187636c.get("rules");
        if (!TypeIntrinsics.m88438p(obj2)) {
            obj2 = null;
        }
        Map linkedHashMap = (Map) obj2;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map map2 = linkedHashMap;
        Object obj3 = mapM187636c.get("recommendConfig");
        Map mapEmptyMap2 = (Map) (obj3 instanceof Map ? obj3 : null);
        if (mapEmptyMap2 == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        return new zfi(strOptString, z, mapM109689b, map, map2, mapEmptyMap2, rawData);
    }
}
