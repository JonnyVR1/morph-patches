package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class d2e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    private Activity m109725e() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
        if (vwb.m200296J(next)) {
            return null;
        }
        return next.get(next.size() - 1).f15343a.get();
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.equals(NavigationIntent.verify_avatar, w2e0Var.m201099g().replaceFirst("/", ""))) {
            Activity activityM109725e = m109725e();
            if (activityM109725e instanceof Act) {
                if (activityM109725e.isDestroyed() || activityM109725e.isFinishing()) {
                    return m109726f(w2e0Var);
                }
                bcp.INSTANCE.m101117u((Act) activityM109725e, w2e0Var.m201098f().get(NotificationCompat.CATEGORY_STATUS));
                return null;
            }
        }
        return m109726f(w2e0Var);
    }

    /* JADX INFO: renamed from: f */
    public Intent m109726f(w2e0 w2e0Var) {
        return NewMainAct.m39690K5(w2e0Var.m201094b(), NavigationIntent.get(NavigationIntent.verify_avatar), null, w2e0Var.m201098f());
    }
}
