package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sfr0 {

    /* JADX INFO: renamed from: a */
    public final List f167758a;

    /* JADX INFO: renamed from: b */
    public final int f167759b;

    /* JADX INFO: renamed from: c */
    public final int f167760c;

    /* JADX INFO: renamed from: d */
    public final int f167761d;

    /* JADX INFO: renamed from: e */
    public final int f167762e;

    /* JADX INFO: renamed from: f */
    public final int f167763f;

    /* JADX INFO: renamed from: g */
    public final int f167764g;

    /* JADX INFO: renamed from: h */
    public final float f167765h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f167766i;

    public sfr0(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, @Nullable String str) {
        this.f167758a = list;
        this.f167759b = i;
        this.f167760c = i4;
        this.f167761d = i5;
        this.f167762e = i6;
        this.f167763f = i7;
        this.f167764g = i8;
        this.f167765h = f;
        this.f167766i = str;
    }

    /* JADX INFO: renamed from: a */
    public static sfr0 m185662a(bgw0 bgw0Var) throws zzcc {
        boolean z;
        try {
            bgw0Var.m104270l(21);
            int iM104245B = bgw0Var.m104245B() & 3;
            int iM104245B2 = bgw0Var.m104245B();
            int iM104277s = bgw0Var.m104277s();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i2 >= iM104245B2) {
                    break;
                }
                bgw0Var.m104270l(1);
                int iM104249F = bgw0Var.m104249F();
                for (int i4 = 0; i4 < iM104249F; i4++) {
                    int iM104249F2 = bgw0Var.m104249F();
                    i3 += iM104249F2 + 4;
                    bgw0Var.m104270l(iM104249F2);
                }
                i2++;
            }
            bgw0Var.m104269k(iM104277s);
            byte[] bArr = new byte[i3];
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            String strM181491b = null;
            float f = 1.0f;
            int i12 = 0;
            int i13 = 0;
            while (i12 < iM104245B2) {
                int iM104245B3 = bgw0Var.m104245B() & 63;
                int iM104249F3 = bgw0Var.m104249F();
                int i14 = i;
                while (i14 < iM104249F3) {
                    int iM104249F4 = bgw0Var.m104249F();
                    boolean z2 = z;
                    int i15 = iM104245B;
                    System.arraycopy(w3x0.f187180a, i, bArr, i13, 4);
                    int i16 = i13 + 4;
                    System.arraycopy(bgw0Var.m104271m(), bgw0Var.m104277s(), bArr, i16, iM104249F4);
                    int i17 = i16 + iM104249F4;
                    if (iM104245B3 == 33 && i14 == 0) {
                        f0x0 f0x0VarM204793c = w3x0.m204793c(bArr, i13 + 6, i17);
                        i5 = f0x0VarM204793c.f96740i;
                        i6 = f0x0VarM204793c.f96741j;
                        i7 = f0x0VarM204793c.f96736e + 8;
                        i8 = f0x0VarM204793c.f96737f + 8;
                        int i18 = f0x0VarM204793c.f96743l;
                        int i19 = f0x0VarM204793c.f96744m;
                        int i20 = f0x0VarM204793c.f96745n;
                        float f2 = f0x0VarM204793c.f96742k;
                        strM181491b = rgv0.m181491b(f0x0VarM204793c.f96732a, f0x0VarM204793c.f96733b, f0x0VarM204793c.f96734c, f0x0VarM204793c.f96735d, f0x0VarM204793c.f96738g, f0x0VarM204793c.f96739h);
                        i10 = i19;
                        i11 = i20;
                        f = f2;
                        i14 = 0;
                        i9 = i18;
                    }
                    bgw0Var.m104270l(iM104249F4);
                    i14++;
                    z = z2;
                    iM104245B = i15;
                    i13 = i17;
                    i = 0;
                }
                i12++;
                i = 0;
            }
            return new sfr0(i3 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM104245B + 1, i5, i6, i7, i8, i9, i10, i11, f, strM181491b);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing HEVC config", e);
        }
    }
}
