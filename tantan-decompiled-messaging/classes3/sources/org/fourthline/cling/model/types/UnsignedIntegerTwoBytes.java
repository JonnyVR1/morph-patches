package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class UnsignedIntegerTwoBytes extends UnsignedVariableInteger {
    public UnsignedIntegerTwoBytes(long j) throws NumberFormatException {
        super(j);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits getBits() {
        return UnsignedVariableInteger.Bits.SIXTEEN;
    }

    public UnsignedIntegerTwoBytes(String str) throws NumberFormatException {
        super(str);
    }
}
