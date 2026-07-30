package com.immomo.medialog.api.http;

import p153l.tzv;

/* JADX INFO: loaded from: classes7.dex */
public class LiveXRequestException extends Exception {
    public int code;
    public String showMsg;

    public LiveXRequestException(int i, Throwable th, String str) {
        this.code = i;
        this.showMsg = String.format(str, Integer.valueOf(i));
        if (th != null) {
            tzv.m193745c("Exception", th);
        }
    }
}
