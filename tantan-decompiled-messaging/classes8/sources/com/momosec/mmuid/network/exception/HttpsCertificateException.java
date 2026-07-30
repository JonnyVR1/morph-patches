package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p007l.hgw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class HttpsCertificateException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public HttpsCertificateException(Throwable th) {
        super(hgw.m9333a().getString(R$string.f476e), th);
    }

    public HttpsCertificateException(Throwable th, String str) {
        super(str, th);
    }
}
