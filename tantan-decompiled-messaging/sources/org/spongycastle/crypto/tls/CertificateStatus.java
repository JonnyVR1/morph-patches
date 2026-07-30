package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ocsp.OCSPResponse;
import p149l.csi0;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class CertificateStatus {
    protected Object response;
    protected short statusType;

    public CertificateStatus(short s, Object obj) {
        if (!isCorrectType(s, obj)) {
            ig3.m135964a("'response' is not an instance of the correct type");
            throw null;
        }
        this.statusType = s;
        this.response = obj;
    }

    public static boolean isCorrectType(short s, Object obj) {
        if (s == 1) {
            return obj instanceof OCSPResponse;
        }
        ig3.m135964a("'statusType' is an unsupported value");
        return false;
    }

    public static CertificateStatus parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (uint8 == 1) {
            return new CertificateStatus(uint8, OCSPResponse.getInstance(TlsUtils.readDERObject(TlsUtils.readOpaque24(inputStream))));
        }
        csi0.m108512a(50);
        return null;
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.statusType, outputStream);
        if (this.statusType == 1) {
            TlsUtils.writeOpaque24(((OCSPResponse) this.response).getEncoded(ASN1Encoding.DER), outputStream);
        } else {
            csi0.m108512a(80);
        }
    }

    public OCSPResponse getOCSPResponse() {
        if (isCorrectType((short) 1, this.response)) {
            return (OCSPResponse) this.response;
        }
        qkq0.m175383a("'response' is not an OCSPResponse");
        return null;
    }

    public Object getResponse() {
        return this.response;
    }

    public short getStatusType() {
        return this.statusType;
    }
}
