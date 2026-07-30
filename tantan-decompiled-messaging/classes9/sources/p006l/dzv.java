package p006l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginstrategy.C0072a;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class dzv implements oul {

    /* JADX INFO: renamed from: a */
    public List<oul> f10673a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public oul f10674b;

    /* JADX INFO: renamed from: l.dzv$a */
    public static class C0661a extends dzv {
        public C0661a(Act act) {
            m14324e(act);
        }

        /* JADX INFO: renamed from: e */
        public void m14324e(Act act) {
            this.f10673a.add(new C0072a(act));
            this.f10673a.add(new c0n(act));
        }
    }

    /* JADX INFO: renamed from: c */
    public static dzv m14322c(Act act) {
        return new C0661a(act);
    }

    @Override // p006l.oul
    /* JADX INFO: renamed from: a */
    public void mo591a(@NonNull Context context, int i, int i2, Intent intent) {
        if (this.f10674b == null) {
            m14323d();
        }
        if (NullChecker.a(this.f10674b)) {
            this.f10674b.mo591a(context, i, i2, intent);
        }
    }

    @Override // p006l.oul
    /* JADX INFO: renamed from: b */
    public boolean mo592b() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m14323d() {
        for (oul oulVar : this.f10673a) {
            if (NullChecker.c(oulVar, "account", CrashHelper.ReportLevel.p9) && oulVar.mo592b()) {
                this.f10674b = oulVar;
                return;
            }
        }
    }
}
