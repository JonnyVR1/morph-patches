package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gle0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements Function3<JobSupport, gle0<?>, Object, Unit> {
    public static final JobSupport$onAwaitInternal$1 INSTANCE = new JobSupport$onAwaitInternal$1();

    public JobSupport$onAwaitInternal$1() {
        super(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(JobSupport jobSupport, gle0<?> gle0Var, Object obj) {
        invoke2(jobSupport, gle0Var, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull JobSupport jobSupport, @NotNull gle0<?> gle0Var, @Nullable Object obj) {
        jobSupport.m94542K0(gle0Var, obj);
    }
}
