package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.spongycastle.asn1.p128x9.ECNamedCurveTable;
import org.spongycastle.asn1.p128x9.X9ECParameters;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.generators.ECKeyPairGenerator;
import org.spongycastle.crypto.p129ec.CustomNamedCurves;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.math.p131ec.ECAlgorithms;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.p131ec.ECPoint;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Integers;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class TlsECCUtils {
    public static final Integer EXT_elliptic_curves = Integers.valueOf(10);
    public static final Integer EXT_ec_point_formats = Integers.valueOf(11);
    private static final String[] CURVE_NAMES = {"sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1"};

    public static void addSupportedEllipticCurvesExtension(Hashtable hashtable, int[] iArr) throws IOException {
        hashtable.put(EXT_elliptic_curves, createSupportedEllipticCurvesExtension(iArr));
    }

    public static void addSupportedPointFormatsExtension(Hashtable hashtable, short[] sArr) throws IOException {
        hashtable.put(EXT_ec_point_formats, createSupportedPointFormatsExtension(sArr));
    }

    public static boolean areOnSameCurve(ECDomainParameters eCDomainParameters, ECDomainParameters eCDomainParameters2) {
        return eCDomainParameters.getCurve().equals(eCDomainParameters2.getCurve()) && eCDomainParameters.getG().equals(eCDomainParameters2.getG()) && eCDomainParameters.getN().equals(eCDomainParameters2.getN()) && eCDomainParameters.getH().equals(eCDomainParameters2.getH());
    }

    public static byte[] calculateECDHBasicAgreement(ECPublicKeyParameters eCPublicKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters) {
        ECDHBasicAgreement eCDHBasicAgreement = new ECDHBasicAgreement();
        eCDHBasicAgreement.init(eCPrivateKeyParameters);
        return BigIntegers.asUnsignedByteArray(eCDHBasicAgreement.getFieldSize(), eCDHBasicAgreement.calculateAgreement(eCPublicKeyParameters));
    }

    private static void checkNamedCurve(int[] iArr, int i) throws IOException {
        if (iArr == null || Arrays.contains(iArr, i)) {
            return;
        }
        csi0.m108512a(47);
    }

    public static boolean containsECCCipherSuites(int[] iArr) {
        for (int i : iArr) {
            if (isECCCipherSuite(i)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] createSupportedEllipticCurvesExtension(int[] iArr) throws IOException {
        if (iArr != null && iArr.length >= 1) {
            return TlsUtils.encodeUint16ArrayWithUint16Length(iArr);
        }
        csi0.m108512a(80);
        return null;
    }

    public static byte[] createSupportedPointFormatsExtension(short[] sArr) throws IOException {
        if (sArr == null || !Arrays.contains(sArr, (short) 0)) {
            sArr = Arrays.append(sArr, (short) 0);
        }
        return TlsUtils.encodeUint8ArrayWithUint8Length(sArr);
    }

    public static BigInteger deserializeECFieldElement(int i, byte[] bArr) throws IOException {
        if (bArr.length == (i + 7) / 8) {
            return new BigInteger(1, bArr);
        }
        csi0.m108512a(50);
        return null;
    }

    public static ECPoint deserializeECPoint(short[] sArr, ECCurve eCCurve, byte[] bArr) throws IOException {
        if (bArr != null) {
            short s = 1;
            if (bArr.length >= 1) {
                byte b = bArr[0];
                if (b == 2 || b == 3) {
                    if (ECAlgorithms.isF2mCurve(eCCurve)) {
                        s = 2;
                    } else if (!ECAlgorithms.isFpCurve(eCCurve)) {
                        csi0.m108512a(47);
                        return null;
                    }
                } else {
                    if (b != 4) {
                        csi0.m108512a(47);
                        return null;
                    }
                    s = 0;
                }
                if (s == 0 || (sArr != null && Arrays.contains(sArr, s))) {
                    return eCCurve.decodePoint(bArr);
                }
                csi0.m108512a(47);
                return null;
            }
        }
        csi0.m108512a(47);
        return null;
    }

    public static ECPublicKeyParameters deserializeECPublicKey(short[] sArr, ECDomainParameters eCDomainParameters, byte[] bArr) throws IOException {
        try {
            return new ECPublicKeyParameters(deserializeECPoint(sArr, eCDomainParameters.getCurve(), bArr), eCDomainParameters);
        } catch (RuntimeException e) {
            throw new TlsFatalAlert((short) 47, e);
        }
    }

    public static AsymmetricCipherKeyPair generateECKeyPair(SecureRandom secureRandom, ECDomainParameters eCDomainParameters) {
        ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
        eCKeyPairGenerator.init(new ECKeyGenerationParameters(eCDomainParameters, secureRandom));
        return eCKeyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKeyParameters generateEphemeralClientKeyExchange(SecureRandom secureRandom, short[] sArr, ECDomainParameters eCDomainParameters, OutputStream outputStream) throws IOException {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateECKeyPair = generateECKeyPair(secureRandom, eCDomainParameters);
        writeECPoint(sArr, ((ECPublicKeyParameters) asymmetricCipherKeyPairGenerateECKeyPair.getPublic()).getQ(), outputStream);
        return (ECPrivateKeyParameters) asymmetricCipherKeyPairGenerateECKeyPair.getPrivate();
    }

    public static ECPrivateKeyParameters generateEphemeralServerKeyExchange(SecureRandom secureRandom, int[] iArr, short[] sArr, OutputStream outputStream) throws IOException {
        int i;
        ECDomainParameters parametersForNamedCurve;
        if (iArr != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    i = -1;
                    break;
                }
                i = iArr[i2];
                if (NamedCurve.isValid(i) && isSupportedNamedCurve(i)) {
                    break;
                }
                i2++;
            }
        } else {
            i = 23;
        }
        if (i >= 0) {
            parametersForNamedCurve = getParametersForNamedCurve(i);
        } else if (Arrays.contains(iArr, 65281)) {
            parametersForNamedCurve = getParametersForNamedCurve(23);
        } else {
            parametersForNamedCurve = Arrays.contains(iArr, NamedCurve.arbitrary_explicit_char2_curves) ? getParametersForNamedCurve(10) : null;
        }
        if (parametersForNamedCurve == null) {
            csi0.m108512a(80);
            return null;
        }
        if (i < 0) {
            writeExplicitECParameters(sArr, parametersForNamedCurve, outputStream);
        } else {
            writeNamedECParameters(i, outputStream);
        }
        return generateEphemeralClientKeyExchange(secureRandom, sArr, parametersForNamedCurve, outputStream);
    }

    public static String getNameOfNamedCurve(int i) {
        if (isSupportedNamedCurve(i)) {
            return CURVE_NAMES[i - 1];
        }
        return null;
    }

    public static ECDomainParameters getParametersForNamedCurve(int i) {
        String nameOfNamedCurve = getNameOfNamedCurve(i);
        if (nameOfNamedCurve == null) {
            return null;
        }
        X9ECParameters byName = CustomNamedCurves.getByName(nameOfNamedCurve);
        if (byName == null && (byName = ECNamedCurveTable.getByName(nameOfNamedCurve)) == null) {
            return null;
        }
        return new ECDomainParameters(byName.getCurve(), byName.getG(), byName.getN(), byName.getH(), byName.getSeed());
    }

    public static int[] getSupportedEllipticCurvesExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_elliptic_curves);
        if (extensionData == null) {
            return null;
        }
        return readSupportedEllipticCurvesExtension(extensionData);
    }

    public static short[] getSupportedPointFormatsExtension(Hashtable hashtable) throws IOException {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, EXT_ec_point_formats);
        if (extensionData == null) {
            return null;
        }
        return readSupportedPointFormatsExtension(extensionData);
    }

    public static boolean hasAnySupportedNamedCurves() {
        return CURVE_NAMES.length > 0;
    }

    public static boolean isCompressionPreferred(short[] sArr, short s) {
        short s2;
        if (sArr == null) {
            return false;
        }
        for (int i = 0; i < sArr.length && (s2 = sArr[i]) != 0; i++) {
            if (s2 == s) {
                return true;
            }
        }
        return false;
    }

    public static boolean isECCCipherSuite(int i) {
        switch (i) {
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
            case CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA /* 49173 */:
            case CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA /* 49174 */:
            case CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA /* 49175 */:
            case CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA /* 49176 */:
            case CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA /* 49177 */:
                return true;
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
                    case CipherSuite.TLS_ECDHE_PSK_WITH_RC4_128_SHA /* 49203 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
                    case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
                        return true;
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
                                return true;
                            default:
                                switch (i) {
                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                                        return true;
                                    default:
                                        switch (i) {
                                            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
                                            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                                                return true;
                                            default:
                                                switch (i) {
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                                                        return true;
                                                    default:
                                                        switch (i) {
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52243 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52244 */:
                                                                return true;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_ESTREAM_SALSA20_SHA1 /* 58386 */:
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_SALSA20_SHA1 /* 58387 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_ESTREAM_SALSA20_SHA1 /* 58388 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_SALSA20_SHA1 /* 58389 */:
                                                                        return true;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_ESTREAM_SALSA20_SHA1 /* 58392 */:
                                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_SALSA20_SHA1 /* 58393 */:
                                                                                return true;
                                                                            default:
                                                                                return false;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static boolean isSupportedNamedCurve(int i) {
        return i > 0 && i <= CURVE_NAMES.length;
    }

    public static int readECExponent(int i, InputStream inputStream) throws IOException {
        int iIntValue;
        BigInteger eCParameter = readECParameter(inputStream);
        if (eCParameter.bitLength() < 32 && (iIntValue = eCParameter.intValue()) > 0 && iIntValue < i) {
            return iIntValue;
        }
        csi0.m108512a(47);
        return 0;
    }

    public static BigInteger readECFieldElement(int i, InputStream inputStream) throws IOException {
        return deserializeECFieldElement(i, TlsUtils.readOpaque8(inputStream));
    }

    public static BigInteger readECParameter(InputStream inputStream) throws IOException {
        return new BigInteger(1, TlsUtils.readOpaque8(inputStream));
    }

    public static ECDomainParameters readECParameters(int[] iArr, short[] sArr, InputStream inputStream) throws IOException {
        int eCExponent;
        int eCExponent2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        ECCurve.F2m f2m;
        try {
            short uint8 = TlsUtils.readUint8(inputStream);
            if (uint8 == 1) {
                checkNamedCurve(iArr, 65281);
                BigInteger eCParameter = readECParameter(inputStream);
                BigInteger eCFieldElement = readECFieldElement(eCParameter.bitLength(), inputStream);
                BigInteger eCFieldElement2 = readECFieldElement(eCParameter.bitLength(), inputStream);
                byte[] opaque8 = TlsUtils.readOpaque8(inputStream);
                BigInteger eCParameter2 = readECParameter(inputStream);
                BigInteger eCParameter3 = readECParameter(inputStream);
                ECCurve.C22280Fp c22280Fp = new ECCurve.C22280Fp(eCParameter, eCFieldElement, eCFieldElement2, eCParameter2, eCParameter3);
                return new ECDomainParameters(c22280Fp, deserializeECPoint(sArr, c22280Fp, opaque8), eCParameter2, eCParameter3);
            }
            if (uint8 != 2) {
                if (uint8 != 3) {
                    throw new TlsFatalAlert((short) 47);
                }
                int uint16 = TlsUtils.readUint16(inputStream);
                if (!NamedCurve.refersToASpecificNamedCurve(uint16)) {
                    throw new TlsFatalAlert((short) 47);
                }
                checkNamedCurve(iArr, uint16);
                return getParametersForNamedCurve(uint16);
            }
            checkNamedCurve(iArr, NamedCurve.arbitrary_explicit_char2_curves);
            int uint17 = TlsUtils.readUint16(inputStream);
            short uint9 = TlsUtils.readUint8(inputStream);
            if (!ECBasisType.isValid(uint9)) {
                throw new TlsFatalAlert((short) 47);
            }
            int eCExponent3 = readECExponent(uint17, inputStream);
            if (uint9 == 2) {
                eCExponent = readECExponent(uint17, inputStream);
                eCExponent2 = readECExponent(uint17, inputStream);
            } else {
                eCExponent = -1;
                eCExponent2 = -1;
            }
            BigInteger eCFieldElement3 = readECFieldElement(uint17, inputStream);
            BigInteger eCFieldElement4 = readECFieldElement(uint17, inputStream);
            byte[] opaque9 = TlsUtils.readOpaque8(inputStream);
            BigInteger eCParameter4 = readECParameter(inputStream);
            BigInteger eCParameter5 = readECParameter(inputStream);
            if (uint9 == 2) {
                f2m = new ECCurve.F2m(uint17, eCExponent3, eCExponent, eCExponent2, eCFieldElement3, eCFieldElement4, eCParameter4, eCParameter5);
                bigInteger = eCParameter4;
                bigInteger2 = eCParameter5;
            } else {
                bigInteger = eCParameter4;
                bigInteger2 = eCParameter5;
                f2m = new ECCurve.F2m(uint17, eCExponent3, eCFieldElement3, eCFieldElement4, bigInteger, bigInteger2);
            }
            return new ECDomainParameters(f2m, deserializeECPoint(sArr, f2m, opaque9), bigInteger, bigInteger2);
        } catch (RuntimeException e) {
            throw new TlsFatalAlert((short) 47, e);
        }
    }

    public static int[] readSupportedEllipticCurvesExtension(byte[] bArr) throws IOException {
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
        TlsProtocol.assertEmpty(byteArrayInputStream);
        return uint16Array;
    }

    public static short[] readSupportedPointFormatsExtension(byte[] bArr) throws IOException {
        if (bArr == null) {
            ig3.m135964a("'extensionData' cannot be null");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        short uint8 = TlsUtils.readUint8(byteArrayInputStream);
        if (uint8 < 1) {
            csi0.m108512a(50);
            return null;
        }
        short[] uint8Array = TlsUtils.readUint8Array(uint8, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (Arrays.contains(uint8Array, (short) 0)) {
            return uint8Array;
        }
        csi0.m108512a(47);
        return null;
    }

    public static byte[] serializeECFieldElement(int i, BigInteger bigInteger) throws IOException {
        return BigIntegers.asUnsignedByteArray((i + 7) / 8, bigInteger);
    }

    public static byte[] serializeECPoint(short[] sArr, ECPoint eCPoint) throws IOException {
        boolean zIsCompressionPreferred;
        ECCurve curve = eCPoint.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            zIsCompressionPreferred = isCompressionPreferred(sArr, (short) 1);
        } else {
            zIsCompressionPreferred = ECAlgorithms.isF2mCurve(curve) ? isCompressionPreferred(sArr, (short) 2) : false;
        }
        return eCPoint.getEncoded(zIsCompressionPreferred);
    }

    public static byte[] serializeECPublicKey(short[] sArr, ECPublicKeyParameters eCPublicKeyParameters) throws IOException {
        return serializeECPoint(sArr, eCPublicKeyParameters.getQ());
    }

    public static ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters eCPublicKeyParameters) throws IOException {
        return eCPublicKeyParameters;
    }

    public static void writeECExponent(int i, OutputStream outputStream) throws IOException {
        writeECParameter(BigInteger.valueOf(i), outputStream);
    }

    public static void writeECFieldElement(ECFieldElement eCFieldElement, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(eCFieldElement.getEncoded(), outputStream);
    }

    public static void writeECParameter(BigInteger bigInteger, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(BigIntegers.asUnsignedByteArray(bigInteger), outputStream);
    }

    public static void writeECPoint(short[] sArr, ECPoint eCPoint, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(serializeECPoint(sArr, eCPoint), outputStream);
    }

    public static void writeExplicitECParameters(short[] sArr, ECDomainParameters eCDomainParameters, OutputStream outputStream) throws IOException {
        ECCurve curve = eCDomainParameters.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            TlsUtils.writeUint8((short) 1, outputStream);
            writeECParameter(curve.getField().getCharacteristic(), outputStream);
        } else {
            if (!ECAlgorithms.isF2mCurve(curve)) {
                ig3.m135964a("'ecParameters' not a known curve type");
                return;
            }
            int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
            TlsUtils.writeUint8((short) 2, outputStream);
            int i = exponentsPresent[exponentsPresent.length - 1];
            TlsUtils.checkUint16(i);
            TlsUtils.writeUint16(i, outputStream);
            if (exponentsPresent.length == 3) {
                TlsUtils.writeUint8((short) 1, outputStream);
                writeECExponent(exponentsPresent[1], outputStream);
            } else {
                if (exponentsPresent.length != 5) {
                    ig3.m135964a("Only trinomial and pentomial curves are supported");
                    return;
                }
                TlsUtils.writeUint8((short) 2, outputStream);
                writeECExponent(exponentsPresent[1], outputStream);
                writeECExponent(exponentsPresent[2], outputStream);
                writeECExponent(exponentsPresent[3], outputStream);
            }
        }
        writeECFieldElement(curve.getA(), outputStream);
        writeECFieldElement(curve.getB(), outputStream);
        TlsUtils.writeOpaque8(serializeECPoint(sArr, eCDomainParameters.getG()), outputStream);
        writeECParameter(eCDomainParameters.getN(), outputStream);
        writeECParameter(eCDomainParameters.getH(), outputStream);
    }

    public static void writeNamedECParameters(int i, OutputStream outputStream) throws IOException {
        if (!NamedCurve.refersToASpecificNamedCurve(i)) {
            csi0.m108512a(80);
            return;
        }
        TlsUtils.writeUint8((short) 3, outputStream);
        TlsUtils.checkUint16(i);
        TlsUtils.writeUint16(i, outputStream);
    }

    public static void writeECFieldElement(int i, BigInteger bigInteger, OutputStream outputStream) throws IOException {
        TlsUtils.writeOpaque8(serializeECFieldElement(i, bigInteger), outputStream);
    }
}
