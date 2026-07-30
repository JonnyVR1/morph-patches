package p149l;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.DirectExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Ll/gnr;", "e", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Ll/gnr;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class cbq0 {
    /* JADX INFO: renamed from: a */
    public static void m106019a(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.C0201a c0201a, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            c0201a.m867c(function0.invoke());
        } catch (Throwable th) {
            c0201a.m870f(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m106020b(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m106021c(Executor executor, final Function0 function0, final CallbackToFutureAdapter.C0201a c0201a) {
        c0201a.getClass();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c0201a.m865a(new Runnable() { // from class: l.abq0
            @Override // java.lang.Runnable
            public final void run() {
                cbq0.m106020b(atomicBoolean);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: l.bbq0
            @Override // java.lang.Runnable
            public final void run() {
                cbq0.m106019a(atomicBoolean, c0201a, function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final <T> gnr<T> m106023e(final Executor executor, final Function0<? extends T> function0) {
        gnr<T> gnrVarM864a = CallbackToFutureAdapter.m864a(new CallbackToFutureAdapter.InterfaceC0202b() { // from class: l.zaq0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0202b
            /* JADX INFO: renamed from: a */
            public final Object mo871a(CallbackToFutureAdapter.C0201a c0201a) {
                return cbq0.m106021c(executor, function0, c0201a);
            }
        });
        gnrVarM864a.getClass();
        return gnrVarM864a;
    }
}
