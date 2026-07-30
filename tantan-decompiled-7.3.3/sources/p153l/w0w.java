package p153l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.C1577f;
import com.facebook.login.LoginClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJc\u0010\u0016\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJg\u0010\u001e\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010 \u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b \u0010\u001bJ/\u0010!\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b!\u0010\u001bJ\u0019\u0010\"\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006-"}, m88121d2 = {"Ll/w0w;", "", "Landroid/content/Context;", "context", "", "applicationId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/facebook/login/LoginClient$Request;", "pendingLoginRequest", "eventName", "", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;)V", "loginRequestId", "", "loggingExtras", "Lcom/facebook/login/LoginClient$Result$Code;", LovePlanetStage.result, "resultExtras", "Ljava/lang/Exception;", "exception", "f", "(Ljava/lang/String;Ljava/util/Map;Lcom/facebook/login/LoginClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;Ljava/lang/String;)V", "authId", FirebaseAnalytics.Param.METHOD, "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "errorMessage", "errorCode", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "j", "g", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/facebook/appevents/f;", "Lcom/facebook/appevents/f;", "logger", "facebookVersion", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class w0w {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f186728d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String applicationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1577f logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String facebookVersion;

    public w0w(@NotNull Context context, @NotNull String str) {
        PackageInfo packageInfo;
        context.getClass();
        str.getClass();
        this.applicationId = str;
        this.logger = new C1577f(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.facebookVersion = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m204343h(w0w w0wVar, Bundle bundle) {
        if (ztb.m221490d(w0w.class)) {
            return;
        }
        try {
            w0wVar.getClass();
            bundle.getClass();
            w0wVar.logger.m7831g("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th) {
            ztb.m221488b(th, w0w.class);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m204344k(w0w w0wVar, String str, String str2, String str3, int i, Object obj) {
        if (ztb.m221490d(w0w.class)) {
            return;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        try {
            w0wVar.m204352j(str, str2, str3);
        } catch (Throwable th) {
            ztb.m221488b(th, w0w.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m204345b() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return this.applicationId;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public final void m204346c(@Nullable String authId, @Nullable String method, @Nullable String result, @Nullable String errorMessage, @Nullable String errorCode, @Nullable Map<String, String> loggingExtras, @Nullable String eventName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Bundle bundleM204354b = INSTANCE.m204354b(authId);
            if (result != null) {
                bundleM204354b.putString("2_result", result);
            }
            if (errorMessage != null) {
                bundleM204354b.putString("5_error_message", errorMessage);
            }
            if (errorCode != null) {
                bundleM204354b.putString("4_error_code", errorCode);
            }
            if (loggingExtras != null && !loggingExtras.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : loggingExtras.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleM204354b.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleM204354b.putString("3_method", method);
            this.logger.m7831g(eventName, bundleM204354b);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public final void m204347d(@Nullable String authId, @Nullable String method, @Nullable String eventName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Bundle bundleM204354b = INSTANCE.m204354b(authId);
            bundleM204354b.putString("3_method", method);
            this.logger.m7831g(eventName, bundleM204354b);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m204348e(@Nullable String authId, @Nullable String method, @Nullable String eventName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Bundle bundleM204354b = INSTANCE.m204354b(authId);
            bundleM204354b.putString("3_method", method);
            this.logger.m7831g(eventName, bundleM204354b);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: f */
    public final void m204349f(@Nullable String loginRequestId, @NotNull Map<String, String> loggingExtras, @Nullable LoginClient.Result.Code result, @Nullable Map<String, String> resultExtras, @Nullable Exception exception, @Nullable String eventName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            loggingExtras.getClass();
            Bundle bundleM204354b = INSTANCE.m204354b(loginRequestId);
            if (result != null) {
                bundleM204354b.putString("2_result", result.getLoggingValue());
            }
            if ((exception == null ? null : exception.getMessage()) != null) {
                bundleM204354b.putString("5_error_message", exception.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ? null : new JSONObject(loggingExtras);
            if (resultExtras != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : resultExtras.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleM204354b.putString("6_extras", jSONObject.toString());
            }
            this.logger.m7831g(eventName, bundleM204354b);
            if (result == LoginClient.Result.Code.SUCCESS) {
                m204350g(loginRequestId);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m204350g(String loginRequestId) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            final Bundle bundleM204354b = INSTANCE.m204354b(loginRequestId);
            f186728d.schedule(new Runnable() { // from class: l.v0w
                @Override // java.lang.Runnable
                public final void run() {
                    w0w.m204343h(this.f181905a, bundleM204354b);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: i */
    public final void m204351i(@NotNull LoginClient.Request pendingLoginRequest, @Nullable String eventName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            pendingLoginRequest.getClass();
            Bundle bundleM204354b = INSTANCE.m204354b(pendingLoginRequest.getAuthId());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.getLoginBehavior().toString());
                jSONObject.put("request_code", LoginClient.INSTANCE.m9142b());
                jSONObject.put(Permissions.TYPE, TextUtils.join(Constants.SEPARATOR_COMMA, pendingLoginRequest.m9117o()));
                jSONObject.put("default_audience", pendingLoginRequest.getDefaultAudience().toString());
                jSONObject.put("isReauthorize", pendingLoginRequest.getIsRerequest());
                String str = this.facebookVersion;
                if (str != null) {
                    jSONObject.put("facebookVersion", str);
                }
                if (pendingLoginRequest.getLoginTargetApp() != null) {
                    jSONObject.put("target_app", pendingLoginRequest.getLoginTargetApp().getTargetApp());
                }
                bundleM204354b.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.logger.m7831g(eventName, bundleM204354b);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public final void m204352j(@Nullable String eventName, @Nullable String errorMessage, @Nullable String method) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Bundle bundleM204354b = INSTANCE.m204354b("");
            bundleM204354b.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
            bundleM204354b.putString("5_error_message", errorMessage);
            bundleM204354b.putString("3_method", method);
            this.logger.m7831g(eventName, bundleM204354b);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.w0w$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\nR\u001c\u00100\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m88121d2 = {"Ll/w0w$a;", "", "<init>", "()V", "", "authLoggerId", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "EVENT_EXTRAS_DEFAULT_AUDIENCE", "Ljava/lang/String;", "EVENT_EXTRAS_FACEBOOK_VERSION", "EVENT_EXTRAS_FAILURE", "EVENT_EXTRAS_IS_REAUTHORIZE", "EVENT_EXTRAS_LOGIN_BEHAVIOR", "EVENT_EXTRAS_MISSING_INTERNET_PERMISSION", "EVENT_EXTRAS_NEW_PERMISSIONS", "EVENT_EXTRAS_NOT_TRIED", "EVENT_EXTRAS_PERMISSIONS", "EVENT_EXTRAS_REQUEST_CODE", "EVENT_EXTRAS_TARGET_APP", "EVENT_EXTRAS_TRY_LOGIN_ACTIVITY", "EVENT_NAME_FOA_LOGIN_COMPLETE", "EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE", "EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED", "EVENT_NAME_FOA_LOGIN_METHOD_START", "EVENT_NAME_FOA_LOGIN_START", "EVENT_NAME_LOGIN_COMPLETE", "EVENT_NAME_LOGIN_HEARTBEAT", "EVENT_NAME_LOGIN_METHOD_COMPLETE", "EVENT_NAME_LOGIN_METHOD_NOT_TRIED", "EVENT_NAME_LOGIN_METHOD_START", "EVENT_NAME_LOGIN_START", "EVENT_NAME_LOGIN_STATUS_COMPLETE", "EVENT_NAME_LOGIN_STATUS_START", "EVENT_PARAM_AUTH_LOGGER_ID", "EVENT_PARAM_CHALLENGE", "EVENT_PARAM_ERROR_CODE", "EVENT_PARAM_ERROR_MESSAGE", "EVENT_PARAM_EXTRAS", "EVENT_PARAM_FOA_METHOD_RESULT_SKIPPED", "EVENT_PARAM_LOGIN_RESULT", "EVENT_PARAM_METHOD", "EVENT_PARAM_METHOD_RESULT_SKIPPED", "EVENT_PARAM_TIMESTAMP", "FACEBOOK_PACKAGE_NAME", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "worker", "Ljava/util/concurrent/ScheduledExecutorService;", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final Bundle m204354b(String authLoggerId) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", authLoggerId);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }

        public Companion() {
        }
    }
}
