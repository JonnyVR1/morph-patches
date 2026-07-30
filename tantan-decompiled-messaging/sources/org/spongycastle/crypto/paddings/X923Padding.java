package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;
import p149l.dql;

/* JADX INFO: loaded from: classes3.dex */
public class X923Padding implements BlockCipherPadding {
    SecureRandom random = null;

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            SecureRandom secureRandom = this.random;
            if (secureRandom == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) secureRandom.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "X9.23";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
        this.random = secureRandom;
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i = bArr[bArr.length - 1] & 255;
        if (i <= bArr.length) {
            return i;
        }
        dql.m113082a("pad block corrupted");
        return 0;
    }
}
