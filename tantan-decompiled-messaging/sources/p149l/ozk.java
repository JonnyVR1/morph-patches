package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ozk {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f146474a;

    /* JADX INFO: renamed from: b */
    public final int f146475b;

    /* JADX INFO: renamed from: c */
    public final int f146476c;

    /* JADX INFO: renamed from: d */
    public final int f146477d;

    /* JADX INFO: renamed from: e */
    public final int f146478e;

    /* JADX INFO: renamed from: f */
    public final int f146479f;

    /* JADX INFO: renamed from: g */
    public final int f146480g;

    /* JADX INFO: renamed from: h */
    public final float f146481h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f146482i;

    public ozk(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @Nullable String str) {
        this.f146474a = list;
        this.f146475b = i;
        this.f146476c = i2;
        this.f146477d = i3;
        this.f146478e = i4;
        this.f146479f = i5;
        this.f146480g = i6;
        this.f146481h = f;
        this.f146482i = str;
    }

    /* JADX INFO: renamed from: a */
    public static ozk m166888a(d860 d860Var) throws ParserException {
        boolean z;
        try {
            d860Var.m110293V(21);
            int iM110279H = d860Var.m110279H() & 3;
            int iM110279H2 = d860Var.m110279H();
            int iM110300f = d860Var.m110300f();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i2 >= iM110279H2) {
                    break;
                }
                d860Var.m110293V(1);
                int iM110285N = d860Var.m110285N();
                for (int i4 = 0; i4 < iM110285N; i4++) {
                    int iM110285N2 = d860Var.m110285N();
                    i3 += iM110285N2 + 4;
                    d860Var.m110293V(iM110285N2);
                }
                i2++;
            }
            d860Var.m110292U(iM110300f);
            byte[] bArr = new byte[i3];
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            float f = 1.0f;
            String strM149201c = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < iM110279H2) {
                int iM110279H3 = d860Var.m110279H() & 63;
                int iM110285N3 = d860Var.m110285N();
                int i12 = i;
                while (i12 < iM110285N3) {
                    int iM110285N4 = d860Var.m110285N();
                    boolean z2 = z;
                    byte[] bArr2 = b320.f72762a;
                    int i13 = iM110279H;
                    System.arraycopy(bArr2, i, bArr, i11, bArr2.length);
                    int length = i11 + bArr2.length;
                    System.arraycopy(d860Var.m110299e(), d860Var.m110300f(), bArr, length, iM110285N4);
                    if (iM110279H3 == 33 && i12 == 0) {
                        b320.C15783a c15783aM100045h = b320.m100045h(bArr, length, length + iM110285N4);
                        i5 = c15783aM100045h.f72776k;
                        i6 = c15783aM100045h.f72777l;
                        i7 = c15783aM100045h.f72779n;
                        int i14 = c15783aM100045h.f72780o;
                        int i15 = c15783aM100045h.f72781p;
                        float f2 = c15783aM100045h.f72778m;
                        strM149201c = lb5.m149201c(c15783aM100045h.f72766a, c15783aM100045h.f72767b, c15783aM100045h.f72768c, c15783aM100045h.f72769d, c15783aM100045h.f72773h, c15783aM100045h.f72774i);
                        i9 = i15;
                        f = f2;
                        i8 = i14;
                    }
                    i11 = length + iM110285N4;
                    d860Var.m110293V(iM110285N4);
                    i12++;
                    z = z2;
                    iM110279H = i13;
                    iM110279H2 = iM110279H2;
                    i = 0;
                }
                i10++;
                i = 0;
            }
            return new ozk(i3 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM110279H + 1, i5, i6, i7, i8, i9, f, strM149201c);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }
}
