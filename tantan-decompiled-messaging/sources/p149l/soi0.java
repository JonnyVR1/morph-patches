package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0001\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0001\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0014*\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m87232d2 = {"Ll/soi0;", j6f.GPS_DIRECTION_TRUE, "Ll/goi0;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", "e", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext$Key;", Constants.KEY_KEY, "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "b", "Ljava/lang/ThreadLocal;", "c", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class soi0<T> implements goi0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final T value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<T> threadLocal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext.Key<?> key;

    public soi0(T t, @NotNull ThreadLocal<T> threadLocal) {
        this.value = t;
        this.threadLocal = threadLocal;
        this.key = new uoi0(threadLocal);
    }

    @Override // p149l.goi0
    /* JADX INFO: renamed from: T */
    public T mo94008T(@NotNull CoroutineContext context) {
        T t = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t;
    }

    @Override // p149l.goi0
    /* JADX INFO: renamed from: e */
    public void mo94012e(@NotNull CoroutineContext context, T oldState) {
        this.threadLocal.set(oldState);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) goi0.C17132a.m127246a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        if (Intrinsics.m87488d(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return Intrinsics.m87488d(getKey(), key) ? EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return goi0.C17132a.m127247b(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }
}
