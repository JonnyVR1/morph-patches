package org.spongycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BiometricData extends ASN1Object {
    private ASN1OctetString biometricDataHash;
    private AlgorithmIdentifier hashAlgorithm;
    private DERIA5String sourceDataUri;
    private TypeOfBiometricData typeOfBiometricData;

    private BiometricData(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.typeOfBiometricData = TypeOfBiometricData.getInstance(objects.nextElement());
        this.hashAlgorithm = AlgorithmIdentifier.getInstance(objects.nextElement());
        this.biometricDataHash = ASN1OctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.sourceDataUri = DERIA5String.getInstance(objects.nextElement());
        }
    }

    public static BiometricData getInstance(Object obj) {
        if (obj instanceof BiometricData) {
            return (BiometricData) obj;
        }
        if (obj != null) {
            return new BiometricData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getBiometricDataHash() {
        return this.biometricDataHash;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public DERIA5String getSourceDataUri() {
        return this.sourceDataUri;
    }

    public TypeOfBiometricData getTypeOfBiometricData() {
        return this.typeOfBiometricData;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.typeOfBiometricData);
        aSN1EncodableVector.add(this.hashAlgorithm);
        aSN1EncodableVector.add(this.biometricDataHash);
        DERIA5String dERIA5String = this.sourceDataUri;
        if (dERIA5String != null) {
            aSN1EncodableVector.add(dERIA5String);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public BiometricData(TypeOfBiometricData typeOfBiometricData, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString, DERIA5String dERIA5String) {
        this.typeOfBiometricData = typeOfBiometricData;
        this.hashAlgorithm = algorithmIdentifier;
        this.biometricDataHash = aSN1OctetString;
        this.sourceDataUri = dERIA5String;
    }

    public BiometricData(TypeOfBiometricData typeOfBiometricData, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.typeOfBiometricData = typeOfBiometricData;
        this.hashAlgorithm = algorithmIdentifier;
        this.biometricDataHash = aSN1OctetString;
        this.sourceDataUri = null;
    }
}
