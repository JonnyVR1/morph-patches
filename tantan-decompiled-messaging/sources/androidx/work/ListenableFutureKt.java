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
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import p149l.gnr;
import p149l.j6f;
import p149l.jh3;
import p149l.ppb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Ll/ppb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Ll/gnr;", "g", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ll/gnr;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ll/gnr;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ListenableFutureKt {
    /* JADX INFO: renamed from: a */
    public static void m4334a(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.C0201a c0201a, Function0 function0) {
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
    public static Object m4335b(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, CallbackToFutureAdapter.C0201a c0201a) {
        c0201a.getClass();
        final InterfaceC15486o interfaceC15486o = (InterfaceC15486o) coroutineContext.get(InterfaceC15486o.INSTANCE);
        c0201a.m865a(new Runnable() { // from class: l.inr
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.m4338e(interfaceC15486o);
            }
        }, DirectExecutor.INSTANCE);
        return jh3.m141367d(C15424f.m94055a(coroutineContext), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(function2, c0201a, null), 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m4336c(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: d */
    public static Object m4337d(Executor executor, String str, final Function0 function0, final CallbackToFutureAdapter.C0201a c0201a) {
        c0201a.getClass();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c0201a.m865a(new Runnable() { // from class: l.knr
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.m4336c(atomicBoolean);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: l.lnr
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.m4334a(atomicBoolean, c0201a, function0);
            }
        });
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static void m4338e(InterfaceC15486o interfaceC15486o) {
        if (interfaceC15486o != null) {
            InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <V> gnr<V> m4339f(@NotNull final Executor executor, @NotNull final String str, @NotNull final Function0<? extends V> function0) {
        executor.getClass();
        str.getClass();
        function0.getClass();
        gnr<V> gnrVarM864a = CallbackToFutureAdapter.m864a(new CallbackToFutureAdapter.InterfaceC0202b() { // from class: l.jnr
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0202b
            /* JADX INFO: renamed from: a */
            public final Object mo871a(CallbackToFutureAdapter.C0201a c0201a) {
                return ListenableFutureKt.m4337d(executor, str, function0, c0201a);
            }
        });
        gnrVarM864a.getClass();
        return gnrVarM864a;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T> gnr<T> m4340g(@NotNull final CoroutineContext coroutineContext, @NotNull final CoroutineStart coroutineStart, @NotNull final Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2) {
        coroutineContext.getClass();
        coroutineStart.getClass();
        function2.getClass();
        gnr<T> gnrVarM864a = CallbackToFutureAdapter.m864a(new CallbackToFutureAdapter.InterfaceC0202b() { // from class: l.hnr
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0202b
            /* JADX INFO: renamed from: a */
            public final Object mo871a(CallbackToFutureAdapter.C0201a c0201a) {
                return ListenableFutureKt.m4335b(coroutineContext, coroutineStart, function2, c0201a);
            }
        });
        gnrVarM864a.getClass();
        return gnrVarM864a;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ gnr m4341h(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m4340g(coroutineContext, coroutineStart, function2);
    }
}
