package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class w5y0 implements a6y0 {
    /* JADX INFO: renamed from: d */
    public static <E> i4y0<E> m205000d(Object obj, long j) {
        return (i4y0) kfy0.m149633B(obj, j);
    }

    @Override // p153l.a6y0
    /* JADX INFO: renamed from: a */
    public final <E> void mo96348a(Object obj, Object obj2, long j) {
        i4y0 i4y0VarM205000d = m205000d(obj, j);
        i4y0 i4y0VarM205000d2 = m205000d(obj2, j);
        int size = i4y0VarM205000d.size();
        int size2 = i4y0VarM205000d2.size();
        if (size > 0 && size2 > 0) {
            if (!i4y0VarM205000d.zzc()) {
                i4y0VarM205000d = i4y0VarM205000d.zza(size2 + size);
            }
            i4y0VarM205000d.addAll(i4y0VarM205000d2);
        }
        if (size > 0) {
            i4y0VarM205000d2 = i4y0VarM205000d;
        }
        kfy0.m149647j(obj, j, i4y0VarM205000d2);
    }

    @Override // p153l.a6y0
    /* JADX INFO: renamed from: b */
    public final <L> List<L> mo96349b(Object obj, long j) {
        i4y0 i4y0VarM205000d = m205000d(obj, j);
        if (i4y0VarM205000d.zzc()) {
            return i4y0VarM205000d;
        }
        int size = i4y0VarM205000d.size();
        i4y0 i4y0VarZza = i4y0VarM205000d.zza(size == 0 ? 10 : size << 1);
        kfy0.m149647j(obj, j, i4y0VarZza);
        return i4y0VarZza;
    }

    @Override // p153l.a6y0
    /* JADX INFO: renamed from: c */
    public final void mo96350c(Object obj, long j) {
        m205000d(obj, j).zzb();
    }
}
