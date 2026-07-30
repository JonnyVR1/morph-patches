package kotlinx.coroutines.debug.internal;

import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j8c;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"", "R", "Lkotlinx/coroutines/debug/internal/a$a;", Owner.TYPE, "invoke", "(Lkotlinx/coroutines/debug/internal/a$a;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3", "<anonymous>"}, m87233k = 3, m87234mv = {1, 9, 0})
@SourceDebugExtension
public final class C15420x49f1cbae extends Lambda implements Function1<C15422a.a<?>, j8c> {
    public C15420x49f1cbae() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final j8c invoke(@NotNull C15422a.a<?> aVar) {
        CoroutineContext coroutineContextM94040c;
        if (C15422a.INSTANCE.m94051e(aVar) || (coroutineContextM94040c = aVar.com.immomo.momomediaext.sei.BaseSei.INFO java.lang.String.m94040c()) == null) {
            return null;
        }
        return new j8c(aVar.com.immomo.momomediaext.sei.BaseSei.INFO java.lang.String, coroutineContextM94040c);
    }
}
