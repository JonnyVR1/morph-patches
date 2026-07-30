package p149l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0762b;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/xaq0;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/b;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/b;", "b", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class xaq0 {
    /* JADX INFO: renamed from: c */
    public static final AbstractC0762b m207665c(Context context, String str, WorkerParameters workerParameters) {
        try {
            AbstractC0762b abstractC0762bNewInstance = m207666d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            abstractC0762bNewInstance.getClass();
            return abstractC0762bNewInstance;
        } catch (Throwable th) {
            txv.m190976e().mo190982d(yaq0.f197231a, "Could not instantiate " + str, th);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Class<? extends AbstractC0762b> m207666d(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(AbstractC0762b.class);
            clsAsSubclass.getClass();
            return clsAsSubclass;
        } catch (Throwable th) {
            txv.m190976e().mo190982d(yaq0.f197231a, "Invalid class: " + str, th);
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract AbstractC0762b mo122925a(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: b */
    public final AbstractC0762b m207667b(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters) {
        appContext.getClass();
        workerClassName.getClass();
        workerParameters.getClass();
        AbstractC0762b abstractC0762bMo122925a = mo122925a(appContext, workerClassName, workerParameters);
        if (abstractC0762bMo122925a == null) {
            abstractC0762bMo122925a = m207665c(appContext, workerClassName, workerParameters);
        }
        if (!abstractC0762bMo122925a.isUsed()) {
            return abstractC0762bMo122925a;
        }
        waq0.m202461a("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", workerClassName, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        return null;
    }
}
