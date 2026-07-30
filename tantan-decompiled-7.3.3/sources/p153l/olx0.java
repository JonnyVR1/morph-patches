package p153l;

import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class olx0 {
    /* JADX INFO: renamed from: a */
    public abstract int mo13515a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract int mo13516b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Object mo13517c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract Object mo13518d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract Object mo13519e(Object obj, Object obj2);

    /* JADX INFO: renamed from: f */
    public abstract Object mo13520f();

    /* JADX INFO: renamed from: g */
    public abstract Object mo13521g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo13522h(Object obj, int i, int i2);

    /* JADX INFO: renamed from: i */
    public abstract void mo13523i(Object obj, int i, long j);

    /* JADX INFO: renamed from: j */
    public abstract void mo13524j(Object obj, int i, Object obj2);

    /* JADX INFO: renamed from: k */
    public abstract void mo13525k(Object obj, int i, zzgyl zzgylVar);

    /* JADX INFO: renamed from: l */
    public abstract void mo13526l(Object obj, int i, long j);

    /* JADX INFO: renamed from: m */
    public abstract void mo13527m(Object obj);

    /* JADX INFO: renamed from: n */
    public abstract void mo13528n(Object obj, Object obj2);

    /* JADX INFO: renamed from: o */
    public abstract void mo13529o(Object obj, Object obj2);

    /* JADX INFO: renamed from: p */
    public final boolean m168175p(Object obj, qkx0 qkx0Var) throws IOException {
        int iZzd = qkx0Var.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            mo13526l(obj, i, qkx0Var.zzl());
            return true;
        }
        if (i2 == 1) {
            mo13523i(obj, i, qkx0Var.zzk());
            return true;
        }
        if (i2 == 2) {
            mo13525k(obj, i, qkx0Var.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.zza();
            }
            mo13522h(obj, i, qkx0Var.zzf());
            return true;
        }
        Object objMo13520f = mo13520f();
        int i3 = i << 3;
        while (qkx0Var.zzc() != Integer.MAX_VALUE && m168175p(objMo13520f, qkx0Var)) {
        }
        if ((4 | i3) != qkx0Var.zzd()) {
            throw zzhag.zzb();
        }
        mo13521g(objMo13520f);
        mo13524j(obj, i, objMo13520f);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo13530q(qkx0 qkx0Var);

    /* JADX INFO: renamed from: r */
    public abstract void mo13531r(Object obj, fhx0 fhx0Var) throws IOException;
}
