package p149l;

import com.cosmos.mdlog.MDLog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/y53;", "Ll/fnl;", "Limmomo/com/mklibrary/core/base/ui/MKWebView;", "mkWebView", "<init>", "(Limmomo/com/mklibrary/core/base/ui/MKWebView;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "h", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public class y53 extends fnl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y53(@NotNull MKWebView mKWebView) {
        super(mKWebView);
        mKWebView.getClass();
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        JSONObject jSONObjectOptJSONObject;
        if (Intrinsics.m87488d("boost", namespace) && params != null) {
            String strOptString = params.optString("callback");
            if (method != null && method.hashCode() == -1665560895 && method.equals("changeState")) {
                try {
                    MKWebView mKWebView = this.f98430a;
                    if (mKWebView != null && !mKWebView.m87089v0() && !mKWebView.m87087q0() && mKWebView.f63245c.getBoost() && (jSONObjectOptJSONObject = params.optJSONObject("data")) != null) {
                        mKWebView.f63245c.m116602e(jSONObjectOptJSONObject.optInt("state", -1));
                        MDLog.m7389d(fnl.f98429b, "lehua:boost:bridge changeState=" + mKWebView.f63245c.getState());
                    }
                    m122325d(strOptString, null, "ok", "0");
                    return true;
                } catch (Exception e) {
                    MDLog.printErrStackTrace(fnl.f98429b, e);
                    return true;
                }
            }
        }
        return false;
    }
}
