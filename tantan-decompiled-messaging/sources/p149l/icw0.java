package p149l;

import com.google.android.gms.internal.ads.C2260u3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class icw0 {
    /* JADX INFO: renamed from: a */
    public static gnr m135370a(Task task, jf4 jf4Var) {
        final hcw0 hcw0Var = new hcw0(task, null);
        task.mo15363b(C2260u3.m13341b(), new OnCompleteListener() { // from class: l.gcw0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                hcw0 hcw0Var2 = hcw0Var;
                if (task2.mo15375n()) {
                    hcw0Var2.cancel(false);
                    return;
                }
                if (task2.mo15377p()) {
                    hcw0Var2.mo13021e(task2.mo15373l());
                    return;
                }
                Exception excMo15372k = task2.mo15372k();
                if (excMo15372k != null) {
                    hcw0Var2.mo13022f(excMo15372k);
                } else {
                    ohg0.m164364a();
                }
            }
        });
        return hcw0Var;
    }
}
