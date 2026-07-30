package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qwx0 implements uwx0 {
    /* JADX INFO: renamed from: d */
    public static <E> cvx0<E> m176931d(Object obj, long j) {
        return (cvx0) e6y0.m115123B(obj, j);
    }

    @Override // p149l.uwx0
    /* JADX INFO: renamed from: a */
    public final <E> void mo176932a(Object obj, Object obj2, long j) {
        cvx0 cvx0VarM176931d = m176931d(obj, j);
        cvx0 cvx0VarM176931d2 = m176931d(obj2, j);
        int size = cvx0VarM176931d.size();
        int size2 = cvx0VarM176931d2.size();
        if (size > 0 && size2 > 0) {
            if (!cvx0VarM176931d.zzc()) {
                cvx0VarM176931d = cvx0VarM176931d.zza(size2 + size);
            }
            cvx0VarM176931d.addAll(cvx0VarM176931d2);
        }
        if (size > 0) {
            cvx0VarM176931d2 = cvx0VarM176931d;
        }
        e6y0.m115137j(obj, j, cvx0VarM176931d2);
    }

    @Override // p149l.uwx0
    /* JADX INFO: renamed from: b */
    public final <L> List<L> mo176933b(Object obj, long j) {
        cvx0 cvx0VarM176931d = m176931d(obj, j);
        if (cvx0VarM176931d.zzc()) {
            return cvx0VarM176931d;
        }
        int size = cvx0VarM176931d.size();
        cvx0 cvx0VarZza = cvx0VarM176931d.zza(size == 0 ? 10 : size << 1);
        e6y0.m115137j(obj, j, cvx0VarZza);
        return cvx0VarZza;
    }

    @Override // p149l.uwx0
    /* JADX INFO: renamed from: c */
    public final void mo176934c(Object obj, long j) {
        m176931d(obj, j).zzb();
    }
}
