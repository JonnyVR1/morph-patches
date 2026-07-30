package p149l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b6y0<T, B> {

    /* JADX INFO: renamed from: a */
    public static volatile int f73890a = 100;

    /* JADX INFO: renamed from: a */
    public abstract int mo14525a(T t);

    /* JADX INFO: renamed from: b */
    public abstract B mo14526b();

    /* JADX INFO: renamed from: c */
    public abstract T mo14527c(T t, T t2);

    /* JADX INFO: renamed from: d */
    public abstract void mo14528d(B b, int i, int i2);

    /* JADX INFO: renamed from: e */
    public abstract void mo14529e(B b, int i, long j);

    /* JADX INFO: renamed from: f */
    public abstract void mo14530f(B b, int i, zzik zzikVar);

    /* JADX INFO: renamed from: g */
    public abstract void mo14531g(B b, int i, T t);

    /* JADX INFO: renamed from: h */
    public abstract void mo14532h(T t, m8y0 m8y0Var) throws IOException;

    /* JADX INFO: renamed from: i */
    public final boolean m100481i(B b, t2y0 t2y0Var, int i) throws IOException {
        int iZzd = t2y0Var.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            mo14535l(b, i2, t2y0Var.zzl());
            return true;
        }
        if (i3 == 1) {
            mo14529e(b, i2, t2y0Var.zzk());
            return true;
        }
        if (i3 == 2) {
            mo14530f(b, i2, t2y0Var.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzkb.zza();
            }
            mo14528d(b, i2, t2y0Var.zzf());
            return true;
        }
        B bMo14526b = mo14526b();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= f73890a) {
            throw zzkb.zzh();
        }
        while (t2y0Var.zzc() != Integer.MAX_VALUE && m100481i(bMo14526b, t2y0Var, i5)) {
        }
        if (i4 != t2y0Var.zzd()) {
            throw zzkb.zzb();
        }
        mo14531g(b, i2, mo14541r(bMo14526b));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo14533j(t2y0 t2y0Var);

    /* JADX INFO: renamed from: k */
    public abstract int mo14534k(T t);

    /* JADX INFO: renamed from: l */
    public abstract void mo14535l(B b, int i, long j);

    /* JADX INFO: renamed from: m */
    public abstract void mo14536m(Object obj, B b);

    /* JADX INFO: renamed from: n */
    public abstract void mo14537n(T t, m8y0 m8y0Var) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract B mo14538o(Object obj);

    /* JADX INFO: renamed from: p */
    public abstract void mo14539p(Object obj, T t);

    /* JADX INFO: renamed from: q */
    public abstract T mo14540q(Object obj);

    /* JADX INFO: renamed from: r */
    public abstract T mo14541r(B b);

    /* JADX INFO: renamed from: s */
    public abstract void mo14542s(Object obj);
}
