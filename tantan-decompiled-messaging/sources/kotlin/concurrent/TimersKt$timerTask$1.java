package kotlin.concurrent;

import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "()V", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class TimersKt$timerTask$1 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1<TimerTask, Unit> f63438a;

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f63438a.invoke(this);
    }
}
