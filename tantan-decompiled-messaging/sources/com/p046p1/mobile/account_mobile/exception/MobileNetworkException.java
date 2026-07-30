package com.p046p1.mobile.account_mobile.exception;

/* JADX INFO: loaded from: classes8.dex */
public class MobileNetworkException extends RuntimeException {
    public boolean networkError;

    public MobileNetworkException(boolean z) {
        super(z ? "network error, maybe network is turn off" : "get info failed");
        this.networkError = z;
    }
}
