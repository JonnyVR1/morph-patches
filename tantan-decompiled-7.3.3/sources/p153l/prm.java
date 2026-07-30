package p153l;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.network.C1319b;
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
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, m88121d2 = {"Ll/prm;", "", "Ll/su3;", "executors", "Lcom/clevertap/android/sdk/network/b;", "networkManager", "Ll/esm;", "inAppResponse", "Landroid/content/Context;", "context", "Ll/axl;", "logger", "<init>", "(Ll/su3;Lcom/clevertap/android/sdk/network/b;Ll/esm;Landroid/content/Context;Ll/axl;)V", "Landroid/os/Bundle;", "extras", "Lorg/json/JSONObject;", "c", "(Landroid/os/Bundle;)Lorg/json/JSONObject;", "", "e", "(Landroid/os/Bundle;)Z", "inapp", "b", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "content", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "(Landroid/os/Bundle;)V", "a", "Ll/su3;", "Lcom/clevertap/android/sdk/network/b;", "Ll/esm;", "Landroid/content/Context;", "Ll/axl;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class prm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final su3 executors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final C1319b networkManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final esm inAppResponse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    public prm(@NotNull su3 su3Var, @NotNull C1319b c1319b, @NotNull esm esmVar, @NotNull Context context, @NotNull axl axlVar) {
        su3Var.getClass();
        c1319b.getClass();
        esmVar.getClass();
        context.getClass();
        axlVar.getClass();
        this.executors = su3Var;
        this.networkManager = c1319b;
        this.inAppResponse = esmVar;
        this.context = context;
        this.logger = axlVar;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m173499a(prm prmVar, Bundle bundle) {
        prmVar.getClass();
        bundle.getClass();
        try {
            JSONObject jSONObjectM173501c = prmVar.m173501c(bundle);
            if (jSONObjectM173501c == null) {
                return Unit.INSTANCE;
            }
            JSONArray jSONArray = new JSONArray();
            if (prmVar.m173502e(bundle) && (jSONObjectM173501c = prmVar.m173500b(jSONObjectM173501c)) == null) {
                prmVar.logger.debug("Failed to parse the image-interstitial notification. Aborting preview display");
                return Unit.INSTANCE;
            }
            JSONArray jSONArrayPut = jSONArray.put(jSONObjectM173501c);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.INAPP_JSON_RESPONSE_KEY, jSONArrayPut);
            prmVar.inAppResponse.mo98656a(jSONObject, null, prmVar.context);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prmVar.logger.verbose("Failed to display inapp notification from push notification payload", th);
        }
    }

    /* JADX INFO: renamed from: b */
    private final JSONObject m173500b(JSONObject inapp) throws JSONException {
        String strOptString = inapp.optString(Constants.INAPP_IMAGE_INTERSTITIAL_CONFIG);
        strOptString.getClass();
        String strM173503f = m173503f(strOptString);
        if (strM173503f == null) {
            this.logger.debug("Failed to parse the image-interstitial notification");
            return null;
        }
        inapp.put("type", Constants.KEY_CUSTOM_HTML);
        Object objOpt = inapp.opt(Constants.INAPP_DATA_TAG);
        JSONObject jSONObject = objOpt instanceof JSONObject ? new JSONObject(((JSONObject) objOpt).toString()) : new JSONObject();
        jSONObject.put(Constants.INAPP_HTML_TAG, strM173503f);
        inapp.put(Constants.INAPP_DATA_TAG, jSONObject);
        return inapp;
    }

    /* JADX INFO: renamed from: c */
    private final JSONObject m173501c(Bundle extras) {
        JSONObject jSONObjectM6901h;
        String string = extras.getString(Constants.INAPP_PREVIEW_S3_URL_KEY);
        if (kx3.m151795p(string) && (jSONObjectM6901h = this.networkManager.m6901h(string)) != null) {
            return jSONObjectM6901h;
        }
        String string2 = extras.getString(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_KEY);
        if (string2 != null) {
            return new JSONObject(string2);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m173502e(Bundle extras) {
        String string = extras.getString(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_TYPE_KEY);
        return Intrinsics.m88377d(string, Constants.INAPP_IMAGE_INTERSTITIAL_TYPE) || Intrinsics.m88377d(string, Constants.INAPP_ADVANCED_BUILDER_TYPE);
    }

    /* JADX INFO: renamed from: f */
    private final String m173503f(String content) {
        if (StringsKt.m94329e0(content)) {
            return null;
        }
        try {
            String strM5982y = Utils.m5982y(this.context, Constants.INAPP_IMAGE_INTERSTITIAL_HTML_NAME);
            if (strM5982y == null) {
                return null;
            }
            List listSplit$default = StringsKt.split$default(strM5982y, new String[]{Constants.INAPP_HTML_SPLIT}, false, 0, 6, null);
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
    public final void m173504d(@NotNull final Bundle extras) {
        extras.getClass();
        Task taskM187990d = this.executors.m187990d();
        taskM187990d.getClass();
        taskM187990d.m7000g("testInappNotification", new Callable() { // from class: l.orm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return prm.m173499a(this.f148724a, extras);
            }
        });
    }
}
