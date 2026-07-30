package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes6.dex */
public final class Name2 extends Name {

    /* JADX INFO: renamed from: q1 */
    private final int f6879q1;

    /* JADX INFO: renamed from: q2 */
    private final int f6880q2;

    public Name2(String str, int i, int i2, int i3) {
        super(str, i);
        this.f6879q1 = i2;
        this.f6880q2 = i3;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.f6879q1 && iArr[1] == this.f6880q2;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return i == this.f6879q1 && i2 == this.f6880q2;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }
}
