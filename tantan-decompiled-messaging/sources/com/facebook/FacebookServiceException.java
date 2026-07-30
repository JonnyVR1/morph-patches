package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m87232d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "Lcom/facebook/FacebookRequestError;", "requestError", "", "errorMessage", "<init>", "(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Lcom/facebook/FacebookRequestError;", "getRequestError", "()Lcom/facebook/FacebookRequestError;", "Companion", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;

    @NotNull
    private final FacebookRequestError requestError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(@NotNull FacebookRequestError facebookRequestError, @Nullable String str) {
        super(str);
        facebookRequestError.getClass();
        this.requestError = facebookRequestError;
    }

    @NotNull
    public final FacebookRequestError getRequestError() {
        return this.requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    @NotNull
    public String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.requestError.getRequestStatusCode() + ", facebookErrorCode: " + this.requestError.getErrorCode() + ", facebookErrorType: " + this.requestError.getErrorType() + ", message: " + this.requestError.m7496c() + "}";
    }
}
