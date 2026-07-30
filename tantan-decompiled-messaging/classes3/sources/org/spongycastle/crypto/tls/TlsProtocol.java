package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import l.qkq0;
import l.rhg0;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.prng.RandomGenerator;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class TlsProtocol {
    protected static final short CS_CERTIFICATE_REQUEST = 7;
    protected static final short CS_CERTIFICATE_STATUS = 5;
    protected static final short CS_CERTIFICATE_VERIFY = 12;
    protected static final short CS_CLIENT_CERTIFICATE = 10;
    protected static final short CS_CLIENT_FINISHED = 13;
    protected static final short CS_CLIENT_HELLO = 1;
    protected static final short CS_CLIENT_KEY_EXCHANGE = 11;
    protected static final short CS_CLIENT_SUPPLEMENTAL_DATA = 9;
    protected static final short CS_END = 16;
    protected static final short CS_SERVER_CERTIFICATE = 4;
    protected static final short CS_SERVER_FINISHED = 15;
    protected static final short CS_SERVER_HELLO = 2;
    protected static final short CS_SERVER_HELLO_DONE = 8;
    protected static final short CS_SERVER_KEY_EXCHANGE = 6;
    protected static final short CS_SERVER_SESSION_TICKET = 14;
    protected static final short CS_SERVER_SUPPLEMENTAL_DATA = 3;
    protected static final short CS_START = 0;
    protected static final Integer EXT_RenegotiationInfo = Integers.valueOf(65281);
    protected static final Integer EXT_SessionTicket = Integers.valueOf(35);
    private static final String TLS_ERROR_MESSAGE = "Internal TLS error, this could be an attack";
    private ByteQueue alertQueue;
    protected boolean allowCertificateStatus;
    private volatile boolean appDataReady;
    private ByteQueue applicationDataQueue;
    protected boolean blocking;
    protected Hashtable clientExtensions;
    private volatile boolean closed;
    protected short connection_state;
    protected boolean expectSessionTicket;
    private byte[] expected_verify_data;
    private volatile boolean failedWithError;
    private ByteQueue handshakeQueue;
    protected ByteQueueInputStream inputBuffers;
    protected int[] offeredCipherSuites;
    protected short[] offeredCompressionMethods;
    protected ByteQueueOutputStream outputBuffer;
    protected Certificate peerCertificate;
    protected boolean receivedChangeCipherSpec;
    RecordStream recordStream;
    protected boolean resumedSession;
    protected SecureRandom secureRandom;
    protected boolean secure_renegotiation;
    protected SecurityParameters securityParameters;
    protected Hashtable serverExtensions;
    protected SessionParameters sessionParameters;
    private volatile boolean splitApplicationDataRecords;
    private TlsInputStream tlsInputStream;
    private TlsOutputStream tlsOutputStream;
    protected TlsSession tlsSession;

    public TlsProtocol(SecureRandom secureRandom) {
        this.applicationDataQueue = new ByteQueue();
        this.alertQueue = new ByteQueue(2);
        this.handshakeQueue = new ByteQueue();
        this.tlsInputStream = null;
        this.tlsOutputStream = null;
        this.closed = false;
        this.failedWithError = false;
        this.appDataReady = false;
        this.splitApplicationDataRecords = true;
        this.expected_verify_data = null;
        this.tlsSession = null;
        this.sessionParameters = null;
        this.securityParameters = null;
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.connection_state = (short) 0;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
        this.blocking = false;
        this.inputBuffers = new ByteQueueInputStream();
        this.outputBuffer = new ByteQueueOutputStream();
        this.recordStream = new RecordStream(this, this.inputBuffers, this.outputBuffer);
        this.secureRandom = secureRandom;
    }

    public static void assertEmpty(ByteArrayInputStream byteArrayInputStream) throws IOException {
        if (byteArrayInputStream.available() <= 0) {
            return;
        }
        csi0.m3424a(50);
    }

    public static byte[] createRandomBlock(boolean z, RandomGenerator randomGenerator) {
        byte[] bArr = new byte[32];
        randomGenerator.nextBytes(bArr);
        if (z) {
            TlsUtils.writeGMTUnixTime(bArr, 0);
        }
        return bArr;
    }

    public static byte[] createRenegotiationInfo(byte[] bArr) throws IOException {
        return TlsUtils.encodeOpaque8(bArr);
    }

    public static void establishMasterSecret(TlsContext tlsContext, TlsKeyExchange tlsKeyExchange) throws IOException {
        byte[] bArrGeneratePremasterSecret = tlsKeyExchange.generatePremasterSecret();
        try {
            tlsContext.getSecurityParameters().masterSecret = TlsUtils.calculateMasterSecret(tlsContext, bArrGeneratePremasterSecret);
        } finally {
            if (bArrGeneratePremasterSecret != null) {
                Arrays.fill(bArrGeneratePremasterSecret, (byte) 0);
            }
        }
    }

    public static byte[] getCurrentPRFHash(TlsContext tlsContext, TlsHandshakeHash tlsHandshakeHash, byte[] bArr) {
        Digest digestForkPRFHash = tlsHandshakeHash.forkPRFHash();
        if (bArr != null && TlsUtils.isSSL(tlsContext)) {
            digestForkPRFHash.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[digestForkPRFHash.getDigestSize()];
        digestForkPRFHash.doFinal(bArr2, 0);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0032  */
    public static int getPRFAlgorithm(TlsContext tlsContext, int i) throws IOException {
        boolean zIsTLSv12 = TlsUtils.isTLSv12(tlsContext);
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
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 /* 158 */:
                            case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                                break;
                            case CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /* 159 */:
                            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                if (zIsTLSv12) {
                                    return 2;
                                }
                                csi0.m3424a(47);
                                return 0;
                            default:
                                switch (i) {
                                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                                        break;
                                    case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                                        if (zIsTLSv12) {
                                            return 2;
                                        }
                                        csi0.m3424a(47);
                                        return 0;
                                    default:
                                        switch (i) {
                                            default:
                                                switch (i) {
                                                    case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                                                        break;
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
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                                                                break;
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                                                                if (zIsTLSv12) {
                                                                    return 2;
                                                                }
                                                                csi0.m3424a(47);
                                                                return 0;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                                                                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                                                                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                                                                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                                                                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                                                                    case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256 /* 49284 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                                                                    case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                                                                    case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                                                                        break;
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                                                                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                                                                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                                                                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                                                                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                                                                    case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384 /* 49285 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                                                                    case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                                                                    case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                                                                        if (zIsTLSv12) {
                                                                            return 2;
                                                                        }
                                                                        csi0.m3424a(47);
                                                                        return 0;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                                                                                break;
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
                                                                                        return zIsTLSv12 ? 1 : 0;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                                            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                                            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                                            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
                                            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49301 */:
                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49303 */:
                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49305 */:
                                                return zIsTLSv12 ? 2 : 0;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        if (zIsTLSv12) {
            return 1;
        }
        csi0.m3424a(47);
        return 0;
    }

    private void processAlert() throws IOException {
        while (this.alertQueue.available() >= 2) {
            byte[] bArrRemoveData = this.alertQueue.removeData(2, 0);
            short s = bArrRemoveData[0];
            short s2 = bArrRemoveData[1];
            getPeer().notifyAlertReceived(s, s2);
            if (s == 2) {
                invalidateSession();
                this.failedWithError = true;
                this.closed = true;
                this.recordStream.safeClose();
                rhg0.a(TLS_ERROR_MESSAGE);
                return;
            }
            if (s2 == 0) {
                handleClose(false);
            }
            handleWarningMessage(s2);
        }
    }

    private void processApplicationData() {
    }

    private void processChangeCipherSpec(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            if (TlsUtils.readUint8(bArr, i + i3) != 1) {
                csi0.m3424a(50);
                return;
            }
            if (this.receivedChangeCipherSpec || this.alertQueue.available() > 0 || this.handshakeQueue.available() > 0) {
                csi0.m3424a(10);
                return;
            }
            this.recordStream.receivedReadCipherSpec();
            this.receivedChangeCipherSpec = true;
            handleChangeCipherSpecMessage();
        }
    }

    private void processHandshake() throws IOException {
        while (this.handshakeQueue.available() >= 4) {
            byte[] bArr = new byte[4];
            this.handshakeQueue.read(bArr, 0, 4, 0);
            short uint8 = TlsUtils.readUint8(bArr, 0);
            int uint24 = TlsUtils.readUint24(bArr, 1);
            if (this.handshakeQueue.available() < uint24 + 4) {
                return;
            }
            byte[] bArrRemoveData = this.handshakeQueue.removeData(uint24, 4);
            checkReceivedChangeCipherSpec(this.connection_state == 16 || uint8 == 20);
            if (uint8 != 0) {
                if (uint8 == 20) {
                    TlsContext context = getContext();
                    if (this.expected_verify_data == null && context.getSecurityParameters().getMasterSecret() != null) {
                        this.expected_verify_data = createVerifyData(true ^ context.isServer());
                    }
                }
                this.recordStream.updateHandshakeData(bArr, 0, 4);
                this.recordStream.updateHandshakeData(bArrRemoveData, 0, uint24);
            }
            handleHandshakeMessage(uint8, bArrRemoveData);
        }
    }

    public static Hashtable readExtensions(ByteArrayInputStream byteArrayInputStream) throws IOException {
        if (byteArrayInputStream.available() < 1) {
            return null;
        }
        byte[] opaque16 = TlsUtils.readOpaque16(byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(opaque16);
        Hashtable hashtable = new Hashtable();
        while (byteArrayInputStream2.available() > 0) {
            if (hashtable.put(Integers.valueOf(TlsUtils.readUint16(byteArrayInputStream2)), TlsUtils.readOpaque16(byteArrayInputStream2)) != null) {
                csi0.m3424a(47);
                return null;
            }
        }
        return hashtable;
    }

    public static Vector readSupplementalDataMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] opaque24 = TlsUtils.readOpaque24(byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(opaque24);
        Vector vector = new Vector();
        while (byteArrayInputStream2.available() > 0) {
            vector.addElement(new SupplementalDataEntry(TlsUtils.readUint16(byteArrayInputStream2), TlsUtils.readOpaque16(byteArrayInputStream2)));
        }
        return vector;
    }

    public static void writeExtensions(OutputStream outputStream, Hashtable hashtable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            int iIntValue = num.intValue();
            byte[] bArr = (byte[]) hashtable.get(num);
            TlsUtils.checkUint16(iIntValue);
            TlsUtils.writeUint16(iIntValue, byteArrayOutputStream);
            TlsUtils.writeOpaque16(bArr, byteArrayOutputStream);
        }
        TlsUtils.writeOpaque16(byteArrayOutputStream.toByteArray(), outputStream);
    }

    public static void writeSupplementalData(OutputStream outputStream, Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < vector.size(); i++) {
            SupplementalDataEntry supplementalDataEntry = (SupplementalDataEntry) vector.elementAt(i);
            int dataType = supplementalDataEntry.getDataType();
            TlsUtils.checkUint16(dataType);
            TlsUtils.writeUint16(dataType, byteArrayOutputStream);
            TlsUtils.writeOpaque16(supplementalDataEntry.getData(), byteArrayOutputStream);
        }
        TlsUtils.writeOpaque24(byteArrayOutputStream.toByteArray(), outputStream);
    }

    public int applicationDataAvailable() {
        return this.applicationDataQueue.available();
    }

    public void applyMaxFragmentLengthExtension() throws IOException {
        short s = this.securityParameters.maxFragmentLength;
        if (s >= 0) {
            if (!MaxFragmentLength.isValid(s)) {
                csi0.m3424a(80);
            } else {
                this.recordStream.setPlaintextLimit(1 << (this.securityParameters.maxFragmentLength + CS_SERVER_HELLO_DONE));
            }
        }
    }

    public void blockForHandshake() throws IOException {
        if (this.blocking) {
            while (this.connection_state != 16) {
                safeReadRecord();
            }
        }
    }

    public void checkReceivedChangeCipherSpec(boolean z) throws IOException {
        if (z == this.receivedChangeCipherSpec) {
            return;
        }
        csi0.m3424a(10);
    }

    public void cleanupHandshake() {
        byte[] bArr = this.expected_verify_data;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.expected_verify_data = null;
        }
        this.securityParameters.clear();
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
    }

    public void close() throws IOException {
        handleClose(true);
    }

    public void completeHandshake() throws IOException {
        try {
            this.recordStream.finaliseHandshake();
            this.splitApplicationDataRecords = !TlsUtils.isTLSv11(getContext());
            if (!this.appDataReady) {
                this.appDataReady = true;
                if (this.blocking) {
                    this.tlsInputStream = new TlsInputStream(this);
                    this.tlsOutputStream = new TlsOutputStream(this);
                }
            }
            if (this.tlsSession != null) {
                if (this.sessionParameters == null) {
                    this.sessionParameters = new SessionParameters.Builder().setCipherSuite(this.securityParameters.getCipherSuite()).setCompressionAlgorithm(this.securityParameters.getCompressionAlgorithm()).setMasterSecret(this.securityParameters.getMasterSecret()).setPeerCertificate(this.peerCertificate).setPSKIdentity(this.securityParameters.getPSKIdentity()).setSRPIdentity(this.securityParameters.getSRPIdentity()).setServerExtensions(this.serverExtensions).build();
                    this.tlsSession = new TlsSessionImpl(this.tlsSession.getSessionID(), this.sessionParameters);
                }
                getContextAdmin().setResumableSession(this.tlsSession);
            }
            getPeer().notifyHandshakeComplete();
        } finally {
            cleanupHandshake();
        }
    }

    public byte[] createVerifyData(boolean z) {
        TlsContext context = getContext();
        return TlsUtils.calculateVerifyData(context, z ? ExporterLabel.server_finished : ExporterLabel.client_finished, getCurrentPRFHash(context, this.recordStream.getHandshakeHash(), z ? TlsUtils.SSL_SERVER : TlsUtils.SSL_CLIENT));
    }

    public void failWithError(short s, short s2, String str, Throwable th) throws IOException {
        if (!this.closed) {
            this.closed = true;
            if (s == 2) {
                invalidateSession();
                this.failedWithError = true;
            }
            raiseAlert(s, s2, str, th);
            this.recordStream.safeClose();
            if (s != 2) {
                return;
            }
        }
        rhg0.a(TLS_ERROR_MESSAGE);
    }

    public void flush() throws IOException {
        this.recordStream.flush();
    }

    public int getAvailableInputBytes() {
        if (!this.blocking) {
            return applicationDataAvailable();
        }
        qkq0.a("Cannot use getAvailableInputBytes() in blocking mode! Use getInputStream().available() instead.");
        return 0;
    }

    public int getAvailableOutputBytes() {
        if (!this.blocking) {
            return this.outputBuffer.getBuffer().available();
        }
        qkq0.a("Cannot use getAvailableOutputBytes() in blocking mode! Use getOutputStream() instead.");
        return 0;
    }

    public abstract TlsContext getContext();

    public abstract AbstractTlsContext getContextAdmin();

    public InputStream getInputStream() {
        if (this.blocking) {
            return this.tlsInputStream;
        }
        qkq0.a("Cannot use InputStream in non-blocking mode! Use offerInput() instead.");
        return null;
    }

    public OutputStream getOutputStream() {
        if (this.blocking) {
            return this.tlsOutputStream;
        }
        qkq0.a("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead.");
        return null;
    }

    public abstract TlsPeer getPeer();

    public void handleChangeCipherSpecMessage() throws IOException {
    }

    public void handleClose(boolean z) throws IOException {
        if (this.closed) {
            return;
        }
        if (z && !this.appDataReady) {
            raiseWarning((short) 90, "User canceled handshake");
        }
        failWithError((short) 1, (short) 0, "Connection closed", null);
    }

    public abstract void handleHandshakeMessage(short s, byte[] bArr) throws IOException;

    public void handleWarningMessage(short s) throws IOException {
    }

    public void invalidateSession() {
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            this.sessionParameters = null;
        }
        TlsSession tlsSession = this.tlsSession;
        if (tlsSession != null) {
            tlsSession.invalidate();
            this.tlsSession = null;
        }
    }

    public boolean isClosed() {
        return this.closed;
    }

    public void offerInput(byte[] bArr) throws IOException {
        if (this.blocking) {
            qkq0.a("Cannot use offerInput() in blocking mode! Use getInputStream() instead.");
            return;
        }
        if (this.closed) {
            rhg0.a("Connection is closed, cannot accept any more input");
            return;
        }
        this.inputBuffers.addBytes(bArr);
        while (this.inputBuffers.available() >= 5) {
            byte[] bArr2 = new byte[5];
            this.inputBuffers.peek(bArr2);
            if (this.inputBuffers.available() < TlsUtils.readUint16(bArr2, 3) + 5) {
                return;
            } else {
                safeReadRecord();
            }
        }
    }

    public void offerOutput(byte[] bArr, int i, int i2) throws IOException {
        if (this.blocking) {
            qkq0.a("Cannot use offerOutput() in blocking mode! Use getOutputStream() instead.");
        } else if (this.appDataReady) {
            writeData(bArr, i, i2);
        } else {
            rhg0.a("Application data cannot be sent until the handshake is complete!");
        }
    }

    public void processFinishedMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] bArr = this.expected_verify_data;
        if (bArr == null) {
            csi0.m3424a(80);
            return;
        }
        byte[] fully = TlsUtils.readFully(bArr.length, byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        if (Arrays.constantTimeAreEqual(this.expected_verify_data, fully)) {
            return;
        }
        csi0.m3424a(51);
    }

    public short processMaxFragmentLengthExtension(Hashtable hashtable, Hashtable hashtable2, short s) throws IOException {
        short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable2);
        if (maxFragmentLengthExtension < 0 || (MaxFragmentLength.isValid(maxFragmentLengthExtension) && (this.resumedSession || maxFragmentLengthExtension == TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable)))) {
            return maxFragmentLengthExtension;
        }
        csi0.m3424a(s);
        return (short) 0;
    }

    public void processRecord(short s, byte[] bArr, int i, int i2) throws IOException {
        switch (s) {
            case 20:
                processChangeCipherSpec(bArr, i, i2);
                break;
            case 21:
                this.alertQueue.addData(bArr, i, i2);
                processAlert();
                break;
            case 22:
                this.handshakeQueue.addData(bArr, i, i2);
                processHandshake();
                break;
            case 23:
                if (!this.appDataReady) {
                    csi0.m3424a(10);
                } else {
                    this.applicationDataQueue.addData(bArr, i, i2);
                    processApplicationData();
                }
                break;
            case 24:
                if (!this.appDataReady) {
                    csi0.m3424a(10);
                    break;
                }
                break;
        }
    }

    public void raiseAlert(short s, short s2, String str, Throwable th) throws IOException {
        getPeer().notifyAlertRaised(s, s2, str, th);
        safeWriteRecord((short) 21, new byte[]{(byte) s, (byte) s2}, 0, 2);
    }

    public void raiseWarning(short s, String str) throws IOException {
        raiseAlert((short) 1, s, str, null);
    }

    public int readApplicationData(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 1) {
            return 0;
        }
        while (this.applicationDataQueue.available() == 0) {
            if (this.closed) {
                if (!this.failedWithError) {
                    return -1;
                }
                rhg0.a(TLS_ERROR_MESSAGE);
                return 0;
            }
            safeReadRecord();
        }
        int iMin = Math.min(i2, this.applicationDataQueue.available());
        this.applicationDataQueue.removeData(bArr, i, iMin, 0);
        return iMin;
    }

    public int readInput(byte[] bArr, int i, int i2) {
        if (this.blocking) {
            qkq0.a("Cannot use readInput() in blocking mode! Use getInputStream() instead.");
            return 0;
        }
        try {
            return readApplicationData(bArr, i, Math.min(i2, applicationDataAvailable()));
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public int readOutput(byte[] bArr, int i, int i2) {
        if (this.blocking) {
            qkq0.a("Cannot use readOutput() in blocking mode! Use getOutputStream() instead.");
            return 0;
        }
        int iMin = Math.min(getAvailableOutputBytes(), i2);
        this.outputBuffer.getBuffer().removeData(bArr, i, iMin, 0);
        return iMin;
    }

    public void refuseRenegotiation() throws IOException {
        if (TlsUtils.isSSL(getContext())) {
            csi0.m3424a(40);
        } else {
            raiseWarning((short) 100, "Renegotiation not supported");
        }
    }

    public void safeReadRecord() throws IOException {
        try {
            if (this.recordStream.readRecord()) {
            } else {
                throw new EOFException();
            }
        } catch (TlsFatalAlert e) {
            if (!this.closed) {
                failWithError((short) 2, e.getAlertDescription(), "Failed to read record", e);
            }
            throw e;
        } catch (IOException e2) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to read record", e2);
            }
            throw e2;
        } catch (RuntimeException e3) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to read record", e3);
            }
            throw e3;
        }
    }

    public void safeWriteRecord(short s, byte[] bArr, int i, int i2) throws IOException {
        try {
            this.recordStream.writeRecord(s, bArr, i, i2);
        } catch (RuntimeException e) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to write record", e);
            }
            throw e;
        } catch (TlsFatalAlert e2) {
            if (!this.closed) {
                failWithError((short) 2, e2.getAlertDescription(), "Failed to write record", e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to write record", e3);
            }
            throw e3;
        }
    }

    public void sendCertificateMessage(Certificate certificate) throws IOException {
        if (certificate == null) {
            certificate = Certificate.EMPTY_CHAIN;
        }
        if (certificate.isEmpty() && !getContext().isServer()) {
            ProtocolVersion serverVersion = getContext().getServerVersion();
            if (serverVersion.isSSL()) {
                raiseWarning((short) 41, serverVersion.toString() + " client didn't provide credentials");
                return;
            }
        }
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 11);
        certificate.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendChangeCipherSpecMessage() throws IOException {
        safeWriteRecord((short) 20, new byte[]{1}, 0, 1);
        this.recordStream.sentWriteCipherSpec();
    }

    public void sendFinishedMessage() throws IOException {
        byte[] bArrCreateVerifyData = createVerifyData(getContext().isServer());
        HandshakeMessage handshakeMessage = new HandshakeMessage((short) 20, bArrCreateVerifyData.length);
        handshakeMessage.write(bArrCreateVerifyData);
        handshakeMessage.writeToRecordStream();
    }

    public void sendSupplementalDataMessage(Vector vector) throws IOException {
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 23);
        writeSupplementalData(handshakeMessage, vector);
        handshakeMessage.writeToRecordStream();
    }

    public void writeData(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            if (this.failedWithError) {
                rhg0.a(TLS_ERROR_MESSAGE);
                return;
            } else {
                rhg0.a("Sorry, connection has been closed, you cannot write more data");
                return;
            }
        }
        while (i2 > 0) {
            if (this.splitApplicationDataRecords) {
                safeWriteRecord((short) 23, bArr, i, 1);
                i++;
                i2--;
            }
            if (i2 > 0) {
                int iMin = Math.min(i2, this.recordStream.getPlaintextLimit());
                safeWriteRecord((short) 23, bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    public void writeHandshakeMessage(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int iMin = Math.min(i2, this.recordStream.getPlaintextLimit());
            safeWriteRecord((short) 22, bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    public class HandshakeMessage extends ByteArrayOutputStream {
        public HandshakeMessage(short s, int i) throws IOException {
            super(i + 4);
            TlsUtils.writeUint8(s, (OutputStream) this);
            ((ByteArrayOutputStream) this).count += 3;
        }

        public void writeToRecordStream() throws IOException {
            int i = ((ByteArrayOutputStream) this).count - 4;
            TlsUtils.checkUint24(i);
            TlsUtils.writeUint24(i, ((ByteArrayOutputStream) this).buf, 1);
            TlsProtocol.this.writeHandshakeMessage(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }

        public HandshakeMessage(TlsProtocol tlsProtocol, short s) throws IOException {
            this(s, 60);
        }
    }

    public TlsProtocol(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        this.applicationDataQueue = new ByteQueue();
        this.alertQueue = new ByteQueue(2);
        this.handshakeQueue = new ByteQueue();
        this.tlsInputStream = null;
        this.tlsOutputStream = null;
        this.closed = false;
        this.failedWithError = false;
        this.appDataReady = false;
        this.splitApplicationDataRecords = true;
        this.expected_verify_data = null;
        this.tlsSession = null;
        this.sessionParameters = null;
        this.securityParameters = null;
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.connection_state = (short) 0;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
        this.blocking = true;
        this.recordStream = new RecordStream(this, inputStream, outputStream);
        this.secureRandom = secureRandom;
    }
}
