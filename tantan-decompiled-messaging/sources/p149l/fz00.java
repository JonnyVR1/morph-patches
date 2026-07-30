package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class fz00 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m123812a(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m123813b(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m123814c(Act act, String str, String str2, String str3, String str4, final d30 d30Var, final d30 d30Var2) {
        Dialog dialogM20567z = act.dialog().m20507G0(str).m20504F(str2).m20558u0(str3).m20543m0(str4).m20496B(true).m20567z();
        dialogM20567z.m20474o0(new Runnable() { // from class: l.dz00
            @Override // java.lang.Runnable
            public final void run() {
                fz00.m123812a(d30Var);
            }
        });
        dialogM20567z.m20472m0(new Runnable() { // from class: l.ez00
            @Override // java.lang.Runnable
            public final void run() {
                fz00.m123813b(d30Var2);
            }
        });
        dialogM20567z.show();
    }
}
