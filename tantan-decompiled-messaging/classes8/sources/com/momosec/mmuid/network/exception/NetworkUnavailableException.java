package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p007l.hgw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class NetworkUnavailableException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public NetworkUnavailableException(String str) {
        super(hgw.m9333a().getString(R$string.f475d));
    }

    public NetworkUnavailableException() {
        super(hgw.m9333a().getString(R$string.f475d));
    }
}
