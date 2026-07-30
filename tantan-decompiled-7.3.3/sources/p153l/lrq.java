package p153l;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/lrq;", "", "<init>", "()V", "Lorg/json/JSONObject;", "obj1", "obj2", "", "c", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Z", "Lorg/json/JSONArray;", "arr1", "arr2", "b", "(Lorg/json/JSONArray;Lorg/json/JSONArray;)Z", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lrq {

    @NotNull
    public static final lrq INSTANCE = new lrq();

    private lrq() {
    }

    /* JADX INFO: renamed from: b */
    private final boolean m155634b(JSONArray arr1, JSONArray arr2) {
        if (arr1.length() != arr2.length()) {
            return false;
        }
        int length = arr1.length();
        for (int i = 0; i < length; i++) {
            if (!m155636a(arr1.get(i), arr2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m155635c(JSONObject obj1, JSONObject obj2) throws JSONException {
        if (obj1.length() != obj2.length()) {
            return false;
        }
        Iterator<String> itKeys = obj1.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!obj2.has(next)) {
                return false;
            }
            if (!INSTANCE.m155636a(obj1.get(next), obj2.get(next))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m155636a(@Nullable Object obj1, @Nullable Object obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        }
        if (obj1 == null || obj2 == null) {
            return false;
        }
        if (obj1 == obj2) {
            return true;
        }
        if ((obj1 instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return m155635c((JSONObject) obj1, (JSONObject) obj2);
        }
        return ((obj1 instanceof JSONArray) && (obj2 instanceof JSONArray)) ? m155634b((JSONArray) obj1, (JSONArray) obj2) : Intrinsics.m88377d(obj1, obj2);
    }
}
