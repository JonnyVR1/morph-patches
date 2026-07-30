package p153l;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/ldj;", p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "a", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/aui;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface ldj<T> extends aui<T> {

    /* JADX INFO: renamed from: l.ldj$a */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C18379a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ aui m153749a(ldj ldjVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj != null) {
                pr3.m173429a("Super calls with default arguments not supported in this target, function: fuse");
                return null;
            }
            if ((i2 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return ldjVar.mo95039a(coroutineContext, i, bufferOverflow);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    aui<T> mo95039a(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow);
}
