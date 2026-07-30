package p149l;

import android.os.SystemClock;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class x6j0 {
    /* JADX INFO: renamed from: a */
    public static C1838d0 m207176a(ouw.C19047a c19047a, List<? extends r6j0>[] listArr) {
        boolean z;
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        for (int i = 0; i < c19047a.m166141d(); i++) {
            b6j0 b6j0VarM166143f = c19047a.m166143f(i);
            List<? extends r6j0> list = listArr[i];
            for (int i2 = 0; i2 < b6j0VarM166143f.f73826a; i2++) {
                z5j0 z5j0VarM100410b = b6j0VarM166143f.m100410b(i2);
                boolean z2 = c19047a.m166138a(i, i2, false) != 0;
                int i3 = z5j0VarM100410b.f201817a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < z5j0VarM100410b.f201817a; i4++) {
                    iArr[i4] = c19047a.m166144g(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        r6j0 r6j0Var = list.get(i5);
                        if (r6j0Var.mo11307h().equals(z5j0VarM100410b) && r6j0Var.mo11305f(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                c2781a.mo15683a(new C1838d0.a(z5j0VarM100410b, z2, iArr, zArr));
            }
        }
        b6j0 b6j0VarM166145h = c19047a.m166145h();
        for (int i6 = 0; i6 < b6j0VarM166145h.f73826a; i6++) {
            z5j0 z5j0VarM100410b2 = b6j0VarM166145h.m100410b(i6);
            int[] iArr2 = new int[z5j0VarM100410b2.f201817a];
            Arrays.fill(iArr2, 0);
            c2781a.mo15683a(new C1838d0.a(z5j0VarM100410b2, false, iArr2, new boolean[z5j0VarM100410b2.f201817a]));
        }
        return new C1838d0(c2781a.m15702m());
    }

    /* JADX INFO: renamed from: b */
    public static C1838d0 m207177b(ouw.C19047a c19047a, r6j0[] r6j0VarArr) {
        List[] listArr = new List[r6j0VarArr.length];
        for (int i = 0; i < r6j0VarArr.length; i++) {
            r6j0 r6j0Var = r6j0VarArr[i];
            listArr[i] = r6j0Var != null ? ImmutableList.m15686of(r6j0Var) : ImmutableList.m15685of();
        }
        return m207176a(c19047a, listArr);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2049c.a m207178c(o8f o8fVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = o8fVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (o8fVar.mo11300a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new InterfaceC2049c.a(1, 0, length, i);
    }
}
