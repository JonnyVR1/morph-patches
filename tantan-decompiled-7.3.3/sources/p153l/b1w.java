package p153l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginstrategy.C4797a;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b1w implements bxl {

    /* JADX INFO: renamed from: a */
    public List<bxl> f74400a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public bxl f74401b;

    /* JADX INFO: renamed from: l.b1w$a */
    public static class C15889a extends b1w {
        public C15889a(Act act) {
            m101507e(act);
        }

        /* JADX INFO: renamed from: e */
        public void m101507e(Act act) {
            this.f74400a.add(new C4797a(act));
            this.f74400a.add(new c2n(act));
        }
    }

    /* JADX INFO: renamed from: c */
    public static b1w m101505c(Act act) {
        return new C15889a(act);
    }

    @Override // p153l.bxl
    /* JADX INFO: renamed from: a */
    public void mo29691a(@NonNull Context context, int i, int i2, Intent intent) {
        if (this.f74401b == null) {
            m101506d();
        }
        if (NullChecker.m82486a(this.f74401b)) {
            this.f74401b.mo29691a(context, i, i2, intent);
        }
    }

    @Override // p153l.bxl
    /* JADX INFO: renamed from: b */
    public boolean mo29692b() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m101506d() {
        for (bxl bxlVar : this.f74400a) {
            if (NullChecker.m82488c(bxlVar, SchemeKey.account, CrashHelper.ReportLevel.p9) && bxlVar.mo29692b()) {
                this.f74401b = bxlVar;
                return;
            }
        }
    }
}
