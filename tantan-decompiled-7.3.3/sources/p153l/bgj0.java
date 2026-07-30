package p153l;

import android.os.SystemClock;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bgj0 {
    /* JADX INFO: renamed from: a */
    public static C1861d0 m104224a(nxw.C18992a c18992a, List<? extends vfj0>[] listArr) {
        boolean z;
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        for (int i = 0; i < c18992a.m165292d(); i++) {
            ffj0 ffj0VarM165294f = c18992a.m165294f(i);
            List<? extends vfj0> list = listArr[i];
            for (int i2 = 0; i2 < ffj0VarM165294f.f98785a; i2++) {
                dfj0 dfj0VarM125387b = ffj0VarM165294f.m125387b(i2);
                boolean z2 = c18992a.m165289a(i, i2, false) != 0;
                int i3 = dfj0VarM125387b.f88159a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < dfj0VarM125387b.f88159a; i4++) {
                    iArr[i4] = c18992a.m165295g(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        vfj0 vfj0Var = list.get(i5);
                        if (vfj0Var.mo11361h().equals(dfj0VarM125387b) && vfj0Var.mo11359f(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                c2804a.mo15737a(new C1861d0.a(dfj0VarM125387b, z2, iArr, zArr));
            }
        }
        ffj0 ffj0VarM165296h = c18992a.m165296h();
        for (int i6 = 0; i6 < ffj0VarM165296h.f98785a; i6++) {
            dfj0 dfj0VarM125387b2 = ffj0VarM165296h.m125387b(i6);
            int[] iArr2 = new int[dfj0VarM125387b2.f88159a];
            Arrays.fill(iArr2, 0);
            c2804a.mo15737a(new C1861d0.a(dfj0VarM125387b2, false, iArr2, new boolean[dfj0VarM125387b2.f88159a]));
        }
        return new C1861d0(c2804a.m15756m());
    }

    /* JADX INFO: renamed from: b */
    public static C1861d0 m104225b(nxw.C18992a c18992a, vfj0[] vfj0VarArr) {
        List[] listArr = new List[vfj0VarArr.length];
        for (int i = 0; i < vfj0VarArr.length; i++) {
            vfj0 vfj0Var = vfj0VarArr[i];
            listArr[i] = vfj0Var != null ? ImmutableList.m15740of(vfj0Var) : ImmutableList.m15739of();
        }
        return m104224a(c18992a, listArr);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2072c.a m104226c(u9f u9fVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = u9fVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (u9fVar.mo11354a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new InterfaceC2072c.a(1, 0, length, i);
    }
}
