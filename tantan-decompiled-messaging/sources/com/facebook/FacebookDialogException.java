package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\n¨\u0006\u0012"}, m87232d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "", "message", "", "errorCode", "failingUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "I", "getErrorCode", "()I", "Ljava/lang/String;", "getFailingUrl", "Companion", "a", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class FacebookDialogException extends FacebookException {
    public static final long serialVersionUID = 1;
    private final int errorCode;

    @Nullable
    private final String failingUrl;

    public FacebookDialogException(@Nullable String str, int i, @Nullable String str2) {
        super(str);
        this.errorCode = i;
        this.failingUrl = str2;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getFailingUrl() {
        return this.failingUrl;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    @NotNull
    public String toString() {
        return "{FacebookDialogException: errorCode: " + this.errorCode + ", message: " + getMessage() + ", url: " + this.failingUrl + "}";
    }
}
