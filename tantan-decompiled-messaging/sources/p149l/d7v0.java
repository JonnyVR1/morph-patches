package p149l;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.C2268v3;
import com.google.android.gms.internal.ads.zzeml;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class d7v0 {

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public final C2268v3 f84792c;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public z7v0 f84795f;

    /* JADX INFO: renamed from: h */
    public final String f84797h;

    /* JADX INFO: renamed from: i */
    public final int f84798i;

    /* JADX INFO: renamed from: j */
    public final y7v0 f84799j;

    /* JADX INFO: renamed from: k */
    public kxv0 f84800k;

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final Map f84790a = new HashMap();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f84791b = new ArrayList();

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final List f84793d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public final Set f84794e = new HashSet();

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public int f84796g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public d7v0(vxv0 vxv0Var, y7v0 y7v0Var, C2268v3 c2268v3) {
        this.f84798i = vxv0Var.f183478b.f178773b.f141069p;
        this.f84799j = y7v0Var;
        this.f84792c = c2268v3;
        this.f84797h = e8v0.m115305b(vxv0Var);
        List list = vxv0Var.f183478b.f178772a;
        for (int i = 0; i < list.size(); i++) {
            this.f84790a.put((kxv0) list.get(i), Integer.valueOf(i));
        }
        this.f84791b.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized kxv0 m110251a() {
        for (int i = 0; i < this.f84791b.size(); i++) {
            try {
                kxv0 kxv0Var = (kxv0) this.f84791b.get(i);
                String str = kxv0Var.f125222t0;
                if (!this.f84794e.contains(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f84794e.add(str);
                    }
                    this.f84793d.add(kxv0Var);
                    return (kxv0) this.f84791b.remove(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m110252b(Throwable th, kxv0 kxv0Var) {
        this.f84793d.remove(kxv0Var);
        this.f84794e.remove(kxv0Var.f125222t0);
        if (m110254d() || m110259i()) {
            return;
        }
        m110256f();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m110253c(z7v0 z7v0Var, kxv0 kxv0Var) {
        this.f84793d.remove(kxv0Var);
        if (m110254d()) {
            z7v0Var.mo117797a();
            return;
        }
        Integer num = (Integer) this.f84790a.get(kxv0Var);
        int iIntValue = num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (iIntValue > this.f84796g) {
            this.f84799j.m213335m(kxv0Var);
            return;
        }
        if (this.f84795f != null) {
            this.f84799j.m213335m(this.f84800k);
        }
        this.f84796g = iIntValue;
        this.f84795f = z7v0Var;
        this.f84800k = kxv0Var;
        if (m110259i()) {
            return;
        }
        m110256f();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m110254d() {
        return this.f84792c.isDone();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m110255e() {
        if (!m110254d()) {
            List list = this.f84793d;
            if (list.size() < this.f84798i && m110257g(false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m110256f() {
        this.f84799j.m213331i(this.f84800k);
        z7v0 z7v0Var = this.f84795f;
        C2268v3 c2268v3 = this.f84792c;
        if (z7v0Var != null) {
            c2268v3.mo13021e(z7v0Var);
        } else {
            c2268v3.mo13022f(new zzeml(3, this.f84797h));
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m110257g(boolean z) {
        try {
            for (kxv0 kxv0Var : this.f84791b) {
                Integer num = (Integer) this.f84790a.get(kxv0Var);
                int iIntValue = num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (z || !this.f84794e.contains(kxv0Var.f125222t0)) {
                    int i = this.f84796g;
                    if (iIntValue < i) {
                        return true;
                    }
                    if (iIntValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m110258h() {
        try {
            Iterator it = this.f84793d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f84790a.get((kxv0) it.next());
                if ((num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER) < this.f84796g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m110259i() {
        return m110257g(true) || m110258h();
    }
}
