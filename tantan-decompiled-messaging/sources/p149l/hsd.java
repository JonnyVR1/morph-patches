package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Active;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC15403a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/hsd;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/a;", "Ll/gsd;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", Active.TYPE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "q", "()Ljava/lang/Object;", Constants.KEY_T, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public class hsd<T> extends AbstractC15403a<T> implements gsd<T> {
    public hsd(@NotNull CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ <T> Object m132780h1(hsd<T> hsdVar, Continuation<? super T> continuation) throws Throwable {
        Object objM93670W = hsdVar.m93670W(continuation);
        uwp.m196133e();
        return objM93670W;
    }

    @Override // p149l.gsd
    /* JADX INFO: renamed from: q */
    public T mo127792q() {
        return (T) m93691k0();
    }

    @Override // p149l.gsd
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo127793t(@NotNull Continuation<? super T> continuation) {
        return m132780h1(this, continuation);
    }
}
