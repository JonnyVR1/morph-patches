package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class su3 {

    /* JADX INFO: renamed from: a */
    public final e1m f170641a;

    /* JADX INFO: renamed from: b */
    public final psw f170642b;

    /* JADX INFO: renamed from: c */
    public final Executor f170643c;

    /* JADX INFO: renamed from: d */
    public final psw f170644d;

    /* JADX INFO: renamed from: e */
    protected final CleverTapInstanceConfig f170645e;

    /* JADX INFO: renamed from: f */
    protected String f170646f;

    /* JADX INFO: renamed from: g */
    private final HashMap<String, ml80> f170647g;

    public su3() {
        psw pswVar = new psw();
        this.f170642b = pswVar;
        this.f170643c = new pox();
        this.f170644d = pswVar;
        this.f170647g = new HashMap<>();
        this.f170645e = null;
        this.f170641a = new e1m();
        this.f170646f = o4k0.INSTANCE.m166027c();
    }

    /* JADX INFO: renamed from: a */
    public <TResult> Task<TResult> m187987a() {
        return m187992f(this.f170641a, this.f170644d, "ioTask");
    }

    /* JADX INFO: renamed from: b */
    public <TResult> Task<TResult> m187988b() {
        e1m e1mVar = this.f170641a;
        return m187992f(e1mVar, e1mVar, "ioTaskNonUi");
    }

    /* JADX INFO: renamed from: c */
    public <TResult> Task<TResult> m187989c() {
        return m187992f(this.f170642b, this.f170644d, "Main");
    }

    /* JADX INFO: renamed from: d */
    public <TResult> Task<TResult> m187990d() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f170645e;
        return m187991e(cleverTapInstanceConfig != null ? cleverTapInstanceConfig.getAccountId() : this.f170646f);
    }

    /* JADX INFO: renamed from: e */
    public <TResult> Task<TResult> m187991e(String str) {
        if (str == null) {
            wg3.m206174a("Tag can't be null");
            return null;
        }
        ml80 ml80Var = this.f170647g.get(str);
        if (ml80Var == null) {
            ml80Var = new ml80();
            this.f170647g.put(str, ml80Var);
        }
        return m187992f(ml80Var, this.f170644d, "PostAsyncSafely");
    }

    /* JADX INFO: renamed from: f */
    public <TResult> Task<TResult> m187992f(Executor executor, Executor executor2, String str) {
        if (executor != null && executor2 != null) {
            return new Task<>(this.f170645e, executor, executor2, str);
        }
        v1d0.m199002a("Can't create task ", str, " with null executors");
        return null;
    }

    public su3(CleverTapInstanceConfig cleverTapInstanceConfig) {
        psw pswVar = new psw();
        this.f170642b = pswVar;
        this.f170643c = new pox();
        this.f170644d = pswVar;
        this.f170647g = new HashMap<>();
        this.f170645e = cleverTapInstanceConfig;
        this.f170641a = new e1m();
    }
}
