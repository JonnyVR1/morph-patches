package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
import p153l.f1j0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class TlsDHKeyExchange extends AbstractTlsKeyExchange {
    protected TlsAgreementCredentials agreementCredentials;
    protected DHPrivateKeyParameters dhAgreePrivateKey;
    protected DHPublicKeyParameters dhAgreePublicKey;
    protected DHParameters dhParameters;
    protected AsymmetricKeyParameter serverPublicKey;
    protected TlsSigner tlsSigner;

    public TlsDHKeyExchange(int i, Vector vector, DHParameters dHParameters) {
        super(i, vector);
        if (i == 3) {
            this.tlsSigner = new TlsDSSSigner();
        } else if (i == 5) {
            this.tlsSigner = new TlsRSASigner();
        } else {
            if (i != 7 && i != 9) {
                wg3.m206174a("unsupported key exchange algorithm");
                throw null;
            }
            this.tlsSigner = null;
        }
        this.dhParameters = dHParameters;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void generateClientKeyExchange(OutputStream outputStream) throws IOException {
        if (this.agreementCredentials == null) {
            this.dhAgreePrivateKey = TlsDHUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.dhParameters, outputStream);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generatePremasterSecret() throws IOException {
        TlsAgreementCredentials tlsAgreementCredentials = this.agreementCredentials;
        if (tlsAgreementCredentials != null) {
            return tlsAgreementCredentials.generateAgreement(this.dhAgreePublicKey);
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = this.dhAgreePrivateKey;
        if (dHPrivateKeyParameters != null) {
            return TlsDHUtils.calculateDHBasicAgreement(this.dhAgreePublicKey, dHPrivateKeyParameters);
        }
        f1j0.m123577a(80);
        return null;
    }

    public int getMinimumPrimeBits() {
        return 1024;
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void init(TlsContext tlsContext) {
        super.init(tlsContext);
        TlsSigner tlsSigner = this.tlsSigner;
        if (tlsSigner != null) {
            tlsSigner.init(tlsContext);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCertificate(Certificate certificate) throws IOException {
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) throws IOException {
        if (tlsCredentials instanceof TlsAgreementCredentials) {
            this.agreementCredentials = (TlsAgreementCredentials) tlsCredentials;
        } else {
            if (tlsCredentials instanceof TlsSignerCredentials) {
                return;
            }
            f1j0.m123577a(80);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientKeyExchange(InputStream inputStream) throws IOException {
        if (this.dhAgreePublicKey != null) {
            return;
        }
        this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(TlsDHUtils.readDHParameter(inputStream), this.dhParameters));
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(Certificate certificate) throws IOException {
        if (certificate.isEmpty()) {
            f1j0.m123577a(42);
            return;
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            this.serverPublicKey = asymmetricKeyParameterCreateKey;
            TlsSigner tlsSigner = this.tlsSigner;
            if (tlsSigner == null) {
                try {
                    DHPublicKeyParameters dHPublicKeyParametersValidateDHPublicKey = TlsDHUtils.validateDHPublicKey((DHPublicKeyParameters) asymmetricKeyParameterCreateKey);
                    this.dhAgreePublicKey = dHPublicKeyParametersValidateDHPublicKey;
                    this.dhParameters = validateDHParameters(dHPublicKeyParametersValidateDHPublicKey.getParameters());
                    TlsUtils.validateKeyUsage(certificateAt, 8);
                } catch (ClassCastException e) {
                    throw new TlsFatalAlert((short) 46, e);
                }
            } else {
                if (!tlsSigner.isValidPublicKey(asymmetricKeyParameterCreateKey)) {
                    f1j0.m123577a(46);
                    return;
                }
                TlsUtils.validateKeyUsage(certificateAt, 128);
            }
            super.processServerCertificate(certificate);
        } catch (RuntimeException e2) {
            throw new TlsFatalAlert((short) 43, e2);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public boolean requiresServerKeyExchange() {
        int i = this.keyExchange;
        return i == 3 || i == 5 || i == 11;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void skipServerCredentials() throws IOException {
        throw new TlsFatalAlert((short) 10);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) throws IOException {
        short[] certificateTypes = certificateRequest.getCertificateTypes();
        for (short s : certificateTypes) {
            if (s != 1 && s != 2 && s != 3 && s != 4 && s != 64) {
                f1j0.m123577a(47);
                return;
            }
        }
    }

    public DHParameters validateDHParameters(DHParameters dHParameters) throws IOException {
        if (dHParameters.getP().bitLength() >= getMinimumPrimeBits()) {
            return TlsDHUtils.validateDHParameters(dHParameters);
        }
        f1j0.m123577a(71);
        return null;
    }
}
