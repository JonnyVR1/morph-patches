package p153l;

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
public final class ibt0 implements z7s0 {

    /* JADX INFO: renamed from: b */
    public final grw0 f114248b;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final fbt0 f114250d;

    /* JADX INFO: renamed from: a */
    public final Object f114247a = new Object();

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final HashSet f114251e = new HashSet();

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public final HashSet f114252f = new HashSet();

    /* JADX INFO: renamed from: g */
    public boolean f114253g = false;

    /* JADX INFO: renamed from: c */
    public final gbt0 f114249c = new gbt0();

    public ibt0(String str, grw0 grw0Var) {
        this.f114250d = new fbt0(str, grw0Var);
        this.f114248b = grw0Var;
    }

    @Override // p153l.z7s0
    /* JADX INFO: renamed from: a */
    public final void mo120216a(boolean z) {
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
        grw0 grw0Var = this.f114248b;
        if (!z) {
            grw0Var.mo131907q(jCurrentTimeMillis);
            this.f114248b.mo131894d(this.f114250d.f98148d);
            return;
        }
        long jZzd = jCurrentTimeMillis - grw0Var.zzd();
        long jLongValue = ((Long) jas0.m144075c().m176505a(sgs0.f168144T0)).longValue();
        fbt0 fbt0Var = this.f114250d;
        if (jZzd > jLongValue) {
            fbt0Var.f98148d = -1;
        } else {
            fbt0Var.f98148d = this.f114248b.zzc();
        }
        this.f114253g = true;
    }

    /* JADX INFO: renamed from: b */
    public final int m139401b() {
        int iM124929a;
        synchronized (this.f114247a) {
            iM124929a = this.f114250d.m124929a();
        }
        return iM124929a;
    }

    /* JADX INFO: renamed from: c */
    public final xat0 m139402c(Clock clock, String str) {
        return new xat0(clock, this, this.f114249c.m129804a(), str);
    }

    /* JADX INFO: renamed from: d */
    public final String m139403d() {
        return this.f114249c.m129805b();
    }

    /* JADX INFO: renamed from: e */
    public final void m139404e(xat0 xat0Var) {
        synchronized (this.f114247a) {
            this.f114251e.add(xat0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m139405f() {
        synchronized (this.f114247a) {
            this.f114250d.m124931c();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m139406g() {
        synchronized (this.f114247a) {
            this.f114250d.m124932d();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m139407h() {
        synchronized (this.f114247a) {
            this.f114250d.m124933e();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m139408i() {
        synchronized (this.f114247a) {
            this.f114250d.m124934f();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m139409j(zzl zzlVar, long j) {
        synchronized (this.f114247a) {
            this.f114250d.m124935g(zzlVar, j);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m139410k() {
        synchronized (this.f114247a) {
            this.f114250d.m124936h();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m139411l(HashSet hashSet) {
        synchronized (this.f114247a) {
            this.f114251e.addAll(hashSet);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m139412m() {
        return this.f114253g;
    }

    /* JADX INFO: renamed from: n */
    public final Bundle m139413n(Context context, b9w0 b9w0Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.f114247a) {
            hashSet.addAll(this.f114251e);
            this.f114251e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f114250d.m124930b(context, this.f114249c.m129805b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f114252f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((xat0) it2.next()).m209886a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        b9w0Var.m103144b(hashSet);
        return bundle;
    }
}
