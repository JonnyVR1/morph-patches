package p149l;

import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"", Constants.KEY_EVT_NAME, "Lorg/json/JSONObject;", Constants.KEY_EVT_DATA, "Ll/qs9;", "coreMetaData", "Ll/n95;", "clock", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "a", "(Ljava/lang/String;Lorg/json/JSONObject;Ll/qs9;Ll/n95;Ljava/lang/String;)Lorg/json/JSONObject;", Target.TYPE, "", "b", "(Lorg/json/JSONObject;Ll/qs9;Ll/n95;Ljava/lang/String;)V", "clevertap-core_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class brm {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JSONObject m103557a(@NotNull String str, @NotNull JSONObject jSONObject, @NotNull qs9 qs9Var, @NotNull n95 n95Var, @NotNull String str2) throws JSONException {
        str.getClass();
        jSONObject.getClass();
        qs9Var.getClass();
        n95Var.getClass();
        str2.getClass();
        JSONObject jSONObjectPut = new JSONObject().put("type", NotificationCompat.CATEGORY_EVENT).put(Constants.KEY_EVT_NAME, str).put(Constants.KEY_EVT_DATA, jSONObject);
        jSONObjectPut.getClass();
        m103558b(jSONObjectPut, qs9Var, n95Var, str2);
        return jSONObjectPut;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: b */
    public static final void m103558b(@NotNull JSONObject jSONObject, @NotNull qs9 qs9Var, @NotNull n95 n95Var, @NotNull String str) throws JSONException {
        jSONObject.getClass();
        qs9Var.getClass();
        n95Var.getClass();
        str.getClass();
        jSONObject.put(BLiveStormDanmakuGiftResourceType.f44446s, qs9Var.m176213k());
        jSONObject.put("pg", qs9.m176168e());
        jSONObject.put("ep", n95Var.mo158531a());
        jSONObject.put("f", qs9Var.m176176C());
        jSONObject.put("lsl", qs9Var.m176217o());
        jSONObject.put("pai", str);
        String strM176221s = qs9Var.m176221s();
        if (strM176221s != null) {
            jSONObject.put("n", strM176221s);
        }
    }
}
