package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Integers;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class TlsSRPUtils {
    public static final Integer EXT_SRP = Integers.valueOf(12);

    public static void addSRPExtension(Hashtable hashtable, byte[] bArr) throws IOException {
        hashtable.put(EXT_SRP, createSRPExtension(bArr));
    }

    public static byte[] createSRPExtension(byte[] bArr) throws IOException {
        if (bArr != null) {
            return TlsUtils.encodeOpaque8(bArr);
        }
        csi0.m108512a(80);
        return null;
    }

    public static byte[] getSRPExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_SRP);
        if (extensionData == null) {
            return null;
        }
        return readSRPExtension(extensionData);
    }

    public static boolean isSRPCipherSuite(int i) {
        switch (i) {
            case CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA /* 49178 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA /* 49179 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA /* 49180 */:
            case CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA /* 49181 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA /* 49182 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA /* 49183 */:
            case CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA /* 49184 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA /* 49185 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA /* 49186 */:
                return true;
            default:
                return false;
        }
    }

    public static byte[] readSRPExtension(byte[] bArr) throws IOException {
        if (bArr == null) {
            ig3.m135964a("'extensionData' cannot be null");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] opaque8 = TlsUtils.readOpaque8(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return opaque8;
    }

    public static BigInteger readSRPParameter(InputStream inputStream) throws IOException {
        return new BigInteger(1, TlsUtils.readOpaque16(inputStream));
    }

    public static void writeSRPParameter(BigInteger bigInteger, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque16(BigIntegers.asUnsignedByteArray(bigInteger), outputStream);
    }
}
