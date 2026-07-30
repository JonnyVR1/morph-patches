package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p149l.hgw;

/* JADX INFO: loaded from: classes8.dex */
public class NetworkUnavailableException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public NetworkUnavailableException(String str) {
        super(hgw.m130927a().getString(R$string.f14776d));
    }

    public NetworkUnavailableException() {
        super(hgw.m130927a().getString(R$string.f14776d));
    }
}
