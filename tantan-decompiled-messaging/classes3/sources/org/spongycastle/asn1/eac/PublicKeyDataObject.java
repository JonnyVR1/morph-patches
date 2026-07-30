package org.spongycastle.asn1.eac;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class PublicKeyDataObject extends ASN1Object {
    public static PublicKeyDataObject getInstance(Object obj) {
        if (obj instanceof PublicKeyDataObject) {
            return (PublicKeyDataObject) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        return ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0)).m9599on(EACObjectIdentifiers.id_TA_ECDSA) ? new ECDSAPublicKey(aSN1Sequence) : new RSAPublicKey(aSN1Sequence);
    }

    public abstract ASN1ObjectIdentifier getUsage();
}
