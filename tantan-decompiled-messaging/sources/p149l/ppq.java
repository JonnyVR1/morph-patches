package p149l;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/ppq;", "", "<init>", "()V", "Lorg/json/JSONObject;", "json", "", "", "a", "(Lorg/json/JSONObject;)Ljava/util/Map;", RequestParameters.PREFIX, "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ppq {

    @NotNull
    public static final ppq INSTANCE = new ppq();

    private ppq() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Map<String, Object> m170756a(@NotNull JSONObject json) {
        json.getClass();
        return INSTANCE.m170757b(json, "");
    }

    /* JADX INFO: renamed from: b */
    private final Map<String, Object> m170757b(JSONObject json, String prefix) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = json.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = json.get(next);
            if (prefix.length() != 0) {
                next = prefix + '.' + next;
            }
            if (obj instanceof JSONObject) {
                next.getClass();
                linkedHashMap.putAll(INSTANCE.m170757b((JSONObject) obj, next));
            } else if (obj instanceof JSONArray) {
                linkedHashMap.put(next, v4c.INSTANCE.m196958d(obj));
            } else if (!Intrinsics.m87488d(obj, JSONObject.NULL)) {
                if (obj instanceof String) {
                    linkedHashMap.put(next, v4c.INSTANCE.m196958d(obj));
                } else {
                    linkedHashMap.put(next, obj);
                }
            }
        }
        return linkedHashMap;
    }
}
