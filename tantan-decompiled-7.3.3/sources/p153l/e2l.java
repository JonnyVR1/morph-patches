package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e2l {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f91788a;

    /* JADX INFO: renamed from: b */
    public final int f91789b;

    /* JADX INFO: renamed from: c */
    public final int f91790c;

    /* JADX INFO: renamed from: d */
    public final int f91791d;

    /* JADX INFO: renamed from: e */
    public final int f91792e;

    /* JADX INFO: renamed from: f */
    public final int f91793f;

    /* JADX INFO: renamed from: g */
    public final int f91794g;

    /* JADX INFO: renamed from: h */
    public final float f91795h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f91796i;

    public e2l(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @Nullable String str) {
        this.f91788a = list;
        this.f91789b = i;
        this.f91790c = i2;
        this.f91791d = i3;
        this.f91792e = i4;
        this.f91793f = i5;
        this.f91794g = i6;
        this.f91795h = f;
        this.f91796i = str;
    }

    /* JADX INFO: renamed from: a */
    public static e2l m119112a(ig60 ig60Var) throws ParserException {
        boolean z;
        try {
            ig60Var.m139809V(21);
            int iM139795H = ig60Var.m139795H() & 3;
            int iM139795H2 = ig60Var.m139795H();
            int iM139816f = ig60Var.m139816f();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i2 >= iM139795H2) {
                    break;
                }
                ig60Var.m139809V(1);
                int iM139801N = ig60Var.m139801N();
                for (int i4 = 0; i4 < iM139801N; i4++) {
                    int iM139801N2 = ig60Var.m139801N();
                    i3 += iM139801N2 + 4;
                    ig60Var.m139809V(iM139801N2);
                }
                i2++;
            }
            ig60Var.m139808U(iM139816f);
            byte[] bArr = new byte[i3];
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            float f = 1.0f;
            String strM153623c = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < iM139795H2) {
                int iM139795H3 = ig60Var.m139795H() & 63;
                int iM139801N3 = ig60Var.m139801N();
                int i12 = i;
                while (i12 < iM139801N3) {
                    int iM139801N4 = ig60Var.m139801N();
                    boolean z2 = z;
                    byte[] bArr2 = jb20.f119084a;
                    int i13 = iM139795H;
                    System.arraycopy(bArr2, i, bArr, i11, bArr2.length);
                    int length = i11 + bArr2.length;
                    System.arraycopy(ig60Var.m139815e(), ig60Var.m139816f(), bArr, length, iM139801N4);
                    if (iM139795H3 == 33 && i12 == 0) {
                        jb20.C17912a c17912aM144190h = jb20.m144190h(bArr, length, length + iM139801N4);
                        i5 = c17912aM144190h.f119098k;
                        i6 = c17912aM144190h.f119099l;
                        i7 = c17912aM144190h.f119101n;
                        int i14 = c17912aM144190h.f119102o;
                        int i15 = c17912aM144190h.f119103p;
                        float f2 = c17912aM144190h.f119100m;
                        strM153623c = lc5.m153623c(c17912aM144190h.f119088a, c17912aM144190h.f119089b, c17912aM144190h.f119090c, c17912aM144190h.f119091d, c17912aM144190h.f119095h, c17912aM144190h.f119096i);
                        i9 = i15;
                        f = f2;
                        i8 = i14;
                    }
                    i11 = length + iM139801N4;
                    ig60Var.m139809V(iM139801N4);
                    i12++;
                    z = z2;
                    iM139795H = i13;
                    iM139795H2 = iM139795H2;
                    i = 0;
                }
                i10++;
                i = 0;
            }
            return new e2l(i3 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM139795H + 1, i5, i6, i7, i8, i9, f, strM153623c);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }
}
