package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableFutureKt;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import p153l.drb;
import p153l.hpr;
import p153l.p7f;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Ll/drb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Ll/hpr;", "g", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ll/hpr;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ll/hpr;", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class ListenableFutureKt {
    /* JADX INFO: renamed from: a */
    public static void m4336a(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.C0202a c0202a, Function0 function0) {
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
    public static Object m4337b(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, CallbackToFutureAdapter.C0202a c0202a) {
        c0202a.getClass();
        final InterfaceC15593o interfaceC15593o = (InterfaceC15593o) coroutineContext.get(InterfaceC15593o.INSTANCE);
        c0202a.m866a(new Runnable() { // from class: l.jpr
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.m4340e(interfaceC15593o);
            }
        }, DirectExecutor.INSTANCE);
        return xh3.m210980d(C15531f.m94947a(coroutineContext), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(function2, c0202a, null), 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m4338c(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: d */
    public static Object m4339d(Executor executor, String str, final Function0 function0, final CallbackToFutureAdapter.C0202a c0202a) {
        c0202a.getClass();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c0202a.m866a(new Runnable() { // from class: l.lpr
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.m4338c(atomicBoolean);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: l.mpr
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.m4336a(atomicBoolean, c0202a, function0);
            }
        });
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static void m4340e(InterfaceC15593o interfaceC15593o) {
        if (interfaceC15593o != null) {
            InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <V> hpr<V> m4341f(@NotNull final Executor executor, @NotNull final String str, @NotNull final Function0<? extends V> function0) {
        executor.getClass();
        str.getClass();
        function0.getClass();
        hpr<V> hprVarM865a = CallbackToFutureAdapter.m865a(new CallbackToFutureAdapter.InterfaceC0203b() { // from class: l.kpr
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0203b
            /* JADX INFO: renamed from: a */
            public final Object mo872a(CallbackToFutureAdapter.C0202a c0202a) {
                return ListenableFutureKt.m4339d(executor, str, function0, c0202a);
            }
        });
        hprVarM865a.getClass();
        return hprVarM865a;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T> hpr<T> m4342g(@NotNull final CoroutineContext coroutineContext, @NotNull final CoroutineStart coroutineStart, @NotNull final Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2) {
        coroutineContext.getClass();
        coroutineStart.getClass();
        function2.getClass();
        hpr<T> hprVarM865a = CallbackToFutureAdapter.m865a(new CallbackToFutureAdapter.InterfaceC0203b() { // from class: l.ipr
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0203b
            /* JADX INFO: renamed from: a */
            public final Object mo872a(CallbackToFutureAdapter.C0202a c0202a) {
                return ListenableFutureKt.m4337b(coroutineContext, coroutineStart, function2, c0202a);
            }
        });
        hprVarM865a.getClass();
        return hprVarM865a;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ hpr m4343h(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m4342g(coroutineContext, coroutineStart, function2);
    }
}
