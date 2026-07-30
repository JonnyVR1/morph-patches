package p153l;

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
public final class kdm extends gpf0 {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC18140a f125258b = new InterfaceC18140a() { // from class: l.jdm
        @Override // p153l.kdm.InterfaceC18140a
        /* JADX INFO: renamed from: a */
        public final boolean mo144428a(int i, int i2, int i3, int i4, int i5) {
            return kdm.m149214c(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public final InterfaceC18140a f125259a;

    /* JADX INFO: renamed from: l.kdm$a */
    public interface InterfaceC18140a {
        /* JADX INFO: renamed from: a */
        boolean mo144428a(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: l.kdm$b */
    public static final class C18141b {

        /* JADX INFO: renamed from: a */
        public final int f125260a;

        /* JADX INFO: renamed from: b */
        public final boolean f125261b;

        /* JADX INFO: renamed from: c */
        public final int f125262c;

        public C18141b(int i, boolean z, int i2) {
            this.f125260a = i;
            this.f125261b = z;
            this.f125262c = i2;
        }
    }

    public kdm(@Nullable InterfaceC18140a interfaceC18140a) {
        this.f125259a = interfaceC18140a;
    }

    /* JADX INFO: renamed from: A */
    public static int m149212A(ig60 ig60Var, int i) {
        byte[] bArrM139815e = ig60Var.m139815e();
        int iM139816f = ig60Var.m139816f();
        int i2 = iM139816f;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iM139816f + i) {
                return i;
            }
            if ((bArrM139815e[i2] & 255) == 255 && bArrM139815e[i3] == 0) {
                System.arraycopy(bArrM139815e, i2 + 2, bArrM139815e, i3, (i - (i2 - iM139816f)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B */
    public static boolean m149213B(ig60 ig60Var, int i, int i2, boolean z) {
        int iM139798K;
        long jM139798K;
        int iM139801N;
        int i3;
        int iM139816f = ig60Var.m139816f();
        while (true) {
            try {
                boolean z2 = true;
                if (ig60Var.m139811a() < i2) {
                    ig60Var.m139808U(iM139816f);
                    return true;
                }
                if (i >= 3) {
                    iM139798K = ig60Var.m139827q();
                    jM139798K = ig60Var.m139797J();
                    iM139801N = ig60Var.m139801N();
                } else {
                    iM139798K = ig60Var.m139798K();
                    jM139798K = ig60Var.m139798K();
                    iM139801N = 0;
                }
                if (iM139798K == 0 && jM139798K == 0 && iM139801N == 0) {
                    ig60Var.m139808U(iM139816f);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM139798K) != 0) {
                        ig60Var.m139808U(iM139816f);
                        return false;
                    }
                    jM139798K = (((jM139798K >> 24) & 255) << 21) | (jM139798K & 255) | (((jM139798K >> 8) & 255) << 7) | (((jM139798K >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM139801N & 64) != 0 ? 1 : 0;
                    if ((iM139801N & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iM139801N & 32) != 0 ? 1 : 0;
                    if ((iM139801N & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jM139798K < i3) {
                    ig60Var.m139808U(iM139816f);
                    return false;
                }
                if (ig60Var.m139811a() < jM139798K) {
                    ig60Var.m139808U(iM139816f);
                    return false;
                }
                ig60Var.m139809V((int) jM139798K);
            } catch (Throwable th) {
                ig60Var.m139808U(iM139816f);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m149214c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m149215d(byte[] bArr, int i, int i2) {
        return i2 <= i ? bmk0.f77318f : Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX INFO: renamed from: f */
    public static ApicFrame m149216f(ig60 ig60Var, int i, int i2) {
        int iM149236z;
        String strConcat;
        int iM139795H = ig60Var.m139795H();
        Charset charsetM149233w = m149233w(iM139795H);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        ig60Var.m139822l(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + i11.m138051e(new String(bArr, 0, 3, et4.f95688b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            }
            iM149236z = 2;
        } else {
            iM149236z = m149236z(bArr, 0);
            String strM138051e = i11.m138051e(new String(bArr, 0, iM149236z, et4.f95688b));
            strConcat = strM138051e.indexOf(47) == -1 ? "image/".concat(strM138051e) : strM138051e;
        }
        int i4 = bArr[iM149236z + 1] & 255;
        int i5 = iM149236z + 2;
        int iM149235y = m149235y(bArr, i5, iM139795H);
        return new ApicFrame(strConcat, new String(bArr, i5, iM149235y - i5, charsetM149233w), i4, m149215d(bArr, iM149235y + m149232v(iM139795H), i3));
    }

    /* JADX INFO: renamed from: g */
    public static BinaryFrame m149217g(ig60 ig60Var, int i, String str) {
        byte[] bArr = new byte[i];
        ig60Var.m139822l(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static ChapterFrame m149218h(ig60 ig60Var, int i, int i2, boolean z, int i3, @Nullable InterfaceC18140a interfaceC18140a) throws Throwable {
        int iM139816f = ig60Var.m139816f();
        int iM149236z = m149236z(ig60Var.m139815e(), iM139816f);
        String str = new String(ig60Var.m139815e(), iM139816f, iM149236z - iM139816f, et4.f95688b);
        ig60Var.m139808U(iM149236z + 1);
        int iM139827q = ig60Var.m139827q();
        int iM139827q2 = ig60Var.m139827q();
        long jM139797J = ig60Var.m139797J();
        if (jM139797J == 4294967295L) {
            jM139797J = -1;
        }
        long jM139797J2 = ig60Var.m139797J();
        long j = jM139797J2 == 4294967295L ? -1L : jM139797J2;
        ArrayList arrayList = new ArrayList();
        int i4 = iM139816f + i;
        while (ig60Var.m139816f() < i4) {
            Id3Frame id3FrameM149221k = m149221k(i2, ig60Var, z, i3, interfaceC18140a);
            if (id3FrameM149221k != null) {
                arrayList.add(id3FrameM149221k);
            }
        }
        return new ChapterFrame(str, iM139827q, iM139827q2, jM139797J, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX INFO: renamed from: i */
    public static ChapterTocFrame m149219i(ig60 ig60Var, int i, int i2, boolean z, int i3, @Nullable InterfaceC18140a interfaceC18140a) throws Throwable {
        int iM139816f = ig60Var.m139816f();
        int iM149236z = m149236z(ig60Var.m139815e(), iM139816f);
        String str = new String(ig60Var.m139815e(), iM139816f, iM149236z - iM139816f, et4.f95688b);
        ig60Var.m139808U(iM149236z + 1);
        int iM139795H = ig60Var.m139795H();
        boolean z2 = (iM139795H & 2) != 0;
        boolean z3 = (iM139795H & 1) != 0;
        int iM139795H2 = ig60Var.m139795H();
        String[] strArr = new String[iM139795H2];
        for (int i4 = 0; i4 < iM139795H2; i4++) {
            int iM139816f2 = ig60Var.m139816f();
            int iM149236z2 = m149236z(ig60Var.m139815e(), iM139816f2);
            strArr[i4] = new String(ig60Var.m139815e(), iM139816f2, iM149236z2 - iM139816f2, et4.f95688b);
            ig60Var.m139808U(iM149236z2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM139816f + i;
        while (ig60Var.m139816f() < i5) {
            Id3Frame id3FrameM149221k = m149221k(i2, ig60Var, z, i3, interfaceC18140a);
            if (id3FrameM149221k != null) {
                arrayList.add(id3FrameM149221k);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static CommentFrame m149220j(ig60 ig60Var, int i) {
        if (i < 4) {
            return null;
        }
        int iM139795H = ig60Var.m139795H();
        Charset charsetM149233w = m149233w(iM139795H);
        byte[] bArr = new byte[3];
        ig60Var.m139822l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ig60Var.m139822l(bArr2, 0, i2);
        int iM149235y = m149235y(bArr2, 0, iM139795H);
        String str2 = new String(bArr2, 0, iM149235y, charsetM149233w);
        int iM149232v = iM149235y + m149232v(iM139795H);
        return new CommentFrame(str, str2, m149226p(bArr2, iM149232v, m149235y(bArr2, iM149232v, iM139795H), charsetM149233w));
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
    /* JADX WARN: Type inference failed for: r1v10, types: [l.ig60] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.ig60] */
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
    public static Id3Frame m149221k(int i, ig60 ig60Var, boolean z, int i2, @Nullable InterfaceC18140a interfaceC18140a) throws Throwable {
        int iM139799L;
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
        ig60 ig60Var2;
        Id3Frame id3FrameM149217g;
        ?? r10;
        int i6 = i;
        int iM139795H = ig60Var.m139795H();
        int iM139795H2 = ig60Var.m139795H();
        int iM139795H3 = ig60Var.m139795H();
        boolean z6 = false;
        int iM139795H4 = i6 >= 3 ? ig60Var.m139795H() : 0;
        if (i6 == 4) {
            iM139799L = ig60Var.m139799L();
            if (!z) {
                iM139799L = (((iM139799L >> 24) & 255) << 21) | (iM139799L & 255) | (((iM139799L >> 8) & 255) << 7) | (((iM139799L >> 16) & 255) << 14);
            }
        } else {
            iM139799L = i6 == 3 ? ig60Var.m139799L() : ig60Var.m139798K();
        }
        int iM149212A = iM139799L;
        int iM139801N = i6 >= 3 ? ig60Var.m139801N() : 0;
        if (iM139795H == 0 && iM139795H2 == 0 && iM139795H3 == 0 && iM139795H4 == 0 && iM149212A == 0 && iM139801N == 0) {
            ig60Var.m139808U(ig60Var.m139817g());
            return null;
        }
        int iM139816f = ig60Var.m139816f() + iM149212A;
        if (iM139816f > ig60Var.m139817g()) {
            kyv.m152151i("Id3Decoder", "Frame size exceeds remaining tag data");
            ig60Var.m139808U(ig60Var.m139817g());
            return null;
        }
        if (interfaceC18140a != null) {
            r1 = iM139795H2;
            if (!interfaceC18140a.mo144428a(i6, iM139795H, iM139795H2, iM139795H3, iM139795H4)) {
                i6 = i6;
                ig60Var.m139808U(iM139816f);
                return null;
            }
        } else {
            r1 = iM139795H2;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iM139801N & 128) != 0;
            boolean z7 = (iM139801N & 64) != 0;
            z5 = false;
            z6 = z2;
            z3 = (iM139801N & 32) != 0;
            z4 = z7;
        } else if (i6 == 4) {
            boolean z8 = (iM139801N & 64) != 0;
            boolean z9 = (iM139801N & 8) != 0;
            boolean z10 = (iM139801N & 4) != 0;
            boolean z11 = (iM139801N & 2) != 0;
            z6 = (iM139801N & 1) != 0;
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
            kyv.m152151i("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            ig60Var.m139808U(iM139816f);
            return null;
        }
        if (z3) {
            iM149212A--;
            ig60Var.m139809V(1);
        }
        if (z2) {
            iM149212A -= 4;
            ig60Var.m139809V(4);
        }
        if (z5) {
            iM149212A = m149212A(ig60Var, iM149212A);
        }
        try {
            try {
                if (iM139795H == 84 && r1 == 88 && iM139795H3 == 88 && (i6 == 2 || iM139795H4 == 88)) {
                    id3FrameM149217g = m149229s(ig60Var, iM149212A);
                } else if (iM139795H == 84) {
                    id3FrameM149217g = m149227q(ig60Var, iM149212A, m149234x(i6, iM139795H, r1, iM139795H3, iM139795H4));
                } else if (iM139795H == 87 && r1 == 88 && iM139795H3 == 88 && (i6 == 2 || iM139795H4 == 88)) {
                    id3FrameM149217g = m149231u(ig60Var, iM149212A);
                } else if (iM139795H == 87) {
                    id3FrameM149217g = m149230t(ig60Var, iM149212A, m149234x(i6, iM139795H, r1, iM139795H3, iM139795H4));
                } else if (iM139795H == 80 && r1 == 82 && iM139795H3 == 73 && iM139795H4 == 86) {
                    id3FrameM149217g = m149225o(ig60Var, iM149212A);
                } else {
                    if (iM139795H != 71 || r1 != 69 || iM139795H3 != 79 || (iM139795H4 != 66 && i6 != 2)) {
                        if (i6 == 2) {
                            if (iM139795H == 80 && r1 == 73 && iM139795H3 == 67) {
                                id3FrameM149217g = m149216f(ig60Var, iM149212A, i6);
                            } else if (iM139795H != 67 && r1 == 79 && iM139795H3 == 77 && (iM139795H4 == 77 || i6 == 2)) {
                                id3FrameM149217g = m149220j(ig60Var, iM149212A);
                            } else if (iM139795H != 67 && r1 == 72 && iM139795H3 == 65 && iM139795H4 == 80) {
                                r10 = r1;
                                i3 = iM139795H3;
                                i4 = iM149212A;
                                i5 = iM139795H4;
                                try {
                                    id3FrameM149217g = m149218h(ig60Var, i4, i6, z, i2, interfaceC18140a);
                                    i6 = i;
                                    r1 = ig60Var;
                                } catch (Throwable th) {
                                    th = th;
                                    r2 = ig60Var;
                                    r2.m139808U(iM139816f);
                                    throw th;
                                }
                            } else {
                                r9 = r1;
                                i3 = iM139795H3;
                                i4 = iM149212A;
                                i5 = iM139795H4;
                                if (iM139795H != 67 && r9 == 84 && i3 == 79 && i5 == 67) {
                                    i6 = i;
                                    ig60 ig60Var3 = ig60Var;
                                    id3FrameM149217g = m149219i(ig60Var3, i4, i6, z, i2, interfaceC18140a);
                                    r1 = ig60Var3;
                                    r10 = r9;
                                } else {
                                    i6 = i;
                                    ig60Var2 = ig60Var;
                                    if (iM139795H != 77 && r9 == 76 && i3 == 76 && i5 == 84) {
                                        id3FrameM149217g = m149224n(ig60Var2, i4);
                                    } else {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    }
                                }
                            }
                        } else if (iM139795H == 65 && r1 == 80 && iM139795H3 == 73 && iM139795H4 == 67) {
                            id3FrameM149217g = m149216f(ig60Var, iM149212A, i6);
                        } else {
                            if (iM139795H != 67) {
                            }
                            if (iM139795H != 67) {
                                r9 = r1;
                                i3 = iM139795H3;
                                i4 = iM149212A;
                                i5 = iM139795H4;
                                if (iM139795H != 67) {
                                    i6 = i;
                                    ig60Var2 = ig60Var;
                                    if (iM139795H != 77) {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    }
                                } else {
                                    i6 = i;
                                    ig60Var2 = ig60Var;
                                    if (iM139795H != 77) {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    }
                                }
                            } else {
                                r9 = r1;
                                i3 = iM139795H3;
                                i4 = iM149212A;
                                i5 = iM139795H4;
                                if (iM139795H != 67) {
                                    i6 = i;
                                    ig60Var2 = ig60Var;
                                    if (iM139795H != 77) {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    }
                                } else {
                                    i6 = i;
                                    ig60Var2 = ig60Var;
                                    if (iM139795H != 77) {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    } else {
                                        id3FrameM149217g = m149217g(ig60Var2, i4, m149234x(i6, iM139795H, r9 == true ? 1 : 0, i3, i5));
                                        r1 = ig60Var2;
                                        r10 = r9;
                                    }
                                }
                            }
                        }
                        if (id3FrameM149217g == null) {
                            r1 = ig60Var2;
                            r10 = r9;
                            kyv.m152151i("Id3Decoder", "Failed to decode frame: id=" + m149234x(i6, iM139795H, r10, i3, i5) + ", frameSize=" + i4);
                        }
                        r1 = ig60Var2;
                        r10 = r9;
                        r1.m139808U(iM139816f);
                        return id3FrameM149217g;
                    }
                    id3FrameM149217g = m149222l(ig60Var, iM149212A);
                }
                r10 = r1;
                i3 = iM139795H3;
                r1 = ig60Var;
                i4 = iM149212A;
                i5 = iM139795H4;
                if (id3FrameM149217g == null) {
                    r1 = ig60Var2;
                    r10 = r9;
                    kyv.m152151i("Id3Decoder", "Failed to decode frame: id=" + m149234x(i6, iM139795H, r10, i3, i5) + ", frameSize=" + i4);
                }
                r1 = ig60Var2;
                r10 = r9;
                r1.m139808U(iM139816f);
                return id3FrameM149217g;
            } catch (Throwable th2) {
                th = th2;
                r2 = ig60Var;
            }
        } catch (Throwable th3) {
            th = th3;
            r2 = r1;
        }
    }

    /* JADX INFO: renamed from: l */
    public static GeobFrame m149222l(ig60 ig60Var, int i) {
        int iM139795H = ig60Var.m139795H();
        Charset charsetM149233w = m149233w(iM139795H);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ig60Var.m139822l(bArr, 0, i2);
        int iM149236z = m149236z(bArr, 0);
        String str = new String(bArr, 0, iM149236z, et4.f95688b);
        int i3 = iM149236z + 1;
        int iM149235y = m149235y(bArr, i3, iM139795H);
        String strM149226p = m149226p(bArr, i3, iM149235y, charsetM149233w);
        int iM149232v = iM149235y + m149232v(iM139795H);
        int iM149235y2 = m149235y(bArr, iM149232v, iM139795H);
        return new GeobFrame(str, strM149226p, m149226p(bArr, iM149232v, iM149235y2, charsetM149233w), m149215d(bArr, iM149235y2 + m149232v(iM139795H), i2));
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static C18141b m149223m(ig60 ig60Var) {
        if (ig60Var.m139811a() < 10) {
            kyv.m152151i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iM139798K = ig60Var.m139798K();
        if (iM139798K != 4801587) {
            kyv.m152151i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM139798K))));
            return null;
        }
        int iM139795H = ig60Var.m139795H();
        ig60Var.m139809V(1);
        int iM139795H2 = ig60Var.m139795H();
        int iM139794G = ig60Var.m139794G();
        if (iM139795H == 2) {
            if ((iM139795H2 & 64) != 0) {
                kyv.m152151i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iM139795H == 3) {
            if ((iM139795H2 & 64) != 0) {
                int iM139827q = ig60Var.m139827q();
                ig60Var.m139809V(iM139827q);
                iM139794G -= iM139827q + 4;
            }
        } else {
            if (iM139795H != 4) {
                kyv.m152151i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM139795H);
                return null;
            }
            if ((iM139795H2 & 64) != 0) {
                int iM139794G2 = ig60Var.m139794G();
                ig60Var.m139809V(iM139794G2 - 4);
                iM139794G -= iM139794G2;
            }
            if ((iM139795H2 & 16) != 0) {
                iM139794G -= 10;
            }
        }
        return new C18141b(iM139795H, iM139795H < 4 && (iM139795H2 & 128) != 0, iM139794G);
    }

    /* JADX INFO: renamed from: n */
    public static MlltFrame m149224n(ig60 ig60Var, int i) {
        int iM139801N = ig60Var.m139801N();
        int iM139798K = ig60Var.m139798K();
        int iM139798K2 = ig60Var.m139798K();
        int iM139795H = ig60Var.m139795H();
        int iM139795H2 = ig60Var.m139795H();
        hg60 hg60Var = new hg60();
        hg60Var.m134910m(ig60Var);
        int i2 = ((i - 10) * 8) / (iM139795H + iM139795H2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM134905h = hg60Var.m134905h(iM139795H);
            int iM134905h2 = hg60Var.m134905h(iM139795H2);
            iArr[i3] = iM134905h;
            iArr2[i3] = iM134905h2;
        }
        return new MlltFrame(iM139801N, iM139798K, iM139798K2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: o */
    public static PrivFrame m149225o(ig60 ig60Var, int i) {
        byte[] bArr = new byte[i];
        ig60Var.m139822l(bArr, 0, i);
        int iM149236z = m149236z(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iM149236z, et4.f95688b), m149215d(bArr, iM149236z + 1, i));
    }

    /* JADX INFO: renamed from: p */
    public static String m149226p(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static TextInformationFrame m149227q(ig60 ig60Var, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iM139795H = ig60Var.m139795H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ig60Var.m139822l(bArr, 0, i2);
        return new TextInformationFrame(str, null, m149228r(bArr, iM139795H, 0));
    }

    /* JADX INFO: renamed from: r */
    public static ImmutableList<String> m149228r(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.m15740of("");
        }
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        int iM149235y = m149235y(bArr, i2, i);
        while (i2 < iM149235y) {
            c2804aBuilder.mo15737a(new String(bArr, i2, iM149235y - i2, m149233w(i)));
            i2 = m149232v(i) + iM149235y;
            iM149235y = m149235y(bArr, i2, i);
        }
        ImmutableList<String> immutableListM15756m = c2804aBuilder.m15756m();
        return immutableListM15756m.isEmpty() ? ImmutableList.m15740of("") : immutableListM15756m;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static TextInformationFrame m149229s(ig60 ig60Var, int i) {
        if (i < 1) {
            return null;
        }
        int iM139795H = ig60Var.m139795H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ig60Var.m139822l(bArr, 0, i2);
        int iM149235y = m149235y(bArr, 0, iM139795H);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iM149235y, m149233w(iM139795H)), m149228r(bArr, iM139795H, iM149235y + m149232v(iM139795H)));
    }

    /* JADX INFO: renamed from: t */
    public static UrlLinkFrame m149230t(ig60 ig60Var, int i, String str) {
        byte[] bArr = new byte[i];
        ig60Var.m139822l(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m149236z(bArr, 0), et4.f95688b));
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static UrlLinkFrame m149231u(ig60 ig60Var, int i) {
        if (i < 1) {
            return null;
        }
        int iM139795H = ig60Var.m139795H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ig60Var.m139822l(bArr, 0, i2);
        int iM149235y = m149235y(bArr, 0, iM139795H);
        String str = new String(bArr, 0, iM149235y, m149233w(iM139795H));
        int iM149232v = iM149235y + m149232v(iM139795H);
        return new UrlLinkFrame("WXXX", str, m149226p(bArr, iM149232v, m149236z(bArr, iM149232v), et4.f95688b));
    }

    /* JADX INFO: renamed from: v */
    public static int m149232v(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: w */
    public static Charset m149233w(int i) {
        if (i == 1) {
            return et4.f95692f;
        }
        if (i != 2) {
            return i != 3 ? et4.f95688b : et4.f95689c;
        }
        return et4.f95690d;
    }

    /* JADX INFO: renamed from: x */
    public static String m149234x(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: y */
    public static int m149235y(byte[] bArr, int i, int i2) {
        int iM149236z = m149236z(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM149236z;
        }
        while (iM149236z < bArr.length - 1) {
            if ((iM149236z - i) % 2 == 0 && bArr[iM149236z + 1] == 0) {
                return iM149236z;
            }
            iM149236z = m149236z(bArr, iM149236z + 1);
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: z */
    public static int m149236z(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    @Override // p153l.gpf0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Metadata mo108050b(ba00 ba00Var, ByteBuffer byteBuffer) {
        return m149237e(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Metadata m149237e(byte[] bArr, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ig60 ig60Var = new ig60(bArr, i);
        C18141b c18141bM149223m = m149223m(ig60Var);
        if (c18141bM149223m == null) {
            return null;
        }
        int iM139816f = ig60Var.m139816f();
        int i2 = c18141bM149223m.f125260a == 2 ? 6 : 10;
        int iM149212A = c18141bM149223m.f125262c;
        if (c18141bM149223m.f125261b) {
            iM149212A = m149212A(ig60Var, c18141bM149223m.f125262c);
        }
        ig60Var.m139807T(iM139816f + iM149212A);
        boolean z = false;
        if (!m149213B(ig60Var, c18141bM149223m.f125260a, i2, false)) {
            if (c18141bM149223m.f125260a != 4 || !m149213B(ig60Var, 4, i2, true)) {
                kyv.m152151i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c18141bM149223m.f125260a);
                return null;
            }
            z = true;
        }
        while (ig60Var.m139811a() >= i2) {
            Id3Frame id3FrameM149221k = m149221k(c18141bM149223m.f125260a, ig60Var, z, i2, this.f125259a);
            if (id3FrameM149221k != null) {
                arrayList.add(id3FrameM149221k);
            }
        }
        return new Metadata(arrayList);
    }

    public kdm() {
        this(null);
    }
}
