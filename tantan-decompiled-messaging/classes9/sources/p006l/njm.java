package p006l;

import android.graphics.drawable.ColorDrawable;
import com.p000p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class njm {
    /* JADX INFO: renamed from: a */
    public static void m20153a(PutongAct putongAct) {
        putongAct.setSwipeBackEnable(false);
        putongAct.setStatusBarColorResId(v0c0.f23868p);
        if (NullChecker.a(putongAct.getSupportActionBar())) {
            putongAct.getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20154b(PutongAct putongAct) {
        putongAct.setSwipeBackEnable(false);
        putongAct.setStatusBarColorResId(v0c0.f23868p);
        putongAct.getSupportActionBar().u(new ColorDrawable(-1));
        putongAct.getSupportActionBar().B(v2c0.f23985O1);
        putongAct.setTitle("");
    }
}
