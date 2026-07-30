package p153l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.InterfaceC15513b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/ag4;", "Lkotlinx/coroutines/b;", "handler", "", "c", "(Ll/ag4;Lkotlinx/coroutines/b;)V", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/c;", "b", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/c;", "Ll/z5e;", "handle", "a", "(Ll/ag4;Ll/z5e;)V", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class cg4 {
    /* JADX INFO: renamed from: a */
    public static final void m109663a(@NotNull ag4<?> ag4Var, @NotNull z5e z5eVar) {
        m109665c(ag4Var, new a6e(z5eVar));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> C15514c<T> m109664b(@NotNull Continuation<? super T> continuation) {
        if (!(continuation instanceof l5e)) {
            return new C15514c<>(continuation, 1);
        }
        C15514c<T> c15514cM152934l = ((l5e) continuation).m152934l();
        if (c15514cM152934l != null) {
            if (!c15514cM152934l.m94645P()) {
                c15514cM152934l = null;
            }
            if (c15514cM152934l != null) {
                return c15514cM152934l;
            }
        }
        return new C15514c<>(continuation, 2);
    }

    /* JADX INFO: renamed from: c */
    public static final <T> void m109665c(@NotNull ag4<? super T> ag4Var, @NotNull InterfaceC15513b interfaceC15513b) {
        if (ag4Var instanceof C15514c) {
            ((C15514c) ag4Var).m94640J(interfaceC15513b);
        } else {
            pr3.m173429a("third-party implementation of CancellableContinuation is not supported");
        }
    }
}
