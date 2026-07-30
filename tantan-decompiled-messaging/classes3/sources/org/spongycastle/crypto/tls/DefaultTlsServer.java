package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.agreement.DHStandardGroups;
import org.spongycastle.crypto.params.DHParameters;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class DefaultTlsServer extends AbstractTlsServer {
    public DefaultTlsServer() {
    }

    public TlsKeyExchange createDHEKeyExchange(int i) {
        return new TlsDHEKeyExchange(i, this.supportedSignatureAlgorithms, getDHParameters());
    }

    public TlsKeyExchange createDHKeyExchange(int i) {
        return new TlsDHKeyExchange(i, this.supportedSignatureAlgorithms, getDHParameters());
    }

    public TlsKeyExchange createECDHEKeyExchange(int i) {
        return new TlsECDHEKeyExchange(i, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    public TlsKeyExchange createECDHKeyExchange(int i) {
        return new TlsECDHKeyExchange(i, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    public TlsKeyExchange createRSAKeyExchange() {
        return new TlsRSAKeyExchange(this.supportedSignatureAlgorithms);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsServer
    public int[] getCipherSuites() {
        return new int[]{CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, 107, 103, 57, 51, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 61, 60, 53, 47};
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsCredentials getCredentials() throws IOException {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm == 1) {
            return getRSAEncryptionCredentials();
        }
        if (keyExchangeAlgorithm != 3) {
            if (keyExchangeAlgorithm != 5) {
                if (keyExchangeAlgorithm != 7) {
                    if (keyExchangeAlgorithm != 19) {
                        if (keyExchangeAlgorithm == 16 || keyExchangeAlgorithm == 17) {
                            return getECDSASignerCredentials();
                        }
                        csi0.m3424a(80);
                        return null;
                    }
                }
            }
            return getRSASignerCredentials();
        }
        return getDSASignerCredentials();
    }

    public DHParameters getDHParameters() {
        return DHStandardGroups.rfc5114_2048_256;
    }

    public TlsSignerCredentials getDSASignerCredentials() throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    public TlsSignerCredentials getECDSASignerCredentials() throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.TlsServer
    public TlsKeyExchange getKeyExchange() throws IOException {
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
        if (keyExchangeAlgorithm == 1) {
            return createRSAKeyExchange();
        }
        if (keyExchangeAlgorithm == 3 || keyExchangeAlgorithm == 5) {
            return createDHEKeyExchange(keyExchangeAlgorithm);
        }
        if (keyExchangeAlgorithm == 7 || keyExchangeAlgorithm == 9) {
            return createDHKeyExchange(keyExchangeAlgorithm);
        }
        switch (keyExchangeAlgorithm) {
            case 16:
            case 18:
                return createECDHKeyExchange(keyExchangeAlgorithm);
            case 17:
            case 19:
                return createECDHEKeyExchange(keyExchangeAlgorithm);
            default:
                csi0.m3424a(80);
                return null;
        }
    }

    public TlsEncryptionCredentials getRSAEncryptionCredentials() throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    public TlsSignerCredentials getRSASignerCredentials() throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    public DefaultTlsServer(TlsCipherFactory tlsCipherFactory) {
        super(tlsCipherFactory);
    }
}
