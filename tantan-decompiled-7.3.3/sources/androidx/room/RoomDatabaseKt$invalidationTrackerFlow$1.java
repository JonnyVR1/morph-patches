package androidx.room;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.el90;
import p153l.erb;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {"Ll/el90;", "", "", "", "<anonymous>", "(Ll/el90;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", m88263f = "RoomDatabaseExt.kt", m88264l = {235}, m88265m = "invokeSuspend")
final class RoomDatabaseKt$invalidationTrackerFlow$1 extends SuspendLambda implements Function2<el90<? super Set<? extends String>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $tables;
    final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"androidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$a", "Landroidx/room/e$c;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C0665a extends C0670e.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f2975b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ el90<Set<String>> f2976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0665a(String[] strArr, AtomicBoolean atomicBoolean, el90<? super Set<String>> el90Var) {
            super(strArr);
            this.f2975b = atomicBoolean;
            this.f2976c = el90Var;
        }

        @Override // androidx.room.C0670e.c
        /* JADX INFO: renamed from: c */
        public void mo3908c(@NotNull Set<String> tables) {
            if (this.f2975b.get()) {
                return;
            }
            this.f2976c.mo94683l(tables);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$invalidationTrackerFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Continuation<? super RoomDatabaseKt$invalidationTrackerFlow$1> continuation) {
        super(2, continuation);
        this.$emitInitialState = z;
        this.$this_invalidationTrackerFlow = roomDatabase;
        this.$tables = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RoomDatabaseKt$invalidationTrackerFlow$1 roomDatabaseKt$invalidationTrackerFlow$1 = new RoomDatabaseKt$invalidationTrackerFlow$1(this.$emitInitialState, this.$this_invalidationTrackerFlow, this.$tables, continuation);
        roomDatabaseKt$invalidationTrackerFlow$1.L$0 = obj;
        return roomDatabaseKt$invalidationTrackerFlow$1;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull el90<? super Set<String>> el90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1) create(el90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ContinuationInterceptor continuationInterceptorM122138a;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            el90 el90Var = (el90) this.L$0;
            AtomicBoolean atomicBoolean = new AtomicBoolean(this.$emitInitialState);
            C0665a c0665a = new C0665a(this.$tables, atomicBoolean, el90Var);
            C0676k c0676k = (C0676k) el90Var.getCoroutineContext().get(C0676k.INSTANCE);
            if (c0676k == null || (continuationInterceptorM122138a = c0676k.getTransactionDispatcher()) == null) {
                continuationInterceptorM122138a = erb.m122138a(this.$this_invalidationTrackerFlow);
            }
            final InterfaceC15593o interfaceC15593oM210980d = xh3.m210980d(el90Var, continuationInterceptorM122138a, null, new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, c0665a, this.$emitInitialState, el90Var, this.$tables, atomicBoolean, null), 2, null);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    InterfaceC15593o.a.m95138a(interfaceC15593oM210980d, null, 1, null);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (ProduceKt.m94871a(el90Var, function0, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(el90<? super Set<? extends String>> el90Var, Continuation<? super Unit> continuation) {
        return invoke2((el90<? super Set<String>>) el90Var, continuation);
    }
}
