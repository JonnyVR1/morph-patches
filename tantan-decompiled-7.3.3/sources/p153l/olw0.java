package p153l;

import com.google.android.gms.internal.ads.C2283u3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class olw0 {
    /* JADX INFO: renamed from: a */
    public static hpr m168174a(Task task, ig4 ig4Var) {
        final nlw0 nlw0Var = new nlw0(task, null);
        task.mo15417b(C2283u3.m13395b(), new OnCompleteListener() { // from class: l.mlw0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                nlw0 nlw0Var2 = nlw0Var;
                if (task2.mo15429n()) {
                    nlw0Var2.cancel(false);
                    return;
                }
                if (task2.mo15431p()) {
                    nlw0Var2.mo13075e(task2.mo15427l());
                    return;
                }
                Exception excMo15426k = task2.mo15426k();
                if (excMo15426k != null) {
                    nlw0Var2.mo13076f(excMo15426k);
                } else {
                    wpg0.m207458a();
                }
            }
        });
        return nlw0Var;
    }
}
