package org.spongycastle.asn1.icao;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class LDSSecurityObject extends ASN1Object implements ICAOObjectIdentifiers {
    public static final int ub_DataGroups = 16;
    private DataGroupHash[] datagroupHash;
    private AlgorithmIdentifier digestAlgorithmIdentifier;
    private ASN1Integer version;
    private LDSVersionInfo versionInfo;

    private LDSSecurityObject(ASN1Sequence aSN1Sequence) {
        this.version = new ASN1Integer(0L);
        if (aSN1Sequence == null || aSN1Sequence.size() == 0) {
            wg3.m206174a("null or empty sequence passed.");
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.version = ASN1Integer.getInstance(objects.nextElement());
        this.digestAlgorithmIdentifier = AlgorithmIdentifier.getInstance(objects.nextElement());
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(objects.nextElement());
        if (this.version.getValue().intValue() == 1) {
            this.versionInfo = LDSVersionInfo.getInstance(objects.nextElement());
        }
        checkDatagroupHashSeqSize(aSN1Sequence2.size());
        this.datagroupHash = new DataGroupHash[aSN1Sequence2.size()];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            this.datagroupHash[i] = DataGroupHash.getInstance(aSN1Sequence2.getObjectAt(i));
        }
    }

    private void checkDatagroupHashSeqSize(int i) {
        if (i < 2 || i > 16) {
            wg3.m206174a("wrong size in DataGroupHashValues : not in (2..16)");
        }
    }

    public static LDSSecurityObject getInstance(Object obj) {
        if (obj instanceof LDSSecurityObject) {
            return (LDSSecurityObject) obj;
        }
        if (obj != null) {
            return new LDSSecurityObject(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DataGroupHash[] getDatagroupHash() {
        return this.datagroupHash;
    }

    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.digestAlgorithmIdentifier;
    }

    public int getVersion() {
        return this.version.getValue().intValue();
    }

    public LDSVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(this.digestAlgorithmIdentifier);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i = 0;
        while (true) {
            DataGroupHash[] dataGroupHashArr = this.datagroupHash;
            if (i >= dataGroupHashArr.length) {
                break;
            }
            aSN1EncodableVector2.add(dataGroupHashArr[i]);
            i++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        LDSVersionInfo lDSVersionInfo = this.versionInfo;
        if (lDSVersionInfo != null) {
            aSN1EncodableVector.add(lDSVersionInfo);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public LDSSecurityObject(AlgorithmIdentifier algorithmIdentifier, DataGroupHash[] dataGroupHashArr) {
        this.version = new ASN1Integer(0L);
        this.version = new ASN1Integer(0L);
        this.digestAlgorithmIdentifier = algorithmIdentifier;
        this.datagroupHash = dataGroupHashArr;
        checkDatagroupHashSeqSize(dataGroupHashArr.length);
    }

    public LDSSecurityObject(AlgorithmIdentifier algorithmIdentifier, DataGroupHash[] dataGroupHashArr, LDSVersionInfo lDSVersionInfo) {
        this.version = new ASN1Integer(0L);
        this.version = new ASN1Integer(1L);
        this.digestAlgorithmIdentifier = algorithmIdentifier;
        this.datagroupHash = dataGroupHashArr;
        this.versionInfo = lDSVersionInfo;
        checkDatagroupHashSeqSize(dataGroupHashArr.length);
    }
}
