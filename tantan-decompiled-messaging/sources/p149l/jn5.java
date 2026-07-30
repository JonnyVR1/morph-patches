package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/jn5;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobSupport;", "Ll/in5;", "Lkotlinx/coroutines/o;", "parent", "<init>", "(Lkotlinx/coroutines/o;)V", "q", "()Ljava/lang/Object;", Constants.KEY_T, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "h", "(Ljava/lang/Object;)Z", "", "exception", "g", "(Ljava/lang/Throwable;)Z", "o0", "()Z", "onCancelComplete", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class jn5<T> extends JobSupport implements in5<T> {
    public jn5(@Nullable InterfaceC15486o interfaceC15486o) {
        super(true);
        m93704w0(interfaceC15486o);
    }

    @Override // p149l.in5
    /* JADX INFO: renamed from: g */
    public boolean mo137123g(@NotNull Throwable exception) {
        return m93639C0(new pn5(exception, false, 2, null));
    }

    @Override // p149l.in5
    /* JADX INFO: renamed from: h */
    public boolean mo137124h(T value) {
        return m93639C0(value);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: o0 */
    public boolean mo93697o0() {
        return true;
    }

    @Override // p149l.gsd
    /* JADX INFO: renamed from: q */
    public T mo127792q() {
        return (T) m93691k0();
    }

    @Override // p149l.gsd
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo127793t(@NotNull Continuation<? super T> continuation) throws Throwable {
        Object objM93670W = m93670W(continuation);
        uwp.m196133e();
        return objM93670W;
    }
}
