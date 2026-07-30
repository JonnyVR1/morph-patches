package kotlinx.coroutines.sync;

import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.ot10;
import p149l.qkq0;
import p149l.uwp;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aA\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m87232d2 = {"", "locked", "Ll/ot10;", "a", "(Z)Ll/ot10;", j6f.GPS_DIRECTION_TRUE, "", Owner.TYPE, "Lkotlin/Function0;", "action", "e", "(Ll/ot10;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/yfh0;", "Ll/yfh0;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class MutexKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final yfh0 f66983a = new yfh0("NO_OWNER");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final yfh0 f66984b = new yfh0("ALREADY_LOCKED_BY_OWNER");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ot10 m94361a(boolean z) {
        return new MutexImpl(z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ot10 m94362b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m94361a(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m94365e(@NotNull ot10 ot10Var, @Nullable Object obj, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) throws Throwable {
        MutexKt$withLock$1 mutexKt$withLock$1;
        if (continuation instanceof MutexKt$withLock$1) {
            mutexKt$withLock$1 = (MutexKt$withLock$1) continuation;
            int i = mutexKt$withLock$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mutexKt$withLock$1.label = i - Integer.MIN_VALUE;
            } else {
                mutexKt$withLock$1 = new MutexKt$withLock$1(continuation);
            }
        } else {
            mutexKt$withLock$1 = new MutexKt$withLock$1(continuation);
        }
        Object obj2 = mutexKt$withLock$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = mutexKt$withLock$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj2);
            mutexKt$withLock$1.L$0 = ot10Var;
            mutexKt$withLock$1.L$1 = obj;
            mutexKt$withLock$1.L$2 = function0;
            mutexKt$withLock$1.label = 1;
            if (ot10Var.mo94354c(obj, mutexKt$withLock$1) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function0 = (Function0) mutexKt$withLock$1.L$2;
            obj = mutexKt$withLock$1.L$1;
            ot10Var = (ot10) mutexKt$withLock$1.L$0;
            ResultKt.m87239b(obj2);
        }
        try {
            return function0.invoke();
        } finally {
            InlineMarker.m87483b(1);
            ot10Var.mo94355d(obj);
            InlineMarker.m87482a(1);
        }
    }
}
