package p153l;

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
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m88121d2 = {"Ll/ftm;", "Ll/p95;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/nw3;", "ctLockManager", "Ll/ch2;", "callbackManager", "Ll/w36;", "controllerManager", "Ll/axl;", "logger", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/nw3;Ll/ch2;Ll/w36;Ll/axl;)V", "Lorg/json/JSONObject;", "response", "Lcom/clevertap/android/sdk/response/InboxV2DeliverySource;", "source", "", "e", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/response/InboxV2DeliverySource;)V", "Lorg/json/JSONArray;", "messages", "b", "(Lorg/json/JSONArray;Lcom/clevertap/android/sdk/response/InboxV2DeliverySource;)V", "", "userId", "", "Ll/ow3;", "c", "(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/util/List;", "jsonBody", "stringBody", "Landroid/content/Context;", "context", "a", "(Lorg/json/JSONObject;Ljava/lang/String;Landroid/content/Context;)V", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;)V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/ch2;", "Ll/w36;", "Ll/axl;", "", "f", "Ljava/lang/Object;", "inboxControllerLock", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ftm extends p95 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ch2 callbackManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final w36 controllerManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Object inboxControllerLock;

    public ftm(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull nw3 nw3Var, @NotNull ch2 ch2Var, @NotNull w36 w36Var, @NotNull axl axlVar) {
        cleverTapInstanceConfig.getClass();
        nw3Var.getClass();
        ch2Var.getClass();
        w36Var.getClass();
        axlVar.getClass();
        this.config = cleverTapInstanceConfig;
        this.callbackManager = ch2Var;
        this.controllerManager = w36Var;
        this.logger = axlVar;
        Object objM164938b = nw3Var.m164938b();
        objM164938b.getClass();
        this.inboxControllerLock = objM164938b;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    private final void m127326b(JSONArray messages, InboxV2DeliverySource source) {
        synchronized (this.inboxControllerLock) {
            try {
                if (this.controllerManager.m204742e() == null) {
                    this.controllerManager.m204749l();
                }
                ew3 ew3VarM204742e = this.controllerManager.m204742e();
                if (ew3VarM204742e == null) {
                    return;
                }
                String strM122877m = ew3VarM204742e.m122877m();
                strM122877m.getClass();
                boolean zM122880p = ew3VarM204742e.m122880p(m127327c(messages, strM122877m), source);
                this.logger.verbose(this.config.getAccountId(), "InboxV2: applied — updated=" + zM122880p);
                if (zM122880p) {
                    this.callbackManager.mo96508b();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final List<ow3> m127327c(JSONArray messages, String userId) {
        ow3 ow3VarM169491m;
        ArrayList arrayList = new ArrayList(messages.length());
        int length = messages.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = messages.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (ow3VarM169491m = ow3.m169491m(jSONObjectOptJSONObject, userId, InboxMessageSource.V2)) != null) {
                arrayList.add(ow3VarM169491m);
            }
        }
        return arrayList;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    private final void m127328e(JSONObject response, InboxV2DeliverySource source) {
        boolean zIsAnalyticsOnly = this.config.isAnalyticsOnly();
        axl axlVar = this.logger;
        if (zIsAnalyticsOnly) {
            axlVar.verbose(this.config.getAccountId(), "InboxV2: analytics-only mode — skipping response");
            return;
        }
        axlVar.verbose(this.config.getAccountId(), "InboxV2: Processing response (source=" + source + ')');
        if (!response.has(Constants.INBOX_V2_JSON_RESPONSE_KEY)) {
            this.logger.verbose(this.config.getAccountId(), "InboxV2: response doesn't contain the v2 key");
            return;
        }
        try {
            JSONArray jSONArray = response.getJSONArray(Constants.INBOX_V2_JSON_RESPONSE_KEY);
            this.logger.verbose(this.config.getAccountId(), "InboxV2: " + jSONArray.length() + " message(s) in inbox_notifs_v2");
            this.logger.verbose(this.config.getAccountId(), "InboxV2: processing messages from server " + jSONArray + ' ');
            m127326b(jSONArray, source);
        } catch (Throwable th) {
            this.logger.verbose(this.config.getAccountId(), "InboxV2: Failed to parse response", th);
        }
    }

    @Override // p153l.o95
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public void mo98656a(@Nullable JSONObject jsonBody, @Nullable String stringBody, @Nullable Context context) {
        if (jsonBody == null) {
            return;
        }
        m127328e(jsonBody, InboxV2DeliverySource.A1);
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m127329d(@NotNull JSONObject response) {
        response.getClass();
        m127328e(response, InboxV2DeliverySource.FETCH);
    }

    public /* synthetic */ ftm(CleverTapInstanceConfig cleverTapInstanceConfig, nw3 nw3Var, ch2 ch2Var, w36 w36Var, axl axlVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, nw3Var, ch2Var, w36Var, (i & 16) != 0 ? cleverTapInstanceConfig.getLogger() : axlVar);
    }
}
