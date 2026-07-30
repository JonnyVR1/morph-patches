package com.appsflyer.deeplink;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DeepLinkResult {

    @Nullable
    private final DeepLink deepLink;

    @Nullable
    private final Error error;

    @NonNull
    private final Status status;

    public enum Error {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED,
        DEVELOPER_ERROR
    }

    public enum Status {
        FOUND,
        NOT_FOUND,
        ERROR
    }

    public DeepLinkResult(@Nullable DeepLink deepLink, @Nullable Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
        } else if (deepLink != null) {
            this.status = Status.FOUND;
        } else {
            this.status = Status.NOT_FOUND;
        }
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Error getError() {
        return this.error;
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put("error", this.error);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.status);
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", e);
        }
        return jSONObject.toString();
    }
}
