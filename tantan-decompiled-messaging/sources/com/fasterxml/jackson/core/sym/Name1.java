package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes6.dex */
public final class Name1 extends Name {
    private static final Name1 EMPTY = new Name1("", 0, 0);

    /* JADX INFO: renamed from: q */
    private final int f6878q;

    public Name1(String str, int i, int i2) {
        super(str, i);
        this.f6878q = i2;
    }

    public static Name1 getEmptyName() {
        return EMPTY;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 1 && iArr[0] == this.f6878q;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return i == this.f6878q && i2 == 0;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return i == this.f6878q;
    }
}
