package kotlinx.coroutines.debug.internal;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Lkotlinx/coroutines/debug/internal/a$a;", Careers.f39580it, "", "invoke", "(Lkotlinx/coroutines/debug/internal/a$a;)Ljava/lang/Boolean;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 9, 0})
final class DebugProbesImpl$dumpCoroutinesSynchronized$2 extends Lambda implements Function1<C15529a.a<?>, Boolean> {
    public static final DebugProbesImpl$dumpCoroutinesSynchronized$2 INSTANCE = new DebugProbesImpl$dumpCoroutinesSynchronized$2();

    public DebugProbesImpl$dumpCoroutinesSynchronized$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull C15529a.a<?> aVar) {
        return Boolean.valueOf(!C15529a.INSTANCE.m94943e(aVar));
    }
}
