package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lc5 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f131273a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f131274b = {"", "A", "B", c4s.C_ZONE};

    /* JADX INFO: renamed from: a */
    public static String m153621a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: b */
    public static List<byte[]> m153622b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* JADX INFO: renamed from: c */
    public static String m153623c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(bmk0.m105071D("hvc1.%s%d.%X.%c%d", f131274b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m153624d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f131273a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* JADX INFO: renamed from: e */
    public static int m153625e(byte[] bArr, int i) {
        int length = bArr.length - f131273a.length;
        while (i <= length) {
            if (m153627g(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static Pair<Integer, Integer> m153626f(byte[] bArr) {
        boolean z;
        ig60 ig60Var = new ig60(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (ig60Var.m139798K() == 1 && (bArr[i3] & 240) == 32) {
                z = true;
                break;
            }
            ig60Var.m139808U(ig60Var.m139816f() - 2);
            i2++;
        }
        w11.m204366b(z, "Invalid input: VOL not found.");
        hg60 hg60Var = new hg60(bArr);
        hg60Var.m134915r((i2 + 4) * 8);
        hg60Var.m134915r(1);
        hg60Var.m134915r(8);
        if (hg60Var.m134904g()) {
            hg60Var.m134915r(4);
            hg60Var.m134915r(3);
        }
        if (hg60Var.m134905h(4) == 15) {
            hg60Var.m134915r(8);
            hg60Var.m134915r(8);
        }
        if (hg60Var.m134904g()) {
            hg60Var.m134915r(2);
            hg60Var.m134915r(1);
            if (hg60Var.m134904g()) {
                hg60Var.m134915r(79);
            }
        }
        w11.m204366b(hg60Var.m134905h(2) == 0, "Only supports rectangular video object layer shape.");
        w11.m204365a(hg60Var.m134904g());
        int iM134905h = hg60Var.m134905h(16);
        w11.m204365a(hg60Var.m134904g());
        if (hg60Var.m134904g()) {
            w11.m204365a(iM134905h > 0);
            for (int i4 = iM134905h - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            hg60Var.m134915r(i);
        }
        w11.m204365a(hg60Var.m134904g());
        int iM134905h2 = hg60Var.m134905h(13);
        w11.m204365a(hg60Var.m134904g());
        int iM134905h3 = hg60Var.m134905h(13);
        w11.m204365a(hg60Var.m134904g());
        hg60Var.m134915r(1);
        return Pair.create(Integer.valueOf(iM134905h2), Integer.valueOf(iM134905h3));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m153627g(byte[] bArr, int i) {
        if (bArr.length - i <= f131273a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f131273a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Pair<Integer, Integer> m153628h(byte[] bArr) {
        ig60 ig60Var = new ig60(bArr);
        ig60Var.m139808U(9);
        int iM139795H = ig60Var.m139795H();
        ig60Var.m139808U(20);
        return Pair.create(Integer.valueOf(ig60Var.m139799L()), Integer.valueOf(iM139795H));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m153629i(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static byte[][] m153630j(byte[] bArr) {
        if (!m153627g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM153625e = 0;
        do {
            arrayList.add(Integer.valueOf(iM153625e));
            iM153625e = m153625e(bArr, iM153625e + f131273a.length);
        } while (iM153625e != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }
}
