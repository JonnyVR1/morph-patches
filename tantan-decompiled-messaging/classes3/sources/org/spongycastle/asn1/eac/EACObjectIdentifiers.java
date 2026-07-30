package org.spongycastle.asn1.eac;

import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface EACObjectIdentifiers {
    public static final ASN1ObjectIdentifier bsi_de;
    public static final ASN1ObjectIdentifier id_CA;
    public static final ASN1ObjectIdentifier id_CA_DH;
    public static final ASN1ObjectIdentifier id_CA_DH_3DES_CBC_CBC;
    public static final ASN1ObjectIdentifier id_CA_ECDH;
    public static final ASN1ObjectIdentifier id_CA_ECDH_3DES_CBC_CBC;
    public static final ASN1ObjectIdentifier id_EAC_ePassport;
    public static final ASN1ObjectIdentifier id_PK;
    public static final ASN1ObjectIdentifier id_PK_DH;
    public static final ASN1ObjectIdentifier id_PK_ECDH;
    public static final ASN1ObjectIdentifier id_TA;
    public static final ASN1ObjectIdentifier id_TA_ECDSA;
    public static final ASN1ObjectIdentifier id_TA_ECDSA_SHA_1;
    public static final ASN1ObjectIdentifier id_TA_ECDSA_SHA_224;
    public static final ASN1ObjectIdentifier id_TA_ECDSA_SHA_256;
    public static final ASN1ObjectIdentifier id_TA_ECDSA_SHA_384;
    public static final ASN1ObjectIdentifier id_TA_ECDSA_SHA_512;
    public static final ASN1ObjectIdentifier id_TA_RSA;
    public static final ASN1ObjectIdentifier id_TA_RSA_PSS_SHA_1;
    public static final ASN1ObjectIdentifier id_TA_RSA_PSS_SHA_256;
    public static final ASN1ObjectIdentifier id_TA_RSA_PSS_SHA_512;
    public static final ASN1ObjectIdentifier id_TA_RSA_v1_5_SHA_1;
    public static final ASN1ObjectIdentifier id_TA_RSA_v1_5_SHA_256;
    public static final ASN1ObjectIdentifier id_TA_RSA_v1_5_SHA_512;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("0.4.0.127.0.7");
        bsi_de = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch("2.2.1");
        id_PK = aSN1ObjectIdentifierBranch;
        id_PK_DH = aSN1ObjectIdentifierBranch.branch("1");
        id_PK_ECDH = aSN1ObjectIdentifierBranch.branch("2");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch2 = aSN1ObjectIdentifier.branch("2.2.3");
        id_CA = aSN1ObjectIdentifierBranch2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch3 = aSN1ObjectIdentifierBranch2.branch("1");
        id_CA_DH = aSN1ObjectIdentifierBranch3;
        id_CA_DH_3DES_CBC_CBC = aSN1ObjectIdentifierBranch3.branch("1");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch4 = aSN1ObjectIdentifierBranch2.branch("2");
        id_CA_ECDH = aSN1ObjectIdentifierBranch4;
        id_CA_ECDH_3DES_CBC_CBC = aSN1ObjectIdentifierBranch4.branch("1");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch5 = aSN1ObjectIdentifier.branch("2.2.2");
        id_TA = aSN1ObjectIdentifierBranch5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch6 = aSN1ObjectIdentifierBranch5.branch("1");
        id_TA_RSA = aSN1ObjectIdentifierBranch6;
        id_TA_RSA_v1_5_SHA_1 = aSN1ObjectIdentifierBranch6.branch("1");
        id_TA_RSA_v1_5_SHA_256 = aSN1ObjectIdentifierBranch6.branch("2");
        id_TA_RSA_PSS_SHA_1 = aSN1ObjectIdentifierBranch6.branch("3");
        id_TA_RSA_PSS_SHA_256 = aSN1ObjectIdentifierBranch6.branch("4");
        id_TA_RSA_v1_5_SHA_512 = aSN1ObjectIdentifierBranch6.branch("5");
        id_TA_RSA_PSS_SHA_512 = aSN1ObjectIdentifierBranch6.branch("6");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch7 = aSN1ObjectIdentifierBranch5.branch("2");
        id_TA_ECDSA = aSN1ObjectIdentifierBranch7;
        id_TA_ECDSA_SHA_1 = aSN1ObjectIdentifierBranch7.branch("1");
        id_TA_ECDSA_SHA_224 = aSN1ObjectIdentifierBranch7.branch("2");
        id_TA_ECDSA_SHA_256 = aSN1ObjectIdentifierBranch7.branch("3");
        id_TA_ECDSA_SHA_384 = aSN1ObjectIdentifierBranch7.branch("4");
        id_TA_ECDSA_SHA_512 = aSN1ObjectIdentifierBranch7.branch("5");
        id_EAC_ePassport = aSN1ObjectIdentifier.branch("3.1.2.1");
    }
}
