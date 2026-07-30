package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import l.ig3;
import org.spongycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Certificate {
    public static final Certificate EMPTY_CHAIN = new Certificate(new org.spongycastle.asn1.x509.Certificate[0]);
    protected org.spongycastle.asn1.x509.Certificate[] certificateList;

    public Certificate(org.spongycastle.asn1.x509.Certificate[] certificateArr) {
        if (certificateArr != null) {
            this.certificateList = certificateArr;
        } else {
            ig3.a("'certificateList' cannot be null");
            throw null;
        }
    }

    public static Certificate parse(InputStream inputStream) throws IOException {
        int uint24 = TlsUtils.readUint24(inputStream);
        if (uint24 == 0) {
            return EMPTY_CHAIN;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readFully(uint24, inputStream));
        Vector vector = new Vector();
        while (byteArrayInputStream.available() > 0) {
            vector.addElement(org.spongycastle.asn1.x509.Certificate.getInstance(TlsUtils.readDERObject(TlsUtils.readOpaque24(byteArrayInputStream))));
        }
        org.spongycastle.asn1.x509.Certificate[] certificateArr = new org.spongycastle.asn1.x509.Certificate[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            certificateArr[i] = (org.spongycastle.asn1.x509.Certificate) vector.elementAt(i);
        }
        return new Certificate(certificateArr);
    }

    public org.spongycastle.asn1.x509.Certificate[] cloneCertificateList() {
        org.spongycastle.asn1.x509.Certificate[] certificateArr = this.certificateList;
        int length = certificateArr.length;
        org.spongycastle.asn1.x509.Certificate[] certificateArr2 = new org.spongycastle.asn1.x509.Certificate[length];
        System.arraycopy(certificateArr, 0, certificateArr2, 0, length);
        return certificateArr2;
    }

    public void encode(OutputStream outputStream) throws IOException {
        Vector vector = new Vector(this.certificateList.length);
        int i = 0;
        int length = 0;
        while (true) {
            org.spongycastle.asn1.x509.Certificate[] certificateArr = this.certificateList;
            if (i >= certificateArr.length) {
                break;
            }
            byte[] encoded = certificateArr[i].getEncoded(ASN1Encoding.DER);
            vector.addElement(encoded);
            length += encoded.length + 3;
            i++;
        }
        TlsUtils.checkUint24(length);
        TlsUtils.writeUint24(length, outputStream);
        for (int i2 = 0; i2 < vector.size(); i2++) {
            TlsUtils.writeOpaque24((byte[]) vector.elementAt(i2), outputStream);
        }
    }

    public org.spongycastle.asn1.x509.Certificate getCertificateAt(int i) {
        return this.certificateList[i];
    }

    public org.spongycastle.asn1.x509.Certificate[] getCertificateList() {
        return cloneCertificateList();
    }

    public int getLength() {
        return this.certificateList.length;
    }

    public boolean isEmpty() {
        return this.certificateList.length == 0;
    }
}
