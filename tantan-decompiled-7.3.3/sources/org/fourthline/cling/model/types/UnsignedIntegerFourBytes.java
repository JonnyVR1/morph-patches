package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsignedIntegerFourBytes extends UnsignedVariableInteger {
    public UnsignedIntegerFourBytes(long j) throws NumberFormatException {
        super(j);
    }

    @Override // org.fourthline.cling.model.types.UnsignedVariableInteger
    public UnsignedVariableInteger.Bits getBits() {
        return UnsignedVariableInteger.Bits.THIRTYTWO;
    }

    public UnsignedIntegerFourBytes(String str) throws NumberFormatException {
        super(str);
    }
}
