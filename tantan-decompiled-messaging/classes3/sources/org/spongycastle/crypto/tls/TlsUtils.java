package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import l.hg3;
import l.ig3;
import l.qkq0;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.KeyUsage;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
import org.spongycastle.util.p013io.Streams;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TlsUtils {
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final short[] EMPTY_SHORTS = new short[0];
    public static final int[] EMPTY_INTS = new int[0];
    public static final long[] EMPTY_LONGS = new long[0];
    public static final Integer EXT_signature_algorithms = Integers.valueOf(13);
    static final byte[] SSL_CLIENT = {67, 76, 78, 84};
    static final byte[] SSL_SERVER = {83, 82, 86, 82};
    static final byte[][] SSL3_CONST = genSSL3Const();

    public static byte[] PRF(TlsContext tlsContext, byte[] bArr, String str, byte[] bArr2, int i) {
        if (tlsContext.getServerVersion().isSSL()) {
            qkq0.a("No PRF available for SSLv3 session");
            return null;
        }
        byte[] byteArray = Strings.toByteArray(str);
        byte[] bArrConcat = concat(byteArray, bArr2);
        int prfAlgorithm = tlsContext.getSecurityParameters().getPrfAlgorithm();
        if (prfAlgorithm == 0) {
            return PRF_legacy(bArr, byteArray, bArrConcat, i);
        }
        byte[] bArr3 = new byte[i];
        hmac_hash(createPRFHash(prfAlgorithm), bArr, bArrConcat, bArr3);
        return bArr3;
    }

    public static byte[] PRF_legacy(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int length = (bArr.length + 1) / 2;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        System.arraycopy(bArr, bArr.length - length, bArr5, 0, length);
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[i];
        hmac_hash(createHash((short) 1), bArr4, bArr3, bArr6);
        hmac_hash(createHash((short) 2), bArr5, bArr3, bArr7);
        for (int i2 = 0; i2 < i; i2++) {
            bArr6[i2] = (byte) (bArr6[i2] ^ bArr7[i2]);
        }
        return bArr6;
    }

    public static void addSignatureAlgorithmsExtension(Hashtable hashtable, Vector vector) throws IOException {
        hashtable.put(EXT_signature_algorithms, createSignatureAlgorithmsExtension(vector));
    }

    public static byte[] calculateKeyBlock(TlsContext tlsContext, int i) {
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        byte[] masterSecret = securityParameters.getMasterSecret();
        byte[] bArrConcat = concat(securityParameters.getServerRandom(), securityParameters.getClientRandom());
        return isSSL(tlsContext) ? calculateKeyBlock_SSL(masterSecret, bArrConcat, i) : PRF(tlsContext, masterSecret, ExporterLabel.key_expansion, bArrConcat, i);
    }

    public static byte[] calculateKeyBlock_SSL(byte[] bArr, byte[] bArr2, int i) {
        Digest digestCreateHash = createHash((short) 1);
        Digest digestCreateHash2 = createHash((short) 2);
        int digestSize = digestCreateHash.getDigestSize();
        int digestSize2 = digestCreateHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[i + digestSize];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            byte[] bArr5 = SSL3_CONST[i3];
            digestCreateHash2.update(bArr5, 0, bArr5.length);
            digestCreateHash2.update(bArr, 0, bArr.length);
            digestCreateHash2.update(bArr2, 0, bArr2.length);
            digestCreateHash2.doFinal(bArr3, 0);
            digestCreateHash.update(bArr, 0, bArr.length);
            digestCreateHash.update(bArr3, 0, digestSize2);
            digestCreateHash.doFinal(bArr4, i2);
            i2 += digestSize;
            i3++;
        }
        return Arrays.copyOfRange(bArr4, 0, i);
    }

    public static byte[] calculateMasterSecret(TlsContext tlsContext, byte[] bArr) {
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        byte[] sessionHash = securityParameters.extendedMasterSecret ? securityParameters.getSessionHash() : concat(securityParameters.getClientRandom(), securityParameters.getServerRandom());
        if (isSSL(tlsContext)) {
            return calculateMasterSecret_SSL(bArr, sessionHash);
        }
        return PRF(tlsContext, bArr, securityParameters.extendedMasterSecret ? ExporterLabel.extended_master_secret : ExporterLabel.master_secret, sessionHash, 48);
    }

    public static byte[] calculateMasterSecret_SSL(byte[] bArr, byte[] bArr2) {
        Digest digestCreateHash = createHash((short) 1);
        Digest digestCreateHash2 = createHash((short) 2);
        int digestSize = digestCreateHash.getDigestSize();
        int digestSize2 = digestCreateHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[digestSize * 3];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            byte[] bArr5 = SSL3_CONST[i2];
            digestCreateHash2.update(bArr5, 0, bArr5.length);
            digestCreateHash2.update(bArr, 0, bArr.length);
            digestCreateHash2.update(bArr2, 0, bArr2.length);
            digestCreateHash2.doFinal(bArr3, 0);
            digestCreateHash.update(bArr, 0, bArr.length);
            digestCreateHash.update(bArr3, 0, digestSize2);
            digestCreateHash.doFinal(bArr4, i);
            i += digestSize;
        }
        return bArr4;
    }

    public static byte[] calculateVerifyData(TlsContext tlsContext, String str, byte[] bArr) {
        if (isSSL(tlsContext)) {
            return bArr;
        }
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        return PRF(tlsContext, securityParameters.getMasterSecret(), str, bArr, securityParameters.getVerifyDataLength());
    }

    public static void checkUint16(int i) throws IOException {
        if (isValidUint16(i)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void checkUint24(int i) throws IOException {
        if (isValidUint24(i)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void checkUint32(long j) throws IOException {
        if (isValidUint32(j)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void checkUint48(long j) throws IOException {
        if (isValidUint48(j)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void checkUint64(long j) throws IOException {
        if (isValidUint64(j)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void checkUint8(short s) throws IOException {
        if (isValidUint8(s)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static Digest cloneHash(short s, Digest digest) {
        switch (s) {
            case 1:
                return new MD5Digest((MD5Digest) digest);
            case 2:
                return new SHA1Digest((SHA1Digest) digest);
            case 3:
                return new SHA224Digest((SHA224Digest) digest);
            case 4:
                return new SHA256Digest((SHA256Digest) digest);
            case 5:
                return new SHA384Digest((SHA384Digest) digest);
            case 6:
                return new SHA512Digest((SHA512Digest) digest);
            default:
                ig3.a("unknown HashAlgorithm");
                return null;
        }
    }

    public static Digest clonePRFHash(int i, Digest digest) {
        return i != 0 ? cloneHash(getHashAlgorithmForPRFAlgorithm(i), digest) : new CombinedHash((CombinedHash) digest);
    }

    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static Digest createHash(short s) {
        switch (s) {
            case 1:
                return new MD5Digest();
            case 2:
                return new SHA1Digest();
            case 3:
                return new SHA224Digest();
            case 4:
                return new SHA256Digest();
            case 5:
                return new SHA384Digest();
            case 6:
                return new SHA512Digest();
            default:
                ig3.a("unknown HashAlgorithm");
                return null;
        }
    }

    public static Digest createPRFHash(int i) {
        return i != 0 ? createHash(getHashAlgorithmForPRFAlgorithm(i)) : new CombinedHash();
    }

    public static byte[] createSignatureAlgorithmsExtension(Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeSupportedSignatureAlgorithms(vector, false, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static TlsSigner createTlsSigner(short s) {
        if (s == 1) {
            return new TlsRSASigner();
        }
        if (s == 2) {
            return new TlsDSSSigner();
        }
        if (s == 64) {
            return new TlsECDSASigner();
        }
        ig3.a("'clientCertificateType' is not a type with signing capability");
        return null;
    }

    public static byte[] encodeOpaque8(byte[] bArr) throws IOException {
        checkUint8(bArr.length);
        return Arrays.prepend(bArr, (byte) bArr.length);
    }

    public static void encodeSupportedSignatureAlgorithms(Vector vector, boolean z, OutputStream outputStream) throws IOException {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            ig3.a("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
            return;
        }
        int size = vector.size() * 2;
        checkUint16(size);
        writeUint16(size, outputStream);
        for (int i = 0; i < vector.size(); i++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) vector.elementAt(i);
            if (!z && signatureAndHashAlgorithm.getSignature() == 0) {
                ig3.a("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension");
                return;
            }
            signatureAndHashAlgorithm.encode(outputStream);
        }
    }

    public static byte[] encodeUint16ArrayWithUint16Length(int[] iArr) throws IOException {
        byte[] bArr = new byte[(iArr.length * 2) + 2];
        writeUint16ArrayWithUint16Length(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint8ArrayWithUint8Length(short[] sArr) throws IOException {
        byte[] bArr = new byte[sArr.length + 1];
        writeUint8ArrayWithUint8Length(sArr, bArr, 0);
        return bArr;
    }

    private static byte[][] genSSL3Const() {
        byte[][] bArr = new byte[10][];
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            byte[] bArr2 = new byte[i2];
            Arrays.fill(bArr2, (byte) (i + 65));
            bArr[i] = bArr2;
            i = i2;
        }
        return bArr;
    }

    public static int getCipherType(int i) throws IOException {
        int encryptionAlgorithm = getEncryptionAlgorithm(i);
        switch (encryptionAlgorithm) {
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
                return 1;
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 2;
            default:
                switch (encryptionAlgorithm) {
                    case 100:
                    case 101:
                        return 0;
                    case 102:
                        return 2;
                    default:
                        csi0.m3424a(80);
                        return 0;
                }
        }
    }

    public static short getClientCertificateType(Certificate certificate, Certificate certificate2) throws IOException {
        if (certificate.isEmpty()) {
            return (short) -1;
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            if (asymmetricKeyParameterCreateKey.isPrivate()) {
                throw new TlsFatalAlert((short) 80);
            }
            if (asymmetricKeyParameterCreateKey instanceof RSAKeyParameters) {
                validateKeyUsage(certificateAt, 128);
                return (short) 1;
            }
            if (asymmetricKeyParameterCreateKey instanceof DSAPublicKeyParameters) {
                validateKeyUsage(certificateAt, 128);
                return (short) 2;
            }
            if (!(asymmetricKeyParameterCreateKey instanceof ECPublicKeyParameters)) {
                throw new TlsFatalAlert((short) 43);
            }
            validateKeyUsage(certificateAt, 128);
            return (short) 64;
        } catch (Exception e) {
            throw new TlsFatalAlert((short) 43, e);
        }
    }

    public static Vector getDefaultDSSSignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 2));
    }

    public static Vector getDefaultECDSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 3));
    }

    public static Vector getDefaultRSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 1));
    }

    public static Vector getDefaultSupportedSignatureAlgorithms() {
        short[] sArr = {2, 3, 4, 5, 6};
        short[] sArr2 = {1, 2, 3};
        Vector vector = new Vector();
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                vector.addElement(new SignatureAndHashAlgorithm(sArr[i2], sArr2[i]));
            }
        }
        return vector;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0039 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0056 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0057 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x005c A[RETURN] */
    public static int getEncryptionAlgorithm(int i) throws IOException {
        if (i != 1 && i != 2) {
            if (i != 4 && i != 5) {
                switch (i) {
                    case 10:
                    case 13:
                    case 16:
                    case 19:
                    case 22:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49155 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA /* 49165 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
                    case CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA /* 49178 */:
                    case CipherSuite.TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA /* 49179 */:
                    case CipherSuite.TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA /* 49180 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
                        return 7;
                    case 24:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA /* 49154 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA /* 49159 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA /* 49164 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA /* 49169 */:
                    case CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA /* 49174 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_RC4_128_SHA /* 49203 */:
                        break;
                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                        return 10;
                    case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                        return 11;
                    case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
                        return 8;
                    case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
                        return 9;
                    case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                    case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
                        return 0;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                    case 188:
                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                    case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49300 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49302 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49304 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
                        return 12;
                    case 192:
                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                        return 13;
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA /* 49153 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA /* 49163 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
                        break;
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA /* 49156 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA /* 49166 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
                    case CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA /* 49181 */:
                    case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA /* 49182 */:
                    case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA /* 49183 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
                        return 8;
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA /* 49157 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA /* 49167 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
                    case CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA /* 49184 */:
                    case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA /* 49185 */:
                    case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA /* 49186 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
                        return 9;
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                    case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49301 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49303 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49305 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                        return 13;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                    case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                        return 19;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                    case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                        return 20;
                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                        return 15;
                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                        return 17;
                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
                    case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                        return 16;
                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
                    case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                        return 18;
                    case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52243 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52244 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52245 */:
                        return 102;
                    case CipherSuite.TLS_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58384 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58386 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_ESTREAM_SALSA20_SHA1 /* 58388 */:
                    case CipherSuite.TLS_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58390 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58392 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58394 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58396 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58398 */:
                        return 100;
                    case CipherSuite.TLS_RSA_WITH_SALSA20_SHA1 /* 58385 */:
                    case CipherSuite.TLS_ECDHE_RSA_WITH_SALSA20_SHA1 /* 58387 */:
                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_SALSA20_SHA1 /* 58389 */:
                    case CipherSuite.TLS_PSK_WITH_SALSA20_SHA1 /* 58391 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_SALSA20_SHA1 /* 58393 */:
                    case CipherSuite.TLS_RSA_PSK_WITH_SALSA20_SHA1 /* 58395 */:
                    case CipherSuite.TLS_DHE_PSK_WITH_SALSA20_SHA1 /* 58397 */:
                    case CipherSuite.TLS_DHE_RSA_WITH_SALSA20_SHA1 /* 58399 */:
                        return 101;
                    default:
                        switch (i) {
                            case 44:
                            case 45:
                            case 46:
                                break;
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 59:
                                                return 0;
                                            case 60:
                                            case CipherSuite.TLS_DH_DSS_WITH_AES_128_CBC_SHA256 /* 62 */:
                                            case 63:
                                            case 64:
                                                return 8;
                                            case 61:
                                                return 9;
                                            case 65:
                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA /* 66 */:
                                            case 67:
                                            case 68:
                                            case 69:
                                                return 12;
                                            default:
                                                switch (i) {
                                                    case 103:
                                                        return 8;
                                                    case 104:
                                                    case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA256 /* 105 */:
                                                    case 106:
                                                    case 107:
                                                        return 9;
                                                    default:
                                                        switch (i) {
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA /* 134 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                                                                return 13;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                                                                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                                                                        break;
                                                                    case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                                                                    case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                                                                        return 7;
                                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
                                                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA /* 148 */:
                                                                        break;
                                                                    case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                                                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA /* 149 */:
                                                                        break;
                                                                    case CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA /* 150 */:
                                                                    case CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA /* 151 */:
                                                                    case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                                                                    case CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA /* 153 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA /* 154 */:
                                                                        return 14;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 /* 158 */:
                                                                            case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                                                                            case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                                                                            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                                                                                return 10;
                                                                            case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /* 159 */:
                                                                            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                                                                            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                                                                            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                                                                return 11;
                                                                            default:
                                                                                csi0.m3424a(80);
                                                                                return 0;
                                                                        }
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                        return 9;
                                }
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                                return 8;
                        }
                        break;
                }
            }
            return 2;
        }
        return 0;
    }

    public static byte[] getExtensionData(Hashtable hashtable, Integer num) {
        if (hashtable == null) {
            return null;
        }
        return (byte[]) hashtable.get(num);
    }

    public static short getHashAlgorithmForPRFAlgorithm(int i) {
        if (i == 0) {
            ig3.a("legacy PRF not a valid algorithm");
            return (short) 0;
        }
        if (i == 1) {
            return (short) 4;
        }
        if (i == 2) {
            return (short) 5;
        }
        ig3.a("unknown PRFAlgorithm");
        return (short) 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x004c A[RETURN] */
    public static int getKeyExchangeAlgorithm(int i) throws IOException {
        if (i != 1 && i != 2 && i != 4 && i != 5) {
            switch (i) {
                case 10:
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                case 192:
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
                case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
                case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
                case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                case CipherSuite.TLS_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58384 */:
                case CipherSuite.TLS_RSA_WITH_SALSA20_SHA1 /* 58385 */:
                    break;
                case 13:
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                    return 7;
                case 16:
                case 188:
                case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                    return 9;
                case 19:
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                    return 3;
                case 22:
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
                case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
                case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52245 */:
                case CipherSuite.TLS_DHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58398 */:
                case CipherSuite.TLS_DHE_RSA_WITH_SALSA20_SHA1 /* 58399 */:
                    return 5;
                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49300 */:
                case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49301 */:
                case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
                case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
                case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
                case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
                case CipherSuite.TLS_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58390 */:
                case CipherSuite.TLS_PSK_WITH_SALSA20_SHA1 /* 58391 */:
                    return 13;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49302 */:
                case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49303 */:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
                case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
                case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
                case CipherSuite.TLS_DHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58396 */:
                case CipherSuite.TLS_DHE_PSK_WITH_SALSA20_SHA1 /* 58397 */:
                    return 14;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49304 */:
                case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49305 */:
                case CipherSuite.TLS_RSA_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58394 */:
                case CipherSuite.TLS_RSA_PSK_WITH_SALSA20_SHA1 /* 58395 */:
                    return 15;
                case CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA /* 49153 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA /* 49154 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49155 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA /* 49156 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA /* 49157 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                    return 16;
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA /* 49159 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52244 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_ESTREAM_SALSA20_SHA1 /* 58388 */:
                case CipherSuite.TLS_ECDHE_ECDSA_WITH_SALSA20_SHA1 /* 58389 */:
                    return 17;
                case CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA /* 49163 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA /* 49164 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA /* 49165 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA /* 49166 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA /* 49167 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                    return 18;
                case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA /* 49169 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52243 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58386 */:
                case CipherSuite.TLS_ECDHE_RSA_WITH_SALSA20_SHA1 /* 58387 */:
                    return 19;
                case CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA /* 49178 */:
                case CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA /* 49181 */:
                case CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA /* 49184 */:
                    return 21;
                case CipherSuite.TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA /* 49179 */:
                case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA /* 49182 */:
                case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA /* 49185 */:
                    return 23;
                case CipherSuite.TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA /* 49180 */:
                case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA /* 49183 */:
                case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA /* 49186 */:
                    return 22;
                case CipherSuite.TLS_ECDHE_PSK_WITH_RC4_128_SHA /* 49203 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58392 */:
                case CipherSuite.TLS_ECDHE_PSK_WITH_SALSA20_SHA1 /* 58393 */:
                    return 24;
                default:
                    switch (i) {
                        case 44:
                            return 13;
                        case 45:
                            return 14;
                        case 46:
                            return 15;
                        case 47:
                            break;
                        case 48:
                            return 7;
                        case 49:
                            return 9;
                        case 50:
                            return 3;
                        case 51:
                            return 5;
                        default:
                            switch (i) {
                                case 53:
                                    break;
                                case 54:
                                    return 7;
                                case 55:
                                    return 9;
                                case 56:
                                    return 3;
                                case 57:
                                    return 5;
                                default:
                                    switch (i) {
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 65:
                                            break;
                                        case CipherSuite.TLS_DH_DSS_WITH_AES_128_CBC_SHA256 /* 62 */:
                                        case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA /* 66 */:
                                            return 7;
                                        case 63:
                                        case 67:
                                            return 9;
                                        case 64:
                                        case 68:
                                            return 3;
                                        case 69:
                                            return 5;
                                        default:
                                            switch (i) {
                                                case 103:
                                                case 107:
                                                    return 5;
                                                case 104:
                                                    return 7;
                                                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA256 /* 105 */:
                                                    return 9;
                                                case 106:
                                                    return 3;
                                                default:
                                                    switch (i) {
                                                        case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                                                            break;
                                                        case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                                                            return 7;
                                                        case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA /* 134 */:
                                                            return 9;
                                                        case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                                                            return 3;
                                                        case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                                                            return 5;
                                                        default:
                                                            switch (i) {
                                                                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                                                case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                                                                case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                                                                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                                                                    return 13;
                                                                case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                                                                case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                                                                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
                                                                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                                                                    return 14;
                                                                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                                                                case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                                                                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA /* 148 */:
                                                                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA /* 149 */:
                                                                    return 15;
                                                                case CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA /* 150 */:
                                                                    break;
                                                                case CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA /* 151 */:
                                                                    return 7;
                                                                case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                                                                    return 9;
                                                                case CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA /* 153 */:
                                                                    return 3;
                                                                case CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA /* 154 */:
                                                                    return 5;
                                                                default:
                                                                    switch (i) {
                                                                        case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                                                                        case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                                                                            break;
                                                                        case CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 /* 158 */:
                                                                        case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /* 159 */:
                                                                            return 5;
                                                                        case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                                                                        case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                                                                            return 9;
                                                                        case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                                                                        case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                                                                            return 3;
                                                                        case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                                                                        case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                                                            return 7;
                                                                        default:
                                                                            csi0.m3424a(80);
                                                                            return 0;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0030 A[FALL_THROUGH, RETURN] */
    public static int getMACAlgorithm(int i) throws IOException {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        switch (i) {
                            case 10:
                            case 13:
                            case 16:
                            case 19:
                            case 22:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA /* 49153 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA /* 49154 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49155 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA /* 49156 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA /* 49157 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA /* 49159 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA /* 49163 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA /* 49164 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA /* 49165 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA /* 49166 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA /* 49167 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA /* 49169 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
                            case CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA /* 49178 */:
                            case CipherSuite.TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA /* 49179 */:
                            case CipherSuite.TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA /* 49180 */:
                            case CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA /* 49181 */:
                            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA /* 49182 */:
                            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA /* 49183 */:
                            case CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA /* 49184 */:
                            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA /* 49185 */:
                            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA /* 49186 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_RC4_128_SHA /* 49203 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
                            case CipherSuite.TLS_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58384 */:
                            case CipherSuite.TLS_RSA_WITH_SALSA20_SHA1 /* 58385 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58386 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_SALSA20_SHA1 /* 58387 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ESTREAM_SALSA20_SHA1 /* 58388 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_SALSA20_SHA1 /* 58389 */:
                            case CipherSuite.TLS_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58390 */:
                            case CipherSuite.TLS_PSK_WITH_SALSA20_SHA1 /* 58391 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58392 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_SALSA20_SHA1 /* 58393 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58394 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_SALSA20_SHA1 /* 58395 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58396 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_SALSA20_SHA1 /* 58397 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58398 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_SALSA20_SHA1 /* 58399 */:
                                break;
                            case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                            case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
                            case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
                            case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
                            case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
                            case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
                            case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
                            case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
                            case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
                            case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
                            case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52243 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52244 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52245 */:
                                return 0;
                            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                            case 188:
                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                            case 192:
                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49300 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49302 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49304 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
                                return 3;
                            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49301 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49303 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49305 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                                return 4;
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            default:
                                                switch (i) {
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case CipherSuite.TLS_DH_DSS_WITH_AES_128_CBC_SHA256 /* 62 */:
                                                    case 63:
                                                    case 64:
                                                        return 3;
                                                    default:
                                                        switch (i) {
                                                            case 103:
                                                            case 104:
                                                            case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA256 /* 105 */:
                                                            case 106:
                                                            case 107:
                                                                return 3;
                                                            default:
                                                                switch (i) {
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                                                                            case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                                                                            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                                                                            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                                                                            case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                                                                            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                                                                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
                                                                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                                                                            case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                                                                            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                                                                            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA /* 148 */:
                                                                            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA /* 149 */:
                                                                            case CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA /* 150 */:
                                                                            case CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA /* 151 */:
                                                                            case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                                                                            case CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA /* 153 */:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA /* 154 */:
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                                                                                    case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 /* 158 */:
                                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /* 159 */:
                                                                                    case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                                                                                    case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                                                                                    case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                                                                                    case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                                                                                    case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                                                                                    case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                                                                        return 0;
                                                                                    default:
                                                                                        csi0.m3424a(80);
                                                                                        return 0;
                                                                                }
                                                                        }
                                                                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                                                                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                                                                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA /* 134 */:
                                                                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                                                                        return 2;
                                                                }
                                                                break;
                                                        }
                                                    case 65:
                                                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA /* 66 */:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                        return 2;
                                                }
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                return 2;
                                        }
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                        return 2;
                                }
                                break;
                        }
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static ProtocolVersion getMinimumVersion(int i) {
        switch (i) {
            case 59:
            case 60:
            case 61:
            case CipherSuite.TLS_DH_DSS_WITH_AES_128_CBC_SHA256 /* 62 */:
            case 63:
            case 64:
                break;
            default:
                switch (i) {
                    case 103:
                    case 104:
                    case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA256 /* 105 */:
                    case 106:
                    case 107:
                        break;
                    default:
                        switch (i) {
                            case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                            case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 /* 158 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /* 159 */:
                            case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                break;
                            default:
                                switch (i) {
                                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                                    case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                                        break;
                                    default:
                                        switch (i) {
                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                                            case 188:
                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                                            case 192:
                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                                                break;
                                            default:
                                                switch (i) {
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256 /* 49284 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384 /* 49285 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
                                                                    case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
                                                                    case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52243 */:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52244 */:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52245 */:
                                                                                break;
                                                                            default:
                                                                                return ProtocolVersion.SSLv3;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        return ProtocolVersion.TLSv12;
    }

    public static ASN1ObjectIdentifier getOIDForHashAlgorithm(short s) {
        switch (s) {
            case 1:
                return PKCSObjectIdentifiers.md5;
            case 2:
                return X509ObjectIdentifiers.id_SHA1;
            case 3:
                return NISTObjectIdentifiers.id_sha224;
            case 4:
                return NISTObjectIdentifiers.id_sha256;
            case 5:
                return NISTObjectIdentifiers.id_sha384;
            case 6:
                return NISTObjectIdentifiers.id_sha512;
            default:
                ig3.a("unknown HashAlgorithm");
                return null;
        }
    }

    public static Vector getSignatureAlgorithmsExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = getExtensionData(hashtable, EXT_signature_algorithms);
        if (extensionData == null) {
            return null;
        }
        return readSignatureAlgorithmsExtension(extensionData);
    }

    public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(TlsContext tlsContext, TlsSignerCredentials tlsSignerCredentials) throws IOException {
        if (isTLSv12(tlsContext)) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = tlsSignerCredentials.getSignatureAndHashAlgorithm();
            if (signatureAndHashAlgorithm != null) {
                return signatureAndHashAlgorithm;
            }
            csi0.m3424a(80);
        }
        return null;
    }

    public static boolean hasExpectedEmptyExtensionData(Hashtable hashtable, Integer num, short s) throws IOException {
        byte[] extensionData = getExtensionData(hashtable, num);
        if (extensionData == null) {
            return false;
        }
        if (extensionData.length == 0) {
            return true;
        }
        csi0.m3424a(s);
        return false;
    }

    public static boolean hasSigningCapability(short s) {
        return s == 1 || s == 2 || s == 64;
    }

    public static void hmac_hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        HMac hMac = new HMac(digest);
        hMac.init(new KeyParameter(bArr));
        int digestSize = digest.getDigestSize();
        int length = ((bArr3.length + digestSize) - 1) / digestSize;
        int macSize = hMac.getMacSize();
        byte[] bArr4 = new byte[macSize];
        byte[] bArr5 = new byte[hMac.getMacSize()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            hMac.update(bArr6, 0, bArr6.length);
            hMac.doFinal(bArr4, 0);
            hMac.update(bArr4, 0, macSize);
            hMac.update(bArr2, 0, bArr2.length);
            hMac.doFinal(bArr5, 0);
            int i2 = digestSize * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(digestSize, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }

    public static TlsSession importSession(byte[] bArr, SessionParameters sessionParameters) {
        return new TlsSessionImpl(bArr, sessionParameters);
    }

    public static boolean isAEADCipherSuite(int i) throws IOException {
        return 2 == getCipherType(i);
    }

    public static boolean isBlockCipherSuite(int i) throws IOException {
        return 1 == getCipherType(i);
    }

    public static boolean isSSL(TlsContext tlsContext) {
        return tlsContext.getServerVersion().isSSL();
    }

    public static boolean isSignatureAlgorithmsExtensionAllowed(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isStreamCipherSuite(int i) throws IOException {
        return getCipherType(i) == 0;
    }

    public static boolean isTLSv11(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv12(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidCipherSuiteForVersion(int i, ProtocolVersion protocolVersion) {
        return getMinimumVersion(i).isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidUint16(long j) {
        return (65535 & j) == j;
    }

    public static boolean isValidUint24(long j) {
        return (16777215 & j) == j;
    }

    public static boolean isValidUint32(long j) {
        return (4294967295L & j) == j;
    }

    public static boolean isValidUint48(long j) {
        return (281474976710655L & j) == j;
    }

    public static boolean isValidUint64(long j) {
        return true;
    }

    public static boolean isValidUint8(long j) {
        return (255 & j) == j;
    }

    public static Vector parseSupportedSignatureAlgorithms(boolean z, InputStream inputStream) throws IOException {
        int uint16 = readUint16(inputStream);
        if (uint16 < 2 || (uint16 & 1) != 0) {
            csi0.m3424a(50);
            return null;
        }
        int i = uint16 / 2;
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 < i; i2++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = SignatureAndHashAlgorithm.parse(inputStream);
            if (!z && signatureAndHashAlgorithm.getSignature() == 0) {
                csi0.m3424a(47);
                return null;
            }
            vector.addElement(signatureAndHashAlgorithm);
        }
        return vector;
    }

    public static ASN1Primitive readASN1Object(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        ASN1Primitive object = aSN1InputStream.readObject();
        if (object == null) {
            csi0.m3424a(50);
            return null;
        }
        if (aSN1InputStream.readObject() == null) {
            return object;
        }
        csi0.m3424a(50);
        return null;
    }

    public static byte[] readAllOrNothing(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        int fully = Streams.readFully(inputStream, bArr);
        if (fully == 0) {
            return null;
        }
        if (fully == i) {
            return bArr;
        }
        hg3.a();
        return null;
    }

    public static ASN1Primitive readDERObject(byte[] bArr) throws IOException {
        ASN1Primitive aSN1Object = readASN1Object(bArr);
        if (Arrays.areEqual(aSN1Object.getEncoded(ASN1Encoding.DER), bArr)) {
            return aSN1Object;
        }
        csi0.m3424a(50);
        return null;
    }

    public static byte[] readFully(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        if (i == Streams.readFully(inputStream, bArr)) {
            return bArr;
        }
        hg3.a();
        return null;
    }

    public static byte[] readOpaque16(InputStream inputStream) throws IOException {
        return readFully(readUint16(inputStream), inputStream);
    }

    public static byte[] readOpaque24(InputStream inputStream) throws IOException {
        return readFully(readUint24(inputStream), inputStream);
    }

    public static byte[] readOpaque8(InputStream inputStream) throws IOException {
        return readFully(readUint8(inputStream), inputStream);
    }

    public static Vector readSignatureAlgorithmsExtension(byte[] bArr) throws IOException {
        if (bArr == null) {
            ig3.a("'extensionData' cannot be null");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Vector supportedSignatureAlgorithms = parseSupportedSignatureAlgorithms(false, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return supportedSignatureAlgorithms;
    }

    public static int readUint16(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        if (i2 >= 0) {
            return i2 | (i << 8);
        }
        hg3.a();
        return 0;
    }

    public static int[] readUint16Array(int i, InputStream inputStream) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readUint16(inputStream);
        }
        return iArr;
    }

    public static int readUint24(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        if (i3 >= 0) {
            return i3 | (i << 16) | (i2 << 8);
        }
        hg3.a();
        return 0;
    }

    public static long readUint32(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if (i4 >= 0) {
            return ((long) (i4 | (i << 2) | (i2 << 16) | (i3 << 8))) & 4294967295L;
        }
        hg3.a();
        return 0L;
    }

    public static long readUint48(byte[] bArr, int i) {
        int uint24 = readUint24(bArr, i);
        return (((long) readUint24(bArr, i + 3)) & 4294967295L) | ((((long) uint24) & 4294967295L) << 24);
    }

    public static short readUint8(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            return (short) i;
        }
        hg3.a();
        return (short) 0;
    }

    public static short[] readUint8Array(int i, InputStream inputStream) throws IOException {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = readUint8(inputStream);
        }
        return sArr;
    }

    public static ProtocolVersion readVersion(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        if (i2 >= 0) {
            return ProtocolVersion.get(i, i2);
        }
        hg3.a();
        return null;
    }

    public static int readVersionRaw(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        if (i2 >= 0) {
            return i2 | (i << 8);
        }
        hg3.a();
        return 0;
    }

    public static void trackHashAlgorithms(TlsHandshakeHash tlsHandshakeHash, Vector vector) {
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                tlsHandshakeHash.trackHashAlgorithm(((SignatureAndHashAlgorithm) vector.elementAt(i)).getHash());
            }
        }
    }

    public static void validateKeyUsage(org.spongycastle.asn1.x509.Certificate certificate, int i) throws IOException {
        KeyUsage keyUsageFromExtensions;
        Extensions extensions = certificate.getTBSCertificate().getExtensions();
        if (extensions == null || (keyUsageFromExtensions = KeyUsage.fromExtensions(extensions)) == null || (keyUsageFromExtensions.getBytes()[0] & 255 & i) == i) {
            return;
        }
        csi0.m3424a(46);
    }

    private static Vector vectorOfOne(Object obj) {
        Vector vector = new Vector(1);
        vector.addElement(obj);
        return vector;
    }

    public static void verifySupportedSignatureAlgorithm(Vector vector, SignatureAndHashAlgorithm signatureAndHashAlgorithm) throws IOException {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            ig3.a("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
            return;
        }
        if (signatureAndHashAlgorithm == null) {
            ig3.a("'signatureAlgorithm' cannot be null");
            return;
        }
        if (signatureAndHashAlgorithm.getSignature() != 0) {
            for (int i = 0; i < vector.size(); i++) {
                SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = (SignatureAndHashAlgorithm) vector.elementAt(i);
                if (signatureAndHashAlgorithm2.getHash() == signatureAndHashAlgorithm.getHash() && signatureAndHashAlgorithm2.getSignature() == signatureAndHashAlgorithm.getSignature()) {
                    return;
                }
            }
        }
        csi0.m3424a(47);
    }

    public static void writeGMTUnixTime(byte[] bArr, int i) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArr[i] = (byte) (iCurrentTimeMillis >>> 24);
        bArr[i + 1] = (byte) (iCurrentTimeMillis >>> 16);
        bArr[i + 2] = (byte) (iCurrentTimeMillis >>> 8);
        bArr[i + 3] = (byte) iCurrentTimeMillis;
    }

    public static void writeOpaque16(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint16(bArr.length);
        writeUint16(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque24(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint24(bArr.length);
        writeUint24(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque8(byte[] bArr, OutputStream outputStream) throws IOException {
        checkUint8(bArr.length);
        writeUint8(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeUint16(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static void writeUint16Array(int[] iArr, byte[] bArr, int i) throws IOException {
        for (int i2 : iArr) {
            writeUint16(i2, bArr, i);
            i += 2;
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, byte[] bArr, int i) throws IOException {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, bArr, i);
        writeUint16Array(iArr, bArr, i + 2);
    }

    public static void writeUint24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) i;
    }

    public static void writeUint32(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >>> 24);
        bArr[i + 1] = (byte) (j >>> 16);
        bArr[i + 2] = (byte) (j >>> 8);
        bArr[i + 3] = (byte) j;
    }

    public static void writeUint48(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >>> 40);
        bArr[i + 1] = (byte) (j >>> 32);
        bArr[i + 2] = (byte) (j >>> 24);
        bArr[i + 3] = (byte) (j >>> 16);
        bArr[i + 4] = (byte) (j >>> 8);
        bArr[i + 5] = (byte) j;
    }

    public static void writeUint64(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
    }

    public static void writeUint8(short s, OutputStream outputStream) throws IOException {
        outputStream.write(s);
    }

    public static void writeUint8Array(short[] sArr, byte[] bArr, int i) throws IOException {
        for (short s : sArr) {
            writeUint8(s, bArr, i);
            i++;
        }
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, byte[] bArr, int i) throws IOException {
        checkUint8(sArr.length);
        writeUint8(sArr.length, bArr, i);
        writeUint8Array(sArr, bArr, i + 1);
    }

    public static void writeVersion(ProtocolVersion protocolVersion, byte[] bArr, int i) {
        bArr[i] = (byte) protocolVersion.getMajorVersion();
        bArr[i + 1] = (byte) protocolVersion.getMinorVersion();
    }

    public static boolean isValidUint16(int i) {
        return (65535 & i) == i;
    }

    public static boolean isValidUint24(int i) {
        return (16777215 & i) == i;
    }

    public static boolean isValidUint8(int i) {
        return (i & 255) == i;
    }

    public static boolean isValidUint8(short s) {
        return (s & 255) == s;
    }

    public static void writeUint8(int i, OutputStream outputStream) throws IOException {
        outputStream.write(i);
    }

    public static void writeUint8(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
    }

    public static void writeUint8(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
    }

    public static boolean isTLSv11(TlsContext tlsContext) {
        return isTLSv11(tlsContext.getServerVersion());
    }

    public static boolean isTLSv12(TlsContext tlsContext) {
        return isTLSv12(tlsContext.getServerVersion());
    }

    public static void writeUint16(int i, OutputStream outputStream) throws IOException {
        outputStream.write(i >>> 8);
        outputStream.write(i);
    }

    public static void checkUint16(long j) throws IOException {
        if (isValidUint16(j)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void checkUint24(long j) throws IOException {
        if (isValidUint24(j)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void checkUint8(int i) throws IOException {
        if (isValidUint8(i)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static short readUint8(byte[] bArr, int i) {
        return bArr[i];
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, OutputStream outputStream) throws IOException {
        checkUint8(sArr.length);
        writeUint8(sArr.length, outputStream);
        writeUint8Array(sArr, outputStream);
    }

    public static void checkUint8(long j) throws IOException {
        if (isValidUint8(j)) {
            return;
        }
        csi0.m3424a(80);
    }

    public static void writeUint16Array(int[] iArr, OutputStream outputStream) throws IOException {
        for (int i : iArr) {
            writeUint16(i, outputStream);
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, OutputStream outputStream) throws IOException {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, outputStream);
        writeUint16Array(iArr, outputStream);
    }

    public static void writeUint8Array(short[] sArr, OutputStream outputStream) throws IOException {
        for (short s : sArr) {
            writeUint8(s, outputStream);
        }
    }

    public static void writeVersion(ProtocolVersion protocolVersion, OutputStream outputStream) throws IOException {
        outputStream.write(protocolVersion.getMajorVersion());
        outputStream.write(protocolVersion.getMinorVersion());
    }

    public static void writeUint24(int i, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (i >>> 16));
        outputStream.write((byte) (i >>> 8));
        outputStream.write((byte) i);
    }

    public static int readUint16(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int readVersionRaw(byte[] bArr, int i) throws IOException {
        return bArr[i + 1] | (bArr[i] << 8);
    }

    public static void readFully(byte[] bArr, InputStream inputStream) throws IOException {
        int length = bArr.length;
        if (length <= 0 || length == Streams.readFully(inputStream, bArr)) {
            return;
        }
        hg3.a();
    }

    public static ProtocolVersion readVersion(byte[] bArr, int i) throws IOException {
        return ProtocolVersion.get(bArr[i] & 255, bArr[i + 1] & 255);
    }

    public static long readUint48(InputStream inputStream) throws IOException {
        return ((((long) readUint24(inputStream)) & 4294967295L) << 24) | (4294967295L & ((long) readUint24(inputStream)));
    }

    public static int readUint24(byte[] bArr, int i) {
        return (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static void writeUint32(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) j);
    }

    public static long readUint32(byte[] bArr, int i) {
        return ((long) ((bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8))) & 4294967295L;
    }

    public static Digest createHash(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null) {
            return new CombinedHash();
        }
        return createHash(signatureAndHashAlgorithm.getHash());
    }

    public static byte[] PRF_legacy(byte[] bArr, String str, byte[] bArr2, int i) {
        byte[] byteArray = Strings.toByteArray(str);
        return PRF_legacy(bArr, byteArray, concat(byteArray, bArr2), i);
    }

    public static void writeUint48(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) j);
    }

    public static void writeUint64(long j, OutputStream outputStream) throws IOException {
        outputStream.write((byte) (j >>> 56));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) j);
    }
}
