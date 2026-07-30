package p153l;

import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.core.data.Options;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m88121d2 = {"Ll/wu8;", "Ll/qpl;", "Ll/g4k$a;", "Ll/hul;", "mkWebView", "<init>", "(Ll/hul;)V", "Lorg/json/JSONObject;", "paramsObj", "", "q", "(Lorg/json/JSONObject;)V", "", "dstValue", "", "r", "(I)Ljava/lang/String;", "namespace", FirebaseAnalytics.Param.METHOD, CommandMessage.PARAMS, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", BLiveStormDanmakuGiftResourceType.f45292l, "()V", "eventName", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "", "c", "Ljava/util/Map;", "map", "Ll/g4k;", Constants.INAPP_DATA_TAG, "Ll/g4k;", "adapter", "Companion", "a", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class wu8 extends qpl implements g4k.InterfaceC17150a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, String> map;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private g4k adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu8(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
        this.map = new HashMap();
    }

    /* JADX INFO: renamed from: q */
    private final void m207935q(JSONObject paramsObj) {
        g4k g4kVar;
        if (!TextUtils.isEmpty(paramsObj.optString(AuthenticationTokenClaims.JSON_KEY_NAME))) {
            g4k g4kVar2 = this.adapter;
            if (g4kVar2 != null) {
                g4kVar2.mo128894c(paramsObj.optString(AuthenticationTokenClaims.JSON_KEY_NAME), paramsObj.optString("dst"), paramsObj.optJSONObject("data"));
                return;
            }
            return;
        }
        if (paramsObj.has("event_name")) {
            String strOptString = paramsObj.optString("event_name");
            JSONObject jSONObjectOptJSONObject = paramsObj.optJSONObject(Options.TYPE);
            if (jSONObjectOptJSONObject != null) {
                String strM207936r = m207936r(jSONObjectOptJSONObject.optInt("dst_l_evn"));
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("event_msg");
                if (jSONObjectOptJSONObject2 != null) {
                    try {
                        jSONObjectOptJSONObject2.put("active_response", jSONObjectOptJSONObject.optString("active_response", ""));
                    } catch (JSONException e) {
                        Log.e(qpl.f158878b, e.getMessage());
                    }
                }
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                }
                hul hulVar = this.f158879a;
                hulVar.getClass();
                jSONObjectOptJSONObject2.put("_mk_web_view_id", hulVar.getWebViewId());
                if (jSONObjectOptJSONObject2 == null || (g4kVar = this.adapter) == null) {
                    return;
                }
                if (strM207936r == null) {
                    strM207936r = "";
                }
                g4kVar.mo128894c(strOptString, strM207936r, jSONObjectOptJSONObject2);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private final String m207936r(int dstValue) {
        ArrayList arrayList = new ArrayList();
        if ((dstValue & 1) != 0) {
            arrayList.add("native");
        }
        if ((dstValue & 2) != 0) {
            arrayList.add("weex");
        }
        if ((dstValue & 4) != 0) {
            arrayList.add("mk");
        }
        if ((dstValue & 8) != 0) {
            arrayList.add("lua");
        }
        if (arrayList.size() > 0) {
            return TextUtils.join("|", arrayList);
        }
        return null;
    }

    @Override // p153l.g4k.InterfaceC17150a
    /* JADX INFO: renamed from: b */
    public void mo17914b(@NotNull String eventName, @Nullable String params) {
        eventName.getClass();
        m177463g(this.map.get(eventName), params);
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: l */
    public void mo121328l() {
        g4k g4kVar = this.adapter;
        if (g4kVar != null) {
            g4kVar.mo128893b(this);
        }
        this.map.clear();
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@NotNull String namespace, @NotNull String method, @NotNull JSONObject params) throws Exception {
        namespace.getClass();
        method.getClass();
        params.getClass();
        if (m177460c() != null && Intrinsics.m88377d("globalEvent", namespace)) {
            this.adapter = sjw.m186316e();
            int iHashCode = method.hashCode();
            if (iHashCode != -625809843) {
                if (iHashCode != -541487286) {
                    if (iHashCode == 1979010522 && method.equals("postEvent")) {
                        if (this.adapter != null) {
                            m207935q(params);
                        }
                        return true;
                    }
                } else if (method.equals("removeEventListener")) {
                    this.map.remove(params.optString("event_name"));
                    return true;
                }
            } else if (method.equals("addEventListener")) {
                g4k g4kVar = this.adapter;
                if (g4kVar != null) {
                    if (g4kVar != null) {
                        g4kVar.mo128892a(this);
                    }
                    String strOptString = params.optString("event_name");
                    String strOptString2 = params.optString("callback");
                    Map<String, String> map = this.map;
                    strOptString.getClass();
                    strOptString2.getClass();
                    map.put(strOptString, strOptString2);
                }
                return true;
            }
        }
        return false;
    }
}
