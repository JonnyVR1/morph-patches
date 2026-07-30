package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p149l.hgw;

/* JADX INFO: loaded from: classes8.dex */
public class NetworkBaseException extends Exception {
    private static final long serialVersionUID = -3970373080567427194L;

    public NetworkBaseException() {
        this(hgw.m130927a().getString(R$string.f14773a));
    }

    public NetworkBaseException(String str) {
        super(str);
    }

    public NetworkBaseException(String str, Throwable th) {
        super(str, th);
    }

    public NetworkBaseException(Throwable th) {
        super(hgw.m130927a().getString(R$string.f14773a), th);
    }
}
