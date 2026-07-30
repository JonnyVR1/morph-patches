package com.facebook;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "graphResponse", "Lcom/facebook/GraphResponse;", "errorMessage", "", "(Lcom/facebook/GraphResponse;Ljava/lang/String;)V", "getGraphResponse", "()Lcom/facebook/GraphResponse;", "toString", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class FacebookGraphResponseException extends FacebookException {

    @Nullable
    private final GraphResponse graphResponse;

    public FacebookGraphResponseException(@Nullable GraphResponse graphResponse, @Nullable String str) {
        super(str);
        this.graphResponse = graphResponse;
    }

    @Nullable
    public final GraphResponse getGraphResponse() {
        return this.graphResponse;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    @NotNull
    public String toString() {
        GraphResponse graphResponse = this.graphResponse;
        FacebookRequestError error = graphResponse != null ? graphResponse.getError() : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        if (error != null) {
            sb.append("httpResponseCode: ");
            sb.append(error.getRequestStatusCode());
            sb.append(", facebookErrorCode: ");
            sb.append(error.getErrorCode());
            sb.append(", facebookErrorType: ");
            sb.append(error.getErrorType());
            sb.append(", message: ");
            sb.append(error.m7550c());
            sb.append("}");
        }
        return sb.toString();
    }
}
