package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "invoke"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class CancelWorkRunnable$forTag$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $tag;
    final /* synthetic */ xiq0 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelWorkRunnable$forTag$1(xiq0 xiq0Var, String str) {
        super(0);
        this.$workManagerImpl = xiq0Var;
        this.$tag = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m4622a(WorkDatabase workDatabase, String str, xiq0 xiq0Var) {
        Iterator<String> it = workDatabase.workSpecDao().mo163441f(str).iterator();
        while (it.hasNext()) {
            CancelWorkRunnable.m4613d(xiq0Var, it.next());
        }
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final WorkDatabase workDatabaseM211163u = this.$workManagerImpl.m211163u();
        workDatabaseM211163u.getClass();
        final String str = this.$tag;
        final xiq0 xiq0Var = this.$workManagerImpl;
        workDatabaseM211163u.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable$forTag$1.m4622a(workDatabaseM211163u, str, xiq0Var);
            }
        });
        CancelWorkRunnable.m4619j(this.$workManagerImpl);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
