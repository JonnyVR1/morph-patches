package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes6.dex */
public final class Name3 extends Name {

    /* JADX INFO: renamed from: q1 */
    private final int f6918q1;

    /* JADX INFO: renamed from: q2 */
    private final int f6919q2;

    /* JADX INFO: renamed from: q3 */
    private final int f6920q3;

    public Name3(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.f6918q1 = i2;
        this.f6919q2 = i3;
        this.f6920q3 = i4;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.f6918q1 && iArr[1] == this.f6919q2 && iArr[2] == this.f6920q3;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }
}
