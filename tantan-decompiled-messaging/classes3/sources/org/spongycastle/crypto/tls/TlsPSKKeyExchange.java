package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import l.ig3;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.p013io.Streams;
import p003l.csi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TlsPSKKeyExchange extends AbstractTlsKeyExchange {
    protected short[] clientECPointFormats;
    protected DHPrivateKeyParameters dhAgreePrivateKey;
    protected DHPublicKeyParameters dhAgreePublicKey;
    protected DHParameters dhParameters;
    protected ECPrivateKeyParameters ecAgreePrivateKey;
    protected ECPublicKeyParameters ecAgreePublicKey;
    protected int[] namedCurves;
    protected byte[] premasterSecret;
    protected byte[] psk;
    protected TlsPSKIdentity pskIdentity;
    protected TlsPSKIdentityManager pskIdentityManager;
    protected byte[] psk_identity_hint;
    protected RSAKeyParameters rsaServerPublicKey;
    protected TlsEncryptionCredentials serverCredentials;
    protected short[] serverECPointFormats;
    protected AsymmetricKeyParameter serverPublicKey;

    public TlsPSKKeyExchange(int i, Vector vector, TlsPSKIdentity tlsPSKIdentity, TlsPSKIdentityManager tlsPSKIdentityManager, DHParameters dHParameters, int[] iArr, short[] sArr, short[] sArr2) {
        super(i, vector);
        this.psk_identity_hint = null;
        this.psk = null;
        this.dhAgreePrivateKey = null;
        this.dhAgreePublicKey = null;
        this.ecAgreePrivateKey = null;
        this.ecAgreePublicKey = null;
        this.serverPublicKey = null;
        this.rsaServerPublicKey = null;
        this.serverCredentials = null;
        if (i != 24) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    ig3.a("unsupported key exchange algorithm");
                    throw null;
            }
        }
        this.pskIdentity = tlsPSKIdentity;
        this.pskIdentityManager = tlsPSKIdentityManager;
        this.dhParameters = dHParameters;
        this.namedCurves = iArr;
        this.clientECPointFormats = sArr;
        this.serverECPointFormats = sArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void generateClientKeyExchange(OutputStream outputStream) throws IOException {
        byte[] bArr = this.psk_identity_hint;
        TlsPSKIdentity tlsPSKIdentity = this.pskIdentity;
        if (bArr == null) {
            tlsPSKIdentity.skipIdentityHint();
        } else {
            tlsPSKIdentity.notifyIdentityHint(bArr);
        }
        byte[] pSKIdentity = this.pskIdentity.getPSKIdentity();
        if (pSKIdentity == null) {
            csi0.m3424a(80);
            return;
        }
        byte[] psk = this.pskIdentity.getPSK();
        this.psk = psk;
        if (psk == null) {
            csi0.m3424a(80);
            return;
        }
        TlsUtils.writeOpaque16(pSKIdentity, outputStream);
        this.context.getSecurityParameters().pskIdentity = Arrays.clone(pSKIdentity);
        int i = this.keyExchange;
        if (i == 14) {
            this.dhAgreePrivateKey = TlsDHUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.dhParameters, outputStream);
        } else if (i == 24) {
            this.ecAgreePrivateKey = TlsECCUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.serverECPointFormats, this.ecAgreePublicKey.getParameters(), outputStream);
        } else if (i == 15) {
            this.premasterSecret = TlsRSAUtils.generateEncryptedPreMasterSecret(this.context, this.rsaServerPublicKey, outputStream);
        }
    }

    public byte[] generateOtherSecret(int i) throws IOException {
        int i2 = this.keyExchange;
        if (i2 == 14) {
            DHPrivateKeyParameters dHPrivateKeyParameters = this.dhAgreePrivateKey;
            if (dHPrivateKeyParameters != null) {
                return TlsDHUtils.calculateDHBasicAgreement(this.dhAgreePublicKey, dHPrivateKeyParameters);
            }
            csi0.m3424a(80);
            return null;
        }
        if (i2 != 24) {
            return i2 == 15 ? this.premasterSecret : new byte[i];
        }
        ECPrivateKeyParameters eCPrivateKeyParameters = this.ecAgreePrivateKey;
        if (eCPrivateKeyParameters != null) {
            return TlsECCUtils.calculateECDHBasicAgreement(this.ecAgreePublicKey, eCPrivateKeyParameters);
        }
        csi0.m3424a(80);
        return null;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generatePremasterSecret() throws IOException {
        byte[] bArrGenerateOtherSecret = generateOtherSecret(this.psk.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArrGenerateOtherSecret.length + 4 + this.psk.length);
        TlsUtils.writeOpaque16(bArrGenerateOtherSecret, byteArrayOutputStream);
        TlsUtils.writeOpaque16(this.psk, byteArrayOutputStream);
        Arrays.fill(this.psk, (byte) 0);
        this.psk = null;
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public byte[] generateServerKeyExchange() throws IOException {
        byte[] hint = this.pskIdentityManager.getHint();
        this.psk_identity_hint = hint;
        if (hint == null && !requiresServerKeyExchange()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = this.psk_identity_hint;
        if (bArr == null) {
            TlsUtils.writeOpaque16(TlsUtils.EMPTY_BYTES, byteArrayOutputStream);
        } else {
            TlsUtils.writeOpaque16(bArr, byteArrayOutputStream);
        }
        int i = this.keyExchange;
        if (i == 14) {
            if (this.dhParameters == null) {
                csi0.m3424a(80);
                return null;
            }
            this.dhAgreePrivateKey = TlsDHUtils.generateEphemeralServerKeyExchange(this.context.getSecureRandom(), this.dhParameters, byteArrayOutputStream);
        } else if (i == 24) {
            this.ecAgreePrivateKey = TlsECCUtils.generateEphemeralServerKeyExchange(this.context.getSecureRandom(), this.namedCurves, this.clientECPointFormats, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientCredentials(TlsCredentials tlsCredentials) throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processClientKeyExchange(InputStream inputStream) throws IOException {
        byte[] opaque16 = TlsUtils.readOpaque16(inputStream);
        byte[] psk = this.pskIdentityManager.getPSK(opaque16);
        this.psk = psk;
        if (psk == null) {
            csi0.m3424a(EACTags.DISCRETIONARY_DATA_OBJECTS);
            return;
        }
        this.context.getSecurityParameters().pskIdentity = opaque16;
        int i = this.keyExchange;
        if (i == 14) {
            this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(TlsDHUtils.readDHParameter(inputStream), this.dhParameters));
            return;
        }
        if (i == 24) {
            this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey(TlsECCUtils.deserializeECPublicKey(this.serverECPointFormats, this.ecAgreePrivateKey.getParameters(), TlsUtils.readOpaque8(inputStream)));
        } else if (i == 15) {
            this.premasterSecret = this.serverCredentials.decryptPreMasterSecret(TlsUtils.isSSL(this.context) ? Streams.readAll(inputStream) : TlsUtils.readOpaque16(inputStream));
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(Certificate certificate) throws IOException {
        if (this.keyExchange != 15) {
            csi0.m3424a(10);
            return;
        }
        if (certificate.isEmpty()) {
            csi0.m3424a(42);
            return;
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter asymmetricKeyParameterCreateKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            this.serverPublicKey = asymmetricKeyParameterCreateKey;
            if (asymmetricKeyParameterCreateKey.isPrivate()) {
                csi0.m3424a(80);
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
            csi0.m3424a(80);
        } else {
            processServerCertificate(tlsCredentials.getCertificate());
            this.serverCredentials = (TlsEncryptionCredentials) tlsCredentials;
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(InputStream inputStream) throws IOException {
        this.psk_identity_hint = TlsUtils.readOpaque16(inputStream);
        int i = this.keyExchange;
        if (i == 14) {
            DHPublicKeyParameters dHPublicKeyParametersValidateDHPublicKey = TlsDHUtils.validateDHPublicKey(ServerDHParams.parse(inputStream).getPublicKey());
            this.dhAgreePublicKey = dHPublicKeyParametersValidateDHPublicKey;
            this.dhParameters = dHPublicKeyParametersValidateDHPublicKey.getParameters();
        } else if (i == 24) {
            this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey(TlsECCUtils.deserializeECPublicKey(this.clientECPointFormats, TlsECCUtils.readECParameters(this.namedCurves, this.clientECPointFormats, inputStream), TlsUtils.readOpaque8(inputStream)));
        }
    }

    @Override // org.spongycastle.crypto.tls.AbstractTlsKeyExchange, org.spongycastle.crypto.tls.TlsKeyExchange
    public boolean requiresServerKeyExchange() {
        int i = this.keyExchange;
        return i == 14 || i == 24;
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void skipServerCredentials() throws IOException {
        if (this.keyExchange != 15) {
            return;
        }
        csi0.m3424a(10);
    }

    @Override // org.spongycastle.crypto.tls.TlsKeyExchange
    public void validateCertificateRequest(CertificateRequest certificateRequest) throws IOException {
        throw new TlsFatalAlert((short) 10);
    }

    public RSAKeyParameters validateRSAPublicKey(RSAKeyParameters rSAKeyParameters) throws IOException {
        if (rSAKeyParameters.getExponent().isProbablePrime(2)) {
            return rSAKeyParameters;
        }
        csi0.m3424a(47);
        return null;
    }
}
