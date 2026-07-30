package p153l;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class bdy0 {

    /* JADX INFO: renamed from: a */
    public final voy0 f76308a;

    /* JADX INFO: renamed from: e */
    public final ycy0 f76312e;

    /* JADX INFO: renamed from: h */
    public final wfy0 f76315h;

    /* JADX INFO: renamed from: i */
    public final usv0 f76316i;

    /* JADX INFO: renamed from: j */
    public boolean f76317j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public btx0 f76318k;

    /* JADX INFO: renamed from: l */
    public i2z0 f76319l = new i2z0(0);

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap f76310c = new IdentityHashMap();

    /* JADX INFO: renamed from: d */
    public final Map f76311d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List f76309b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap f76313f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Set f76314g = new HashSet();

    public bdy0(ycy0 ycy0Var, wfy0 wfy0Var, usv0 usv0Var, voy0 voy0Var) {
        this.f76308a = voy0Var;
        this.f76312e = ycy0Var;
        this.f76315h = wfy0Var;
        this.f76316i = usv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m103644a() {
        return this.f76309b.size();
    }

    /* JADX INFO: renamed from: b */
    public final d0u0 m103645b() {
        if (this.f76309b.isEmpty()) {
            return d0u0.f84608a;
        }
        int i = 0;
        int iMo113459c = 0;
        while (true) {
            int size = this.f76309b.size();
            List list = this.f76309b;
            if (i >= size) {
                return new pey0(list, this.f76319l);
            }
            ucy0 ucy0Var = (ucy0) list.get(i);
            ucy0Var.f178475d = iMo113459c;
            iMo113459c += ucy0Var.f178472a.m128355J().mo113459c();
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final d0u0 m103646c(int i, int i2, List list) {
        lev0.m153956d(i >= 0 && i <= i2 && i2 <= m103644a());
        lev0.m153956d(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((ucy0) this.f76309b.get(i3)).f178472a.mo128361m((trs0) list.get(i3 - i));
        }
        return m103645b();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m103647f(mzy0 mzy0Var, d0u0 d0u0Var) {
        this.f76312e.zzh();
    }

    /* JADX INFO: renamed from: g */
    public final void m103648g(@Nullable btx0 btx0Var) {
        lev0.m153958f(!this.f76317j);
        this.f76318k = btx0Var;
        for (int i = 0; i < this.f76309b.size(); i++) {
            ucy0 ucy0Var = (ucy0) this.f76309b.get(i);
            m103663v(ucy0Var);
            this.f76314g.add(ucy0Var);
        }
        this.f76317j = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m103649h() {
        for (rcy0 rcy0Var : this.f76313f.values()) {
            try {
                rcy0Var.f162266a.mo160939h(rcy0Var.f162267b);
            } catch (RuntimeException e) {
                y4w0.m214276d("MediaSourceList", "Failed to release child source.", e);
            }
            rcy0Var.f162266a.mo160936e(rcy0Var.f162268c);
            rcy0Var.f162266a.mo160934a(rcy0Var.f162268c);
        }
        this.f76313f.clear();
        this.f76314g.clear();
        this.f76317j = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m103650i(izy0 izy0Var) {
        ucy0 ucy0Var = (ucy0) this.f76310c.remove(izy0Var);
        ucy0Var.getClass();
        ucy0Var.f178472a.mo128360k(izy0Var);
        ucy0Var.f178474c.remove(((czy0) izy0Var).f84507a);
        if (!this.f76310c.isEmpty()) {
            m103661t();
        }
        m103662u(ucy0Var);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m103651j() {
        return this.f76317j;
    }

    /* JADX INFO: renamed from: k */
    public final d0u0 m103652k(int i, List list, i2z0 i2z0Var) {
        if (!list.isEmpty()) {
            this.f76319l = i2z0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                ucy0 ucy0Var = (ucy0) list.get(i2 - i);
                if (i2 > 0) {
                    ucy0 ucy0Var2 = (ucy0) this.f76309b.get(i2 - 1);
                    ucy0Var.m195453a(ucy0Var2.f178475d + ucy0Var2.f178472a.m128355J().mo113459c());
                } else {
                    ucy0Var.m195453a(0);
                }
                m103659r(i2, ucy0Var.f178472a.m128355J().mo113459c());
                this.f76309b.add(i2, ucy0Var);
                this.f76311d.put(ucy0Var.f178473b, ucy0Var);
                if (this.f76317j) {
                    m103663v(ucy0Var);
                    if (this.f76310c.isEmpty()) {
                        this.f76314g.add(ucy0Var);
                    } else {
                        m103660s(ucy0Var);
                    }
                }
            }
        }
        return m103645b();
    }

    /* JADX INFO: renamed from: l */
    public final d0u0 m103653l(int i, int i2, int i3, i2z0 i2z0Var) {
        lev0.m153956d(m103644a() >= 0);
        this.f76319l = null;
        return m103645b();
    }

    /* JADX INFO: renamed from: m */
    public final d0u0 m103654m(int i, int i2, i2z0 i2z0Var) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= m103644a()) {
            z = true;
        }
        lev0.m153956d(z);
        this.f76319l = i2z0Var;
        m103664w(i, i2);
        return m103645b();
    }

    /* JADX INFO: renamed from: n */
    public final d0u0 m103655n(List list, i2z0 i2z0Var) {
        m103664w(0, this.f76309b.size());
        return m103652k(this.f76309b.size(), list, i2z0Var);
    }

    /* JADX INFO: renamed from: o */
    public final d0u0 m103656o(i2z0 i2z0Var) {
        int iM103644a = m103644a();
        if (i2z0Var.m138258c() != iM103644a) {
            i2z0Var = i2z0Var.m138261f().m138262g(0, iM103644a);
        }
        this.f76319l = i2z0Var;
        return m103645b();
    }

    /* JADX INFO: renamed from: p */
    public final izy0 m103657p(kzy0 kzy0Var, c6z0 c6z0Var, long j) {
        int i = pey0.f152134o;
        Object obj = kzy0Var.f129476a;
        Object obj2 = ((Pair) obj).first;
        kzy0 kzy0VarM152239a = kzy0Var.m152239a(((Pair) obj).second);
        ucy0 ucy0Var = (ucy0) this.f76311d.get(obj2);
        ucy0Var.getClass();
        this.f76314g.add(ucy0Var);
        rcy0 rcy0Var = (rcy0) this.f76313f.get(ucy0Var);
        if (rcy0Var != null) {
            rcy0Var.f162266a.mo160942n(rcy0Var.f162267b);
        }
        ucy0Var.f178474c.add(kzy0VarM152239a);
        czy0 czy0VarM128356K = ucy0Var.f178472a.mo128359i(kzy0VarM152239a, c6z0Var, j);
        this.f76310c.put(czy0VarM128356K, ucy0Var);
        m103661t();
        return czy0VarM128356K;
    }

    /* JADX INFO: renamed from: q */
    public final i2z0 m103658q() {
        return this.f76319l;
    }

    /* JADX INFO: renamed from: r */
    public final void m103659r(int i, int i2) {
        while (i < this.f76309b.size()) {
            ((ucy0) this.f76309b.get(i)).f178475d += i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m103660s(ucy0 ucy0Var) {
        rcy0 rcy0Var = (rcy0) this.f76313f.get(ucy0Var);
        if (rcy0Var != null) {
            rcy0Var.f162266a.mo160941l(rcy0Var.f162267b);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m103661t() {
        Iterator it = this.f76314g.iterator();
        while (it.hasNext()) {
            ucy0 ucy0Var = (ucy0) it.next();
            if (ucy0Var.f178474c.isEmpty()) {
                m103660s(ucy0Var);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m103662u(ucy0 ucy0Var) {
        if (ucy0Var.f178476e && ucy0Var.f178474c.isEmpty()) {
            rcy0 rcy0Var = (rcy0) this.f76313f.remove(ucy0Var);
            rcy0Var.getClass();
            rcy0Var.f162266a.mo160939h(rcy0Var.f162267b);
            rcy0Var.f162266a.mo160936e(rcy0Var.f162268c);
            rcy0Var.f162266a.mo160934a(rcy0Var.f162268c);
            this.f76314g.remove(ucy0Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m103663v(ucy0 ucy0Var) {
        fzy0 fzy0Var = ucy0Var.f178472a;
        lzy0 lzy0Var = new lzy0() { // from class: l.kby0
            @Override // p153l.lzy0
            /* JADX INFO: renamed from: a */
            public final void mo149093a(mzy0 mzy0Var, d0u0 d0u0Var) {
                this.f125004a.m103647f(mzy0Var, d0u0Var);
            }
        };
        ncy0 ncy0Var = new ncy0(this, ucy0Var);
        this.f76313f.put(ucy0Var, new rcy0(fzy0Var, lzy0Var, ncy0Var));
        fzy0Var.mo160937f(new Handler(mpw0.m159400M(), null), ncy0Var);
        fzy0Var.mo160940j(new Handler(mpw0.m159400M(), null), ncy0Var);
        fzy0Var.mo160938g(lzy0Var, this.f76318k, this.f76308a);
    }

    /* JADX INFO: renamed from: w */
    public final void m103664w(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            ucy0 ucy0Var = (ucy0) this.f76309b.remove(i2);
            this.f76311d.remove(ucy0Var.f178473b);
            m103659r(i2, -ucy0Var.f178472a.m128355J().mo113459c());
            ucy0Var.f178476e = true;
            if (this.f76317j) {
                m103662u(ucy0Var);
            }
        }
    }
}
