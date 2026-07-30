package p153l;

import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"", Constants.KEY_EVT_NAME, "Lorg/json/JSONObject;", Constants.KEY_EVT_DATA, "Ll/bu9;", "coreMetaData", "Ll/oa5;", "clock", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "a", "(Ljava/lang/String;Lorg/json/JSONObject;Ll/bu9;Ll/oa5;Ljava/lang/String;)Lorg/json/JSONObject;", Target.TYPE, "", "b", "(Lorg/json/JSONObject;Ll/bu9;Ll/oa5;Ljava/lang/String;)V", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class dtm {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JSONObject m117883a(@NotNull String str, @NotNull JSONObject jSONObject, @NotNull bu9 bu9Var, @NotNull oa5 oa5Var, @NotNull String str2) throws JSONException {
        str.getClass();
        jSONObject.getClass();
        bu9Var.getClass();
        oa5Var.getClass();
        str2.getClass();
        JSONObject jSONObjectPut = new JSONObject().put("type", NotificationCompat.CATEGORY_EVENT).put(Constants.KEY_EVT_NAME, str).put(Constants.KEY_EVT_DATA, jSONObject);
        jSONObjectPut.getClass();
        m117884b(jSONObjectPut, bu9Var, oa5Var, str2);
        return jSONObjectPut;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: b */
    public static final void m117884b(@NotNull JSONObject jSONObject, @NotNull bu9 bu9Var, @NotNull oa5 oa5Var, @NotNull String str) throws JSONException {
        jSONObject.getClass();
        bu9Var.getClass();
        oa5Var.getClass();
        str.getClass();
        jSONObject.put(BLiveStormDanmakuGiftResourceType.f45294s, bu9Var.m106480k());
        jSONObject.put("pg", bu9.m106435e());
        jSONObject.put("ep", oa5Var.mo166825a());
        jSONObject.put("f", bu9Var.m106443C());
        jSONObject.put("lsl", bu9Var.m106484o());
        jSONObject.put("pai", str);
        String strM106488s = bu9Var.m106488s();
        if (strM106488s != null) {
            jSONObject.put("n", strM106488s);
        }
    }
}
