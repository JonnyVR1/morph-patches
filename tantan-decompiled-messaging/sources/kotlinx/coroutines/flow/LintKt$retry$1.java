package kotlinx.coroutines.flow;

import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, Careers.f38732it, ""}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 176)
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.LintKt$retry$1", m87374f = "Lint.kt", m87375l = {}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class LintKt$retry$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
    int label;

    public LintKt$retry$1(Continuation<? super LintKt$retry$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LintKt$retry$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull Throwable th, @Nullable Continuation<? super Boolean> continuation) {
        return ((LintKt$retry$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label == 0) {
            ResultKt.m87239b(obj);
            return Boxing.m87370a(true);
        }
        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
