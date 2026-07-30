package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jdr0 {

    /* JADX INFO: renamed from: a */
    public final List f120349a;

    /* JADX INFO: renamed from: b */
    public final int f120350b;

    /* JADX INFO: renamed from: c */
    public final int f120351c;

    /* JADX INFO: renamed from: d */
    public final int f120352d;

    /* JADX INFO: renamed from: e */
    public final int f120353e;

    /* JADX INFO: renamed from: f */
    public final int f120354f;

    /* JADX INFO: renamed from: g */
    public final int f120355g;

    /* JADX INFO: renamed from: h */
    public final int f120356h;

    /* JADX INFO: renamed from: i */
    public final int f120357i;

    /* JADX INFO: renamed from: j */
    public final float f120358j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f120359k;

    public jdr0(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, @Nullable String str) {
        this.f120349a = list;
        this.f120350b = i;
        this.f120351c = i2;
        this.f120352d = i3;
        this.f120353e = i4;
        this.f120354f = i5;
        this.f120355g = i6;
        this.f120356h = i7;
        this.f120357i = i8;
        this.f120358j = f;
        this.f120359k = str;
    }

    /* JADX INFO: renamed from: a */
    public static jdr0 m144500a(bgw0 bgw0Var) throws zzcc {
        String strM181490a;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        try {
            bgw0Var.m104270l(4);
            int iM104245B = bgw0Var.m104245B() & 3;
            int i8 = iM104245B + 1;
            if (i8 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM104245B2 = bgw0Var.m104245B() & 31;
            for (int i9 = 0; i9 < iM104245B2; i9++) {
                arrayList.add(m144501b(bgw0Var));
            }
            int iM104245B3 = bgw0Var.m104245B();
            for (int i10 = 0; i10 < iM104245B3; i10++) {
                arrayList.add(m144501b(bgw0Var));
            }
            if (iM104245B2 > 0) {
                p2x0 p2x0VarM204795e = w3x0.m204795e((byte[]) arrayList.get(0), iM104245B + 2, ((byte[]) arrayList.get(0)).length);
                int i11 = p2x0VarM204795e.f150334e;
                int i12 = p2x0VarM204795e.f150335f;
                int i13 = p2x0VarM204795e.f150337h + 8;
                int i14 = p2x0VarM204795e.f150338i + 8;
                int i15 = p2x0VarM204795e.f150339j;
                int i16 = p2x0VarM204795e.f150340k;
                int i17 = p2x0VarM204795e.f150341l;
                float f2 = p2x0VarM204795e.f150336g;
                strM181490a = rgv0.m181490a(p2x0VarM204795e.f150330a, p2x0VarM204795e.f150331b, p2x0VarM204795e.f150332c);
                i5 = i16;
                i6 = i17;
                f = f2;
                i3 = i13;
                i4 = i14;
                i7 = i15;
                i = i11;
                i2 = i12;
            } else {
                strM181490a = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                f = 1.0f;
                i7 = -1;
            }
            return new jdr0(arrayList, i8, i, i2, i3, i4, i7, i5, i6, f, strM181490a);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing AVC config", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m144501b(bgw0 bgw0Var) {
        int iM104249F = bgw0Var.m104249F();
        int iM104277s = bgw0Var.m104277s();
        bgw0Var.m104270l(iM104249F);
        return rgv0.m181492c(bgw0Var.m104271m(), iM104277s, iM104249F);
    }
}
