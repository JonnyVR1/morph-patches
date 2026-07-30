package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.p051p1.mobile.putong.data.Careers;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p153l.ig4;
import p153l.p7f;
import p153l.sni0;
import p153l.utd;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "", "invoke"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final class TasksKt$asTask$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ig4 $cancellation;
    final /* synthetic */ sni0<Object> $source;
    final /* synthetic */ utd<Object> $this_asTask;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksKt$asTask$1(ig4 ig4Var, utd<Object> utdVar, sni0<Object> sni0Var) {
        super(1);
        this.$cancellation = ig4Var;
        this.$this_asTask = utdVar;
        this.$source = sni0Var;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        if (th instanceof CancellationException) {
            this.$cancellation.m139763a();
            return;
        }
        Throwable thM197984I = this.$this_asTask.m197984I();
        sni0<Object> sni0Var = this.$source;
        if (thM197984I == null) {
            sni0Var.m186941c(this.$this_asTask.mo164040q());
            return;
        }
        Exception runtimeExecutionException = thM197984I instanceof Exception ? (Exception) thM197984I : null;
        if (runtimeExecutionException == null) {
            runtimeExecutionException = new RuntimeExecutionException(thM197984I);
        }
        sni0Var.m186940b(runtimeExecutionException);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
