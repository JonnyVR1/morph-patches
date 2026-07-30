package org.spongycastle.crypto.util;

import l.qkq0;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class DERMacData {
    private final byte[] macData;

    /* JADX INFO: renamed from: org.spongycastle.crypto.util.DERMacData$1 */
    public static /* synthetic */ class C10691 {
        static final /* synthetic */ int[] $SwitchMap$org$spongycastle$crypto$util$DERMacData$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$org$spongycastle$crypto$util$DERMacData$Type = iArr;
            try {
                iArr[Type.UNILATERALU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$spongycastle$crypto$util$DERMacData$Type[Type.BILATERALU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$spongycastle$crypto$util$DERMacData$Type[Type.UNILATERALV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$spongycastle$crypto$util$DERMacData$Type[Type.BILATERALV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
        private ASN1OctetString ephemDataU;
        private ASN1OctetString ephemDataV;
        private ASN1OctetString idU;
        private ASN1OctetString idV;
        private byte[] text;
        private final Type type;

        public Builder(Type type, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.type = type;
            this.idU = DerUtil.getOctetString(bArr);
            this.idV = DerUtil.getOctetString(bArr2);
            this.ephemDataU = DerUtil.getOctetString(bArr3);
            this.ephemDataV = DerUtil.getOctetString(bArr4);
        }

        private byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            return Arrays.concatenate(Arrays.concatenate(bArr, bArr2, bArr3), Arrays.concatenate(bArr4, bArr5, bArr6));
        }

        public DERMacData build() {
            int i = C10691.$SwitchMap$org$spongycastle$crypto$util$DERMacData$Type[this.type.ordinal()];
            C10691 c10691 = null;
            if (i == 1 || i == 2) {
                return new DERMacData(concatenate(this.type.getHeader(), DerUtil.toByteArray(this.idU), DerUtil.toByteArray(this.idV), DerUtil.toByteArray(this.ephemDataU), DerUtil.toByteArray(this.ephemDataV), this.text), c10691);
            }
            if (i == 3 || i == 4) {
                return new DERMacData(concatenate(this.type.getHeader(), DerUtil.toByteArray(this.idV), DerUtil.toByteArray(this.idU), DerUtil.toByteArray(this.ephemDataV), DerUtil.toByteArray(this.ephemDataU), this.text), c10691);
            }
            qkq0.a("Unknown type encountered in build");
            return null;
        }

        public Builder withText(byte[] bArr) {
            this.text = DerUtil.toByteArray(new DERTaggedObject(false, 0, DerUtil.getOctetString(bArr)));
            return this;
        }
    }

    public enum Type {
        UNILATERALU("KC_1_U"),
        UNILATERALV("KC_1_V"),
        BILATERALU("KC_2_U"),
        BILATERALV("KC_2_V");

        private final String enc;

        Type(String str) {
            this.enc = str;
        }

        public byte[] getHeader() {
            return Strings.toByteArray(this.enc);
        }
    }

    private DERMacData(byte[] bArr) {
        this.macData = bArr;
    }

    public byte[] getMacData() {
        return Arrays.clone(this.macData);
    }

    public /* synthetic */ DERMacData(byte[] bArr, C10691 c10691) {
        this(bArr);
    }
}
