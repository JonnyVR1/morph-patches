package p153l;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC0770h;
import androidx.work.C0763a;
import androidx.work.Data;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "Ll/aiq0;", "continuation", "", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ll/aiq0;)V", "Ll/mjq0;", "workSpec", "c", "(Ll/mjq0;)Ll/mjq0;", "b", "", "Ll/h2e0;", "schedulers", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Ll/mjq0;)Ll/mjq0;", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class n2f {
    /* JADX INFO: renamed from: a */
    public static final void m161227a(@NotNull WorkDatabase workDatabase, @NotNull C0763a c0763a, @NotNull aiq0 aiq0Var) {
        int i;
        workDatabase.getClass();
        c0763a.getClass();
        aiq0Var.getClass();
        List listMutableListOf = CollectionsKt.mutableListOf(aiq0Var);
        int i2 = 0;
        while (!listMutableListOf.isEmpty()) {
            aiq0 aiq0Var2 = (aiq0) CollectionsKt.removeLast(listMutableListOf);
            List<? extends AbstractC0770h> listM98020g = aiq0Var2.m98020g();
            listM98020g.getClass();
            List<? extends AbstractC0770h> list = listM98020g;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((AbstractC0770h) it.next()).getWorkSpec().constraints.m152313g() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i2 += i;
            List<aiq0> listM98019f = aiq0Var2.m98019f();
            if (listM98019f != null) {
                listMutableListOf.addAll(listM98019f);
            }
        }
        if (i2 == 0) {
            return;
        }
        int iMo163451p = workDatabase.workSpecDao().mo163451p();
        int contentUriTriggerWorkersLimit = c0763a.getContentUriTriggerWorkersLimit();
        if (iMo163451p + i2 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iMo163451p + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final mjq0 m161228b(@NotNull mjq0 mjq0Var) {
        mjq0Var.getClass();
        l06 l06Var = mjq0Var.constraints;
        String str = mjq0Var.workerClassName;
        if (Intrinsics.m88377d(str, ConstraintTrackingWorker.class.getName()) || !(l06Var.getRequiresBatteryNotLow() || l06Var.getRequiresStorageNotLow())) {
            return mjq0Var;
        }
        return mjq0.m158598d(mjq0Var, null, null, ConstraintTrackingWorker.class.getName(), null, new Data.C0755a().m4324c(mjq0Var.input).m4327f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).m4322a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final mjq0 m161229c(@NotNull mjq0 mjq0Var) {
        mjq0Var.getClass();
        boolean zM4320e = mjq0Var.input.m4320e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zM4320e2 = mjq0Var.input.m4320e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zM4320e3 = mjq0Var.input.m4320e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zM4320e || !zM4320e2 || !zM4320e3) {
            return mjq0Var;
        }
        return mjq0.m158598d(mjq0Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new Data.C0755a().m4324c(mjq0Var.input).m4327f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", mjq0Var.workerClassName).m4322a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final mjq0 m161230d(@NotNull List<? extends h2e0> list, @NotNull mjq0 mjq0Var) {
        list.getClass();
        mjq0Var.getClass();
        mjq0 mjq0VarM161229c = m161229c(mjq0Var);
        return Build.VERSION.SDK_INT < 26 ? m161228b(mjq0VarM161229c) : mjq0VarM161229c;
    }
}
