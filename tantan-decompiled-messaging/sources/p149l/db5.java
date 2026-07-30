package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class db5 extends mh50 {

    /* JADX INFO: renamed from: a */
    public static final int[][] f85294a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* JADX INFO: renamed from: g */
    public static int m110641g(m03 m03Var, int[] iArr, int i) throws NotFoundException {
        mh50.m154610e(m03Var, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = f85294a;
            if (i3 >= iArr2.length) {
                break;
            }
            float fM154609d = mh50.m154609d(iArr, iArr2[i3], 0.7f);
            if (fM154609d < f) {
                i2 = i3;
                f = fM154609d;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: h */
    public static int[] m110642h(m03 m03Var) throws NotFoundException {
        int iM152494m = m03Var.m152494m();
        int iM152492k = m03Var.m152492k(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i = 0;
        int i2 = iM152492k;
        while (iM152492k < iM152494m) {
            if (m03Var.m152490f(iM152492k) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = 0.25f;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float fM154609d = mh50.m154609d(iArr, f85294a[i4], 0.7f);
                        if (fM154609d < f) {
                            i3 = i4;
                            f = fM154609d;
                        }
                    }
                    if (i3 >= 0 && m03Var.m152496o(Math.max(0, i2 - ((iM152492k - i2) / 2)), i2, false)) {
                        return new int[]{i2, iM152492k, i3};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i5 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            iM152492k++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0167  */
    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0176  */
    /* JADX WARN: Code duplicated, block: B:107:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0181  */
    /* JADX WARN: Code duplicated, block: B:137:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d A[LOOP:1: B:23:0x007b->B:24:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[PHI: r3 r9 r16 r20
      0x00a3: PHI (r3v7 boolean) = 
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v11 boolean)
      (r3v12 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
     binds: [B:27:0x008b, B:70:0x0115, B:72:0x0119, B:76:0x0126, B:75:0x0121, B:62:0x00fa, B:57:0x00e4, B:53:0x00da, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r9v4 boolean) = 
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v11 boolean)
      (r9v12 boolean)
      (r9v13 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
     binds: [B:27:0x008b, B:70:0x0115, B:72:0x0119, B:76:0x0126, B:75:0x0121, B:62:0x00fa, B:57:0x00e4, B:53:0x00da, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r16v2 boolean) = 
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v5 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
     binds: [B:27:0x008b, B:70:0x0115, B:72:0x0119, B:76:0x0126, B:75:0x0121, B:62:0x00fa, B:57:0x00e4, B:53:0x00da, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r20v3 boolean) = 
      (r20v2 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v11 boolean)
      (r20v14 boolean)
      (r20v16 boolean)
      (r20v17 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
     binds: [B:27:0x008b, B:70:0x0115, B:72:0x0119, B:76:0x0126, B:75:0x0121, B:62:0x00fa, B:57:0x00e4, B:53:0x00da, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[PHI: r20
      0x00da: PHI (r20v16 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:81:0x0135, B:52:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[PHI: r20
      0x00e2: PHI (r20v15 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:84:0x013a, B:55:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[PHI: r20
      0x00e4: PHI (r20v14 boolean) = (r20v9 boolean), (r20v9 boolean), (r20v18 boolean), (r20v18 boolean) binds: [B:83:0x0138, B:84:0x013a, B:54:0x00de, B:55:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee A[PHI: r20
      0x00ee: PHI (r20v12 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:70:0x0115, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa A[PHI: r20
      0x00fa: PHI (r20v11 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:69:0x0113, B:43:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f A[PHI: r10 r20
      0x012f: PHI (r10v7 char) = (r10v5 char), (r10v9 char) binds: [B:96:0x015a, B:77:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r20v8 boolean) = (r20v5 boolean), (r20v9 boolean) binds: [B:96:0x015a, B:77:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    /* JADX WARN: Code duplicated, block: B:81:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x0146  */
    /* JADX WARN: Code duplicated, block: B:91:0x014a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0156  */
    /* JADX WARN: Code duplicated, block: B:96:0x015a  */
    /* JADX WARN: Code duplicated, block: B:98:0x015f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0161  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:40:0x00b3
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public p149l.oxc0 mo100271b(int r26, p149l.m03 r27, java.util.Map<com.google.zxing.DecodeHintType, ?> r28) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.db5.mo100271b(int, l.m03, java.util.Map):l.oxc0");
    }
}
