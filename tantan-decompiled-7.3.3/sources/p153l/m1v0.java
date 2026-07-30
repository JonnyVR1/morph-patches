package p153l;

import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m1v0 {

    /* JADX INFO: renamed from: a */
    public final Executor f134470a;

    public m1v0(Executor executor) {
        this.f134470a = executor;
    }

    @AnyThread
    /* JADX INFO: renamed from: a */
    public final Executor m156721a() {
        return this.f134470a;
    }

    @AnyThread
    /* JADX INFO: renamed from: b */
    public final void m156722b(@Nullable final String str, @Nullable final String str2, final l4u0... l4u0VarArr) {
        this.f134470a.execute(new Runnable() { // from class: l.w5t0
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                String str4 = str2;
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                l4u0[] l4u0VarArr2 = l4u0VarArr;
                jSONObject.toString();
                for (final l4u0 l4u0Var : l4u0VarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: l.d9s0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(l4u0Var.mo111689a(lowerCase, jSONObject));
                        }
                    });
                    l4u0Var.zza().execute(futureTask);
                    try {
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    } catch (InterruptedException unused2) {
                    } catch (ExecutionException e) {
                        e.getCause();
                    }
                }
            }
        });
    }
}
