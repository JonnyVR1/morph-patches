package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p153l.gq80;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "invoke"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
final class CancelWorkRunnable$forAll$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ xiq0 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelWorkRunnable$forAll$1(xiq0 xiq0Var) {
        super(0);
        this.$workManagerImpl = xiq0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m4620a(WorkDatabase workDatabase, xiq0 xiq0Var) {
        Iterator<String> it = workDatabase.workSpecDao().mo163447l().iterator();
        while (it.hasNext()) {
            CancelWorkRunnable.m4613d(xiq0Var, it.next());
        }
        new gq80(workDatabase).m131362d(xiq0Var.m211158n().getClock().currentTimeMillis());
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final WorkDatabase workDatabaseM211163u = this.$workManagerImpl.m211163u();
        workDatabaseM211163u.getClass();
        final xiq0 xiq0Var = this.$workManagerImpl;
        workDatabaseM211163u.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable$forAll$1.m4620a(workDatabaseM211163u, xiq0Var);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
