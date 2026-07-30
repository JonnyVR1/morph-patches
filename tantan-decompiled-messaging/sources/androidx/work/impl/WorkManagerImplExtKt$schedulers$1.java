package androidx.work.impl;

import android.content.Context;
import androidx.work.C0761a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import p149l.b7j0;
import p149l.dud0;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m87232d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "Landroidx/work/a;", "<anonymous parameter 1>", "Ll/zei0;", "<anonymous parameter 2>", "Landroidx/work/impl/WorkDatabase;", "<anonymous parameter 3>", "Ll/b7j0;", "<anonymous parameter 4>", "Landroidx/work/impl/a;", "<anonymous parameter 5>", "", "Ll/dud0;", "invoke", "(Landroid/content/Context;Landroidx/work/a;Ll/zei0;Landroidx/work/impl/WorkDatabase;Ll/b7j0;Landroidx/work/impl/a;)Ljava/util/List;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 8, 0})
final class WorkManagerImplExtKt$schedulers$1 extends Lambda implements Function6<Context, C0761a, zei0, WorkDatabase, b7j0, C0773a, List<? extends dud0>> {
    final /* synthetic */ dud0[] $schedulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerImplExtKt$schedulers$1(dud0[] dud0VarArr) {
        super(6);
        this.$schedulers = dud0VarArr;
    }

    @Override // kotlin.jvm.functions.Function6
    public final List<dud0> invoke(Context context, C0761a c0761a, zei0 zei0Var, WorkDatabase workDatabase, b7j0 b7j0Var, C0773a c0773a) {
        context.getClass();
        c0761a.getClass();
        zei0Var.getClass();
        workDatabase.getClass();
        b7j0Var.getClass();
        c0773a.getClass();
        return ArraysKt.toList(this.$schedulers);
    }
}
