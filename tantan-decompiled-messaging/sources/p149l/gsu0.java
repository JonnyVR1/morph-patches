package p149l;

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
public final class gsu0 {

    /* JADX INFO: renamed from: a */
    public final Executor f104213a;

    public gsu0(Executor executor) {
        this.f104213a = executor;
    }

    @AnyThread
    /* JADX INFO: renamed from: a */
    public final Executor m127839a() {
        return this.f104213a;
    }

    @AnyThread
    /* JADX INFO: renamed from: b */
    public final void m127840b(@Nullable final String str, @Nullable final String str2, final fvt0... fvt0VarArr) {
        this.f104213a.execute(new Runnable() { // from class: l.qws0
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
                fvt0[] fvt0VarArr2 = fvt0VarArr;
                jSONObject.toString();
                for (final fvt0 fvt0Var : fvt0VarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: l.xzr0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(fvt0Var.mo123369a(lowerCase, jSONObject));
                        }
                    });
                    fvt0Var.zza().execute(futureTask);
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
