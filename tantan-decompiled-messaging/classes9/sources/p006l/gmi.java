package p006l;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.uqd0;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gmi {

    /* JADX INFO: renamed from: a */
    public static uqd0 f13397a = new uqd0("device_firebase_id_v1", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15892a(final z3g0 z3g0Var) {
        String str = (String) f13397a.get();
        if (TextUtils.isEmpty(str)) {
            FirebaseAnalytics.getInstance(App.e).getAppInstanceId().addOnCompleteListener(new OnCompleteListener() { // from class: l.fmi
                public final void onComplete(Task task) {
                    gmi.m15893b(z3g0Var, task);
                }
            });
        } else {
            z3g0Var.onNext(str);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15893b(z3g0 z3g0Var, Task task) {
        if (!task.p()) {
            StringBuilder sb = new StringBuilder("get FirebaseInstanceId fail:");
            sb.append(NullChecker.a(task.k()) ? task.k().getMessage() : "task exception is null");
            z3g0Var.onError(new RuntimeException(sb.toString()));
            return;
        }
        String str = (String) task.l();
        if (!NullChecker.a(str)) {
            z3g0Var.onError(new RuntimeException("get FirebaseInstanceId fail:result is null"));
            return;
        }
        f13397a.put(str);
        z3g0Var.onNext(str);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: c */
    public static c<String> m15894c() {
        return c.create(new c.a() { // from class: l.emi
            public final void call(Object obj) {
                gmi.m15892a((z3g0) obj);
            }
        }).take(500L, TimeUnit.MILLISECONDS);
    }
}
