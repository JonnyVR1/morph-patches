package org.spongycastle.asn1.p132x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.math.p135ec.ECAlgorithms;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECPoint;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class X9ECParameters extends ASN1Object implements X9ObjectIdentifiers {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private ECCurve curve;
    private X9FieldID fieldID;

    /* JADX INFO: renamed from: g */
    private X9ECPoint f207244g;

    /* JADX INFO: renamed from: h */
    private BigInteger f207245h;

    /* JADX INFO: renamed from: n */
    private BigInteger f207246n;
    private byte[] seed;

    private X9ECParameters(ASN1Sequence aSN1Sequence) {
        if (!(aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) || !((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue().equals(ONE)) {
            wg3.m206174a("bad version in X9ECParameters");
            throw null;
        }
        X9Curve x9Curve = new X9Curve(X9FieldID.getInstance(aSN1Sequence.getObjectAt(1)), ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2)));
        this.curve = x9Curve.getCurve();
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(3);
        if (objectAt instanceof X9ECPoint) {
            this.f207244g = (X9ECPoint) objectAt;
        } else {
            this.f207244g = new X9ECPoint(this.curve, (ASN1OctetString) objectAt);
        }
        this.f207246n = ((ASN1Integer) aSN1Sequence.getObjectAt(4)).getValue();
        this.seed = x9Curve.getSeed();
        if (aSN1Sequence.size() == 6) {
            this.f207245h = ((ASN1Integer) aSN1Sequence.getObjectAt(5)).getValue();
        }
    }

    public static X9ECParameters getInstance(Object obj) {
        if (obj instanceof X9ECParameters) {
            return (X9ECParameters) obj;
        }
        if (obj != null) {
            return new X9ECParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X9ECPoint getBaseEntry() {
        return this.f207244g;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public X9Curve getCurveEntry() {
        return new X9Curve(this.curve, this.seed);
    }

    public X9FieldID getFieldIDEntry() {
        return this.fieldID;
    }

    public ECPoint getG() {
        return this.f207244g.getPoint();
    }

    public BigInteger getH() {
        return this.f207245h;
    }

    public BigInteger getN() {
        return this.f207246n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(ONE));
        aSN1EncodableVector.add(this.fieldID);
        aSN1EncodableVector.add(new X9Curve(this.curve, this.seed));
        aSN1EncodableVector.add(this.f207244g);
        aSN1EncodableVector.add(new ASN1Integer(this.f207246n));
        BigInteger bigInteger = this.f207245h;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, (BigInteger) null, (byte[]) null);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, x9ECPoint, bigInteger, bigInteger2, (byte[]) null);
    }

    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, (byte[]) null);
    }

    public X9ECParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(eCCurve, new X9ECPoint(eCPoint), bigInteger, bigInteger2, bArr);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f207244g = x9ECPoint;
        this.f207246n = bigInteger;
        this.f207245h = bigInteger2;
        this.seed = bArr;
        if (ECAlgorithms.isFpCurve(eCCurve)) {
            this.fieldID = new X9FieldID(eCCurve.getField().getCharacteristic());
            return;
        }
        if (ECAlgorithms.isF2mCurve(eCCurve)) {
            int[] exponentsPresent = ((PolynomialExtensionField) eCCurve.getField()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                this.fieldID = new X9FieldID(exponentsPresent[2], exponentsPresent[1]);
                return;
            } else if (exponentsPresent.length == 5) {
                this.fieldID = new X9FieldID(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
                return;
            } else {
                wg3.m206174a("Only trinomial and pentomial curves are supported");
                throw null;
            }
        }
        wg3.m206174a("'curve' is of an unsupported type");
        throw null;
    }
}
