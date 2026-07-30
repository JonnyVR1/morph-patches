package kotlin.coroutines;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", Constants.KEY_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "<init>", "(Lkotlin/coroutines/CoroutineContext$Key;)V", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractCoroutineContextElement implements CoroutineContext.Element {

    @NotNull
    private final CoroutineContext.Key<?> key;

    public AbstractCoroutineContextElement(@NotNull CoroutineContext.Key<?> key) {
        key.getClass();
        this.key = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.m87362a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public /* bridge */ <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.m87363b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public /* bridge */ CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.m87364c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public /* bridge */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m87365d(this, coroutineContext);
    }
}
