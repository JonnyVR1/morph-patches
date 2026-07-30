package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class hae0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    private Activity m134151e() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
        if (jyb.m147479J(next)) {
            return null;
        }
        return next.get(next.size() - 1).f16062a.get();
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (TextUtils.equals(NavigationIntent.verify_avatar, abe0Var.m96744g().replaceFirst("/", ""))) {
            Activity activityM134151e = m134151e();
            if (activityM134151e instanceof Act) {
                if (activityM134151e.isDestroyed() || activityM134151e.isFinishing()) {
                    return m134152f(abe0Var);
                }
                bep.INSTANCE.m103756u((Act) activityM134151e, abe0Var.m96743f().get(NotificationCompat.CATEGORY_STATUS));
                return null;
            }
        }
        return m134152f(abe0Var);
    }

    /* JADX INFO: renamed from: f */
    public Intent m134152f(abe0 abe0Var) {
        return NewMainAct.m40702O5(abe0Var.m96739b(), NavigationIntent.get(NavigationIntent.verify_avatar), null, abe0Var.m96743f());
    }
}
