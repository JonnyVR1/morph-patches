package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;
import p153l.psl;

/* JADX INFO: loaded from: classes3.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = -128;
        while (true) {
            i++;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = 0;
        }
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // org.spongycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == -128) {
            return bArr.length - length;
        }
        psl.m173659a("pad block corrupted");
        return 0;
    }
}
