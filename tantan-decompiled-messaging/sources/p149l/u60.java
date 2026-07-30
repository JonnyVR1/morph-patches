package p149l;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/u60;", "E", "Ll/hr4;", "", "", "cause", "", "L0", "(Ljava/lang/Throwable;)V", "exception", "", "u0", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public class u60<E> extends hr4<E> implements ppb, ReceiveChannel {
    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: L0 */
    public void mo93652L0(@Nullable Throwable cause) {
        gr4<E> gr4VarM132613i1 = m132613i1();
        CancellationException cancellationExceptionM124517a = null;
        if (cause != null) {
            cancellationExceptionM124517a = cause instanceof CancellationException ? (CancellationException) cause : null;
            if (cancellationExceptionM124517a == null) {
                cancellationExceptionM124517a = g5f.m124517a(o8c.m163111a(this) + " was cancelled", cause);
            }
        }
        gr4VarM132613i1.mo93890n(cancellationExceptionM124517a);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: u0 */
    public boolean mo93702u0(@NotNull Throwable exception) {
        mpb.m155795a(getContext(), exception);
        return true;
    }
}
