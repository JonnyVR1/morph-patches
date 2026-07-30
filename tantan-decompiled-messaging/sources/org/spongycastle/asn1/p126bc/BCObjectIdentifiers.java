package org.spongycastle.asn1.p126bc;

import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes3.dex */
public interface BCObjectIdentifiers {

    /* JADX INFO: renamed from: bc */
    public static final ASN1ObjectIdentifier f206234bc;
    public static final ASN1ObjectIdentifier bc_pbe;
    public static final ASN1ObjectIdentifier bc_pbe_sha1;
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12;
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12_aes128_cbc;
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12_aes192_cbc;
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12_aes256_cbc;
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs5;
    public static final ASN1ObjectIdentifier bc_pbe_sha224;
    public static final ASN1ObjectIdentifier bc_pbe_sha256;
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12;
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12_aes128_cbc;
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12_aes192_cbc;
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12_aes256_cbc;
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs5;
    public static final ASN1ObjectIdentifier bc_pbe_sha384;
    public static final ASN1ObjectIdentifier bc_pbe_sha512;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.4.1.22554");
        f206234bc = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch("1");
        bc_pbe = aSN1ObjectIdentifierBranch;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch2 = aSN1ObjectIdentifierBranch.branch("1");
        bc_pbe_sha1 = aSN1ObjectIdentifierBranch2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch3 = aSN1ObjectIdentifierBranch.branch("2.1");
        bc_pbe_sha256 = aSN1ObjectIdentifierBranch3;
        bc_pbe_sha384 = aSN1ObjectIdentifierBranch.branch("2.2");
        bc_pbe_sha512 = aSN1ObjectIdentifierBranch.branch("2.3");
        bc_pbe_sha224 = aSN1ObjectIdentifierBranch.branch("2.4");
        bc_pbe_sha1_pkcs5 = aSN1ObjectIdentifierBranch2.branch("1");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch4 = aSN1ObjectIdentifierBranch2.branch("2");
        bc_pbe_sha1_pkcs12 = aSN1ObjectIdentifierBranch4;
        bc_pbe_sha256_pkcs5 = aSN1ObjectIdentifierBranch3.branch("1");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch5 = aSN1ObjectIdentifierBranch3.branch("2");
        bc_pbe_sha256_pkcs12 = aSN1ObjectIdentifierBranch5;
        bc_pbe_sha1_pkcs12_aes128_cbc = aSN1ObjectIdentifierBranch4.branch("1.2");
        bc_pbe_sha1_pkcs12_aes192_cbc = aSN1ObjectIdentifierBranch4.branch("1.22");
        bc_pbe_sha1_pkcs12_aes256_cbc = aSN1ObjectIdentifierBranch4.branch("1.42");
        bc_pbe_sha256_pkcs12_aes128_cbc = aSN1ObjectIdentifierBranch5.branch("1.2");
        bc_pbe_sha256_pkcs12_aes192_cbc = aSN1ObjectIdentifierBranch5.branch("1.22");
        bc_pbe_sha256_pkcs12_aes256_cbc = aSN1ObjectIdentifierBranch5.branch("1.42");
    }
}
