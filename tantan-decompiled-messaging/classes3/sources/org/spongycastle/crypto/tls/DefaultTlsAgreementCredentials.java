package org.spongycastle.crypto.tls;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.agreement.DHBasicAgreement;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.util.BigIntegers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DefaultTlsAgreementCredentials extends AbstractTlsAgreementCredentials {
    protected BasicAgreement basicAgreement;
    protected Certificate certificate;
    protected AsymmetricKeyParameter privateKey;
    protected boolean truncateAgreement;

    public DefaultTlsAgreementCredentials(Certificate certificate, AsymmetricKeyParameter asymmetricKeyParameter) {
        if (certificate == null) {
            ig3.a("'certificate' cannot be null");
            throw null;
        }
        if (certificate.isEmpty()) {
            ig3.a("'certificate' cannot be empty");
            throw null;
        }
        if (asymmetricKeyParameter == null) {
            ig3.a("'privateKey' cannot be null");
            throw null;
        }
        if (!asymmetricKeyParameter.isPrivate()) {
            ig3.a("'privateKey' must be private");
            throw null;
        }
        if (asymmetricKeyParameter instanceof DHPrivateKeyParameters) {
            this.basicAgreement = new DHBasicAgreement();
            this.truncateAgreement = true;
        } else {
            if (!(asymmetricKeyParameter instanceof ECPrivateKeyParameters)) {
                ig3.a("'privateKey' type not supported: ".concat(asymmetricKeyParameter.getClass().getName()));
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
