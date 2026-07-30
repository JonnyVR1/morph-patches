package androidx.work.impl;

import android.content.Context;
import androidx.work.C0761a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p149l.b7j0;
import p149l.dud0;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
public /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements Function6<Context, C0761a, zei0, WorkDatabase, b7j0, C0773a, List<? extends dud0>> {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1();

    public WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function6
    public final List<dud0> invoke(Context context, C0761a c0761a, zei0 zei0Var, WorkDatabase workDatabase, b7j0 b7j0Var, C0773a c0773a) {
        context.getClass();
        c0761a.getClass();
        zei0Var.getClass();
        workDatabase.getClass();
        b7j0Var.getClass();
        c0773a.getClass();
        return WorkManagerImplExtKt.m4452b(context, c0761a, zei0Var, workDatabase, b7j0Var, c0773a);
    }
}
