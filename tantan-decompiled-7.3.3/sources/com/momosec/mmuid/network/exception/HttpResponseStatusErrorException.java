package com.momosec.mmuid.network.exception;

import com.momosec.mmuid.R$string;
import p153l.fiw;
import p153l.hmw;

/* JADX INFO: loaded from: classes8.dex */
public class HttpResponseStatusErrorException extends HttpBaseException {
    private static final long serialVersionUID = 1;
    public int statusCode;

    public HttpResponseStatusErrorException(int i) {
        super(fiw.m125761a().getString(R$string.f15493b) + hmw.m136007a(new byte[]{24}) + i + hmw.m136007a(new byte[]{25}));
        this.statusCode = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String localizedMessage = getLocalizedMessage();
        String name = getClass().getName();
        if (localizedMessage == null) {
            return name;
        }
        return name + hmw.m136007a(new byte[]{10, 70}) + localizedMessage + hmw.m136007a(new byte[]{107}) + this.statusCode + hmw.m136007a(new byte[]{109});
    }
}
