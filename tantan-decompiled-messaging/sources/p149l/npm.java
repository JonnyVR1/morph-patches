package p149l;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1296b;
import com.clevertap.android.sdk.task.Task;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, m87232d2 = {"Ll/npm;", "", "Ll/tt3;", "executors", "Lcom/clevertap/android/sdk/network/b;", "networkManager", "Ll/cqm;", "inAppResponse", "Landroid/content/Context;", "context", "Ll/nul;", "logger", "<init>", "(Ll/tt3;Lcom/clevertap/android/sdk/network/b;Ll/cqm;Landroid/content/Context;Ll/nul;)V", "Landroid/os/Bundle;", "extras", "Lorg/json/JSONObject;", "c", "(Landroid/os/Bundle;)Lorg/json/JSONObject;", "", "e", "(Landroid/os/Bundle;)Z", "inapp", "b", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "content", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "(Landroid/os/Bundle;)V", "a", "Ll/tt3;", "Lcom/clevertap/android/sdk/network/b;", "Ll/cqm;", "Landroid/content/Context;", "Ll/nul;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class npm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final tt3 executors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final C1296b networkManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final cqm inAppResponse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    public npm(@NotNull tt3 tt3Var, @NotNull C1296b c1296b, @NotNull cqm cqmVar, @NotNull Context context, @NotNull nul nulVar) {
        tt3Var.getClass();
        c1296b.getClass();
        cqmVar.getClass();
        context.getClass();
        nulVar.getClass();
        this.executors = tt3Var;
        this.networkManager = c1296b;
        this.inAppResponse = cqmVar;
        this.context = context;
        this.logger = nulVar;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m160523a(npm npmVar, Bundle bundle) {
        npmVar.getClass();
        bundle.getClass();
        try {
            JSONObject jSONObjectM160525c = npmVar.m160525c(bundle);
            if (jSONObjectM160525c == null) {
                return Unit.INSTANCE;
            }
            JSONArray jSONArray = new JSONArray();
            if (npmVar.m160526e(bundle) && (jSONObjectM160525c = npmVar.m160524b(jSONObjectM160525c)) == null) {
                npmVar.logger.debug("Failed to parse the image-interstitial notification. Aborting preview display");
                return Unit.INSTANCE;
            }
            JSONArray jSONArrayPut = jSONArray.put(jSONObjectM160525c);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.INAPP_JSON_RESPONSE_KEY, jSONArrayPut);
            npmVar.inAppResponse.mo98525a(jSONObject, null, npmVar.context);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            npmVar.logger.verbose("Failed to display inapp notification from push notification payload", th);
        }
    }

    /* JADX INFO: renamed from: b */
    private final JSONObject m160524b(JSONObject inapp) throws JSONException {
        String strOptString = inapp.optString(Constants.INAPP_IMAGE_INTERSTITIAL_CONFIG);
        strOptString.getClass();
        String strM160527f = m160527f(strOptString);
        if (strM160527f == null) {
            this.logger.debug("Failed to parse the image-interstitial notification");
            return null;
        }
        inapp.put("type", Constants.KEY_CUSTOM_HTML);
        Object objOpt = inapp.opt(Constants.INAPP_DATA_TAG);
        JSONObject jSONObject = objOpt instanceof JSONObject ? new JSONObject(((JSONObject) objOpt).toString()) : new JSONObject();
        jSONObject.put(Constants.INAPP_HTML_TAG, strM160527f);
        inapp.put(Constants.INAPP_DATA_TAG, jSONObject);
        return inapp;
    }

    /* JADX INFO: renamed from: c */
    private final JSONObject m160525c(Bundle extras) {
        JSONObject jSONObjectM6847h;
        String string = extras.getString(Constants.INAPP_PREVIEW_S3_URL_KEY);
        if (lw3.m151946p(string) && (jSONObjectM6847h = this.networkManager.m6847h(string)) != null) {
            return jSONObjectM6847h;
        }
        String string2 = extras.getString(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_KEY);
        if (string2 != null) {
            return new JSONObject(string2);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m160526e(Bundle extras) {
        String string = extras.getString(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_TYPE_KEY);
        return Intrinsics.m87488d(string, Constants.INAPP_IMAGE_INTERSTITIAL_TYPE) || Intrinsics.m87488d(string, Constants.INAPP_ADVANCED_BUILDER_TYPE);
    }

    /* JADX INFO: renamed from: f */
    private final String m160527f(String content) {
        if (StringsKt.m93438e0(content)) {
            return null;
        }
        try {
            String strM5928y = Utils.m5928y(this.context, Constants.INAPP_IMAGE_INTERSTITIAL_HTML_NAME);
            if (strM5928y == null) {
                return null;
            }
            List listSplit$default = StringsKt.split$default(strM5928y, new String[]{Constants.INAPP_HTML_SPLIT}, false, 0, 6, null);
            if (listSplit$default.size() != 2) {
                return null;
            }
            return ((String) listSplit$default.get(0)) + content + ((String) listSplit$default.get(1));
        } catch (IOException e) {
            this.logger.debug("Failed to read the image-interstitial HTML file", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m160528d(@NotNull final Bundle extras) {
        extras.getClass();
        Task taskM190592d = this.executors.m190592d();
        taskM190592d.getClass();
        taskM190592d.m6946g("testInappNotification", new Callable() { // from class: l.mpm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return npm.m160523a(this.f135070a, extras);
            }
        });
    }
}
