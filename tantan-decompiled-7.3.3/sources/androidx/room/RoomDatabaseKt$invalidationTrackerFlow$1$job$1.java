package androidx.room;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.el90;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", m88263f = "RoomDatabaseExt.kt", m88264l = {230}, m88265m = "invokeSuspend")
public final class RoomDatabaseKt$invalidationTrackerFlow$1$job$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ el90<Set<String>> $$this$callbackFlow;
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ AtomicBoolean $ignoreInvalidation;
    final /* synthetic */ RoomDatabaseKt$invalidationTrackerFlow$1.C0665a $observer;
    final /* synthetic */ String[] $tables;
    final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$invalidationTrackerFlow$1$job$1(RoomDatabase roomDatabase, RoomDatabaseKt$invalidationTrackerFlow$1.C0665a c0665a, boolean z, el90<? super Set<String>> el90Var, String[] strArr, AtomicBoolean atomicBoolean, Continuation<? super RoomDatabaseKt$invalidationTrackerFlow$1$job$1> continuation) {
        super(2, continuation);
        this.$this_invalidationTrackerFlow = roomDatabase;
        this.$observer = c0665a;
        this.$emitInitialState = z;
        this.$$this$callbackFlow = el90Var;
        this.$tables = strArr;
        this.$ignoreInvalidation = atomicBoolean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, this.$observer, this.$emitInitialState, this.$$this$callbackFlow, this.$tables, this.$ignoreInvalidation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1$job$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                this.$this_invalidationTrackerFlow.getInvalidationTracker().m3946c(this.$observer);
                if (this.$emitInitialState) {
                    this.$$this$callbackFlow.mo94683l(ArraysKt.toSet(this.$tables));
                }
                this.$ignoreInvalidation.set(false);
                this.label = 1;
                if (DelayKt.m94501a(this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$this_invalidationTrackerFlow.getInvalidationTracker().m3957n(this.$observer);
            throw th;
        }
    }
}
