package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H¦B¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", "E", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface ChannelIterator<E> {

    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Deprecated
        @JvmName
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m94843a(ChannelIterator channelIterator, Continuation continuation) throws Throwable {
            ChannelIterator$next0$1 channelIterator$next0$1;
            if (continuation instanceof ChannelIterator$next0$1) {
                channelIterator$next0$1 = (ChannelIterator$next0$1) continuation;
                int i = channelIterator$next0$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelIterator$next0$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelIterator$next0$1 = new ChannelIterator$next0$1(continuation);
                }
            } else {
                channelIterator$next0$1 = new ChannelIterator$next0$1(continuation);
            }
            Object objMo94807a = channelIterator$next0$1.result;
            Object objM198688e = uyp.m198688e();
            int i2 = channelIterator$next0$1.label;
            if (i2 == 0) {
                ResultKt.m88128b(objMo94807a);
                channelIterator$next0$1.L$0 = channelIterator;
                channelIterator$next0$1.label = 1;
                objMo94807a = channelIterator.mo94807a(channelIterator$next0$1);
                if (objMo94807a == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i2 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                channelIterator = (ChannelIterator) channelIterator$next0$1.L$0;
                ResultKt.m88128b(objMo94807a);
            }
            if (((Boolean) objMo94807a).booleanValue()) {
                return channelIterator.next();
            }
            throw new ClosedReceiveChannelException("Channel was closed");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo94807a(@NotNull Continuation<? super Boolean> continuation);

    E next();
}
