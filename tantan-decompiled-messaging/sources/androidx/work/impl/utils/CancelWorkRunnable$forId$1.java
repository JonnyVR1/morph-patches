package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p149l.s9q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class CancelWorkRunnable$forId$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UUID $id;
    final /* synthetic */ s9q0 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelWorkRunnable$forId$1(s9q0 s9q0Var, UUID uuid) {
        super(0);
        this.$workManagerImpl = s9q0Var;
        this.$id = uuid;
    }

    /* JADX INFO: renamed from: a */
    public static void m4619a(s9q0 s9q0Var, UUID uuid) {
        String string = uuid.toString();
        string.getClass();
        CancelWorkRunnable.m4611d(s9q0Var, string);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WorkDatabase workDatabaseM182750u = this.$workManagerImpl.m182750u();
        workDatabaseM182750u.getClass();
        final s9q0 s9q0Var = this.$workManagerImpl;
        final UUID uuid = this.$id;
        workDatabaseM182750u.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable$forId$1.m4619a(s9q0Var, uuid);
            }
        });
        CancelWorkRunnable.m4617j(this.$workManagerImpl);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
