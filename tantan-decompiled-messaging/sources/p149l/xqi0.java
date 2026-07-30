package p149l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/xqi0;", "U", j6f.GPS_DIRECTION_TRUE, "Ll/i3e0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(JLkotlin/coroutines/Continuation;)V", "", "run", "()V", "", "F0", "()Ljava/lang/String;", "e", "J", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class xqi0<U, T extends U> extends i3e0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    public final long time;

    public xqi0(long j, @NotNull Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.time = j;
    }

    @Override // kotlinx.coroutines.AbstractC15403a, kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public String mo93643F0() {
        return super.mo93643F0() + "(timeMillis=" + this.time + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m93673Y(TimeoutKt.m93728a(this.time, DelayKt.m93612c(getContext()), this));
    }
}
