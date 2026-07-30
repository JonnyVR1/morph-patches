package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.util.Arrays;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DTLSProtocol {
    protected final SecureRandom secureRandom;

    public DTLSProtocol(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.secureRandom = secureRandom;
        } else {
            ig3.m135964a("'secureRandom' cannot be null");
            throw null;
        }
    }

    public static void applyMaxFragmentLengthExtension(DTLSRecordLayer dTLSRecordLayer, short s) throws IOException {
        if (s >= 0) {
            if (MaxFragmentLength.isValid(s)) {
                dTLSRecordLayer.setPlaintextLimit(1 << (s + 8));
            } else {
                csi0.m108512a(80);
            }
        }
    }

    public static short evaluateMaxFragmentLengthExtension(boolean z, Hashtable hashtable, Hashtable hashtable2, short s) throws IOException {
        short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable2);
        if (maxFragmentLengthExtension < 0 || (MaxFragmentLength.isValid(maxFragmentLengthExtension) && (z || maxFragmentLengthExtension == TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable)))) {
            return maxFragmentLengthExtension;
        }
        csi0.m108512a(s);
        return (short) 0;
    }

    public static byte[] generateCertificate(Certificate certificate) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        certificate.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] generateSupplementalData(Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TlsProtocol.writeSupplementalData(byteArrayOutputStream, vector);
        return byteArrayOutputStream.toByteArray();
    }

    public static void validateSelectedCipherSuite(int i, short s) throws IOException {
        int encryptionAlgorithm = TlsUtils.getEncryptionAlgorithm(i);
        if (encryptionAlgorithm == 1 || encryptionAlgorithm == 2) {
            csi0.m108512a(s);
        }
    }

    public void processFinished(byte[] bArr, byte[] bArr2) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] fully = TlsUtils.readFully(bArr2.length, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (Arrays.constantTimeAreEqual(bArr2, fully)) {
            return;
        }
        csi0.m108512a(40);
    }
}
