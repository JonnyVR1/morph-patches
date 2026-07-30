package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/wei;", "Ll/et2;", "Ll/vg2;", "callbackManager", "<init>", "(Ll/vg2;)V", "Lorg/json/JSONArray;", "batch", "", "success", "", "a", "(Lorg/json/JSONArray;Z)V", "Ll/vg2;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class wei implements et2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final vg2 callbackManager;

    public wei(@NotNull vg2 vg2Var) {
        vg2Var.getClass();
        this.callbackManager = vg2Var;
    }

    @Override // p149l.et2
    /* JADX INFO: renamed from: a */
    public void mo117970a(@NotNull JSONArray batch, boolean success) {
        batch.getClass();
        if (batch.length() == 0) {
            this.callbackManager.mo100735i();
            return;
        }
        int length = batch.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = batch.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(Constants.KEY_EVT_DATA);
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            if (Intrinsics.m87488d(jSONObjectOptJSONObject.optString(Constants.KEY_EVT_NAME), Constants.WZRK_FETCH) && jSONObjectOptJSONObject2.optInt(Constants.KEY_T) == 5) {
                this.callbackManager.mo100735i();
                return;
            }
        }
    }
}
