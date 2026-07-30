package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/d6c;", "", "<init>", "()V", "", "value", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "array", "b", "(Lorg/json/JSONArray;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "obj", "e", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "(Ljava/lang/Object;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class d6c {

    @NotNull
    public static final d6c INSTANCE = new d6c();

    private d6c() {
    }

    /* JADX INFO: renamed from: b */
    private final JSONArray m114424b(JSONArray array) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int length = array.length();
        for (int i = 0; i < length; i++) {
            Object obj = array.get(i);
            obj.getClass();
            jSONArray.put(m114428d(obj));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: c */
    private final Object m114425c(String value) {
        if (!C15493d.m94374J(value, Constants.DATE_PREFIX, false, 2, null)) {
            return value;
        }
        try {
            return Long.valueOf(Long.parseLong(StringsKt.m94347w0(value, Constants.DATE_PREFIX)));
        } catch (NumberFormatException unused) {
            return value;
        }
    }

    /* JADX INFO: renamed from: e */
    private final JSONObject m114426e(JSONObject obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = obj.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj2 = obj.get(next);
            obj2.getClass();
            jSONObject.put(next, m114428d(obj2));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m114427a(@Nullable Object value) {
        return (value instanceof String) && Intrinsics.m88377d(value, Constants.DELETE_MARKER);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Object m114428d(@NotNull Object value) {
        value.getClass();
        if (value instanceof String) {
            return m114425c((String) value);
        }
        if (value instanceof JSONArray) {
            return m114424b((JSONArray) value);
        }
        return value instanceof JSONObject ? m114426e((JSONObject) value) : value;
    }
}
