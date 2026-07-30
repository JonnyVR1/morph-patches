package com.guardsquare.dexguard.runtime.devicefingerprinting;

/* JADX INFO: loaded from: classes7.dex */
public class Fingerprint {

    /* JADX INFO: renamed from: ˋ */
    private static int f11730 = 1;

    /* JADX INFO: renamed from: ˏ */
    private static int f11731;

    /* JADX INFO: renamed from: ˎ */
    private final byte[] f11732;

    /* JADX INFO: renamed from: ॱ */
    private final boolean f11733;

    public Fingerprint(byte[] bArr, boolean z) {
        this.f11732 = bArr;
        this.f11733 = z;
    }

    public byte[] asBytes() {
        int i = f11730;
        int i2 = (((i | 53) << 1) - (i ^ 53)) % 128;
        f11731 = i2;
        byte[] bArr = this.f11732;
        int i3 = i2 + 25;
        f11730 = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public boolean isValid() {
        int i = (f11730 + 115) % 128;
        f11731 = i;
        boolean z = this.f11733;
        f11730 = ((i & 33) + (i | 33)) % 128;
        return z;
    }
}
