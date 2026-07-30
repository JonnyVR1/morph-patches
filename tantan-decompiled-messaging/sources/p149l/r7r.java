package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/r7r;", j6f.GPS_DIRECTION_TRUE, "Ll/hsd;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Ll/ppb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "", "N0", "()V", Constants.INAPP_DATA_TAG, "Lkotlin/coroutines/Continuation;", "continuation", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class r7r<T> extends hsd<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Continuation<Unit> continuation;

    public r7r(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super ppb, ? super Continuation<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.continuation = IntrinsicsKt__IntrinsicsJvmKt.m87366a(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: N0 */
    public void mo93656N0() throws Throwable {
        ff4.m121106b(this.continuation, this);
    }
}
