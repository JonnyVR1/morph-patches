package p149l;

import com.google.android.gms.ads.internal.util.C2075b;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class g7t0 extends u0s0 {

    /* JADX INFO: renamed from: c */
    public final v5t0 f101432c;

    /* JADX INFO: renamed from: d */
    public final o7t0 f101433d;

    /* JADX INFO: renamed from: e */
    public final String f101434e;

    /* JADX INFO: renamed from: f */
    public final String[] f101435f;

    public g7t0(v5t0 v5t0Var, o7t0 o7t0Var, String str, String[] strArr) {
        this.f101432c = v5t0Var;
        this.f101433d = o7t0Var;
        this.f101434e = str;
        this.f101435f = strArr;
        vny0.m199061A().m129793c(this);
    }

    @Override // p149l.u0s0
    /* JADX INFO: renamed from: a */
    public final void mo123689a() {
        try {
            this.f101433d.mo129902v(this.f101434e, this.f101435f);
        } finally {
            C2075b.f9714l.post(new f7t0(this));
        }
    }

    @Override // p149l.u0s0
    /* JADX INFO: renamed from: b */
    public final gnr mo124731b() {
        return (((Boolean) d1s0.m109677c().m144697a(m7s0.f132110W1)).booleanValue() && (this.f101433d instanceof h8t0)) ? i3t0.f111376e.mo122102R(new Callable() { // from class: l.e7t0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f89748a.m124732d();
            }
        }) : super.mo124731b();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Boolean m124732d() throws Exception {
        return Boolean.valueOf(this.f101433d.mo129903w(this.f101434e, this.f101435f, this));
    }

    /* JADX INFO: renamed from: e */
    public final String m124733e() {
        return this.f101434e;
    }
}
