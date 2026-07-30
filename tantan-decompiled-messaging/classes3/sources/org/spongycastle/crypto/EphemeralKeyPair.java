package org.spongycastle.crypto;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EphemeralKeyPair {
    private AsymmetricCipherKeyPair keyPair;
    private KeyEncoder publicKeyEncoder;

    public EphemeralKeyPair(AsymmetricCipherKeyPair asymmetricCipherKeyPair, KeyEncoder keyEncoder) {
        this.keyPair = asymmetricCipherKeyPair;
        this.publicKeyEncoder = keyEncoder;
    }

    public byte[] getEncodedPublicKey() {
        return this.publicKeyEncoder.getEncoded(this.keyPair.getPublic());
    }

    public AsymmetricCipherKeyPair getKeyPair() {
        return this.keyPair;
    }
}
