package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m6r0 {

    /* JADX INFO: renamed from: a */
    public final List f131752a;

    /* JADX INFO: renamed from: b */
    public final int f131753b;

    /* JADX INFO: renamed from: c */
    public final int f131754c;

    /* JADX INFO: renamed from: d */
    public final int f131755d;

    /* JADX INFO: renamed from: e */
    public final int f131756e;

    /* JADX INFO: renamed from: f */
    public final int f131757f;

    /* JADX INFO: renamed from: g */
    public final int f131758g;

    /* JADX INFO: renamed from: h */
    public final float f131759h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f131760i;

    public m6r0(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, @Nullable String str) {
        this.f131752a = list;
        this.f131753b = i;
        this.f131754c = i4;
        this.f131755d = i5;
        this.f131756e = i6;
        this.f131757f = i7;
        this.f131758g = i8;
        this.f131759h = f;
        this.f131760i = str;
    }

    /* JADX INFO: renamed from: a */
    public static m6r0 m153294a(v6w0 v6w0Var) throws zzcc {
        boolean z;
        try {
            v6w0Var.m197263l(21);
            int iM197238B = v6w0Var.m197238B() & 3;
            int iM197238B2 = v6w0Var.m197238B();
            int iM197270s = v6w0Var.m197270s();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i2 >= iM197238B2) {
                    break;
                }
                v6w0Var.m197263l(1);
                int iM197242F = v6w0Var.m197242F();
                for (int i4 = 0; i4 < iM197242F; i4++) {
                    int iM197242F2 = v6w0Var.m197242F();
                    i3 += iM197242F2 + 4;
                    v6w0Var.m197263l(iM197242F2);
                }
                i2++;
            }
            v6w0Var.m197262k(iM197270s);
            byte[] bArr = new byte[i3];
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            String strM148828b = null;
            float f = 1.0f;
            int i12 = 0;
            int i13 = 0;
            while (i12 < iM197238B2) {
                int iM197238B3 = v6w0Var.m197238B() & 63;
                int iM197242F3 = v6w0Var.m197242F();
                int i14 = i;
                while (i14 < iM197242F3) {
                    int iM197242F4 = v6w0Var.m197242F();
                    boolean z2 = z;
                    int i15 = iM197238B;
                    System.arraycopy(quw0.f156548a, i, bArr, i13, 4);
                    int i16 = i13 + 4;
                    System.arraycopy(v6w0Var.m197264m(), v6w0Var.m197270s(), bArr, i16, iM197242F4);
                    int i17 = i16 + iM197242F4;
                    if (iM197238B3 == 33 && i14 == 0) {
                        zqw0 zqw0VarM176660c = quw0.m176660c(bArr, i13 + 6, i17);
                        i5 = zqw0VarM176660c.f204428i;
                        i6 = zqw0VarM176660c.f204429j;
                        i7 = zqw0VarM176660c.f204424e + 8;
                        i8 = zqw0VarM176660c.f204425f + 8;
                        int i18 = zqw0VarM176660c.f204431l;
                        int i19 = zqw0VarM176660c.f204432m;
                        int i20 = zqw0VarM176660c.f204433n;
                        float f2 = zqw0VarM176660c.f204430k;
                        strM148828b = l7v0.m148828b(zqw0VarM176660c.f204420a, zqw0VarM176660c.f204421b, zqw0VarM176660c.f204422c, zqw0VarM176660c.f204423d, zqw0VarM176660c.f204426g, zqw0VarM176660c.f204427h);
                        i10 = i19;
                        i11 = i20;
                        f = f2;
                        i14 = 0;
                        i9 = i18;
                    }
                    v6w0Var.m197263l(iM197242F4);
                    i14++;
                    z = z2;
                    iM197238B = i15;
                    i13 = i17;
                    i = 0;
                }
                i12++;
                i = 0;
            }
            return new m6r0(i3 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM197238B + 1, i5, i6, i7, i8, i9, i10, i11, f, strM148828b);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing HEVC config", e);
        }
    }
}
