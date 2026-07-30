package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/fve0;", "Ll/d8;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "<init>", "()V", "flow", "", "c", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)Z", "", "Lkotlin/coroutines/Continuation;", "", Constants.INAPP_DATA_TAG, "(Lkotlinx/coroutines/flow/SharedFlowImpl;)[Lkotlin/coroutines/Continuation;", "", "a", "J", FirebaseAnalytics.Param.INDEX, "b", "Lkotlin/coroutines/Continuation;", "cont", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fve0 extends AbstractC16310d8<SharedFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public long index = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public Continuation<? super Unit> cont;

    @Override // p149l.AbstractC16310d8
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo110260a(@NotNull SharedFlowImpl<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.m94145W();
        return true;
    }

    @Override // p149l.AbstractC16310d8
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] mo110261b(@NotNull SharedFlowImpl<?> flow) {
        long j = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.m94144V(j);
    }
}
