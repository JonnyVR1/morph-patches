package com.hellogroup.common.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import p153l.r5e;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J@\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m88121d2 = {"Lcom/hellogroup/common/timer/ControllableTimer;", "", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "periodMillis", "initialDelayMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "action", "b", "(JJLkotlin/jvm/functions/Function1;)V", "a", "()V", "Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/o;", "timerJob", "Lkotlin/coroutines/CoroutineContext;", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ControllableTimer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC15593o timerJob;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CoroutineContext coroutineContext;

    public /* synthetic */ ControllableTimer(CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? r5e.m179860a() : coroutineContext);
    }

    /* JADX INFO: renamed from: a */
    public final void m17570a() {
        InterfaceC15593o interfaceC15593o = this.timerJob;
        if (interfaceC15593o != null) {
            InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
        }
        this.timerJob = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m17571b(long periodMillis, long initialDelayMillis, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        action.getClass();
        m17570a();
        this.timerJob = xh3.m210980d(C15531f.m94947a(this.coroutineContext), null, null, new ControllableTimer$startPeriodic$1(initialDelayMillis, action, periodMillis, null), 3, null);
    }

    public ControllableTimer(@NotNull CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.coroutineContext = coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ControllableTimer() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
