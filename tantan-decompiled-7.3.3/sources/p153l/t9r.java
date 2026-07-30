package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/t9r;", p7f.GPS_DIRECTION_TRUE, "Ll/vtd;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlin/Function2;", "Ll/drb;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "", "N0", "()V", Constants.INAPP_DATA_TAG, "Lkotlin/coroutines/Continuation;", "continuation", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class t9r<T> extends vtd<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Continuation<Unit> continuation;

    public t9r(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super drb, ? super Continuation<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.continuation = IntrinsicsKt__IntrinsicsJvmKt.m88255a(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: N0 */
    public void mo94547N0() throws Throwable {
        eg4.m120754b(this.continuation, this);
    }
}
