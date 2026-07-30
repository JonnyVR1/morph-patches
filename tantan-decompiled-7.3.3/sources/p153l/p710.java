package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class p710 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m171094a(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m171095b(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m171096c(Act act, String str, String str2, String str3, String str4, final x20 x20Var, final x20 x20Var2) {
        Dialog dialogM21566z = act.dialog().m21506G0(str).m21503F(str2).m21557u0(str3).m21542m0(str4).m21495B(true).m21566z();
        dialogM21566z.m21473o0(new Runnable() { // from class: l.n710
            @Override // java.lang.Runnable
            public final void run() {
                p710.m171094a(x20Var);
            }
        });
        dialogM21566z.m21471m0(new Runnable() { // from class: l.o710
            @Override // java.lang.Runnable
            public final void run() {
                p710.m171095b(x20Var2);
            }
        });
        dialogM21566z.show();
    }
}
