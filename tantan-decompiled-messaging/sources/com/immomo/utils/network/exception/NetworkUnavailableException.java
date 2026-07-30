package com.immomo.utils.network.exception;

import org.spongycastle.crypto.signers.PSSSigner;
import p149l.sgw;

/* JADX INFO: loaded from: classes7.dex */
public class NetworkUnavailableException extends HttpBaseException {
    private static final long serialVersionUID = 1;

    public NetworkUnavailableException(String str) {
        super(sgw.m184137a(new byte[]{-43, -37, -94, -46, -24, -21, -41, -37, -96, -48, -38, -6, -44, -34, PSSSigner.TRAILER_IMPLICIT, -46, -18, -55, -41, -14, -103, -40, -35, -22, -40, -55, -122, -47, -62, -26, -42, -7, -108}));
    }

    public NetworkUnavailableException() {
        super(sgw.m184137a(new byte[]{-43, -37, -94, -46, -24, -21, -41, -37, -96, -48, -38, -6, -44, -34, PSSSigner.TRAILER_IMPLICIT, -46, -18, -55, -41, -14, -103, -40, -35, -22, -40, -55, -122, -47, -62, -26, -42, -7, -108}));
    }
}
