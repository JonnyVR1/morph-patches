package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import p153l.f1j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractTlsClient extends AbstractTlsPeer implements TlsClient {
    protected TlsCipherFactory cipherFactory;
    protected short[] clientECPointFormats;
    protected TlsClientContext context;
    protected int[] namedCurves;
    protected int selectedCipherSuite;
    protected short selectedCompressionMethod;
    protected short[] serverECPointFormats;
    protected Vector supportedSignatureAlgorithms;

    public AbstractTlsClient() {
        this(new DefaultTlsCipherFactory());
    }

    public boolean allowUnexpectedServerExtension(Integer num, byte[] bArr) throws IOException {
        if (num.intValue() != 10) {
            return false;
        }
        TlsECCUtils.readSupportedEllipticCurvesExtension(bArr);
        return true;
    }

    public void checkForUnexpectedServerExtension(Hashtable hashtable, Integer num) throws IOException {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, num);
        if (extensionData == null || allowUnexpectedServerExtension(num, extensionData)) {
            return;
        }
        f1j0.m123577a(47);
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public TlsCipher getCipher() throws IOException {
        return this.cipherFactory.createCipher(this.context, TlsUtils.getEncryptionAlgorithm(this.selectedCipherSuite), TlsUtils.getMACAlgorithm(this.selectedCipherSuite));
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public Hashtable getClientExtensions() throws IOException {
        Hashtable hashtableEnsureExtensionsInitialised = null;
        if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(this.context.getClientVersion())) {
            this.supportedSignatureAlgorithms = TlsUtils.getDefaultSupportedSignatureAlgorithms();
            hashtableEnsureExtensionsInitialised = TlsExtensionsUtils.ensureExtensionsInitialised(null);
            TlsUtils.addSignatureAlgorithmsExtension(hashtableEnsureExtensionsInitialised, this.supportedSignatureAlgorithms);
        }
        if (!TlsECCUtils.containsECCCipherSuites(getCipherSuites())) {
            return hashtableEnsureExtensionsInitialised;
        }
        this.namedCurves = new int[]{23, 24};
        this.clientECPointFormats = new short[]{0, 1, 2};
        Hashtable hashtableEnsureExtensionsInitialised2 = TlsExtensionsUtils.ensureExtensionsInitialised(hashtableEnsureExtensionsInitialised);
        TlsECCUtils.addSupportedEllipticCurvesExtension(hashtableEnsureExtensionsInitialised2, this.namedCurves);
        TlsECCUtils.addSupportedPointFormatsExtension(hashtableEnsureExtensionsInitialised2, this.clientECPointFormats);
        return hashtableEnsureExtensionsInitialised2;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public ProtocolVersion getClientHelloRecordLayerVersion() {
        return getClientVersion();
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public Vector getClientSupplementalData() throws IOException {
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public ProtocolVersion getClientVersion() {
        return ProtocolVersion.TLSv12;
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public TlsCompression getCompression() throws IOException {
        if (this.selectedCompressionMethod == 0) {
            return new TlsNullCompression();
        }
        f1j0.m123577a(80);
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public short[] getCompressionMethods() {
        return new short[]{0};
    }

    public ProtocolVersion getMinimumVersion() {
        return ProtocolVersion.TLSv10;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public TlsSession getSessionToResume() {
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void init(TlsClientContext tlsClientContext) {
        this.context = tlsClientContext;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public boolean isFallback() {
        return false;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void notifyNewSessionTicket(NewSessionTicket newSessionTicket) throws IOException {
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void notifySelectedCipherSuite(int i) {
        this.selectedCipherSuite = i;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void notifySelectedCompressionMethod(short s) {
        this.selectedCompressionMethod = s;
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void notifyServerVersion(ProtocolVersion protocolVersion) throws IOException {
        if (getMinimumVersion().isEqualOrEarlierVersionOf(protocolVersion)) {
            return;
        }
        f1j0.m123577a(70);
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void notifySessionID(byte[] bArr) {
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void processServerExtensions(Hashtable hashtable) throws IOException {
        if (hashtable != null) {
            checkForUnexpectedServerExtension(hashtable, TlsUtils.EXT_signature_algorithms);
            checkForUnexpectedServerExtension(hashtable, TlsECCUtils.EXT_elliptic_curves);
            if (TlsECCUtils.isECCCipherSuite(this.selectedCipherSuite)) {
                this.serverECPointFormats = TlsECCUtils.getSupportedPointFormatsExtension(hashtable);
            } else {
                checkForUnexpectedServerExtension(hashtable, TlsECCUtils.EXT_ec_point_formats);
            }
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public void processServerSupplementalData(Vector vector) throws IOException {
        if (vector == null) {
            return;
        }
        f1j0.m123577a(10);
    }

    public AbstractTlsClient(TlsCipherFactory tlsCipherFactory) {
        this.cipherFactory = tlsCipherFactory;
    }
}
