package p153l;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.DialogC13310a;

/* JADX INFO: loaded from: classes9.dex */
public class v9e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    private boolean m200438e(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Activity activityM105506D = bnl0.m105506D(abe0Var.m96739b());
        if ((activityM105506D instanceof Act) && m200438e(activityM105506D)) {
            new DialogC13310a((Act) activityM105506D).m81448Q(abe0Var.m96743f().get("url"));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
