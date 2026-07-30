package p149l;

import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class icx0 {
    /* JADX INFO: renamed from: a */
    public abstract int mo13461a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract int mo13462b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Object mo13463c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract Object mo13464d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract Object mo13465e(Object obj, Object obj2);

    /* JADX INFO: renamed from: f */
    public abstract Object mo13466f();

    /* JADX INFO: renamed from: g */
    public abstract Object mo13467g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo13468h(Object obj, int i, int i2);

    /* JADX INFO: renamed from: i */
    public abstract void mo13469i(Object obj, int i, long j);

    /* JADX INFO: renamed from: j */
    public abstract void mo13470j(Object obj, int i, Object obj2);

    /* JADX INFO: renamed from: k */
    public abstract void mo13471k(Object obj, int i, zzgyl zzgylVar);

    /* JADX INFO: renamed from: l */
    public abstract void mo13472l(Object obj, int i, long j);

    /* JADX INFO: renamed from: m */
    public abstract void mo13473m(Object obj);

    /* JADX INFO: renamed from: n */
    public abstract void mo13474n(Object obj, Object obj2);

    /* JADX INFO: renamed from: o */
    public abstract void mo13475o(Object obj, Object obj2);

    /* JADX INFO: renamed from: p */
    public final boolean m135371p(Object obj, kbx0 kbx0Var) throws IOException {
        int iZzd = kbx0Var.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            mo13472l(obj, i, kbx0Var.zzl());
            return true;
        }
        if (i2 == 1) {
            mo13469i(obj, i, kbx0Var.zzk());
            return true;
        }
        if (i2 == 2) {
            mo13471k(obj, i, kbx0Var.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            mo13468h(obj, i, kbx0Var.zzf());
            return true;
        }
        Object objMo13466f = mo13466f();
        int i3 = i << 3;
        while (kbx0Var.zzc() != Integer.MAX_VALUE && m135371p(objMo13466f, kbx0Var)) {
        }
        if ((4 | i3) != kbx0Var.zzd()) {
            throw zzhag.zzb();
        }
        mo13467g(objMo13466f);
        mo13470j(obj, i, objMo13466f);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo13476q(kbx0 kbx0Var);

    /* JADX INFO: renamed from: r */
    public abstract void mo13477r(Object obj, z7x0 z7x0Var) throws IOException;
}
