package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(@NonNull String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = -1;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th) {
        super(str, th);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str) {
        super(str);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = i;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, @Nullable Throwable th, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, @Nullable Throwable th, @NonNull FirebaseRemoteConfigException.Code code) {
        super(str, th, code);
        this.httpStatusCode = i;
    }
}
