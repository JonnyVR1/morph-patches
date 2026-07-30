package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class CertificateURL {
    protected short type;
    protected Vector urlAndHashList;

    public class ListBuffer16 extends ByteArrayOutputStream {
        public ListBuffer16() throws IOException {
            TlsUtils.writeUint16(0, this);
        }

        public void encodeTo(OutputStream outputStream) throws IOException {
            int i = ((ByteArrayOutputStream) this).count - 2;
            TlsUtils.checkUint16(i);
            TlsUtils.writeUint16(i, ((ByteArrayOutputStream) this).buf, 0);
            outputStream.write(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    public CertificateURL(short s, Vector vector) {
        if (!CertChainType.isValid(s)) {
            ig3.m135964a("'type' is not a valid CertChainType value");
            throw null;
        }
        if (vector == null || vector.isEmpty()) {
            ig3.m135964a("'urlAndHashList' must have length > 0");
            throw null;
        }
        this.type = s;
        this.urlAndHashList = vector;
    }

    public static CertificateURL parse(TlsContext tlsContext, InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (!CertChainType.isValid(uint8)) {
            csi0.m108512a(50);
            return null;
        }
        int uint16 = TlsUtils.readUint16(inputStream);
        if (uint16 < 1) {
            csi0.m108512a(50);
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readFully(uint16, inputStream));
        Vector vector = new Vector();
        while (byteArrayInputStream.available() > 0) {
            vector.addElement(URLAndHash.parse(tlsContext, byteArrayInputStream));
        }
        return new CertificateURL(uint8, vector);
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.type, outputStream);
        ListBuffer16 listBuffer16 = new ListBuffer16();
        for (int i = 0; i < this.urlAndHashList.size(); i++) {
            ((URLAndHash) this.urlAndHashList.elementAt(i)).encode(listBuffer16);
        }
        listBuffer16.encodeTo(outputStream);
    }

    public short getType() {
        return this.type;
    }

    public Vector getURLAndHashList() {
        return this.urlAndHashList;
    }
}
