package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class d4r0 {

    /* JADX INFO: renamed from: a */
    public final List f84337a;

    /* JADX INFO: renamed from: b */
    public final int f84338b;

    /* JADX INFO: renamed from: c */
    public final int f84339c;

    /* JADX INFO: renamed from: d */
    public final int f84340d;

    /* JADX INFO: renamed from: e */
    public final int f84341e;

    /* JADX INFO: renamed from: f */
    public final int f84342f;

    /* JADX INFO: renamed from: g */
    public final int f84343g;

    /* JADX INFO: renamed from: h */
    public final int f84344h;

    /* JADX INFO: renamed from: i */
    public final int f84345i;

    /* JADX INFO: renamed from: j */
    public final float f84346j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f84347k;

    public d4r0(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, @Nullable String str) {
        this.f84337a = list;
        this.f84338b = i;
        this.f84339c = i2;
        this.f84340d = i3;
        this.f84341e = i4;
        this.f84342f = i5;
        this.f84343g = i6;
        this.f84344h = i7;
        this.f84345i = i8;
        this.f84346j = f;
        this.f84347k = str;
    }

    /* JADX INFO: renamed from: a */
    public static d4r0 m109996a(v6w0 v6w0Var) throws zzcc {
        String strM148827a;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        try {
            v6w0Var.m197263l(4);
            int iM197238B = v6w0Var.m197238B() & 3;
            int i8 = iM197238B + 1;
            if (i8 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM197238B2 = v6w0Var.m197238B() & 31;
            for (int i9 = 0; i9 < iM197238B2; i9++) {
                arrayList.add(m109997b(v6w0Var));
            }
            int iM197238B3 = v6w0Var.m197238B();
            for (int i10 = 0; i10 < iM197238B3; i10++) {
                arrayList.add(m109997b(v6w0Var));
            }
            if (iM197238B2 > 0) {
                jtw0 jtw0VarM176662e = quw0.m176662e((byte[]) arrayList.get(0), iM197238B + 2, ((byte[]) arrayList.get(0)).length);
                int i11 = jtw0VarM176662e.f119682e;
                int i12 = jtw0VarM176662e.f119683f;
                int i13 = jtw0VarM176662e.f119685h + 8;
                int i14 = jtw0VarM176662e.f119686i + 8;
                int i15 = jtw0VarM176662e.f119687j;
                int i16 = jtw0VarM176662e.f119688k;
                int i17 = jtw0VarM176662e.f119689l;
                float f2 = jtw0VarM176662e.f119684g;
                strM148827a = l7v0.m148827a(jtw0VarM176662e.f119678a, jtw0VarM176662e.f119679b, jtw0VarM176662e.f119680c);
                i5 = i16;
                i6 = i17;
                f = f2;
                i3 = i13;
                i4 = i14;
                i7 = i15;
                i = i11;
                i2 = i12;
            } else {
                strM148827a = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                f = 1.0f;
                i7 = -1;
            }
            return new d4r0(arrayList, i8, i, i2, i3, i4, i7, i5, i6, f, strM148827a);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing AVC config", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m109997b(v6w0 v6w0Var) {
        int iM197242F = v6w0Var.m197242F();
        int iM197270s = v6w0Var.m197270s();
        v6w0Var.m197263l(iM197242F);
        return l7v0.m148829c(v6w0Var.m197264m(), iM197270s, iM197242F);
    }
}
