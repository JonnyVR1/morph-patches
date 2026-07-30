package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/aui;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "a", "(Ll/aui;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/aui;", Constants.INAPP_DATA_TAG, "(Ll/aui;)Ll/aui;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "(Ll/aui;Lkotlin/coroutines/CoroutineContext;)Ll/aui;", "", "c", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class rui {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> aui<T> m183195a(@NotNull aui<? extends T> auiVar, int i, @NotNull BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            plk0.m172832a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i);
            return null;
        }
        if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            wg3.m206174a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (auiVar instanceof ldj) {
            return ldj.C18379a.m153749a((ldj) auiVar, null, i2, bufferOverflow2, 1, null);
        }
        return new ks4(auiVar, null, i2, bufferOverflow2, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ aui m183196b(aui auiVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return fui.m127479c(auiVar, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: c */
    public static final void m183197c(CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC15593o.INSTANCE) == null) {
            return;
        }
        t560.m189376a("Flow context cannot contain job in it. Had ", coroutineContext);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> aui<T> m183198d(@NotNull aui<? extends T> auiVar) {
        return m183196b(auiVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> aui<T> m183199e(@NotNull aui<? extends T> auiVar, @NotNull CoroutineContext coroutineContext) {
        m183197c(coroutineContext);
        if (Intrinsics.m88377d(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return auiVar;
        }
        if (auiVar instanceof ldj) {
            return ldj.C18379a.m153749a((ldj) auiVar, coroutineContext, 0, null, 6, null);
        }
        return new ks4(auiVar, coroutineContext, 0, null, 12, null);
    }
}
