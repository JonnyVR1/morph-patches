package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.Arrays;
import p153l.f1j0;
import p153l.wg3;
import p153l.wpg0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class TlsServerProtocol extends TlsProtocol {
    protected CertificateRequest certificateRequest;
    protected short clientCertificateType;
    protected TlsKeyExchange keyExchange;
    protected TlsHandshakeHash prepareFinishHash;
    protected TlsCredentials serverCredentials;
    protected TlsServer tlsServer;
    TlsServerContextImpl tlsServerContext;

    public TlsServerProtocol(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        super(inputStream, outputStream, secureRandom);
        this.tlsServer = null;
        this.tlsServerContext = null;
        this.keyExchange = null;
        this.serverCredentials = null;
        this.certificateRequest = null;
        this.clientCertificateType = (short) -1;
        this.prepareFinishHash = null;
    }

    public void accept(TlsServer tlsServer) throws IOException {
        if (tlsServer == null) {
            wg3.m206174a("'tlsServer' cannot be null");
            return;
        }
        if (this.tlsServer != null) {
            wtq0.m207906a("'accept' can only be called once");
            return;
        }
        this.tlsServer = tlsServer;
        SecurityParameters securityParameters = new SecurityParameters();
        this.securityParameters = securityParameters;
        securityParameters.entity = 0;
        this.tlsServerContext = new TlsServerContextImpl(this.secureRandom, this.securityParameters);
        this.securityParameters.serverRandom = TlsProtocol.createRandomBlock(tlsServer.shouldUseGMTUnixTime(), this.tlsServerContext.getNonceRandomGenerator());
        this.tlsServer.init(this.tlsServerContext);
        this.recordStream.init(this.tlsServerContext);
        this.recordStream.setRestrictReadVersion(false);
        blockForHandshake();
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    public void cleanupHandshake() {
        super.cleanupHandshake();
        this.keyExchange = null;
        this.serverCredentials = null;
        this.certificateRequest = null;
        this.prepareFinishHash = null;
    }

    public boolean expectCertificateVerifyMessage() {
        short s = this.clientCertificateType;
        return s >= 0 && TlsUtils.hasSigningCapability(s);
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    public TlsContext getContext() {
        return this.tlsServerContext;
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    public AbstractTlsContext getContextAdmin() {
        return this.tlsServerContext;
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    public TlsPeer getPeer() {
        return this.tlsServer;
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    public void handleHandshakeMessage(short s, byte[] bArr) throws IOException {
        CertificateStatus certificateStatus;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Certificate certificate = null;
        if (s == 1) {
            short s2 = this.connection_state;
            if (s2 != 0) {
                if (s2 == 16) {
                    refuseRenegotiation();
                    return;
                } else {
                    f1j0.m123577a(10);
                    return;
                }
            }
            receiveClientHelloMessage(byteArrayInputStream);
            this.connection_state = (short) 1;
            sendServerHelloMessage();
            this.connection_state = (short) 2;
            this.recordStream.notifyHelloComplete();
            Vector serverSupplementalData = this.tlsServer.getServerSupplementalData();
            if (serverSupplementalData != null) {
                sendSupplementalDataMessage(serverSupplementalData);
            }
            this.connection_state = (short) 3;
            TlsKeyExchange keyExchange = this.tlsServer.getKeyExchange();
            this.keyExchange = keyExchange;
            keyExchange.init(getContext());
            TlsCredentials credentials = this.tlsServer.getCredentials();
            this.serverCredentials = credentials;
            TlsKeyExchange tlsKeyExchange = this.keyExchange;
            if (credentials == null) {
                tlsKeyExchange.skipServerCredentials();
            } else {
                tlsKeyExchange.processServerCredentials(credentials);
                certificate = this.serverCredentials.getCertificate();
                sendCertificateMessage(certificate);
            }
            this.connection_state = (short) 4;
            if (certificate == null || certificate.isEmpty()) {
                this.allowCertificateStatus = false;
            }
            if (this.allowCertificateStatus && (certificateStatus = this.tlsServer.getCertificateStatus()) != null) {
                sendCertificateStatusMessage(certificateStatus);
            }
            this.connection_state = (short) 5;
            byte[] bArrGenerateServerKeyExchange = this.keyExchange.generateServerKeyExchange();
            if (bArrGenerateServerKeyExchange != null) {
                sendServerKeyExchangeMessage(bArrGenerateServerKeyExchange);
            }
            this.connection_state = (short) 6;
            if (this.serverCredentials != null) {
                CertificateRequest certificateRequest = this.tlsServer.getCertificateRequest();
                this.certificateRequest = certificateRequest;
                if (certificateRequest != null) {
                    if (TlsUtils.isTLSv12(getContext()) != (this.certificateRequest.getSupportedSignatureAlgorithms() != null)) {
                        f1j0.m123577a(80);
                        return;
                    } else {
                        this.keyExchange.validateCertificateRequest(this.certificateRequest);
                        sendCertificateRequestMessage(this.certificateRequest);
                        TlsUtils.trackHashAlgorithms(this.recordStream.getHandshakeHash(), this.certificateRequest.getSupportedSignatureAlgorithms());
                    }
                }
            }
            this.connection_state = (short) 7;
            sendServerHelloDoneMessage();
            this.connection_state = (short) 8;
            this.recordStream.getHandshakeHash().sealHashAlgorithms();
            return;
        }
        if (s == 11) {
            short s3 = this.connection_state;
            if (s3 == 8) {
                this.tlsServer.processClientSupplementalData(null);
            } else if (s3 != 9) {
                f1j0.m123577a(10);
                return;
            }
            if (this.certificateRequest == null) {
                f1j0.m123577a(10);
                return;
            } else {
                receiveCertificateMessage(byteArrayInputStream);
                this.connection_state = (short) 10;
                return;
            }
        }
        if (s == 20) {
            short s4 = this.connection_state;
            if (s4 != 11) {
                if (s4 != 12) {
                    f1j0.m123577a(10);
                    return;
                }
            } else if (expectCertificateVerifyMessage()) {
                f1j0.m123577a(10);
                return;
            }
            processFinishedMessage(byteArrayInputStream);
            this.connection_state = (short) 13;
            if (this.expectSessionTicket) {
                sendNewSessionTicketMessage(this.tlsServer.getNewSessionTicket());
                sendChangeCipherSpecMessage();
            }
            this.connection_state = (short) 14;
            sendFinishedMessage();
            this.connection_state = (short) 16;
            completeHandshake();
            return;
        }
        if (s == 23) {
            if (this.connection_state != 8) {
                f1j0.m123577a(10);
                return;
            } else {
                this.tlsServer.processClientSupplementalData(TlsProtocol.readSupplementalDataMessage(byteArrayInputStream));
                this.connection_state = (short) 9;
                return;
            }
        }
        if (s == 15) {
            if (this.connection_state != 11) {
                f1j0.m123577a(10);
                return;
            } else if (!expectCertificateVerifyMessage()) {
                f1j0.m123577a(10);
                return;
            } else {
                receiveCertificateVerifyMessage(byteArrayInputStream);
                this.connection_state = (short) 12;
                return;
            }
        }
        if (s != 16) {
            f1j0.m123577a(10);
            return;
        }
        switch (this.connection_state) {
            case 8:
                this.tlsServer.processClientSupplementalData(null);
            case 9:
                if (this.certificateRequest == null) {
                    this.keyExchange.skipClientCredentials();
                    break;
                } else {
                    if (TlsUtils.isTLSv12(getContext())) {
                        f1j0.m123577a(10);
                    } else if (!TlsUtils.isSSL(getContext())) {
                        notifyClientCertificate(Certificate.EMPTY_CHAIN);
                    } else if (this.peerCertificate == null) {
                        f1j0.m123577a(10);
                    }
                    break;
                }
            case 10:
                receiveClientKeyExchangeMessage(byteArrayInputStream);
                this.connection_state = (short) 11;
                break;
            default:
                f1j0.m123577a(10);
                break;
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    public void handleWarningMessage(short s) throws IOException {
        if (s != 41) {
            super.handleWarningMessage(s);
        } else {
            if (!TlsUtils.isSSL(getContext()) || this.certificateRequest == null) {
                return;
            }
            notifyClientCertificate(Certificate.EMPTY_CHAIN);
        }
    }

    public void notifyClientCertificate(Certificate certificate) throws IOException {
        if (this.certificateRequest == null) {
            wpg0.m207458a();
            return;
        }
        if (this.peerCertificate != null) {
            f1j0.m123577a(10);
            return;
        }
        this.peerCertificate = certificate;
        if (certificate.isEmpty()) {
            this.keyExchange.skipClientCredentials();
        } else {
            this.clientCertificateType = TlsUtils.getClientCertificateType(certificate, this.serverCredentials.getCertificate());
            this.keyExchange.processClientCertificate(certificate);
        }
        this.tlsServer.notifyClientCertificate(certificate);
    }

    public void receiveCertificateMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        Certificate certificate = Certificate.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        notifyClientCertificate(certificate);
    }

    public void receiveCertificateVerifyMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] sessionHash;
        if (this.certificateRequest == null) {
            wpg0.m207458a();
            return;
        }
        DigitallySigned digitallySigned = DigitallySigned.parse(getContext(), byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        try {
            SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
            if (TlsUtils.isTLSv12(getContext())) {
                TlsUtils.verifySupportedSignatureAlgorithm(this.certificateRequest.getSupportedSignatureAlgorithms(), algorithm);
                sessionHash = this.prepareFinishHash.getFinalHash(algorithm.getHash());
            } else {
                sessionHash = this.securityParameters.getSessionHash();
            }
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(this.peerCertificate.getCertificateAt(0).getSubjectPublicKeyInfo());
            TlsSigner tlsSignerCreateTlsSigner = TlsUtils.createTlsSigner(this.clientCertificateType);
            tlsSignerCreateTlsSigner.init(getContext());
            if (tlsSignerCreateTlsSigner.verifyRawSignature(algorithm, digitallySigned.getSignature(), asymmetricKeyParameterCreateKey, sessionHash)) {
            } else {
                throw new TlsFatalAlert((short) 51);
            }
        } catch (TlsFatalAlert e) {
            throw e;
        } catch (Exception e2) {
            throw new TlsFatalAlert((short) 51, e2);
        }
    }

    public void receiveClientHelloMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        ProtocolVersion version = TlsUtils.readVersion(byteArrayInputStream);
        this.recordStream.setWriteVersion(version);
        if (version.isDTLS()) {
            f1j0.m123577a(47);
            return;
        }
        byte[] fully = TlsUtils.readFully(32, byteArrayInputStream);
        if (TlsUtils.readOpaque8(byteArrayInputStream).length > 32) {
            f1j0.m123577a(47);
            return;
        }
        int uint16 = TlsUtils.readUint16(byteArrayInputStream);
        if (uint16 < 2 || (uint16 & 1) != 0) {
            f1j0.m123577a(50);
            return;
        }
        this.offeredCipherSuites = TlsUtils.readUint16Array(uint16 / 2, byteArrayInputStream);
        short uint8 = TlsUtils.readUint8(byteArrayInputStream);
        if (uint8 < 1) {
            f1j0.m123577a(47);
            return;
        }
        this.offeredCompressionMethods = TlsUtils.readUint8Array(uint8, byteArrayInputStream);
        Hashtable extensions = TlsProtocol.readExtensions(byteArrayInputStream);
        this.clientExtensions = extensions;
        this.securityParameters.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(extensions);
        getContextAdmin().setClientVersion(version);
        this.tlsServer.notifyClientVersion(version);
        this.tlsServer.notifyFallback(Arrays.contains(this.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV));
        this.securityParameters.clientRandom = fully;
        this.tlsServer.notifyOfferedCipherSuites(this.offeredCipherSuites);
        this.tlsServer.notifyOfferedCompressionMethods(this.offeredCompressionMethods);
        if (Arrays.contains(this.offeredCipherSuites, 255)) {
            this.secure_renegotiation = true;
        }
        byte[] extensionData = TlsUtils.getExtensionData(this.clientExtensions, TlsProtocol.EXT_RenegotiationInfo);
        if (extensionData != null) {
            this.secure_renegotiation = true;
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                f1j0.m123577a(40);
                return;
            }
        }
        this.tlsServer.notifySecureRenegotiation(this.secure_renegotiation);
        Hashtable hashtable = this.clientExtensions;
        if (hashtable != null) {
            this.tlsServer.processClientExtensions(hashtable);
        }
    }

    public void receiveClientKeyExchangeMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        this.keyExchange.processClientKeyExchange(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        this.prepareFinishHash = this.recordStream.prepareToFinish();
        this.securityParameters.sessionHash = TlsProtocol.getCurrentPRFHash(getContext(), this.prepareFinishHash, null);
        TlsProtocol.establishMasterSecret(getContext(), this.keyExchange);
        this.recordStream.setPendingConnectionState(getPeer().getCompression(), getPeer().getCipher());
        if (this.expectSessionTicket) {
            return;
        }
        sendChangeCipherSpecMessage();
    }

    public void sendCertificateRequestMessage(CertificateRequest certificateRequest) throws IOException {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 13);
        certificateRequest.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendCertificateStatusMessage(CertificateStatus certificateStatus) throws IOException {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 22);
        certificateStatus.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendNewSessionTicketMessage(NewSessionTicket newSessionTicket) throws IOException {
        if (newSessionTicket == null) {
            f1j0.m123577a(80);
            return;
        }
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 4);
        newSessionTicket.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendServerHelloDoneMessage() throws IOException {
        byte[] bArr = new byte[4];
        TlsUtils.writeUint8((short) 14, bArr, 0);
        TlsUtils.writeUint24(0, bArr, 1);
        writeHandshakeMessage(bArr, 0, 4);
    }

    public void sendServerHelloMessage() throws IOException {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 2);
        ProtocolVersion serverVersion = this.tlsServer.getServerVersion();
        if (!serverVersion.isEqualOrEarlierVersionOf(getContext().getClientVersion())) {
            f1j0.m123577a(80);
            return;
        }
        this.recordStream.setReadVersion(serverVersion);
        this.recordStream.setWriteVersion(serverVersion);
        this.recordStream.setRestrictReadVersion(true);
        getContextAdmin().setServerVersion(serverVersion);
        TlsUtils.writeVersion(serverVersion, handshakeMessage);
        handshakeMessage.write(this.securityParameters.serverRandom);
        byte[] bArr = TlsUtils.EMPTY_BYTES;
        TlsUtils.writeOpaque8(bArr, handshakeMessage);
        int selectedCipherSuite = this.tlsServer.getSelectedCipherSuite();
        if (!Arrays.contains(this.offeredCipherSuites, selectedCipherSuite) || selectedCipherSuite == 0 || CipherSuite.isSCSV(selectedCipherSuite) || !TlsUtils.isValidCipherSuiteForVersion(selectedCipherSuite, getContext().getServerVersion())) {
            f1j0.m123577a(80);
            return;
        }
        this.securityParameters.cipherSuite = selectedCipherSuite;
        short selectedCompressionMethod = this.tlsServer.getSelectedCompressionMethod();
        if (!Arrays.contains(this.offeredCompressionMethods, selectedCompressionMethod)) {
            f1j0.m123577a(80);
            return;
        }
        this.securityParameters.compressionAlgorithm = selectedCompressionMethod;
        TlsUtils.writeUint16(selectedCipherSuite, handshakeMessage);
        TlsUtils.writeUint8(selectedCompressionMethod, (OutputStream) handshakeMessage);
        Hashtable serverExtensions = this.tlsServer.getServerExtensions();
        this.serverExtensions = serverExtensions;
        if (this.secure_renegotiation) {
            Integer num = TlsProtocol.EXT_RenegotiationInfo;
            if (TlsUtils.getExtensionData(serverExtensions, num) == null) {
                Hashtable hashtableEnsureExtensionsInitialised = TlsExtensionsUtils.ensureExtensionsInitialised(this.serverExtensions);
                this.serverExtensions = hashtableEnsureExtensionsInitialised;
                hashtableEnsureExtensionsInitialised.put(num, TlsProtocol.createRenegotiationInfo(bArr));
            }
        }
        if (this.securityParameters.extendedMasterSecret) {
            Hashtable hashtableEnsureExtensionsInitialised2 = TlsExtensionsUtils.ensureExtensionsInitialised(this.serverExtensions);
            this.serverExtensions = hashtableEnsureExtensionsInitialised2;
            TlsExtensionsUtils.addExtendedMasterSecretExtension(hashtableEnsureExtensionsInitialised2);
        }
        Hashtable hashtable = this.serverExtensions;
        if (hashtable != null) {
            this.securityParameters.encryptThenMAC = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable);
            this.securityParameters.maxFragmentLength = processMaxFragmentLengthExtension(this.clientExtensions, this.serverExtensions, (short) 80);
            this.securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(this.serverExtensions);
            this.allowCertificateStatus = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(this.serverExtensions, TlsExtensionsUtils.EXT_status_request, (short) 80);
            this.expectSessionTicket = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(this.serverExtensions, TlsProtocol.EXT_SessionTicket, (short) 80);
            TlsProtocol.writeExtensions(handshakeMessage, this.serverExtensions);
        }
        this.securityParameters.prfAlgorithm = TlsProtocol.getPRFAlgorithm(getContext(), this.securityParameters.getCipherSuite());
        this.securityParameters.verifyDataLength = 12;
        applyMaxFragmentLengthExtension();
        handshakeMessage.writeToRecordStream();
    }

    public void sendServerKeyExchangeMessage(byte[] bArr) throws IOException {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage((short) 12, bArr.length);
        handshakeMessage.write(bArr);
        handshakeMessage.writeToRecordStream();
    }

    public TlsServerProtocol(SecureRandom secureRandom) {
        super(secureRandom);
        this.tlsServer = null;
        this.tlsServerContext = null;
        this.keyExchange = null;
        this.serverCredentials = null;
        this.certificateRequest = null;
        this.clientCertificateType = (short) -1;
        this.prepareFinishHash = null;
    }
}
