package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import l.ig3;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.util.Arrays;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DTLSClientProtocol extends DTLSProtocol {

    public static class ClientHandshakeState {
        TlsClient client = null;
        TlsClientContextImpl clientContext = null;
        TlsSession tlsSession = null;
        SessionParameters sessionParameters = null;
        SessionParameters.Builder sessionParametersBuilder = null;
        int[] offeredCipherSuites = null;
        short[] offeredCompressionMethods = null;
        Hashtable clientExtensions = null;
        Hashtable serverExtensions = null;
        byte[] selectedSessionID = null;
        boolean resumedSession = false;
        boolean secure_renegotiation = false;
        boolean allowCertificateStatus = false;
        boolean expectSessionTicket = false;
        TlsKeyExchange keyExchange = null;
        TlsAuthentication authentication = null;
        CertificateStatus certificateStatus = null;
        CertificateRequest certificateRequest = null;
        TlsCredentials clientCredentials = null;
    }

    public DTLSClientProtocol(SecureRandom secureRandom) {
        super(secureRandom);
    }

    public static byte[] patchClientHelloWithCookie(byte[] bArr, byte[] bArr2) throws IOException {
        short uint8 = TlsUtils.readUint8(bArr, 34);
        int i = 35 + uint8;
        int i2 = uint8 + 36;
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, i);
        TlsUtils.checkUint8(bArr2.length);
        TlsUtils.writeUint8(bArr2.length, bArr3, i);
        System.arraycopy(bArr2, 0, bArr3, i2, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length + i2, bArr.length - i2);
        return bArr3;
    }

    public DTLSTransport clientHandshake(ClientHandshakeState clientHandshakeState, DTLSRecordLayer dTLSRecordLayer) throws IOException {
        DTLSReliableHandshake.Message messageReceiveMessage;
        Certificate certificateProcessServerCertificate;
        SecurityParameters securityParameters = clientHandshakeState.clientContext.getSecurityParameters();
        DTLSReliableHandshake dTLSReliableHandshake = new DTLSReliableHandshake(clientHandshakeState.clientContext, dTLSRecordLayer);
        byte[] bArrGenerateClientHello = generateClientHello(clientHandshakeState, clientHandshakeState.client);
        dTLSRecordLayer.setWriteVersion(ProtocolVersion.DTLSv10);
        dTLSReliableHandshake.sendMessage((short) 1, bArrGenerateClientHello);
        DTLSReliableHandshake.Message messageReceiveMessage2 = dTLSReliableHandshake.receiveMessage();
        while (messageReceiveMessage2.getType() == 3) {
            if (!dTLSRecordLayer.getReadVersion().isEqualOrEarlierVersionOf(clientHandshakeState.clientContext.getClientVersion())) {
                csi0.m3424a(47);
                return null;
            }
            dTLSRecordLayer.setReadVersion(null);
            byte[] bArrPatchClientHelloWithCookie = patchClientHelloWithCookie(bArrGenerateClientHello, processHelloVerifyRequest(clientHandshakeState, messageReceiveMessage2.getBody()));
            dTLSReliableHandshake.resetHandshakeMessagesDigest();
            dTLSReliableHandshake.sendMessage((short) 1, bArrPatchClientHelloWithCookie);
            messageReceiveMessage2 = dTLSReliableHandshake.receiveMessage();
        }
        if (messageReceiveMessage2.getType() != 2) {
            csi0.m3424a(10);
            return null;
        }
        ProtocolVersion readVersion = dTLSRecordLayer.getReadVersion();
        reportServerVersion(clientHandshakeState, readVersion);
        dTLSRecordLayer.setWriteVersion(readVersion);
        processServerHello(clientHandshakeState, messageReceiveMessage2.getBody());
        dTLSReliableHandshake.notifyHelloComplete();
        DTLSProtocol.applyMaxFragmentLengthExtension(dTLSRecordLayer, securityParameters.maxFragmentLength);
        if (clientHandshakeState.resumedSession) {
            securityParameters.masterSecret = Arrays.clone(clientHandshakeState.sessionParameters.getMasterSecret());
            dTLSRecordLayer.initPendingEpoch(clientHandshakeState.client.getCipher());
            TlsClientContextImpl tlsClientContextImpl = clientHandshakeState.clientContext;
            processFinished(dTLSReliableHandshake.receiveMessageBody((short) 20), TlsUtils.calculateVerifyData(tlsClientContextImpl, ExporterLabel.server_finished, TlsProtocol.getCurrentPRFHash(tlsClientContextImpl, dTLSReliableHandshake.getHandshakeHash(), null)));
            TlsClientContextImpl tlsClientContextImpl2 = clientHandshakeState.clientContext;
            dTLSReliableHandshake.sendMessage((short) 20, TlsUtils.calculateVerifyData(tlsClientContextImpl2, ExporterLabel.client_finished, TlsProtocol.getCurrentPRFHash(tlsClientContextImpl2, dTLSReliableHandshake.getHandshakeHash(), null)));
            dTLSReliableHandshake.finish();
            clientHandshakeState.clientContext.setResumableSession(clientHandshakeState.tlsSession);
            clientHandshakeState.client.notifyHandshakeComplete();
            return new DTLSTransport(dTLSRecordLayer);
        }
        invalidateSession(clientHandshakeState);
        byte[] bArr = clientHandshakeState.selectedSessionID;
        if (bArr.length > 0) {
            clientHandshakeState.tlsSession = new TlsSessionImpl(bArr, null);
        }
        DTLSReliableHandshake.Message messageReceiveMessage3 = dTLSReliableHandshake.receiveMessage();
        if (messageReceiveMessage3.getType() == 23) {
            processServerSupplementalData(clientHandshakeState, messageReceiveMessage3.getBody());
            messageReceiveMessage3 = dTLSReliableHandshake.receiveMessage();
        } else {
            clientHandshakeState.client.processServerSupplementalData(null);
        }
        TlsKeyExchange keyExchange = clientHandshakeState.client.getKeyExchange();
        clientHandshakeState.keyExchange = keyExchange;
        keyExchange.init(clientHandshakeState.clientContext);
        if (messageReceiveMessage3.getType() == 11) {
            certificateProcessServerCertificate = processServerCertificate(clientHandshakeState, messageReceiveMessage3.getBody());
            messageReceiveMessage = dTLSReliableHandshake.receiveMessage();
        } else {
            clientHandshakeState.keyExchange.skipServerCredentials();
            messageReceiveMessage = messageReceiveMessage3;
            certificateProcessServerCertificate = null;
        }
        if (certificateProcessServerCertificate == null || certificateProcessServerCertificate.isEmpty()) {
            clientHandshakeState.allowCertificateStatus = false;
        }
        if (messageReceiveMessage.getType() == 22) {
            processCertificateStatus(clientHandshakeState, messageReceiveMessage.getBody());
            messageReceiveMessage = dTLSReliableHandshake.receiveMessage();
        }
        if (messageReceiveMessage.getType() == 12) {
            processServerKeyExchange(clientHandshakeState, messageReceiveMessage.getBody());
            messageReceiveMessage = dTLSReliableHandshake.receiveMessage();
        } else {
            clientHandshakeState.keyExchange.skipServerKeyExchange();
        }
        if (messageReceiveMessage.getType() == 13) {
            processCertificateRequest(clientHandshakeState, messageReceiveMessage.getBody());
            TlsUtils.trackHashAlgorithms(dTLSReliableHandshake.getHandshakeHash(), clientHandshakeState.certificateRequest.getSupportedSignatureAlgorithms());
            messageReceiveMessage = dTLSReliableHandshake.receiveMessage();
        }
        if (messageReceiveMessage.getType() != 14) {
            csi0.m3424a(10);
            return null;
        }
        if (messageReceiveMessage.getBody().length != 0) {
            csi0.m3424a(50);
            return null;
        }
        dTLSReliableHandshake.getHandshakeHash().sealHashAlgorithms();
        Vector clientSupplementalData = clientHandshakeState.client.getClientSupplementalData();
        if (clientSupplementalData != null) {
            dTLSReliableHandshake.sendMessage((short) 23, DTLSProtocol.generateSupplementalData(clientSupplementalData));
        }
        CertificateRequest certificateRequest = clientHandshakeState.certificateRequest;
        if (certificateRequest != null) {
            TlsCredentials clientCredentials = clientHandshakeState.authentication.getClientCredentials(certificateRequest);
            clientHandshakeState.clientCredentials = clientCredentials;
            Certificate certificate = clientCredentials != null ? clientCredentials.getCertificate() : null;
            if (certificate == null) {
                certificate = Certificate.EMPTY_CHAIN;
            }
            dTLSReliableHandshake.sendMessage((short) 11, DTLSProtocol.generateCertificate(certificate));
        }
        TlsCredentials tlsCredentials = clientHandshakeState.clientCredentials;
        TlsKeyExchange tlsKeyExchange = clientHandshakeState.keyExchange;
        if (tlsCredentials != null) {
            tlsKeyExchange.processClientCredentials(tlsCredentials);
        } else {
            tlsKeyExchange.skipClientCredentials();
        }
        dTLSReliableHandshake.sendMessage((short) 16, generateClientKeyExchange(clientHandshakeState));
        TlsHandshakeHash tlsHandshakeHashPrepareToFinish = dTLSReliableHandshake.prepareToFinish();
        securityParameters.sessionHash = TlsProtocol.getCurrentPRFHash(clientHandshakeState.clientContext, tlsHandshakeHashPrepareToFinish, null);
        TlsProtocol.establishMasterSecret(clientHandshakeState.clientContext, clientHandshakeState.keyExchange);
        dTLSRecordLayer.initPendingEpoch(clientHandshakeState.client.getCipher());
        TlsCredentials tlsCredentials2 = clientHandshakeState.clientCredentials;
        if (tlsCredentials2 != null && (tlsCredentials2 instanceof TlsSignerCredentials)) {
            TlsSignerCredentials tlsSignerCredentials = (TlsSignerCredentials) tlsCredentials2;
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = TlsUtils.getSignatureAndHashAlgorithm(clientHandshakeState.clientContext, tlsSignerCredentials);
            dTLSReliableHandshake.sendMessage((short) 15, generateCertificateVerify(clientHandshakeState, new DigitallySigned(signatureAndHashAlgorithm, tlsSignerCredentials.generateCertificateSignature(signatureAndHashAlgorithm == null ? securityParameters.getSessionHash() : tlsHandshakeHashPrepareToFinish.getFinalHash(signatureAndHashAlgorithm.getHash())))));
        }
        TlsClientContextImpl tlsClientContextImpl3 = clientHandshakeState.clientContext;
        dTLSReliableHandshake.sendMessage((short) 20, TlsUtils.calculateVerifyData(tlsClientContextImpl3, ExporterLabel.client_finished, TlsProtocol.getCurrentPRFHash(tlsClientContextImpl3, dTLSReliableHandshake.getHandshakeHash(), null)));
        if (clientHandshakeState.expectSessionTicket) {
            DTLSReliableHandshake.Message messageReceiveMessage4 = dTLSReliableHandshake.receiveMessage();
            if (messageReceiveMessage4.getType() != 4) {
                csi0.m3424a(10);
                return null;
            }
            processNewSessionTicket(clientHandshakeState, messageReceiveMessage4.getBody());
        }
        TlsClientContextImpl tlsClientContextImpl4 = clientHandshakeState.clientContext;
        processFinished(dTLSReliableHandshake.receiveMessageBody((short) 20), TlsUtils.calculateVerifyData(tlsClientContextImpl4, ExporterLabel.server_finished, TlsProtocol.getCurrentPRFHash(tlsClientContextImpl4, dTLSReliableHandshake.getHandshakeHash(), null)));
        dTLSReliableHandshake.finish();
        if (clientHandshakeState.tlsSession != null) {
            clientHandshakeState.sessionParameters = new SessionParameters.Builder().setCipherSuite(securityParameters.getCipherSuite()).setCompressionAlgorithm(securityParameters.getCompressionAlgorithm()).setMasterSecret(securityParameters.getMasterSecret()).setPeerCertificate(certificateProcessServerCertificate).setPSKIdentity(securityParameters.getPSKIdentity()).setSRPIdentity(securityParameters.getSRPIdentity()).setServerExtensions(clientHandshakeState.serverExtensions).build();
            TlsSession tlsSessionImportSession = TlsUtils.importSession(clientHandshakeState.tlsSession.getSessionID(), clientHandshakeState.sessionParameters);
            clientHandshakeState.tlsSession = tlsSessionImportSession;
            clientHandshakeState.clientContext.setResumableSession(tlsSessionImportSession);
        }
        clientHandshakeState.client.notifyHandshakeComplete();
        return new DTLSTransport(dTLSRecordLayer);
    }

    public DTLSTransport connect(TlsClient tlsClient, DatagramTransport datagramTransport) throws IOException {
        SessionParameters sessionParametersExportSessionParameters;
        if (tlsClient == null) {
            ig3.a("'client' cannot be null");
            return null;
        }
        if (datagramTransport == null) {
            ig3.a("'transport' cannot be null");
            return null;
        }
        SecurityParameters securityParameters = new SecurityParameters();
        securityParameters.entity = 1;
        ClientHandshakeState clientHandshakeState = new ClientHandshakeState();
        clientHandshakeState.client = tlsClient;
        clientHandshakeState.clientContext = new TlsClientContextImpl(this.secureRandom, securityParameters);
        securityParameters.clientRandom = TlsProtocol.createRandomBlock(tlsClient.shouldUseGMTUnixTime(), clientHandshakeState.clientContext.getNonceRandomGenerator());
        tlsClient.init(clientHandshakeState.clientContext);
        DTLSRecordLayer dTLSRecordLayer = new DTLSRecordLayer(datagramTransport, clientHandshakeState.clientContext, tlsClient, (short) 22);
        TlsSession sessionToResume = clientHandshakeState.client.getSessionToResume();
        if (sessionToResume != null && sessionToResume.isResumable() && (sessionParametersExportSessionParameters = sessionToResume.exportSessionParameters()) != null) {
            clientHandshakeState.tlsSession = sessionToResume;
            clientHandshakeState.sessionParameters = sessionParametersExportSessionParameters;
        }
        try {
            return clientHandshake(clientHandshakeState, dTLSRecordLayer);
        } catch (TlsFatalAlert e) {
            dTLSRecordLayer.fail(e.getAlertDescription());
            throw e;
        } catch (IOException e2) {
            dTLSRecordLayer.fail((short) 80);
            throw e2;
        } catch (RuntimeException e3) {
            dTLSRecordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e3);
        }
    }

    public byte[] generateCertificateVerify(ClientHandshakeState clientHandshakeState, DigitallySigned digitallySigned) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        digitallySigned.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateClientHello(ClientHandshakeState clientHandshakeState, TlsClient tlsClient) throws IOException {
        byte[] sessionID;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ProtocolVersion clientVersion = tlsClient.getClientVersion();
        if (!clientVersion.isDTLS()) {
            csi0.m3424a(80);
            return null;
        }
        TlsClientContextImpl tlsClientContextImpl = clientHandshakeState.clientContext;
        tlsClientContextImpl.setClientVersion(clientVersion);
        TlsUtils.writeVersion(clientVersion, byteArrayOutputStream);
        byteArrayOutputStream.write(tlsClientContextImpl.getSecurityParameters().getClientRandom());
        byte[] bArr = TlsUtils.EMPTY_BYTES;
        TlsSession tlsSession = clientHandshakeState.tlsSession;
        if (tlsSession == null || (sessionID = tlsSession.getSessionID()) == null || sessionID.length > 32) {
            sessionID = bArr;
        }
        TlsUtils.writeOpaque8(sessionID, byteArrayOutputStream);
        TlsUtils.writeOpaque8(bArr, byteArrayOutputStream);
        boolean zIsFallback = tlsClient.isFallback();
        clientHandshakeState.offeredCipherSuites = tlsClient.getCipherSuites();
        Hashtable clientExtensions = tlsClient.getClientExtensions();
        clientHandshakeState.clientExtensions = clientExtensions;
        boolean z = TlsUtils.getExtensionData(clientExtensions, TlsProtocol.EXT_RenegotiationInfo) == null;
        boolean zContains = Arrays.contains(clientHandshakeState.offeredCipherSuites, 255);
        if (z && !zContains) {
            clientHandshakeState.offeredCipherSuites = Arrays.append(clientHandshakeState.offeredCipherSuites, 255);
        }
        if (zIsFallback && !Arrays.contains(clientHandshakeState.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV)) {
            clientHandshakeState.offeredCipherSuites = Arrays.append(clientHandshakeState.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV);
        }
        TlsUtils.writeUint16ArrayWithUint16Length(clientHandshakeState.offeredCipherSuites, byteArrayOutputStream);
        short[] sArr = {0};
        clientHandshakeState.offeredCompressionMethods = sArr;
        TlsUtils.writeUint8ArrayWithUint8Length(sArr, byteArrayOutputStream);
        Hashtable hashtable = clientHandshakeState.clientExtensions;
        if (hashtable != null) {
            TlsProtocol.writeExtensions(byteArrayOutputStream, hashtable);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateClientKeyExchange(ClientHandshakeState clientHandshakeState) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        clientHandshakeState.keyExchange.generateClientKeyExchange(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void invalidateSession(ClientHandshakeState clientHandshakeState) {
        SessionParameters sessionParameters = clientHandshakeState.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            clientHandshakeState.sessionParameters = null;
        }
        TlsSession tlsSession = clientHandshakeState.tlsSession;
        if (tlsSession != null) {
            tlsSession.invalidate();
            clientHandshakeState.tlsSession = null;
        }
    }

    public void processCertificateRequest(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        if (clientHandshakeState.authentication == null) {
            csi0.m3424a(40);
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        clientHandshakeState.certificateRequest = CertificateRequest.parse(clientHandshakeState.clientContext, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        clientHandshakeState.keyExchange.validateCertificateRequest(clientHandshakeState.certificateRequest);
    }

    public void processCertificateStatus(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        if (!clientHandshakeState.allowCertificateStatus) {
            csi0.m3424a(10);
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        clientHandshakeState.certificateStatus = CertificateStatus.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
    }

    public byte[] processHelloVerifyRequest(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ProtocolVersion version = TlsUtils.readVersion(byteArrayInputStream);
        byte[] opaque8 = TlsUtils.readOpaque8(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (!version.isEqualOrEarlierVersionOf(clientHandshakeState.clientContext.getClientVersion())) {
            csi0.m3424a(47);
            return null;
        }
        if (ProtocolVersion.DTLSv12.isEqualOrEarlierVersionOf(version) || opaque8.length <= 32) {
            return opaque8;
        }
        csi0.m3424a(47);
        return null;
    }

    public void processNewSessionTicket(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        NewSessionTicket newSessionTicket = NewSessionTicket.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        clientHandshakeState.client.notifyNewSessionTicket(newSessionTicket);
    }

    public Certificate processServerCertificate(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Certificate certificate = Certificate.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        clientHandshakeState.keyExchange.processServerCertificate(certificate);
        TlsAuthentication authentication = clientHandshakeState.client.getAuthentication();
        clientHandshakeState.authentication = authentication;
        authentication.notifyServerCertificate(certificate);
        return certificate;
    }

    public void processServerHello(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        TlsSession tlsSession;
        SecurityParameters securityParameters = clientHandshakeState.clientContext.getSecurityParameters();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        reportServerVersion(clientHandshakeState, TlsUtils.readVersion(byteArrayInputStream));
        securityParameters.serverRandom = TlsUtils.readFully(32, byteArrayInputStream);
        byte[] opaque8 = TlsUtils.readOpaque8(byteArrayInputStream);
        clientHandshakeState.selectedSessionID = opaque8;
        if (opaque8.length > 32) {
            csi0.m3424a(47);
            return;
        }
        clientHandshakeState.client.notifySessionID(opaque8);
        byte[] bArr2 = clientHandshakeState.selectedSessionID;
        boolean z = false;
        clientHandshakeState.resumedSession = bArr2.length > 0 && (tlsSession = clientHandshakeState.tlsSession) != null && Arrays.areEqual(bArr2, tlsSession.getSessionID());
        int uint16 = TlsUtils.readUint16(byteArrayInputStream);
        if (!Arrays.contains(clientHandshakeState.offeredCipherSuites, uint16) || uint16 == 0 || CipherSuite.isSCSV(uint16) || !TlsUtils.isValidCipherSuiteForVersion(uint16, clientHandshakeState.clientContext.getServerVersion())) {
            csi0.m3424a(47);
            return;
        }
        DTLSProtocol.validateSelectedCipherSuite(uint16, (short) 47);
        clientHandshakeState.client.notifySelectedCipherSuite(uint16);
        short uint8 = TlsUtils.readUint8(byteArrayInputStream);
        if (!Arrays.contains(clientHandshakeState.offeredCompressionMethods, uint8)) {
            csi0.m3424a(47);
            return;
        }
        clientHandshakeState.client.notifySelectedCompressionMethod(uint8);
        Hashtable extensions = TlsProtocol.readExtensions(byteArrayInputStream);
        clientHandshakeState.serverExtensions = extensions;
        if (extensions != null) {
            Enumeration enumerationKeys = extensions.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                if (!num.equals(TlsProtocol.EXT_RenegotiationInfo) && TlsUtils.getExtensionData(clientHandshakeState.clientExtensions, num) == null) {
                    csi0.m3424a(EACTags.APPLICATION_RELATED_DATA);
                    return;
                }
            }
        }
        byte[] extensionData = TlsUtils.getExtensionData(clientHandshakeState.serverExtensions, TlsProtocol.EXT_RenegotiationInfo);
        if (extensionData != null) {
            clientHandshakeState.secure_renegotiation = true;
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                csi0.m3424a(40);
                return;
            }
        }
        clientHandshakeState.client.notifySecureRenegotiation(clientHandshakeState.secure_renegotiation);
        Hashtable hashtable = clientHandshakeState.clientExtensions;
        Hashtable serverExtensions = clientHandshakeState.serverExtensions;
        if (clientHandshakeState.resumedSession) {
            if (uint16 != clientHandshakeState.sessionParameters.getCipherSuite() || uint8 != clientHandshakeState.sessionParameters.getCompressionAlgorithm()) {
                csi0.m3424a(47);
                return;
            } else {
                serverExtensions = clientHandshakeState.sessionParameters.readServerExtensions();
                hashtable = null;
            }
        }
        securityParameters.cipherSuite = uint16;
        securityParameters.compressionAlgorithm = uint8;
        if (serverExtensions != null) {
            boolean zHasEncryptThenMACExtension = TlsExtensionsUtils.hasEncryptThenMACExtension(serverExtensions);
            if (zHasEncryptThenMACExtension && !TlsUtils.isBlockCipherSuite(securityParameters.getCipherSuite())) {
                csi0.m3424a(47);
                return;
            }
            securityParameters.encryptThenMAC = zHasEncryptThenMACExtension;
            securityParameters.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(serverExtensions);
            securityParameters.maxFragmentLength = DTLSProtocol.evaluateMaxFragmentLengthExtension(clientHandshakeState.resumedSession, hashtable, serverExtensions, (short) 47);
            securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(serverExtensions);
            clientHandshakeState.allowCertificateStatus = !clientHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(serverExtensions, TlsExtensionsUtils.EXT_status_request, (short) 47);
            if (!clientHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(serverExtensions, TlsProtocol.EXT_SessionTicket, (short) 47)) {
                z = true;
            }
            clientHandshakeState.expectSessionTicket = z;
        }
        if (hashtable != null) {
            clientHandshakeState.client.processServerExtensions(serverExtensions);
        }
        securityParameters.prfAlgorithm = TlsProtocol.getPRFAlgorithm(clientHandshakeState.clientContext, securityParameters.getCipherSuite());
        securityParameters.verifyDataLength = 12;
    }

    public void processServerKeyExchange(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        clientHandshakeState.keyExchange.processServerKeyExchange(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
    }

    public void processServerSupplementalData(ClientHandshakeState clientHandshakeState, byte[] bArr) throws IOException {
        clientHandshakeState.client.processServerSupplementalData(TlsProtocol.readSupplementalDataMessage(new ByteArrayInputStream(bArr)));
    }

    public void reportServerVersion(ClientHandshakeState clientHandshakeState, ProtocolVersion protocolVersion) throws IOException {
        TlsClientContextImpl tlsClientContextImpl = clientHandshakeState.clientContext;
        ProtocolVersion serverVersion = tlsClientContextImpl.getServerVersion();
        if (serverVersion == null) {
            tlsClientContextImpl.setServerVersion(protocolVersion);
            clientHandshakeState.client.notifyServerVersion(protocolVersion);
        } else {
            if (serverVersion.equals(protocolVersion)) {
                return;
            }
            csi0.m3424a(47);
        }
    }
}
