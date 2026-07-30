package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes3.dex */
public class AuthenticatedSafe extends ASN1Object {
    private ContentInfo[] info;
    private boolean isBer;

    private AuthenticatedSafe(ASN1Sequence aSN1Sequence) {
        this.isBer = true;
        this.info = new ContentInfo[aSN1Sequence.size()];
        int i = 0;
        while (true) {
            ContentInfo[] contentInfoArr = this.info;
            if (i == contentInfoArr.length) {
                this.isBer = aSN1Sequence instanceof BERSequence;
                return;
            } else {
                contentInfoArr[i] = ContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
                i++;
            }
        }
    }

    public static AuthenticatedSafe getInstance(Object obj) {
        if (obj instanceof AuthenticatedSafe) {
            return (AuthenticatedSafe) obj;
        }
        if (obj != null) {
            return new AuthenticatedSafe(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ContentInfo[] getContentInfo() {
        return this.info;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        int i = 0;
        while (true) {
            ContentInfo[] contentInfoArr = this.info;
            if (i == contentInfoArr.length) {
                break;
            }
            aSN1EncodableVector.add(contentInfoArr[i]);
            i++;
        }
        return this.isBer ? new BERSequence(aSN1EncodableVector) : new DLSequence(aSN1EncodableVector);
    }

    public AuthenticatedSafe(ContentInfo[] contentInfoArr) {
        this.isBer = true;
        this.info = contentInfoArr;
    }
}
