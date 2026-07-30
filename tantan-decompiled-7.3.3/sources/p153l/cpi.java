package p153l;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class cpi {

    /* JADX INFO: renamed from: a */
    public static wyd0 f83000a = new wyd0("device_firebase_id_v1", "");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m111762a(final gcg0 gcg0Var) {
        String str = f83000a.get();
        if (TextUtils.isEmpty(str)) {
            FirebaseAnalytics.getInstance(App.f16088e).getAppInstanceId().addOnCompleteListener(new OnCompleteListener() { // from class: l.bpi
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    cpi.m111763b(gcg0Var, task);
                }
            });
        } else {
            gcg0Var.onNext(str);
            gcg0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m111763b(gcg0 gcg0Var, Task task) {
        if (!task.mo15431p()) {
            StringBuilder sb = new StringBuilder("get FirebaseInstanceId fail:");
            sb.append(NullChecker.m82486a(task.mo15426k()) ? task.mo15426k().getMessage() : "task exception is null");
            gcg0Var.onError(new RuntimeException(sb.toString()));
            return;
        }
        String str = (String) task.mo15427l();
        if (!NullChecker.m82486a(str)) {
            gcg0Var.onError(new RuntimeException("get FirebaseInstanceId fail:result is null"));
            return;
        }
        f83000a.put(str);
        gcg0Var.onNext(str);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<String> m111764c() {
        return C22421c.create(new C22421c.a() { // from class: l.api
            @Override // p153l.y20
            public final void call(Object obj) {
                cpi.m111762a((gcg0) obj);
            }
        }).take(500L, TimeUnit.MILLISECONDS);
    }
}
