package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fz00 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6532a(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6533b(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6534c(Act act, String str, String str2, String str3, String str4, final d30 d30Var, final d30 d30Var2) {
        Dialog dialogZ = act.dialog().G0(str).F(str2).u0(str3).m0(str4).B(true).z();
        dialogZ.o0(new Runnable() { // from class: l.dz00
            @Override // java.lang.Runnable
            public final void run() {
                fz00.m6532a(d30Var);
            }
        });
        dialogZ.m0(new Runnable() { // from class: l.ez00
            @Override // java.lang.Runnable
            public final void run() {
                fz00.m6533b(d30Var2);
            }
        });
        dialogZ.show();
    }
}
