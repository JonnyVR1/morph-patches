package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/no5;", p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobSupport;", "Ll/mo5;", "Lkotlinx/coroutines/o;", "parent", "<init>", "(Lkotlinx/coroutines/o;)V", "q", "()Ljava/lang/Object;", Constants.KEY_T, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "h", "(Ljava/lang/Object;)Z", "", "exception", "g", "(Ljava/lang/Throwable;)Z", "o0", "()Z", "onCancelComplete", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class no5<T> extends JobSupport implements mo5<T> {
    public no5(@Nullable InterfaceC15593o interfaceC15593o) {
        super(true);
        m94595w0(interfaceC15593o);
    }

    @Override // p153l.mo5
    /* JADX INFO: renamed from: g */
    public boolean mo159236g(@NotNull Throwable exception) {
        return m94530C0(new to5(exception, false, 2, null));
    }

    @Override // p153l.mo5
    /* JADX INFO: renamed from: h */
    public boolean mo159237h(T value) {
        return m94530C0(value);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: o0 */
    public boolean mo94588o0() {
        return true;
    }

    @Override // p153l.utd
    /* JADX INFO: renamed from: q */
    public T mo164040q() {
        return (T) m94582k0();
    }

    @Override // p153l.utd
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo164041t(@NotNull Continuation<? super T> continuation) throws Throwable {
        Object objM94561W = m94561W(continuation);
        uyp.m198688e();
        return objM94561W;
    }
}
