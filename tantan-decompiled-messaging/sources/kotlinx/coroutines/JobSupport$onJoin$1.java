package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bde0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
final /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements Function3<JobSupport, bde0<?>, Object, Unit> {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    public JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(JobSupport jobSupport, bde0<?> bde0Var, Object obj) {
        invoke2(jobSupport, bde0Var, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull JobSupport jobSupport, @NotNull bde0<?> bde0Var, @Nullable Object obj) {
        jobSupport.m93660Q0(bde0Var, obj);
    }
}
