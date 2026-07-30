package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.k6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a4\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086H¢\u0006\u0004\b\u0005\u0010\u0006\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"E", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/Function1;", "", "action", "b", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "a", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Throwable;)V", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension
public final /* synthetic */ class ChannelsKt__Channels_commonKt {
    @PublishedApi
    /* JADX INFO: renamed from: a */
    public static final void m94845a(@NotNull ReceiveChannel<?> receiveChannel, @Nullable Throwable th) {
        CancellationException cancellationExceptionM148513a = null;
        if (th != null) {
            cancellationExceptionM148513a = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM148513a == null) {
                cancellationExceptionM148513a = k6f.m148513a("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.mo94782n(cancellationExceptionM148513a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:25:0x005b, B:27:0x0063, B:21:0x0049, B:28:0x006c), top: B:37:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0058 -> B:25:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: b */
    public static final <E> java.lang.Object m94846b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p153l.uyp.m198688e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.m88128b(r8)     // Catch: java.lang.Throwable -> L36
            goto L5b
        L36:
            r6 = move-exception
            goto L7e
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r6)
            return r4
        L3e:
            kotlin.ResultKt.m88128b(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7a
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L49:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L36
            r0.label = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r6.mo94807a(r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L58
            return r1
        L58:
            r5 = r2
            r2 = r8
            r8 = r5
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L36
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L6c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L36
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L36
            r8 = r2
            goto L49
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.internal.InlineMarker.m88372b(r3)
            p153l.us4.m197675b(r7, r4)
            kotlin.jvm.internal.InlineMarker.m88371a(r3)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L7a:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L7e:
            throw r6     // Catch: java.lang.Throwable -> L7f
        L7f:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.m88372b(r3)
            p153l.us4.m197675b(r7, r6)
            kotlin.jvm.internal.InlineMarker.m88371a(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.m94846b(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e A[Catch: all -> 0x003a, TryCatch #3 {all -> 0x003a, blocks: (B:12:0x0036, B:25:0x0066, B:27:0x006e, B:28:0x0077), top: B:45:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0063 -> B:25:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public static final <E> java.lang.Object m94847c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p153l.uyp.m198688e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3d
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.m88128b(r9)     // Catch: java.lang.Throwable -> L3a
            goto L66
        L3a:
            r8 = move-exception
            r9 = r2
            goto L87
        L3d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p153l.wtq0.m207906a(r8)
            return r4
        L43:
            kotlin.ResultKt.m88128b(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlinx.coroutines.channels.ChannelIterator r2 = r8.iterator()     // Catch: java.lang.Throwable -> L83
            r5 = r9
            r6 = r5
            r9 = r8
            r8 = r2
        L52:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L81
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L81
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L81
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L81
            r0.label = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r8.mo94807a(r0)     // Catch: java.lang.Throwable -> L81
            if (r2 != r1) goto L63
            return r1
        L63:
            r7 = r2
            r2 = r9
            r9 = r7
        L66:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3a
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L77
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L3a
            r5.add(r9)     // Catch: java.lang.Throwable -> L3a
            r9 = r2
            goto L52
        L77:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3a
            p153l.us4.m197675b(r2, r4)
            java.util.List r8 = kotlin.collections.CollectionsKt.build(r6)
            return r8
        L81:
            r8 = move-exception
            goto L87
        L83:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L87:
            throw r8     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            p153l.us4.m197675b(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.m94847c(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
