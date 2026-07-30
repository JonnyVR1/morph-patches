package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p149l.bi80;
import p149l.s9q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
final class CancelWorkRunnable$forAll$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ s9q0 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelWorkRunnable$forAll$1(s9q0 s9q0Var) {
        super(0);
        this.$workManagerImpl = s9q0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m4618a(WorkDatabase workDatabase, s9q0 s9q0Var) {
        Iterator<String> it = workDatabase.workSpecDao().mo135180l().iterator();
        while (it.hasNext()) {
            CancelWorkRunnable.m4611d(s9q0Var, it.next());
        }
        new bi80(workDatabase).m101991d(s9q0Var.m182745n().getClock().currentTimeMillis());
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final WorkDatabase workDatabaseM182750u = this.$workManagerImpl.m182750u();
        workDatabaseM182750u.getClass();
        final s9q0 s9q0Var = this.$workManagerImpl;
        workDatabaseM182750u.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable$forAll$1.m4618a(workDatabaseM182750u, s9q0Var);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
