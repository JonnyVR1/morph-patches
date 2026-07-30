package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.ur4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, m87232d2 = {"R", "E", "Ll/ur4;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "", "invoke", "(Ll/ur4;ILjava/lang/Object;J)Ljava/lang/Void;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 9, 0})
@SourceDebugExtension
public final class BufferedChannel$sendImpl$1 extends Lambda implements Function4 {
    public static final BufferedChannel$sendImpl$1 INSTANCE = new BufferedChannel$sendImpl$1();

    public BufferedChannel$sendImpl$1() {
        super(4);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((ur4<Object>) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
    }

    @NotNull
    public final Void invoke(@NotNull ur4<Object> ur4Var, int i, Object obj, long j) {
        throw new IllegalStateException("unexpected");
    }
}
