package org.spongycastle.crypto.tls;

import java.math.BigInteger;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.agreement.DHBasicAgreement;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.util.BigIntegers;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTlsAgreementCredentials extends AbstractTlsAgreementCredentials {
    protected BasicAgreement basicAgreement;
    protected Certificate certificate;
    protected AsymmetricKeyParameter privateKey;
    protected boolean truncateAgreement;

    public DefaultTlsAgreementCredentials(Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
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
        if (asymmetricKeyParameter instanceof DHPrivateKeyParameters) {
            this.basicAgreement = new DHBasicAgreement();
            this.truncateAgreement = true;
        } else {
            if (!(asymmetricKeyParameter instanceof ECPrivateKeyParameters)) {
                wg3.m206174a("'privateKey' type not supported: ".concat(asymmetricKeyParameter.getClass().getName()));
                throw null;
            }
            this.basicAgreement = new ECDHBasicAgreement();
            this.truncateAgreement = false;
        }
        this.certificate = certificate;
        this.privateKey = asymmetricKeyParameter;
    }

    @Override // org.spongycastle.crypto.tls.TlsAgreementCredentials
    public byte[] generateAgreement(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.basicAgreement.init(this.privateKey);
        BigInteger bigIntegerCalculateAgreement = this.basicAgreement.calculateAgreement(asymmetricKeyParameter);
        return this.truncateAgreement ? BigIntegers.asUnsignedByteArray(bigIntegerCalculateAgreement) : BigIntegers.asUnsignedByteArray(this.basicAgreement.getFieldSize(), bigIntegerCalculateAgreement);
    }

    @Override // org.spongycastle.crypto.tls.TlsCredentials
    public Certificate getCertificate() {
        return this.certificate;
    }
}
