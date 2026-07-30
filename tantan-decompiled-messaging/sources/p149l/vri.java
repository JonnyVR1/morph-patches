package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/eri;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "a", "(Ll/eri;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/eri;", Constants.INAPP_DATA_TAG, "(Ll/eri;)Ll/eri;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "(Ll/eri;Lkotlin/coroutines/CoroutineContext;)Ll/eri;", "", "c", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class vri {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> eri<T> m199664a(@NotNull eri<? extends T> eriVar, int i, @NotNull BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            jck0.m140980a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i);
            return null;
        }
        if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            ig3.m135964a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (eriVar instanceof raj) {
            return raj.C19660a.m178496a((raj) eriVar, null, i2, bufferOverflow2, 1, null);
        }
        return new lr4(eriVar, null, i2, bufferOverflow2, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ eri m199665b(eri eriVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return jri.m142944c(eriVar, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: c */
    public static final void m199666c(CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC15486o.INSTANCE) == null) {
            return;
        }
        nx50.m161932a("Flow context cannot contain job in it. Had ", coroutineContext);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> eri<T> m199667d(@NotNull eri<? extends T> eriVar) {
        return m199665b(eriVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> eri<T> m199668e(@NotNull eri<? extends T> eriVar, @NotNull CoroutineContext coroutineContext) {
        m199666c(coroutineContext);
        if (Intrinsics.m87488d(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return eriVar;
        }
        if (eriVar instanceof raj) {
            return raj.C19660a.m178496a((raj) eriVar, coroutineContext, 0, null, 6, null);
        }
        return new lr4(eriVar, coroutineContext, 0, null, 12, null);
    }
}
