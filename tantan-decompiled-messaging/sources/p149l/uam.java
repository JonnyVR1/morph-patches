package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class uam extends ygf0 {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC20397a f175607b = new InterfaceC20397a() { // from class: l.tam
        @Override // p149l.uam.InterfaceC20397a
        /* JADX INFO: renamed from: a */
        public final boolean mo166603a(int i, int i2, int i3, int i4, int i5) {
            return uam.m192764c(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public final InterfaceC20397a f175608a;

    /* JADX INFO: renamed from: l.uam$a */
    public interface InterfaceC20397a {
        /* JADX INFO: renamed from: a */
        boolean mo166603a(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: l.uam$b */
    public static final class C20398b {

        /* JADX INFO: renamed from: a */
        public final int f175609a;

        /* JADX INFO: renamed from: b */
        public final boolean f175610b;

        /* JADX INFO: renamed from: c */
        public final int f175611c;

        public C20398b(int i, boolean z, int i2) {
            this.f175609a = i;
            this.f175610b = z;
            this.f175611c = i2;
        }
    }

    public uam(@Nullable InterfaceC20397a interfaceC20397a) {
        this.f175608a = interfaceC20397a;
    }

    /* JADX INFO: renamed from: A */
    public static int m192762A(d860 d860Var, int i) {
        byte[] bArrM110299e = d860Var.m110299e();
        int iM110300f = d860Var.m110300f();
        int i2 = iM110300f;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM110300f + i) {
                return i;
            }
            if ((bArrM110299e[i2] & 255) == 255 && bArrM110299e[i3] == 0) {
                System.arraycopy(bArrM110299e, i2 + 2, bArrM110299e, i3, (i - (i2 - iM110300f)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B */
    public static boolean m192763B(d860 d860Var, int i, int i2, boolean z) {
        int iM110282K;
        long jM110282K;
        int iM110285N;
        int i3;
        int iM110300f = d860Var.m110300f();
        while (true) {
            try {
                boolean z2 = true;
                if (d860Var.m110295a() < i2) {
                    d860Var.m110292U(iM110300f);
                    return true;
                }
                if (i >= 3) {
                    iM110282K = d860Var.m110311q();
                    jM110282K = d860Var.m110281J();
                    iM110285N = d860Var.m110285N();
                } else {
                    iM110282K = d860Var.m110282K();
                    jM110282K = d860Var.m110282K();
                    iM110285N = 0;
                }
                if (iM110282K == 0 && jM110282K == 0 && iM110285N == 0) {
                    d860Var.m110292U(iM110300f);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM110282K) != 0) {
                        d860Var.m110292U(iM110300f);
                        return false;
                    }
                    jM110282K = (((jM110282K >> 24) & 255) << 21) | (jM110282K & 255) | (((jM110282K >> 8) & 255) << 7) | (((jM110282K >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM110285N & 64) != 0 ? 1 : 0;
                    if ((iM110285N & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iM110285N & 32) != 0 ? 1 : 0;
                    if ((iM110285N & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM110282K < i3) {
                    d860Var.m110292U(iM110300f);
                    return false;
                }
                if (d860Var.m110295a() < jM110282K) {
                    d860Var.m110292U(iM110300f);
                    return false;
                }
                d860Var.m110293V((int) jM110282K);
            } catch (Throwable th) {
                d860Var.m110292U(iM110300f);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m192764c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m192765d(byte[] bArr, int i, int i2) {
        return i2 <= i ? vck0.f180953f : Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX INFO: renamed from: f */
    public static ApicFrame m192766f(d860 d860Var, int i, int i2) {
        int iM192786z;
        String strConcat;
        int iM110279H = d860Var.m110279H();
        Charset charsetM192783w = m192783w(iM110279H);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        d860Var.m110306l(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + b11.m99804e(new String(bArr, 0, 3, fs4.f99035b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            }
            iM192786z = 2;
        } else {
            iM192786z = m192786z(bArr, 0);
            String strM99804e = b11.m99804e(new String(bArr, 0, iM192786z, fs4.f99035b));
            strConcat = strM99804e.indexOf(47) == -1 ? "image/".concat(strM99804e) : strM99804e;
        }
        int i4 = bArr[iM192786z + 1] & 255;
        int i5 = iM192786z + 2;
        int iM192785y = m192785y(bArr, i5, iM110279H);
        return new ApicFrame(strConcat, new String(bArr, i5, iM192785y - i5, charsetM192783w), i4, m192765d(bArr, iM192785y + m192782v(iM110279H), i3));
    }

    /* JADX INFO: renamed from: g */
    public static BinaryFrame m192767g(d860 d860Var, int i, String str) {
        byte[] bArr = new byte[i];
        d860Var.m110306l(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static ChapterFrame m192768h(d860 d860Var, int i, int i2, boolean z, int i3, @Nullable InterfaceC20397a interfaceC20397a) throws Throwable {
        int iM110300f = d860Var.m110300f();
        int iM192786z = m192786z(d860Var.m110299e(), iM110300f);
        String str = new String(d860Var.m110299e(), iM110300f, iM192786z - iM110300f, fs4.f99035b);
        d860Var.m110292U(iM192786z + 1);
        int iM110311q = d860Var.m110311q();
        int iM110311q2 = d860Var.m110311q();
        long jM110281J = d860Var.m110281J();
        if (jM110281J == 4294967295L) {
            jM110281J = -1;
        }
        long jM110281J2 = d860Var.m110281J();
        long j = jM110281J2 == 4294967295L ? -1L : jM110281J2;
        ArrayList arrayList = new ArrayList();
        int i4 = iM110300f + i;
        while (d860Var.m110300f() < i4) {
            Id3Frame id3FrameM192771k = m192771k(i2, d860Var, z, i3, interfaceC20397a);
            if (id3FrameM192771k != null) {
                arrayList.add(id3FrameM192771k);
            }
        }
        return new ChapterFrame(str, iM110311q, iM110311q2, jM110281J, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX INFO: renamed from: i */
    public static ChapterTocFrame m192769i(d860 d860Var, int i, int i2, boolean z, int i3, @Nullable InterfaceC20397a interfaceC20397a) throws Throwable {
        int iM110300f = d860Var.m110300f();
        int iM192786z = m192786z(d860Var.m110299e(), iM110300f);
        String str = new String(d860Var.m110299e(), iM110300f, iM192786z - iM110300f, fs4.f99035b);
        d860Var.m110292U(iM192786z + 1);
        int iM110279H = d860Var.m110279H();
        boolean z2 = (iM110279H & 2) != 0;
        boolean z3 = (iM110279H & 1) != 0;
        int iM110279H2 = d860Var.m110279H();
        String[] strArr = new String[iM110279H2];
        for (int i4 = 0; i4 < iM110279H2; i4++) {
            int iM110300f2 = d860Var.m110300f();
            int iM192786z2 = m192786z(d860Var.m110299e(), iM110300f2);
            strArr[i4] = new String(d860Var.m110299e(), iM110300f2, iM192786z2 - iM110300f2, fs4.f99035b);
            d860Var.m110292U(iM192786z2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM110300f + i;
        while (d860Var.m110300f() < i5) {
            Id3Frame id3FrameM192771k = m192771k(i2, d860Var, z, i3, interfaceC20397a);
            if (id3FrameM192771k != null) {
                arrayList.add(id3FrameM192771k);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static CommentFrame m192770j(d860 d860Var, int i) {
        if (i < 4) {
            return null;
        }
        int iM110279H = d860Var.m110279H();
        Charset charsetM192783w = m192783w(iM110279H);
        byte[] bArr = new byte[3];
        d860Var.m110306l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        d860Var.m110306l(bArr2, 0, i2);
        int iM192785y = m192785y(bArr2, 0, iM110279H);
        String str2 = new String(bArr2, 0, iM192785y, charsetM192783w);
        int iM192782v = iM192785y + m192782v(iM110279H);
        return new CommentFrame(str, str2, m192776p(bArr2, iM192782v, m192785y(bArr2, iM192782v, iM110279H), charsetM192783w));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:168:0x0201 A[Catch: all -> 0x01ea, TryCatch #2 {all -> 0x01ea, blocks: (B:170:0x020b, B:157:0x01e5, B:167:0x01fc, B:168:0x0201), top: B:177:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x020b A[Catch: all -> 0x01ea, TRY_LEAVE, TryCatch #2 {all -> 0x01ea, blocks: (B:170:0x020b, B:157:0x01e5, B:167:0x01fc, B:168:0x0201), top: B:177:0x0111 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x020b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [l.d860] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.d860] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Nullable
    /* JADX INFO: renamed from: k */
    public static Id3Frame m192771k(int i, d860 d860Var, boolean z, int i2, @Nullable InterfaceC20397a interfaceC20397a) throws Throwable {
        int iM110283L;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ?? r2;
        ?? r9;
        int i3;
        int i4;
        int i5;
        d860 d860Var2;
        Id3Frame id3FrameM192767g;
        ?? r10;
        int i6 = i;
        int iM110279H = d860Var.m110279H();
        int iM110279H2 = d860Var.m110279H();
        int iM110279H3 = d860Var.m110279H();
        boolean z6 = false;
        int iM110279H4 = i6 >= 3 ? d860Var.m110279H() : 0;
        if (i6 == 4) {
            iM110283L = d860Var.m110283L();
            if (!z) {
                iM110283L = (((iM110283L >> 24) & 255) << 21) | (iM110283L & 255) | (((iM110283L >> 8) & 255) << 7) | (((iM110283L >> 16) & 255) << 14);
            }
        } else {
            iM110283L = i6 == 3 ? d860Var.m110283L() : d860Var.m110282K();
        }
        int iM192762A = iM110283L;
        int iM110285N = i6 >= 3 ? d860Var.m110285N() : 0;
        if (iM110279H == 0 && iM110279H2 == 0 && iM110279H3 == 0 && iM110279H4 == 0 && iM192762A == 0 && iM110285N == 0) {
            d860Var.m110292U(d860Var.m110301g());
            return null;
        }
        int iM110300f = d860Var.m110300f() + iM192762A;
        if (iM110300f > d860Var.m110301g()) {
            jwv.m143689i("Id3Decoder", "Frame size exceeds remaining tag data");
            d860Var.m110292U(d860Var.m110301g());
            return null;
        }
        if (interfaceC20397a != null) {
            r1 = iM110279H2;
            if (!interfaceC20397a.mo166603a(i6, iM110279H, iM110279H2, iM110279H3, iM110279H4)) {
                i6 = i6;
                d860Var.m110292U(iM110300f);
                return null;
            }
        } else {
            r1 = iM110279H2;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iM110285N & 128) != 0;
            boolean z7 = (iM110285N & 64) != 0;
            z5 = false;
            z6 = z2;
            z3 = (iM110285N & 32) != 0;
            z4 = z7;
        } else if (i6 == 4) {
            boolean z8 = (iM110285N & 64) != 0;
            boolean z9 = (iM110285N & 8) != 0;
            boolean z10 = (iM110285N & 4) != 0;
            boolean z11 = (iM110285N & 2) != 0;
            z6 = (iM110285N & 1) != 0;
            z3 = z8;
            z2 = z6;
            z6 = z9;
            z4 = z10;
            z5 = z11;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        if (z6 || z4) {
            jwv.m143689i("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            d860Var.m110292U(iM110300f);
            return null;
        }
        if (z3) {
            iM192762A--;
            d860Var.m110293V(1);
        }
        if (z2) {
            iM192762A -= 4;
            d860Var.m110293V(4);
        }
        if (z5) {
            iM192762A = m192762A(d860Var, iM192762A);
        }
        try {
            try {
                if (iM110279H == 84 && r1 == 88 && iM110279H3 == 88 && (i6 == 2 || iM110279H4 == 88)) {
                    id3FrameM192767g = m192779s(d860Var, iM192762A);
                } else if (iM110279H == 84) {
                    id3FrameM192767g = m192777q(d860Var, iM192762A, m192784x(i6, iM110279H, r1, iM110279H3, iM110279H4));
                } else if (iM110279H == 87 && r1 == 88 && iM110279H3 == 88 && (i6 == 2 || iM110279H4 == 88)) {
                    id3FrameM192767g = m192781u(d860Var, iM192762A);
                } else if (iM110279H == 87) {
                    id3FrameM192767g = m192780t(d860Var, iM192762A, m192784x(i6, iM110279H, r1, iM110279H3, iM110279H4));
                } else if (iM110279H == 80 && r1 == 82 && iM110279H3 == 73 && iM110279H4 == 86) {
                    id3FrameM192767g = m192775o(d860Var, iM192762A);
                } else {
                    if (iM110279H != 71 || r1 != 69 || iM110279H3 != 79 || (iM110279H4 != 66 && i6 != 2)) {
                        if (i6 == 2) {
                            if (iM110279H == 80 && r1 == 73 && iM110279H3 == 67) {
                                id3FrameM192767g = m192766f(d860Var, iM192762A, i6);
                            } else if (iM110279H != 67 && r1 == 79 && iM110279H3 == 77 && (iM110279H4 == 77 || i6 == 2)) {
                                id3FrameM192767g = m192770j(d860Var, iM192762A);
                            } else if (iM110279H != 67 && r1 == 72 && iM110279H3 == 65 && iM110279H4 == 80) {
                                r10 = r1;
                                i3 = iM110279H3;
                                i4 = iM192762A;
                                i5 = iM110279H4;
                                try {
                                    id3FrameM192767g = m192768h(d860Var, i4, i6, z, i2, interfaceC20397a);
                                    i6 = i;
                                    r1 = d860Var;
                                } catch (Throwable th) {
                                    th = th;
                                    r2 = d860Var;
                                    r2.m110292U(iM110300f);
                                    throw th;
                                }
                            } else {
                                r9 = r1;
                                i3 = iM110279H3;
                                i4 = iM192762A;
                                i5 = iM110279H4;
                                if (iM110279H != 67 && r9 == 84 && i3 == 79 && i5 == 67) {
                                    i6 = i;
                                    d860 d860Var3 = d860Var;
                                    id3FrameM192767g = m192769i(d860Var3, i4, i6, z, i2, interfaceC20397a);
                                    r1 = d860Var3;
                                    r10 = r9;
                                } else {
                                    i6 = i;
                                    d860Var2 = d860Var;
                                    if (iM110279H != 77 && r9 == 76 && i3 == 76 && i5 == 84) {
                                        id3FrameM192767g = m192774n(d860Var2, i4);
                                    } else {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    }
                                }
                            }
                        } else if (iM110279H == 65 && r1 == 80 && iM110279H3 == 73 && iM110279H4 == 67) {
                            id3FrameM192767g = m192766f(d860Var, iM192762A, i6);
                        } else {
                            if (iM110279H != 67) {
                            }
                            if (iM110279H != 67) {
                                r9 = r1;
                                i3 = iM110279H3;
                                i4 = iM192762A;
                                i5 = iM110279H4;
                                if (iM110279H != 67) {
                                    i6 = i;
                                    d860Var2 = d860Var;
                                    if (iM110279H != 77) {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    }
                                } else {
                                    i6 = i;
                                    d860Var2 = d860Var;
                                    if (iM110279H != 77) {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    }
                                }
                            } else {
                                r9 = r1;
                                i3 = iM110279H3;
                                i4 = iM192762A;
                                i5 = iM110279H4;
                                if (iM110279H != 67) {
                                    i6 = i;
                                    d860Var2 = d860Var;
                                    if (iM110279H != 77) {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    }
                                } else {
                                    i6 = i;
                                    d860Var2 = d860Var;
                                    if (iM110279H != 77) {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM192767g = m192767g(d860Var2, i4, m192784x(i6, iM110279H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = d860Var2;
                                        r10 = r9;
                                    }
                                }
                            }
                        }
                        if (id3FrameM192767g == null) {
                            r1 = d860Var2;
                            r10 = r9;
                            jwv.m143689i("Id3Decoder", "Failed to decode frame: id=" + m192784x(i6, iM110279H, r10, i3, i5) + ", frameSize=" + i4);
                        }
                        r1 = d860Var2;
                        r10 = r9;
                        r1.m110292U(iM110300f);
                        return id3FrameM192767g;
                    }
                    id3FrameM192767g = m192772l(d860Var, iM192762A);
                }
                r10 = r1;
                i3 = iM110279H3;
                r1 = d860Var;
                i4 = iM192762A;
                i5 = iM110279H4;
                if (id3FrameM192767g == null) {
                    r1 = d860Var2;
                    r10 = r9;
                    jwv.m143689i("Id3Decoder", "Failed to decode frame: id=" + m192784x(i6, iM110279H, r10, i3, i5) + ", frameSize=" + i4);
                }
                r1 = d860Var2;
                r10 = r9;
                r1.m110292U(iM110300f);
                return id3FrameM192767g;
            } catch (Throwable th2) {
                th = th2;
                r2 = d860Var;
            }
        } catch (Throwable th3) {
            th = th3;
            r2 = r1;
        }
    }

    /* JADX INFO: renamed from: l */
    public static GeobFrame m192772l(d860 d860Var, int i) {
        int iM110279H = d860Var.m110279H();
        Charset charsetM192783w = m192783w(iM110279H);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d860Var.m110306l(bArr, 0, i2);
        int iM192786z = m192786z(bArr, 0);
        String str = new String(bArr, 0, iM192786z, fs4.f99035b);
        int i3 = iM192786z + 1;
        int iM192785y = m192785y(bArr, i3, iM110279H);
        String strM192776p = m192776p(bArr, i3, iM192785y, charsetM192783w);
        int iM192782v = iM192785y + m192782v(iM110279H);
        int iM192785y2 = m192785y(bArr, iM192782v, iM110279H);
        return new GeobFrame(str, strM192776p, m192776p(bArr, iM192782v, iM192785y2, charsetM192783w), m192765d(bArr, iM192785y2 + m192782v(iM110279H), i2));
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static C20398b m192773m(d860 d860Var) {
        if (d860Var.m110295a() < 10) {
            jwv.m143689i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iM110282K = d860Var.m110282K();
        if (iM110282K != 4801587) {
            jwv.m143689i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM110282K))));
            return null;
        }
        int iM110279H = d860Var.m110279H();
        d860Var.m110293V(1);
        int iM110279H2 = d860Var.m110279H();
        int iM110278G = d860Var.m110278G();
        if (iM110279H == 2) {
            if ((iM110279H2 & 64) != 0) {
                jwv.m143689i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iM110279H == 3) {
            if ((iM110279H2 & 64) != 0) {
                int iM110311q = d860Var.m110311q();
                d860Var.m110293V(iM110311q);
                iM110278G -= iM110311q + 4;
            }
        } else {
            if (iM110279H != 4) {
                jwv.m143689i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM110279H);
                return null;
            }
            if ((iM110279H2 & 64) != 0) {
                int iM110278G2 = d860Var.m110278G();
                d860Var.m110293V(iM110278G2 - 4);
                iM110278G -= iM110278G2;
            }
            if ((iM110279H2 & 16) != 0) {
                iM110278G -= 10;
            }
        }
        return new C20398b(iM110279H, iM110279H < 4 && (iM110279H2 & 128) != 0, iM110278G);
    }

    /* JADX INFO: renamed from: n */
    public static MlltFrame m192774n(d860 d860Var, int i) {
        int iM110285N = d860Var.m110285N();
        int iM110282K = d860Var.m110282K();
        int iM110282K2 = d860Var.m110282K();
        int iM110279H = d860Var.m110279H();
        int iM110279H2 = d860Var.m110279H();
        c860 c860Var = new c860();
        c860Var.m105669m(d860Var);
        int i2 = ((i - 10) * 8) / (iM110279H + iM110279H2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM105664h = c860Var.m105664h(iM110279H);
            int iM105664h2 = c860Var.m105664h(iM110279H2);
            iArr[i3] = iM105664h;
            iArr2[i3] = iM105664h2;
        }
        return new MlltFrame(iM110285N, iM110282K, iM110282K2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: o */
    public static PrivFrame m192775o(d860 d860Var, int i) {
        byte[] bArr = new byte[i];
        d860Var.m110306l(bArr, 0, i);
        int iM192786z = m192786z(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iM192786z, fs4.f99035b), m192765d(bArr, iM192786z + 1, i));
    }

    /* JADX INFO: renamed from: p */
    public static String m192776p(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static TextInformationFrame m192777q(d860 d860Var, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iM110279H = d860Var.m110279H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d860Var.m110306l(bArr, 0, i2);
        return new TextInformationFrame(str, null, m192778r(bArr, iM110279H, 0));
    }

    /* JADX INFO: renamed from: r */
    public static ImmutableList<String> m192778r(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.m15686of("");
        }
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        int iM192785y = m192785y(bArr, i2, i);
        while (i2 < iM192785y) {
            c2781aBuilder.mo15683a(new String(bArr, i2, iM192785y - i2, m192783w(i)));
            i2 = m192782v(i) + iM192785y;
            iM192785y = m192785y(bArr, i2, i);
        }
        ImmutableList<String> immutableListM15702m = c2781aBuilder.m15702m();
        return immutableListM15702m.isEmpty() ? ImmutableList.m15686of("") : immutableListM15702m;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static TextInformationFrame m192779s(d860 d860Var, int i) {
        if (i < 1) {
            return null;
        }
        int iM110279H = d860Var.m110279H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d860Var.m110306l(bArr, 0, i2);
        int iM192785y = m192785y(bArr, 0, iM110279H);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iM192785y, m192783w(iM110279H)), m192778r(bArr, iM110279H, iM192785y + m192782v(iM110279H)));
    }

    /* JADX INFO: renamed from: t */
    public static UrlLinkFrame m192780t(d860 d860Var, int i, String str) {
        byte[] bArr = new byte[i];
        d860Var.m110306l(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m192786z(bArr, 0), fs4.f99035b));
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static UrlLinkFrame m192781u(d860 d860Var, int i) {
        if (i < 1) {
            return null;
        }
        int iM110279H = d860Var.m110279H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d860Var.m110306l(bArr, 0, i2);
        int iM192785y = m192785y(bArr, 0, iM110279H);
        String str = new String(bArr, 0, iM192785y, m192783w(iM110279H));
        int iM192782v = iM192785y + m192782v(iM110279H);
        return new UrlLinkFrame("WXXX", str, m192776p(bArr, iM192782v, m192786z(bArr, iM192782v), fs4.f99035b));
    }

    /* JADX INFO: renamed from: v */
    public static int m192782v(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: w */
    public static Charset m192783w(int i) {
        if (i == 1) {
            return fs4.f99039f;
        }
        if (i != 2) {
            return i != 3 ? fs4.f99035b : fs4.f99036c;
        }
        return fs4.f99037d;
    }

    /* JADX INFO: renamed from: x */
    public static String m192784x(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: y */
    public static int m192785y(byte[] bArr, int i, int i2) {
        int iM192786z = m192786z(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM192786z;
        }
        while (iM192786z < bArr.length - 1) {
            if ((iM192786z - i) % 2 == 0 && bArr[iM192786z + 1] == 0) {
                return iM192786z;
            }
            iM192786z = m192786z(bArr, iM192786z + 1);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: z */
    public static int m192786z(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    @Override // p149l.ygf0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Metadata mo122590b(e100 e100Var, ByteBuffer byteBuffer) {
        return m192787e(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Metadata m192787e(byte[] bArr, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        d860 d860Var = new d860(bArr, i);
        C20398b c20398bM192773m = m192773m(d860Var);
        if (c20398bM192773m == null) {
            return null;
        }
        int iM110300f = d860Var.m110300f();
        int i2 = c20398bM192773m.f175609a == 2 ? 6 : 10;
        int iM192762A = c20398bM192773m.f175611c;
        if (c20398bM192773m.f175610b) {
            iM192762A = m192762A(d860Var, c20398bM192773m.f175611c);
        }
        d860Var.m110291T(iM110300f + iM192762A);
        boolean z = false;
        if (!m192763B(d860Var, c20398bM192773m.f175609a, i2, false)) {
            if (c20398bM192773m.f175609a != 4 || !m192763B(d860Var, 4, i2, true)) {
                jwv.m143689i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c20398bM192773m.f175609a);
                return null;
            }
            z = true;
        }
        while (d860Var.m110295a() >= i2) {
            Id3Frame id3FrameM192771k = m192771k(c20398bM192773m.f175609a, d860Var, z, i2, this.f175608a);
            if (id3FrameM192771k != null) {
                arrayList.add(id3FrameM192771k);
            }
        }
        return new Metadata(arrayList);
    }

    public uam() {
        this(null);
    }
}
