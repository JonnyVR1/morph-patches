package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p153l.f1j0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class CertificateStatusRequest {
    protected Object request;
    protected short statusType;

    public CertificateStatusRequest(short s, Object obj) {
        if (!isCorrectType(s, obj)) {
            wg3.m206174a("'request' is not an instance of the correct type");
            throw null;
        }
        this.statusType = s;
        this.request = obj;
    }

    public static boolean isCorrectType(short s, Object obj) {
        if (s == 1) {
            return obj instanceof OCSPStatusRequest;
        }
        wg3.m206174a("'statusType' is an unsupported value");
        return false;
    }

    public static CertificateStatusRequest parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (uint8 == 1) {
            return new CertificateStatusRequest(uint8, OCSPStatusRequest.parse(inputStream));
        }
        f1j0.m123577a(50);
        return null;
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.statusType, outputStream);
        if (this.statusType == 1) {
            ((OCSPStatusRequest) this.request).encode(outputStream);
        } else {
            f1j0.m123577a(80);
        }
    }

    public OCSPStatusRequest getOCSPStatusRequest() {
        if (isCorrectType((short) 1, this.request)) {
            return (OCSPStatusRequest) this.request;
        }
        wtq0.m207906a("'request' is not an OCSPStatusRequest");
        return null;
    }

    public Object getRequest() {
        return this.request;
    }

    public short getStatusType() {
        return this.statusType;
    }
}
