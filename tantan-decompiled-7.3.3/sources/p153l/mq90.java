package p153l;

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
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Ll/mq90;", "", "<init>", "()V", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "jsonObject", "", "basePath", "", "Ll/lq90;", "changes", "", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)V", "e", Constants.KEY_KEY, "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "path", "g", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", Constants.KEY_OLD_VALUE, Constants.KEY_NEW_VALUE, "f", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)V", "c", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mq90 {
    /* JADX INFO: renamed from: a */
    private final String m159499a(String basePath, String key) {
        if (basePath.length() == 0) {
            return key;
        }
        return basePath + '.' + key;
    }

    /* JADX INFO: renamed from: b */
    private final Object m159500b(Object value) {
        if (value != null) {
            return d6c.INSTANCE.m114428d(value);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final void m159501d(JSONObject jsonObject, String basePath, Map<String, lq90> changes) throws JSONException {
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            next.getClass();
            String strM159499a = m159499a(basePath, next);
            if (obj instanceof JSONObject) {
                m159501d((JSONObject) obj, strM159499a, changes);
            } else {
                changes.put(strM159499a, new lq90(null, m159500b(obj)));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m159502e(JSONObject jsonObject, String basePath, Map<String, lq90> changes) throws JSONException {
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            next.getClass();
            String strM159499a = m159499a(basePath, next);
            if (obj instanceof JSONObject) {
                m159502e((JSONObject) obj, strM159499a, changes);
            } else {
                changes.put(strM159499a, new lq90(m159500b(obj), null));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m159503c(@NotNull String path, @NotNull Object newValue, @NotNull Map<String, lq90> changes) throws JSONException {
        path.getClass();
        newValue.getClass();
        changes.getClass();
        Object objM159500b = m159500b(newValue);
        if (objM159500b instanceof JSONObject) {
            m159501d((JSONObject) objM159500b, path, changes);
        } else {
            changes.put(path, new lq90(null, objM159500b));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m159504f(@NotNull String path, @Nullable Object oldValue, @Nullable Object newValue, @NotNull Map<String, lq90> changes) {
        path.getClass();
        changes.getClass();
        changes.put(path, new lq90(m159500b(oldValue), m159500b(newValue)));
    }

    /* JADX INFO: renamed from: g */
    public final void m159505g(@NotNull Object value, @NotNull String path, @NotNull Map<String, lq90> changes) throws JSONException {
        value.getClass();
        path.getClass();
        changes.getClass();
        if (value instanceof JSONObject) {
            m159502e((JSONObject) value, path, changes);
        } else {
            changes.put(path, new lq90(m159500b(value), null));
        }
    }
}
