package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.sme0;
import p153l.wh3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"E", "Ll/sme0;", "element", "Lkotlinx/coroutines/channels/a;", "", "a", "(Ll/sme0;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <E> Object m94844a(@NotNull sme0<? super E> sme0Var, E e) {
        Object objMo94683l = sme0Var.mo94683l(e);
        if (objMo94683l instanceof C15521a.c) {
            return ((C15521a) wh3.m206334b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sme0Var, e, null), 1, null)).getHolder();
        }
        return C15521a.INSTANCE.m94895c(Unit.INSTANCE);
    }
}
