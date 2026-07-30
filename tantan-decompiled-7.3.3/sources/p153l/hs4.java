package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/hs4;", p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/Function2;", "Ll/el90;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "scope", "f", "(Ll/el90;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public class hs4<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function2<el90<? super T>, Continuation<? super Unit>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public hs4(@NotNull Function2<? super el90<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.block = function2;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ <T> Object m136948l(hs4<T> hs4Var, el90<? super T> el90Var, Continuation<? super Unit> continuation) {
        Object objInvoke = hs4Var.block.invoke(el90Var, continuation);
        return objInvoke == uyp.m198688e() ? objInvoke : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo94956f(@NotNull el90<? super T> el90Var, @NotNull Continuation<? super Unit> continuation) {
        return m136948l(this, el90Var, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }
}
