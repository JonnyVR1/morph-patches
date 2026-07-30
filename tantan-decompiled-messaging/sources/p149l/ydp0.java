package p149l;

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
public final class ydp0 {

    /* JADX INFO: renamed from: l.ydp0$a */
    public static final class C21377a {

        /* JADX INFO: renamed from: a */
        public final String f197577a;

        /* JADX INFO: renamed from: b */
        public final String[] f197578b;

        /* JADX INFO: renamed from: c */
        public final int f197579c;

        public C21377a(String str, String[] strArr, int i) {
            this.f197577a = str;
            this.f197578b = strArr;
            this.f197579c = i;
        }
    }

    /* JADX INFO: renamed from: l.ydp0$b */
    public static final class C21378b {

        /* JADX INFO: renamed from: a */
        public final boolean f197580a;

        /* JADX INFO: renamed from: b */
        public final int f197581b;

        /* JADX INFO: renamed from: c */
        public final int f197582c;

        /* JADX INFO: renamed from: d */
        public final int f197583d;

        public C21378b(boolean z, int i, int i2, int i3) {
            this.f197580a = z;
            this.f197581b = i;
            this.f197582c = i2;
            this.f197583d = i3;
        }
    }

    /* JADX INFO: renamed from: l.ydp0$c */
    public static final class C21379c {

        /* JADX INFO: renamed from: a */
        public final int f197584a;

        /* JADX INFO: renamed from: b */
        public final int f197585b;

        /* JADX INFO: renamed from: c */
        public final int f197586c;

        /* JADX INFO: renamed from: d */
        public final int f197587d;

        /* JADX INFO: renamed from: e */
        public final int f197588e;

        /* JADX INFO: renamed from: f */
        public final int f197589f;

        /* JADX INFO: renamed from: g */
        public final int f197590g;

        /* JADX INFO: renamed from: h */
        public final int f197591h;

        /* JADX INFO: renamed from: i */
        public final boolean f197592i;

        /* JADX INFO: renamed from: j */
        public final byte[] f197593j;

