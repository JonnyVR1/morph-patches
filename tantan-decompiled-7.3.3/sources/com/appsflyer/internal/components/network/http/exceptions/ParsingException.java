package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1kSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1kSDK<String> getMonetizationNetwork;

    public ParsingException(String str, Throwable th, @NonNull AFe1kSDK<String> aFe1kSDK) {
        super(str, th);
        this.getMonetizationNetwork = aFe1kSDK;
    }

    @NonNull
    public AFe1kSDK<String> getRawResponse() {
        return this.getMonetizationNetwork;
    }
}
