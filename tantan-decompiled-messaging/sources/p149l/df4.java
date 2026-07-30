package p149l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import kotlinx.coroutines.InterfaceC15406b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/bf4;", "Lkotlinx/coroutines/b;", "handler", "", "c", "(Ll/bf4;Lkotlinx/coroutines/b;)V", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/c;", "b", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/c;", "Ll/l4e;", "handle", "a", "(Ll/bf4;Ll/l4e;)V", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class df4 {
    /* JADX INFO: renamed from: a */
    public static final void m111429a(@NotNull bf4<?> bf4Var, @NotNull l4e l4eVar) {
        m111431c(bf4Var, new m4e(l4eVar));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> C15407c<T> m111430b(@NotNull Continuation<? super T> continuation) {
        if (!(continuation instanceof x3e)) {
            return new C15407c<>(continuation, 1);
        }
        C15407c<T> c15407cM206901l = ((x3e) continuation).m206901l();
        if (c15407cM206901l != null) {
            if (!c15407cM206901l.m93753P()) {
                c15407cM206901l = null;
            }
            if (c15407cM206901l != null) {
                return c15407cM206901l;
            }
        }
        return new C15407c<>(continuation, 2);
    }

    /* JADX INFO: renamed from: c */
    public static final <T> void m111431c(@NotNull bf4<? super T> bf4Var, @NotNull InterfaceC15406b interfaceC15406b) {
        if (bf4Var instanceof C15407c) {
            ((C15407c) bf4Var).m93748J(interfaceC15406b);
        } else {
            qq3.m175877a("third-party implementation of CancellableContinuation is not supported");
        }
    }
}
