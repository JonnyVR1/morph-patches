package com.guardsquare.dexguard.runtime.devicefingerprinting;

/* JADX INFO: loaded from: classes7.dex */
public class Fingerprint {

    /* JADX INFO: renamed from: ˋ */
    private static int f11767 = 1;

    /* JADX INFO: renamed from: ˏ */
    private static int f11768;

    /* JADX INFO: renamed from: ˎ */
    private final byte[] f11769;

    /* JADX INFO: renamed from: ॱ */
    private final boolean f11770;

    public Fingerprint(byte[] bArr, boolean z) {
        this.f11769 = bArr;
        this.f11770 = z;
    }

    public byte[] asBytes() {
        int i = f11767;
        int i2 = (((i | 53) << 1) - (i ^ 53)) % 128;
        f11768 = i2;
        byte[] bArr = this.f11769;
        int i3 = i2 + 25;
        f11767 = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public boolean isValid() {
        int i = (f11767 + 115) % 128;
        f11768 = i;
        boolean z = this.f11770;
        f11767 = ((i & 33) + (i | 33)) % 128;
        return z;
    }
}
