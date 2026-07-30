package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class cc5 extends tp50 {

    /* JADX INFO: renamed from: a */
    public static final char[] f80887a;

    /* JADX INFO: renamed from: b */
    public static final char[] f80888b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c */
    public static final char[] f80889c = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: d */
    public static final char f80890d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f80887a = cArr;
        f80890d = cArr[0];
    }

    @Override // p153l.tp50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17402c(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f80890d;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f80887a;
            boolean zM103485g = bc5.m103485g(cArr, upperCase);
            boolean zM103485g2 = bc5.m103485g(cArr, upperCase2);
            char[] cArr2 = f80888b;
            boolean zM103485g3 = bc5.m103485g(cArr2, upperCase);
            boolean zM103485g4 = bc5.m103485g(cArr2, upperCase2);
            if (zM103485g) {
                if (!zM103485g2) {
                    wg3.m206174a("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!zM103485g3) {
                if (zM103485g2 || zM103485g4) {
                    wg3.m206174a("Invalid start/end guards: ".concat(str));
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                char c2 = f80890d;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else if (!zM103485g4) {
                wg3.m206174a("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!bc5.m103485g(f80889c, str.charAt(i3))) {
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
                char[] cArr3 = bc5.f76095d;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = bc5.f76096e[i6];
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
