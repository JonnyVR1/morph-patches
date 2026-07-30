package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
public /* synthetic */ class BufferedChannel$onSend$2 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, Object, Object, Object> {
    public static final BufferedChannel$onSend$2 INSTANCE = new BufferedChannel$onSend$2();

    public BufferedChannel$onSend$2() {
        super(3, BufferedChannel.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull BufferedChannel<?> bufferedChannel, @Nullable Object obj, @Nullable Object obj2) {
        return bufferedChannel.m93854O0(obj, obj2);
    }
}
