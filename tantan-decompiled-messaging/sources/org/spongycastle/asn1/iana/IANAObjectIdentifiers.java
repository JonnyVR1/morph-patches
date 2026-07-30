package org.spongycastle.asn1.iana;

import com.tencent.connect.common.Constants;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes3.dex */
public interface IANAObjectIdentifiers {
    public static final ASN1ObjectIdentifier SNMPv2;
    public static final ASN1ObjectIdentifier _private;
    public static final ASN1ObjectIdentifier directory;
    public static final ASN1ObjectIdentifier experimental;
    public static final ASN1ObjectIdentifier hmacMD5;
    public static final ASN1ObjectIdentifier hmacRIPEMD160;
    public static final ASN1ObjectIdentifier hmacSHA1;
    public static final ASN1ObjectIdentifier hmacTIGER;
    public static final ASN1ObjectIdentifier internet;
    public static final ASN1ObjectIdentifier ipsec;
    public static final ASN1ObjectIdentifier isakmpOakley;
    public static final ASN1ObjectIdentifier mail;
    public static final ASN1ObjectIdentifier mgmt;
    public static final ASN1ObjectIdentifier pkix;
    public static final ASN1ObjectIdentifier security;
    public static final ASN1ObjectIdentifier security_mechanisms;
    public static final ASN1ObjectIdentifier security_nametypes;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1");
        internet = aSN1ObjectIdentifier;
        directory = aSN1ObjectIdentifier.branch("1");
        mgmt = aSN1ObjectIdentifier.branch("2");
        experimental = aSN1ObjectIdentifier.branch("3");
        _private = aSN1ObjectIdentifier.branch("4");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch("5");
        security = aSN1ObjectIdentifierBranch;
        SNMPv2 = aSN1ObjectIdentifier.branch(Constants.VIA_SHARE_TYPE_INFO);
        mail = aSN1ObjectIdentifier.branch("7");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch2 = aSN1ObjectIdentifierBranch.branch("5");
        security_mechanisms = aSN1ObjectIdentifierBranch2;
        security_nametypes = aSN1ObjectIdentifierBranch.branch(Constants.VIA_SHARE_TYPE_INFO);
        pkix = aSN1ObjectIdentifierBranch2.branch(Constants.VIA_SHARE_TYPE_INFO);
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch3 = aSN1ObjectIdentifierBranch2.branch(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
        ipsec = aSN1ObjectIdentifierBranch3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch4 = aSN1ObjectIdentifierBranch3.branch("1");
        isakmpOakley = aSN1ObjectIdentifierBranch4;
        hmacMD5 = aSN1ObjectIdentifierBranch4.branch("1");
        hmacSHA1 = aSN1ObjectIdentifierBranch4.branch("2");
        hmacTIGER = aSN1ObjectIdentifierBranch4.branch("3");
        hmacRIPEMD160 = aSN1ObjectIdentifierBranch4.branch("4");
    }
}
