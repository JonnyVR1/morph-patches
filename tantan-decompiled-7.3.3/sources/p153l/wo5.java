package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlin/Result;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "onCancellation", "", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ll/ag4;", BLiveRole.caller, "c", "(Ljava/lang/Object;Ll/ag4;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/Continuation;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class wo5 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> Object m207260a(@Nullable Object obj, @NotNull Continuation<? super T> continuation) {
        if (!(obj instanceof to5)) {
            return Result.m225066constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m225066constructorimpl(ResultKt.m88127a(((to5) obj).cause));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m207261b(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(obj);
        if (thM225069exceptionOrNullimpl == null) {
            return function1 != null ? new uo5(obj, function1) : obj;
        }
        return new to5(thM225069exceptionOrNullimpl, false, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m207262c(@NotNull Object obj, @NotNull ag4<?> ag4Var) {
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(obj);
        if (thM225069exceptionOrNullimpl == null) {
            return obj;
        }
        return new to5(thM225069exceptionOrNullimpl, false, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m207263d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return m207261b(obj, function1);
    }
}
