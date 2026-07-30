package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.util.Strings;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class URLAndHash {
    protected byte[] sha1Hash;
    protected String url;

    public URLAndHash(String str, byte[] bArr) {
        if (str == null || str.length() < 1 || str.length() >= 65536) {
            ig3.m135964a("'url' must have length from 1 to (2^16 - 1)");
            throw null;
        }
        if (bArr != null && bArr.length != 20) {
            ig3.m135964a("'sha1Hash' must have length == 20, if present");
            throw null;
        }
        this.url = str;
        this.sha1Hash = bArr;
    }

    public static URLAndHash parse(TlsContext tlsContext, InputStream inputStream) throws IOException {
        byte[] opaque16 = TlsUtils.readOpaque16(inputStream);
        byte[] fully = null;
        if (opaque16.length < 1) {
            csi0.m108512a(47);
            return null;
        }
        String strFromByteArray = Strings.fromByteArray(opaque16);
        short uint8 = TlsUtils.readUint8(inputStream);
        if (uint8 != 0) {
            if (uint8 != 1) {
                csi0.m108512a(47);
                return null;
            }
            fully = TlsUtils.readFully(20, inputStream);
        } else if (TlsUtils.isTLSv12(tlsContext)) {
            csi0.m108512a(47);
            return null;
        }
        return new URLAndHash(strFromByteArray, fully);
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque16(Strings.toByteArray(this.url), outputStream);
        if (this.sha1Hash == null) {
            TlsUtils.writeUint8(0, outputStream);
        } else {
            TlsUtils.writeUint8(1, outputStream);
            outputStream.write(this.sha1Hash);
        }
    }

    public byte[] getSHA1Hash() {
        return this.sha1Hash;
    }

    public String getURL() {
        return this.url;
    }
}
