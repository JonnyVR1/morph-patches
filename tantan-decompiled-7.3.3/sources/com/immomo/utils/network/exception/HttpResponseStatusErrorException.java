package com.immomo.utils.network.exception;

import org.spongycastle.crypto.signers.PSSSigner;
import p153l.riw;

/* JADX INFO: loaded from: classes7.dex */
public class HttpResponseStatusErrorException extends HttpBaseException {
    private static final long serialVersionUID = 1;
    public int statusCode;

    public HttpResponseStatusErrorException(int i) {
        super(riw.m181611a(new byte[]{-41, -37, -96, -48, -38, -6, -40, -55, -122, -47, -48, -28, -43, -62, -128, -33, -43, -61, -33, -38, -67, -33, -50, -47, -41, -50, PSSSigner.TRAILER_IMPLICIT, -46, -15, -24, -39, -31, PSSSigner.TRAILER_IMPLICIT, -33, -50, -13, 24}) + i + riw.m181611a(new byte[]{25}));
        this.statusCode = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String localizedMessage = getLocalizedMessage();
        String name = getClass().getName();
        if (localizedMessage == null) {
            return name;
        }
        return name + riw.m181611a(new byte[]{10, 70}) + localizedMessage + riw.m181611a(new byte[]{107}) + this.statusCode + riw.m181611a(new byte[]{109});
    }
}
