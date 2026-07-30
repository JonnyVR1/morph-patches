package p153l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/a0j0;", "U", p7f.GPS_DIRECTION_TRUE, "Ll/mbe0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(JLkotlin/coroutines/Continuation;)V", "", "run", "()V", "", "F0", "()Ljava/lang/String;", "e", "J", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class a0j0<U, T extends U> extends mbe0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    public final long time;

    public a0j0(long j, @NotNull Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.time = j;
    }

    @Override // kotlinx.coroutines.AbstractC15510a, kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public String mo94534F0() {
        return super.mo94534F0() + "(timeMillis=" + this.time + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m94564Y(TimeoutKt.m94619a(this.time, DelayKt.m94503c(getContext()), this));
    }
}
