package p153l;

import android.graphics.drawable.ColorDrawable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class plm {
    /* JADX INFO: renamed from: a */
    public static void m172838a(PutongAct putongAct) {
        putongAct.setSwipeBackEnable(false);
        putongAct.setStatusBarColorResId(b9c0.f75570p);
        if (NullChecker.m82486a(putongAct.getSupportActionBar())) {
            putongAct.getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m172839b(PutongAct putongAct) {
        putongAct.setSwipeBackEnable(false);
        putongAct.setStatusBarColorResId(b9c0.f75570p);
        putongAct.getSupportActionBar().mo102194u(new ColorDrawable(-1));
        putongAct.getSupportActionBar().mo102169B(bbc0.f75827O1);
        putongAct.setTitle("");
    }
}
