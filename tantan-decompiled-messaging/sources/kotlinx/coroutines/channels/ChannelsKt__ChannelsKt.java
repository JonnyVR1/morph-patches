package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.ih3;
import p149l.nee0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"E", "Ll/nee0;", "element", "Lkotlinx/coroutines/channels/a;", "", "a", "(Ll/nee0;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E> Object m93952a(@NotNull nee0<? super E> nee0Var, E e) {
        Object objMo93791l = nee0Var.mo93791l(e);
        if (objMo93791l instanceof C15414a.c) {
            return ((C15414a) ih3.m136184b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(nee0Var, e, null), 1, null)).getHolder();
        }
        return C15414a.INSTANCE.m94003c(Unit.INSTANCE);
    }
}
