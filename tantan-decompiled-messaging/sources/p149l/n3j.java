package p149l;

import android.util.SparseArray;
import com.p046p1.mobile.putong.feed.data.Frame;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/n3j;", "", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "Landroid/util/SparseArray;", "Ll/a5j;", "a", "Landroid/util/SparseArray;", "()Landroid/util/SparseArray;", "map", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class n3j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<a5j> map;

    public n3j(@NotNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        jSONObject.getClass();
        this.map = new SparseArray<>();
        JSONArray jSONArray = jSONObject.getJSONArray(Frame.TYPE);
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArray != null && (jSONObject2 = jSONArray.getJSONObject(i)) != null) {
                a5j a5jVar = new a5j(jSONObject2);
                this.map.put(a5jVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String(), a5jVar);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SparseArray<a5j> m157759a() {
        return this.map;
    }
}
