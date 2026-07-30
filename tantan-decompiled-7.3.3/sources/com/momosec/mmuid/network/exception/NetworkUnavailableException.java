package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p153l.fiw;

/* JADX INFO: loaded from: classes8.dex */
public class NetworkUnavailableException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public NetworkUnavailableException(String str) {
        super(fiw.m125761a().getString(R$string.f15495d));
    }

    public NetworkUnavailableException() {
        super(fiw.m125761a().getString(R$string.f15495d));
    }
}
