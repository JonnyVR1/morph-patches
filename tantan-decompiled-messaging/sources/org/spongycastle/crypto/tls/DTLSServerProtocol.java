package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.Arrays;
import p149l.csi0;
import p149l.ig3;
import p149l.ohg0;

/* JADX INFO: loaded from: classes3.dex */
public class DTLSServerProtocol extends DTLSProtocol {
    protected boolean verifyRequests;

    public static class ServerHandshakeState {
        TlsServer server = null;
        TlsServerContextImpl serverContext = null;
        int[] offeredCipherSuites = null;
        short[] offeredCompressionMethods = null;
        Hashtable clientExtensions = null;
        Hashtable serverExtensions = null;
        boolean resumedSession = false;
        boolean secure_renegotiation = false;
        boolean allowCertificateStatus = false;
        boolean expectSessionTicket = false;
        TlsKeyExchange keyExchange = null;
        TlsCredentials serverCredentials = null;
        CertificateRequest certificateRequest = null;
        short clientCertificateType = -1;
        Certificate clientCertificate = null;
    }

    public DTLSServerProtocol(SecureRandom secureRandom) {
        super(secureRandom);
        this.verifyRequests = true;
    }

    public DTLSTransport accept(TlsServer tlsServer, DatagramTransport datagramTransport) throws IOException {
        if (tlsServer == null) {
            ig3.m135964a("'server' cannot be null");
            return null;
        }
        if (datagramTransport == null) {
            ig3.m135964a("'transport' cannot be null");
            return null;
        }
        SecurityParameters securityParameters = new SecurityParameters();
        securityParameters.entity = 0;
        ServerHandshakeState serverHandshakeState = new ServerHandshakeState();
        serverHandshakeState.server = tlsServer;
        serverHandshakeState.serverContext = new TlsServerContextImpl(this.secureRandom, securityParameters);
        securityParameters.serverRandom = TlsProtocol.createRandomBlock(tlsServer.shouldUseGMTUnixTime(), serverHandshakeState.serverContext.getNonceRandomGenerator());
        tlsServer.init(serverHandshakeState.serverContext);
        DTLSRecordLayer dTLSRecordLayer = new DTLSRecordLayer(datagramTransport, serverHandshakeState.serverContext, tlsServer, (short) 22);
        try {
            return serverHandshake(serverHandshakeState, dTLSRecordLayer);
        } catch (RuntimeException e) {
            dTLSRecordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e);
        } catch (TlsFatalAlert e2) {
            dTLSRecordLayer.fail(e2.getAlertDescription());
            throw e2;
        } catch (IOException e3) {
            dTLSRecordLayer.fail((short) 80);
            throw e3;
        }
    }

    public boolean expectCertificateVerifyMessage(ServerHandshakeState serverHandshakeState) {
        short s = serverHandshakeState.clientCertificateType;
        return s >= 0 && TlsUtils.hasSigningCapability(s);
    }

    public byte[] generateCertificateRequest(ServerHandshakeState serverHandshakeState, CertificateRequest certificateRequest) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        certificateRequest.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateCertificateStatus(ServerHandshakeState serverHandshakeState, CertificateStatus certificateStatus) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        certificateStatus.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateNewSessionTicket(ServerHandshakeState serverHandshakeState, NewSessionTicket newSessionTicket) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        newSessionTicket.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateServerHello(ServerHandshakeState serverHandshakeState) throws IOException {
        SecurityParameters securityParameters = serverHandshakeState.serverContext.getSecurityParameters();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ProtocolVersion serverVersion = serverHandshakeState.server.getServerVersion();
        if (!serverVersion.isEqualOrEarlierVersionOf(serverHandshakeState.serverContext.getClientVersion())) {
            csi0.m108512a(80);
            return null;
        }
        serverHandshakeState.serverContext.setServerVersion(serverVersion);
        TlsUtils.writeVersion(serverHandshakeState.serverContext.getServerVersion(), byteArrayOutputStream);
        byteArrayOutputStream.write(securityParameters.getServerRandom());
        byte[] bArr = TlsUtils.EMPTY_BYTES;
        TlsUtils.writeOpaque8(bArr, byteArrayOutputStream);
        int selectedCipherSuite = serverHandshakeState.server.getSelectedCipherSuite();
        if (!Arrays.contains(serverHandshakeState.offeredCipherSuites, selectedCipherSuite) || selectedCipherSuite == 0 || CipherSuite.isSCSV(selectedCipherSuite) || !TlsUtils.isValidCipherSuiteForVersion(selectedCipherSuite, serverHandshakeState.serverContext.getServerVersion())) {
            csi0.m108512a(80);
            return null;
        }
        DTLSProtocol.validateSelectedCipherSuite(selectedCipherSuite, (short) 80);
        securityParameters.cipherSuite = selectedCipherSuite;
        short selectedCompressionMethod = serverHandshakeState.server.getSelectedCompressionMethod();
        if (!Arrays.contains(serverHandshakeState.offeredCompressionMethods, selectedCompressionMethod)) {
            csi0.m108512a(80);
            return null;
        }
        securityParameters.compressionAlgorithm = selectedCompressionMethod;
        TlsUtils.writeUint16(selectedCipherSuite, byteArrayOutputStream);
        TlsUtils.writeUint8(selectedCompressionMethod, (OutputStream) byteArrayOutputStream);
        Hashtable serverExtensions = serverHandshakeState.server.getServerExtensions();
        serverHandshakeState.serverExtensions = serverExtensions;
        if (serverHandshakeState.secure_renegotiation) {
            Integer num = TlsProtocol.EXT_RenegotiationInfo;
            if (TlsUtils.getExtensionData(serverExtensions, num) == null) {
                Hashtable hashtableEnsureExtensionsInitialised = TlsExtensionsUtils.ensureExtensionsInitialised(serverHandshakeState.serverExtensions);
                serverHandshakeState.serverExtensions = hashtableEnsureExtensionsInitialised;
                hashtableEnsureExtensionsInitialised.put(num, TlsProtocol.createRenegotiationInfo(bArr));
            }
        }
        if (securityParameters.extendedMasterSecret) {
            Hashtable hashtableEnsureExtensionsInitialised2 = TlsExtensionsUtils.ensureExtensionsInitialised(serverHandshakeState.serverExtensions);
            serverHandshakeState.serverExtensions = hashtableEnsureExtensionsInitialised2;
            TlsExtensionsUtils.addExtendedMasterSecretExtension(hashtableEnsureExtensionsInitialised2);
        }
        Hashtable hashtable = serverHandshakeState.serverExtensions;
        if (hashtable != null) {
            securityParameters.encryptThenMAC = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable);
            securityParameters.maxFragmentLength = DTLSProtocol.evaluateMaxFragmentLengthExtension(serverHandshakeState.resumedSession, serverHandshakeState.clientExtensions, serverHandshakeState.serverExtensions, (short) 80);
            securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(serverHandshakeState.serverExtensions);
            boolean z = false;
            serverHandshakeState.allowCertificateStatus = !serverHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(serverHandshakeState.serverExtensions, TlsExtensionsUtils.EXT_status_request, (short) 80);
            if (!serverHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(serverHandshakeState.serverExtensions, TlsProtocol.EXT_SessionTicket, (short) 80)) {
                z = true;
            }
            serverHandshakeState.expectSessionTicket = z;
            TlsProtocol.writeExtensions(byteArrayOutputStream, serverHandshakeState.serverExtensions);
        }
        securityParameters.prfAlgorithm = TlsProtocol.getPRFAlgorithm(serverHandshakeState.serverContext, securityParameters.getCipherSuite());
        securityParameters.verifyDataLength = 12;
        return byteArrayOutputStream.toByteArray();
    }

    public boolean getVerifyRequests() {
        return this.verifyRequests;
    }

    public void notifyClientCertificate(ServerHandshakeState serverHandshakeState, Certificate certificate) throws IOException {
        if (serverHandshakeState.certificateRequest == null) {
            ohg0.m164364a();
            return;
        }
        if (serverHandshakeState.clientCertificate != null) {
            csi0.m108512a(10);
            return;
        }
        serverHandshakeState.clientCertificate = certificate;
        if (certificate.isEmpty()) {
            serverHandshakeState.keyExchange.skipClientCredentials();
        } else {
            serverHandshakeState.clientCertificateType = TlsUtils.getClientCertificateType(certificate, serverHandshakeState.serverCredentials.getCertificate());
            serverHandshakeState.keyExchange.processClientCertificate(certificate);
        }
        serverHandshakeState.server.notifyClientCertificate(certificate);
    }

    public void processCertificateVerify(ServerHandshakeState serverHandshakeState, byte[] bArr, TlsHandshakeHash tlsHandshakeHash) throws IOException {
        byte[] sessionHash;
        if (serverHandshakeState.certificateRequest == null) {
            ohg0.m164364a();
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        TlsServerContextImpl tlsServerContextImpl = serverHandshakeState.serverContext;
        DigitallySigned digitallySigned = DigitallySigned.parse(tlsServerContextImpl, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        try {
            SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
            if (TlsUtils.isTLSv12(tlsServerContextImpl)) {
                TlsUtils.verifySupportedSignatureAlgorithm(serverHandshakeState.certificateRequest.getSupportedSignatureAlgorithms(), algorithm);
                sessionHash = tlsHandshakeHash.getFinalHash(algorithm.getHash());
            } else {
                sessionHash = tlsServerContextImpl.getSecurityParameters().getSessionHash();
            }
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(serverHandshakeState.clientCertificate.getCertificateAt(0).getSubjectPublicKeyInfo());
            TlsSigner tlsSignerCreateTlsSigner = TlsUtils.createTlsSigner(serverHandshakeState.clientCertificateType);
            tlsSignerCreateTlsSigner.init(tlsServerContextImpl);
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

    public void processClientCertificate(ServerHandshakeState serverHandshakeState, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Certificate certificate = Certificate.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        notifyClientCertificate(serverHandshakeState, certificate);
    }

    public void processClientHello(ServerHandshakeState serverHandshakeState, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ProtocolVersion version = TlsUtils.readVersion(byteArrayInputStream);
        if (!version.isDTLS()) {
            csi0.m108512a(47);
            return;
        }
        byte[] fully = TlsUtils.readFully(32, byteArrayInputStream);
        if (TlsUtils.readOpaque8(byteArrayInputStream).length > 32) {
            csi0.m108512a(47);
            return;
        }
        TlsUtils.readOpaque8(byteArrayInputStream);
        int uint16 = TlsUtils.readUint16(byteArrayInputStream);
        if (uint16 < 2 || (uint16 & 1) != 0) {
            csi0.m108512a(50);
            return;
        }
        serverHandshakeState.offeredCipherSuites = TlsUtils.readUint16Array(uint16 / 2, byteArrayInputStream);
        short uint8 = TlsUtils.readUint8(byteArrayInputStream);
        if (uint8 < 1) {
            csi0.m108512a(47);
            return;
        }
        serverHandshakeState.offeredCompressionMethods = TlsUtils.readUint8Array(uint8, byteArrayInputStream);
        serverHandshakeState.clientExtensions = TlsProtocol.readExtensions(byteArrayInputStream);
        TlsServerContextImpl tlsServerContextImpl = serverHandshakeState.serverContext;
        SecurityParameters securityParameters = tlsServerContextImpl.getSecurityParameters();
        securityParameters.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(serverHandshakeState.clientExtensions);
        tlsServerContextImpl.setClientVersion(version);
        serverHandshakeState.server.notifyClientVersion(version);
        serverHandshakeState.server.notifyFallback(Arrays.contains(serverHandshakeState.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV));
        securityParameters.clientRandom = fully;
        serverHandshakeState.server.notifyOfferedCipherSuites(serverHandshakeState.offeredCipherSuites);
        serverHandshakeState.server.notifyOfferedCompressionMethods(serverHandshakeState.offeredCompressionMethods);
        if (Arrays.contains(serverHandshakeState.offeredCipherSuites, 255)) {
            serverHandshakeState.secure_renegotiation = true;
        }
        byte[] extensionData = TlsUtils.getExtensionData(serverHandshakeState.clientExtensions, TlsProtocol.EXT_RenegotiationInfo);
        if (extensionData != null) {
            serverHandshakeState.secure_renegotiation = true;
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                csi0.m108512a(40);
                return;
            }
        }
        serverHandshakeState.server.notifySecureRenegotiation(serverHandshakeState.secure_renegotiation);
        Hashtable hashtable = serverHandshakeState.clientExtensions;
        if (hashtable != null) {
            serverHandshakeState.server.processClientExtensions(hashtable);
        }
    }

    public void processClientKeyExchange(ServerHandshakeState serverHandshakeState, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        serverHandshakeState.keyExchange.processClientKeyExchange(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
    }

    public void processClientSupplementalData(ServerHandshakeState serverHandshakeState, byte[] bArr) throws IOException {
        serverHandshakeState.server.processClientSupplementalData(TlsProtocol.readSupplementalDataMessage(new ByteArrayInputStream(bArr)));
    }

    public DTLSTransport serverHandshake(ServerHandshakeState serverHandshakeState, DTLSRecordLayer dTLSRecordLayer) throws IOException {
        Certificate certificate;
        CertificateStatus certificateStatus;
        SecurityParameters securityParameters = serverHandshakeState.serverContext.getSecurityParameters();
        DTLSReliableHandshake dTLSReliableHandshake = new DTLSReliableHandshake(serverHandshakeState.serverContext, dTLSRecordLayer);
        DTLSReliableHandshake.Message messageReceiveMessage = dTLSReliableHandshake.receiveMessage();
        if (messageReceiveMessage.getType() != 1) {
            csi0.m108512a(10);
            return null;
        }
        processClientHello(serverHandshakeState, messageReceiveMessage.getBody());
        byte[] bArrGenerateServerHello = generateServerHello(serverHandshakeState);
        DTLSProtocol.applyMaxFragmentLengthExtension(dTLSRecordLayer, securityParameters.maxFragmentLength);
        ProtocolVersion serverVersion = serverHandshakeState.serverContext.getServerVersion();
        dTLSRecordLayer.setReadVersion(serverVersion);
        dTLSRecordLayer.setWriteVersion(serverVersion);
        dTLSReliableHandshake.sendMessage((short) 2, bArrGenerateServerHello);
        dTLSReliableHandshake.notifyHelloComplete();
        Vector serverSupplementalData = serverHandshakeState.server.getServerSupplementalData();
        if (serverSupplementalData != null) {
            dTLSReliableHandshake.sendMessage((short) 23, DTLSProtocol.generateSupplementalData(serverSupplementalData));
        }
        TlsKeyExchange keyExchange = serverHandshakeState.server.getKeyExchange();
        serverHandshakeState.keyExchange = keyExchange;
        keyExchange.init(serverHandshakeState.serverContext);
        TlsCredentials credentials = serverHandshakeState.server.getCredentials();
        serverHandshakeState.serverCredentials = credentials;
        TlsKeyExchange tlsKeyExchange = serverHandshakeState.keyExchange;
        if (credentials == null) {
            tlsKeyExchange.skipServerCredentials();
            certificate = null;
        } else {
            tlsKeyExchange.processServerCredentials(credentials);
            certificate = serverHandshakeState.serverCredentials.getCertificate();
            dTLSReliableHandshake.sendMessage((short) 11, DTLSProtocol.generateCertificate(certificate));
        }
        if (certificate == null || certificate.isEmpty()) {
            serverHandshakeState.allowCertificateStatus = false;
        }
        if (serverHandshakeState.allowCertificateStatus && (certificateStatus = serverHandshakeState.server.getCertificateStatus()) != null) {
            dTLSReliableHandshake.sendMessage((short) 22, generateCertificateStatus(serverHandshakeState, certificateStatus));
        }
        byte[] bArrGenerateServerKeyExchange = serverHandshakeState.keyExchange.generateServerKeyExchange();
        if (bArrGenerateServerKeyExchange != null) {
            dTLSReliableHandshake.sendMessage((short) 12, bArrGenerateServerKeyExchange);
        }
        if (serverHandshakeState.serverCredentials != null) {
            CertificateRequest certificateRequest = serverHandshakeState.server.getCertificateRequest();
            serverHandshakeState.certificateRequest = certificateRequest;
            if (certificateRequest != null) {
                if (TlsUtils.isTLSv12(serverHandshakeState.serverContext) != (serverHandshakeState.certificateRequest.getSupportedSignatureAlgorithms() != null)) {
                    csi0.m108512a(80);
                    return null;
                }
                serverHandshakeState.keyExchange.validateCertificateRequest(serverHandshakeState.certificateRequest);
                dTLSReliableHandshake.sendMessage((short) 13, generateCertificateRequest(serverHandshakeState, serverHandshakeState.certificateRequest));
                TlsUtils.trackHashAlgorithms(dTLSReliableHandshake.getHandshakeHash(), serverHandshakeState.certificateRequest.getSupportedSignatureAlgorithms());
            }
        }
        dTLSReliableHandshake.sendMessage((short) 14, TlsUtils.EMPTY_BYTES);
        dTLSReliableHandshake.getHandshakeHash().sealHashAlgorithms();
        DTLSReliableHandshake.Message messageReceiveMessage2 = dTLSReliableHandshake.receiveMessage();
        if (messageReceiveMessage2.getType() == 23) {
            processClientSupplementalData(serverHandshakeState, messageReceiveMessage2.getBody());
            messageReceiveMessage2 = dTLSReliableHandshake.receiveMessage();
        } else {
            serverHandshakeState.server.processClientSupplementalData(null);
        }
        if (serverHandshakeState.certificateRequest == null) {
            serverHandshakeState.keyExchange.skipClientCredentials();
        } else if (messageReceiveMessage2.getType() == 11) {
            processClientCertificate(serverHandshakeState, messageReceiveMessage2.getBody());
            messageReceiveMessage2 = dTLSReliableHandshake.receiveMessage();
        } else {
            if (TlsUtils.isTLSv12(serverHandshakeState.serverContext)) {
                csi0.m108512a(10);
                return null;
            }
            notifyClientCertificate(serverHandshakeState, Certificate.EMPTY_CHAIN);
        }
        if (messageReceiveMessage2.getType() != 16) {
            csi0.m108512a(10);
            return null;
        }
        processClientKeyExchange(serverHandshakeState, messageReceiveMessage2.getBody());
        TlsHandshakeHash tlsHandshakeHashPrepareToFinish = dTLSReliableHandshake.prepareToFinish();
        securityParameters.sessionHash = TlsProtocol.getCurrentPRFHash(serverHandshakeState.serverContext, tlsHandshakeHashPrepareToFinish, null);
        TlsProtocol.establishMasterSecret(serverHandshakeState.serverContext, serverHandshakeState.keyExchange);
        dTLSRecordLayer.initPendingEpoch(serverHandshakeState.server.getCipher());
        if (expectCertificateVerifyMessage(serverHandshakeState)) {
            processCertificateVerify(serverHandshakeState, dTLSReliableHandshake.receiveMessageBody((short) 15), tlsHandshakeHashPrepareToFinish);
        }
        TlsServerContextImpl tlsServerContextImpl = serverHandshakeState.serverContext;
        processFinished(dTLSReliableHandshake.receiveMessageBody((short) 20), TlsUtils.calculateVerifyData(tlsServerContextImpl, ExporterLabel.client_finished, TlsProtocol.getCurrentPRFHash(tlsServerContextImpl, dTLSReliableHandshake.getHandshakeHash(), null)));
        if (serverHandshakeState.expectSessionTicket) {
            dTLSReliableHandshake.sendMessage((short) 4, generateNewSessionTicket(serverHandshakeState, serverHandshakeState.server.getNewSessionTicket()));
        }
        TlsServerContextImpl tlsServerContextImpl2 = serverHandshakeState.serverContext;
        dTLSReliableHandshake.sendMessage((short) 20, TlsUtils.calculateVerifyData(tlsServerContextImpl2, ExporterLabel.server_finished, TlsProtocol.getCurrentPRFHash(tlsServerContextImpl2, dTLSReliableHandshake.getHandshakeHash(), null)));
        dTLSReliableHandshake.finish();
        serverHandshakeState.server.notifyHandshakeComplete();
        return new DTLSTransport(dTLSRecordLayer);
    }

    public void setVerifyRequests(boolean z) {
        this.verifyRequests = z;
    }
}
