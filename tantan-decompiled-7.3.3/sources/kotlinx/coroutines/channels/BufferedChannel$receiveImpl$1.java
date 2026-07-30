package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.ts4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m88121d2 = {"R", "E", "Ll/ts4;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "invoke", "(Ll/ts4;IJ)Ljava/lang/Void;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 9, 0})
@SourceDebugExtension
public final class BufferedChannel$receiveImpl$1 extends Lambda implements Function3 {
    public static final BufferedChannel$receiveImpl$1 INSTANCE = new BufferedChannel$receiveImpl$1();

    public BufferedChannel$receiveImpl$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ts4<Object>) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
    }

    @NotNull
    public final Void invoke(@NotNull ts4<Object> ts4Var, int i, long j) {
        throw new IllegalStateException("unexpected");
    }
}
