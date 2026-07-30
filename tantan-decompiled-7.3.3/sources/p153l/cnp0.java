package p153l;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cnp0 {

    /* JADX INFO: renamed from: l.cnp0$a */
    public static final class C16319a {

        /* JADX INFO: renamed from: a */
        public final String f82739a;

        /* JADX INFO: renamed from: b */
        public final String[] f82740b;

        /* JADX INFO: renamed from: c */
        public final int f82741c;

        public C16319a(String str, String[] strArr, int i) {
            this.f82739a = str;
            this.f82740b = strArr;
            this.f82741c = i;
        }
    }

    /* JADX INFO: renamed from: l.cnp0$b */
    public static final class C16320b {

        /* JADX INFO: renamed from: a */
        public final boolean f82742a;

        /* JADX INFO: renamed from: b */
        public final int f82743b;

        /* JADX INFO: renamed from: c */
        public final int f82744c;

        /* JADX INFO: renamed from: d */
        public final int f82745d;

        public C16320b(boolean z, int i, int i2, int i3) {
            this.f82742a = z;
            this.f82743b = i;
            this.f82744c = i2;
            this.f82745d = i3;
        }
    }

    /* JADX INFO: renamed from: l.cnp0$c */
    public static final class C16321c {

        /* JADX INFO: renamed from: a */
        public final int f82746a;

        /* JADX INFO: renamed from: b */
        public final int f82747b;

        /* JADX INFO: renamed from: c */
        public final int f82748c;

        /* JADX INFO: renamed from: d */
        public final int f82749d;

        /* JADX INFO: renamed from: e */
        public final int f82750e;

        /* JADX INFO: renamed from: f */
        public final int f82751f;

        /* JADX INFO: renamed from: g */
        public final int f82752g;

        /* JADX INFO: renamed from: h */
        public final int f82753h;

        /* JADX INFO: renamed from: i */
        public final boolean f82754i;

        /* JADX INFO: renamed from: j */
        public final byte[] f82755j;

        public C16321c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f82746a = i;
            this.f82747b = i2;
            this.f82748c = i3;
            this.f82749d = i4;
            this.f82750e = i5;
            this.f82751f = i6;
            this.f82752g = i7;
            this.f82753h = i8;
            this.f82754i = z;
            this.f82755j = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m111522a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static long m111523b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata m111524c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrM105122b1 = bmk0.m105122b1(str, "=");
            if (strArrM105122b1.length != 2) {
                kyv.m152151i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrM105122b1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.m10603a(new ig60(Base64.decode(strArrM105122b1[1], 0))));
                } catch (RuntimeException e) {
                    kyv.m152152j("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrM105122b1[0], strArrM105122b1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static void m111525d(anp0 anp0Var) throws ParserException {
        int iM99025d = anp0Var.m99025d(6) + 1;
        for (int i = 0; i < iM99025d; i++) {
            int iM99025d2 = anp0Var.m99025d(16);
            if (iM99025d2 == 0) {
                anp0Var.m99026e(8);
                anp0Var.m99026e(16);
                anp0Var.m99026e(16);
                anp0Var.m99026e(6);
                anp0Var.m99026e(8);
                int iM99025d3 = anp0Var.m99025d(4) + 1;
                for (int i2 = 0; i2 < iM99025d3; i2++) {
                    anp0Var.m99026e(8);
                }
            } else {
                if (iM99025d2 != 1) {
                    throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + iM99025d2, null);
                }
                int iM99025d4 = anp0Var.m99025d(5);
                int[] iArr = new int[iM99025d4];
                int i3 = -1;
                for (int i4 = 0; i4 < iM99025d4; i4++) {
                    int iM99025d5 = anp0Var.m99025d(4);
                    iArr[i4] = iM99025d5;
                    if (iM99025d5 > i3) {
                        i3 = iM99025d5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = anp0Var.m99025d(3) + 1;
                    int iM99025d6 = anp0Var.m99025d(2);
                    if (iM99025d6 > 0) {
                        anp0Var.m99026e(8);
                    }
                    for (int i7 = 0; i7 < (1 << iM99025d6); i7++) {
                        anp0Var.m99026e(8);
                    }
                }
                anp0Var.m99026e(2);
                int iM99025d7 = anp0Var.m99025d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iM99025d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        anp0Var.m99026e(iM99025d7);
                        i9++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m111526e(int i, anp0 anp0Var) throws ParserException {
        int iM99025d = anp0Var.m99025d(6) + 1;
        for (int i2 = 0; i2 < iM99025d; i2++) {
            int iM99025d2 = anp0Var.m99025d(16);
            if (iM99025d2 != 0) {
                kyv.m152145c("VorbisUtil", "mapping type other than 0 not supported: " + iM99025d2);
            } else {
                int iM99025d3 = anp0Var.m99024c() ? anp0Var.m99025d(4) + 1 : 1;
                if (anp0Var.m99024c()) {
                    int iM99025d4 = anp0Var.m99025d(8) + 1;
                    for (int i3 = 0; i3 < iM99025d4; i3++) {
                        int i4 = i - 1;
                        anp0Var.m99026e(m111522a(i4));
                        anp0Var.m99026e(m111522a(i4));
                    }
                }
                if (anp0Var.m99025d(2) != 0) {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iM99025d3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        anp0Var.m99026e(4);
                    }
                }
                for (int i6 = 0; i6 < iM99025d3; i6++) {
                    anp0Var.m99026e(8);
                    anp0Var.m99026e(8);
                    anp0Var.m99026e(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C16320b[] m111527f(anp0 anp0Var) {
        int iM99025d = anp0Var.m99025d(6) + 1;
        C16320b[] c16320bArr = new C16320b[iM99025d];
        for (int i = 0; i < iM99025d; i++) {
            c16320bArr[i] = new C16320b(anp0Var.m99024c(), anp0Var.m99025d(16), anp0Var.m99025d(16), anp0Var.m99025d(8));
        }
        return c16320bArr;
    }

    /* JADX INFO: renamed from: g */
    public static void m111528g(anp0 anp0Var) throws ParserException {
        int iM99025d = anp0Var.m99025d(6) + 1;
        for (int i = 0; i < iM99025d; i++) {
            if (anp0Var.m99025d(16) > 2) {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            anp0Var.m99026e(24);
            anp0Var.m99026e(24);
            anp0Var.m99026e(24);
            int iM99025d2 = anp0Var.m99025d(6) + 1;
            anp0Var.m99026e(8);
            int[] iArr = new int[iM99025d2];
            for (int i2 = 0; i2 < iM99025d2; i2++) {
                iArr[i2] = ((anp0Var.m99024c() ? anp0Var.m99025d(5) : 0) * 8) + anp0Var.m99025d(3);
            }
            for (int i3 = 0; i3 < iM99025d2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        anp0Var.m99026e(8);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static C16319a m111529h(ig60 ig60Var) throws ParserException {
        return m111530i(ig60Var, true, true);
    }

    /* JADX INFO: renamed from: i */
    public static C16319a m111530i(ig60 ig60Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            m111534m(3, ig60Var, false);
        }
        String strM139792E = ig60Var.m139792E((int) ig60Var.m139834x());
        int length = strM139792E.length();
        long jM139834x = ig60Var.m139834x();
        String[] strArr = new String[(int) jM139834x];
        int length2 = length + 15;
        for (int i = 0; i < jM139834x; i++) {
            String strM139792E2 = ig60Var.m139792E((int) ig60Var.m139834x());
            strArr[i] = strM139792E2;
            length2 = length2 + 4 + strM139792E2.length();
        }
        if (z2 && (ig60Var.m139795H() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new C16319a(strM139792E, strArr, length2 + 1);
    }

    /* JADX INFO: renamed from: j */
    public static C16321c m111531j(ig60 ig60Var) throws ParserException {
        m111534m(1, ig60Var, false);
        int iM139835y = ig60Var.m139835y();
        int iM139795H = ig60Var.m139795H();
        int iM139835y2 = ig60Var.m139835y();
        int iM139831u = ig60Var.m139831u();
        if (iM139831u <= 0) {
            iM139831u = -1;
        }
        int iM139831u2 = ig60Var.m139831u();
        if (iM139831u2 <= 0) {
            iM139831u2 = -1;
        }
        int iM139831u3 = ig60Var.m139831u();
        if (iM139831u3 <= 0) {
            iM139831u3 = -1;
        }
        int iM139795H2 = ig60Var.m139795H();
        return new C16321c(iM139835y, iM139795H, iM139835y2, iM139831u, iM139831u2, iM139831u3, (int) Math.pow(2.0d, iM139795H2 & 15), (int) Math.pow(2.0d, (iM139795H2 & 240) >> 4), (ig60Var.m139795H() & 1) > 0, Arrays.copyOf(ig60Var.m139815e(), ig60Var.m139817g()));
    }

    /* JADX INFO: renamed from: k */
    public static C16320b[] m111532k(ig60 ig60Var, int i) throws ParserException {
        m111534m(5, ig60Var, false);
        int iM139795H = ig60Var.m139795H() + 1;
        anp0 anp0Var = new anp0(ig60Var.m139815e());
        anp0Var.m99026e(ig60Var.m139816f() * 8);
        for (int i2 = 0; i2 < iM139795H; i2++) {
            m111533l(anp0Var);
        }
        int iM99025d = anp0Var.m99025d(6) + 1;
        for (int i3 = 0; i3 < iM99025d; i3++) {
            if (anp0Var.m99025d(16) != 0) {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m111525d(anp0Var);
        m111528g(anp0Var);
        m111526e(i, anp0Var);
        C16320b[] c16320bArrM111527f = m111527f(anp0Var);
        if (anp0Var.m99024c()) {
            return c16320bArrM111527f;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    /* JADX INFO: renamed from: l */
    public static void m111533l(anp0 anp0Var) throws ParserException {
        long jM111523b;
        if (anp0Var.m99025d(24) != 5653314) {
            throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + anp0Var.m99023b(), null);
        }
        int iM99025d = anp0Var.m99025d(16);
        int iM99025d2 = anp0Var.m99025d(24);
        int iM99025d3 = 0;
        if (anp0Var.m99024c()) {
            anp0Var.m99026e(5);
            while (iM99025d3 < iM99025d2) {
                iM99025d3 += anp0Var.m99025d(m111522a(iM99025d2 - iM99025d3));
            }
        } else {
            boolean zM99024c = anp0Var.m99024c();
            while (iM99025d3 < iM99025d2) {
                if (!zM99024c) {
                    anp0Var.m99026e(5);
                } else if (anp0Var.m99024c()) {
                    anp0Var.m99026e(5);
                }
                iM99025d3++;
            }
        }
        int iM99025d4 = anp0Var.m99025d(4);
        if (iM99025d4 > 2) {
            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + iM99025d4, null);
        }
        if (iM99025d4 == 1 || iM99025d4 == 2) {
            anp0Var.m99026e(32);
            anp0Var.m99026e(32);
            int iM99025d5 = anp0Var.m99025d(4) + 1;
            anp0Var.m99026e(1);
            if (iM99025d4 == 1) {
                jM111523b = iM99025d != 0 ? m111523b(iM99025d2, iM99025d) : 0L;
            } else {
                jM111523b = ((long) iM99025d) * ((long) iM99025d2);
            }
            anp0Var.m99026e((int) (jM111523b * ((long) iM99025d5)));
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m111534m(int i, ig60 ig60Var, boolean z) throws ParserException {
        if (ig60Var.m139811a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + ig60Var.m139811a(), null);
        }
        if (ig60Var.m139795H() != i) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i), null);
        }
        if (ig60Var.m139795H() == 118 && ig60Var.m139795H() == 111 && ig60Var.m139795H() == 114 && ig60Var.m139795H() == 98 && ig60Var.m139795H() == 105 && ig60Var.m139795H() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }
}
