package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.livingroom.R;
import l.d30;
import l.w8u;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hhn0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15714a(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15715b() {
    }

    /* JADX INFO: renamed from: c */
    public static void m15716c(Act act, boolean z, final d30 d30Var) {
        act.dialog().G0(w8u.t(z ? R.string.rb : R.string.pb)).F(w8u.t(z ? R.string.sb : R.string.qb)).v0(ypv.f23200e.getString(R.string.o2), new Runnable() { // from class: l.fhn0
            @Override // java.lang.Runnable
            public final void run() {
                hhn0.m15714a(d30Var);
            }
        }).n0(ypv.f23200e.getString(R.string.kb), new Runnable() { // from class: l.ghn0
            @Override // java.lang.Runnable
            public final void run() {
                hhn0.m15715b();
            }
        }).q(true).z0();
    }
}
