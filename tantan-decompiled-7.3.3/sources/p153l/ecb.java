package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.core.data.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/ecb;", "Ll/qpl;", "Ll/hul;", "mkWebView", "<init>", "(Ll/hul;)V", "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "r", "(Lorg/json/JSONObject;)V", "q", "", "namespace", FirebaseAnalytics.Param.METHOD, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class ecb extends qpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecb(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    /* JADX INFO: renamed from: q */
    private final void m120297q(JSONObject params) {
        String strOptString;
        String strOptString2;
        g4k g4kVarM186316e = sjw.m186316e();
        if (g4kVarM186316e != null) {
            String str = "";
            if (params == null || (strOptString = params.optString(AuthenticationTokenClaims.JSON_KEY_NAME)) == null) {
                strOptString = "";
            }
            if (params != null && (strOptString2 = params.optString("dst")) != null) {
                str = strOptString2;
            }
            g4kVarM186316e.mo128894c(strOptString, str, params != null ? params.optJSONObject("data") : null);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m120298r(JSONObject params) {
        if (!TextUtils.isEmpty(params != null ? params.optString("dst", null) : null)) {
            m120297q(params);
            return;
        }
        Intent intent = new Intent();
        String strOptString = params != null ? params.optString(AuthenticationTokenClaims.JSON_KEY_NAME) : null;
        intent.putExtra("type", "bridgeMessage");
        intent.putExtra(Target.TYPE, params != null ? params.optString(Target.TYPE) : null);
        intent.putExtra(AuthenticationTokenClaims.JSON_KEY_NAME, strOptString);
        JSONObject jSONObjectOptJSONObject = params != null ? params.optJSONObject("data") : null;
        if (jSONObjectOptJSONObject != null) {
            intent.putExtra("data", jSONObjectOptJSONObject.toString());
        }
        intent.putExtra("origin", this.f158879a.getWebViewUrl());
        boolean z = false;
        if (!TextUtils.isEmpty(strOptString)) {
            if ((strOptString != null ? StringsKt.m94327c0(strOptString, "bn:", 0, false, 6, null) : 0) >= 0) {
                z = true;
            }
        }
        if (z) {
            intent.setAction(strOptString);
        } else {
            intent.setAction("com.immomo.momo.mk.post_message");
        }
        rf3.m181165c(m177460c(), intent);
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (m177460c() == null || !Intrinsics.m88377d("ui", namespace) || method == null || method.hashCode() != 1490029383 || !method.equals("postMessage")) {
            return false;
        }
        m120298r(params);
        return true;
    }
}
