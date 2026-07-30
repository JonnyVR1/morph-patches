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
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ad90;
import p149l.jh3;
import p149l.qkq0;
import p149l.qpb;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"Ll/ad90;", "", "", "", "<anonymous>", "(Ll/ad90;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", m87374f = "RoomDatabaseExt.kt", m87375l = {235}, m87376m = "invokeSuspend")
final class RoomDatabaseKt$invalidationTrackerFlow$1 extends SuspendLambda implements Function2<ad90<? super Set<? extends String>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $tables;
    final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$a */
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"androidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$a", "Landroidx/room/e$c;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "room-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0663a extends C0668e.c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f2975b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ad90<Set<String>> f2976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0663a(String[] strArr, AtomicBoolean atomicBoolean, ad90<? super Set<String>> ad90Var) {
            super(strArr);
            this.f2975b = atomicBoolean;
            this.f2976c = ad90Var;
        }

        @Override // androidx.room.C0668e.c
        /* JADX INFO: renamed from: c */
        public void mo3906c(@NotNull Set<String> tables) {
            if (this.f2975b.get()) {
                return;
            }
            this.f2976c.mo93791l(tables);
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
    public final Object invoke2(@NotNull ad90<? super Set<String>> ad90Var, @Nullable Continuation<? super Unit> continuation) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1) create(ad90Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ContinuationInterceptor continuationInterceptorM175820a;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ad90 ad90Var = (ad90) this.L$0;
            AtomicBoolean atomicBoolean = new AtomicBoolean(this.$emitInitialState);
            C0663a c0663a = new C0663a(this.$tables, atomicBoolean, ad90Var);
            C0674k c0674k = (C0674k) ad90Var.getCoroutineContext().get(C0674k.INSTANCE);
            if (c0674k == null || (continuationInterceptorM175820a = c0674k.getTransactionDispatcher()) == null) {
                continuationInterceptorM175820a = qpb.m175820a(this.$this_invalidationTrackerFlow);
            }
            final InterfaceC15486o interfaceC15486oM141367d = jh3.m141367d(ad90Var, continuationInterceptorM175820a, null, new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, c0663a, this.$emitInitialState, ad90Var, this.$tables, atomicBoolean, null), 2, null);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    InterfaceC15486o.a.m94245a(interfaceC15486oM141367d, null, 1, null);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (ProduceKt.m93979a(ad90Var, function0, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ad90<? super Set<? extends String>> ad90Var, Continuation<? super Unit> continuation) {
        return invoke2((ad90<? super Set<String>>) ad90Var, continuation);
    }
}
