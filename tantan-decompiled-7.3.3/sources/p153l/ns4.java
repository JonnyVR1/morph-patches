package p153l;

import com.google.android.gms.common.api.Api;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.C15522b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "Ll/fs4;", "b", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)Ll/fs4;", "a", "(I)Ll/fs4;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class ns4 {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <E> fs4<E> m164556b(int i, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        if (i == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(fs4.INSTANCE.m127023a(), function1) : new C15522b(1, bufferOverflow, function1);
        }
        if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new C15522b(1, BufferOverflow.DROP_OLDEST, function1);
            }
            wg3.m206174a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, function1) : new C15522b(1, bufferOverflow, function1);
        }
        if (i != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, function1) : new C15522b(i, bufferOverflow, function1);
        }
        return new BufferedChannel(Api.BaseClientBuilder.API_PRIORITY_OTHER, function1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ fs4 m164557c(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return m164556b(i, bufferOverflow, function1);
    }
}
