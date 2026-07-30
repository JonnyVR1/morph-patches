package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TlsAgreementCredentials extends TlsCredentials {
    byte[] generateAgreement(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException;
}
