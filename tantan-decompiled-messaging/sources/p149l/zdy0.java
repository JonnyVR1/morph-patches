package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2275w2;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zdy0 {

    /* JADX INFO: renamed from: a */
    public final bnt0 f202748a;

    /* JADX INFO: renamed from: b */
    public zzgaa f202749b = zzgaa.zzl();

    /* JADX INFO: renamed from: c */
    public zzgad f202750c = zzgad.zzd();

    /* JADX INFO: renamed from: d */
    @Nullable
    public eqy0 f202751d;

    /* JADX INFO: renamed from: e */
    public eqy0 f202752e;

    /* JADX INFO: renamed from: f */
    public eqy0 f202753f;

    public zdy0(bnt0 bnt0Var) {
        this.f202748a = bnt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: j */
    public static eqy0 m218245j(ift0 ift0Var, zzgaa zzgaaVar, @Nullable eqy0 eqy0Var, bnt0 bnt0Var) {
        xqt0 xqt0VarZzn = ift0Var.zzn();
        int iZze = ift0Var.zze();
        Object objMo112553f = xqt0VarZzn.m210615o() ? null : xqt0VarZzn.mo112553f(iZze);
        int iM102862c = -1;
        if (!ift0Var.mo124675g() && !xqt0VarZzn.m210615o()) {
            iM102862c = xqt0VarZzn.mo112551d(iZze, bnt0Var, false).m102862c(ggw0.m126049F(ift0Var.zzk()));
        }
        int i = iM102862c;
        for (int i2 = 0; i2 < zzgaaVar.size(); i2++) {
            eqy0 eqy0Var2 = (eqy0) zzgaaVar.get(i2);
            if (m218246m(eqy0Var2, objMo112553f, ift0Var.mo124675g(), ift0Var.zzb(), ift0Var.zzc(), i)) {
                return eqy0Var2;
            }
        }
        if (zzgaaVar.isEmpty() && eqy0Var != null && m218246m(eqy0Var, objMo112553f, ift0Var.mo124675g(), ift0Var.zzb(), ift0Var.zzc(), i)) {
            return eqy0Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m218246m(eqy0 eqy0Var, @Nullable Object obj, boolean z, int i, int i2, int i3) {
        if (!eqy0Var.f92867a.equals(obj)) {
            return false;
        }
        int i4 = eqy0Var.f92868b;
        if (z) {
            return i4 == i && eqy0Var.f92869c == i2;
        }
        return i4 == -1 && eqy0Var.f92871e == i3;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final xqt0 m218247a(eqy0 eqy0Var) {
        return (xqt0) this.f202750c.get(eqy0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final eqy0 m218248b() {
        return this.f202751d;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final eqy0 m218249c() {
        Object next;
        Object obj;
        if (this.f202749b.isEmpty()) {
            return null;
        }
        zzgaa zzgaaVar = this.f202749b;
        if (zzgaaVar == null) {
            Iterator<E> it = zzgaaVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzgaaVar.isEmpty()) {
                lmr.m150601a();
                return null;
            }
            obj = zzgaaVar.get(zzgaaVar.size() - 1);
        }
        return (eqy0) obj;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final eqy0 m218250d() {
        return this.f202752e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final eqy0 m218251e() {
        return this.f202753f;
    }

    /* JADX INFO: renamed from: g */
    public final void m218252g(ift0 ift0Var) {
        this.f202751d = m218245j(ift0Var, this.f202749b, this.f202752e, this.f202748a);
    }

    /* JADX INFO: renamed from: h */
    public final void m218253h(List list, @Nullable eqy0 eqy0Var, ift0 ift0Var) {
        this.f202749b = zzgaa.zzj(list);
        if (!list.isEmpty()) {
            this.f202752e = (eqy0) list.get(0);
            eqy0Var.getClass();
            this.f202753f = eqy0Var;
        }
        if (this.f202751d == null) {
            this.f202751d = m218245j(ift0Var, this.f202749b, this.f202752e, this.f202748a);
        }
        m218256l(ift0Var.zzn());
    }

    /* JADX INFO: renamed from: i */
    public final void m218254i(ift0 ift0Var) {
        this.f202751d = m218245j(ift0Var, this.f202749b, this.f202752e, this.f202748a);
        m218256l(ift0Var.zzn());
    }

    /* JADX INFO: renamed from: k */
    public final void m218255k(C2275w2 c2275w2, @Nullable eqy0 eqy0Var, xqt0 xqt0Var) {
        if (eqy0Var == null) {
            return;
        }
        if (xqt0Var.mo112550a(eqy0Var.f92867a) != -1) {
            c2275w2.m13419a(eqy0Var, xqt0Var);
            return;
        }
        xqt0 xqt0Var2 = (xqt0) this.f202750c.get(eqy0Var);
        if (xqt0Var2 != null) {
            c2275w2.m13419a(eqy0Var, xqt0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m218256l(xqt0 xqt0Var) {
        zzgaa zzgaaVar;
        C2275w2 c2275w2 = new C2275w2();
        if (this.f202749b.isEmpty()) {
            m218255k(c2275w2, this.f202752e, xqt0Var);
            if (!efw0.m116096a(this.f202753f, this.f202752e)) {
                m218255k(c2275w2, this.f202753f, xqt0Var);
            }
            if (!efw0.m116096a(this.f202751d, this.f202752e) && !efw0.m116096a(this.f202751d, this.f202753f)) {
                m218255k(c2275w2, this.f202751d, xqt0Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = this.f202749b.size();
                zzgaaVar = this.f202749b;
                if (i >= size) {
                    break;
                }
                m218255k(c2275w2, (eqy0) zzgaaVar.get(i), xqt0Var);
                i++;
            }
            if (!zzgaaVar.contains(this.f202751d)) {
                m218255k(c2275w2, this.f202751d, xqt0Var);
            }
        }
        this.f202750c = c2275w2.m13421c();
    }
}
