package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.p046p1.mobile.putong.data.OMSWebPerimeterType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\tR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u0010\u0010\t¨\u0006\u0016"}, m87232d2 = {"Ll/t760;", "", "Lorg/json/JSONObject;", "component", "<init>", "(Lorg/json/JSONObject;)V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", AuthenticationTokenClaims.JSON_KEY_NAME, "b", Constants.INAPP_DATA_TAG, "value", "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "c", "Ljava/util/List;", "()Ljava/util/List;", "path", "pathType", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class t760 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<PathComponent> path;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String pathType;

    public t760(@NotNull JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        string.getClass();
        this.name = string;
        String strOptString = jSONObject.optString("value");
        strOptString.getClass();
        this.value = strOptString;
        String strOptString2 = jSONObject.optString("path_type", OMSWebPerimeterType.absolute);
        strOptString2.getClass();
        this.pathType = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                jSONObject2.getClass();
                arrayList.add(new PathComponent(jSONObject2));
            }
        }
        this.path = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<PathComponent> m187418b() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPathType() {
        return this.pathType;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
