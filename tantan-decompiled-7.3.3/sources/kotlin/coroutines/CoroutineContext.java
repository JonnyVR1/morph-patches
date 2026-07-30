package kotlin.coroutines;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.MessageType;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H¦\u0002¢\u0006\u0002\u0010\u0007J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H&¨\u0006\u0013"}, m88121d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "get", "E", "Lkotlin/coroutines/CoroutineContext$Element;", Constants.KEY_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", MessageType.operation, "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "plus", "context", "minusKey", "Key", "Element", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface CoroutineContext {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static CoroutineContext m88249a(CoroutineContext coroutineContext, Element element) {
            coroutineContext.getClass();
            element.getClass();
            CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (coroutineContextMinusKey == emptyCoroutineContext) {
                return element;
            }
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(key);
            if (continuationInterceptor == null) {
                return new CombinedContext(coroutineContextMinusKey, element);
            }
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(key);
            return coroutineContextMinusKey2 == emptyCoroutineContext ? new CombinedContext(element, continuationInterceptor) : new CombinedContext(new CombinedContext(coroutineContextMinusKey2, element), continuationInterceptor);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static CoroutineContext m88250b(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
            coroutineContext2.getClass();
            return coroutineContext2 == EmptyCoroutineContext.INSTANCE ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, new Function2() { // from class: l.vqb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.DefaultImpls.m88249a((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", Constants.KEY_KEY, "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface Element extends CoroutineContext {

        @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
        public static final class DefaultImpls {
            /* JADX INFO: renamed from: a */
            public static <R> R m88251a(@NotNull Element element, R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2) {
                function2.getClass();
                return function2.invoke(r, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            /* JADX INFO: renamed from: b */
            public static <E extends Element> E m88252b(@NotNull Element element, @NotNull Key<E> key) {
                key.getClass();
                if (Intrinsics.m88377d(element.getKey(), key)) {
                    return element;
                }
                return null;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public static CoroutineContext m88253c(@NotNull Element element, @NotNull Key<?> key) {
                key.getClass();
                return Intrinsics.m88377d(element.getKey(), key) ? EmptyCoroutineContext.INSTANCE : element;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public static CoroutineContext m88254d(@NotNull Element element, @NotNull CoroutineContext coroutineContext) {
                coroutineContext.getClass();
                return DefaultImpls.m88250b(element, coroutineContext);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull Key<E> key);

        @NotNull
        Key<?> getKey();
    }

    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m88121d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface Key<E extends Element> {
    }

    <R> R fold(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation);

    @Nullable
    <E extends Element> E get(@NotNull Key<E> key);

    @NotNull
    CoroutineContext minusKey(@NotNull Key<?> key);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext context);
}
