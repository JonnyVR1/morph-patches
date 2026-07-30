package org.spongycastle.crypto.tls;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class UseSRTPData {
    protected byte[] mki;
    protected int[] protectionProfiles;

    public UseSRTPData(int[] iArr, byte[] bArr) {
        if (iArr == null || iArr.length < 1 || iArr.length >= 32768) {
            ig3.a("'protectionProfiles' must have length from 1 to (2^15 - 1)");
            throw null;
        }
        if (bArr == null) {
            bArr = TlsUtils.EMPTY_BYTES;
        } else if (bArr.length > 255) {
            ig3.a("'mki' cannot be longer than 255 bytes");
            throw null;
        }
        this.protectionProfiles = iArr;
        this.mki = bArr;
    }

    public byte[] getMki() {
        return this.mki;
    }

    public int[] getProtectionProfiles() {
        return this.protectionProfiles;
    }
}
