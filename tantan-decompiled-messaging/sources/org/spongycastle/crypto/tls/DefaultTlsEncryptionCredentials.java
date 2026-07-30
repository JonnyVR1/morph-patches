package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.RSAKeyParameters;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTlsEncryptionCredentials extends AbstractTlsEncryptionCredentials {
    protected Certificate certificate;
    protected TlsContext context;
    protected AsymmetricKeyParameter privateKey;

    public DefaultTlsEncryptionCredentials(TlsContext tlsContext, Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
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
        if (!(asymmetricKeyParameter instanceof RSAKeyParameters)) {
            ig3.m135964a("'privateKey' type not supported: ".concat(asymmetricKeyParameter.getClass().getName()));
            throw null;
        }
        this.context = tlsContext;
        this.certificate = certificate;
        this.privateKey = asymmetricKeyParameter;
    }

    @Override // org.spongycastle.crypto.tls.TlsEncryptionCredentials
    public byte[] decryptPreMasterSecret(byte[] bArr) throws IOException {
        return TlsRSAUtils.safeDecryptPreMasterSecret(this.context, (RSAKeyParameters) this.privateKey, bArr);
    }

    @Override // org.spongycastle.crypto.tls.TlsCredentials
    public Certificate getCertificate() {
        return this.certificate;
    }
}
