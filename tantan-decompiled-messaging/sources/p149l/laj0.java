package p149l;

import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.evaluation.C1240b;
import com.clevertap.android.sdk.inapp.evaluation.TriggerOperator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010$\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u0017\u0010(\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b\u001c\u0010'R\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010*R\u0011\u0010-\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010*¨\u0006/"}, m87232d2 = {"Ll/laj0;", "", "Lorg/json/JSONObject;", "triggerJSON", "<init>", "(Lorg/json/JSONObject;)V", "property", "Ll/naj0;", "j", "(Lorg/json/JSONObject;)Ll/naj0;", "", FirebaseAnalytics.Param.INDEX, RXScreenCaptureService.KEY_INDEX, "(I)Ll/naj0;", "h", "Ll/raj0;", "a", "(I)Ll/raj0;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "eventName", "Lorg/json/JSONArray;", "Lorg/json/JSONArray;", "getProperties", "()Lorg/json/JSONArray;", "properties", "c", "getItems", FirebaseAnalytics.Param.ITEMS, Constants.INAPP_DATA_TAG, "getGeoRadiusArray", "geoRadiusArray", "e", "f", "profileAttrName", "", "Z", "()Z", "firstTimeOnly", "g", "()I", "propertyCount", "itemsCount", "geoRadiusCount", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class laj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final JSONArray properties;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final JSONArray items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final JSONArray geoRadiusArray;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String profileAttrName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean firstTimeOnly;

    public laj0(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        String strOptString = jSONObject.optString("eventName", "");
        strOptString.getClass();
        this.eventName = strOptString;
        this.properties = jSONObject.optJSONArray("eventProperties");
        this.items = jSONObject.optJSONArray("itemProperties");
        this.geoRadiusArray = jSONObject.optJSONArray("geoRadius");
        this.profileAttrName = jSONObject.optString("profileAttrName", null);
        this.firstTimeOnly = jSONObject.optBoolean("firstTimeOnly", false);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final raj0 m149162a(int index) {
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        if (lw3.m151945o(this.geoRadiusArray, index) || (jSONArray = this.geoRadiusArray) == null || (jSONObjectOptJSONObject = jSONArray.optJSONObject(index)) == null) {
            return null;
        }
        return new raj0(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"), jSONObjectOptJSONObject.optDouble("rad"));
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFirstTimeOnly() {
        return this.firstTimeOnly;
    }

    /* JADX INFO: renamed from: d */
    public final int m149165d() {
        JSONArray jSONArray = this.geoRadiusArray;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m149166e() {
        JSONArray jSONArray = this.items;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProfileAttrName() {
        return this.profileAttrName;
    }

    /* JADX INFO: renamed from: g */
    public final int m149168g() {
        JSONArray jSONArray = this.properties;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final naj0 m149169h(int index) {
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        if (lw3.m151945o(this.items, index) || (jSONArray = this.items) == null || (jSONObjectOptJSONObject = jSONArray.optJSONObject(index)) == null) {
            return null;
        }
        return m149171j(jSONObjectOptJSONObject);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final naj0 m149170i(int index) {
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        if (lw3.m151945o(this.properties, index) || (jSONArray = this.properties) == null || (jSONObjectOptJSONObject = jSONArray.optJSONObject(index)) == null) {
            return null;
        }
        return m149171j(jSONObjectOptJSONObject);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: j */
    public final naj0 m149171j(@NotNull JSONObject property) {
        property.getClass();
        waj0 waj0Var = new waj0(property.opt("propertyValue"), null, 2, null);
        TriggerOperator triggerOperatorM6382a = C1240b.m6382a(property, "operator");
        String strOptString = property.optString("propertyName", "");
        strOptString.getClass();
        return new naj0(strOptString, triggerOperatorM6382a, waj0Var);
    }
}
