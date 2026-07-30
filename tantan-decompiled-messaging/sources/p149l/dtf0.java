package p149l;

import com.p046p1.mobile.putong.core.data.Active;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC15403a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/dtf0;", "Lkotlinx/coroutines/a;", "", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", Active.TYPE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "", "exception", "u0", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public class dtf0 extends AbstractC15403a<Unit> {
    public dtf0(@NotNull CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: u0 */
    public boolean mo93702u0(@NotNull Throwable exception) {
        mpb.m155795a(getContext(), exception);
        return true;
    }
}
