package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.H5PaymentOrderStatus;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "value", "Ll/mt10;", "a", "(Ljava/lang/Object;)Ll/mt10;", "Ll/gvf0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ll/eri;", Constants.INAPP_DATA_TAG, "(Ll/gvf0;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Ll/eri;", "Ll/yfh0;", "Ll/yfh0;", Constraint.NONE, "b", H5PaymentOrderStatus.PENDING, "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class hvf0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final yfh0 f109641a = new yfh0(Constraint.NONE);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final yfh0 f109642b = new yfh0(H5PaymentOrderStatus.PENDING);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> mt10<T> m133163a(T t) {
        if (t == null) {
            t = (T) su40.f166433a;
        }
        return new StateFlowImpl(t);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> eri<T> m133166d(@NotNull gvf0<? extends T> gvf0Var, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? eve0.m118261c(gvf0Var, coroutineContext, i, bufferOverflow) : gvf0Var;
    }
}
