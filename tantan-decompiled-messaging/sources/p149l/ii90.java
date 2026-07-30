package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m87232d2 = {"Ll/ii90;", "", "<init>", "()V", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "jsonObject", "", "basePath", "", "Ll/hi90;", "changes", "", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)V", "e", Constants.KEY_KEY, "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "path", "g", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "f", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)V", "c", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ii90 {
    /* JADX INFO: renamed from: a */
    private final String m136359a(String basePath, String key) {
        if (basePath.length() == 0) {
            return key;
        }
        return basePath + '.' + key;
    }

    /* JADX INFO: renamed from: b */
    private final Object m136360b(Object value) {
        if (value != null) {
            return v4c.INSTANCE.m196958d(value);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final void m136361d(JSONObject jsonObject, String basePath, Map<String, hi90> changes) throws JSONException {
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            next.getClass();
            String strM136359a = m136359a(basePath, next);
            if (obj instanceof JSONObject) {
                m136361d((JSONObject) obj, strM136359a, changes);
            } else {
                changes.put(strM136359a, new hi90(null, m136360b(obj)));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m136362e(JSONObject jsonObject, String basePath, Map<String, hi90> changes) throws JSONException {
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            next.getClass();
            String strM136359a = m136359a(basePath, next);
            if (obj instanceof JSONObject) {
                m136362e((JSONObject) obj, strM136359a, changes);
            } else {
                changes.put(strM136359a, new hi90(m136360b(obj), null));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m136363c(@NotNull String path, @NotNull Object newValue, @NotNull Map<String, hi90> changes) throws JSONException {
        path.getClass();
        newValue.getClass();
        changes.getClass();
        Object objM136360b = m136360b(newValue);
        if (objM136360b instanceof JSONObject) {
            m136361d((JSONObject) objM136360b, path, changes);
        } else {
            changes.put(path, new hi90(null, objM136360b));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m136364f(@NotNull String path, @Nullable Object oldValue, @Nullable Object newValue, @NotNull Map<String, hi90> changes) {
        path.getClass();
        changes.getClass();
        changes.put(path, new hi90(m136360b(oldValue), m136360b(newValue)));
    }

    /* JADX INFO: renamed from: g */
    public final void m136365g(@NotNull Object value, @NotNull String path, @NotNull Map<String, hi90> changes) throws JSONException {
        value.getClass();
        path.getClass();
        changes.getClass();
        if (value instanceof JSONObject) {
            m136362e((JSONObject) value, path, changes);
        } else {
            changes.put(path, new hi90(m136360b(value), null));
        }
    }
}
