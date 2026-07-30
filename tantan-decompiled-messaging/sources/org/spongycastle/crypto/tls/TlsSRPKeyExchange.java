package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Vector;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.agreement.srp.SRP6Client;
import org.spongycastle.crypto.agreement.srp.SRP6Server;
import org.spongycastle.crypto.agreement.srp.SRP6Util;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.SRP6GroupParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.p132io.TeeInputStream;
import p149l.csi0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class TlsSRPKeyExchange extends AbstractTlsKeyExchange {
    protected TlsSRPGroupVerifier groupVerifier;
    protected byte[] identity;
    protected byte[] password;
    protected TlsSignerCredentials serverCredentials;
    protected AsymmetricKeyParameter serverPublicKey;
    protected SRP6Client srpClient;
    protected SRP6GroupParameters srpGroup;
    protected BigInteger srpPeerCredentials;
    protected byte[] srpSalt;
    protected SRP6Server srpServer;
    protected BigInteger srpVerifier;
    protected TlsSigner tlsSigner;

    public TlsSRPKeyExchange(int i, Vector vector, byte[] bArr, TlsSRPLoginParameters tlsSRPLoginParameters) {
        super(i, vector);
        this.serverPublicKey = null;
        this.srpGroup = null;
        this.srpClient = null;
        this.srpServer = null;
        this.srpPeerCredentials = null;
        this.srpVerifier = null;
        this.srpSalt = null;
        this.serverCredentials = null;
        this.tlsSigner = createSigner(i);
        this.identity = bArr;
        this.srpServer = new SRP6Server();
        this.srpGroup = tlsSRPLoginParameters.getGroup();
        this.srpVerifier = tlsSRPLoginParameters.getVerifier();
        this.srpSalt = tlsSRPLoginParameters.getSalt();
    }

    public static TlsSigner createSigner(int i) {
        switch (i) {
            case 21:
                return null;
            case 22:
                return new TlsDSSSigner();
            case 23:
                return new TlsRSASigner();
            default:
                ig3.m135964a("unsupported key exchange algorithm");
                return null;
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void generateClientKeyExchange(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.srpClient.generateClientCredentials(this.srpSalt, this.identity, this.password), outputStream);
        this.context.getSecurityParameters().srpIdentity = Arrays.clone(this.identity);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generatePremasterSecret() throws IOException {
        try {
            SRP6Server sRP6Server = this.srpServer;
            return BigIntegers.asUnsignedByteArray(sRP6Server != null ? sRP6Server.calculateSecret(this.srpPeerCredentials) : this.srpClient.calculateSecret(this.srpPeerCredentials));
        } catch (CryptoException e) {
            throw new TlsFatalAlert((short) 47, e);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generateServerKeyExchange() throws IOException {
        this.srpServer.init(this.srpGroup, this.srpVerifier, TlsUtils.createHash((short) 2), this.context.getSecureRandom());
        ServerSRPParams serverSRPParams = new ServerSRPParams(this.srpGroup.getN(), this.srpGroup.getG(), this.srpSalt, this.srpServer.generateServerCredentials());
        DigestInputBuffer digestInputBuffer = new DigestInputBuffer();
        serverSRPParams.encode(digestInputBuffer);
        TlsSignerCredentials tlsSignerCredentials = this.serverCredentials;
        if (tlsSignerCredentials != null) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = TlsUtils.getSignatureAndHashAlgorithm(this.context, tlsSignerCredentials);
            Digest digestCreateHash = TlsUtils.createHash(signatureAndHashAlgorithm);
            SecurityParameters securityParameters = this.context.getSecurityParameters();
            byte[] bArr = securityParameters.clientRandom;
            digestCreateHash.update(bArr, 0, bArr.length);
            byte[] bArr2 = securityParameters.serverRandom;
            digestCreateHash.update(bArr2, 0, bArr2.length);
            digestInputBuffer.updateDigest(digestCreateHash);
            byte[] bArr3 = new byte[digestCreateHash.getDigestSize()];
            digestCreateHash.doFinal(bArr3, 0);
            new DigitallySigned(signatureAndHashAlgorithm, this.serverCredentials.generateCertificateSignature(bArr3)).encode(digestInputBuffer);
        }
        return digestInputBuffer.toByteArray();
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void init(TlsContext tlsContext) {
        super.init(tlsContext);
        TlsSigner tlsSigner = this.tlsSigner;
        if (tlsSigner != null) {
            tlsSigner.init(tlsContext);
        }
    }

    public Signer initVerifyer(TlsSigner tlsSigner, SignatureAndHashAlgorithm signatureAndHashAlgorithm, SecurityParameters securityParameters) {
        Signer signerCreateVerifyer = tlsSigner.createVerifyer(signatureAndHashAlgorithm, this.serverPublicKey);
        byte[] bArr = securityParameters.clientRandom;
        signerCreateVerifyer.update(bArr, 0, bArr.length);
        byte[] bArr2 = securityParameters.serverRandom;
        signerCreateVerifyer.update(bArr2, 0, bArr2.length);
        return signerCreateVerifyer;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientKeyExchange(InputStream inputStream) throws IOException {
        try {
            this.srpPeerCredentials = SRP6Util.validatePublicValue(this.srpGroup.getN(), TlsSRPUtils.readSRPParameter(inputStream));
            this.context.getSecurityParameters().srpIdentity = Arrays.clone(this.identity);
        } catch (CryptoException e) {
            throw new TlsFatalAlert((short) 47, e);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(Certificate certificate) throws IOException {
        if (this.tlsSigner == null) {
            csi0.m108512a(10);
            return;
        }
        if (certificate.isEmpty()) {
            csi0.m108512a(42);
            return;
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            this.serverPublicKey = asymmetricKeyParameterCreateKey;
            if (!this.tlsSigner.isValidPublicKey(asymmetricKeyParameterCreateKey)) {
                csi0.m108512a(46);
            } else {
                TlsUtils.validateKeyUsage(certificateAt, 128);
                super.processServerCertificate(certificate);
            }
        } catch (RuntimeException e) {
            throw new TlsFatalAlert((short) 43, e);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCredentials(TlsCredentials tlsCredentials) throws IOException {
        if (this.keyExchange == 21 || !(tlsCredentials instanceof TlsSignerCredentials)) {
            csi0.m108512a(80);
        } else {
            processServerCertificate(tlsCredentials.getCertificate());
            this.serverCredentials = (TlsSignerCredentials) tlsCredentials;
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(InputStream inputStream) throws IOException {
        SignerInputBuffer signerInputBuffer;
        InputStream teeInputStream;
        SecurityParameters securityParameters = this.context.getSecurityParameters();
        if (this.tlsSigner != null) {
            signerInputBuffer = new SignerInputBuffer();
            teeInputStream = new TeeInputStream(inputStream, signerInputBuffer);
        } else {
            signerInputBuffer = null;
            teeInputStream = inputStream;
        }
        ServerSRPParams serverSRPParams = ServerSRPParams.parse(teeInputStream);
        if (signerInputBuffer != null) {
            DigitallySigned signature = parseSignature(inputStream);
            Signer signerInitVerifyer = initVerifyer(this.tlsSigner, signature.getAlgorithm(), securityParameters);
            signerInputBuffer.updateSigner(signerInitVerifyer);
            if (!signerInitVerifyer.verifySignature(signature.getSignature())) {
                csi0.m108512a(51);
                return;
            }
        }
        SRP6GroupParameters sRP6GroupParameters = new SRP6GroupParameters(serverSRPParams.getN(), serverSRPParams.getG());
        this.srpGroup = sRP6GroupParameters;
        if (!this.groupVerifier.accept(sRP6GroupParameters)) {
            csi0.m108512a(71);
            return;
        }
        this.srpSalt = serverSRPParams.getS();
        try {
            this.srpPeerCredentials = SRP6Util.validatePublicValue(this.srpGroup.getN(), serverSRPParams.getB());
            this.srpClient.init(this.srpGroup, TlsUtils.createHash((short) 2), this.context.getSecureRandom());
        } catch (CryptoException e) {
            throw new TlsFatalAlert((short) 47, e);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public boolean requiresServerKeyExchange() {
        return true;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void skipServerCredentials() throws IOException {
        if (this.tlsSigner == null) {
            return;
        }
        csi0.m108512a(10);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) throws IOException {
        throw new TlsFatalAlert((short) 10);
    }

    public TlsSRPKeyExchange(int i, Vector vector, TlsSRPGroupVerifier tlsSRPGroupVerifier, byte[] bArr, byte[] bArr2) {
        super(i, vector);
        this.serverPublicKey = null;
        this.srpGroup = null;
        this.srpClient = null;
        this.srpServer = null;
        this.srpPeerCredentials = null;
        this.srpVerifier = null;
        this.srpSalt = null;
        this.serverCredentials = null;
        this.tlsSigner = createSigner(i);
        this.groupVerifier = tlsSRPGroupVerifier;
        this.identity = bArr;
        this.password = bArr2;
        this.srpClient = new SRP6Client();
    }

    public TlsSRPKeyExchange(int i, Vector vector, byte[] bArr, byte[] bArr2) {
        this(i, vector, new DefaultTlsSRPGroupVerifier(), bArr, bArr2);
    }
}
