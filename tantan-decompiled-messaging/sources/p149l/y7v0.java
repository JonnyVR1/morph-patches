package p149l;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class y7v0 {

    /* JADX INFO: renamed from: a */
    public final Clock f196738a;

    /* JADX INFO: renamed from: b */
    public final a8v0 f196739b;

    /* JADX INFO: renamed from: c */
    public final s5w0 f196740c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final LinkedHashMap f196741d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final boolean f196742e = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132067S6)).booleanValue();

    /* JADX INFO: renamed from: f */
    public final n3v0 f196743f;

    /* JADX INFO: renamed from: g */
    public boolean f196744g;

    /* JADX INFO: renamed from: h */
    public long f196745h;

    /* JADX INFO: renamed from: i */
    public long f196746i;

    public y7v0(Clock clock, a8v0 a8v0Var, n3v0 n3v0Var, s5w0 s5w0Var) {
        this.f196738a = clock;
        this.f196739b = a8v0Var;
        this.f196743f = n3v0Var;
        this.f196740c = s5w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m213328a() {
        return this.f196745h;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized gnr m213329f(vxv0 vxv0Var, kxv0 kxv0Var, gnr gnrVar, o5w0 o5w0Var) {
        nxv0 nxv0Var = vxv0Var.f183478b.f178773b;
        long jElapsedRealtime = this.f196738a.elapsedRealtime();
        String str = kxv0Var.f125227x;
        if (str != null) {
            this.f196741d.put(kxv0Var, new x7v0(str, kxv0Var.f125196g0, 9, 0L, null));
            jmw0.m142245r(gnrVar, new w7v0(this, jElapsedRealtime, nxv0Var, kxv0Var, str, o5w0Var, vxv0Var), i3t0.f111377f);
        }
        return gnrVar;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized String m213330g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f196741d.entrySet().iterator();
            while (it.hasNext()) {
                x7v0 x7v0Var = (x7v0) ((Map.Entry) it.next()).getValue();
                if (x7v0Var.f191382c != Integer.MAX_VALUE) {
                    arrayList.add(x7v0Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m213331i(@Nullable kxv0 kxv0Var) {
        try {
            this.f196745h = this.f196738a.elapsedRealtime() - this.f196746i;
            if (kxv0Var != null) {
                this.f196743f.m157781e(kxv0Var);
            }
            this.f196744g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m213332j() {
        this.f196745h = this.f196738a.elapsedRealtime() - this.f196746i;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m213333k(List list) {
        this.f196746i = this.f196738a.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kxv0 kxv0Var = (kxv0) it.next();
            if (!TextUtils.isEmpty(kxv0Var.f125227x)) {
                this.f196741d.put(kxv0Var, new x7v0(kxv0Var.f125227x, kxv0Var.f125196g0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m213334l() {
        this.f196746i = this.f196738a.elapsedRealtime();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m213335m(kxv0 kxv0Var) {
        x7v0 x7v0Var = (x7v0) this.f196741d.get(kxv0Var);
        if (x7v0Var == null || this.f196744g) {
            return;
        }
        x7v0Var.f191382c = 8;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m213336q(kxv0 kxv0Var) {
        x7v0 x7v0Var = (x7v0) this.f196741d.get(kxv0Var);
        if (x7v0Var == null) {
            return false;
        }
        return x7v0Var.f191382c == 8;
    }
}
