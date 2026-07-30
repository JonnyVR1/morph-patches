package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.livingroom.R;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a7n0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11259a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11260b(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11261c(Act act, final d30 d30Var) {
        act.dialog().G0(ypv.f23200e.getString(R.string.t9)).F(ypv.f23200e.getString(R.string.N4)).v0(ypv.f23200e.getString(R.string.o2), new Runnable() { // from class: l.y6n0
            @Override // java.lang.Runnable
            public final void run() {
                a7n0.m11260b(d30Var);
            }
        }).n0(ypv.f23200e.getString(R.string.kb), new Runnable() { // from class: l.z6n0
            @Override // java.lang.Runnable
            public final void run() {
                a7n0.m11259a();
            }
        }).q(true).z0();
    }
}
