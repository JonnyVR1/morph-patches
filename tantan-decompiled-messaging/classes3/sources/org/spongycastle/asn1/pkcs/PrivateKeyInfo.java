package org.spongycastle.asn1.pkcs;

import java.io.IOException;
import java.util.Enumeration;
import l.ig3;
import l.qkq0;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PrivateKeyInfo extends ASN1Object {
    private AlgorithmIdentifier algId;
    private ASN1Set attributes;
    private ASN1OctetString privKey;

    public PrivateKeyInfo(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        if (((ASN1Integer) objects.nextElement()).getValue().intValue() != 0) {
            ig3.a("wrong version for private key info");
            throw null;
        }
        this.algId = AlgorithmIdentifier.getInstance(objects.nextElement());
        this.privKey = ASN1OctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.attributes = ASN1Set.getInstance((ASN1TaggedObject) objects.nextElement(), false);
        }
    }

    public static PrivateKeyInfo getInstance(Object obj) {
        if (obj instanceof PrivateKeyInfo) {
            return (PrivateKeyInfo) obj;
        }
        if (obj != null) {
            return new PrivateKeyInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getAlgorithmId() {
        return this.algId;
    }

    public ASN1Set getAttributes() {
        return this.attributes;
    }

    public ASN1Primitive getPrivateKey() {
        try {
            return parsePrivateKey().toASN1Primitive();
        } catch (IOException unused) {
            qkq0.a("unable to parse private key");
            return null;
        }
    }

    public AlgorithmIdentifier getPrivateKeyAlgorithm() {
        return this.algId;
    }

    public ASN1Encodable parsePrivateKey() throws IOException {
        return ASN1Primitive.fromByteArray(this.privKey.getOctets());
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(0L));
        aSN1EncodableVector.add(this.algId);
        aSN1EncodableVector.add(this.privKey);
        if (this.attributes != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.attributes));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static PrivateKeyInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable, ASN1Set aSN1Set) throws IOException {
        this.privKey = new DEROctetString(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        this.algId = algorithmIdentifier;
        this.attributes = aSN1Set;
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) throws IOException {
        this(algorithmIdentifier, aSN1Encodable, null);
    }
}
