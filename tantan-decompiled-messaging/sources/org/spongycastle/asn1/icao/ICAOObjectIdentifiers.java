package org.spongycastle.asn1.icao;

import com.tencent.connect.common.Constants;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes3.dex */
public interface ICAOObjectIdentifiers {
    public static final ASN1ObjectIdentifier id_icao;
    public static final ASN1ObjectIdentifier id_icao_aaProtocolObject;
    public static final ASN1ObjectIdentifier id_icao_cscaMasterList;
    public static final ASN1ObjectIdentifier id_icao_cscaMasterListSigningKey;
    public static final ASN1ObjectIdentifier id_icao_documentTypeList;
    public static final ASN1ObjectIdentifier id_icao_extensions;
    public static final ASN1ObjectIdentifier id_icao_extensions_namechangekeyrollover;
    public static final ASN1ObjectIdentifier id_icao_ldsSecurityObject;
    public static final ASN1ObjectIdentifier id_icao_mrtd;
    public static final ASN1ObjectIdentifier id_icao_mrtd_security;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.23.136");
        id_icao = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch("1");
        id_icao_mrtd = aSN1ObjectIdentifierBranch;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch2 = aSN1ObjectIdentifierBranch.branch("1");
        id_icao_mrtd_security = aSN1ObjectIdentifierBranch2;
        id_icao_ldsSecurityObject = aSN1ObjectIdentifierBranch2.branch("1");
        id_icao_cscaMasterList = aSN1ObjectIdentifierBranch2.branch("2");
        id_icao_cscaMasterListSigningKey = aSN1ObjectIdentifierBranch2.branch("3");
        id_icao_documentTypeList = aSN1ObjectIdentifierBranch2.branch("4");
        id_icao_aaProtocolObject = aSN1ObjectIdentifierBranch2.branch("5");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch3 = aSN1ObjectIdentifierBranch2.branch(Constants.VIA_SHARE_TYPE_INFO);
        id_icao_extensions = aSN1ObjectIdentifierBranch3;
        id_icao_extensions_namechangekeyrollover = aSN1ObjectIdentifierBranch3.branch("1");
    }
}
