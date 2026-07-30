package p153l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0764b;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/ckq0;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/b;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/b;", "b", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class ckq0 {
    /* JADX INFO: renamed from: c */
    public static final AbstractC0764b m110382c(Context context, String str, WorkerParameters workerParameters) {
        try {
            AbstractC0764b abstractC0764bNewInstance = m110383d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            abstractC0764bNewInstance.getClass();
            return abstractC0764bNewInstance;
        } catch (Throwable th) {
            qzv.m178829e().mo178835d(dkq0.f89428a, "Could not instantiate " + str, th);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Class<? extends AbstractC0764b> m110383d(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(AbstractC0764b.class);
            clsAsSubclass.getClass();
            return clsAsSubclass;
        } catch (Throwable th) {
            qzv.m178829e().mo178835d(dkq0.f89428a, "Invalid class: " + str, th);
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract AbstractC0764b mo110384a(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: b */
    public final AbstractC0764b m110385b(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters) {
        appContext.getClass();
        workerClassName.getClass();
        workerParameters.getClass();
        AbstractC0764b abstractC0764bMo110384a = mo110384a(appContext, workerClassName, workerParameters);
        if (abstractC0764bMo110384a == null) {
            abstractC0764bMo110384a = m110382c(appContext, workerClassName, workerParameters);
        }
        if (!abstractC0764bMo110384a.isUsed()) {
            return abstractC0764bMo110384a;
        }
        bkq0.m104842a("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", workerClassName, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        return null;
    }
}
