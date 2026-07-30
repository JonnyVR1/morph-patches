package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p007l.hgw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class NetworkBaseException extends Exception {
    private static final long serialVersionUID = -3970373080567427194L;

    public NetworkBaseException() {
        this(hgw.m9333a().getString(R$string.f472a));
    }

    public NetworkBaseException(String str) {
        super(str);
    }

    public NetworkBaseException(String str, Throwable th) {
        super(str, th);
    }

    public NetworkBaseException(Throwable th) {
        super(hgw.m9333a().getString(R$string.f472a), th);
    }
}
