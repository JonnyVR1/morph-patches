package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001d\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/q920;", "", "<init>", "()V", "Lorg/json/JSONObject;", "root", "", "path", "value", "", "e", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V", "", "Ll/q920$b;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/util/List;", "current", "segments", "", FirebaseAnalytics.Param.INDEX, "f", "(Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)V", "Lorg/json/JSONArray;", "array", "size", "c", "(Lorg/json/JSONArray;I)V", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class q920 {

    /* JADX INFO: renamed from: a */
    @NotNull
    private static final Regex f153357a = new Regex("\\[(\\d+)]");

    /* JADX INFO: renamed from: l.q920$b */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/q920$b;", "", "", Constants.KEY_KEY, "", "arrayIndex", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C19447b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Integer arrayIndex;

        public C19447b(@NotNull String str, @Nullable Integer num) {
            str.getClass();
            this.key = str;
            this.arrayIndex = num;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getArrayIndex() {
            return this.arrayIndex;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C19447b)) {
                return false;
            }
            C19447b c19447b = (C19447b) other;
            return Intrinsics.m87488d(this.key, c19447b.key) && Intrinsics.m87488d(this.arrayIndex, c19447b.arrayIndex);
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            Integer num = this.arrayIndex;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "PathSegment(key=" + this.key + ", arrayIndex=" + this.arrayIndex + ')';
        }
    }

    /* JADX INFO: renamed from: b */
    private final Object m173582b(Object value) throws JSONException {
        if (value == null) {
            Object obj = JSONObject.NULL;
            obj.getClass();
            return obj;
        }
        if ((value instanceof JSONObject) || (value instanceof JSONArray)) {
            return value;
        }
        if (!(value instanceof Map)) {
            if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Iterable) value).iterator();
                while (it.hasNext()) {
                    jSONArray.put(m173582b(it.next()));
                }
                return jSONArray;
            }
            return value;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((Map) value).entrySet()) {
            jSONObject.put(String.valueOf(entry.getKey()), m173582b(entry.getValue()));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    private final void m173583c(JSONArray array, int size) {
        while (array.length() < size) {
            array.put(JSONObject.NULL);
        }
    }

    /* JADX INFO: renamed from: d */
    private final List<C19447b> m173584d(String path) {
        ArrayList arrayList = new ArrayList();
        for (String str : StringsKt.m93396E0(path, new char[]{'.'}, false, 0, 6, null)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = Regex.findAll$default(f153357a, str, 0, 2, null).iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(Integer.parseInt(((MatchResult) it.next()).mo93364c().get(1))));
            }
            if (arrayList2.isEmpty()) {
                arrayList.add(new C19447b(str, null));
            } else {
                arrayList.add(new C19447b(str.substring(0, StringsKt.m93435b0(str, '[', 0, false, 6, null)), (Integer) arrayList2.get(0)));
                int size = arrayList2.size();
                for (int i = 1; i < size; i++) {
                    arrayList.add(new C19447b("", (Integer) arrayList2.get(i)));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private final void m173585e(JSONObject root, String path, Object value) throws JSONException {
        m173586f(root, m173584d(path), 0, value);
    }

    /* JADX INFO: renamed from: f */
    private final void m173586f(Object current, List<C19447b> segments, int index, Object value) throws JSONException {
        if (index >= segments.size()) {
            return;
        }
        C19447b c19447b = segments.get(index);
        boolean z = index == segments.size() - 1;
        if (!(current instanceof JSONObject)) {
            if (current instanceof JSONArray) {
                if (c19447b.getArrayIndex() == null) {
                    throw new JSONException("Array requires index notation, got key: " + c19447b.getKey());
                }
                JSONArray jSONArray = (JSONArray) current;
                m173583c(jSONArray, c19447b.getArrayIndex().intValue() + 1);
                if (z) {
                    jSONArray.put(c19447b.getArrayIndex().intValue(), m173582b(value));
                    return;
                }
                int i = index + 1;
                C19447b c19447b2 = segments.get(i);
                if (c19447b2.getArrayIndex() == null || c19447b2.getKey().length() != 0) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(c19447b.getArrayIndex().intValue());
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                        jSONArray.put(c19447b.getArrayIndex().intValue(), jSONObjectOptJSONObject);
                    }
                    m173586f(jSONObjectOptJSONObject, segments, i, value);
                    return;
                }
                JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(c19447b.getArrayIndex().intValue());
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArray.put(c19447b.getArrayIndex().intValue(), jSONArrayOptJSONArray);
                }
                m173586f(jSONArrayOptJSONArray, segments, i, value);
                return;
            }
            return;
        }
        if (c19447b.getArrayIndex() == null) {
            if (z) {
                ((JSONObject) current).put(c19447b.getKey(), m173582b(value));
                return;
            }
            int i2 = index + 1;
            if (segments.get(i2).getArrayIndex() != null) {
                JSONObject jSONObject = (JSONObject) current;
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(c19447b.getKey());
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    jSONObject.put(c19447b.getKey(), jSONObjectOptJSONObject2);
                }
                m173586f(jSONObjectOptJSONObject2, segments, i2, value);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) current;
            JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject(c19447b.getKey());
            if (jSONObjectOptJSONObject3 == null) {
                jSONObjectOptJSONObject3 = new JSONObject();
                jSONObject2.put(c19447b.getKey(), jSONObjectOptJSONObject3);
            }
            m173586f(jSONObjectOptJSONObject3, segments, i2, value);
            return;
        }
        JSONObject jSONObject3 = (JSONObject) current;
        JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(c19447b.getKey());
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        jSONObject3.put(c19447b.getKey(), jSONArrayOptJSONArray2);
        m173583c(jSONArrayOptJSONArray2, c19447b.getArrayIndex().intValue() + 1);
        if (z) {
            jSONArrayOptJSONArray2.put(c19447b.getArrayIndex().intValue(), m173582b(value));
            return;
        }
        int i3 = index + 1;
        C19447b c19447b3 = segments.get(i3);
        if (c19447b3.getArrayIndex() == null || c19447b3.getKey().length() != 0) {
            JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(c19447b.getArrayIndex().intValue());
            if (jSONObjectOptJSONObject4 == null) {
                jSONObjectOptJSONObject4 = new JSONObject();
                jSONArrayOptJSONArray2.put(c19447b.getArrayIndex().intValue(), jSONObjectOptJSONObject4);
            }
            m173586f(jSONObjectOptJSONObject4, segments, i3, value);
            return;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONArrayOptJSONArray2.optJSONArray(c19447b.getArrayIndex().intValue());
        if (jSONArrayOptJSONArray3 == null) {
            jSONArrayOptJSONArray3 = new JSONArray();
            jSONArrayOptJSONArray2.put(c19447b.getArrayIndex().intValue(), jSONArrayOptJSONArray3);
        }
        m173586f(jSONArrayOptJSONArray3, segments, i3, value);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final JSONObject m173587a(@NotNull String path, @Nullable Object value) throws JSONException {
        path.getClass();
        JSONObject jSONObject = new JSONObject();
        m173585e(jSONObject, path, value);
        return jSONObject;
    }
}
