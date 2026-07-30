package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.RSAKeyParameters;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTlsEncryptionCredentials extends AbstractTlsEncryptionCredentials {
    protected Certificate certificate;
    protected TlsContext context;
    protected AsymmetricKeyParameter privateKey;

    public DefaultTlsEncryptionCredentials(TlsContext tlsContext, Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
        if (certificate == null) {
            wg3.m206174a("'certificate' cannot be null");
            throw null;
        }
        if (certificate.isEmpty()) {
            wg3.m206174a("'certificate' cannot be empty");
            throw null;
        }
        if (asymmetricKeyParameter == null) {
            wg3.m206174a("'privateKey' cannot be null");
            throw null;
        }
        if (!asymmetricKeyParameter.isPrivate()) {
            wg3.m206174a("'privateKey' must be private");
            throw null;
        }
        if (!(asymmetricKeyParameter instanceof RSAKeyParameters)) {
            wg3.m206174a("'privateKey' type not supported: ".concat(asymmetricKeyParameter.getClass().getName()));
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
