package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lb5 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f127274a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f127275b = {"", "A", "B", b2s.C_ZONE};

    /* JADX INFO: renamed from: a */
    public static String m149199a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: b */
    public static List<byte[]> m149200b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* JADX INFO: renamed from: c */
    public static String m149201c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(vck0.m197793D("hvc1.%s%d.%X.%c%d", f127275b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
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
    public static byte[] m149202d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f127274a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* JADX INFO: renamed from: e */
    public static int m149203e(byte[] bArr, int i) {
        int length = bArr.length - f127274a.length;
        while (i <= length) {
            if (m149205g(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static Pair<Integer, Integer> m149204f(byte[] bArr) {
        boolean z;
        d860 d860Var = new d860(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (d860Var.m110282K() == 1 && (bArr[i3] & 240) == 32) {
                z = true;
                break;
            }
            d860Var.m110292U(d860Var.m110300f() - 2);
            i2++;
        }
        p11.m167008b(z, "Invalid input: VOL not found.");
        c860 c860Var = new c860(bArr);
        c860Var.m105674r((i2 + 4) * 8);
        c860Var.m105674r(1);
        c860Var.m105674r(8);
        if (c860Var.m105663g()) {
            c860Var.m105674r(4);
            c860Var.m105674r(3);
        }
        if (c860Var.m105664h(4) == 15) {
            c860Var.m105674r(8);
            c860Var.m105674r(8);
        }
        if (c860Var.m105663g()) {
            c860Var.m105674r(2);
            c860Var.m105674r(1);
            if (c860Var.m105663g()) {
                c860Var.m105674r(79);
            }
        }
        p11.m167008b(c860Var.m105664h(2) == 0, "Only supports rectangular video object layer shape.");
        p11.m167007a(c860Var.m105663g());
        int iM105664h = c860Var.m105664h(16);
        p11.m167007a(c860Var.m105663g());
        if (c860Var.m105663g()) {
            p11.m167007a(iM105664h > 0);
            for (int i4 = iM105664h - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            c860Var.m105674r(i);
        }
        p11.m167007a(c860Var.m105663g());
        int iM105664h2 = c860Var.m105664h(13);
        p11.m167007a(c860Var.m105663g());
        int iM105664h3 = c860Var.m105664h(13);
        p11.m167007a(c860Var.m105663g());
        c860Var.m105674r(1);
        return Pair.create(Integer.valueOf(iM105664h2), Integer.valueOf(iM105664h3));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m149205g(byte[] bArr, int i) {
        if (bArr.length - i <= f127274a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f127274a;
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
    public static Pair<Integer, Integer> m149206h(byte[] bArr) {
        d860 d860Var = new d860(bArr);
        d860Var.m110292U(9);
        int iM110279H = d860Var.m110279H();
        d860Var.m110292U(20);
        return Pair.create(Integer.valueOf(d860Var.m110283L()), Integer.valueOf(iM110279H));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m149207i(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static byte[][] m149208j(byte[] bArr) {
        if (!m149205g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM149203e = 0;
        do {
            arrayList.add(Integer.valueOf(iM149203e));
            iM149203e = m149203e(bArr, iM149203e + f127274a.length);
        } while (iM149203e != -1);
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
