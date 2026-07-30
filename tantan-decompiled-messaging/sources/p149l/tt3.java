package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class tt3 {

    /* JADX INFO: renamed from: a */
    public final lyl f171987a;

    /* JADX INFO: renamed from: b */
    public final qpw f171988b;

    /* JADX INFO: renamed from: c */
    public final Executor f171989c;

    /* JADX INFO: renamed from: d */
    public final qpw f171990d;

    /* JADX INFO: renamed from: e */
    protected final CleverTapInstanceConfig f171991e;

    /* JADX INFO: renamed from: f */
    protected String f171992f;

    /* JADX INFO: renamed from: g */
    private final HashMap<String, gd80> f171993g;

    public tt3() {
        qpw qpwVar = new qpw();
        this.f171988b = qpwVar;
        this.f171989c = new rfx();
        this.f171990d = qpwVar;
        this.f171993g = new HashMap<>();
        this.f171991e = null;
        this.f171987a = new lyl();
        this.f171992f = lvj0.INSTANCE.m151900c();
    }

    /* JADX INFO: renamed from: a */
    public <TResult> Task<TResult> m190589a() {
        return m190594f(this.f171987a, this.f171990d, "ioTask");
    }

    /* JADX INFO: renamed from: b */
    public <TResult> Task<TResult> m190590b() {
        lyl lylVar = this.f171987a;
        return m190594f(lylVar, lylVar, "ioTaskNonUi");
    }

    /* JADX INFO: renamed from: c */
    public <TResult> Task<TResult> m190591c() {
        return m190594f(this.f171988b, this.f171990d, "Main");
    }

    /* JADX INFO: renamed from: d */
    public <TResult> Task<TResult> m190592d() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f171991e;
        return m190593e(cleverTapInstanceConfig != null ? cleverTapInstanceConfig.getAccountId() : this.f171992f);
    }

    /* JADX INFO: renamed from: e */
    public <TResult> Task<TResult> m190593e(String str) {
        if (str == null) {
            ig3.m135964a("Tag can't be null");
            return null;
        }
        gd80 gd80Var = this.f171993g.get(str);
        if (gd80Var == null) {
            gd80Var = new gd80();
            this.f171993g.put(str, gd80Var);
        }
        return m190594f(gd80Var, this.f171990d, "PostAsyncSafely");
    }

    /* JADX INFO: renamed from: f */
    public <TResult> Task<TResult> m190594f(Executor executor, Executor executor2, String str) {
        if (executor != null && executor2 != null) {
            return new Task<>(this.f171991e, executor, executor2, str);
        }
        qtc0.m176411a("Can't create task ", str, " with null executors");
        return null;
    }

    public tt3(CleverTapInstanceConfig cleverTapInstanceConfig) {
        qpw qpwVar = new qpw();
        this.f171988b = qpwVar;
        this.f171989c = new rfx();
        this.f171990d = qpwVar;
        this.f171993g = new HashMap<>();
        this.f171991e = cleverTapInstanceConfig;
        this.f171987a = new lyl();
    }
}
