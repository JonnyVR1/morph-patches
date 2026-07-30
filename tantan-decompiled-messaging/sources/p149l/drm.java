package p149l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inbox.InboxMessageSource;
import com.clevertap.android.sdk.response.InboxV2DeliverySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m87232d2 = {"Ll/drm;", "Ll/o85;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/ov3;", "ctLockManager", "Ll/vg2;", "callbackManager", "Ll/r26;", "controllerManager", "Ll/nul;", "logger", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/ov3;Ll/vg2;Ll/r26;Ll/nul;)V", "Lorg/json/JSONObject;", "response", "Lcom/clevertap/android/sdk/response/InboxV2DeliverySource;", "source", "", "e", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/response/InboxV2DeliverySource;)V", "Lorg/json/JSONArray;", "messages", "b", "(Lorg/json/JSONArray;Lcom/clevertap/android/sdk/response/InboxV2DeliverySource;)V", "", "userId", "", "Ll/pv3;", "c", "(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/util/List;", "jsonBody", "stringBody", "Landroid/content/Context;", "context", "a", "(Lorg/json/JSONObject;Ljava/lang/String;Landroid/content/Context;)V", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;)V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/vg2;", "Ll/r26;", "Ll/nul;", "", "f", "Ljava/lang/Object;", "inboxControllerLock", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class drm extends o85 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final vg2 callbackManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final r26 controllerManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Object inboxControllerLock;

    public drm(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull ov3 ov3Var, @NotNull vg2 vg2Var, @NotNull r26 r26Var, @NotNull nul nulVar) {
        cleverTapInstanceConfig.getClass();
        ov3Var.getClass();
        vg2Var.getClass();
        r26Var.getClass();
        nulVar.getClass();
        this.config = cleverTapInstanceConfig;
        this.callbackManager = vg2Var;
        this.controllerManager = r26Var;
        this.logger = nulVar;
        Object objM166152b = ov3Var.m166152b();
        objM166152b.getClass();
        this.inboxControllerLock = objM166152b;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    private final void m113312b(JSONArray messages, InboxV2DeliverySource source) {
        synchronized (this.inboxControllerLock) {
            try {
                if (this.controllerManager.m177570e() == null) {
                    this.controllerManager.m177577l();
                }
                fv3 fv3VarM177570e = this.controllerManager.m177570e();
                if (fv3VarM177570e == null) {
                    return;
                }
                String strM123264m = fv3VarM177570e.m123264m();
                strM123264m.getClass();
                boolean zM123267p = fv3VarM177570e.m123267p(m113313c(messages, strM123264m), source);
                this.logger.verbose(this.config.getAccountId(), "InboxV2: applied — updated=" + zM123267p);
                if (zM123267p) {
                    this.callbackManager.mo100728b();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final List<pv3> m113313c(JSONArray messages, String userId) {
        pv3 pv3VarM171497m;
        ArrayList arrayList = new ArrayList(messages.length());
        int length = messages.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = messages.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (pv3VarM171497m = pv3.m171497m(jSONObjectOptJSONObject, userId, InboxMessageSource.V2)) != null) {
                arrayList.add(pv3VarM171497m);
            }
        }
        return arrayList;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    private final void m113314e(JSONObject response, InboxV2DeliverySource source) {
        boolean zIsAnalyticsOnly = this.config.isAnalyticsOnly();
        nul nulVar = this.logger;
        if (zIsAnalyticsOnly) {
            nulVar.verbose(this.config.getAccountId(), "InboxV2: analytics-only mode — skipping response");
            return;
        }
        nulVar.verbose(this.config.getAccountId(), "InboxV2: Processing response (source=" + source + ')');
        if (!response.has(Constants.INBOX_V2_JSON_RESPONSE_KEY)) {
            this.logger.verbose(this.config.getAccountId(), "InboxV2: response doesn't contain the v2 key");
            return;
        }
        try {
            JSONArray jSONArray = response.getJSONArray(Constants.INBOX_V2_JSON_RESPONSE_KEY);
            this.logger.verbose(this.config.getAccountId(), "InboxV2: " + jSONArray.length() + " message(s) in inbox_notifs_v2");
            this.logger.verbose(this.config.getAccountId(), "InboxV2: processing messages from server " + jSONArray + ' ');
            m113312b(jSONArray, source);
        } catch (Throwable th) {
            this.logger.verbose(this.config.getAccountId(), "InboxV2: Failed to parse response", th);
        }
    }

    @Override // p149l.n85
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo98525a(@Nullable JSONObject jsonBody, @Nullable String stringBody, @Nullable Context context) {
        if (jsonBody == null) {
            return;
        }
        m113314e(jsonBody, InboxV2DeliverySource.A1);
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m113315d(@NotNull JSONObject response) {
        response.getClass();
        m113314e(response, InboxV2DeliverySource.FETCH);
    }

    public /* synthetic */ drm(CleverTapInstanceConfig cleverTapInstanceConfig, ov3 ov3Var, vg2 vg2Var, r26 r26Var, nul nulVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, ov3Var, vg2Var, r26Var, (i & 16) != 0 ? cleverTapInstanceConfig.getLogger() : nulVar);
    }
}
