package p153l;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.DirectExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Ll/hpr;", "e", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Ll/hpr;", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class hkq0 {
    /* JADX INFO: renamed from: a */
    public static void m135639a(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.C0202a c0202a, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            c0202a.m868c(function0.invoke());
        } catch (Throwable th) {
            c0202a.m871f(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m135640b(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m135641c(Executor executor, final Function0 function0, final CallbackToFutureAdapter.C0202a c0202a) {
        c0202a.getClass();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c0202a.m866a(new Runnable() { // from class: l.fkq0
            @Override // java.lang.Runnable
            public final void run() {
                hkq0.m135640b(atomicBoolean);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: l.gkq0
            @Override // java.lang.Runnable
            public final void run() {
                hkq0.m135639a(atomicBoolean, c0202a, function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final <T> hpr<T> m135643e(final Executor executor, final Function0<? extends T> function0) {
        hpr<T> hprVarM865a = CallbackToFutureAdapter.m865a(new CallbackToFutureAdapter.InterfaceC0203b() { // from class: l.ekq0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0203b
            /* JADX INFO: renamed from: a */
            public final Object mo872a(CallbackToFutureAdapter.C0202a c0202a) {
                return hkq0.m135641c(executor, function0, c0202a);
            }
        });
        hprVarM865a.getClass();
        return hprVarM865a;
    }
}
