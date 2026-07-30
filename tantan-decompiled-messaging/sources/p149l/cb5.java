package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class cb5 extends nh50 {

    /* JADX INFO: renamed from: a */
    public static final char[] f80099a;

    /* JADX INFO: renamed from: b */
    public static final char[] f80100b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c */
    public static final char[] f80101c = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: d */
    public static final char f80102d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f80099a = cArr;
        f80102d = cArr[0];
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f80102d;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f80099a;
            boolean zM100947g = bb5.m100947g(cArr, upperCase);
            boolean zM100947g2 = bb5.m100947g(cArr, upperCase2);
            char[] cArr2 = f80100b;
            boolean zM100947g3 = bb5.m100947g(cArr2, upperCase);
            boolean zM100947g4 = bb5.m100947g(cArr2, upperCase2);
            if (zM100947g) {
                if (!zM100947g2) {
                    ig3.m135964a("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!zM100947g3) {
                if (zM100947g2 || zM100947g4) {
                    ig3.m135964a("Invalid start/end guards: ".concat(str));
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                char c2 = f80102d;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else if (!zM100947g4) {
                ig3.m135964a("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!bb5.m100947g(f80101c, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = bb5.f74779d;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = bb5.f74780e[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
