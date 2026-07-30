package p149l;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class gmi {

    /* JADX INFO: renamed from: a */
    public static uqd0 f103478a = new uqd0("device_firebase_id_v1", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m126979a(final z3g0 z3g0Var) {
        String str = f103478a.get();
        if (TextUtils.isEmpty(str)) {
            FirebaseAnalytics.getInstance(App.f15369e).getAppInstanceId().addOnCompleteListener(new OnCompleteListener() { // from class: l.fmi
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    gmi.m126980b(z3g0Var, task);
                }
            });
        } else {
            z3g0Var.onNext(str);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m126980b(z3g0 z3g0Var, Task task) {
        if (!task.mo15377p()) {
            StringBuilder sb = new StringBuilder("get FirebaseInstanceId fail:");
            sb.append(NullChecker.m81303a(task.mo15372k()) ? task.mo15372k().getMessage() : "task exception is null");
            z3g0Var.onError(new RuntimeException(sb.toString()));
            return;
        }
        String str = (String) task.mo15373l();
        if (!NullChecker.m81303a(str)) {
            z3g0Var.onError(new RuntimeException("get FirebaseInstanceId fail:result is null"));
            return;
        }
        f103478a.put(str);
        z3g0Var.onNext(str);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<String> m126981c() {
        return C22306c.create(new C22306c.a() { // from class: l.emi
            @Override // p149l.e30
            public final void call(Object obj) {
                gmi.m126979a((z3g0) obj);
            }
        }).take(500L, TimeUnit.MILLISECONDS);
    }
}
