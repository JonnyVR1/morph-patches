package com.tencent.liteav.basic.license;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.tencent.liteav.basic.license.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14200h {

    /* JADX INFO: renamed from: a */
    public static final byte[] f59292a = "#PART#".getBytes();

    /* JADX INFO: renamed from: a */
    public static byte[] m84145a(byte[] bArr, byte[] bArr2) throws Exception {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2));
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        cipher.init(2, privateKeyGeneratePrivate);
        return cipher.doFinal(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[LOOP:2: B:32:0x0072->B:33:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0065, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public static byte[] m84146b(byte[] bArr, byte[] bArr2) throws Exception {
        boolean z;
        int i;
        int length = f59292a.length;
        if (length <= 0) {
            return m84145a(bArr, bArr2);
        }
        int length2 = bArr.length;
        ArrayList arrayList = new ArrayList(1024);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            byte b = bArr[i3];
            if (i3 == length2 - 1) {
                int i5 = length2 - i4;
                byte[] bArr3 = new byte[i5];
                System.arraycopy(bArr, i4, bArr3, 0, i5);
                byte[] bArrM84145a = m84145a(bArr3, bArr2);
                for (byte b2 : bArrM84145a) {
                    arrayList.add(Byte.valueOf(b2));
                }
                i4 = i3 + length;
                i3 = i4 - 1;
            } else {
                if (b == f59292a[0]) {
                    if (length <= 1) {
                        z = true;
                    } else if (i3 + length < length2) {
                        z = false;
                        for (int i6 = 1; i6 < length && f59292a[i6] == bArr[i3 + i6]; i6++) {
                            if (i6 == length - 1) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    int i7 = i3 - i4;
                    byte[] bArr4 = new byte[i7];
                    System.arraycopy(bArr, i4, bArr4, 0, i7);
                    byte[] bArrM84145a2 = m84145a(bArr4, bArr2);
                    for (byte b3 : bArrM84145a2) {
                        arrayList.add(Byte.valueOf(b3));
                    }
                    int i8 = i3 + length;
                    i4 = i8;
                    i3 = i8 - 1;
                }
                i3++;
            }
            z = false;
            if (z) {
                int i9 = i3 - i4;
                byte[] bArr5 = new byte[i9];
                System.arraycopy(bArr, i4, bArr5, 0, i9);
                byte[] bArrM84145a3 = m84145a(bArr5, bArr2);
                while (i < r6) {
                    arrayList.add(Byte.valueOf(b3));
                }
                int i10 = i3 + length;
                i4 = i10;
                i3 = i10 - 1;
            }
            i3++;
        }
        byte[] bArr6 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr6[i2] = ((Byte) it.next()).byteValue();
            i2++;
        }
        return bArr6;
    }
}
