package kotlinx.coroutines.sync;

import com.p051p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.goh0;
import p153l.p7f;
import p153l.uyp;
import p153l.w120;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aA\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m88121d2 = {"", "locked", "Ll/w120;", "a", "(Z)Ll/w120;", p7f.GPS_DIRECTION_TRUE, "", Owner.TYPE, "Lkotlin/Function0;", "action", "e", "(Ll/w120;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/goh0;", "Ll/goh0;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class MutexKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final goh0 f67657a = new goh0("NO_OWNER");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final goh0 f67658b = new goh0("ALREADY_LOCKED_BY_OWNER");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final w120 m95254a(boolean z) {
        return new MutexImpl(z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ w120 m95255b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m95254a(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m95258e(@NotNull w120 w120Var, @Nullable Object obj, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = mutexKt$withLock$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj2);
            mutexKt$withLock$1.L$0 = w120Var;
            mutexKt$withLock$1.L$1 = obj;
            mutexKt$withLock$1.L$2 = function0;
            mutexKt$withLock$1.label = 1;
            if (w120Var.mo95247c(obj, mutexKt$withLock$1) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function0 = (Function0) mutexKt$withLock$1.L$2;
            obj = mutexKt$withLock$1.L$1;
            w120Var = (w120) mutexKt$withLock$1.L$0;
            ResultKt.m88128b(obj2);
        }
        try {
            return function0.invoke();
        } finally {
            InlineMarker.m88372b(1);
            w120Var.mo95248d(obj);
            InlineMarker.m88371a(1);
        }
    }
}
