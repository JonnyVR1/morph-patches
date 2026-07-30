package kotlinx.coroutines;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gnq;
import p149l.l4e;
import p149l.ln5;
import p149l.n4e;
import p149l.nnq;
import p149l.uwp;
import p149l.ymq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\u00020\u0010*\u00020\u00182\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u0010*\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001e\"\u0015\u0010!\u001a\u00020\u0001*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010$\u001a\u00020\u0000*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Lkotlinx/coroutines/o;", "", "onCancelling", "invokeImmediately", "Lkotlinx/coroutines/n;", "handler", "Ll/l4e;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lkotlinx/coroutines/o;ZZLkotlinx/coroutines/n;)Ll/l4e;", "parent", "Ll/ln5;", "a", "(Lkotlinx/coroutines/o;)Ll/ln5;", "handle", "h", "(Lkotlinx/coroutines/o;Ll/l4e;)Ll/l4e;", "", "e", "(Lkotlinx/coroutines/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "f", "(Lkotlinx/coroutines/o;Ljava/util/concurrent/CancellationException;)V", "Lkotlin/coroutines/CoroutineContext;", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "j", "(Lkotlinx/coroutines/o;)V", RXScreenCaptureService.KEY_INDEX, "(Lkotlin/coroutines/CoroutineContext;)V", "n", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "k", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/o;", "job", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/JobKt")
@SourceDebugExtension
public final /* synthetic */ class JobKt__JobKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ln5 m93615a(@Nullable InterfaceC15486o interfaceC15486o) {
        return new ymq(interfaceC15486o);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ln5 m93616b(InterfaceC15486o interfaceC15486o, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC15486o = null;
        }
        return gnq.m127160a(interfaceC15486o);
    }

    /* JADX INFO: renamed from: c */
    public static final void m93617c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) coroutineContext.get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o != null) {
            interfaceC15486o.mo93695n(cancellationException);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m93618d(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        gnq.m127162c(coroutineContext, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m93619e(@NotNull InterfaceC15486o interfaceC15486o, @NotNull Continuation<? super Unit> continuation) {
        InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
        Object objMo93663S = interfaceC15486o.mo93663S(continuation);
        return objMo93663S == uwp.m196133e() ? objMo93663S : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m93620f(@NotNull InterfaceC15486o interfaceC15486o, @Nullable CancellationException cancellationException) {
        Iterator<InterfaceC15486o> it = interfaceC15486o.mo93645H().iterator();
        while (it.hasNext()) {
            it.next().mo93695n(cancellationException);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m93621g(InterfaceC15486o interfaceC15486o, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        gnq.m127165f(interfaceC15486o, cancellationException);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final l4e m93622h(@NotNull InterfaceC15486o interfaceC15486o, @NotNull l4e l4eVar) {
        return m93627m(interfaceC15486o, false, false, new n4e(l4eVar), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m93623i(@NotNull CoroutineContext coroutineContext) {
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) coroutineContext.get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o != null) {
            gnq.m127170k(interfaceC15486o);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m93624j(@NotNull InterfaceC15486o interfaceC15486o) {
        if (!interfaceC15486o.mo93690k()) {
            throw interfaceC15486o.mo93653M();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final InterfaceC15486o m93625k(@NotNull CoroutineContext coroutineContext) {
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) coroutineContext.get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o != null) {
            return interfaceC15486o;
        }
        nnq.m160357a("Current context doesn't contain Job in it: ", coroutineContext);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final l4e m93626l(@NotNull InterfaceC15486o interfaceC15486o, boolean z, boolean z2, @NotNull InterfaceC15485n interfaceC15485n) {
        return interfaceC15486o instanceof JobSupport ? ((JobSupport) interfaceC15486o).m93705x0(z, z2, interfaceC15485n) : interfaceC15486o.mo93649J(z, z2, new JobKt__JobKt$invokeOnCompletion$1(interfaceC15485n));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ l4e m93627m(InterfaceC15486o interfaceC15486o, boolean z, boolean z2, InterfaceC15485n interfaceC15485n, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return gnq.m127172m(interfaceC15486o, z, z2, interfaceC15485n);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m93628n(@NotNull CoroutineContext coroutineContext) {
        InterfaceC15486o interfaceC15486o = (InterfaceC15486o) coroutineContext.get(InterfaceC15486o.INSTANCE);
        if (interfaceC15486o != null) {
            return interfaceC15486o.mo93690k();
        }
        return true;
    }
}
