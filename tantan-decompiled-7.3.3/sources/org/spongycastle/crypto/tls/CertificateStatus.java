package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ocsp.OCSPResponse;
import p153l.f1j0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class CertificateStatus {
    protected Object response;
    protected short statusType;

    public CertificateStatus(short s, Object obj) {
        if (!isCorrectType(s, obj)) {
            wg3.m206174a("'response' is not an instance of the correct type");
            throw null;
        }
        this.statusType = s;
        this.response = obj;
    }

    public static boolean isCorrectType(short s, Object obj) {
        if (s == 1) {
            return obj instanceof OCSPResponse;
        }
        wg3.m206174a("'statusType' is an unsupported value");
        return false;
    }

    public static CertificateStatus parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (uint8 == 1) {
            return new CertificateStatus(uint8, OCSPResponse.getInstance(TlsUtils.readDERObject(TlsUtils.readOpaque24(inputStream))));
        }
        f1j0.m123577a(50);
        return null;
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.statusType, outputStream);
        if (this.statusType == 1) {
            TlsUtils.writeOpaque24(((OCSPResponse) this.response).getEncoded(ASN1Encoding.DER), outputStream);
        } else {
            f1j0.m123577a(80);
        }
    }

    public OCSPResponse getOCSPResponse() {
        if (isCorrectType((short) 1, this.response)) {
            return (OCSPResponse) this.response;
        }
        wtq0.m207906a("'response' is not an OCSPResponse");
        return null;
    }

    public Object getResponse() {
        return this.response;
    }

    public short getStatusType() {
        return this.statusType;
    }
}
