package p153l;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/v5d0;", p7f.GPS_DIRECTION_TRUE, "Ll/hpq;", "Lkotlinx/coroutines/c;", "continuation", "<init>", "(Lkotlinx/coroutines/c;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Lkotlinx/coroutines/c;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class v5d0<T> extends hpq {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C15514c<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public v5d0(@NotNull C15514c<? super T> c15514c) {
        this.continuation = c15514c;
    }

    @Override // kotlinx.coroutines.InterfaceC15592n
    /* JADX INFO: renamed from: a */
    public void mo94601a(@Nullable Throwable cause) {
        Object objM94591r0 = m136579u().m94591r0();
        boolean z = objM94591r0 instanceof to5;
        C15514c<T> c15514c = this.continuation;
        if (z) {
            Result.Companion companion = Result.INSTANCE;
            c15514c.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(((to5) objM94591r0).cause)));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c15514c.resumeWith(Result.m225066constructorimpl(npq.m164243h(objM94591r0)));
        }
    }
}
