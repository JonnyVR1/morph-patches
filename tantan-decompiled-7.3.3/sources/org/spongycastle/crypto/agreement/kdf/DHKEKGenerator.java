package org.spongycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Pack;
import p153l.tyk0;
import p153l.wg3;
import p153l.yg3;

/* JADX INFO: loaded from: classes3.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;

    /* JADX INFO: renamed from: z */
    private byte[] f207262z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        if (bArr.length - i3 < i5) {
            tyk0.m193596a("output buffer too small");
            return 0;
        }
        long j = i3;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            wg3.m206174a("Output length too large");
            return 0;
        }
        long j2 = digestSize;
        int i6 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i7 = 0;
        int i8 = 1;
        while (true) {
            Digest digest = this.digest;
            if (i7 >= i6) {
                digest.reset();
                return (int) j;
            }
            byte[] bArr3 = this.f207262z;
            digest.update(bArr3, i4, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i8)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, new DEROctetString(this.partyAInfo)));
            }
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i3 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i5, digestSize);
                    i5 += digestSize;
                    i3 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i5, i3);
                }
                i8++;
                i7++;
                i4 = 0;
            } catch (IOException e) {
                yg3.m215829a("unable to encode parameter info: ", e.getMessage());
                return 0;
            }
        }
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f207262z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
