package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1oSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFe1oSDK getCurrencyIso4217Code;

    public HttpException(@NonNull Throwable th, @NonNull AFe1oSDK aFe1oSDK) {
        super(th.getMessage(), th);
        this.getCurrencyIso4217Code = aFe1oSDK;
    }

    @NonNull
    public AFe1oSDK getMetrics() {
        return this.getCurrencyIso4217Code;
    }
}
