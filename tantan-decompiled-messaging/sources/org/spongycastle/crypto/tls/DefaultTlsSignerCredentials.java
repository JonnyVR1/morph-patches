package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTlsSignerCredentials extends AbstractTlsSignerCredentials {
    protected Certificate certificate;
    protected TlsContext context;
    protected AsymmetricKeyParameter privateKey;
    protected SignatureAndHashAlgorithm signatureAndHashAlgorithm;
    protected TlsSigner signer;

    public DefaultTlsSignerCredentials(TlsContext tlsContext, Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (certificate == null) {
            ig3.m135964a("'certificate' cannot be null");
            throw null;
        }
        if (certificate.isEmpty()) {
            ig3.m135964a("'certificate' cannot be empty");
            throw null;
        }
        if (asymmetricKeyParameter == null) {
            ig3.m135964a("'privateKey' cannot be null");
            throw null;
        }
        if (!asymmetricKeyParameter.isPrivate()) {
            ig3.m135964a("'privateKey' must be private");
            throw null;
        }
        if (TlsUtils.isTLSv12(tlsContext) && signatureAndHashAlgorithm == null) {
            ig3.m135964a("'signatureAndHashAlgorithm' cannot be null for (D)TLS 1.2+");
            throw null;
        }
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            this.signer = new TlsRSASigner();
        } else if (asymmetricKeyParameter instanceof DSAPrivateKeyParameters) {
            this.signer = new TlsDSSSigner();
        } else {
            if (!(asymmetricKeyParameter instanceof ECPrivateKeyParameters)) {
                ig3.m135964a("'privateKey' type not supported: ".concat(asymmetricKeyParameter.getClass().getName()));
                throw null;
            }
            this.signer = new TlsECDSASigner();
        }
        this.signer.init(tlsContext);
        this.context = tlsContext;
        this.certificate = certificate;
        this.privateKey = asymmetricKeyParameter;
        this.signatureAndHashAlgorithm = signatureAndHashAlgorithm;
    }

    @Override // org.spongycastle.crypto.tls.TlsSignerCredentials
    public byte[] generateCertificateSignature(byte[] bArr) throws IOException {
        try {
            boolean zIsTLSv12 = TlsUtils.isTLSv12(this.context);
            TlsSigner tlsSigner = this.signer;
            return zIsTLSv12 ? tlsSigner.generateRawSignature(this.signatureAndHashAlgorithm, this.privateKey, bArr) : tlsSigner.generateRawSignature(this.privateKey, bArr);
        } catch (CryptoException e) {
            throw new TlsFatalAlert((short) 80, e);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsCredentials
    public Certificate getCertificate() {
        return this.certificate;
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsSignerCredentials, org.spongycastle.crypto.tls.TlsSignerCredentials
    public SignatureAndHashAlgorithm getSignatureAndHashAlgorithm() {
        return this.signatureAndHashAlgorithm;
    }

    public DefaultTlsSignerCredentials(TlsContext tlsContext, Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
        this(tlsContext, certificate, asymmetricKeyParameter, null);
    }
}
