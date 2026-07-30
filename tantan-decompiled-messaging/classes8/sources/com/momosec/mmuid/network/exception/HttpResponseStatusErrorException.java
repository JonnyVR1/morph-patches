package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p007l.hgw;
import p007l.ijw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class HttpResponseStatusErrorException extends HttpBaseException {
    private static final long serialVersionUID = 1;
    public int statusCode;

    public HttpResponseStatusErrorException(int i) {
        super(hgw.m9333a().getString(R$string.f473b) + ijw.m9418a(new byte[]{24}) + i + ijw.m9418a(new byte[]{25}));
        this.statusCode = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String localizedMessage = getLocalizedMessage();
        String name = getClass().getName();
        if (localizedMessage == null) {
            return name;
        }
        return name + ijw.m9418a(new byte[]{10, 70}) + localizedMessage + ijw.m9418a(new byte[]{107}) + this.statusCode + ijw.m9418a(new byte[]{109});
    }
}
