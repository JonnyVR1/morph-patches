package com.fasterxml.jackson.core.sym;

import java.util.Arrays;
import p153l.fig0;

/* JADX INFO: loaded from: classes6.dex */
public final class NameN extends Name {

    /* JADX INFO: renamed from: q */
    private final int[] f6921q;

    /* JADX INFO: renamed from: q1 */
    private final int f6922q1;

    /* JADX INFO: renamed from: q2 */
    private final int f6923q2;

    /* JADX INFO: renamed from: q3 */
    private final int f6924q3;

    /* JADX INFO: renamed from: q4 */
    private final int f6925q4;
    private final int qlen;

    public NameN(String str, int i, int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        super(str, i);
        this.f6922q1 = i2;
        this.f6923q2 = i3;
        this.f6924q3 = i4;
        this.f6925q4 = i5;
        this.f6921q = iArr;
        this.qlen = i6;
    }

    private final boolean _equals2(int[] iArr) {
        int i = this.qlen - 4;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2 + 4] != this.f6921q[i2]) {
                return false;
            }
        }
        return true;
    }

    public static NameN construct(String str, int i, int[] iArr, int i2) {
        if (i2 >= 4) {
            return new NameN(str, i, iArr[0], iArr[1], iArr[2], iArr[3], i2 + (-4) > 0 ? Arrays.copyOfRange(iArr, 4, i2) : null, i2);
        }
        fig0.m125680a();
        return null;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        if (i != this.qlen || iArr[0] != this.f6922q1 || iArr[1] != this.f6923q2 || iArr[2] != this.f6924q3 || iArr[3] != this.f6925q4) {
            return false;
        }
        switch (i) {
            case 8:
                if (iArr[7] != this.f6921q[3]) {
                    return false;
                }
            case 7:
                if (iArr[6] != this.f6921q[2]) {
                    return false;
                }
            case 6:
                if (iArr[5] != this.f6921q[1]) {
                    return false;
                }
            case 5:
                if (iArr[4] != this.f6921q[0]) {
                    return false;
                }
            case 4:
                return true;
            default:
                return _equals2(iArr);
        }
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
