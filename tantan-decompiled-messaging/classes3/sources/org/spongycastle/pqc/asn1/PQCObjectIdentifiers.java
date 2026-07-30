package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.pqc.crypto.gmss.GMSSKeyPairGenerator;
import org.spongycastle.pqc.crypto.mceliece.McElieceCCA2KeyPairGenerator;
import org.spongycastle.pqc.crypto.mceliece.McEliecePKCSCipher;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface PQCObjectIdentifiers {
    public static final ASN1ObjectIdentifier gmss;
    public static final ASN1ObjectIdentifier gmssWithSha1;
    public static final ASN1ObjectIdentifier gmssWithSha224;
    public static final ASN1ObjectIdentifier gmssWithSha256;
    public static final ASN1ObjectIdentifier gmssWithSha384;
    public static final ASN1ObjectIdentifier gmssWithSha512;
    public static final ASN1ObjectIdentifier mcEliece;
    public static final ASN1ObjectIdentifier mcElieceCca2;
    public static final ASN1ObjectIdentifier rainbow;
    public static final ASN1ObjectIdentifier rainbowWithSha1;
    public static final ASN1ObjectIdentifier rainbowWithSha224;
    public static final ASN1ObjectIdentifier rainbowWithSha256;
    public static final ASN1ObjectIdentifier rainbowWithSha384;
    public static final ASN1ObjectIdentifier rainbowWithSha512;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.4.1.8301.3.1.3.5.3.2");
        rainbow = aSN1ObjectIdentifier;
        rainbowWithSha1 = aSN1ObjectIdentifier.branch("1");
        rainbowWithSha224 = aSN1ObjectIdentifier.branch("2");
        rainbowWithSha256 = aSN1ObjectIdentifier.branch("3");
        rainbowWithSha384 = aSN1ObjectIdentifier.branch("4");
        rainbowWithSha512 = aSN1ObjectIdentifier.branch("5");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(GMSSKeyPairGenerator.OID);
        gmss = aSN1ObjectIdentifier2;
        gmssWithSha1 = aSN1ObjectIdentifier2.branch("1");
        gmssWithSha224 = aSN1ObjectIdentifier2.branch("2");
        gmssWithSha256 = aSN1ObjectIdentifier2.branch("3");
        gmssWithSha384 = aSN1ObjectIdentifier2.branch("4");
        gmssWithSha512 = aSN1ObjectIdentifier2.branch("5");
        mcEliece = new ASN1ObjectIdentifier(McEliecePKCSCipher.OID);
        mcElieceCca2 = new ASN1ObjectIdentifier(McElieceCCA2KeyPairGenerator.OID);
    }
}
