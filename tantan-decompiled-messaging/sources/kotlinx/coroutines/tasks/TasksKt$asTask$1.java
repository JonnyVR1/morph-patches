package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.p046p1.mobile.putong.data.Careers;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p149l.gsd;
import p149l.j6f;
import p149l.jf4;
import p149l.sei0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, "", "invoke"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
final class TasksKt$asTask$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ jf4 $cancellation;
    final /* synthetic */ sei0<Object> $source;
    final /* synthetic */ gsd<Object> $this_asTask;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksKt$asTask$1(jf4 jf4Var, gsd<Object> gsdVar, sei0<Object> sei0Var) {
        super(1);
        this.$cancellation = jf4Var;
        this.$this_asTask = gsdVar;
        this.$source = sei0Var;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        if (th instanceof CancellationException) {
            this.$cancellation.m141172a();
            return;
        }
        Throwable thM127791I = this.$this_asTask.m127791I();
        sei0<Object> sei0Var = this.$source;
        if (thM127791I == null) {
            sei0Var.m183659c(this.$this_asTask.mo127792q());
            return;
        }
        Exception runtimeExecutionException = thM127791I instanceof Exception ? (Exception) thM127791I : null;
        if (runtimeExecutionException == null) {
            runtimeExecutionException = new RuntimeExecutionException(thM127791I);
        }
        sei0Var.m183658b(runtimeExecutionException);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
