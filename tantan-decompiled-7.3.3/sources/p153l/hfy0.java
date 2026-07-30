package p153l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzkb;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hfy0<T, B> {

    /* JADX INFO: renamed from: a */
    public static volatile int f109355a = 100;

    /* JADX INFO: renamed from: a */
    public abstract int mo14579a(T t);

    /* JADX INFO: renamed from: b */
    public abstract B mo14580b();

    /* JADX INFO: renamed from: c */
    public abstract T mo14581c(T t, T t2);

    /* JADX INFO: renamed from: d */
    public abstract void mo14582d(B b, int i, int i2);

    /* JADX INFO: renamed from: e */
    public abstract void mo14583e(B b, int i, long j);

    /* JADX INFO: renamed from: f */
    public abstract void mo14584f(B b, int i, zzik zzikVar);

    /* JADX INFO: renamed from: g */
    public abstract void mo14585g(B b, int i, T t);

    /* JADX INFO: renamed from: h */
    public abstract void mo14586h(T t, shy0 shy0Var) throws IOException;

    /* JADX INFO: renamed from: i */
    public final boolean m134887i(B b, zby0 zby0Var, int i) throws IOException {
        int iZzd = zby0Var.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            mo14589l(b, i2, zby0Var.zzl());
            return true;
        }
        if (i3 == 1) {
            mo14583e(b, i2, zby0Var.zzk());
            return true;
        }
        if (i3 == 2) {
            mo14584f(b, i2, zby0Var.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzkb.zza();
            }
            mo14582d(b, i2, zby0Var.zzf());
            return true;
        }
        B bMo14580b = mo14580b();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= f109355a) {
            throw zzkb.zzh();
        }
        while (zby0Var.zzc() != Integer.MAX_VALUE && m134887i(bMo14580b, zby0Var, i5)) {
        }
        if (i4 != zby0Var.zzd()) {
            throw zzkb.zzb();
        }
        mo14585g(b, i2, mo14595r(bMo14580b));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo14587j(zby0 zby0Var);

    /* JADX INFO: renamed from: k */
    public abstract int mo14588k(T t);

    /* JADX INFO: renamed from: l */
    public abstract void mo14589l(B b, int i, long j);

    /* JADX INFO: renamed from: m */
    public abstract void mo14590m(Object obj, B b);

    /* JADX INFO: renamed from: n */
    public abstract void mo14591n(T t, shy0 shy0Var) throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract B mo14592o(Object obj);

    /* JADX INFO: renamed from: p */
    public abstract void mo14593p(Object obj, T t);

    /* JADX INFO: renamed from: q */
    public abstract T mo14594q(Object obj);

    /* JADX INFO: renamed from: r */
    public abstract T mo14595r(B b);

    /* JADX INFO: renamed from: s */
    public abstract void mo14596s(Object obj);
}
