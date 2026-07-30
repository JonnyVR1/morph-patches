package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.p132io.Streams;
import p149l.csi0;

/* JADX INFO: loaded from: classes3.dex */
public class TlsRSAKeyExchange extends AbstractTlsKeyExchange {
    protected byte[] premasterSecret;
    protected RSAKeyParameters rsaServerPublicKey;
    protected TlsEncryptionCredentials serverCredentials;
    protected AsymmetricKeyParameter serverPublicKey;

    public TlsRSAKeyExchange(Vector vector) {
        super(1, vector);
        this.serverPublicKey = null;
        this.rsaServerPublicKey = null;
        this.serverCredentials = null;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void generateClientKeyExchange(OutputStream outputStream) throws IOException {
        this.premasterSecret = TlsRSAUtils.generateEncryptedPreMasterSecret(this.context, this.rsaServerPublicKey, outputStream);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generatePremasterSecret() throws IOException {
        byte[] bArr = this.premasterSecret;
        if (bArr != null) {
            this.premasterSecret = null;
            return bArr;
        }
        csi0.m108512a(80);
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) throws IOException {
        if (tlsCredentials instanceof TlsSignerCredentials) {
            return;
        }
        csi0.m108512a(80);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientKeyExchange(InputStream inputStream) throws IOException {
        this.premasterSecret = this.serverCredentials.decryptPreMasterSecret(TlsUtils.isSSL(this.context) ? Streams.readAll(inputStream) : TlsUtils.readOpaque16(inputStream));
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(Certificate certificate) throws IOException {
        if (certificate.isEmpty()) {
            csi0.m108512a(42);
            return;
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            this.serverPublicKey = asymmetricKeyParameterCreateKey;
            if (asymmetricKeyParameterCreateKey.isPrivate()) {
                csi0.m108512a(80);
                return;
            }
            this.rsaServerPublicKey = validateRSAPublicKey((RSAKeyParameters) this.serverPublicKey);
            TlsUtils.validateKeyUsage(certificateAt, 32);
            super.processServerCertificate(certificate);
        } catch (RuntimeException e) {
            throw new TlsFatalAlert((short) 43, e);
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCredentials(TlsCredentials tlsCredentials) throws IOException {
        if (!(tlsCredentials instanceof TlsEncryptionCredentials)) {
            csi0.m108512a(80);
        } else {
            processServerCertificate(tlsCredentials.getCertificate());
            this.serverCredentials = (TlsEncryptionCredentials) tlsCredentials;
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void skipServerCredentials() throws IOException {
        throw new TlsFatalAlert((short) 10);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) throws IOException {
        short[] certificateTypes = certificateRequest.getCertificateTypes();
        for (short s : certificateTypes) {
            if (s != 1 && s != 2 && s != 64) {
                csi0.m108512a(47);
                return;
            }
        }
    }

    public RSAKeyParameters validateRSAPublicKey(RSAKeyParameters rSAKeyParameters) throws IOException {
        if (rSAKeyParameters.getExponent().isProbablePrime(2)) {
            return rSAKeyParameters;
        }
        csi0.m108512a(47);
        return null;
    }
}
