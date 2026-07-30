package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p149l.hgw;
import p149l.ijw;

/* JADX INFO: loaded from: classes8.dex */
public class HttpResponseStatusErrorException extends HttpBaseException {
    private static final long serialVersionUID = 1;
    public int statusCode;

    public HttpResponseStatusErrorException(int i) {
        super(hgw.m130927a().getString(R$string.f14774b) + ijw.m136753a(new byte[]{24}) + i + ijw.m136753a(new byte[]{25}));
        this.statusCode = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String localizedMessage = getLocalizedMessage();
        String name = getClass().getName();
        if (localizedMessage == null) {
            return name;
        }
        return name + ijw.m136753a(new byte[]{10, 70}) + localizedMessage + ijw.m136753a(new byte[]{107}) + this.statusCode + ijw.m136753a(new byte[]{109});
    }
}
