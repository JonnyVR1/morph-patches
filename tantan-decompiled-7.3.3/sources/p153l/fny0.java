package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2298w2;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fny0 {

    /* JADX INFO: renamed from: a */
    public final hwt0 f99985a;

    /* JADX INFO: renamed from: b */
    public zzgaa f99986b = zzgaa.zzl();

    /* JADX INFO: renamed from: c */
    public zzgad f99987c = zzgad.zzd();

    /* JADX INFO: renamed from: d */
    @Nullable
    public kzy0 f99988d;

    /* JADX INFO: renamed from: e */
    public kzy0 f99989e;

    /* JADX INFO: renamed from: f */
    public kzy0 f99990f;

    public fny0(hwt0 hwt0Var) {
        this.f99985a = hwt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: j */
    public static kzy0 m126404j(oot0 oot0Var, zzgaa zzgaaVar, @Nullable kzy0 kzy0Var, hwt0 hwt0Var) {
        d0u0 d0u0VarZzn = oot0Var.zzn();
        int iZze = oot0Var.zze();
        Object objMo113460f = d0u0VarZzn.m113469o() ? null : d0u0VarZzn.mo113460f(iZze);
        int iM137507c = -1;
        if (!oot0Var.mo158180g() && !d0u0VarZzn.m113469o()) {
            iM137507c = d0u0VarZzn.mo107662d(iZze, hwt0Var, false).m137507c(mpw0.m159393F(oot0Var.zzk()));
        }
        int i = iM137507c;
        for (int i2 = 0; i2 < zzgaaVar.size(); i2++) {
            kzy0 kzy0Var2 = (kzy0) zzgaaVar.get(i2);
            if (m126405m(kzy0Var2, objMo113460f, oot0Var.mo158180g(), oot0Var.zzb(), oot0Var.zzc(), i)) {
                return kzy0Var2;
            }
        }
        if (zzgaaVar.isEmpty() && kzy0Var != null && m126405m(kzy0Var, objMo113460f, oot0Var.mo158180g(), oot0Var.zzb(), oot0Var.zzc(), i)) {
            return kzy0Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m126405m(kzy0 kzy0Var, @Nullable Object obj, boolean z, int i, int i2, int i3) {
        if (!kzy0Var.f129476a.equals(obj)) {
            return false;
        }
        int i4 = kzy0Var.f129477b;
        if (z) {
            return i4 == i && kzy0Var.f129478c == i2;
        }
        return i4 == -1 && kzy0Var.f129480e == i3;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final d0u0 m126406a(kzy0 kzy0Var) {
        return (d0u0) this.f99987c.get(kzy0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final kzy0 m126407b() {
        return this.f99988d;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final kzy0 m126408c() {
        Object next;
        Object obj;
        if (this.f99986b.isEmpty()) {
            return null;
        }
        zzgaa zzgaaVar = this.f99986b;
        if (zzgaaVar == null) {
            Iterator<E> it = zzgaaVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzgaaVar.isEmpty()) {
                mor.m159308a();
                return null;
            }
            obj = zzgaaVar.get(zzgaaVar.size() - 1);
        }
        return (kzy0) obj;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final kzy0 m126409d() {
        return this.f99989e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final kzy0 m126410e() {
        return this.f99990f;
    }

    /* JADX INFO: renamed from: g */
    public final void m126411g(oot0 oot0Var) {
        this.f99988d = m126404j(oot0Var, this.f99986b, this.f99989e, this.f99985a);
    }

    /* JADX INFO: renamed from: h */
    public final void m126412h(List list, @Nullable kzy0 kzy0Var, oot0 oot0Var) {
        this.f99986b = zzgaa.zzj(list);
        if (!list.isEmpty()) {
            this.f99989e = (kzy0) list.get(0);
            kzy0Var.getClass();
            this.f99990f = kzy0Var;
        }
        if (this.f99988d == null) {
            this.f99988d = m126404j(oot0Var, this.f99986b, this.f99989e, this.f99985a);
        }
        m126415l(oot0Var.zzn());
    }

    /* JADX INFO: renamed from: i */
    public final void m126413i(oot0 oot0Var) {
        this.f99988d = m126404j(oot0Var, this.f99986b, this.f99989e, this.f99985a);
        m126415l(oot0Var.zzn());
    }

    /* JADX INFO: renamed from: k */
    public final void m126414k(C2298w2 c2298w2, @Nullable kzy0 kzy0Var, d0u0 d0u0Var) {
        if (kzy0Var == null) {
            return;
        }
        if (d0u0Var.mo113457a(kzy0Var.f129476a) != -1) {
            c2298w2.m13473a(kzy0Var, d0u0Var);
            return;
        }
        d0u0 d0u0Var2 = (d0u0) this.f99987c.get(kzy0Var);
        if (d0u0Var2 != null) {
            c2298w2.m13473a(kzy0Var, d0u0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m126415l(d0u0 d0u0Var) {
        zzgaa zzgaaVar;
        C2298w2 c2298w2 = new C2298w2();
        if (this.f99986b.isEmpty()) {
            m126414k(c2298w2, this.f99989e, d0u0Var);
            if (!kow0.m150688a(this.f99990f, this.f99989e)) {
                m126414k(c2298w2, this.f99990f, d0u0Var);
            }
            if (!kow0.m150688a(this.f99988d, this.f99989e) && !kow0.m150688a(this.f99988d, this.f99990f)) {
                m126414k(c2298w2, this.f99988d, d0u0Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = this.f99986b.size();
                zzgaaVar = this.f99986b;
                if (i >= size) {
                    break;
                }
                m126414k(c2298w2, (kzy0) zzgaaVar.get(i), d0u0Var);
                i++;
            }
            if (!zzgaaVar.contains(this.f99988d)) {
                m126414k(c2298w2, this.f99988d, d0u0Var);
            }
        }
        this.f99987c = c2298w2.m13475c();
    }
}
