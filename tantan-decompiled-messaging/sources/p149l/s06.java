package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/s06;", "", "Lorg/json/JSONObject;", "header", "Lorg/json/JSONArray;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)V", "", "toString", "()Ljava/lang/String;", "a", "Lorg/json/JSONObject;", "getHeader", "()Lorg/json/JSONObject;", "b", "Lorg/json/JSONArray;", "getItems", "()Lorg/json/JSONArray;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class s06 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JSONObject header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JSONArray items;

    public s06(@NotNull JSONObject jSONObject, @NotNull JSONArray jSONArray) {
        jSONObject.getClass();
        jSONArray.getClass();
        this.header = jSONObject;
        this.items = jSONArray;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.header);
        sb.append(',');
        String string = this.items.toString();
        string.getClass();
        sb.append(string.substring(1));
        return sb.toString();
    }
}
