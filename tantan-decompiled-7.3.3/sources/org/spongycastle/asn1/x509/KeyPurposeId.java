package org.spongycastle.asn1.x509;

import com.tencent.connect.common.Constants;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes3.dex */
public class KeyPurposeId extends ASN1Object {
    public static final KeyPurposeId anyExtendedKeyUsage;
    private static final ASN1ObjectIdentifier id_kp;
    public static final KeyPurposeId id_kp_OCSPSigning;
    public static final KeyPurposeId id_kp_capwapAC;
    public static final KeyPurposeId id_kp_capwapWTP;
    public static final KeyPurposeId id_kp_clientAuth;
    public static final KeyPurposeId id_kp_codeSigning;
    public static final KeyPurposeId id_kp_dvcs;
    public static final KeyPurposeId id_kp_eapOverLAN;
    public static final KeyPurposeId id_kp_eapOverPPP;
    public static final KeyPurposeId id_kp_emailProtection;
    public static final KeyPurposeId id_kp_ipsecEndSystem;
    public static final KeyPurposeId id_kp_ipsecIKE;
    public static final KeyPurposeId id_kp_ipsecTunnel;
    public static final KeyPurposeId id_kp_ipsecUser;
    public static final KeyPurposeId id_kp_sbgpCertAAServerAuth;
    public static final KeyPurposeId id_kp_scvpClient;
    public static final KeyPurposeId id_kp_scvpServer;
    public static final KeyPurposeId id_kp_scvp_responder;
    public static final KeyPurposeId id_kp_serverAuth;
    public static final KeyPurposeId id_kp_smartcardlogon;
    public static final KeyPurposeId id_kp_timeStamping;

    /* JADX INFO: renamed from: id */
    private ASN1ObjectIdentifier f207223id;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.3");
        id_kp = aSN1ObjectIdentifier;
        anyExtendedKeyUsage = new KeyPurposeId(Extension.extendedKeyUsage.branch("0"));
        id_kp_serverAuth = new KeyPurposeId(aSN1ObjectIdentifier.branch("1"));
        id_kp_clientAuth = new KeyPurposeId(aSN1ObjectIdentifier.branch("2"));
        id_kp_codeSigning = new KeyPurposeId(aSN1ObjectIdentifier.branch("3"));
        id_kp_emailProtection = new KeyPurposeId(aSN1ObjectIdentifier.branch("4"));
        id_kp_ipsecEndSystem = new KeyPurposeId(aSN1ObjectIdentifier.branch("5"));
        id_kp_ipsecTunnel = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_SHARE_TYPE_INFO));
        id_kp_ipsecUser = new KeyPurposeId(aSN1ObjectIdentifier.branch("7"));
        id_kp_timeStamping = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO));
        id_kp_OCSPSigning = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_SHARE_TYPE_MINI_PROGRAM));
        id_kp_dvcs = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ));
        id_kp_sbgpCertAAServerAuth = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE));
        id_kp_scvp_responder = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_SET_AVATAR));
        id_kp_eapOverPPP = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_JOININ_GROUP));
        id_kp_eapOverLAN = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_MAKE_FRIEND));
        id_kp_scvpServer = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_WPA_STATE));
        id_kp_scvpClient = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_START_WAP));
        id_kp_ipsecIKE = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_REPORT_TYPE_START_GROUP));
        id_kp_capwapAC = new KeyPurposeId(aSN1ObjectIdentifier.branch("18"));
        id_kp_capwapWTP = new KeyPurposeId(aSN1ObjectIdentifier.branch(Constants.VIA_ACT_TYPE_NINETEEN));
        id_kp_smartcardlogon = new KeyPurposeId(new ASN1ObjectIdentifier("1.3.6.1.4.1.311.20.2.2"));
    }

    public KeyPurposeId(String str) {
        this(new ASN1ObjectIdentifier(str));
    }

    public static KeyPurposeId getInstance(Object obj) {
        if (obj instanceof KeyPurposeId) {
            return (KeyPurposeId) obj;
        }
        if (obj != null) {
            return new KeyPurposeId(ASN1ObjectIdentifier.getInstance(obj));
        }
        return null;
    }

    public String getId() {
        return this.f207223id.getId();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f207223id;
    }

    public ASN1ObjectIdentifier toOID() {
        return this.f207223id;
    }

    public String toString() {
        return this.f207223id.toString();
    }

    private KeyPurposeId(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f207223id = aSN1ObjectIdentifier;
    }
}
