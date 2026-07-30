package org.spongycastle.asn1.bsi;

import com.tencent.connect.common.Constants;
import com.tencent.wcdb.BuildConfig;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes3.dex */
public interface BSIObjectIdentifiers {
    public static final ASN1ObjectIdentifier bsi_de;
    public static final ASN1ObjectIdentifier ecdsa_plain_RIPEMD160;
    public static final ASN1ObjectIdentifier ecdsa_plain_SHA1;
    public static final ASN1ObjectIdentifier ecdsa_plain_SHA224;
    public static final ASN1ObjectIdentifier ecdsa_plain_SHA256;
    public static final ASN1ObjectIdentifier ecdsa_plain_SHA384;
    public static final ASN1ObjectIdentifier ecdsa_plain_SHA512;
    public static final ASN1ObjectIdentifier ecdsa_plain_signatures;
    public static final ASN1ObjectIdentifier id_ecc;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("0.4.0.127.0.7");
        bsi_de = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch(BuildConfig.VERSION_NAME);
        id_ecc = aSN1ObjectIdentifierBranch;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch2 = aSN1ObjectIdentifierBranch.branch("4.1");
        ecdsa_plain_signatures = aSN1ObjectIdentifierBranch2;
        ecdsa_plain_SHA1 = aSN1ObjectIdentifierBranch2.branch("1");
        ecdsa_plain_SHA224 = aSN1ObjectIdentifierBranch2.branch("2");
        ecdsa_plain_SHA256 = aSN1ObjectIdentifierBranch2.branch("3");
        ecdsa_plain_SHA384 = aSN1ObjectIdentifierBranch2.branch("4");
        ecdsa_plain_SHA512 = aSN1ObjectIdentifierBranch2.branch("5");
        ecdsa_plain_RIPEMD160 = aSN1ObjectIdentifierBranch2.branch(Constants.VIA_SHARE_TYPE_INFO);
    }
}
