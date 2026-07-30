package androidx.datastore.migrations;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it}, m88122k = 3, m88123mv = {1, 5, 1}, m88125xi = 48)
@DebugMetadata(m88262c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m88263f = "SharedPreferencesMigration.kt", m88264l = {}, m88265m = "invokeSuspend")
final class SharedPreferencesMigration$1 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
    int label;

    public SharedPreferencesMigration$1(Continuation<? super SharedPreferencesMigration$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SharedPreferencesMigration$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(Object obj, @Nullable Continuation<? super Boolean> continuation) {
        return ((SharedPreferencesMigration$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label == 0) {
            ResultKt.m88128b(obj);
            return Boxing.m88259a(true);
        }
        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
