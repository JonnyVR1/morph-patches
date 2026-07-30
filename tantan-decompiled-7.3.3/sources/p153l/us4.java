package p153l;

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
@Metadata(m88120d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, m88122k = 4, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class us4 {
    @PublishedApi
    /* JADX INFO: renamed from: b */
    public static final void m197675b(@NotNull ReceiveChannel<?> receiveChannel, @Nullable Throwable th) {
        ChannelsKt__Channels_commonKt.m94845a(receiveChannel, th);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: s */
    public static final <E, C extends sme0<? super E>> Object m197692s(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull C c, @NotNull Continuation<? super C> continuation) {
        return ChannelsKt__DeprecatedKt.m94866s(receiveChannel, c, continuation);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: t */
    public static final <E, C extends Collection<? super E>> Object m197693t(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull C c, @NotNull Continuation<? super C> continuation) {
        return ChannelsKt__DeprecatedKt.m94867t(receiveChannel, c, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static final <E> Object m197694u(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull Continuation<? super List<? extends E>> continuation) {
        return ChannelsKt__Channels_commonKt.m94847c(receiveChannel, continuation);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: v */
    public static final <K, V, M extends Map<? super K, ? super V>> Object m197695v(@NotNull ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, @NotNull M m, @NotNull Continuation<? super M> continuation) {
        return ChannelsKt__DeprecatedKt.m94868u(receiveChannel, m, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final <E> Object m197696w(@NotNull sme0<? super E> sme0Var, E e) {
        return ChannelsKt__ChannelsKt.m94844a(sme0Var, e);
    }
}
