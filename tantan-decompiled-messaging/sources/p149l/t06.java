package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.ContentFetchManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/t06;", "Ll/o85;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/network/ContentFetchManager;", "contentFetchManager", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/network/ContentFetchManager;)V", "Lorg/json/JSONArray;", "contentFetchArray", "Landroid/content/Context;", "context", "", "b", "(Lorg/json/JSONArray;Landroid/content/Context;)V", "Lorg/json/JSONObject;", "jsonBody", "", "stringBody", "a", "(Lorg/json/JSONObject;Ljava/lang/String;Landroid/content/Context;)V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "c", "Lcom/clevertap/android/sdk/network/ContentFetchManager;", "Lcom/clevertap/android/sdk/Logger;", Constants.INAPP_DATA_TAG, "Lcom/clevertap/android/sdk/Logger;", "logger", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class t06 extends o85 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ContentFetchManager contentFetchManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    public t06(@NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull ContentFetchManager contentFetchManager) {
        cleverTapInstanceConfig.getClass();
        contentFetchManager.getClass();
        this.config = cleverTapInstanceConfig;
        this.contentFetchManager = contentFetchManager;
        Logger logger = cleverTapInstanceConfig.getLogger();
        logger.getClass();
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final void m186821b(JSONArray contentFetchArray, Context context) {
        int length = contentFetchArray.length();
        Logger logger = this.logger;
        if (length == 0) {
            logger.verbose(this.config.getAccountId(), "No content fetch items to process");
            return;
        }
        logger.verbose(this.config.getAccountId(), "Found " + contentFetchArray.length() + " content fetch items");
        ContentFetchManager contentFetchManager = this.contentFetchManager;
        String packageName = context.getPackageName();
        packageName.getClass();
        contentFetchManager.m6780h(contentFetchArray, packageName);
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(@Nullable JSONObject jsonBody, @Nullable String stringBody, @NotNull Context context) {
        context.getClass();
        this.logger.verbose(this.config.getAccountId(), "Processing Content Fetch response...");
        if (this.config.isAnalyticsOnly()) {
            this.logger.verbose(this.config.getAccountId(), "CleverTap instance is configured to analytics only, not processing Content Fetch response");
            return;
        }
        if (jsonBody == null) {
            this.logger.verbose(this.config.getAccountId(), "Can't parse Content Fetch Response, JSON response object is null");
            return;
        }
        boolean zHas = jsonBody.has(Constants.CONTENT_FETCH_JSON_RESPONSE_KEY);
        Logger logger = this.logger;
        if (!zHas) {
            logger.verbose(this.config.getAccountId(), "JSON object doesn't contain the content_fetch key");
            return;
        }
        try {
            logger.verbose(this.config.getAccountId(), "Processing Content Fetch response");
            JSONArray jSONArray = jsonBody.getJSONArray(Constants.CONTENT_FETCH_JSON_RESPONSE_KEY);
            jSONArray.getClass();
            m186821b(jSONArray, context);
        } catch (Throwable th) {
            this.logger.verbose(this.config.getAccountId(), "Failed to parse content fetch response", th);
        }
    }
}
