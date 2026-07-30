package p149l;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class lpb {
    /* JADX INFO: renamed from: a */
    public static final void m150834a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        Iterator<jpb> it = kpb.m146836a().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                kpb.m146837b(mpb.m155796b(th, th2));
            }
        }
        try {
            h5f.m129395a(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        kpb.m146837b(th);
    }
}
