package kotlin.sequences;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@RestrictsSuspension
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lkotlin/sequences/SequenceScope;", j6f.GPS_DIRECTION_TRUE, "", "<init>", "()V", "value", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "iterator", Constants.INAPP_DATA_TAG, "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/sequences/Sequence;", "sequence", "e", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class SequenceScope<T> {
    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Object mo93258c(T t, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Object mo93259d(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m93260e(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> continuation) {
        Object objMo93259d = mo93259d(sequence.iterator(), continuation);
        return objMo93259d == uwp.m196133e() ? objMo93259d : Unit.INSTANCE;
    }
}
