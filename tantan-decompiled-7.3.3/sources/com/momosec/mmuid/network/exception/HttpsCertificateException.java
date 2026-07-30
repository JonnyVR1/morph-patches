package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p153l.fiw;

/* JADX INFO: loaded from: classes8.dex */
public class HttpsCertificateException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public HttpsCertificateException(Throwable th) {
        super(fiw.m125761a().getString(R$string.f15496e), th);
    }

    public HttpsCertificateException(Throwable th, String str) {
        super(str, th);
    }
}
