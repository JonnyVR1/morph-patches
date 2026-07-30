package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.spongycastle.util.Integers;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class TlsSRTPUtils {
    public static final Integer EXT_use_srtp = Integers.valueOf(14);

    public static void addUseSRTPExtension(Hashtable hashtable, UseSRTPData useSRTPData) throws IOException {
        hashtable.put(EXT_use_srtp, createUseSRTPExtension(useSRTPData));
    }

    public static byte[] createUseSRTPExtension(UseSRTPData useSRTPData) throws IOException {
        if (useSRTPData == null) {
            ig3.m135964a("'useSRTPData' cannot be null");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TlsUtils.writeUint16ArrayWithUint16Length(useSRTPData.getProtectionProfiles(), byteArrayOutputStream);
        TlsUtils.writeOpaque8(useSRTPData.getMki(), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static UseSRTPData getUseSRTPExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_use_srtp);
        if (extensionData == null) {
            return null;
        }
        return readUseSRTPExtension(extensionData);
    }

    public static UseSRTPData readUseSRTPExtension(byte[] bArr) throws IOException {
        if (bArr == null) {
            ig3.m135964a("'extensionData' cannot be null");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int uint16 = TlsUtils.readUint16(byteArrayInputStream);
        if (uint16 < 2 || (uint16 & 1) != 0) {
            csi0.m108512a(50);
            return null;
        }
        int[] uint16Array = TlsUtils.readUint16Array(uint16 / 2, byteArrayInputStream);
        byte[] opaque8 = TlsUtils.readOpaque8(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return new UseSRTPData(uint16Array, opaque8);
    }
}
