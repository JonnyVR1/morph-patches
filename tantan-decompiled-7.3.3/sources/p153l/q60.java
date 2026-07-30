package p153l;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/q60;", "E", "Ll/gs4;", "", "", "cause", "", "L0", "(Ljava/lang/Throwable;)V", "exception", "", "u0", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public class q60<E> extends gs4<E> implements drb, ReceiveChannel {
    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: L0 */
    public void mo94543L0(@Nullable Throwable cause) {
        fs4<E> fs4VarM131956i1 = m131956i1();
        CancellationException cancellationExceptionM148513a = null;
        if (cause != null) {
            cancellationExceptionM148513a = cause instanceof CancellationException ? (CancellationException) cause : null;
            if (cancellationExceptionM148513a == null) {
                cancellationExceptionM148513a = k6f.m148513a(u9c.m195086a(this) + " was cancelled", cause);
            }
        }
        fs4VarM131956i1.mo94782n(cancellationExceptionM148513a);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: u0 */
    public boolean mo94593u0(@NotNull Throwable exception) {
        arb.m99658a(getContext(), exception);
        return true;
    }
}
