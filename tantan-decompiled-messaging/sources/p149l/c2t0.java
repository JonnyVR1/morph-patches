package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class c2t0 implements tyr0 {

    /* JADX INFO: renamed from: b */
    public final aiw0 f78386b;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final z1t0 f78388d;

    /* JADX INFO: renamed from: a */
    public final Object f78385a = new Object();

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final HashSet f78389e = new HashSet();

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public final HashSet f78390f = new HashSet();

    /* JADX INFO: renamed from: g */
    public boolean f78391g = false;

    /* JADX INFO: renamed from: c */
    public final a2t0 f78387c = new a2t0();

    public c2t0(String str, aiw0 aiw0Var) {
        this.f78388d = new z1t0(str, aiw0Var);
        this.f78386b = aiw0Var;
    }

    @Override // p149l.tyr0
    /* JADX INFO: renamed from: a */
    public final void mo104920a(boolean z) {
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
        aiw0 aiw0Var = this.f78386b;
        if (!z) {
            aiw0Var.mo96958q(jCurrentTimeMillis);
            this.f78386b.mo96945d(this.f78388d.f201098d);
            return;
        }
        long jZzd = jCurrentTimeMillis - aiw0Var.zzd();
        long jLongValue = ((Long) d1s0.m109677c().m144697a(m7s0.f132073T0)).longValue();
        z1t0 z1t0Var = this.f78388d;
        if (jZzd > jLongValue) {
            z1t0Var.f201098d = -1;
        } else {
            z1t0Var.f201098d = this.f78386b.zzc();
        }
        this.f78391g = true;
    }

    /* JADX INFO: renamed from: b */
    public final int m104921b() {
        int iM216803a;
        synchronized (this.f78385a) {
            iM216803a = this.f78388d.m216803a();
        }
        return iM216803a;
    }

    /* JADX INFO: renamed from: c */
    public final r1t0 m104922c(Clock clock, String str) {
        return new r1t0(clock, this, this.f78387c.m94623a(), str);
    }

    /* JADX INFO: renamed from: d */
    public final String m104923d() {
        return this.f78387c.m94624b();
    }

    /* JADX INFO: renamed from: e */
    public final void m104924e(r1t0 r1t0Var) {
        synchronized (this.f78385a) {
            this.f78389e.add(r1t0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m104925f() {
        synchronized (this.f78385a) {
            this.f78388d.m216805c();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m104926g() {
        synchronized (this.f78385a) {
            this.f78388d.m216806d();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m104927h() {
        synchronized (this.f78385a) {
            this.f78388d.m216807e();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m104928i() {
        synchronized (this.f78385a) {
            this.f78388d.m216808f();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m104929j(zzl zzlVar, long j) {
        synchronized (this.f78385a) {
            this.f78388d.m216809g(zzlVar, j);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m104930k() {
        synchronized (this.f78385a) {
            this.f78388d.m216810h();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m104931l(HashSet hashSet) {
        synchronized (this.f78385a) {
            this.f78389e.addAll(hashSet);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m104932m() {
        return this.f78391g;
    }

    /* JADX INFO: renamed from: n */
    public final Bundle m104933n(Context context, vzv0 vzv0Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.f78385a) {
            hashSet.addAll(this.f78389e);
            this.f78389e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f78388d.m216804b(context, this.f78387c.m94624b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f78390f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((r1t0) it2.next()).m177546a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        vzv0Var.m200788b(hashSet);
        return bundle;
    }
}
