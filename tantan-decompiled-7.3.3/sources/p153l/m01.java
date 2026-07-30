package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m88121d2 = {"Lorg/json/JSONArray;", "b", "(Lorg/json/JSONArray;)Lorg/json/JSONArray;", "", "value", "", "a", "(Lorg/json/JSONArray;Ljava/lang/String;)Z", "c", "(Lorg/json/JSONArray;)Z", Constants.INAPP_DATA_TAG, "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m01 {
    /* JADX INFO: renamed from: a */
    public static final boolean m156502a(@NotNull JSONArray jSONArray, @NotNull String str) throws JSONException {
        jSONArray.getClass();
        str.getClass();
        Iterable iterableM88496l = C15274a.m88496l(0, jSONArray.length());
        if ((iterableM88496l instanceof Collection) && ((Collection) iterableM88496l).isEmpty()) {
            return false;
        }
        Iterator it = iterableM88496l.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((IntIterator) it).nextInt());
            if ((obj instanceof String) && Intrinsics.m88377d(obj, str)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JSONArray m156503b(@NotNull JSONArray jSONArray) {
        jSONArray.getClass();
        return new JSONArray(jSONArray.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m156504c(@NotNull JSONArray jSONArray) {
        jSONArray.getClass();
        Iterable iterableM88496l = C15274a.m88496l(0, jSONArray.length());
        if ((iterableM88496l instanceof Collection) && ((Collection) iterableM88496l).isEmpty()) {
            return false;
        }
        Iterator it = iterableM88496l.iterator();
        while (it.hasNext()) {
            Object objOpt = jSONArray.opt(((IntIterator) it).nextInt());
            if ((objOpt instanceof String) && Intrinsics.m88377d(objOpt, Constants.DELETE_MARKER)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m156505d(@NotNull JSONArray jSONArray) {
        jSONArray.getClass();
        Iterable iterableM88496l = C15274a.m88496l(0, jSONArray.length());
        if ((iterableM88496l instanceof Collection) && ((Collection) iterableM88496l).isEmpty()) {
            return false;
        }
        Iterator it = iterableM88496l.iterator();
        while (it.hasNext()) {
            if (jSONArray.opt(((IntIterator) it).nextInt()) instanceof JSONObject) {
                return true;
            }
        }
        return false;
    }
}
