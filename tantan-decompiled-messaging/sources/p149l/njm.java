package p149l;

import android.graphics.drawable.ColorDrawable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class njm {
    /* JADX INFO: renamed from: a */
    public static void m159745a(PutongAct putongAct) {
        putongAct.setSwipeBackEnable(false);
        putongAct.setStatusBarColorResId(v0c0.f179109p);
        if (NullChecker.m81303a(putongAct.getSupportActionBar())) {
            putongAct.getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m159746b(PutongAct putongAct) {
        putongAct.setSwipeBackEnable(false);
        putongAct.setStatusBarColorResId(v0c0.f179109p);
        putongAct.getSupportActionBar().mo134134u(new ColorDrawable(-1));
        putongAct.getSupportActionBar().mo134112B(v2c0.f179421O1);
        putongAct.setTitle("");
    }
}
