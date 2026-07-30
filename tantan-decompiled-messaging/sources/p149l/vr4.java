package p149l;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt;
import kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, m87233k = 4, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class vr4 {
    @PublishedApi
    /* JADX INFO: renamed from: b */
    public static final void m199619b(@NotNull ReceiveChannel<?> receiveChannel, @Nullable Throwable th) {
        ChannelsKt__Channels_commonKt.m93953a(receiveChannel, th);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: s */
    public static final <E, C extends nee0<? super E>> Object m199636s(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull C c, @NotNull Continuation<? super C> continuation) {
        return ChannelsKt__DeprecatedKt.m93974s(receiveChannel, c, continuation);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: t */
    public static final <E, C extends Collection<? super E>> Object m199637t(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull C c, @NotNull Continuation<? super C> continuation) {
        return ChannelsKt__DeprecatedKt.m93975t(receiveChannel, c, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static final <E> Object m199638u(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull Continuation<? super List<? extends E>> continuation) {
        return ChannelsKt__Channels_commonKt.m93955c(receiveChannel, continuation);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: v */
    public static final <K, V, M extends Map<? super K, ? super V>> Object m199639v(@NotNull ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, @NotNull M m, @NotNull Continuation<? super M> continuation) {
        return ChannelsKt__DeprecatedKt.m93976u(receiveChannel, m, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final <E> Object m199640w(@NotNull nee0<? super E> nee0Var, E e) {
        return ChannelsKt__ChannelsKt.m93952a(nee0Var, e);
    }
}
