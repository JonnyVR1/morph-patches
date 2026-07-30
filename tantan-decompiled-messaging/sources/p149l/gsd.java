package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/gsd;", j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/o;", Constants.KEY_T, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "()Ljava/lang/Object;", "", "I", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface gsd<T> extends InterfaceC15486o {
    @Nullable
    /* JADX INFO: renamed from: I */
    Throwable m127791I();

    /* JADX INFO: renamed from: q */
    T mo127792q();

    @Nullable
    /* JADX INFO: renamed from: t */
    Object mo127793t(@NotNull Continuation<? super T> continuation);
}
