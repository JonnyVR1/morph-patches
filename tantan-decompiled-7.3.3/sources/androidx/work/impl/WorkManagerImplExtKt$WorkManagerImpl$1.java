package androidx.work.impl;

import android.content.Context;
import androidx.work.C0763a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p153l.fgj0;
import p153l.h2e0;
import p153l.zni0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
public /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements Function6<Context, C0763a, zni0, WorkDatabase, fgj0, C0775a, List<? extends h2e0>> {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1();

    public WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function6
    public final List<h2e0> invoke(Context context, C0763a c0763a, zni0 zni0Var, WorkDatabase workDatabase, fgj0 fgj0Var, C0775a c0775a) {
        context.getClass();
        c0763a.getClass();
        zni0Var.getClass();
        workDatabase.getClass();
        fgj0Var.getClass();
        c0775a.getClass();
        return WorkManagerImplExtKt.m4454b(context, c0763a, zni0Var, workDatabase, fgj0Var, c0775a);
    }
}
