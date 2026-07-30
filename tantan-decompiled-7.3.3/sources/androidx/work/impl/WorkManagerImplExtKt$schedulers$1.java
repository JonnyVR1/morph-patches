package androidx.work.impl;

import android.content.Context;
import androidx.work.C0763a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import p153l.fgj0;
import p153l.h2e0;
import p153l.zni0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m88121d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "Landroidx/work/a;", "<anonymous parameter 1>", "Ll/zni0;", "<anonymous parameter 2>", "Landroidx/work/impl/WorkDatabase;", "<anonymous parameter 3>", "Ll/fgj0;", "<anonymous parameter 4>", "Landroidx/work/impl/a;", "<anonymous parameter 5>", "", "Ll/h2e0;", "invoke", "(Landroid/content/Context;Landroidx/work/a;Ll/zni0;Landroidx/work/impl/WorkDatabase;Ll/fgj0;Landroidx/work/impl/a;)Ljava/util/List;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 8, 0})
final class WorkManagerImplExtKt$schedulers$1 extends Lambda implements Function6<Context, C0763a, zni0, WorkDatabase, fgj0, C0775a, List<? extends h2e0>> {
    final /* synthetic */ h2e0[] $schedulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerImplExtKt$schedulers$1(h2e0[] h2e0VarArr) {
        super(6);
        this.$schedulers = h2e0VarArr;
    }

    @Override // kotlin.jvm.functions.Function6
    public final List<h2e0> invoke(Context context, C0763a c0763a, zni0 zni0Var, WorkDatabase workDatabase, fgj0 fgj0Var, C0775a c0775a) {
        context.getClass();
        c0763a.getClass();
        zni0Var.getClass();
        workDatabase.getClass();
        fgj0Var.getClass();
        c0775a.getClass();
        return ArraysKt.toList(this.$schedulers);
    }
}
