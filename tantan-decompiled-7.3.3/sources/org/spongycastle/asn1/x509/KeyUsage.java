package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERBitString;

/* JADX INFO: loaded from: classes3.dex */
public class KeyUsage extends ASN1Object {
    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;
    private DERBitString bitString;

    public KeyUsage(int i) {
        this.bitString = new DERBitString(i);
    }

    public static KeyUsage fromExtensions(Extensions extensions) {
        return getInstance(extensions.getExtensionParsedValue(Extension.keyUsage));
    }

    public static KeyUsage getInstance(Object obj) {
        if (obj instanceof KeyUsage) {
            return (KeyUsage) obj;
        }
        if (obj != null) {
            return new KeyUsage(DERBitString.getInstance(obj));
        }
        return null;
    }

    public byte[] getBytes() {
        return this.bitString.getBytes();
    }

    public int getPadBits() {
        return this.bitString.getPadBits();
    }

    public boolean hasUsages(int i) {
        return (this.bitString.intValue() & i) == i;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.bitString;
    }

    public String toString() {
        byte[] bytes = this.bitString.getBytes();
        if (bytes.length == 1) {
            return "KeyUsage: 0x" + Integer.toHexString(bytes[0] & 255);
        }
        return "KeyUsage: 0x" + Integer.toHexString((bytes[0] & 255) | ((bytes[1] & 255) << 8));
    }

    private KeyUsage(DERBitString dERBitString) {
        this.bitString = dERBitString;
    }
}
