package p149l;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/sxc0;", j6f.GPS_DIRECTION_TRUE, "Ll/inq;", "Lkotlinx/coroutines/c;", "continuation", "<init>", "(Lkotlinx/coroutines/c;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Lkotlinx/coroutines/c;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class sxc0<T> extends inq {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C15407c<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public sxc0(@NotNull C15407c<? super T> c15407c) {
        this.continuation = c15407c;
    }

    @Override // kotlinx.coroutines.InterfaceC15485n
    /* JADX INFO: renamed from: a */
    public void mo93710a(@Nullable Throwable cause) {
        Object objM93700r0 = m137157u().m93700r0();
        boolean z = objM93700r0 instanceof pn5;
        C15407c<T> c15407c = this.continuation;
        if (z) {
            Result.Companion companion = Result.INSTANCE;
            c15407c.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(((pn5) objM93700r0).cause)));
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c15407c.resumeWith(Result.m223820constructorimpl(onq.m165223h(objM93700r0)));
        }
    }
}
