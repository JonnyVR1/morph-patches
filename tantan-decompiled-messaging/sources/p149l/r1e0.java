package p149l;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.DialogC13147a;

/* JADX INFO: loaded from: classes13.dex */
public class r1e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    private boolean m177460e(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Activity activityM208326D = xdl0.m208326D(w2e0Var.m201094b());
        if ((activityM208326D instanceof Act) && m177460e(activityM208326D)) {
            new DialogC13147a((Act) activityM208326D).m80265Q(w2e0Var.m201098f().get("url"));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
