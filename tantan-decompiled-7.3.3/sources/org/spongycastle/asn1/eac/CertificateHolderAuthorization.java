package org.spongycastle.asn1.eac;

import java.io.IOException;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERApplicationSpecific;
import org.spongycastle.util.Integers;
import p153l.wg3;
import p153l.ypg0;

/* JADX INFO: loaded from: classes3.dex */
public class CertificateHolderAuthorization extends ASN1Object {
    public static final int CVCA = 192;
    public static final int DV_DOMESTIC = 128;
    public static final int DV_FOREIGN = 64;

    /* JADX INFO: renamed from: IS */
    public static final int f207171IS = 0;
    public static final int RADG3 = 1;
    public static final int RADG4 = 2;
    DERApplicationSpecific accessRights;
    ASN1ObjectIdentifier oid;
    public static final ASN1ObjectIdentifier id_role_EAC = EACObjectIdentifiers.bsi_de.branch("3.1.2.1");
    static Hashtable RightsDecodeMap = new Hashtable();
    static BidirectionalMap AuthorizationRole = new BidirectionalMap();
    static Hashtable ReverseMap = new Hashtable();

    static {
        RightsDecodeMap.put(Integers.valueOf(2), "RADG4");
        RightsDecodeMap.put(Integers.valueOf(1), "RADG3");
        AuthorizationRole.put(Integers.valueOf(192), "CVCA");
        AuthorizationRole.put(Integers.valueOf(128), "DV_DOMESTIC");
        AuthorizationRole.put(Integers.valueOf(64), "DV_FOREIGN");
        AuthorizationRole.put(Integers.valueOf(0), "IS");
    }

    public CertificateHolderAuthorization(DERApplicationSpecific dERApplicationSpecific) throws IOException {
        if (dERApplicationSpecific.getApplicationTag() == 76) {
            setPrivateData(new ASN1InputStream(dERApplicationSpecific.getContents()));
        }
    }

    public static int getFlag(String str) {
        Integer num = (Integer) AuthorizationRole.getReverse(str);
        if (num != null) {
            return num.intValue();
        }
        ypg0.m217021a("Unknown value ", str);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getRoleDescription(int i) {
        return (String) AuthorizationRole.get(Integers.valueOf(i));
    }

    private void setAccessRights(byte b) {
        this.accessRights = new DERApplicationSpecific(EACTags.getTag(83), new byte[]{b});
    }

    private void setOid(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.oid = aSN1ObjectIdentifier;
    }

    private void setPrivateData(ASN1InputStream aSN1InputStream) throws IOException {
        ASN1Primitive object = aSN1InputStream.readObject();
        if (!(object instanceof ASN1ObjectIdentifier)) {
            wg3.m206174a("no Oid in CerticateHolderAuthorization");
            return;
        }
        this.oid = (ASN1ObjectIdentifier) object;
        ASN1Primitive object2 = aSN1InputStream.readObject();
        if (object2 instanceof DERApplicationSpecific) {
            this.accessRights = (DERApplicationSpecific) object2;
        } else {
            wg3.m206174a("No access rights in CerticateHolderAuthorization");
        }
    }

    public int getAccessRights() {
        return this.accessRights.getContents()[0] & 255;
    }

    public ASN1ObjectIdentifier getOid() {
        return this.oid;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.oid);
        aSN1EncodableVector.add(this.accessRights);
        return new DERApplicationSpecific(76, aSN1EncodableVector);
    }

    public CertificateHolderAuthorization(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) throws IOException {
        setOid(aSN1ObjectIdentifier);
        setAccessRights((byte) i);
    }
}