        public C21379c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f197584a = i;
            this.f197585b = i2;
            this.f197586c = i3;
            this.f197587d = i4;
            this.f197588e = i5;
            this.f197589f = i6;
            this.f197590g = i7;
            this.f197591h = i8;
            this.f197592i = z;
            this.f197593j = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m214311a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static long m214312b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata m214313c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrM197844b1 = vck0.m197844b1(str, "=");
            if (strArrM197844b1.length != 2) {
                jwv.m143689i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrM197844b1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.m10549a(new d860(Base64.decode(strArrM197844b1[1], 0))));
                } catch (RuntimeException e) {
                    jwv.m143690j("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrM197844b1[0], strArrM197844b1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static void m214314d(wdp0 wdp0Var) throws ParserException {
        int iM202780d = wdp0Var.m202780d(6) + 1;
        for (int i = 0; i < iM202780d; i++) {
            int iM202780d2 = wdp0Var.m202780d(16);
            if (iM202780d2 == 0) {
                wdp0Var.m202781e(8);
                wdp0Var.m202781e(16);
                wdp0Var.m202781e(16);
                wdp0Var.m202781e(6);
                wdp0Var.m202781e(8);
                int iM202780d3 = wdp0Var.m202780d(4) + 1;
                for (int i2 = 0; i2 < iM202780d3; i2++) {
                    wdp0Var.m202781e(8);
                }
            } else {
                if (iM202780d2 != 1) {
                    throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + iM202780d2, null);
                }
                int iM202780d4 = wdp0Var.m202780d(5);
                int[] iArr = new int[iM202780d4];
                int i3 = -1;
                for (int i4 = 0; i4 < iM202780d4; i4++) {
                    int iM202780d5 = wdp0Var.m202780d(4);
                    iArr[i4] = iM202780d5;
                    if (iM202780d5 > i3) {
                        i3 = iM202780d5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = wdp0Var.m202780d(3) + 1;
                    int iM202780d6 = wdp0Var.m202780d(2);
                    if (iM202780d6 > 0) {
                        wdp0Var.m202781e(8);
                    }
                    for (int i7 = 0; i7 < (1 << iM202780d6); i7++) {
                        wdp0Var.m202781e(8);
                    }
                }
                wdp0Var.m202781e(2);
                int iM202780d7 = wdp0Var.m202780d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iM202780d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        wdp0Var.m202781e(iM202780d7);
                        i9++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m214315e(int i, wdp0 wdp0Var) throws ParserException {
        int iM202780d = wdp0Var.m202780d(6) + 1;
        for (int i2 = 0; i2 < iM202780d; i2++) {
            int iM202780d2 = wdp0Var.m202780d(16);
            if (iM202780d2 != 0) {
                jwv.m143683c("VorbisUtil", "mapping type other than 0 not supported: " + iM202780d2);
            } else {
                int iM202780d3 = wdp0Var.m202779c() ? wdp0Var.m202780d(4) + 1 : 1;
                if (wdp0Var.m202779c()) {
                    int iM202780d4 = wdp0Var.m202780d(8) + 1;
                    for (int i3 = 0; i3 < iM202780d4; i3++) {
                        int i4 = i - 1;
                        wdp0Var.m202781e(m214311a(i4));
                        wdp0Var.m202781e(m214311a(i4));
                    }
                }
                if (wdp0Var.m202780d(2) != 0) {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iM202780d3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        wdp0Var.m202781e(4);
                    }
                }
                for (int i6 = 0; i6 < iM202780d3; i6++) {
                    wdp0Var.m202781e(8);
                    wdp0Var.m202781e(8);
                    wdp0Var.m202781e(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C21378b[] m214316f(wdp0 wdp0Var) {
        int iM202780d = wdp0Var.m202780d(6) + 1;
        C21378b[] c21378bArr = new C21378b[iM202780d];
        for (int i = 0; i < iM202780d; i++) {
            c21378bArr[i] = new C21378b(wdp0Var.m202779c(), wdp0Var.m202780d(16), wdp0Var.m202780d(16), wdp0Var.m202780d(8));
        }
        return c21378bArr;
    }

    /* JADX INFO: renamed from: g */
    public static void m214317g(wdp0 wdp0Var) throws ParserException {
        int iM202780d = wdp0Var.m202780d(6) + 1;
        for (int i = 0; i < iM202780d; i++) {
            if (wdp0Var.m202780d(16) > 2) {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            wdp0Var.m202781e(24);
            wdp0Var.m202781e(24);
            wdp0Var.m202781e(24);
            int iM202780d2 = wdp0Var.m202780d(6) + 1;
            wdp0Var.m202781e(8);
            int[] iArr = new int[iM202780d2];
            for (int i2 = 0; i2 < iM202780d2; i2++) {
                iArr[i2] = ((wdp0Var.m202779c() ? wdp0Var.m202780d(5) : 0) * 8) + wdp0Var.m202780d(3);
            }
            for (int i3 = 0; i3 < iM202780d2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        wdp0Var.m202781e(8);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static C21377a m214318h(d860 d860Var) throws ParserException {
        return m214319i(d860Var, true, true);
    }

    /* JADX INFO: renamed from: i */
    public static C21377a m214319i(d860 d860Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            m214323m(3, d860Var, false);
        }
        String strM110276E = d860Var.m110276E((int) d860Var.m110318x());
        int length = strM110276E.length();
        long jM110318x = d860Var.m110318x();
        String[] strArr = new String[(int) jM110318x];
        int length2 = length + 15;
        for (int i = 0; i < jM110318x; i++) {
            String strM110276E2 = d860Var.m110276E((int) d860Var.m110318x());
            strArr[i] = strM110276E2;
            length2 = length2 + 4 + strM110276E2.length();
        }
        if (z2 && (d860Var.m110279H() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new C21377a(strM110276E, strArr, length2 + 1);
    }

    /* JADX INFO: renamed from: j */
    public static C21379c m214320j(d860 d860Var) throws ParserException {
        m214323m(1, d860Var, false);
        int iM110319y = d860Var.m110319y();
        int iM110279H = d860Var.m110279H();
        int iM110319y2 = d860Var.m110319y();
        int iM110315u = d860Var.m110315u();
        if (iM110315u <= 0) {
            iM110315u = -1;
        }
        int iM110315u2 = d860Var.m110315u();
        if (iM110315u2 <= 0) {
            iM110315u2 = -1;
        }
        int iM110315u3 = d860Var.m110315u();
        if (iM110315u3 <= 0) {
            iM110315u3 = -1;
        }
        int iM110279H2 = d860Var.m110279H();
        return new C21379c(iM110319y, iM110279H, iM110319y2, iM110315u, iM110315u2, iM110315u3, (int) Math.pow(2.0d, iM110279H2 & 15), (int) Math.pow(2.0d, (iM110279H2 & 240) >> 4), (d860Var.m110279H() & 1) > 0, Arrays.copyOf(d860Var.m110299e(), d860Var.m110301g()));
    }

    /* JADX INFO: renamed from: k */
    public static C21378b[] m214321k(d860 d860Var, int i) throws ParserException {
        m214323m(5, d860Var, false);
        int iM110279H = d860Var.m110279H() + 1;
        wdp0 wdp0Var = new wdp0(d860Var.m110299e());
        wdp0Var.m202781e(d860Var.m110300f() * 8);
        for (int i2 = 0; i2 < iM110279H; i2++) {
            m214322l(wdp0Var);
        }
        int iM202780d = wdp0Var.m202780d(6) + 1;
        for (int i3 = 0; i3 < iM202780d; i3++) {
            if (wdp0Var.m202780d(16) != 0) {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m214314d(wdp0Var);
        m214317g(wdp0Var);
        m214315e(i, wdp0Var);
        C21378b[] c21378bArrM214316f = m214316f(wdp0Var);
        if (wdp0Var.m202779c()) {
            return c21378bArrM214316f;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    /* JADX INFO: renamed from: l */
    public static void m214322l(wdp0 wdp0Var) throws ParserException {
        long jM214312b;
        if (wdp0Var.m202780d(24) != 5653314) {
            throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + wdp0Var.m202778b(), null);
        }
        int iM202780d = wdp0Var.m202780d(16);
        int iM202780d2 = wdp0Var.m202780d(24);
        int iM202780d3 = 0;
        if (wdp0Var.m202779c()) {
            wdp0Var.m202781e(5);
            while (iM202780d3 < iM202780d2) {
                iM202780d3 += wdp0Var.m202780d(m214311a(iM202780d2 - iM202780d3));
            }
        } else {
            boolean zM202779c = wdp0Var.m202779c();
            while (iM202780d3 < iM202780d2) {
                if (!zM202779c) {
                    wdp0Var.m202781e(5);
                } else if (wdp0Var.m202779c()) {
                    wdp0Var.m202781e(5);
                }
                iM202780d3++;
            }
        }
        int iM202780d4 = wdp0Var.m202780d(4);
        if (iM202780d4 > 2) {
            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + iM202780d4, null);
        }
        if (iM202780d4 == 1 || iM202780d4 == 2) {
            wdp0Var.m202781e(32);
            wdp0Var.m202781e(32);
            int iM202780d5 = wdp0Var.m202780d(4) + 1;
            wdp0Var.m202781e(1);
            if (iM202780d4 == 1) {
                jM214312b = iM202780d != 0 ? m214312b(iM202780d2, iM202780d) : 0L;
            } else {
                jM214312b = ((long) iM202780d) * ((long) iM202780d2);
            }
            wdp0Var.m202781e((int) (jM214312b * ((long) iM202780d5)));
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m214323m(int i, d860 d860Var, boolean z) throws ParserException {
        if (d860Var.m110295a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + d860Var.m110295a(), null);
        }
        if (d860Var.m110279H() != i) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i), null);
        }
        if (d860Var.m110279H() == 118 && d860Var.m110279H() == 111 && d860Var.m110279H() == 114 && d860Var.m110279H() == 98 && d860Var.m110279H() == 105 && d860Var.m110279H() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }
}
