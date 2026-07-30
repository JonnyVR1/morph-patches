package p153l;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 02\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J3\u0010'\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0010\b\u0001\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\b\b\u0001\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m88121d2 = {"Ll/am3;", "Ll/trf;", "Ll/hul;", "mkWebview", "<init>", "(Ll/hul;)V", "", "", Permissions.TYPE, "", "requestCode", "", BLiveStormDanmakuGiftResourceType.f45294s, "([Ljava/lang/String;I)V", "", Constants.KEY_T, "([Ljava/lang/String;)Z", "isGranted", BaseSei.f14624X, "(IZ)V", "callback", "permission", LovePlanetStage.result, "msg", ResourceDirection.f39656v, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "type", "u", "(Ljava/lang/String;Z)Ljava/lang/String;", "namespace", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", CommandMessage.PARAMS, "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "w", "()Z", "", "grantResults", "o", "(I[Ljava/lang/String;[I)V", "Ll/bm3;", "c", "Ll/bm3;", "permissionChecker", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "permissionCallback", "Companion", "b", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class am3 extends trf {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final bm3 permissionChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String permissionCallback;

    /* JADX INFO: renamed from: l.am3$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/am3$a", "Ll/xr60;", "", "requestCode", "", "b", "(I)V", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C15745a implements xr60 {
        public C15745a() {
        }

        @Override // p153l.xr60
        /* JADX INFO: renamed from: a */
        public void mo98813a(int requestCode) {
            am3.this.m98810x(requestCode, false);
        }

        @Override // p153l.xr60
        /* JADX INFO: renamed from: b */
        public void mo98814b(int requestCode) {
            am3.this.m98810x(requestCode, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
        bm3 bm3Var = new bm3(hulVar);
        this.permissionChecker = bm3Var;
        bm3Var.m104974f(new C15745a());
        this.permissionCallback = "";
    }

    /* JADX INFO: renamed from: s */
    private final void m98806s(String[] permissions, int requestCode) {
        if (this.permissionChecker.m104976i(permissions)) {
            m98810x(requestCode, true);
        } else {
            this.permissionChecker.m104980q(permissions, requestCode);
        }
    }

    /* JADX INFO: renamed from: t */
    private final boolean m98807t(String[] permissions) {
        return this.permissionChecker.m104976i(permissions);
    }

    /* JADX INFO: renamed from: u */
    private final String m98808u(String type, boolean isGranted) {
        String string = glw.m130705b(new String[]{"type", LovePlanetStage.result}, new Object[]{type, Integer.valueOf(isGranted ? 1 : 0)}).toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: v */
    private final void m98809v(String callback, String permission, int result, String msg) {
        String string = glw.m130705b(new String[]{"type", LovePlanetStage.result, "msg"}, new Object[]{permission, Integer.valueOf(result), msg}).toString();
        string.getClass();
        m177463g(callback, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m98810x(int requestCode, boolean isGranted) {
        switch (requestCode) {
            case 1100:
                m177463g(this.permissionCallback, m98808u("camera", isGranted));
                break;
            case 1101:
                m177463g(this.permissionCallback, m98808u("audio", isGranted));
                break;
            case 1102:
                m177463g(this.permissionCallback, m98808u("contacts", isGranted));
                break;
            case 1103:
                m177463g(this.permissionCallback, m98808u("calendar", isGranted));
                break;
            default:
                jzv.m147729b("MomoPermissionBridge", "需添加额外权限");
                break;
        }
    }

    @Override // p153l.trf, p153l.qpl
    /* JADX INFO: renamed from: o */
    public void mo98811o(int requestCode, @NonNull @NotNull String[] permissions, @NonNull @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        super.mo98811o(requestCode, permissions, grantResults);
        this.permissionChecker.m104979o(requestCode, permissions, grantResults);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.trf, p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        String strOptString;
        if (m177460c() == null) {
            return false;
        }
        if (Intrinsics.m88377d("app", namespace) && Intrinsics.m88377d("checkPermission", method)) {
            String strOptString2 = params != null ? params.optString("type") : null;
            if (params == null || (strOptString = params.optString("callback")) == null) {
                strOptString = "";
            }
            this.permissionCallback = strOptString;
            if (strOptString2 != null) {
                switch (strOptString2.hashCode()) {
                    case -1446309229:
                        if (strOptString2.equals("approximately_location")) {
                            if (m98812w()) {
                                m98809v(this.permissionCallback, strOptString2, m98807t(new String[]{"android.permission.ACCESS_COARSE_LOCATION"}) ? 1 : 0, "");
                                return true;
                            }
                            m98809v(this.permissionCallback, strOptString2, -2, "");
                            return true;
                        }
                        jzv.m147729b("PermissionBridge", "需添加额外权限");
                        break;
                    case -1367751899:
                        if (!strOptString2.equals("camera")) {
                            jzv.m147729b("PermissionBridge", "需添加额外权限");
                        } else {
                            m98806s(new String[]{"android.permission.CAMERA"}, 1100);
                        }
                        break;
                    case -567451565:
                        if (!strOptString2.equals("contacts")) {
                            jzv.m147729b("PermissionBridge", "需添加额外权限");
                        } else {
                            m98806s(new String[]{"android.permission.READ_CONTACTS"}, 1102);
                        }
                        break;
                    case -178324674:
                        if (!strOptString2.equals("calendar")) {
                            jzv.m147729b("PermissionBridge", "需添加额外权限");
                        } else {
                            m98806s(new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"}, 1103);
                        }
                        break;
                    case 93166550:
                        if (!strOptString2.equals("audio")) {
                            jzv.m147729b("PermissionBridge", "需添加额外权限");
                        } else {
                            m98806s(new String[]{"android.permission.RECORD_AUDIO"}, 1101);
                        }
                        break;
                    case 1901043637:
                        if (strOptString2.equals("location")) {
                            if (m98812w()) {
                                m98809v(this.permissionCallback, strOptString2, m98807t(new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? 1 : 0, "");
                                return true;
                            }
                            m98809v(this.permissionCallback, strOptString2, -2, "");
                            return true;
                        }
                        jzv.m147729b("PermissionBridge", "需添加额外权限");
                        break;
                    default:
                        jzv.m147729b("PermissionBridge", "需添加额外权限");
                        break;
                }
            } else {
                jzv.m147729b("PermissionBridge", "需添加额外权限");
            }
        }
        return super.mo18018p(namespace, method, params);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m98812w() {
        Object objM225066constructorimpl;
        Context contextM155971a = lv0.m155971a();
        try {
            Result.Companion companion = Result.INSTANCE;
            contextM155971a.getClass();
            objM225066constructorimpl = Result.m225066constructorimpl(Integer.valueOf(Settings.Secure.getInt(contextM155971a.getContentResolver(), "location_mode")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        if (Result.m225072isFailureimpl(objM225066constructorimpl)) {
            objM225066constructorimpl = 3;
        }
        return ((Number) objM225066constructorimpl).intValue() != 0;
    }
}
