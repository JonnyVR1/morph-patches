package kotlin.coroutines;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B:\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R1\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "element", "safeCast", "<init>", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "b", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", Constants.KEY_KEY, "", "a", "(Lkotlin/coroutines/CoroutineContext$Key;)Z", "Lkotlin/jvm/functions/Function1;", "Lkotlin/coroutines/CoroutineContext$Key;", "topmostKey", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@ExperimentalStdlibApi
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.Key<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<CoroutineContext.Element, E> safeCast;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext.Key<?> topmostKey;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.CoroutineContext$Key<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public AbstractCoroutineContextKey(@NotNull CoroutineContext.Key<B> key, @NotNull Function1<? super CoroutineContext.Element, ? extends E> function1) {
        key.getClass();
        function1.getClass();
        this.safeCast = function1;
        this.topmostKey = key instanceof AbstractCoroutineContextKey ? (CoroutineContext.Key<B>) ((AbstractCoroutineContextKey) key).topmostKey : key;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88242a(@NotNull CoroutineContext.Key<?> key) {
        key.getClass();
        return key == this || this.topmostKey == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final CoroutineContext.Element m88243b(@NotNull CoroutineContext.Element element) {
        element.getClass();
        return (CoroutineContext.Element) this.safeCast.invoke(element);
    }
}
