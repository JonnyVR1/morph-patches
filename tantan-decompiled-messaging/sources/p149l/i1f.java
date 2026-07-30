package p149l;

import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC0768h;
import androidx.work.C0761a;
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
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "Ll/v8q0;", "continuation", "", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ll/v8q0;)V", "Ll/haq0;", "workSpec", "c", "(Ll/haq0;)Ll/haq0;", "b", "", "Ll/dud0;", "schedulers", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Ll/haq0;)Ll/haq0;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class i1f {
    /* JADX INFO: renamed from: a */
    public static final void m133969a(@NotNull WorkDatabase workDatabase, @NotNull C0761a c0761a, @NotNull v8q0 v8q0Var) {
        int i;
        workDatabase.getClass();
        c0761a.getClass();
        v8q0Var.getClass();
        List listMutableListOf = CollectionsKt.mutableListOf(v8q0Var);
        int i2 = 0;
        while (!listMutableListOf.isEmpty()) {
            v8q0 v8q0Var2 = (v8q0) CollectionsKt.removeLast(listMutableListOf);
            List<? extends AbstractC0768h> listM197488g = v8q0Var2.m197488g();
            listM197488g.getClass();
            List<? extends AbstractC0768h> list = listM197488g;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((AbstractC0768h) it.next()).getWorkSpec().constraints.m128826g() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i2 += i;
            List<v8q0> listM197487f = v8q0Var2.m197487f();
            if (listM197487f != null) {
                listMutableListOf.addAll(listM197487f);
            }
        }
        if (i2 == 0) {
            return;
        }
        int iMo135184p = workDatabase.workSpecDao().mo135184p();
        int contentUriTriggerWorkersLimit = c0761a.getContentUriTriggerWorkersLimit();
        if (iMo135184p + i2 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iMo135184p + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final haq0 m133970b(@NotNull haq0 haq0Var) {
        haq0Var.getClass();
        gz5 gz5Var = haq0Var.constraints;
        String str = haq0Var.workerClassName;
        if (Intrinsics.m87488d(str, ConstraintTrackingWorker.class.getName()) || !(gz5Var.getRequiresBatteryNotLow() || gz5Var.getRequiresStorageNotLow())) {
            return haq0Var;
        }
        return haq0.m130156d(haq0Var, null, null, ConstraintTrackingWorker.class.getName(), null, new Data.C0753a().m4322c(haq0Var.input).m4325f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).m4320a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final haq0 m133971c(@NotNull haq0 haq0Var) {
        haq0Var.getClass();
        boolean zM4318e = haq0Var.input.m4318e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zM4318e2 = haq0Var.input.m4318e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zM4318e3 = haq0Var.input.m4318e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zM4318e || !zM4318e2 || !zM4318e3) {
            return haq0Var;
        }
        return haq0.m130156d(haq0Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new Data.C0753a().m4322c(haq0Var.input).m4325f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", haq0Var.workerClassName).m4320a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final haq0 m133972d(@NotNull List<? extends dud0> list, @NotNull haq0 haq0Var) {
        list.getClass();
        haq0Var.getClass();
        haq0 haq0VarM133971c = m133971c(haq0Var);
        return Build.VERSION.SDK_INT < 26 ? m133970b(haq0VarM133971c) : haq0VarM133971c;
    }
}
