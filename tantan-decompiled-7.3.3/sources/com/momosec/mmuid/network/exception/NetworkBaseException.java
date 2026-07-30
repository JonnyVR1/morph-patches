package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p153l.fiw;

/* JADX INFO: loaded from: classes8.dex */
public class NetworkBaseException extends Exception {
    private static final long serialVersionUID = -3970373080567427194L;

    public NetworkBaseException() {
        this(fiw.m125761a().getString(R$string.f15492a));
    }

    public NetworkBaseException(String str) {
        super(str);
    }

    public NetworkBaseException(String str, Throwable th) {
        super(str, th);
    }

    public NetworkBaseException(Throwable th) {
        super(fiw.m125761a().getString(R$string.f15492a), th);
    }
}
