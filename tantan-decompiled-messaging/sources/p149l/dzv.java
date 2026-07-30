package p149l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginstrategy.C4646a;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dzv implements oul {

    /* JADX INFO: renamed from: a */
    public List<oul> f88519a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public oul f88520b;

    /* JADX INFO: renamed from: l.dzv$a */
    public static class C16507a extends dzv {
        public C16507a(Act act) {
            m114136e(act);
        }

        /* JADX INFO: renamed from: e */
        public void m114136e(Act act) {
            this.f88519a.add(new C4646a(act));
            this.f88519a.add(new c0n(act));
        }
    }

    /* JADX INFO: renamed from: c */
    public static dzv m114134c(Act act) {
        return new C16507a(act);
    }

    @Override // p149l.oul
    /* JADX INFO: renamed from: a */
    public void mo28692a(@NonNull Context context, int i, int i2, Intent intent) {
        if (this.f88520b == null) {
            m114135d();
        }
        if (NullChecker.m81303a(this.f88520b)) {
            this.f88520b.mo28692a(context, i, i2, intent);
        }
    }

    @Override // p149l.oul
    /* JADX INFO: renamed from: b */
    public boolean mo28693b() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m114135d() {
        for (oul oulVar : this.f88519a) {
            if (NullChecker.m81305c(oulVar, SchemeKey.account, CrashHelper.ReportLevel.p9) && oulVar.mo28693b()) {
                this.f88520b = oulVar;
                return;
            }
        }
    }
}
