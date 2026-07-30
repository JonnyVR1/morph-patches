package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m87232d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "continuation", "interceptContinuation", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "", "releaseInterceptedContinuation", "(Lkotlin/coroutines/Continuation;)V", "d0", "Key", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface ContinuationInterceptor extends CoroutineContext.Element {

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f63442a;

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static <E extends CoroutineContext.Element> E m87357a(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull CoroutineContext.Key<E> key) {
            E e;
            key.getClass();
            if (!(key instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.INSTANCE != key) {
                    return null;
                }
                continuationInterceptor.getClass();
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            if (!abstractCoroutineContextKey.m87353a(continuationInterceptor.getKey()) || (e = (E) abstractCoroutineContextKey.m87354b(continuationInterceptor)) == null) {
                return null;
            }
            return e;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static CoroutineContext m87358b(@NotNull ContinuationInterceptor continuationInterceptor, @NotNull CoroutineContext.Key<?> key) {
            key.getClass();
            if (!(key instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.INSTANCE == key ? EmptyCoroutineContext.INSTANCE : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            return (!abstractCoroutineContextKey.m87353a(continuationInterceptor.getKey()) || abstractCoroutineContextKey.m87354b(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.ContinuationInterceptor$Key, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion implements CoroutineContext.Key<ContinuationInterceptor> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f63442a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> continuation);

    void releaseInterceptedContinuation(@NotNull Continuation<?> continuation);
}
