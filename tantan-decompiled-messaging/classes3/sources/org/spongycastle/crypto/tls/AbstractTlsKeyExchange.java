package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import l.qkq0;
import l.rkq0;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractTlsKeyExchange implements TlsKeyExchange {
    protected TlsContext context;
    protected int keyExchange;
    protected Vector supportedSignatureAlgorithms;

    public AbstractTlsKeyExchange(int i, Vector vector) {
        this.keyExchange = i;
        this.supportedSignatureAlgorithms = vector;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generateServerKeyExchange() throws IOException {
        if (!requiresServerKeyExchange()) {
            return null;
        }
        csi0.m3424a(80);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void init(TlsContext tlsContext) {
        this.context = tlsContext;
        ProtocolVersion clientVersion = tlsContext.getClientVersion();
        boolean zIsSignatureAlgorithmsExtensionAllowed = TlsUtils.isSignatureAlgorithmsExtensionAllowed(clientVersion);
        Vector vector = this.supportedSignatureAlgorithms;
        if (!zIsSignatureAlgorithmsExtensionAllowed) {
            if (vector == null) {
                return;
            }
            rkq0.a("supported_signature_algorithms not allowed for ", clientVersion);
            return;
        }
        if (vector == null) {
            int i = this.keyExchange;
            if (i != 1) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                switch (i) {
                                    case 13:
                                    case 14:
                                        break;
                                    case 15:
                                    case 18:
                                    case 19:
                                        break;
                                    case 16:
                                    case 17:
                                        this.supportedSignatureAlgorithms = TlsUtils.getDefaultECDSASignatureAlgorithms();
                                        break;
                                    default:
                                        switch (i) {
                                            case 21:
                                            case 24:
                                                break;
                                            case 22:
                                                break;
                                            case 23:
                                                break;
                                            default:
                                                qkq0.a("unsupported key exchange algorithm");
                                                break;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    }
                }
                this.supportedSignatureAlgorithms = TlsUtils.getDefaultDSSSignatureAlgorithms();
                return;
            }
            this.supportedSignatureAlgorithms = TlsUtils.getDefaultRSASignatureAlgorithms();
        }
    }

    public DigitallySigned parseSignature(InputStream inputStream) throws IOException {
        DigitallySigned digitallySigned = DigitallySigned.parse(this.context, inputStream);
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm != null) {
            TlsUtils.verifySupportedSignatureAlgorithm(this.supportedSignatureAlgorithms, algorithm);
        }
        return digitallySigned;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCertificate(Certificate certificate) throws IOException {
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientKeyExchange(InputStream inputStream) throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(Certificate certificate) throws IOException {
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCredentials(TlsCredentials tlsCredentials) throws IOException {
        processServerCertificate(tlsCredentials.getCertificate());
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(InputStream inputStream) throws IOException {
        if (requiresServerKeyExchange()) {
            return;
        }
        csi0.m3424a(10);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public boolean requiresServerKeyExchange() {
        return false;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void skipClientCredentials() throws IOException {
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void skipServerKeyExchange() throws IOException {
        if (requiresServerKeyExchange()) {
            csi0.m3424a(10);
        }
    }
}
