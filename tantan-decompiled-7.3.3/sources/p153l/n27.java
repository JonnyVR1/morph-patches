package p153l;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/n27;", "Ll/qpl;", "Ll/hul;", "mkWebView", "<init>", "(Ll/hul;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class n27 extends qpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n27(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        JSONObject jSONObjectOptJSONObject;
        if (Intrinsics.m88377d("boost", namespace) && params != null) {
            String strOptString = params.optString("callback");
            if (method != null && method.hashCode() == -1665560895 && method.equals("changeState")) {
                try {
                    hul hulVar = this.f158879a;
                    if (hulVar != null && !hulVar.mo17920e() && !hulVar.isDestroyed() && hulVar.getBoost().getBoost() && (jSONObjectOptJSONObject = params.optJSONObject("data")) != null) {
                        hulVar.getBoost().m130559e(jSONObjectOptJSONObject.optInt("state", -1));
                        hulVar.getBoost().getState();
                    }
                    m177464h(strOptString, null, "ok", "0");
                    return true;
                } catch (Exception e) {
                    Log.e(qpl.f158878b, "", e);
                    return true;
                }
            }
        }
        return false;
    }
}
