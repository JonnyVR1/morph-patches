package p153l;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/w5d0;", "Ll/hpq;", "Lkotlin/coroutines/Continuation;", "", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "cause", "a", "(Ljava/lang/Throwable;)V", "e", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class w5d0 extends hpq {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Continuation<Unit> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public w5d0(@NotNull Continuation<? super Unit> continuation) {
        this.continuation = continuation;
    }

    @Override // kotlinx.coroutines.InterfaceC15592n
    /* JADX INFO: renamed from: a */
    public void mo94601a(@Nullable Throwable cause) {
        Continuation<Unit> continuation = this.continuation;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m225066constructorimpl(Unit.INSTANCE));
    }
}
