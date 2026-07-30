package p153l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.selects.OnTimeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aH\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m88121d2 = {"R", "Ll/wke0;", "", "timeMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", "a", "(Ll/wke0;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/Duration;", "timeout", "b", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class xo50 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final <R> void m212461a(@NotNull wke0<? super R> wke0Var, long j, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        wke0Var.mo95202c(new OnTimeout(j).m95189b(), function1);
    }

    /* JADX INFO: renamed from: b */
    public static final <R> void m212462b(@NotNull wke0<? super R> wke0Var, long j, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        m212461a(wke0Var, DelayKt.m94504d(j), function1);
    }
}
