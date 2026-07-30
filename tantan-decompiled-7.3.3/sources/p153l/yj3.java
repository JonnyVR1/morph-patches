package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ-\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/yj3;", "Ll/qpl;", "Ll/hul;", "webView", "<init>", "(Ll/hul;)V", "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", Constants.KEY_T, "(Lorg/json/JSONObject;)V", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)V", "", "q", "()Z", "r", "namespace", FirebaseAnalytics.Param.METHOD, "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "Ll/am3;", "c", "Ll/am3;", "permissionBridge", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class yj3 extends qpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private am3 permissionBridge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj3(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    /* JADX INFO: renamed from: q */
    private final boolean m216384q() {
        if (TextUtils.isEmpty(m177461d())) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            return glw.m130712i(sjw.m186317f(m177461d()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225069exceptionOrNullimpl(Result.m225066constructorimpl(ResultKt.m88127a(th)));
            return false;
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m216385r(JSONObject params) {
        Object objM225066constructorimpl;
        Iterator<String> itKeys;
        if (m177460c() != null) {
            JSONObject jSONObjectOptJSONObject = params != null ? params.optJSONObject("apps") : null;
            String strOptString = params != null ? params.optString("callback") : null;
            try {
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                        if (jSONObjectOptJSONObject2 != null) {
                            String strOptString2 = jSONObjectOptJSONObject2.optString("schema");
                            strOptString2.getClass();
                            jSONObject2.put(next, zj3.m219965b(strOptString2) ? 1 : 0);
                        }
                    }
                }
                jSONObject.put(Profile.GAMES, jSONObject2);
                String string = qpl.m177459a(new String[0], new String[]{jSONObject.toString()}).toString();
                string.getClass();
                m177463g(strOptString, string);
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
            if (thM225069exceptionOrNullimpl != null) {
                jzv.m147729b(qpl.f158878b, thM225069exceptionOrNullimpl.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m216386s(String packageName) {
        Context contextM155971a = lv0.m155971a();
        contextM155971a.getClass();
        Intent launchIntentForPackage = contextM155971a.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            lv0.m155971a().startActivity(launchIntentForPackage);
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m216387t(JSONObject params) {
        if (params != null) {
            int iOptInt = params.optInt("type");
            if (m216384q() && iOptInt == 0) {
                q0e q0eVar = q0e.INSTANCE;
                if (C15493d.m94381x(HardwareEarMonitorUtils.MANUFACTURER_OPPO, q0eVar.m174691a(), true)) {
                    m216386s("com.coloros.safecenter");
                } else if (C15493d.m94381x(HardwareEarMonitorUtils.MANUFACTURER_VIVO, q0eVar.m174691a(), true)) {
                    m216386s("com.iqoo.secure");
                } else if (C15493d.m94381x(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI, q0eVar.m174691a(), true)) {
                    m216386s("com.huawei.systemmanager");
                }
            }
        }
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (m177460c() != null && Intrinsics.m88377d("app", namespace) && method != null) {
            int iHashCode = method.hashCode();
            if (iHashCode != -675127954) {
                if (iHashCode != 686218487) {
                    if (iHashCode == 1207466352 && method.equals("isInstalled")) {
                        m216385r(params);
                        return true;
                    }
                } else if (method.equals("checkPermission")) {
                    if (this.permissionBridge == null) {
                        hul hulVar = this.f158879a;
                        hulVar.getClass();
                        this.permissionBridge = new am3(hulVar);
                    }
                    am3 am3Var = this.permissionBridge;
                    if (am3Var != null) {
                        return am3Var.mo18018p(namespace, method, params);
                    }
                    return false;
                }
            } else if (method.equals("launchApp")) {
                m216387t(params);
                return true;
            }
        }
        return false;
    }
}
